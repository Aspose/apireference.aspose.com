---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API संदर्भ"
description: "यह क्लास रूपांतरण प्रक्रिया को प्रबंधित करने के लिए आवश्यक विकल्पों को सम्मिलित करती है।"
type: docs
weight: 11
url: /hi/java/com.aspose.eps.device/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

यह क्लास रूपांतरण प्रक्रिया को प्रबंधित करने के लिए आवश्यक विकल्पों को सम्मिलित करती है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग suppressErrors (true) और debug (false) के लिए डिफ़ॉल्ट मान हों। |
| [PdfSaveOptions(boolean supressErrors)](#PdfSaveOptions-boolean-) | PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग debug (false) के लिए डिफ़ॉल्ट मान हों। |
| [PdfSaveOptions(Dimension size)](#PdfSaveOptions-java.awt.Dimension-) | PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें पृष्ठ का आकार हो। |
| [PdfSaveOptions(boolean supressErrors, Dimension size)](#PdfSaveOptions-boolean-java.awt.Dimension-) | PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग debug (false) और पृष्ठ का आकार के लिए डिफ़ॉल्ट मान हों। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | फ़्लैग प्राप्त करता है जो दर्शाता है कि गैर-TrueType फ़ॉन्ट को TTF में सहेजना आवश्यक है या नहीं। |
| [getExceptions()](#getExceptions--) | गैर-आवश्यक त्रुटियों की सूची लौटाता है। |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। |
| [getSize()](#getSize--) | पृष्ठ या छवि का आकार प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग प्राप्त करता है। |
| [isSupressErrors()](#isSupressErrors--) | कनवर्ज़न के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | गैर-TrueType फ़ॉन्ट को TTF में सहेजना है या नहीं, यह निर्दिष्ट करता है। |
| [setDebug(boolean debug)](#setDebug-boolean-) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग निर्दिष्ट करता है। |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | पृष्ठ या छवि का आकार निर्दिष्ट करता है। |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग suppressErrors (true) और debug (false) के लिए डिफ़ॉल्ट मान हों।

### PdfSaveOptions(boolean supressErrors) {#PdfSaveOptions-boolean-}
```
public PdfSaveOptions(boolean supressErrors)
```


PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग debug (false) के लिए डिफ़ॉल्ट मान हों।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| supressErrors | boolean | यदि सत्य है, तो गैर‑महत्वपूर्ण त्रुटियों के बावजूद परिवर्तन जारी रहेगा। |

### PdfSaveOptions(Dimension size) {#PdfSaveOptions-java.awt.Dimension-}
```
public PdfSaveOptions(Dimension size)
```


PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें पृष्ठ का आकार हो।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | पृष्ठ का आकार। |

### PdfSaveOptions(boolean supressErrors, Dimension size) {#PdfSaveOptions-boolean-java.awt.Dimension-}
```
public PdfSaveOptions(boolean supressErrors, Dimension size)
```


PdfSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग debug (false) और पृष्ठ का आकार के लिए डिफ़ॉल्ट मान हों।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| supressErrors | boolean | यदि सत्य है, तो गैर‑महत्वपूर्ण त्रुटियों के बावजूद परिवर्तन जारी रहेगा। |
| आकार | java.awt.Dimension | पृष्ठ का आकार। |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


फ़्लैग प्राप्त करता है जो दर्शाता है कि गैर-TrueType फ़ॉन्ट को TTF में सहेजना आवश्यक है या नहीं।

**Returns:**
boolean - फ़्लैग मान।
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
### getSize() {#getSize--}
```
public Dimension getSize()
```


पृष्ठ या छवि का आकार प्राप्त करता है।

**Returns:**
java.awt.Dimension - पृष्ठ या छवि का आकार।
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


निर्दिष्ट करता है कि गैर‑TrueType फ़ॉन्ट्स को TTF में सहेजा जाए या नहीं। यह PS से PDF रूपांतरण में उत्पन्न दस्तावेज़ के आकार को काफी घटाता है और गैर‑TrueType फ़ॉन्ट्स में बड़ी मात्रा में पाठ वाले PS फ़ाइलों के किसी भी आउटपुट फ़ॉर्मेट में रूपांतरण की गति बढ़ाता है। हालांकि, PostSctipt फ़ाइल को छवि में बदलते समय पाठ में थोड़ा ऊर्ध्वाधर शिफ्ट होता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | फ़्लैग मान। |

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

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


पृष्ठ या छवि का आकार निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | पृष्ठ या छवि का आकार। |

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

