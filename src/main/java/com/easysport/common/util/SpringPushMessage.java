package com.easysport.common.util;

import com.google.android.gcm.server.InvalidRequestException;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : sgkim
 * @Date : 2016-02-12
 * @Version : 1.0
 */
@Component
public class SpringPushMessage {

    /*로그객체*/
    static Logger logger = LoggerFactory.getLogger(SpringPushMessage.class);

    /**
     * gcmRegId is the id which android app will give to server (one time)
     **/
    public Map<String, Object> pushNotificationToGCM(List<String> gcmRegIdList, String message){
        Map<String,Object> returnMap = new HashMap<String,Object>();

        final String GCM_API_KEY = "AIzaSyDsBA808Bnm8XRK62OlzGNdbXWATgsjOY0";
        final int retries = 3;
        Sender sender = new Sender(GCM_API_KEY);
        Message msg = new Message.Builder().addData("message",message).build();

        /*gcmRegId = "APA91bE5JXK24-n867cv8XqAlZPfIrzF8U5hsFj-Qkw1pUMeSdbrmfu52mLRsCJHZ5wJ7x582zWnrTU6af_mEHN35ETW0uYIAD_xpfPhHP7UyT9OJdrrwWeIVQ0GcuOUw1h4rNWJaCsD";
        gcmRegId="APA91bE2wpG3jRvvFWqTbpMjTANTL4-z7Vw2uzD6cn2Qet8DMVecjemWH9ObvNI551GH72nvrt_WtiwEl81t7KChkElCXVUa79z_WWftrYPMVI-te3lrCpmGe3YaFbs1qL8h4RidtRlL-kabWzjoJsxV2SNLB1JXEQ";*/

        try {
            if(gcmRegIdList.size()>0) {

                /*Result result = sender.send(msg, gcmRegIdList, retries);*/

                MulticastResult multicastResult = sender.send(msg,gcmRegIdList,retries);
                /**
                 * if you want to send to multiple then use below method
                 * send(Message message, List<String> regIds, int retries)
                 **/

                /*List<Result> resultList = multicastResult.getResults();
                for(Result result:resultList){
                    if (StringUtils.isEmpty(result.getErrorCodeName())) {
                        System.out.println("GCM Notification is sent successfully" + result.toString());
                    }else{
                        System.out.println("Error occurred while sending push notification :" + result.getErrorCodeName());
                    }
                }*/

                logger.info("total:"+multicastResult.getTotal()+"success:"+multicastResult.getSuccess()+"error:"+multicastResult.getFailure());
                returnMap.put("successCheck",true);
                returnMap.put("totalCnt",multicastResult.getTotal());
                returnMap.put("successCnt",multicastResult.getSuccess());
                returnMap.put("failCnt",multicastResult.getFailure());
                return returnMap;
            }
        } catch (InvalidRequestException e) {
            logger.info(e.getMessage(),e);
        } catch (IOException e) {
            logger.info(e.getMessage(),e);
        }
        returnMap.put("successCheck",false);
        returnMap.put("totalCnt",0);
        returnMap.put("successCnt",0);
        returnMap.put("failCnt",0);
        return returnMap;
    }
}
