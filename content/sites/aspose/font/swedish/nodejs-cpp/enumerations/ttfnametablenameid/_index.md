---
title: "Enum TtfNameTableNameId"
second_title: "Aspose.Font för .NET API-referens"
description: "Aspose.Font.TtfNameTableNameId enum. Specificerar NameId"
type: docs
weight: 120
url: /sv/nodejs-cpp/enumerations/ttfnametablenameid/
---
## TtfNameTableNameId enumeration

Anger NameId.

```csharp
 enum TtfNameTableNameId
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
|  | CopyrightNotice | `0` | Upphovsrättsmeddelande. |
|  | FontFamily | `1` | Font Family. Denna sträng är fontfamiljens namn som användaren ser på Macintosh-plattformar. |
|  | FontSubfamily | `2` | Font Subfamily. Denna sträng är Font family som användaren ser på Macintosh-plattformar. |
|  | UniqueFontId | `3` | Unik underfamiljeidentifiering (Apple-spec). 3 Unik Font-identifierare (MS-spec). |
|  | FullName | `4` | Fullständigt namn på Fonten. |
|  | Version | `5` | Version av namntabellen. |
|  | PostScriptName | `6` | PostScript-namn för teckensnittet. Obs: Ett teckensnitt kan bara ha ett PostScript-namn och det namnet måste vara ASCII. |
|  | TrademarkNotice | `7` | Varumärkesmeddelande. |
|  | ManufacturerName | `8` | Tillverkarens namn. |
|  | DesignerName | `9` | Designer; namn på designern av typsnittet. |
|  | Description | `10` | Beskrivning; beskrivning av typsnittet. Kan innehålla revisionsinformation, användningsrekommendationer, historik, funktioner osv. |
|  | UrlVendor | `11` | URL för teckensnittleverantören (med protokoll, t.ex. http://, ftp://). Om ett unikt serienummer är inbäddat i URL:en kan det användas för att registrera teckensnittet. |
|  | UrlDesigner | `12` | URL för teckensnittdesignern (med protokoll, t.ex. http://, ftp://) |
|  | LicenseDescription | `13` | Licensbeskrivning; beskrivning av hur teckensnittet får användas lagligt, eller olika exempel på scenarier för licensierad användning. Detta fält bör skrivas på klartext, inte i juridiskt språk. |
|  | LicenseInfoUrl | `14` | URL för licensinformation, där ytterligare licensinformation kan hittas. |
|  | PreferredFamily | `16` | `15` Reserverad `16` Föredragen familj (endast Windows); I Windows visas familjenamnet i teckensnittmenyn; subfamiljenamnet visas som stilnamn. Av historiska skäl har teckensnittsfamiljer innehållit högst fyra stilar, men teckensnittdesigners kan gruppera fler än fyra teckensnitt till en enda familj. De föredragna familje- och subfamilje-ID:n låter teckensnittdesigners inkludera de föredragna familje/subfamilje-grupperingarna. Dessa ID:n finns endast om de skiljer sig från ID:n 1 och 2. |
|  | PreferredSubfamily | `17` | Föredragen subfamilj (endast Windows); I Windows visas familjenamnet i teckensnittmenyn; subfamiljenamnet visas som stilnamn. Av historiska skäl har teckensnittsfamiljer innehållit högst fyra stilar, men teckensnittdesigners kan gruppera fler än fyra teckensnitt till en enda familj. De föredragna familje- och subfamilje-ID:n låter teckensnittdesigners inkludera de föredragna familje/subfamilje-grupperingarna. Dessa ID:n finns endast om de skiljer sig från ID:n 1 och 2. |
|  | CompatibleFull | `18` | Kompatibel full (endast Macintosh); På Macintosh konstrueras menynamnet med hjälp av teckensnittresursen. Detta matchar vanligtvis det fullständiga namnet. Om du vill att teckensnittets namn ska visas annorlunda än det fullständiga namnet kan du infoga det kompatibla fullständiga namnet i ID 18. Detta namn används inte av själva Mac OS, men kan användas av programutvecklare (t.ex. Adobe). |
|  | SampleText | `19` | Exempeltext. Detta kan vara teckensnittets namn, eller någon annan text som designern anser vara den bästa exempeltexten för att visa hur teckensnittet ser ut. |
|  | PostScriptCID | `20` | Dess närvaro i ett teckensnitt betyder att nameID 6 innehåller ett PostScript-teckensnittsnamn som är avsett att användas med "composefont"-anropet för att aktivera teckensnittet i en PostScript-tolk. |
|  | WwsFamilyName | `21` | Används för att tillhandahålla ett WWS-konformt familjenamn om posterna för ID:n 16 och 17 inte följer WWS-modellen. |
|  | WwsSubfamilyName | `22` | Används i kombination med ID 21, detta ID tillhandahåller ett WWS-konformt subfamiljenamn (som endast återspeglar vikt-, bredd- och lutningsattribut) om posterna för ID:n 16 och 17 inte följer WWS-modellen. |
|  | LightBackground | `23` | Detta ID, om det används i CPAL-tabellens Palette Labels Array, anger att den motsvarande färgpaletten i CPAL-tabellen är lämplig att använda med teckensnittet när det visas på en ljus bakgrund, såsom vit. |
|  | DarkBackground | `24` | Detta ID, om det används i CPAL-tabellens Palette Labels Array, anger att den motsvarande färgpaletten i CPAL-tabellen är lämplig att använda med teckensnittet när det visas på en mörk bakgrund, såsom svart. |
|  | VariationsPostScriptNamePrefix | `25` | Om det finns i ett variabelt teckensnitt kan det användas som familjeprefix i algoritmen för PostScript-namngenerering för variationsfonter. |

