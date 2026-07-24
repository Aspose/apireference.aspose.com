---
title: "XpsConverter"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar XpsConverter-plugin."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Representerar XpsConverter-plugin.

Exemplet visar hur man konverterar ett XPS‑dokument till ett PDF‑dokument.

// skapa XpsConverter XpsConverter converter = new XpsConverter(); // skapa XpsConverterToPdfOptions‑objekt för att ange utdata typ som fil XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // lägg till indatafilens sökväg opt.addDataSource(new FileDataSource(inputPath)); // ange utdatafilens sökväg opt.addSaveDataSource(new FileDataSource(outputPath)); // starta konverteringsprocessen ResultContainer results = converter.process(opt);

Exemplet visar hur man konverterar ett XPS‑dokument till en bild med filutdata.

// skapa XpsConverter XpsConverter converter = new XpsConverter(); // skapa XpsConverterToImageOptions med JPEG som målformat för bild. Standardbildformatet för den resulterande bilden är PNG. // Vi kan också ange storlek på den resulterande bilden, en upplösning, ett utjämningsläge och JPEG‑kvalitetsnivå för JPEG‑resultatformatet. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // lägg till indatafilens sökväg opt.addDataSource(new FileDataSource(inputPath)); // om indata‑XPS‑filen är flersidig kommer resultaten att vara en uppsättning bildfiler med namn: [\"outputPath\" utan filändelse][pageNumber startar från 0].[extension från \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // starta konverteringsprocessen converter.process(opt);

Exemplet visar hur man konverterar ett XPS‑dokument till en bild med byte‑array‑utdata.

I byte‑array‑utdata‑datasource (byte [][]) innehåller en byte‑array en bild av en sida. Således kommer resultatet för en‑sidiga dokument att innehålla en [1][]‑array, för flersidiga dokument kommer resultatet att innehålla en [antal sidor i indata‑XPS‑dokument][]‑array. // skapa XpsConverter XpsConverter converter = new XpsConverter(); // skapa XpsConverterToImageOptions med JPEG som målformat för bild. Standardbildformatet för den resulterande bilden är PNG. // Vi kan också ange storlek på den resulterande bilden, en upplösning, ett utjämningsläge och JPEG‑kvalitetsnivå för JPEG‑resultatformatet. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // lägg till indatafilens sökväg opt.addDataSource(new FileDataSource(inputPath)); // om indata‑XPS‑filen är flersidig kommer resultaten att vara en uppsättning bildfiler med namn: [\"outputPath\" utan filändelse][pageNumber startar från 1].[extension från \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // starta konverteringsprocessen converter.process(opt); // hämta resulterande byte‑arrayer byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [dispose()](#dispose--) | Implementering av IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Startar XpsConverter‑bearbetningen med de angivna parametrarna. |
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


Implementering av IDisposable.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Startar XpsConverter‑bearbetningen med de angivna parametrarna.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Ett alternativobjekt som innehåller instruktioner för XpsConverter. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

