[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Roční období</title>
    <link rel="stylesheet" href="/style.css"/>
</head>
<body>
<main>
    <header>Minule bylo vybráno: ${form.oblibene?join(", ")}</header>

    <form action="/rocni-obdobi" method="post">
        <div>
            <input type="checkbox" id="oblibene.jaro" name="oblibene" value="JARO" ${form.oblibene?seq_contains("JARO")?string("checked", "")} >
            <label for="oblibene.jaro">jaro</label>
        </div>
        <div>
            <input type="checkbox" id="oblibene.leto" name="oblibene" value="LETO" ${form.oblibene?seq_contains("LETO")?string("checked", "")}>
            <label for="oblibene.leto">léto</label>
        </div>
        <div>
            <input type="checkbox" id="oblibene.podzim" name="oblibene" value="PODZIM" ${form.oblibene?seq_contains("PODZIM")?string("checked", "")}>
            <label for="oblibene.podzim">podzim</label>
        </div>
        <div>
            <input type="checkbox" id="oblibene.zima" name="oblibene" value="ZIMA" ${form.oblibene?seq_contains("ZIMA")?string("checked", "")}>
            <label for="oblibene.zima">zima</label>
        </div>
        <div>
            <button type="submit">Odeslat</button>
        </div>
    </form>
</main>
</body>
</html>
