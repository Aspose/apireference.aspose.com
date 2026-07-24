---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt die XPS-zu-Bild-Konverteroptionen für das Plugin dar."
type: docs
weight: 12
url: /de/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Stellt die XPS-zu-Bild-Konverteroptionen für das [XpsConverter](../../com.aspose.xps.plugins/xpsconverter)-Plugin dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts. |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts mit Bildformat. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts mit einer Größe des resultierenden Bildes. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts mit Bildformat. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Fügt der Datensammlung des XpsConverter-Plugins eine neue Datenquelle hinzu. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Fügt der Datensammlung des XpsConverterOptions-Plugins eine neue Datenquelle hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Gibt die Datensammlung des XpsConverterOptions-Plugins zurück. |
| [getImageFormat()](#getImageFormat--) | Liefert das Bildformat. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getOperationName()](#getOperationName--) | Gibt den Namen der Operation zurück. |
| [getPageNumbers()](#getPageNumbers--) | Liefert das Array der Seitenzahlen im XPS-Dokument, das konvertiert werden soll. |
| [getResolution()](#getResolution--) | Liefert die Bildauflösung. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab. |
| [getSize()](#getSize--) | Ruft die Größe des resultierenden Bildes ab. |
| [getSmoothingMode()](#getSmoothingMode--) | Ruft den Glättungsmodus für die Bilddarstellung ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Liefert das Bildformat. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Legt das Array der Seitenzahlen im XPS-Dokument fest, das konvertiert werden soll. |
| [setResolution(int resolution)](#setResolution-int-) | Legt die Bildauflösung fest. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Legt die Größe des resultierenden Bildes fest. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Legt den Glättungsmodus für die Bilddarstellung fest. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts.

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts mit Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ein Format des resultierenden Bildes. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts mit einer Größe des resultierenden Bildes.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Eine Größe des resultierenden Bildes. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initialisiert eine neue Instanz des [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions)-Objekts mit Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ein Format des resultierenden Bildes. |
| Größe | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Fügt der Datensammlung des XpsConverter-Plugins eine neue Datenquelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datenquelle zum Hinzufügen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Fügt der Datensammlung des XpsConverterOptions-Plugins eine neue Datenquelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datenquelle (Datei oder Stream) zum Speichern von Operationsergebnissen. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Gibt die Datensammlung des XpsConverterOptions-Plugins zurück.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Liefert das Bildformat.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Returns:**
int - Der Wert, der das Kompressionsniveau für ein Bild angibt.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Gibt den Namen der Operation zurück.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Liefert das Array der Seitenzahlen im XPS-Dokument, das konvertiert werden soll.

**Returns:**
int[] - Ein Array von Seitenzahlen im XPS-Dokument.
### getResolution() {#getResolution--}
```
public int getResolution()
```


Liefert die Bildauflösung.

**Returns:**
int - Eine Bildauflösung.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Ruft die Größe des resultierenden Bildes ab.

**Returns:**
java.awt.Dimension - Eine Bildgröße.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Ruft den Glättungsmodus für die Bilddarstellung ab.

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


Liefert das Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ein Format des resultierenden Bildes. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Legt das Array der Seitenzahlen im XPS-Dokument fest, das konvertiert werden soll. Wenn nicht festgelegt, werden alle Seiten konvertiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pageNumbers | int[] | Ein Array von Seitenzahlen im XPS-Dokument. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Legt die Bildauflösung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Auflösung | int | Eine Auflösung des resultierenden Bildes. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Legt die Größe des resultierenden Bildes fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Eine Größe des resultierenden Bildes. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Legt den Glättungsmodus für die Bilddarstellung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Ein Glättungsmodus. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

