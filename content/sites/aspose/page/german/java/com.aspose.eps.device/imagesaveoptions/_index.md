---
title: "ImageSaveOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind."
type: docs
weight: 10
url: /de/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Initialisieren Sie eine neue Instanz der Klasse ImageSaveOptions mit Standardwerten für die Flags suppressErrors (true) und debug (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Initialisiert eine neue Instanz von ImageSaveOptions mit dem angegebenen Bildformat. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße und dem Bildformat. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Initialisiert eine neue Instanz von ImageSaveOptions mit dem angegebenen Bildformat und dem Flag suppressErrors. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße und dem Flag suppressErrors. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße, dem Bildformat und dem Flag suppressErrors. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Initialisieren Sie eine neue Instanz der Klasse ImageSaveOptions mit Standardwerten für das Flag debug (false). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Gibt zusätzliche Schriftordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Liest das Flag aus, das anzeigt, ob nicht-TrueType-Schriftarten in TTF gespeichert werden müssen. |
| [getExceptions()](#getExceptions--) | Gibt eine Liste nicht kritischer Fehler zurück. |
| [getImageFormat()](#getImageFormat--) | Ermittelt ein Bildformat für das resultierende Bild. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getResolution()](#getResolution--) | Gibt die Auflösung des resultierenden Bildes zurück. |
| [getSize()](#getSize--) | Liest die Größe der Seite oder des Bildes. |
| [getSmoothingMode()](#getSmoothingMode--) | Ermittelt den Glättungsmodus. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Gibt an, ob die Bibliothek versuchen wird, Bildfragmente zu verbinden. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [isSupressErrors()](#isSupressErrors--) | Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Gibt an, ob nicht-TrueType-Schriftarten in TTF gespeichert werden sollen. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Gibt ein Bildformat für das resultierende Bild an. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setResolution(float resolution)](#setResolution-float-) | Gibt die Auflösung des resultierenden Bildes an. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Gibt die Größe der Seite oder des Bildes an. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Setzt den Glättungsmodus. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Gibt an, ob die Bibliothek versuchen soll, Bildfragmente zusammenzufügen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Initialisieren Sie eine neue Instanz der Klasse ImageSaveOptions mit Standardwerten für die Flags suppressErrors (true) und debug (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Initialisiert eine neue Instanz von ImageSaveOptions mit dem angegebenen Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Das Format des Bildes. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Bildgröße. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße und dem Bildformat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Bildgröße. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format des Bildes. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Initialisiert eine neue Instanz von ImageSaveOptions mit dem angegebenen Bildformat und dem Flag suppressErrors.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format des Bildes. |
| supressErrors | boolean | Wenn true, wird die Konvertierung trotz nicht kritischer Fehler fortgesetzt. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße und dem Flag suppressErrors.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Bildgröße. |
| supressErrors | boolean | Wenn true, wird die Konvertierung trotz nicht kritischer Fehler fortgesetzt. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Initialisiert eine neue Instanz von ImageSaveOptions mit der angegebenen Bildgröße, dem Bildformat und dem Flag suppressErrors.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Bildgröße. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format des Bildes. |
| supressErrors | boolean | Wenn true, wird die Konvertierung trotz nicht kritischer Fehler fortgesetzt. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Initialisieren Sie eine neue Instanz der Klasse ImageSaveOptions mit Standardwerten für das Flag debug (false).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| supressErrors | boolean | Wenn true, wird die Konvertierung trotz nicht kritischer Fehler fortgesetzt. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Liest das Flag aus, das anzeigt, ob nicht-TrueType-Schriftarten in TTF gespeichert werden müssen.

**Returns:**
boolean - Der Flag-Wert.
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


Ermittelt ein Bildformat für das resultierende Bild.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Returns:**
int - Der Wert, der das Kompressionsniveau für ein Bild angibt.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Gibt die Auflösung des resultierenden Bildes zurück.

**Returns:**
float - Die Auflösung des Bildes.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Liest die Größe der Seite oder des Bildes.

**Returns:**
java.awt.Dimension - Eine Größe der Seite oder des Bildes.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Ermittelt den Glättungsmodus.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Gibt an, ob die Bibliothek versuchen wird, Bildfragmente zusammenzufügen. Sie wird verwendet, wenn das Bild in einer Quell‑PS/EPS‑Datei in Fragmente aufgeteilt ist. In diesem Fall bleiben ohne dieses Flag dünne Lücken zwischen den Fragmenten.

**Returns:**
boolean - der Wert des Flags.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Gibt an, ob nicht-TrueType-Schriftarten als TTF gespeichert werden sollen. Dies reduziert das Volumen des resultierenden Dokuments bei der PS-zu-PDF-Konvertierung erheblich und erhöht die Geschwindigkeit der Konvertierung von PS-Dateien mit einer großen Menge Text in nicht-TrueType-Schriftarten in jedes Ausgabeformat. Es gibt jedoch eine kleine vertikale Verschiebung des Textes beim Konvertieren einer PostSctipt-Datei in ein Bild.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Flag-Wert. |

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


Gibt ein Bildformat für das resultierende Bild an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Ein Ausgabe‑Bildformat. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Gibt die Auflösung des resultierenden Bildes an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Auflösung | float | Die Auflösung des Bildes. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Gibt die Größe der Seite oder des Bildes an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Größe der Seite oder des Bildes. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Setzt den Glättungsmodus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | der zu setzende smoothingMode |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| supressErrors | boolean | Boolescher Wert. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Gibt an, ob die Bibliothek versuchen soll, Bildfragmente zusammenzufügen. Sie wird verwendet, wenn das Bild in einer Quell‑PS/EPS‑Datei in Fragmente aufgeteilt ist. In diesem Fall bleiben ohne dieses Flag dünne Lücken zwischen den Fragmenten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tryJoinImageFragments | boolean | der Wert des Flags. |

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

