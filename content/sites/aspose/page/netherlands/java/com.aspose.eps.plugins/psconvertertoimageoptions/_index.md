---
title: "PsConverterToImageOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt PS/EPS-naar-afbeelding-converteropties voor  plugin voor."
type: docs
weight: 12
url: /nl/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Stelt PS/EPS-naar-afbeelding-converteropties voor [PsConverter](../../com.aspose.eps.plugins/psconverter) plugin voor.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object. |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object met afbeeldingsformaat. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object met een grootte van de resulterende afbeelding. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object met afbeeldingsformaat. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverter-plug-in. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverterOptions-plug-in. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Retourneert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Retourneert de gegevensverzameling van de PsConverterOptions-plug-in. |
| [getExceptions()](#getExceptions--) | Retourneert een lijst met niet‑kritieke fouten. |
| [getImageFormat()](#getImageFormat--) | Haalt beeldformaat op. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getOperationName()](#getOperationName--) | Retourneert de operatienaam. |
| [getResolution()](#getResolution--) | Haalt de beeldresolutie op. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Haalt de collectie op van toegevoegde doelen voor het opslaan van operationele resultaten. |
| [getSize()](#getSize--) | Haalt de grootte op van de resulterende afbeelding. |
| [getSmoothingMode()](#getSmoothingMode--) | Haalt de verzachtingsmodus op voor het renderen van de afbeelding. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Haalt de vlag op die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [isSupressErrors()](#isSupressErrors--) | Retourneert een waarde die aangeeft of fouten worden onderdrukt tijdens conversie. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype‑mappen waar de converter lettertypen voor het invoerdocument moet vinden. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specificeert de vlag die uitvoer van waarschuwingen en berichten tijdens conversie toestaat. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Haalt beeldformaat op. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setResolution(int resolution)](#setResolution-int-) | Stelt de beeldresolutie in. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Stelt de grootte in van de resulterende afbeelding. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Stelt de verzachtingsmodus in voor het renderen van de afbeelding. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object.

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object met afbeeldingsformaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Een formaat van de resulterende afbeelding. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object met een grootte van de resulterende afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Een grootte van de resulterende afbeelding. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initialiseert een nieuw exemplaar van het [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) object met afbeeldingsformaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Een formaat van de resulterende afbeelding. |
| grootte | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverter-plug-in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Gegevensbron om toe te voegen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Voegt een nieuwe gegevensbron toe aan de gegevensverzameling van de PsConverterOptions-plug-in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Gegevensbron (bestand of stream) voor het opslaan van operationele resultaten. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Retourneert de gegevensverzameling van de PsConverterOptions-plug-in.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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


Haalt beeldformaat op.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Retourneert de waarde die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Returns:**
int - De waarde die het compressieniveau voor een afbeelding aangeeft.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Retourneert de operatienaam.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


Haalt de beeldresolutie op.

**Returns:**
int - Een beeldresolutie.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Haalt de collectie op van toegevoegde doelen voor het opslaan van operationele resultaten.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Haalt de grootte op van de resulterende afbeelding.

**Returns:**
java.awt.Dimension - Een afbeeldingsgrootte.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Haalt de verzachtingsmodus op voor het renderen van de afbeelding.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
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


Haalt beeldformaat op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Een formaat van de resulterende afbeelding. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. Beschikbare waarden zijn 0 tot 100. Hoe lager het opgegeven getal, hoe hoger de compressie en dus hoe lager de kwaliteit van de afbeelding. Een waarde van 0 resulteert in een afbeelding van de laagste kwaliteit, terwijl 100 resulteert in de hoogste.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De waarde die het compressieniveau voor een afbeelding aangeeft. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Stelt de beeldresolutie in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| resolutie | int | Een resolutie van de resulterende afbeelding. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Stelt de grootte in van de resulterende afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Een grootte van de resulterende afbeelding. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Stelt de verzachtingsmodus in voor het renderen van de afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Een verzachtingsmodus. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specificeert de vlag die aangeeft of fouten tijdens de conversie worden onderdrukt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| supressErrors | boolean | Booleaanse waarde. |

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

