---
title: DOMException
second_title: Aspose.SVG för .NET API Referens
description: DOMExceptiongränssnittet representerar en onormal händelse kallad ett undantag som inträffar som ett resultat av anrop av en metod eller åtkomst till en egenskap hos ett webbAPI. Det är i princip hur feltillstånd beskrivs i webbAPIer.
type: docs
weight: 790
url: /sv/net/aspose.svg.dom/domexception/
---
## DOMException class

DOMException-gränssnittet representerar en onormal händelse (kallad ett undantag) som inträffar som ett resultat av anrop av en metod eller åtkomst till en egenskap hos ett webb-API. Det är i princip hur feltillstånd beskrivs i webb-API:er.

```csharp
public class DOMException : PlatformException
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [DOMException](domexception#constructor)(string) | Initierar en ny instans av[`DOMException`](../domexception) class. |
| [DOMException](domexception#constructor_1)(string, string) | Initierar en ny instans av[`DOMException`](../domexception) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Code](../../aspose.svg.dom/domexception/code) { get; } | Returnerar ett värde som innehåller en av felkodskonstanterna, eller 0 om ingen matchar. Det här fältet används av historiska skäl. |
| override [Message](../../aspose.svg.dom/domexception/message) { get; } | Returnerar en sträng som representerar ett meddelande eller en beskrivning associerad med det angivna felnamnet. |
| [Name](../../aspose.svg.dom/domexception/name) { get; } | Returnerar en sträng som innehåller en av strängarna som är associerade med ett felnamn. |

## Fält

| namn | Beskrivning |
| --- | --- |
| const [ABORT_ERR](../../aspose.svg.dom/domexception/abort_err) | Operationen avbröts. |
| const [DATA_CLONE_ERR](../../aspose.svg.dom/domexception/data_clone_err) | Objektet kan inte klonas. |
| const [DOMSTRING_SIZE_ERR](../../aspose.svg.dom/domexception/domstring_size_err) | Om det angivna textintervallet inte passar in i en DOMString. |
| const [HIERARCHY_REQUEST_ERR](../../aspose.svg.dom/domexception/hierarchy_request_err) | Om någon nod är insatt någonstans hör den inte hemma. |
| const [INDEX_SIZE_ERR](../../aspose.svg.dom/domexception/index_size_err) | Om index eller storlek är negativt eller större än det tillåtna värdet. |
| const [INUSE_ATTRIBUTE_ERR](../../aspose.svg.dom/domexception/inuse_attribute_err) | Om ett försök görs att lägga till ett attribut som redan används någon annanstans. |
| const [INVALID_ACCESS_ERR](../../aspose.svg.dom/domexception/invalid_access_err) | Om en parameter eller en operation inte stöds av det underliggande objektet. |
| const [INVALID_CHARACTER_ERR](../../aspose.svg.dom/domexception/invalid_character_err) | Om ett ogiltigt eller olagligt tecken anges, till exempel i ett XML-namn. |
| const [INVALID_EXPRESSION_ERR](../../aspose.svg.dom/domexception/invalid_expression_err) | Uttrycket har ett syntaxfel eller är på annat sätt inte ett juridiskt uttryck enligt reglerna för specific XPathEvaluator eller innehåller specialiserade tilläggsfunktioner eller variabler som inte stöds av denna implementering. |
| const [INVALID_MODIFICATION_ERR](../../aspose.svg.dom/domexception/invalid_modification_err) | Om ett försök görs att ändra typen av det underliggande objektet. |
| const [INVALID_NODE_TYPE_ERR](../../aspose.svg.dom/domexception/invalid_node_type_err) | Den angivna noden är felaktig eller har en felaktig förfader för denna operation. |
| const [INVALID_STATE_ERR](../../aspose.svg.dom/domexception/invalid_state_err) | Om ett försök görs att använda ett objekt som inte är eller inte längre är användbart. |
| const [NAMESPACE_ERR](../../aspose.svg.dom/domexception/namespace_err) | Om ett försök görs att skapa eller ändra ett objekt på ett sätt som är felaktigt med hänsyn till namnutrymmen. |
| const [NETWORK_ERR](../../aspose.svg.dom/domexception/network_err) | Ett nätverksfel uppstod. |
| const [NOT_FOUND_ERR](../../aspose.svg.dom/domexception/not_found_err) | Om ett försök görs att referera till en nod i ett sammanhang där den inte finns. |
| const [NOT_SUPPORTED_ERR](../../aspose.svg.dom/domexception/not_supported_err) | Om implementeringen inte stöder den begärda typen av objekt eller operation. |
| const [NO_DATA_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_data_allowed_err) | Om data anges för en nod som inte stöder data. |
| const [NO_MODIFICATION_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_modification_allowed_err) | Om ett försök görs att modifiera ett objekt där ändringar inte är tillåtna. |
| const [QUOTA_EXCEEDED_ERR](../../aspose.svg.dom/domexception/quota_exceeded_err) | Kvoten har överskridits. |
| const [SECURITY_ERR](../../aspose.svg.dom/domexception/security_err) | Operationen är osäker. |
| const [SYNTAX_ERR](../../aspose.svg.dom/domexception/syntax_err) | Om en ogiltig eller olaglig sträng anges. |
| const [TIMEOUT_ERR](../../aspose.svg.dom/domexception/timeout_err) | Operationen tog timeout. |
| const [TYPE_ERR](../../aspose.svg.dom/domexception/type_err) | Uttrycket kan inte konverteras för att returnera den angivna typen. |
| const [TYPE_MISMATCH_ERR](../../aspose.svg.dom/domexception/type_mismatch_err) | Om typen av ett objekt är inkompatibelt med den förväntade typen av parametern som är kopplad till objektet. |
| const [URL_MISMATCH_ERR](../../aspose.svg.dom/domexception/url_mismatch_err) | Den angivna webbadressen matchar inte en annan webbadress. |
| const [VALIDATION_ERR](../../aspose.svg.dom/domexception/validation_err) | Om ett anrop till en metod som insertBefore eller removeChild skulle göra Noden ogiltig med avseende på "partiell validity", skulle detta undantag uppstå och operationen skulle inte utföras. Denna kod används i [DOM Level 3 Validation]. Se denna specifikation för ytterligare information. |
| const [WRONG_DOCUMENT_ERR](../../aspose.svg.dom/domexception/wrong_document_err) | Om en Nod används i ett annat dokument än det som skapade den (som inte stöder det). |

### Se även

* class [PlatformException](../../aspose.svg/platformexception)
* namnutrymme [Aspose.Svg.Dom](../../aspose.svg.dom)
* hopsättning [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
