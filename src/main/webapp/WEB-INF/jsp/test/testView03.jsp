<!doctype html>
<html>

<head>
    <title>D3 tutorial</title>
    <script src="/b40/d3/d3.v2.min.js"></script>
    <style>

        body {
        font: 13px sans-serif;
        position: relative;
        width: 960px;
        height: 500px;
        }

        .node {
        fill: #000;
        cursor: crosshair;
        }

        .node_selected {
        fill: #ff7f0e;
        stroke: #ff7f0e;
        }

        .drag_line {
        stroke: #999;
        stroke-width: 5;
        pointer-events: none;
        }

        .drag_line_hidden {
        stroke: #999;
        stroke-width: 0;
        pointer-events: none;
        }

        .link {
        stroke: #999;
        stroke-width: 5;
        cursor: crosshair;
        }

        .link_selected {
        stroke: #ff7f0e;
        }

    </style>
</head>

<body>
<div id="chart">
</div>
<script src="/b40/d3/force_view.js"></script>
</body>
</html>