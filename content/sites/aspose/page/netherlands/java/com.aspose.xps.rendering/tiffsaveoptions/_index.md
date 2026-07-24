---
title: "TiffSaveOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse voor XPS-als-TIFF opslagopties."
type: docs
weight: 16
url: /nl/java/com.aspose.xps.rendering/tiffsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class TiffSaveOptions extends ImageSaveOptions
```

Klasse voor XPS-als-TIFF opslagopties.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [TiffSaveOptions()](#TiffSaveOptions--) | Maakt een nieuw exemplaar van opties aan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [getBatchSize()](#getBatchSize--) | Retourneert de grootte van een deel pagina's om van node naar node te verzenden. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Retourneert de collectie van event handlers die wijzigingen aan een XPS-pagina uitvoeren net voordat deze wordt opgeslagen. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Haalt de vlag op die aangeeft of het nodig is om niet‑TrueType‑lettertypen op te slaan als TTF. |
| [getExceptions()](#getExceptions--) | Retourneert een lijst met niet‑kritieke fouten. |
| [getImageSize()](#getImageSize--) | Haalt de grootte van de uitvoerafbeeldingen op in pixels. |
| [getInterpolationMode()](#getInterpolationMode--) | Haalt de interpolatiemodus op. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getPageNumbers()](#getPageNumbers--) | Haalt de array met paginanummers op die moeten worden gerenderd. |
| [getResolution()](#getResolution--) | Haalt de beeldresolutie op. |
| [getSize()](#getSize--) | Haalt een grootte van de pagina of afbeelding op. |
| [getSmoothingMode()](#getSmoothingMode--) | Haalt de verzachtingsmodus op. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Haalt de tekstrenderinghint op. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [isSupressErrors()](#isSupressErrors--) | Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie. |
| [multipage()](#multipage--) | Haalt de vlag op die bepaalt of meerdere afbeeldingen moeten worden opgeslagen in één multipage TIFF-bestand. |
| [multipage(boolean value)](#multipage-boolean-) | Stelt de vlag in die bepaalt of meerdere afbeeldingen moeten worden opgeslagen in één multipage TIFF-bestand. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [setBatchSize(int value)](#setBatchSize-int-) | Stelt de grootte van een deel pagina's in om van node naar node te verzenden. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specificeert of niet‑TrueType‑lettertypen moeten worden opgeslagen als TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Stelt de grootte van de uitvoerafbeeldingen in pixels in. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Stelt de interpolatiemodus in. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Stelt de array met paginanummers in die moeten worden gerenderd. |
| [setResolution(float value)](#setResolution-float-) | Stelt de beeldresolutie in. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specificeert een grootte van de pagina of afbeelding. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Stelt de verzachtingsmodus in. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Stelt de tekstrenderinghint in. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TiffSaveOptions() {#TiffSaveOptions--}
```
public TiffSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Retourneert een lijst met niet‑kritieke fouten.

**Returns:**
java.util.List<java.lang.Exception> - Lijst met uitzonderingen
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Haalt de grootte van de uitvoerafbeeldingen op in pixels.

**Returns:**
java.awt.Dimension - De grootte van de uitvoerafbeeldingen in pixels.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Haalt de interpolatiemodus op.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Retourneert de waarde die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Returns:**
int - De waarde die het compressieniveau voor een afbeelding aangeeft.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Haalt de array met paginanummers op die moeten worden gerenderd.

**Returns:**
int[] - Aantal pagina's.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Haalt de beeldresolutie op.

**Returns:**
float - De beeldresolutie.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Haalt een grootte van de pagina of afbeelding op.

**Returns:**
java.awt.Dimension - Een grootte van de pagina of afbeelding.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Haalt de verzachtingsmodus op.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Haalt de tekstrenderinghint op.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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
### multipage() {#multipage--}
```
public boolean multipage()
```


Haalt de vlag op die bepaalt of meerdere afbeeldingen moeten worden opgeslagen in één multipage TIFF-bestand.

**Returns:**
boolean - De vlag die bepaalt of meerdere afbeeldingen in één multipage TIFF-bestand moeten worden opgeslagen.
### multipage(boolean value) {#multipage-boolean-}
```
public void multipage(boolean value)
```


Stelt de vlag in die bepaalt of meerdere afbeeldingen moeten worden opgeslagen in één multipage TIFF-bestand.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | boolean | De vlag die bepaalt of meerdere afbeeldingen in één multipage TIFF-bestand moeten worden opgeslagen. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Stelt de grootte van de uitvoerafbeeldingen in pixels in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.awt.Dimension | De grootte van de uitvoerafbeeldingen in pixels. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Stelt de interpolatiemodus in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | De interpolatiemodus. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het compressieniveau voor een afbeelding aangeeft. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Stelt de array met paginanummers in die moeten worden gerenderd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int[] | Aantal pagina's. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Stelt de beeldresolutie in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | float | De beeldresolutie. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specificeert een grootte van de pagina of afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Grootte van de pagina of afbeelding. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Stelt de verzachtingsmodus in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | De verzachtingsmodus. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Booleaanse waarde. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Stelt de tekstrenderinghint in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | De hint voor tekstopmaak. |

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

