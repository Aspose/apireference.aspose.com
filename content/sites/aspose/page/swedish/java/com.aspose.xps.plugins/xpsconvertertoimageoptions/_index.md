---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar XPS‑till‑Bild‑konverterarens alternativ för plugin."
type: docs
weight: 12
url: /sv/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Representerar XPS‑till‑Bild‑konverterarens alternativ för [XpsConverter](../../com.aspose.xps.plugins/xpsconverter)‑plugin.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) med bildformat. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) med storleken på den resulterande bilden. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) med bildformat. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Lägger till en ny datakälla i XpsConverter‑pluginens datainsamling. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Lägger till en ny datakälla i XpsConverterOptions‑pluginens datainsamling. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Returnerar XpsConverterOptions‑pluginens datainsamling. |
| [getImageFormat()](#getImageFormat--) | Hämtar bildformat. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getOperationName()](#getOperationName--) | Returnerar operationens namn. |
| [getPageNumbers()](#getPageNumbers--) | Hämtar arrayen med sidnummer i XPS-dokumentet som ska konverteras. |
| [getResolution()](#getResolution--) | Hämtar bildens upplösning. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Hämtar samling av tillagda mål för att spara operationens resultat. |
| [getSize()](#getSize--) | Hämtar storleken på den resulterande bilden. |
| [getSmoothingMode()](#getSmoothingMode--) | Hämtar jämningsläget för rendering av bild. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Hämtar bildformat. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Ställer in arrayen med sidnummer i XPS-dokumentet som ska konverteras. |
| [setResolution(int resolution)](#setResolution-int-) | Ställer in bildens upplösning. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Ställer in storleken på den resulterande bilden. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Ställer in jämningsläget för rendering av bild. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) med bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ett format för den resulterande bilden. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) med storleken på den resulterande bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | En storlek på den resulterande bilden. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initierar en ny instans av objektet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) med bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ett format för den resulterande bilden. |
| size | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Lägger till en ny datakälla i XpsConverter‑pluginens datainsamling.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datakälla att lägga till. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Lägger till en ny datakälla i XpsConverterOptions‑pluginens datainsamling.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datakälla (fil eller ström) för att spara resultat av operationen. |

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


Returnerar XpsConverterOptions‑pluginens datainsamling.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Hämtar bildformat.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Returnerar värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Returns:**
int – Värdet som specificerar komprimeringsnivån för en bild.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Returnerar operationens namn.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Hämtar arrayen med sidnummer i XPS-dokumentet som ska konverteras.

**Returns:**
int[] – En array med sidnummer i XPS-dokumentet.
### getResolution() {#getResolution--}
```
public int getResolution()
```


Hämtar bildens upplösning.

**Returns:**
int – En bildupplösning.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Hämtar samling av tillagda mål för att spara operationens resultat.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Hämtar storleken på den resulterande bilden.

**Returns:**
java.awt.Dimension – En bildstorlek.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Hämtar jämningsläget för rendering av bild.

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


Hämtar bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ett format för den resulterande bilden. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Ställer in värdet som specificerar komprimeringsnivån för en bild. Tillgängliga värden är 0 till 100. Ju lägre tal som anges, desto högre blir komprimeringen och därmed lägre bildkvalitet. Värdet 0 ger den lägsta bildkvaliteten, medan 100 ger den högsta.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Värdet som specificerar komprimeringsnivån för en bild. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Ställer in arrayen med sidnummer i XPS-dokumentet som ska konverteras. Om den inte anges konverteras alla sidor.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| pageNumbers | int[] | En array med sidnummer i XPS-dokumentet. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Ställer in bildens upplösning.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| resolution | int | En upplösning för den resulterande bilden. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Ställer in storleken på den resulterande bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | En storlek för den resulterande bilden. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Ställer in jämningsläget för rendering av bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Ett utjämningsläge. |

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

