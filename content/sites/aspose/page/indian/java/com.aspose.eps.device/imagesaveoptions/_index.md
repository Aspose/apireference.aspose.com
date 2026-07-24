---
title: "ImageSaveOptions"
second_title: "Aspose.Page for Java API संदर्भ"
description: "यह क्लास रूपांतरण प्रक्रिया को प्रबंधित करने के लिए आवश्यक विकल्पों को सम्मिलित करती है।"
type: docs
weight: 10
url: /hi/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

यह क्लास रूपांतरण प्रक्रिया को प्रबंधित करने के लिए आवश्यक विकल्पों को सम्मिलित करती है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | ImageSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग suppressErrors (true) और debug (false) के लिए डिफ़ॉल्ट मान हों। |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज फ़ॉर्मेट के साथ प्रारंभ करता है। |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार के साथ प्रारंभ करता है। |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार और इमेज फ़ॉर्मेट के साथ प्रारंभ करता है। |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज फ़ॉर्मेट और suppressErrors फ़्लैग के साथ प्रारंभ करता है। |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार और suppressErrors फ़्लैग के साथ प्रारंभ करता है। |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार, इमेज फ़ॉर्मेट और suppressErrors फ़्लैग के साथ प्रारंभ करता है। |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | ImageSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग debug (false) के लिए डिफ़ॉल्ट मान हों। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | फ़्लैग प्राप्त करता है जो दर्शाता है कि गैर-TrueType फ़ॉन्ट को TTF में सहेजना आवश्यक है या नहीं। |
| [getExceptions()](#getExceptions--) | गैर-आवश्यक त्रुटियों की सूची लौटाता है। |
| [getImageFormat()](#getImageFormat--) | परिणामी इमेज के लिए इमेज फ़ॉर्मेट प्राप्त करता है। |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। |
| [getResolution()](#getResolution--) | परिणामी इमेज का रिज़ॉल्यूशन लौटाता है। |
| [getSize()](#getSize--) | पृष्ठ या छवि का आकार प्राप्त करता है। |
| [getSmoothingMode()](#getSmoothingMode--) | स्मूदिंग मोड प्राप्त करता है। |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | निर्देशित करता है कि लाइब्रेरी इमेज फ्रैगमेंट्स को जोड़ने की कोशिश करेगी या नहीं। |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग प्राप्त करता है। |
| [isSupressErrors()](#isSupressErrors--) | कनवर्ज़न के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | गैर-TrueType फ़ॉन्ट को TTF में सहेजना है या नहीं, यह निर्दिष्ट करता है। |
| [setDebug(boolean debug)](#setDebug-boolean-) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग निर्दिष्ट करता है। |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | परिणामी इमेज के लिए इमेज फ़ॉर्मेट निर्दिष्ट करता है। |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [setResolution(float resolution)](#setResolution-float-) | परिणामी इमेज का रिज़ॉल्यूशन निर्दिष्ट करता है। |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | पृष्ठ या छवि का आकार निर्दिष्ट करता है। |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | स्मूदिंग मोड सेट करता है। |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है। |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | निर्दिष्ट करता है कि लाइब्रेरी को इमेज फ्रैगमेंट्स को जोड़ने की कोशिश करनी चाहिए या नहीं। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


ImageSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग suppressErrors (true) और debug (false) के लिए डिफ़ॉल्ट मान हों।

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज फ़ॉर्मेट के साथ प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | इमेज का फ़ॉर्मेट। |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार के साथ प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | इमेज का आकार। |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार और इमेज फ़ॉर्मेट के साथ प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | इमेज का आकार। |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | इमेज का फ़ॉर्मेट। |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज फ़ॉर्मेट और suppressErrors फ़्लैग के साथ प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | इमेज का फ़ॉर्मेट। |
| supressErrors | boolean | यदि सत्य है, तो गैर‑महत्वपूर्ण त्रुटियों के बावजूद परिवर्तन जारी रहेगा। |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार और suppressErrors फ़्लैग के साथ प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | इमेज का आकार। |
| supressErrors | boolean | यदि सत्य है, तो गैर‑महत्वपूर्ण त्रुटियों के बावजूद परिवर्तन जारी रहेगा। |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


ImageSaveOptions का नया उदाहरण निर्दिष्ट इमेज आकार, इमेज फ़ॉर्मेट और suppressErrors फ़्लैग के साथ प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | इमेज का आकार। |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | इमेज का फ़ॉर्मेट। |
| supressErrors | boolean | यदि सत्य है, तो गैर‑महत्वपूर्ण त्रुटियों के बावजूद परिवर्तन जारी रहेगा। |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


ImageSaveOptions क्लास का नया उदाहरण प्रारंभ करें जिसमें फ़्लैग debug (false) के लिए डिफ़ॉल्ट मान हों।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| supressErrors | boolean | यदि सत्य है, तो गैर‑महत्वपूर्ण त्रुटियों के बावजूद परिवर्तन जारी रहेगा। |

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


परिणामी इमेज के लिए इमेज फ़ॉर्मेट प्राप्त करता है।

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Returns:**
int - छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान।
### getResolution() {#getResolution--}
```
public float getResolution()
```


परिणामी इमेज का रिज़ॉल्यूशन लौटाता है।

**Returns:**
float - इमेज का रिज़ॉल्यूशन।
### getSize() {#getSize--}
```
public Dimension getSize()
```


पृष्ठ या छवि का आकार प्राप्त करता है।

**Returns:**
java.awt.Dimension - पृष्ठ या छवि का आकार।
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


स्मूदिंग मोड प्राप्त करता है।

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


इसे दर्शाता है कि लाइब्रेरी इमेज फ्रैगमेंट्स को जोड़ने की कोशिश करेगी या नहीं। यह तब उपयोग किया जाता है जब स्रोत PS/EPS फ़ाइल में इमेज को फ्रैगमेंट्स में काटा गया हो। इस स्थिति में इस फ़्लैग के बिना फ्रैगमेंट्स के बीच पतले अंतराल रह जाते हैं।

**Returns:**
boolean - फ़्लैग का मान।
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


परिणामी इमेज के लिए इमेज फ़ॉर्मेट निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | आउटपुट इमेज फ़ॉर्मेट। |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान। |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


परिणामी इमेज का रिज़ॉल्यूशन निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| रिज़ॉल्यूशन | float | इमेज का रिज़ॉल्यूशन। |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


पृष्ठ या छवि का आकार निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | पृष्ठ या छवि का आकार। |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


स्मूदिंग मोड सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | सेट करने के लिए smoothingMode |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| supressErrors | boolean | बूलियन मान। |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


निर्दिष्ट करता है कि लाइब्रेरी इमेज फ्रैगमेंट्स को जोड़ने की कोशिश करेगी या नहीं। यह तब उपयोग किया जाता है जब स्रोत PS/EPS फ़ाइल में इमेज को फ्रैगमेंट्स में काटा गया हो। इस स्थिति में इस फ़्लैग के बिना फ्रैगमेंट्स के बीच पतले अंतराल रह जाते हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| tryJoinImageFragments | boolean | फ़्लैग का मान। |

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

