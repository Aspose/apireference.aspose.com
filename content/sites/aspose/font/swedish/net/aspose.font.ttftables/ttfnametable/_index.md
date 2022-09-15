---
title: TtfNameTable
second_title: Aspose.Font för .NET API-referens
description: Representerar namntabellen för TTFteckensnittsfilen.
type: docs
weight: 900
url: /sv/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Representerar "namn"-tabellen för TTF-teckensnittsfilen.

```csharp
public class TtfNameTable : TtfTableBase
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Förskjuts från början av sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Referens till TTF-tabellförråd. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Får tabelltagg. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Extraherar alla flerspråkiga strängar från godkända*mlNames* object and skapar korrespondent NameRecord-struktur för varje sträng som extraheras med använda parametrar*platformId* ,*platformSpecificId* och*nameId* . Värdet för fältspråk-ID extraheras från*mlNames* objekt. Ny nyss skapad post läggs till i tabellen. Om post som sammanfaller med nyss skapad av fälten platformID, platformSpecificID, nameID och, langugeId hittas, kommer ny skapad post inte att läggas till och endast strängdata kommer att uppdateras för befintlig post. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Lägger till inträde i tabellen. Strängdatakategori att lägga till anges av*name* parameter. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Tar bort alla poster relaterade till plattform specificerad |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Tar bort alla poster relaterade till passerade parametrar |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Tar bort post(er) relaterade till parametrar specificerad |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Tar bort alla poster relaterade till passerad nameId parameter |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Returnerar alla[`NameRecord`](../ttfnametable.namerecord) strukturer från table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | Returnerar ett namn efter nameId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Returnerar ett namn med nameId med plattformsidentifierare passerad. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Returnerar ett namn som objekt av typen[`MultiLanguageString`](../../aspose.font/multilanguagestring) . Metoden samlar alla NameRecord-strukturer som sammanfaller med angivna parametrar nameId, platformId och platformSpecificId och bygger sedan det resulterande objektet baserat på denna strukturlista. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Returnerar ett namn med nameId om det hittas, null annars |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Returnerar alla[`NameRecord`](../ttfnametable.namerecord) strukturer vars NameId-fält är lika med som passerat*nameId* värde. Om inga poster hittas kommer tom array att returneras. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Uppdaterar namn i post(er) som relaterar till specificerad plattform (kombination av platformId och platformSpecificId), kategori (nameId) och språk (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | Väljer alla poster som relaterade till logisk strängkategori, specificerad av parameter nameId och uppdaterar namnfältet (strängdata) i dessa poster. Fält relaterade till plattform (plattforms-ID, plattformsspecifikt kodnings-ID) och språk (språk-ID) påverkas inte av denna metod. Endast namnsträngsdata ersätts med ett nytt namn. Använd den här metoden med försiktighet, eftersom den kommer att ersätta ursprungliga namn för alla plattformar och språk, relaterat till nameId. Det kan skapa konflikter för fall då originalnamnen hade olika värden, orsakar ersätt operation ändrar alla dessa värden med en ny singel. Och detta nya värde kan ha en logisk inkonsekvens med vissa plattformar och språk. Den här metoden är användbar för fall där originalnamnet har en enda representation för alla plattformar och språk, till exempel när namnsträngsdata är på engelska. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Macintosh-plattformens språk-id-uppräkning. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Representerar Macintosh-plattformen PlatformSpecificId-uppräkning. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Uppräkning av språk-id för Microsoft-plattformen. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Representerar Microsoft-plattformen PlatformSpecificId-uppräkning. |
| enum [NameId](ttfnametable.nameid) | Representerar NameId. |
| class [NameRecord](ttfnametable.namerecord) | Representerar NameRecord-strukturen för 'name'-tabellen |
| enum [PlatformId](ttfnametable.platformid) | Representerar PlatformId-uppräkning. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Representerar unicode-plattformsspecifik uppräkning. |

### Se även

* class [TtfTableBase](../ttftablebase)
* namnutrymme [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* hopsättning [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
