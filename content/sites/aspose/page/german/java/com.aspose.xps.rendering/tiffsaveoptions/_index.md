---
title: "TiffSaveOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse für XPS-als-TIFF-Speicheroptionen."
type: docs
weight: 16
url: /de/java/com.aspose.xps.rendering/tiffsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class TiffSaveOptions extends ImageSaveOptions
```

Klasse für XPS-als-TIFF-Speicheroptionen.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TiffSaveOptions()](#TiffSaveOptions--) | Erstellt eine neue Instanz von Optionen. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Gibt zusätzliche Schriftordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [getBatchSize()](#getBatchSize--) | Gibt die Größe eines Seitenabschnitts zurück, der von Knoten zu Knoten weitergegeben wird. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Gibt die Sammlung von Ereignishandlern zurück, die Änderungen an einer XPS‑Seite unmittelbar vor dem Speichern durchführen. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Liest das Flag aus, das anzeigt, ob nicht-TrueType-Schriftarten in TTF gespeichert werden müssen. |
| [getExceptions()](#getExceptions--) | Gibt eine Liste nicht kritischer Fehler zurück. |
| [getImageSize()](#getImageSize--) | Ermittelt die Größe der Ausgabebilder in Pixeln. |
| [getInterpolationMode()](#getInterpolationMode--) | Ermittelt den Interpolationsmodus. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getPageNumbers()](#getPageNumbers--) | Ermittelt das Array der Seitenzahlen, die gerendert werden sollen. |
| [getResolution()](#getResolution--) | Liefert die Bildauflösung. |
| [getSize()](#getSize--) | Liest die Größe der Seite oder des Bildes. |
| [getSmoothingMode()](#getSmoothingMode--) | Ermittelt den Glättungsmodus. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Ermittelt den Hinweis zur Textdarstellung. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [isSupressErrors()](#isSupressErrors--) | Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [multipage()](#multipage--) | Ermittelt das Flag, das definiert, ob mehrere Bilder in einer einzigen mehrseitigen TIFF‑Datei gespeichert werden sollen. |
| [multipage(boolean value)](#multipage-boolean-) | Setzt das Flag, das definiert, ob mehrere Bilder in einer einzigen mehrseitigen TIFF‑Datei gespeichert werden sollen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [setBatchSize(int value)](#setBatchSize-int-) | Setzt die Größe eines Seitenabschnitts, der von Knoten zu Knoten weitergegeben wird. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Gibt an, ob nicht-TrueType-Schriftarten in TTF gespeichert werden sollen. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Setzt die Größe der Ausgabebilder in Pixeln. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Setzt den Interpolationsmodus. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Setzt das Array der Seitenzahlen, die gerendert werden sollen. |
| [setResolution(float value)](#setResolution-float-) | Legt die Bildauflösung fest. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Gibt die Größe der Seite oder des Bildes an. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Setzt den Glättungsmodus. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Setzt den Hinweis zur Textdarstellung. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TiffSaveOptions() {#TiffSaveOptions--}
```
public TiffSaveOptions()
```


Erstellt eine neue Instanz von Optionen.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Gibt die Größe eines Seitenabschnitts zurück, der von Knoten zu Knoten weitergegeben wird.

**Returns:**
int - Die Größe eines Seitenabschnitts, der von Knoten zu Knoten weitergegeben wird.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Gibt die Sammlung von Ereignishandlern zurück, die Änderungen an einer XPS‑Seite unmittelbar vor dem Speichern durchführen.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Ermittelt die Größe der Ausgabebilder in Pixeln.

**Returns:**
java.awt.Dimension - Die Größe der Ausgabebilder in Pixeln.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Ermittelt den Interpolationsmodus.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Returns:**
int - Der Wert, der das Kompressionsniveau für ein Bild angibt.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Ermittelt das Array der Seitenzahlen, die gerendert werden sollen.

**Returns:**
int[] - Seitenzahlen.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Liefert die Bildauflösung.

**Returns:**
float - Die Bildauflösung.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Ermittelt den Hinweis zur Textdarstellung.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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
### multipage() {#multipage--}
```
public boolean multipage()
```


Ermittelt das Flag, das definiert, ob mehrere Bilder in einer einzigen mehrseitigen TIFF‑Datei gespeichert werden sollen.

**Returns:**
boolean - Das Flag, das definiert, ob mehrere Bilder in einer einzigen mehrseitigen TIFF-Datei gespeichert werden sollen.
### multipage(boolean value) {#multipage-boolean-}
```
public void multipage(boolean value)
```


Setzt das Flag, das definiert, ob mehrere Bilder in einer einzigen mehrseitigen TIFF‑Datei gespeichert werden sollen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Das Flag, das definiert, ob mehrere Bilder in einer einzigen mehrseitigen TIFF-Datei gespeichert werden sollen. |

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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Setzt die Größe eines Seitenabschnitts, der von Knoten zu Knoten weitergegeben wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Die Größe eines Seitenabschnitts, der von Knoten zu Knoten weitergegeben wird. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Setzt die Größe der Ausgabebilder in Pixeln.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.awt.Dimension | Die Größe der Ausgabebilder in Pixeln. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Setzt den Interpolationsmodus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Der Interpolationsmodus. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Setzt das Array der Seitenzahlen, die gerendert werden sollen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int[] | Anzahl der Seiten. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Legt die Bildauflösung fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Die Bildauflösung. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Gibt die Größe der Seite oder des Bildes an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension | Größe der Seite oder des Bildes. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Setzt den Glättungsmodus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Der Glättungsmodus. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| supressErrors | boolean | Boolescher Wert. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Setzt den Hinweis zur Textdarstellung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Der Textdarstellungshinweis. |

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

