<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Погода в Москве</title>
</head>
<body>
<p><b>${model.lasts}</b></p>

<form>
    <form>
        <p><button formaction="/">Начальная</button></p>
    </form>
</form>

</ul>
</body>