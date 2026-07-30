---
title: "NameId"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar NameId-uppräkning."
type: docs
weight: 67
url: /sv/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

Representerar NameId-uppräkning.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 Compatible Full (endast Macintosh); På Macintosh konstrueras menynamnet med hjälp av teckensnittresursen. |
| [CopyrightNotice](#CopyrightNotice) | 0 Upphovsrättsmeddelande. |
| [DarkBackground](#DarkBackground) | Detta ID, om det används i CPAL table\\u2019s Palette Labels Array, anger att den motsvarande färgpaletten i CPAL‑tabellen är lämplig att använda med teckensnittet när det visas på en mörk bakgrund såsom svart. |
| [Description](#Description) | 10 Beskrivning; beskrivning av teckensnittet. |
| [DesignerName](#DesignerName) | 9 Designer; namn på designern av typsnittet. |
| [FontFamily](#FontFamily) | 1 Typsnittsfamilj. |
| [FontSubfamily](#FontSubfamily) | 2 Typsnittssubfamilj. |
| [FullName](#FullName) | 4 Fullständigt namn på typsnittet. |
| [LicenseDescription](#LicenseDescription) | 13 Licensbeskrivning; beskrivning av hur typsnittet får användas lagligt, eller olika exempel på scenarier för licensierad användning. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 URL för licensinformation, där ytterligare licensinformation kan hittas. |
| [LightBackground](#LightBackground) | Detta ID, om det används i CPAL‑tabellens\\u2019s Palette Labels Array, anger att den motsvarande färgpaletten i CPAL‑tabellen är lämplig att använda med typsnittet när det visas på en ljus bakgrund såsom vit |
| [ManufacturerName](#ManufacturerName) | 8 Tillverkarens namn. |
| [PostScriptCID](#PostScriptCID) | Dess närvaro i ett typsnitt betyder att nameID 6 innehåller ett PostScript-typsnittsnamn som är avsett att användas med \\u201ccomposefont\\u201d‑anropet för att anropa typsnittet i en PostScript‑tolkare |
| [PostScriptName](#PostScriptName) | 6 PostScript‑namn på typsnittet. |
| [PreferredFamily](#PreferredFamily) | 15 Reserverad 16 Föredragen familj (endast Windows); I Windows visas familjenamnet i typsnittsmenyn; subfamiljenamnet presenteras som stilnamnet. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Föredragen subfamilj (endast Windows); I Windows visas familjenamnet i typsnittsmenyn; subfamiljenamnet presenteras som stilnamnet. |
| [SampleText](#SampleText) | 19 Exempeltext. |
| [TrademarkNotice](#TrademarkNotice) | 7 Varumärkesmeddelande. |
| [UniqueFontId](#UniqueFontId) | 3 Apple‑spec: Unik subfamiljeidentifiering. 3 MS‑spec: Unik typsnittsidentifierare |
| [UrlDesigner](#UrlDesigner) | 12 URL till typsnittsdesignern (med protokoll, t.ex. http://, ftp://) |
| [UrlVendor](#UrlVendor) | 11 URL till typsnittsförsäljaren (med protokoll, t.ex. http://, ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | Om den finns i ett variabelt typsnitt kan den användas som familjeprefix i algoritmen för PostScript‑namngenerering för variationstypsnitt. |
| [Version](#Version) | 5 Version av namntabellen. |
| [WwsFamilyName](#WwsFamilyName) | Används för att tillhandahålla ett WWS‑konformt familjenamn om posterna för ID‑en 16 och 17 inte följer WWS‑modellen. |
| [WwsSubfamilyName](#WwsSubfamilyName) | Används tillsammans med ID 21, detta ID tillhandahåller ett WWS‑konformt subfamiljenamn (som bara återspeglar vikt-, bredd- och lutningsattribut) om posterna för ID‑en 16 och 17 inte följer WWS‑modellen. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | Skapar ett namn‑ID från ett heltalsvärde. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | Hämta heltalsvärdet. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Kompatibel full (endast Macintosh); På Macintosh konstrueras menynamnet med hjälp av typsnittsresursen. Detta matchar vanligtvis det fullständiga namnet. Om du vill att typsnittets namn ska visas annorlunda än det fullständiga namnet kan du infoga det kompatibla fullständiga namnet i ID 18. Detta namn används inte av själva Mac OS, men kan användas av programutvecklare (t.ex. Adobe).

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Upphovsrättsmeddelande.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


Detta ID, om det används i CPAL table\\u2019s Palette Labels Array, anger att den motsvarande färgpaletten i CPAL‑tabellen är lämplig att använda med teckensnittet när det visas på en mörk bakgrund såsom svart.

### Description {#Description}
```
public static final NameId Description
```


10 Beskrivning; beskrivning av typsnittet. Kan innehålla revisionsinformation, användningsrekommendationer, historik, funktioner osv.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Designer; namn på designern av typsnittet.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 Typsnittsfamilj. Denna sträng är typsnittsfamiljens namn som användaren ser på Macintosh‑plattformar.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Font Subfamily. Denna sträng är den Font-familj som användaren ser på Macintosh-plattformar.

### FullName {#FullName}
```
public static final NameId FullName
```


4 Fullständigt namn på typsnittet.

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 Licensbeskrivning; beskrivning av hur Font får användas lagligt, eller olika exempel på scenarier för licensierad användning. Detta fält bör skrivas på klartext, inte i juridiskt språk.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 URL för licensinformation, där ytterligare licensinformation kan hittas.

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


Detta ID, om det används i CPAL‑tabellens\\u2019s Palette Labels Array, anger att den motsvarande färgpaletten i CPAL‑tabellen är lämplig att använda med typsnittet när det visas på en ljus bakgrund såsom vit

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Tillverkarens namn.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


Dess närvaro i ett typsnitt betyder att nameID 6 innehåller ett PostScript-typsnittsnamn som är avsett att användas med \\u201ccomposefont\\u201d‑anropet för att anropa typsnittet i en PostScript‑tolkare

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 PostScript-namn på Fonten. Obs: En Font kan bara ha ett PostScript-namn och det namnet måste vara ASCII.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Reserved 16 Preferred Family (endast Windows); I Windows visas familjenamnet i Font-menyn; subfamiljenamnet visas som stilnamn. Av historiska skäl har Font-familjer innehållit högst fyra stilar, men fontdesigners kan gruppera fler än fyra fonter till en enda familj. ID:n för Preferred Family och Preferred Subfamily låter fontdesigners inkludera de föredragna familje-/subfamiljegrupperingarna. Dessa ID:n finns endast om de skiljer sig från ID:n 1 och 2.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Preferred Subfamily (endast Windows); I Windows visas familjenamnet i Font-menyn; subfamiljenamnet visas som stilnamn. Av historiska skäl har Font-familjer innehållit högst fyra stilar, men fontdesigners kan gruppera fler än fyra fonter till en enda familj. ID:n för Preferred Family och Preferred Subfamily låter fontdesigners inkludera de föredragna familje-/subfamiljegrupperingarna. Dessa ID:n finns endast om de skiljer sig från ID:n 1 och 2.

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Exempeltext. Detta kan vara Font-namnet eller någon annan text som designern anser vara den bästa exempeltexten för att visa hur fonten ser ut.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Varumärkesmeddelande.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Apple‑spec: Unik subfamiljeidentifiering. 3 MS‑spec: Unik typsnittsidentifierare

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL till typsnittsdesignern (med protokoll, t.ex. http://, ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL till Font-leverantören (med protokoll, t.ex. http://, ftp://). Om ett unikt serienummer är inbäddat i URL:en kan det användas för att registrera Fonten.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


Om den finns i ett variabelt typsnitt kan den användas som familjeprefix i algoritmen för PostScript‑namngenerering för variationstypsnitt.

### Version {#Version}
```
public static final NameId Version
```


5 Version av namntabellen.

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


Används för att tillhandahålla ett WWS‑konformt familjenamn om posterna för ID‑en 16 och 17 inte följer WWS‑modellen.

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


Används tillsammans med ID 21, detta ID tillhandahåller ett WWS‑konformt subfamiljenamn (som bara återspeglar vikt-, bredd- och lutningsattribut) om posterna för ID‑en 16 och 17 inte följer WWS‑modellen.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


Skapar ett namn‑ID från ett heltalsvärde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| id | int | Ett heltalsvärde. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


Hämta heltalsvärdet.

**Returns:**
int - Heltalsvärdet.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

