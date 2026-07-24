---
title: "PsConverter"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PsConverter प्लगइन का प्रतिनिधित्व करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

PsConverter प्लगइन का प्रतिनिधित्व करता है।

यह उदाहरण दिखाता है कि PS/EPS फ़ाइल को PDF दस्तावेज़ में कैसे बदलें।

// PsConverter बनाएं PsConverter converter = new PsConverter(); // आउटपुट डेटा प्रकार को फ़ाइल के रूप में सेट करने के लिए PsConverterToPdfOptions ऑब्जेक्ट बनाएं PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // इनपुट फ़ाइल पथ जोड़ें opt.addDataSource(new FileDataSource(inputPath)); // आउटपुट फ़ाइल पथ सेट करें opt.addSaveDataSource(new FileDataSource(outputPath)); // रूपांतरण प्रक्रिया शुरू करें ResultContainer results = converter.process(opt);

यह उदाहरण दिखाता है कि PS/EPS फ़ाइल को फ़ाइल आउटपुट के साथ इमेज में कैसे बदलें।

// PsConverter बनाएं PsConverter converter = new PsConverter(); // JPEG लक्ष्य इमेज फ़ॉर्मेट के साथ PsConverterToImageOptions बनाएं। परिणामी इमेज के लिए डिफ़ॉल्ट फ़ॉर्मेट PNG है। // हम परिणामी इमेज का आकार, रिज़ॉल्यूशन, स्मूदिंग मोड और JPEG परिणाम इमेज फ़ॉर्मेट के लिए JPEG गुणवत्ता स्तर भी सेट कर सकते हैं। PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // इनपुट फ़ाइल पथ जोड़ें opt.addDataSource(new FileDataSource(inputPath)); // यदि इनपुट PS फ़ाइल बहु-पृष्ठीय है तो परिणाम नाम के साथ इमेज फ़ाइलों का सेट होगा: ["outputPath" बिना एक्सटेंशन][पृष्ठसंख्या 0 से शुरू].["outputPath" से एक्सटेंशन] opt.addSaveDataSource(new FileDataSource(outputPath)); // रूपांतरण प्रक्रिया शुरू करें converter.process(opt);

यह उदाहरण दिखाता है कि PS/EPS फ़ाइल को बाइट एरे आउटपुट के साथ इमेज में कैसे बदलें।

बाइट एरे आउटपुट डेटा स्रोत (byte [][]) में प्रत्येक बाइट एरे एक पृष्ठ की इमेज रखता है। इसलिए, एक-पृष्ठीय दस्तावेज़ों के लिए परिणाम में [1][] एरे होगा, जबकि बहु-पृष्ठीय दस्तावेज़ों के लिए परिणाम में [इनपुट PS दस्तावेज़ में पृष्ठों की संख्या][] एरे होगा। // PsConverter बनाएं PsConverter converter = new PsConverter(); // JPEG लक्ष्य इमेज फ़ॉर्मेट के साथ PsConverterToImageOptions बनाएं। परिणामी इमेज के लिए डिफ़ॉल्ट फ़ॉर्मेट PNG है। // हम परिणामी इमेज का आकार, रिज़ॉल्यूशन, स्मूदिंग मोड और JPEG परिणाम इमेज फ़ॉर्मेट के लिए JPEG गुणवत्ता स्तर भी सेट कर सकते हैं। PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // इनपुट फ़ाइल पथ जोड़ें opt.addDataSource(new FileDataSource(inputPath)); // यदि इनपुट PS फ़ाइल बहु-पृष्ठीय है तो परिणाम नाम के साथ इमेज फ़ाइलों का सेट होगा: ["outputPath" बिना एक्सटेंशन][पृष्ठसंख्या 0 से शुरू].["outputPath" से एक्सटेंशन] opt.addSaveDataSource(new ByteArrayDataSource()); // रूपांतरण प्रक्रिया शुरू करें converter.process(opt); // परिणामी बाइट एरे प्राप्त करें byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [dispose()](#dispose--) | IDisposable का कार्यान्वयन। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | निर्दिष्ट पैरामीटरों के साथ PsConverter प्रक्रिया शुरू करता है। |
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


निर्दिष्ट पैरामीटरों के साथ PsConverter प्रक्रिया शुरू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | PsConverter के लिए निर्देशों वाला विकल्प ऑब्जेक्ट। |

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

