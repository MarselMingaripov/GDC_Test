<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Погода в Городах России</title>
</head>
<body>
<p><b>${model.welcomes}</b></p>
<script language="JavaScript">
    function change_link() {
        link_1=document.getElementById("link1");
        link_1.href=link_1.href+document.getElementById("city").value;}
</script>
<form>


<select id="city" onChange="change_link()">

    <option value="notDefined" disabled selected="selected">Выберите город</option>

    <option value="kazan" >Казань</option>

    <option value="moskow">Москва</option>

    <option value="spb">Санкт-Петербург</option>

</select>


    <a href="" id="link1">Узнать погоду</a>

    </form>

</body>