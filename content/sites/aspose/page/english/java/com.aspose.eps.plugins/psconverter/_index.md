---
title: PsConverter
second_title: Aspose.Page for Java API Reference
description: Represents PsConverter plugin.
type: docs
weight: 10
url: /java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Represents PsConverter plugin.

The example demonstrates how to convert PS/EPS file to PDF document.

// create PsConverter PsConverter converter = new PsConverter(); // create PsConverterToPdfOptions object to set output data type as file PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // add input file path opt.addDataSource(new FileDataSource(inputPath)); // set output file path opt.addSaveDataSource(new FileDataSource(outputPath)); // launch conversion process ResultContainer results = converter.process(opt);

The example demonstrates how to convert PS/EPS file to image with file output.

// create PsConverter PsConverter converter = new PsConverter(); // create PsConverterToImageOptions with JPEG target image format. The default image format for resulting image is PNG. // Also we can set a size of the resulting image, a resolution, a smoothing mode and JPEG quality level for JPEG resulting image format. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // add input file path opt.addDataSource(new FileDataSource(inputPath)); // if input PS file is multipaged the results will be a set of image files with name: ["outputPath" without extension][pageNumber started from 0].[extension from "outputPath"] opt.addSaveDataSource(new FileDataSource(outputPath)); // launch conversion process converter.process(opt);

The example demonstrates how to convert PS/EPS file to image with bytes arrays output.

In the bytes arrays output datasource (byte [][]) one bytes array contains an image of one page. Thus, for one-paged documents the result will contain [1][] array, for multi-paged documents the result will contain [number of pages in input PS document][] array. // create PsConverter PsConverter converter = new PsConverter(); // create PsConverterToImageOptions with JPEG target image format. The default image format for resulting image is PNG. // Also we can set a size of the resulting image, a resolution, a smoothing mode and JPEG quality level for JPEG resulting image format. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // add input file path opt.addDataSource(new FileDataSource(inputPath)); // if input PS file is multipaged the results will be a set of image files with name: ["outputPath" without extension][pageNumber started from 0].[extension from "outputPath"] opt.addSaveDataSource(new ByteArrayDataSource()); // launch conversion process converter.process(opt); // get resulting bytes arrays byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Constructors

| Constructor | Description |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Methods

| Method | Description |
| --- | --- |
| [dispose()](#dispose--) | Implementation of IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Starts the PsConverter processing with the specified parameters. |
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


Implementation of IDisposable.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


Starts the PsConverter processing with the specified parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | An options object containing instructions for the PsConverter. |

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

