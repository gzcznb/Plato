<#assign base=springMacroRequestContext.getContextPath()/>
<#include "../public/public.ftl" />
<!DOCTYPE>
    <html lang="en">
<head>
    <base id="base" href="${base}">
    <title>freemarker</title>

    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <link href="${base}/static/css/freemarkerTest.css" rel="stylesheet">
    <script type="text/javascript" src="${base}/static/js/freemarkerTest.js"></script>
</head>
<body>
<h1>Hello ${name} from resource freemarker!</h1>
<input type="button" id="but" onclick="ck()" value="点击按钮">
</body>
</html>