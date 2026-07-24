---
title: "XpsConverter"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt das XpsConverter‑Plugin dar."
type: docs
weight: 10
url: /de/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Stellt das XpsConverter‑Plugin dar.

Das Beispiel zeigt, wie ein XPS-Dokument in ein PDF-Dokument konvertiert wird.

// XpsConverter erstellen XpsConverter converter = new XpsConverter(); // XpsConverterToPdfOptions-Objekt erstellen, um den Ausgabetyp als Datei festzulegen XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // Eingabedateipfad hinzufügen opt.addDataSource(new FileDataSource(inputPath)); // Ausgabedateipfad festlegen opt.addSaveDataSource(new FileDataSource(outputPath)); // Konvertierungsprozess starten ResultContainer results = converter.process(opt);

Das Beispiel zeigt, wie ein XPS-Dokument in ein Bild mit Dateiausgabe konvertiert wird.

// XpsConverter erstellen XpsConverter converter = new XpsConverter(); // XpsConverterToImageOptions mit JPEG-Zielbildformat erstellen. Das Standardbildformat für das resultierende Bild ist PNG. // Außerdem können wir Größe, Auflösung, Glättungsmodus und JPEG-Qualitätsstufe für das JPEG‑Bildformat festlegen. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // Eingabedateipfad hinzufügen opt.addDataSource(new FileDataSource(inputPath)); // Wenn die Eingabe‑XPS‑Datei mehrseitig ist, werden die Ergebnisse als Satz von Bilddateien mit Namen: [\"outputPath\" ohne Erweiterung][Seitenzahl beginnend bei 0].[Erweiterung von \"outputPath\"] gespeichert opt.addSaveDataSource(new FileDataSource(outputPath)); // Konvertierungsprozess starten converter.process(opt);

Das Beispiel zeigt, wie ein XPS-Dokument in ein Bild mit Byte‑Array‑Ausgabe konvertiert wird.

Im Byte‑Array‑Ausgabedatenquelle (byte[][]) enthält ein Byte‑Array ein Bild einer Seite. Daher enthält das Ergebnis bei einseitigen Dokumenten ein [1][]‑Array, bei mehrseitigen Dokumenten ein [Anzahl der Seiten im Eingabe‑XPS‑Dokument][]‑Array. // XpsConverter erstellen XpsConverter converter = new XpsConverter(); // XpsConverterToImageOptions mit JPEG-Zielbildformat erstellen. Das Standardbildformat für das resultierende Bild ist PNG. // Außerdem können wir Größe, Auflösung, Glättungsmodus und JPEG‑Qualitätsstufe für das JPEG‑Bildformat festlegen. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // Eingabedateipfad hinzufügen opt.addDataSource(new FileDataSource(inputPath)); // Wenn die Eingabe‑XPS‑Datei mehrseitig ist, werden die Ergebnisse als Satz von Bilddateien mit Namen: [\"outputPath\" ohne Erweiterung][Seitenzahl beginnend bei 1].[Erweiterung von \"outputPath\"] gespeichert opt.addSaveDataSource(new ByteArrayDataSource()); // Konvertierungsprozess starten converter.process(opt); // resultierende Byte‑Arrays erhalten byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [dispose()](#dispose--) | Implementierung von IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Startet die XpsConverter‑Verarbeitung mit den angegebenen Parametern. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


Implementierung von IDisposable.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Startet die XpsConverter‑Verarbeitung mit den angegebenen Parametern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Ein Optionsobjekt, das Anweisungen für den XpsConverter enthält. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

