<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Погода в Санкт-Петербурге</title>
</head>
<body>
<p><b>${model.lasts}</b></p>

<form>
    <p><button formaction="/">Начальная</button></p>
</form>

</body>