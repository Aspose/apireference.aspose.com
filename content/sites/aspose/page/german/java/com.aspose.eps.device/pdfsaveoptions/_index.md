---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind."
type: docs
weight: 11
url: /de/java/com.aspose.eps.device/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für die Flags suppressErrors (true) und debug (false). |
| [PdfSaveOptions(boolean supressErrors)](#PdfSaveOptions-boolean-) | Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für das Flag debug (false). |
| [PdfSaveOptions(Dimension size)](#PdfSaveOptions-java.awt.Dimension-) | Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit der Seitengröße. |
| [PdfSaveOptions(boolean supressErrors, Dimension size)](#PdfSaveOptions-boolean-java.awt.Dimension-) | Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für das Flag debug (false) und der Seitengröße. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Gibt zusätzliche Schriftordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Liest das Flag aus, das anzeigt, ob nicht-TrueType-Schriftarten in TTF gespeichert werden müssen. |
| [getExceptions()](#getExceptions--) | Gibt eine Liste nicht kritischer Fehler zurück. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getSize()](#getSize--) | Liest die Größe der Seite oder des Bildes. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [isSupressErrors()](#isSupressErrors--) | Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Gibt an, ob nicht-TrueType-Schriftarten in TTF gespeichert werden sollen. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Gibt die Größe der Seite oder des Bildes an. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für die Flags suppressErrors (true) und debug (false).

### PdfSaveOptions(boolean supressErrors) {#PdfSaveOptions-boolean-}
```
public PdfSaveOptions(boolean supressErrors)
```


Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für das Flag debug (false).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| supressErrors | boolean | Wenn true, wird die Konvertierung trotz nicht kritischer Fehler fortgesetzt. |

### PdfSaveOptions(Dimension size) {#PdfSaveOptions-java.awt.Dimension-}
```
public PdfSaveOptions(Dimension size)
```


Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit der Seitengröße.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Die Größe der Seite. |

### PdfSaveOptions(boolean supressErrors, Dimension size) {#PdfSaveOptions-boolean-java.awt.Dimension-}
```
public PdfSaveOptions(boolean supressErrors, Dimension size)
```


Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für das Flag debug (false) und der Seitengröße.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| supressErrors | boolean | Wenn true, wird die Konvertierung trotz nicht kritischer Fehler fortgesetzt. |
| Größe | java.awt.Dimension | Die Größe der Seite. |

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
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Returns:**
int - Der Wert, der das Kompressionsniveau für ein Bild angibt.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Liest die Größe der Seite oder des Bildes.

**Returns:**
java.awt.Dimension - Eine Größe der Seite oder des Bildes.
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Gibt die Größe der Seite oder des Bildes an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Größe der Seite oder des Bildes. |

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

