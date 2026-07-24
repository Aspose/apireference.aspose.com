---
title: "PdfSaveOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse voor XPS-als-PDF opslagopties."
type: docs
weight: 14
url: /nl/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Klasse voor XPS-als-PDF opslagopties.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Maakt een nieuw exemplaar van opties aan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [getBatchSize()](#getBatchSize--) | Retourneert de grootte van een deel pagina's om van node naar node te verzenden. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Retourneert de collectie van event handlers die wijzigingen aan een XPS-pagina uitvoeren net voordat deze wordt opgeslagen. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Haalt de vlag op die aangeeft of het nodig is om niet‑TrueType‑lettertypen op te slaan als TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Geeft de encryptiedetails terug. |
| [getExceptions()](#getExceptions--) | Retourneert een lijst met niet‑kritieke fouten. |
| [getImageCompression()](#getImageCompression--) | Geeft het compressietype terug dat voor alle afbeeldingen in het document wordt gebruikt. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Haalt op tot welk niveau de documentstructuur moet worden uitgeklapt wanneer het PDF‑bestand in een viewer wordt geopend. 1 - alleen de items van het eerste niveau worden getoond, 2 - alleen de items van het eerste en tweede niveau worden getoond, enzovoort. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Haalt de hoogte van de documentstructuurboom op die moet worden opgeslagen. 0 - de structuurboom wordt niet geconverteerd, 1 - alleen de items van het eerste niveau worden geconverteerd, enzovoort. |
| [getPageNumbers()](#getPageNumbers--) | Haalt de array met paginanummers op die moeten worden gerenderd. |
| [getSize()](#getSize--) | Haalt een grootte van de pagina of afbeelding op. |
| [getTextCompression()](#getTextCompression--) | Geeft het compressietype terug dat voor alle contentstreams behalve afbeeldingen wordt gebruikt. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [isSupressErrors()](#isSupressErrors--) | Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | In XPS kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyph‑vormen die niet overeenkomen met een tekencode in het lettertype. |
| [preserveText(boolean value)](#preserveText-boolean-) | In XPS kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyph‑vormen die niet overeenkomen met een tekencode in het lettertype. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [setBatchSize(int value)](#setBatchSize-int-) | Stelt de grootte van een deel pagina's in om van node naar node te verzenden. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specificeert of niet‑TrueType‑lettertypen moeten worden opgeslagen als TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Stelt de encryptiedetails in. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Stelt het compressietype in dat voor alle afbeeldingen in het document wordt gebruikt. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Stelt in tot welk niveau de documentstructuur moet worden uitgeklapt wanneer het PDF‑bestand in een viewer wordt geopend. 1 - alleen de items van het eerste niveau worden getoond, 2 - alleen de items van het eerste en tweede niveau worden getoond, enzovoort. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Stelt de hoogte van de documentstructuurboom in die moet worden opgeslagen. 0 - de structuurboom wordt niet geconverteerd, 1 - alleen de items van het eerste niveau worden geconverteerd, enzovoort. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Stelt de array met paginanummers in die moeten worden gerenderd. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specificeert een grootte van de pagina of afbeelding. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Stelt het compressietype in dat voor alle contentstreams behalve afbeeldingen wordt gebruikt. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Maakt een nieuw exemplaar van opties aan.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaard lettertype‑map waar het OS lettertypen voor interne behoeften vindt.

**Returns:**
java.lang.String[] - Een array van lettertype‑mappen.
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Retourneert de grootte van een deel pagina's om van node naar node te verzenden.

**Returns:**
int - De grootte van een deel pagina's om van node naar node te verzenden.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Retourneert de collectie van event handlers die wijzigingen aan een XPS-pagina uitvoeren net voordat deze wordt opgeslagen.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - De verzameling event‑handlers die wijzigingen aan een XPS‑pagina uitvoeren vlak voordat deze wordt opgeslagen.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Haalt de vlag op die aangeeft of het nodig is om niet‑TrueType‑lettertypen op te slaan als TTF.

**Returns:**
boolean - De vlagwaarde.
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Geeft de encryptiedetails terug. Indien niet ingesteld, wordt er geen encryptie uitgevoerd.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Retourneert een lijst met niet‑kritieke fouten.

**Returns:**
java.util.List<java.lang.Exception> - Lijst met uitzonderingen
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Retourneert het compressietype dat moet worden gebruikt voor alle afbeeldingen in het document. Standaard is PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Retourneert de waarde die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Returns:**
int - De waarde die het compressieniveau voor een afbeelding aangeeft.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Haalt op tot welk niveau de documentstructuur moet worden uitgeklapt wanneer het PDF‑bestand in een viewer wordt geopend. 1 - alleen de items van het eerste niveau worden getoond, 2 - alleen de items van het eerste en tweede niveau worden getoond, enzovoort.

**Returns:**
int - Het uitbreidingsniveau van de outline-boom.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Haalt de hoogte op van de document outline-boom die moet worden opgeslagen. 0 - de outline-boom wordt niet geconverteerd, 1 - alleen de outline-items van het eerste niveau worden geconverteerd, enzovoort. Standaard is 10.

**Returns:**
int - De hoogte van de outline-boom.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Haalt de array met paginanummers op die moeten worden gerenderd.

**Returns:**
int[] - Aantal pagina's.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Haalt een grootte van de pagina of afbeelding op.

**Returns:**
java.awt.Dimension - Een grootte van de pagina of afbeelding.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Retourneert het compressietype dat moet worden gebruikt voor alle contentstreams behalve afbeeldingen. Standaard is PdfTextCompression.Flate.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat.

**Returns:**
boolean - debugwaarde.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie.

**Returns:**
boolean - booleaanse waarde
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


In XPS kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyphvormen die niet overeenkomen met een tekencode in het lettertype. Als deze vlag op true wordt gezet, wordt de tekst van dergelijke XPS-elementen omgezet naar grafische vormen. Vervolgens verschijnt de tekst zelf transparant erboven. Hierdoor blijft de tekst van dergelijke elementen selecteerbaar. Maar het neveneffect is dat het uitvoerbestand veel groter kan zijn dan het origineel. Als deze vlag op false wordt gezet, worden de tekens die als alternatieve vormen moeten worden weergegeven vervangen door andere tekens die worden gemapt naar de alternatieve glyphvormen. Daarom wordt de tekst, hoewel nog steeds selecteerbaar, aangepast en zal waarschijnlijk onleesbaar worden.

**Returns:**
boolean - De vlagwaarde.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


In XPS kunnen sommige textelementen verwijzingen bevatten naar alternatieve glyphvormen die niet overeenkomen met een tekencode in het lettertype. Als deze vlag op true wordt gezet, wordt de tekst van dergelijke XPS-elementen omgezet naar grafische vormen. Vervolgens verschijnt de tekst zelf transparant erboven. Hierdoor blijft de tekst van dergelijke elementen selecteerbaar. Maar het neveneffect is dat het uitvoerbestand veel groter kan zijn dan het origineel. Als deze vlag op false wordt gezet, worden de tekens die als alternatieve vormen moeten worden weergegeven vervangen door andere tekens die worden gemapt naar de alternatieve glyphvormen. Daarom wordt de tekst, hoewel nog steeds selecteerbaar, aangepast en zal waarschijnlijk onleesbaar worden.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De vlagwaarde. |

### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaard lettertype‑map waar het OS lettertypen voor interne behoeften vindt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Een array van lettertype‑mappen. |

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Stelt de grootte van een deel pagina's in om van node naar node te verzenden.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De grootte van een deel van pagina's dat van knooppunt naar knooppunt wordt doorgegeven. |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Specificeert of niet‑TrueType lettertypen moeten worden opgeslagen als TTF. Het verkleint het volume van het resulterende document bij PS‑naar‑PDF conversie aanzienlijk en verhoogt de conversiesnelheid van PS‑bestanden met een grote hoeveelheid tekst in niet‑TrueType lettertypen naar elk uitvoerformaat. Er is echter een kleine verticale verschuiving van de tekst bij het converteren van een PostSctipt‑bestand naar een afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De vlagwaarde. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| debug | boolean | Booleaanse waarde. |

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Stelt de encryptiedetails in. Indien niet ingesteld, wordt er geen encryptie uitgevoerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | De encryptiedetails. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Stelt het compressietype in dat moet worden gebruikt voor alle afbeeldingen in het document. Standaard is PdfImageCompression.Auto.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Het compressietype. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het compressieniveau voor een afbeelding aangeeft. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Stelt in tot welk niveau de documentstructuur moet worden uitgeklapt wanneer het PDF‑bestand in een viewer wordt geopend. 1 - alleen de items van het eerste niveau worden getoond, 2 - alleen de items van het eerste en tweede niveau worden getoond, enzovoort.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | Het uitbreidingsniveau van de outline-boom. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Stelt de hoogte van de documentstructuurboom in die moet worden opgeslagen. 0 - de structuurboom wordt niet geconverteerd, 1 - alleen de items van het eerste niveau worden geconverteerd, enzovoort.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De hoogte van de outline-boom. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Stelt de array met paginanummers in die moeten worden gerenderd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int[] | Aantal pagina's. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specificeert een grootte van de pagina of afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Grootte van de pagina of afbeelding. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Booleaanse waarde. |

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Stelt het compressietype in dat moet worden gebruikt voor alle contentstreams behalve afbeeldingen. Standaard is PdfTextCompression.Flate.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Het compressietype. |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

