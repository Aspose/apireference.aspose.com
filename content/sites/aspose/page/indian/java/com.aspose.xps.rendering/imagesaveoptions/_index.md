---
title: "ImageSaveOptions"
second_title: "Aspose.Page for Java API संदर्भ"
description: "XPS-को-इमेज के रूप में सहेजने के विकल्पों के लिए बेसिक क्लास।"
type: docs
weight: 11
url: /hi/java/com.aspose.xps.rendering/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public abstract class ImageSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IPipelineOptions, IEventBasedModificationOptions
```

XPS-को-इमेज के रूप में सहेजने के विकल्पों के लिए बेसिक क्लास।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | विकल्पों का नया उदाहरण बनाता है |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। |
| [getBatchSize()](#getBatchSize--) | नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार लौटाता है। |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | सेव होने से ठीक पहले XPS पृष्ठ में संशोधन करने वाले event handlers का संग्रह लौटाता है। |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | फ़्लैग प्राप्त करता है जो दर्शाता है कि गैर-TrueType फ़ॉन्ट को TTF में सहेजना आवश्यक है या नहीं। |
| [getExceptions()](#getExceptions--) | गैर-आवश्यक त्रुटियों की सूची लौटाता है। |
| [getImageSize()](#getImageSize--) | आउटपुट छवियों का आकार पिक्सेल में प्राप्त करता है। |
| [getInterpolationMode()](#getInterpolationMode--) | इंटरपोलेशन मोड प्राप्त करता है। |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। |
| [getPageNumbers()](#getPageNumbers--) | रेंडर करने के लिए पृष्ठों की संख्याओं की एरे प्राप्त करता है। |
| [getResolution()](#getResolution--) | छवि रिज़ॉल्यूशन प्राप्त करता है। |
| [getSize()](#getSize--) | पृष्ठ या छवि का आकार प्राप्त करता है। |
| [getSmoothingMode()](#getSmoothingMode--) | स्मूद करने का मोड प्राप्त करता है। |
| [getTextRenderingHint()](#getTextRenderingHint--) | टेक्स्ट रेंडरिंग संकेत प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग प्राप्त करता है। |
| [isSupressErrors()](#isSupressErrors--) | कनवर्ज़न के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। |
| [setBatchSize(int value)](#setBatchSize-int-) | नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार सेट करता है। |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | गैर-TrueType फ़ॉन्ट को TTF में सहेजना है या नहीं, यह निर्दिष्ट करता है। |
| [setDebug(boolean debug)](#setDebug-boolean-) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग निर्दिष्ट करता है। |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | आउटपुट छवियों का आकार पिक्सेल में सेट करता है। |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | इंटरपोलेशन मोड सेट करता है। |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | रेंडर करने के लिए पृष्ठों की संख्याओं की एरे सेट करता है। |
| [setResolution(float value)](#setResolution-float-) | छवि का रिज़ॉल्यूशन सेट करता है। |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | पृष्ठ या छवि का आकार निर्दिष्ट करता है। |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | स्मूद करने का मोड सेट करता है। |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है। |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | टेक्स्ट रेंडरिंग संकेत सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


विकल्पों का नया उदाहरण बनाता है

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार लौटाता है।

**Returns:**
int - नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार।
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


सेव होने से ठीक पहले XPS पृष्ठ में संशोधन करने वाले event handlers का संग्रह लौटाता है।

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


आउटपुट छवियों का आकार पिक्सेल में प्राप्त करता है।

**Returns:**
java.awt.Dimension - आउटपुट छवियों का आकार पिक्सेल में।
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


इंटरपोलेशन मोड प्राप्त करता है।

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Returns:**
int - छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान।
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


रेंडर करने के लिए पृष्ठों की संख्याओं की एरे प्राप्त करता है।

**Returns:**
int[] - पृष्ठों की संख्याएँ।
### getResolution() {#getResolution--}
```
public float getResolution()
```


छवि रिज़ॉल्यूशन प्राप्त करता है।

**Returns:**
float - छवि रिज़ॉल्यूशन।
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


स्मूद करने का मोड प्राप्त करता है।

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


टेक्स्ट रेंडरिंग संकेत प्राप्त करता है।

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | नोड से नोड तक पास किए जाने वाले पृष्ठों के हिस्से का आकार। |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


आउटपुट छवियों का आकार पिक्सेल में सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.Dimension | आउटपुट छवियों का पिक्सेल में आकार। |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


इंटरपोलेशन मोड सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | इंटरपोलेशन मोड। |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान। |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


रेंडर करने के लिए पृष्ठों की संख्याओं की एरे सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int[] | पृष्ठों की संख्या। |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


छवि का रिज़ॉल्यूशन सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | छवि रिज़ॉल्यूशन। |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


पृष्ठ या छवि का आकार निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| आकार | java.awt.Dimension | पृष्ठ या छवि का आकार। |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


स्मूद करने का मोड सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | स्मूदिंग मोड। |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| supressErrors | boolean | बूलियन मान। |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


टेक्स्ट रेंडरिंग संकेत सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | टेक्स्ट रेंडरिंग संकेत। |

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

