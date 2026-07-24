---
title: "PsConverterToPdfOptions"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PS/EPS को PDF में बदलने वाले कनवर्टर विकल्पों का प्रतिनिधित्व करता है प्लगइन के लिए।"
type: docs
weight: 13
url: /hi/java/com.aspose.eps.plugins/psconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToPdfOptions extends PsConverterOptions
```

PS/EPS को PDF में बदलने वाले कनवर्टर विकल्पों का प्रतिनिधित्व करता है [PsConverter](../../com.aspose.eps.plugins/psconverter) प्लगइन के लिए।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PsConverterToPdfOptions()](#PsConverterToPdfOptions--) | नए [PsConverterToPdfOptions](../../com.aspose.eps.plugins/psconvertertopdfoptions) ऑब्जेक्ट का नया उदाहरण प्रारंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | PsConverter प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | PsConverterOptions प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | PsConverterOptions प्लगइन डेटा संग्रह को लौटाता है। |
| [getExceptions()](#getExceptions--) | गैर-आवश्यक त्रुटियों की सूची लौटाता है। |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। |
| [getOperationName()](#getOperationName--) | ऑपरेशन नाम लौटाता है। |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | सहेजने के संचालन परिणामों के लिए जोड़े गए लक्ष्यों का संग्रह प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग प्राप्त करता है। |
| [isSupressErrors()](#isSupressErrors--) | कनवर्ज़न के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। |
| [setDebug(boolean debug)](#setDebug-boolean-) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग निर्दिष्ट करता है। |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToPdfOptions() {#PsConverterToPdfOptions--}
```
public PsConverterToPdfOptions()
```


नए [PsConverterToPdfOptions](../../com.aspose.eps.plugins/psconvertertopdfoptions) ऑब्जेक्ट का नया उदाहरण प्रारंभ करता है।

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


PsConverter प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | जोड़ने के लिए डेटा स्रोत। |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


PsConverterOptions प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है।

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। डिफ़ॉल्ट फ़ोल्डर वह मानक फ़ॉन्ट फ़ोल्डर है जहाँ OS आंतरिक आवश्यकताओं के लिए फ़ॉन्ट खोजता है।

**Returns:**
java.lang.String[] - फ़ॉन्ट फ़ोल्डरों की एक सरणी।
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


PsConverterOptions प्लगइन डेटा संग्रह को लौटाता है।

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


गैर-आवश्यक त्रुटियों की सूची लौटाता है।

**Returns:**
java.util.List<java.lang.Exception> - अपवादों की सूची
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
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग प्राप्त करता है।

**Returns:**
boolean - डिबग मान।
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


कनवर्ज़न के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाला मान लौटाता है।

**Returns:**
boolean - बूलियन मान
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। डिफ़ॉल्ट फ़ोल्डर वह मानक फ़ॉन्ट फ़ोल्डर है जहाँ OS आंतरिक आवश्यकताओं के लिए फ़ॉन्ट खोजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | फ़ॉन्ट फ़ोल्डरों की एक सरणी। |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| debug | boolean | बूलियन मान। |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान। |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| supressErrors | boolean | बूलियन मान। |

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

