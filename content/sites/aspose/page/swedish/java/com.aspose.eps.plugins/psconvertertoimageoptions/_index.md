---
title: "PsConverterToImageOptions"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar alternativ för PS/EPS till bildkonverterare för  plugin."
type: docs
weight: 12
url: /sv/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Representerar alternativ för PS/EPS till bildkonverterare för [PsConverter](../../com.aspose.eps.plugins/psconverter) plugin.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) med bildformat. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) med storleken på den resulterande bilden. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) med bildformat. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Lägger till en ny datakälla till PsConverter‑pluginens datainsamling. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Lägger till en ny datakälla till PsConverterOptions‑pluginens datainsamling. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Returnerar PsConverterOptions‑pluginens datainsamling. |
| [getExceptions()](#getExceptions--) | Returnerar en lista över icke-kritiska fel. |
| [getImageFormat()](#getImageFormat--) | Hämtar bildformat. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Returnerar värdet som specificerar komprimeringsnivån för en bild. |
| [getOperationName()](#getOperationName--) | Returnerar operationens namn. |
| [getResolution()](#getResolution--) | Hämtar bildens upplösning. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Hämtar samling av tillagda mål för att spara operationens resultat. |
| [getSize()](#getSize--) | Hämtar storleken på den resulterande bilden. |
| [getSmoothingMode()](#getSmoothingMode--) | Hämtar jämningsläget för rendering av bild. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [isSupressErrors()](#isSupressErrors--) | Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Hämtar bildformat. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Ställer in värdet som specificerar komprimeringsnivån för en bild. |
| [setResolution(int resolution)](#setResolution-int-) | Ställer in bildens upplösning. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Ställer in storleken på den resulterande bilden. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Ställer in jämningsläget för rendering av bild. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) med bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ett format för den resulterande bilden. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) med storleken på den resulterande bilden.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension | En storlek på den resulterande bilden. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initierar en ny instans av objektet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) med bildformat.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ett format för den resulterande bilden. |
| size | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Lägger till en ny datakälla till PsConverter‑pluginens datainsamling.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datakälla att lägga till. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Lägger till en ny datakälla till PsConverterOptions‑pluginens datainsamling.

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Returnerar ytterligare teckensnittsmappar där konverteraren bör hitta teckensnitt för inmatningsdokumentet. Standardmappen är den vanliga teckensnittsmappen där OS hittar teckensnitt för interna behov.

**Returns:**
java.lang.String[] - En array av teckensnittsmappar.
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


Returnerar PsConverterOptions‑pluginens datainsamling.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Returnerar en lista över icke-kritiska fel.

**Returns:**
java.util.List<java.lang.Exception> - Undantagslista
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


Hämtar flaggan som tillåter utskrift av varningar och meddelanden under konverteringen.

**Returns:**
boolean - felsökningsvärde.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Returnerar ett värde som indikerar om fel kommer att undertryckas under konverteringen.

**Returns:**
boolean - booleskt värde
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


Anger ytterligare teckensnittsmappar där konverteraren ska hitta teckensnitt för inmatningsdokumentet. Standardmappen är den vanliga teckensnittsmappen där OS hittar teckensnitt för interna behov.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | En array av teckensnittsmappar. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Anger flaggan som tillåter utskrift av varningar och meddelanden under konverteringen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| debug | boolean | Booleskt värde. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Ställer in jämningsläget för rendering av bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Ett utjämningsläge. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Anger flaggan som indikerar om fel kommer att undertryckas under konverteringen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| supressErrors | boolean | Booleskt värde. |

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

