---
title: "ImageSaveOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Deze klasse bevat de opties die nodig zijn voor het beheren van het conversieproces."
type: docs
weight: 10
url: /nl/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Deze klasse bevat de opties die nodig zijn voor het beheren van het conversieproces.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Initialiseer een nieuwe instantie van de ImageSaveOptions‑klasse met standaardwaarden voor de vlaggen suppressErrors (true) en debug (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Initialiseert een nieuwe instantie van ImageSaveOptions met het opgegeven afbeeldingsformaat. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte en het afbeeldingsformaat. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Initialiseert een nieuwe instantie van ImageSaveOptions met het opgegeven afbeeldingsformaat en de suppressErrors‑vlag. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte en de suppressErrors‑vlag. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte, het afbeeldingsformaat en de suppressErrors‑vlag. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Initialiseer een nieuwe instantie van de ImageSaveOptions‑klasse met standaardwaarden voor de vlag debug (false). |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Haalt de vlag op die aangeeft of het nodig is om niet‑TrueType‑lettertypen op te slaan als TTF. |
| [getExceptions()](#getExceptions--) | Retourneert een lijst met niet‑kritieke fouten. |
| [getImageFormat()](#getImageFormat--) | Haalt een afbeeldingsformaat op voor de resulterende afbeelding. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getResolution()](#getResolution--) | Retourneert de resolutie van de resulterende afbeelding. |
| [getSize()](#getSize--) | Haalt een grootte van de pagina of afbeelding op. |
| [getSmoothingMode()](#getSmoothingMode--) | Haalt de anti‑aliasmodus op. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Geeft aan of de bibliotheek zal proberen afbeeldingsfragmenten samen te voegen. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [isSupressErrors()](#isSupressErrors--) | Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specificeert of niet‑TrueType‑lettertypen moeten worden opgeslagen als TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Specificeert een afbeeldingsformaat voor de resulterende afbeelding. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setResolution(float resolution)](#setResolution-float-) | Specificeert de resolutie van de resulterende afbeelding. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specificeert een grootte van de pagina of afbeelding. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Stelt de anti-aliasingmodus in. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Specificeert of de bibliotheek moet proberen afbeeldingsfragmenten samen te voegen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Initialiseer een nieuwe instantie van de ImageSaveOptions‑klasse met standaardwaarden voor de vlaggen suppressErrors (true) en debug (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Initialiseert een nieuwe instantie van ImageSaveOptions met het opgegeven afbeeldingsformaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Het formaat van de afbeelding. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Afbeeldingsgrootte. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte en het afbeeldingsformaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Afbeeldingsgrootte. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formaat van de afbeelding. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Initialiseert een nieuwe instantie van ImageSaveOptions met het opgegeven afbeeldingsformaat en de suppressErrors‑vlag.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formaat van de afbeelding. |
| supressErrors | boolean | Als true wordt de conversie voortgezet ondanks niet‑kritieke fouten. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte en de suppressErrors‑vlag.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Afbeeldingsgrootte. |
| supressErrors | boolean | Als true wordt de conversie voortgezet ondanks niet‑kritieke fouten. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Initialiseert een nieuwe instantie van ImageSaveOptions met de opgegeven afbeeldingsgrootte, het afbeeldingsformaat en de suppressErrors‑vlag.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Afbeeldingsgrootte. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formaat van de afbeelding. |
| supressErrors | boolean | Als true wordt de conversie voortgezet ondanks niet‑kritieke fouten. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Initialiseer een nieuwe instantie van de ImageSaveOptions‑klasse met standaardwaarden voor de vlag debug (false).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Als true wordt de conversie voortgezet ondanks niet‑kritieke fouten. |

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Haalt een afbeeldingsformaat op voor de resulterende afbeelding.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Retourneert de waarde die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Returns:**
int - De waarde die het compressieniveau voor een afbeelding aangeeft.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Retourneert de resolutie van de resulterende afbeelding.

**Returns:**
float - De resolutie van de afbeelding.
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


Haalt de anti‑aliasmodus op.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Geeft aan of de bibliotheek zal proberen afbeeldingsfragmenten samen te voegen. Het wordt gebruikt wanneer de afbeelding in een bron PS/EPS-bestand in fragmenten is gesplitst. In dit geval blijven er zonder deze vlag dunne openingen tussen de fragmenten.

**Returns:**
boolean - de waarde van de vlag.
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




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. Standaardmap is de standaard lettertype‑map waar het OS lettertypen voor interne behoeften vindt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Een array van lettertype‑mappen. |

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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Specificeert een afbeeldingsformaat voor de resulterende afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Een uitvoerafbeeldingsformaat. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het compressieniveau voor een afbeelding aangeeft. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Specificeert de resolutie van de resulterende afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| resolutie | float | De resolutie van de afbeelding. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specificeert een grootte van de pagina of afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Grootte van de pagina of afbeelding. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Stelt de anti-aliasingmodus in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | de smoothingMode die moet worden ingesteld. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Booleaanse waarde. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Specificeert of de bibliotheek moet proberen afbeeldingsfragmenten samen te voegen. Het wordt gebruikt wanneer de afbeelding in een bron PS/EPS-bestand in fragmenten is gesplitst. In dit geval blijven er zonder deze vlag dunne openingen tussen de fragmenten.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tryJoinImageFragments | boolean | de waarde van de vlag. |

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

