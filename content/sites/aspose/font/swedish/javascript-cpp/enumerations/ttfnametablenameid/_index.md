---
title: "Enum TtfNameTableNameId"
second_title: "Aspose.Font för JavaScript via C++"
description: "Aspose.Font.TtfNameTableNameId enum. Anger NameId"
type: docs
weight: 120
url: /sv/javascript-cpp/enumerations/ttfnametablenameid/
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
|  | FontFamily | `1` | Typsnittsfamilj. Denna sträng är typsnittsfamiljens namn som användaren ser på Macintosh-plattformar. |
|  | FontSubfamily | `2` | Typsnittssubfamilj. Denna sträng är typsnittsfamiljen som användaren ser på Macintosh-plattformar. |
|  | UniqueFontId | `3` | Unik subfamiljeidentifiering (Apple-spec). 3 Unik typsnittsidentifierare (MS-spec). |
|  | FullName | `4` | Fullständigt namn på typsnittet. |
|  | Version | `5` | Version av namntabellen. |
|  | PostScriptName | `6` | PostScript-namn för typsnittet. Obs: Ett typsnitt kan bara ha ett PostScript-namn och det namnet måste vara ASCII. |
|  | TrademarkNotice | `7` | Varumärkesmeddelande. |
|  | ManufacturerName | `8` | Tillverkarens namn. |
|  | DesignerName | `9` | Designer; namn på typsnittets designer. |
|  | Description | `10` | Beskrivning; beskrivning av typsnittet. Kan innehålla revisionsinformation, användningsrekommendationer, historik, funktioner med mera. |
|  | UrlVendor | `11` | URL för typsnittleverantören (med protokoll, t.ex. http://, ftp://). Om ett unikt serienummer är inbäddat i URL:en kan det användas för att registrera typsnittet. |
|  | UrlDesigner | `12` | URL för typsnittdesignern (med protokoll, t.ex. http://, ftp://) |
|  | LicenseDescription | `13` | Licensbeskrivning; beskrivning av hur typsnittet får användas lagligt, eller olika exempel på licensierad användning. Detta fält bör skrivas på enkelt språk, inte juridiskt språkbruk. |
|  | LicenseInfoUrl | `14` | URL för licensinformation, där ytterligare licensinformation kan hittas. |
|  | PreferredFamily | `16` | `15` Reserverad `16` Föredragen familj (endast Windows); I Windows visas familjenamnet i typsnittmenyn; subfamiljenamnet visas som stilnamn. Av historiska skäl har typsnittsfamiljer innehållit högst fyra stilar, men typsnittsdesigners kan gruppera fler än fyra typsnitt i en enda familj. ID:n för föredragen familj och föredragen subfamilj låter typsnittsdesigners inkludera de föredragna familje-/subfamiljegrupperingarna. Dessa ID:n finns bara om de skiljer sig från ID:n 1 och 2. |
|  | PreferredSubfamily | `17` | Föredragen subfamilj (endast Windows); I Windows visas familjenamnet i typsnittmenyn; subfamiljenamnet visas som stilnamn. Av historiska skäl har typsnittsfamiljer innehållit högst fyra stilar, men typsnittsdesigners kan gruppera fler än fyra typsnitt i en enda familj. ID:n för föredragen familj och föredragen subfamilj låter typsnittsdesigners inkludera de föredragna familje-/subfamiljegrupperingarna. Dessa ID:n finns bara om de skiljer sig från ID:n 1 och 2. |
|  | CompatibleFull | `18` | Kompatibel full (endast Macintosh); På Macintosh konstrueras menynamnet med hjälp av typsnittresursen. Detta matchar vanligtvis det fullständiga namnet. Om du vill att typsnittets namn ska visas annorlunda än det fullständiga namnet kan du infoga det kompatibla fullständiga namnet i ID 18. Detta namn används inte av själva Mac OS, men kan användas av programutvecklare (t.ex. Adobe). |
|  | SampleText | `19` | Exempeltext. Detta kan vara typsnittets namn, eller någon annan text som designern anser vara den bästa exempeltexten för att visa hur typsnittet ser ut. |
|  | PostScriptCID | `20` | Dess närvaro i ett typsnitt betyder att nameID 6 innehåller ett PostScript-typsnittnamn som är avsett att användas med "composefont"-anropet för att aktivera typsnittet i en PostScript-tolk. |
|  | WwsFamilyName | `21` | Används för att tillhandahålla ett WWS‑konformt familjenamn om posterna för ID‑n 16 och 17 inte följer WWS‑modellen. |
|  | WwsSubfamilyName | `22` | Används i kombination med ID 21, detta ID tillhandahåller ett WWS‑konformt subfamiljenamn (som endast återspeglar vikt-, bredd- och lutningsattribut) om posterna för ID‑n 16 och 17 inte följer WWS‑modellen. |
|  | LightBackground | `23` | Detta ID, om det används i CPAL-tabellens Palette Labels Array, anger att den motsvarande färgpaletten i CPAL-tabellen är lämplig att använda med typsnittet när det visas på en ljus bakgrund, såsom vit. |
|  | DarkBackground | `24` | Detta ID, om det används i CPAL-tabellens Palette Labels Array, anger att den motsvarande färgpaletten i CPAL-tabellen är lämplig att använda med typsnittet när det visas på en mörk bakgrund, såsom svart. |
|  | VariationsPostScriptNamePrefix | `25` | Om den finns i ett variabelt teckensnitt kan den användas som familjeprefix i algoritmen för PostScript‑namngenerering för variationsfonter. |

