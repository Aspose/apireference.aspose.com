---
title: "XpsConverter"
second_title: "Aspose.Page voor Java API-referentie"
description: "Stelt de XpsConverter-plug-in voor."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Stelt de XpsConverter-plug-in voor.

Het voorbeeld toont hoe een XPS‑document naar een PDF‑document kan worden geconverteerd.

// maak XpsConverter aan XpsConverter converter = new XpsConverter(); // maak XpsConverterToPdfOptions‑object aan om het uitvoer‑datatype in te stellen als bestand XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // voeg invoer‑bestandspad toe opt.addDataSource(new FileDataSource(inputPath)); // stel uitvoer‑bestandspad in opt.addSaveDataSource(new FileDataSource(outputPath)); // start conversie‑proces ResultContainer results = converter.process(opt);

Het voorbeeld toont hoe een XPS‑document naar een afbeelding met bestandsuitvoer kan worden geconverteerd.

// maak XpsConverter aan XpsConverter converter = new XpsConverter(); // maak XpsConverterToImageOptions aan met JPEG‑doelafbeeldingsformaat. Het standaardafbeeldingsformaat voor de resulterende afbeelding is PNG. // We kunnen ook een grootte van de resulterende afbeelding, een resolutie, een vervagingsmodus en JPEG‑kwaliteitsniveau voor het JPEG‑resulterende afbeeldingsformaat instellen. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // voeg invoer‑bestandspad toe opt.addDataSource(new FileDataSource(inputPath)); // als het invoer‑XPS‑bestand meerdere pagina's heeft, zullen de resultaten een set afbeeldingsbestanden zijn met de naam: ["outputPath" zonder extensie][pageNumber beginnend bij 0].[extensie van "outputPath"] opt.addSaveDataSource(new FileDataSource(outputPath)); // start conversie‑proces converter.process(opt);

Het voorbeeld toont hoe een XPS‑document naar een afbeelding met bytes‑array‑uitvoer kan worden geconverteerd.

In de bytes‑array‑uitvoer‑datasource (byte [][]) bevat één bytes‑array een afbeelding van één pagina. Dus, voor één‑pagina‑documenten zal het resultaat een [1][]‑array bevatten, voor documenten met meerdere pagina's zal het resultaat een [aantal pagina's in invoer‑XPS‑document][]‑array bevatten. // maak XpsConverter aan XpsConverter converter = new XpsConverter(); // maak XpsConverterToImageOptions aan met JPEG‑doelafbeeldingsformaat. Het standaardafbeeldingsformaat voor de resulterende afbeelding is PNG. // We kunnen ook een grootte van de resulterende afbeelding, een resolutie, een vervagingsmodus en JPEG‑kwaliteitsniveau voor het JPEG‑resulterende afbeeldingsformaat instellen. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // voeg invoer‑bestandspad toe opt.addDataSource(new FileDataSource(inputPath)); // als het invoer‑XPS‑bestand meerdere pagina's heeft, zullen de resultaten een set afbeeldingsbestanden zijn met de naam: ["outputPath" zonder extensie][pageNumber beginnend bij 1].[extensie van "outputPath"] opt.addSaveDataSource(new ByteArrayDataSource()); // start conversie‑proces converter.process(opt); // haal resulterende bytes‑arrays op byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [dispose()](#dispose--) | Implementatie van IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Start de XpsConverter-verwerking met de opgegeven parameters. |
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


Start de XpsConverter-verwerking met de opgegeven parameters.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Een optieregelobject dat instructies bevat voor de XpsConverter. |

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

