---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page for Java API संदर्भ"
description: "प्लगइन के लिए XPS से PDF कनवर्टर विकल्पों को दर्शाता है।"
type: docs
weight: 13
url: /hi/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

[XpsConverter](../../com.aspose.xps.plugins/xpsconverter) प्लगइन के लिए XPS से PDF कनवर्टर विकल्पों को दर्शाता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) ऑब्जेक्ट का नया उदाहरण आरंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | XpsConverter प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | XpsConverterOptions प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | XpsConverterOptions प्लगइन डेटा संग्रह लौटाता है। |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। |
| [getOperationName()](#getOperationName--) | ऑपरेशन नाम लौटाता है। |
| [getPageNumbers()](#getPageNumbers--) | परिवर्तित करने के लिए XPS दस्तावेज़ में पृष्ठों की संख्याओं की सरणी प्राप्त करता है। |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | सहेजने के संचालन परिणामों के लिए जोड़े गए लक्ष्यों का संग्रह प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | परिवर्तित करने के लिए XPS दस्तावेज़ में पृष्ठों की संख्याओं की सरणी सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


[XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions) ऑब्जेक्ट का नया उदाहरण आरंभ करता है।

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


XpsConverter प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | जोड़ने के लिए डेटा स्रोत। |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


XpsConverterOptions प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | सहेजने के संचालन परिणामों के लिए डेटा स्रोत (फ़ाइल या स्ट्रीम)। |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


XpsConverterOptions प्लगइन डेटा संग्रह लौटाता है।

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Returns:**
int - छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान।
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


ऑपरेशन नाम लौटाता है।

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


परिवर्तित करने के लिए XPS दस्तावेज़ में पृष्ठों की संख्याओं की सरणी प्राप्त करता है।

**Returns:**
int[] - XPS दस्तावेज़ में पृष्ठों की संख्याओं की सरणी।
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


सहेजने के संचालन परिणामों के लिए जोड़े गए लक्ष्यों का संग्रह प्राप्त करता है।

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान। |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


परिवर्तित करने के लिए XPS दस्तावेज़ में पृष्ठों की संख्याओं की सरणी सेट करता है। यदि सेट नहीं किया गया तो सभी पृष्ठ परिवर्तित किए जाएंगे।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pageNumbers | int[] | XPS दस्तावेज़ में पृष्ठों की संख्याओं की एक सरणी। |

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

