---
title: "PsConverter"
second_title: "Aspose.Page for Java API-Referenz"
description: "Stellt das PsConverter‑Plugin dar."
type: docs
weight: 10
url: /de/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Stellt das PsConverter‑Plugin dar.

Das Beispiel zeigt, wie man eine PS/EPS-Datei in ein PDF-Dokument konvertiert.

// erstelle PsConverter PsConverter converter = new PsConverter(); // erstelle PsConverterToPdfOptions-Objekt, um den Ausgabetyp als Datei festzulegen PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // füge Eingabedateipfad hinzu opt.addDataSource(new FileDataSource(inputPath)); // setze Ausgabedateipfad opt.addSaveDataSource(new FileDataSource(outputPath)); // starte den Konvertierungsprozess ResultContainer results = converter.process(opt);

Das Beispiel zeigt, wie man eine PS/EPS-Datei in ein Bild mit Dateiausgabe konvertiert.

// erstelle PsConverter PsConverter converter = new PsConverter(); // erstelle PsConverterToImageOptions mit JPEG-Zielbildformat. Das Standardbildformat für das resultierende Bild ist PNG. // Außerdem können wir eine Größe des resultierenden Bildes, eine Auflösung, einen Glättungsmodus und den JPEG-Qualitätsgrad für das JPEG-Resultatformat festlegen. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // füge Eingabedateipfad hinzu opt.addDataSource(new FileDataSource(inputPath)); // falls die Eingabe-PS-Datei mehrseitig ist, ergeben sich die Ergebnisse als Satz von Bilddateien mit dem Namen: [\"outputPath\" ohne Erweiterung][Seitenzahl beginnend bei 0].[Erweiterung von \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // starte den Konvertierungsprozess converter.process(opt);

Das Beispiel zeigt, wie man eine PS/EPS-Datei in ein Bild mit Byte-Array-Ausgabe konvertiert.

Im Datenquellenoutput für Byte-Arrays (byte [][]) enthält ein Byte-Array ein Bild einer Seite. Daher enthält das Ergebnis bei einseitigen Dokumenten ein [1][]‑Array, bei mehrseitigen Dokumenten ein [Anzahl der Seiten im Eingabe‑PS‑Dokument][]‑Array. // erstelle PsConverter PsConverter converter = new PsConverter(); // erstelle PsConverterToImageOptions mit JPEG-Zielbildformat. Das Standardbildformat für das resultierende Bild ist PNG. // Außerdem können wir eine Größe des resultierenden Bildes, eine Auflösung, einen Glättungsmodus und den JPEG-Qualitätsgrad für das JPEG-Resultatformat festlegen. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // füge Eingabedateipfad hinzu opt.addDataSource(new FileDataSource(inputPath)); // falls die Eingabe-PS-Datei mehrseitig ist, ergeben sich die Ergebnisse als Satz von Bilddateien mit dem Namen: [\"outputPath\" ohne Erweiterung][Seitenzahl beginnend bei 0].[Erweiterung von \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // starte den Konvertierungsprozess converter.process(opt); // erhalte resultierende Byte-Arrays byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [dispose()](#dispose--) | Implementierung von IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Startet die PsConverter-Verarbeitung mit den angegebenen Parametern. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
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


Startet die PsConverter-Verarbeitung mit den angegebenen Parametern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Ein Optionsobjekt, das Anweisungen für den PsConverter enthält. |

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

