---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse für XPS-als-PDF-Speicheroptionen."
type: docs
weight: 14
url: /de/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Klasse für XPS-als-PDF-Speicheroptionen.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Erstellt eine neue Instanz von Optionen. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Gibt zusätzliche Schriftordner zurück, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [getBatchSize()](#getBatchSize--) | Gibt die Größe eines Seitenabschnitts zurück, der von Knoten zu Knoten weitergegeben wird. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Gibt die Sammlung von Ereignishandlern zurück, die Änderungen an einer XPS‑Seite unmittelbar vor dem Speichern durchführen. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Liest das Flag aus, das anzeigt, ob nicht-TrueType-Schriftarten in TTF gespeichert werden müssen. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Gibt die Verschlüsselungsdetails zurück. |
| [getExceptions()](#getExceptions--) | Gibt eine Liste nicht kritischer Fehler zurück. |
| [getImageCompression()](#getImageCompression--) | Gibt den Kompressionstyp zurück, der für alle Bilder im Dokument verwendet werden soll. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Ermittelt bis zu welcher Ebene die Dokumentenübersicht erweitert werden soll, wenn die PDF-Datei in einem Viewer geöffnet wird. 1 - nur die Elemente der ersten Ebene werden angezeigt, 2 - nur die Elemente der ersten und zweiten Ebene werden angezeigt, usw. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Ermittelt die Höhe des zu speichernden Dokumentenübersichtsbaums. 0 - der Übersichtsbaum wird nicht konvertiert, 1 - nur die Elemente der ersten Ebene werden konvertiert, usw. |
| [getPageNumbers()](#getPageNumbers--) | Ermittelt das Array der Seitenzahlen, die gerendert werden sollen. |
| [getSize()](#getSize--) | Liest die Größe der Seite oder des Bildes. |
| [getTextCompression()](#getTextCompression--) | Gibt den Kompressionstyp zurück, der für alle Inhaltsströme außer Bildern verwendet werden soll. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Liest das Flag aus, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [isSupressErrors()](#isSupressErrors--) | Gibt einen Wert zurück, der angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | In XPS können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schrift entsprechen. |
| [preserveText(boolean value)](#preserveText-boolean-) | In XPS können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schrift entsprechen. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an, in denen der Konverter Schriftarten für das Eingabedokument finden soll. |
| [setBatchSize(int value)](#setBatchSize-int-) | Setzt die Größe eines Seitenabschnitts, der von Knoten zu Knoten weitergegeben wird. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Gibt an, ob nicht-TrueType-Schriftarten in TTF gespeichert werden sollen. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Gibt das Flag an, das die Ausgabe von Warnungen und Meldungen während der Konvertierung ermöglicht. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Setzt die Verschlüsselungsdetails. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Setzt den Kompressionstyp, der für alle Bilder im Dokument verwendet werden soll. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Legt fest, bis zu welcher Ebene die Dokumentenübersicht erweitert werden soll, wenn die PDF-Datei in einem Viewer geöffnet wird. 1 - nur die Elemente der ersten Ebene werden angezeigt, 2 - nur die Elemente der ersten und zweiten Ebene werden angezeigt, usw. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Legt die Höhe des zu speichernden Dokumentenübersichtsbaums fest. 0 - der Übersichtsbaum wird nicht konvertiert, 1 - nur die Elemente der ersten Ebene werden konvertiert, usw. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Setzt das Array der Seitenzahlen, die gerendert werden sollen. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Gibt die Größe der Seite oder des Bildes an. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Gibt das Flag an, das angibt, ob Fehler während der Konvertierung unterdrückt werden. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Legt den Kompressionstyp fest, der für alle Inhaltsströme außer Bildern verwendet werden soll. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - Die Sammlung von Ereignis-Handlern, die Änderungen an einer XPS-Seite unmittelbar vor dem Speichern durchführen.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Gibt die Verschlüsselungsdetails zurück. Wenn nicht festgelegt, wird keine Verschlüsselung durchgeführt.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Gibt eine Liste nicht kritischer Fehler zurück.

**Returns:**
java.util.List<java.lang.Exception> - Ausnahmeliste
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Gibt den Kompressionstyp zurück, der für alle Bilder im Dokument verwendet werden soll. Standard ist PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Gibt den Wert zurück, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Returns:**
int - Der Wert, der das Kompressionsniveau für ein Bild angibt.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Ermittelt bis zu welcher Ebene die Dokumentenübersicht erweitert werden soll, wenn die PDF-Datei in einem Viewer geöffnet wird. 1 - nur die Elemente der ersten Ebene werden angezeigt, 2 - nur die Elemente der ersten und zweiten Ebene werden angezeigt, usw.

**Returns:**
int - Die Erweiterungsebene des Gliederungsbaums.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Ermittelt die Höhe des zu speichernden Dokumenten-Gliederungsbaums. 0 – der Gliederungsbaum wird nicht konvertiert, 1 – nur die Gliederungselemente der ersten Ebene werden konvertiert, usw. Standard ist 10.

**Returns:**
int - Die Höhe des Gliederungsbaums.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Ermittelt das Array der Seitenzahlen, die gerendert werden sollen.

**Returns:**
int[] - Seitenzahlen.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Liest die Größe der Seite oder des Bildes.

**Returns:**
java.awt.Dimension - Eine Größe der Seite oder des Bildes.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Gibt den Kompressionstyp zurück, der für alle Inhaltsströme außer Bildern verwendet werden soll. Standard ist PdfTextCompression.Flate.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


Bei XPS können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schrift entsprechen. Wenn dieses Flag auf true gesetzt ist, wird der Text solcher XPS‑Elemente in grafische Formen konvertiert. Dann erscheint der eigentliche Text transparent darüber. Dadurch bleibt der Text dieser Elemente auswählbar. Der Nebeneffekt ist jedoch, dass die Ausgabedatei viel größer sein kann als das Original. Wenn dieses Flag auf false gesetzt ist, werden die Zeichen, die als alternative Formen angezeigt werden sollen, durch andere Zeichen ersetzt, die den alternativen Glyphenformen zugeordnet werden. Daher wird der Text, obwohl weiterhin auswählbar, modifiziert und wahrscheinlich unlesbar.

**Returns:**
boolean - Der Flag-Wert.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


Bei XPS können einige Textelemente Verweise auf alternative Glyphenformen enthalten, die keinem Zeichencode in der Schrift entsprechen. Wenn dieses Flag auf true gesetzt ist, wird der Text solcher XPS‑Elemente in grafische Formen konvertiert. Dann erscheint der eigentliche Text transparent darüber. Dadurch bleibt der Text dieser Elemente auswählbar. Der Nebeneffekt ist jedoch, dass die Ausgabedatei viel größer sein kann als das Original. Wenn dieses Flag auf false gesetzt ist, werden die Zeichen, die als alternative Formen angezeigt werden sollen, durch andere Zeichen ersetzt, die den alternativen Glyphenformen zugeordnet werden. Daher wird der Text, obwohl weiterhin auswählbar, modifiziert und wahrscheinlich unlesbar.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Der Flag-Wert. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Legt die Verschlüsselungsdetails fest. Wenn nicht gesetzt, wird keine Verschlüsselung durchgeführt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Die Verschlüsselungsdetails. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Legt den Kompressionstyp fest, der für alle Bilder im Dokument verwendet werden soll. Standard ist PdfImageCompression.Auto.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Der Kompressionstyp. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Legt den Wert fest, der das Kompressionsniveau für ein Bild angibt. Verfügbare Werte sind 0 bis 100. Je niedriger die angegebene Zahl, desto höher die Kompression und damit die geringere Bildqualität. Ein Wert von 0 führt zu einem Bild mit der niedrigsten Qualität, während 100 die höchste Qualität ergibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Der Wert, der das Kompressionsniveau für ein Bild angibt. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Legt fest, bis zu welcher Ebene die Dokumentenübersicht erweitert werden soll, wenn die PDF-Datei in einem Viewer geöffnet wird. 1 - nur die Elemente der ersten Ebene werden angezeigt, 2 - nur die Elemente der ersten und zweiten Ebene werden angezeigt, usw.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Die Erweiterungsebene des Gliederungsbaums. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Legt die Höhe des zu speichernden Dokumentenübersichtsbaums fest. 0 - der Übersichtsbaum wird nicht konvertiert, 1 - nur die Elemente der ersten Ebene werden konvertiert, usw.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Die Höhe des Gliederungsbaums. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Setzt das Array der Seitenzahlen, die gerendert werden sollen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int[] | Anzahl der Seiten. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Legt den Kompressionstyp fest, der für alle Inhaltsströme außer Bildern verwendet werden soll. Standard ist PdfTextCompression.Flate.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Der Kompressionstyp. |

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

