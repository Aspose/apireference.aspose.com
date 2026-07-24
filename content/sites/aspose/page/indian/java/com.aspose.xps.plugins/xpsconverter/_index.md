---
title: "XpsConverter"
second_title: "Aspose.Page for Java API संदर्भ"
description: "XpsConverter प्लगइन का प्रतिनिधित्व करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

XpsConverter प्लगइन का प्रतिनिधित्व करता है।

यह उदाहरण दिखाता है कि XPS दस्तावेज़ को PDF दस्तावेज़ में कैसे परिवर्तित किया जाए।

// create XpsConverter XpsConverter converter = new XpsConverter(); // create XpsConverterToPdfOptions object to set output data type as file XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // add input file path opt.addDataSource(new FileDataSource(inputPath)); // set output file path opt.addSaveDataSource(new FileDataSource(outputPath)); // launch conversion process ResultContainer results = converter.process(opt);

यह उदाहरण दिखाता है कि XPS दस्तावेज़ को फ़ाइल आउटपुट के साथ छवि में कैसे परिवर्तित किया जाए।

// create XpsConverter XpsConverter converter = new XpsConverter(); // create XpsConverterToImageOptions with JPEG target image format. The default image format for resulting image is PNG. // Also we can set a size of the resulting image, a resolution, a smoothing mode and JPEG quality level for JPEG resulting image format. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // add input file path opt.addDataSource(new FileDataSource(inputPath)); // if input XPS file is multipaged the results will be a set of image files with name: [\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // launch conversion process converter.process(opt);

यह उदाहरण दिखाता है कि XPS दस्तावेज़ को बाइट एरे आउटपुट के साथ छवि में कैसे परिवर्तित किया जाए।

बाइट एरे आउटपुट डेटा स्रोत (byte [][]) में प्रत्येक बाइट एरे एक पृष्ठ की छवि रखता है। इसलिए, एक-पृष्ठीय दस्तावेज़ों के लिए परिणाम में [1][] एरे होगा, जबकि बहु-पृष्ठीय दस्तावेज़ों के लिए परिणाम में [इनपुट XPS दस्तावेज़ में पृष्ठों की संख्या][] एरे होगा। // create XpsConverter XpsConverter converter = new XpsConverter(); // create XpsConverterToImageOptions with JPEG target image format. The default image format for resulting image is PNG. // Also we can set a size of the resulting image, a resolution, a smoothing mode and JPEG quality level for JPEG resulting image format. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // add input file path opt.addDataSource(new FileDataSource(inputPath)); // if input XPS file is multipaged the results will be a set of image files with name: [\"outputPath\" without extension][pageNumber started from 1].[extension from \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // launch conversion process converter.process(opt); // get resulting bytes arrays byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [dispose()](#dispose--) | IDisposable का कार्यान्वयन। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | निर्दिष्ट पैरामीटरों के साथ XpsConverter प्रोसेसिंग शुरू करता है। |
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


IDisposable का कार्यान्वयन।

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
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


निर्दिष्ट पैरामीटरों के साथ XpsConverter प्रोसेसिंग शुरू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | XpsConverter के लिए निर्देशों वाला एक विकल्प वस्तु। |

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
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

