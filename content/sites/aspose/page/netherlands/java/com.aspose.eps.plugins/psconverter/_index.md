---
title: "PsConverter"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt de PsConverter-plug-in voor."
type: docs
weight: 10
url: /nl/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Stelt de PsConverter-plug-in voor.

Het voorbeeld toont hoe een PS/EPS-bestand naar een PDF-document kan worden geconverteerd.

// maak PsConverter PsConverter converter = new PsConverter(); // maak PsConverterToPdfOptions-object om het uitvoertype in te stellen als bestand PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // voeg invoerbestandspad toe opt.addDataSource(new FileDataSource(inputPath)); // stel uitvoerbestandspad in opt.addSaveDataSource(new FileDataSource(outputPath)); // start conversieproces ResultContainer results = converter.process(opt);

Het voorbeeld toont hoe een PS/EPS-bestand naar een afbeelding kan worden geconverteerd met bestandsuitvoer.

// maak PsConverter PsConverter converter = new PsConverter(); // maak PsConverterToImageOptions met JPEG-doelafbeeldingsformaat. Het standaardafbeeldingsformaat voor de resulterende afbeelding is PNG. // We kunnen ook een grootte van de resulterende afbeelding, een resolutie, een anti-aliasingmodus en JPEG-kwaliteitsniveau voor het JPEG-resulterende afbeeldingsformaat instellen. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // voeg invoerbestandspad toe opt.addDataSource(new FileDataSource(inputPath)); // als het invoer-PS-bestand meerdere pagina's heeft, zullen de resultaten een reeks afbeeldingsbestanden zijn met de naam: ["outputPath" zonder extensie][paginaNummer beginnend bij 0].[extensie van "outputPath"]; opt.addSaveDataSource(new FileDataSource(outputPath)); // start conversieproces converter.process(opt);

Het voorbeeld toont hoe een PS/EPS-bestand naar een afbeelding kan worden geconverteerd met bytes-array-uitvoer.

In de bytes-array-uitvoer‑datasource (byte [][]) bevat één bytes-array een afbeelding van één pagina. Dus voor één‑pagina‑documenten zal het resultaat een [1][]‑array bevatten, voor documenten met meerdere pagina's zal het resultaat een [aantal pagina's in het invoer‑PS‑document][]‑array bevatten. // maak PsConverter PsConverter converter = new PsConverter(); // maak PsConverterToImageOptions met JPEG-doelafbeeldingsformaat. Het standaardafbeeldingsformaat voor de resulterende afbeelding is PNG. // We kunnen ook een grootte van de resulterende afbeelding, een resolutie, een anti‑aliasingmodus en JPEG‑kwaliteitsniveau voor het JPEG‑resulterende afbeeldingsformaat instellen. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // voeg invoerbestandspad toe opt.addDataSource(new FileDataSource(inputPath)); // als het invoer‑PS‑bestand meerdere pagina's heeft, zullen de resultaten een reeks afbeeldingsbestanden zijn met de naam: ["outputPath" zonder extensie][paginaNummer beginnend bij 0].[extensie van "outputPath"]; opt.addSaveDataSource(new ByteArrayDataSource()); // start conversieproces converter.process(opt); // haal de resulterende bytes‑arrays op byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [dispose()](#dispose--) | Implementatie van IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Start de PsConverter-verwerking met de opgegeven parameters. |
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


Implementatie van IDisposable.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Start de PsConverter-verwerking met de opgegeven parameters.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Een optiesobject dat instructies voor de PsConverter bevat. |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

