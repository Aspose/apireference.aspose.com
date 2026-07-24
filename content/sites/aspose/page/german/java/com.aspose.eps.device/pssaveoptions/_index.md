---
title: "PsSaveOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind."
type: docs
weight: 12
url: /de/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Diese Klasse enthält Optionen, die für die Verwaltung des Konvertierungsprozesses erforderlich sind.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für die Flags suppressErrors (true) und debug (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für das Flag debug (false). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Gibt zusätzliche Schriftordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Liest das Flag aus, das anzeigt, ob nicht-TrueType-Schriftarten in TTF gespeichert werden müssen. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Gibt eine Liste nicht kritischer Fehler zurück. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Liest die Größe der Seite oder des Bildes. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [isEmbedFonts()](#isEmbedFonts--) | Gibt an, ob verwendete Schriftarten in das PS-Dokument eingebettet werden sollen |
| [isSupressErrors()](#isSupressErrors--) | Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Gibt an, ob nicht-TrueType-Schriftarten in TTF gespeichert werden sollen. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Legt fest, ob verwendete Schriftarten in das PS-Dokument eingebettet werden sollen |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Geben Sie den Schriftarttyp an, in dem Schriftarten im PS-Dokument eingebettet werden sollen |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Geben Sie das Speicherformat der resultierenden Datei an |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Gibt die Größe der Seite oder des Bildes an. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für die Flags suppressErrors (true) und debug (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Initialisieren Sie eine neue Instanz der Klasse PdfSaveOptions mit Standardwerten für das Flag debug (false).

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color – die Hintergrundfarbe
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
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String – ein Schriftarttyp, in dem Schriftarten im PS-Dokument eingebettet werden sollen
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
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets – die Seitenränder
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension – die Größe der Seite
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Gibt an, ob verwendete Schriftarten in das PS-Dokument eingebettet werden sollen

**Returns:**
boolean – Wert des embedFonts-Flags
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden.

**Returns:**
boolean - boolescher Wert
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean – Gibt an, ob der Hintergrund transparent ist
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Legt die Hintergrundfarbe fest |

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

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Legt fest, ob verwendete Schriftarten in das PS-Dokument eingebettet werden sollen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| embedFonts | boolean | embedFonts-Flag |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Geben Sie den Schriftarttyp an, in dem Schriftarten im PS-Dokument eingebettet werden sollen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Schriftarttyp |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ränder | java.awt.Insets | Legt die Ränder der Seite fest |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Legt die Größe der Seite fest |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Geben Sie das Speicherformat der resultierenden Datei an

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Format der resultierenden Datei |

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

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| transparent | boolean | Gibt an, ob der Hintergrund transparent ist |

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

