---
title: "PsConverter"
second_title: "Aspose.Page för Java API-referens"
description: "Representerar PsConverter‑plugin."
type: docs
weight: 10
url: /sv/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Representerar PsConverter‑plugin.

Exemplet visar hur man konverterar en PS/EPS‑fil till ett PDF‑dokument.

// skapa PsConverter PsConverter converter = new PsConverter(); // skapa PsConverterToPdfOptions‑objekt för att ange utdataformat som fil PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // lägg till indatafilens sökväg opt.addDataSource(new FileDataSource(inputPath)); // ange utdatafilens sökväg opt.addSaveDataSource(new FileDataSource(outputPath)); // starta konverteringsprocessen ResultContainer results = converter.process(opt);

Exemplet visar hur man konverterar en PS/EPS‑fil till en bild med filutdata.

// skapa PsConverter PsConverter converter = new PsConverter(); // skapa PsConverterToImageOptions med JPEG‑målformat. Standardformatet för den resulterande bilden är PNG. // Vi kan också ange storleken på den resulterande bilden, en upplösning, ett utjämningsläge och JPEG‑kvalitetsnivå för JPEG‑formatet. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // lägg till indatafilens sökväg opt.addDataSource(new FileDataSource(inputPath)); // om indata‑PS‑filen är flersidig kommer resultaten att vara en uppsättning bildfiler med namn: [\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // starta konverteringsprocessen converter.process(opt);

Exemplet visar hur man konverterar en PS/EPS‑fil till en bild med byte‑array‑utdata.

I byte‑array‑utdatakällan (byte [][]) innehåller varje byte‑array en bild av en sida. Således kommer resultatet för ensidiga dokument att innehålla [1][]‑array, för flersidiga dokument kommer resultatet att innehålla [antal sidor i indata‑PS‑dokument][]‑array. // skapa PsConverter PsConverter converter = new PsConverter(); // skapa PsConverterToImageOptions med JPEG‑målformat. Standardformatet för den resulterande bilden är PNG. // Vi kan också ange storleken på den resulterande bilden, en upplösning, ett utjämningsläge och JPEG‑kvalitetsnivå för JPEG‑formatet. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // lägg till indatafilens sökväg opt.addDataSource(new FileDataSource(inputPath)); // om indata‑PS‑filen är flersidig kommer resultaten att vara en uppsättning bildfiler med namn: [\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // starta konverteringsprocessen converter.process(opt); // hämta resulterande byte‑arrayer byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [dispose()](#dispose--) | Implementering av IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Startar PsConverter‑bearbetningen med de angivna parametrarna. |
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


Startar PsConverter‑bearbetningen med de angivna parametrarna.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Ett alternativobjekt som innehåller instruktioner för PsConverter. |

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

