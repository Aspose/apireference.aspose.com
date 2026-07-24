---
title: "PsConverterToImageOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt Optionen für den PS/EPS-zu-Bild-Konverter für das Plugin dar."
type: docs
weight: 12
url: /de/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Stellt Optionen für den PS/EPS-zu-Bild-Konverter für das Plugin [PsConverter](../../com.aspose.eps.plugins/psconverter) dar.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) mit Bildformat. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) mit einer Größe des resultierenden Bildes. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) mit Bildformat. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Fügt der Datensammlung des PsConverter-Plugins eine neue Datenquelle hinzu. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Fügt der Datensammlung des PsConverterOptions-Plugins eine neue Datenquelle hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Gibt zusätzliche Schriftordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Gibt die Datensammlung des PsConverterOptions-Plugins zurück. |
| [getExceptions()](#getExceptions--) | Gibt eine Liste nicht kritischer Fehler zurück. |
| [getImageFormat()](#getImageFormat--) | Liefert das Bildformat. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getOperationName()](#getOperationName--) | Gibt den Namen der Operation zurück. |
| [getResolution()](#getResolution--) | Liefert die Bildauflösung. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ruft die Sammlung der hinzugefügten Ziele für das Speichern von Operationsergebnissen ab. |
| [getSize()](#getSize--) | Ruft die Größe des resultierenden Bildes ab. |
| [getSmoothingMode()](#getSmoothingMode--) | Ruft den Glättungsmodus für die Bilddarstellung ab. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [isSupressErrors()](#isSupressErrors--) | Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Liefert das Bildformat. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setResolution(int resolution)](#setResolution-int-) | Legt die Bildauflösung fest. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Legt die Größe des resultierenden Bildes fest. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Legt den Glättungsmodus für die Bilddarstellung fest. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) mit Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ein Format des resultierenden Bildes. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) mit einer Größe des resultierenden Bildes.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Eine Größe des resultierenden Bildes. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initialisiert eine neue Instanz des Objekts [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) mit Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ein Format des resultierenden Bildes. |
| Größe | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Fügt der Datensammlung des PsConverter-Plugins eine neue Datenquelle hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Datenquelle zum Hinzufügen. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Fügt der Datensammlung des PsConverterOptions-Plugins eine neue Datenquelle hinzu.

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Gibt zusätzliche Schriftartenordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. Der Standardordner ist der übliche Schriftartenordner, in dem das Betriebssystem Schriftarten für interne Zwecke findet.

**Returns:**
java.lang.String[] - Ein Array von Schriftartenordnern.
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


Gibt die Datensammlung des PsConverterOptions-Plugins zurück.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Gibt eine Liste nicht kritischer Fehler zurück.

**Returns:**
java.util.List<java.lang.Exception> - Ausnahmeliste
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


Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht.

**Returns:**
boolean - Debug-Wert.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden.

**Returns:**
boolean - boolescher Wert
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


Gibt zusätzliche Schriftartenordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. Der Standardordner ist der übliche Schriftartenordner, in dem das Betriebssystem Schriftarten für interne Zwecke findet.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Ein Array von Schriftartenordnern. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| debug | boolean | Boolescher Wert. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Legt den Glättungsmodus für die Bilddarstellung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Ein Glättungsmodus. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| supressErrors | boolean | Boolescher Wert. |

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

