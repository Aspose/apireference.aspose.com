---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt XPS-naar-Image converteropties voor de plug-in voor."
type: docs
weight: 12
url: /nl/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Stelt XPS-naar-Image converteropties voor de [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plug-in voor.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object. |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object met beeldformaat. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object met een grootte van de resulterende afbeelding. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object met beeldformaat. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de XpsConverter plug-in gegevensverzameling. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Voegt een nieuwe gegevensbron toe aan de XpsConverterOptions plug-in gegevensverzameling. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Retourneert de XpsConverterOptions plug-in gegevensverzameling. |
| [getImageFormat()](#getImageFormat--) | Haalt beeldformaat op. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Retourneert de waarde die het compressieniveau voor een afbeelding specificeert. |
| [getOperationName()](#getOperationName--) | Retourneert de operatienaam. |
| [getPageNumbers()](#getPageNumbers--) | Haalt de array met paginanummers in het XPS-document op die moeten worden geconverteerd. |
| [getResolution()](#getResolution--) | Haalt de beeldresolutie op. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Haalt de collectie op van toegevoegde doelen voor het opslaan van operationele resultaten. |
| [getSize()](#getSize--) | Haalt de grootte op van de resulterende afbeelding. |
| [getSmoothingMode()](#getSmoothingMode--) | Haalt de verzachtingsmodus op voor het renderen van de afbeelding. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Haalt beeldformaat op. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Stelt de waarde in die het compressieniveau voor een afbeelding aangeeft. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Stelt de array in met het aantal pagina's in het XPS-document dat moet worden geconverteerd. |
| [setResolution(int resolution)](#setResolution-int-) | Stelt de beeldresolutie in. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Stelt de grootte in van de resulterende afbeelding. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Stelt de verzachtingsmodus in voor het renderen van de afbeelding. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object.

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object met beeldformaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Een formaat van de resulterende afbeelding. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object met een grootte van de resulterende afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension | Een grootte van de resulterende afbeelding. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initialiseert een nieuw exemplaar van het [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) object met beeldformaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Een formaat van de resulterende afbeelding. |
| grootte | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Voegt een nieuwe gegevensbron toe aan de XpsConverter plug-in gegevensverzameling.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Gegevensbron om toe te voegen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Voegt een nieuwe gegevensbron toe aan de XpsConverterOptions plug-in gegevensverzameling.

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


Retourneert de XpsConverterOptions plug-in gegevensverzameling.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Haalt de array met paginanummers in het XPS-document op die moeten worden geconverteerd.

**Returns:**
int[] - Een array met het aantal pagina's in het XPS-document.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Stelt de array in met het aantal pagina's in het XPS-document dat moet worden geconverteerd. Indien niet ingesteld, worden alle pagina's geconverteerd.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pageNumbers | int[] | Een array van paginanummers in een XPS-document. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Stelt de verzachtingsmodus in voor het renderen van de afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Een verzachtingsmodus. |

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

