---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API संदर्भ"
description: "XPS-को-PDF के रूप में सहेजने के विकल्पों के लिए क्लास।"
type: docs
weight: 14
url: /hi/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

XPS-को-PDF के रूप में सहेजने के विकल्पों के लिए क्लास।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | विकल्पों का नया उदाहरण बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर लौटाता है। |
| [getBatchSize()](#getBatchSize--) | नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार लौटाता है। |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | सेव होने से ठीक पहले XPS पृष्ठ में संशोधन करने वाले event handlers का संग्रह लौटाता है। |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | फ़्लैग प्राप्त करता है जो दर्शाता है कि गैर-TrueType फ़ॉन्ट को TTF में सहेजना आवश्यक है या नहीं। |
| [getEncryptionDetails()](#getEncryptionDetails--) | एन्क्रिप्शन विवरण लौटाता है। |
| [getExceptions()](#getExceptions--) | गैर-आवश्यक त्रुटियों की सूची लौटाता है। |
| [getImageCompression()](#getImageCompression--) | दस्तावेज़ में सभी छवियों के लिए उपयोग किए जाने वाले संपीड़न प्रकार को लौटाता है। |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | जब PDF फ़ाइल को व्यूअर में खोला जाता है, तो दस्तावेज़ रूपरेखा किस स्तर तक विस्तारित की जानी चाहिए, यह प्राप्त करता है। 1 - केवल प्रथम स्तर के रूपरेखा आइटम दिखाए जाते हैं, 2 - प्रथम और द्वितीय स्तर के रूपरेखा आइटम दिखाए जाते हैं, आदि। |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | सहेजने के लिए दस्तावेज़ रूपरेखा वृक्ष की ऊँचाई प्राप्त करता है। 0 - रूपरेखा वृक्ष नहीं बदला जाएगा, 1 - केवल प्रथम स्तर के रूपरेखा आइटम बदले जाएंगे, आदि। |
| [getPageNumbers()](#getPageNumbers--) | रेंडर करने के लिए पृष्ठों की संख्याओं की एरे प्राप्त करता है। |
| [getSize()](#getSize--) | पृष्ठ या छवि का आकार प्राप्त करता है। |
| [getTextCompression()](#getTextCompression--) | छवियों को छोड़कर सभी कंटेंट स्ट्रीम्स के लिए उपयोग किए जाने वाले संपीड़न प्रकार को लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग प्राप्त करता है। |
| [isSupressErrors()](#isSupressErrors--) | कनवर्ज़न के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | XPS में, कुछ टेक्स्ट तत्व वैकल्पिक ग्लिफ़ रूपों के संदर्भ रख सकते हैं जो फ़ॉन्ट में किसी भी कैरेक्टर कोड से मेल नहीं खाते। |
| [preserveText(boolean value)](#preserveText-boolean-) | XPS में, कुछ टेक्स्ट तत्व वैकल्पिक ग्लिफ़ रूपों के संदर्भ रख सकते हैं जो फ़ॉन्ट में किसी भी कैरेक्टर कोड से मेल नहीं खाते। |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने हेतु कनवर्टर को अतिरिक्त फ़ॉन्ट फ़ोल्डर निर्दिष्ट करता है। |
| [setBatchSize(int value)](#setBatchSize-int-) | नोड से नोड तक पास होने वाले पृष्ठों के एक भाग का आकार सेट करता है। |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | गैर-TrueType फ़ॉन्ट को TTF में सहेजना है या नहीं, यह निर्दिष्ट करता है। |
| [setDebug(boolean debug)](#setDebug-boolean-) | कनवर्ज़न के दौरान चेतावनियों और संदेशों के आउटपुट की अनुमति देने वाला फ़्लैग निर्दिष्ट करता है। |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | एन्क्रिप्शन विवरण सेट करता है। |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | दस्तावेज़ में सभी छवियों के लिए उपयोग किए जाने वाले संपीड़न प्रकार को सेट करता है। |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | जब PDF फ़ाइल को व्यूअर में खोला जाता है, तो दस्तावेज़ रूपरेखा किस स्तर तक विस्तारित की जानी चाहिए, यह सेट करता है। 1 - केवल प्रथम स्तर के रूपरेखा आइटम दिखाए जाते हैं, 2 - प्रथम और द्वितीय स्तर के रूपरेखा आइटम दिखाए जाते हैं, आदि। |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | सहेजने के लिए दस्तावेज़ रूपरेखा वृक्ष की ऊँचाई सेट करता है। 0 - रूपरेखा वृक्ष नहीं बदला जाएगा, 1 - केवल प्रथम स्तर के रूपरेखा आइटम बदले जाएंगे, आदि। |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | रेंडर करने के लिए पृष्ठों की संख्याओं की एरे सेट करता है। |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | पृष्ठ या छवि का आकार निर्दिष्ट करता है। |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | परिवर्तन के दौरान त्रुटियों को दबाया जाएगा या नहीं, यह दर्शाने वाले फ़्लैग को निर्दिष्ट करता है। |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | छवियों को छोड़कर सभी कंटेंट स्ट्रीम्स के लिए उपयोग किए जाने वाले संपीड़न प्रकार को सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


विकल्पों का नया उदाहरण बनाता है।

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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - इवेंट हैंडलर्स का संग्रह जो XPS पृष्ठ को सहेजे जाने से ठीक पहले उसमें संशोधन करता है।
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


एन्क्रिप्शन विवरण लौटाता है। यदि सेट नहीं किया गया है, तो कोई एन्क्रिप्शन नहीं किया जाएगा।

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


गैर-आवश्यक त्रुटियों की सूची लौटाता है।

**Returns:**
java.util.List<java.lang.Exception> - अपवादों की सूची
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


दस्तावेज़ में सभी छवियों के लिए उपयोग किए जाने वाले संपीड़न प्रकार को लौटाता है। डिफ़ॉल्ट है PdfImageCompression.Auto।

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान लौटाता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Returns:**
int - छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान।
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


जब PDF फ़ाइल को व्यूअर में खोला जाता है, तो दस्तावेज़ रूपरेखा किस स्तर तक विस्तारित की जानी चाहिए, यह प्राप्त करता है। 1 - केवल प्रथम स्तर के रूपरेखा आइटम दिखाए जाते हैं, 2 - प्रथम और द्वितीय स्तर के रूपरेखा आइटम दिखाए जाते हैं, आदि।

**Returns:**
int - रूपरेखा वृक्ष विस्तार स्तर।
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


दस्तावेज़ रूपरेखा वृक्ष की ऊँचाई प्राप्त करता है जिसे सहेजा जाना है। 0 - रूपरेखा वृक्ष नहीं बदला जाएगा, 1 - केवल प्रथम स्तर के रूपरेखा आइटम बदले जाएंगे, आदि। डिफ़ॉल्ट 10 है।

**Returns:**
int - रूपरेखा वृक्ष की ऊँचाई।
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


रेंडर करने के लिए पृष्ठों की संख्याओं की एरे प्राप्त करता है।

**Returns:**
int[] - पृष्ठों की संख्याएँ।
### getSize() {#getSize--}
```
public Dimension getSize()
```


पृष्ठ या छवि का आकार प्राप्त करता है।

**Returns:**
java.awt.Dimension - पृष्ठ या छवि का आकार।
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


छवियों को छोड़कर सभी सामग्री स्ट्रीम के लिए उपयोग किए जाने वाले संपीड़न प्रकार को लौटाता है। डिफ़ॉल्ट है PdfTextCompression.Flate।

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


XPS में, कुछ टेक्स्ट तत्व वैकल्पिक ग्लिफ़ रूपों के संदर्भ रख सकते हैं जो फ़ॉन्ट में किसी भी अक्षर कोड से मेल नहीं खाते। यदि यह फ़्लैग true पर सेट किया जाता है, तो ऐसे XPS तत्वों का टेक्स्ट ग्राफ़िक आकारों में बदल दिया जाता है। फिर टेक्स्ट स्वयं ऊपर पारदर्शी दिखता है। इससे ऐसे तत्वों का टेक्स्ट चयन योग्य रहता है। लेकिन इसका दुष्प्रभाव यह है कि आउटपुट फ़ाइल मूल से बहुत बड़ी हो सकती है। यदि यह फ़्लैग false पर सेट किया जाता है, तो वैकल्पिक रूपों के रूप में दिखाए जाने वाले अक्षरों को अन्य अक्षरों से बदल दिया जाता है जो वैकल्पिक ग्लिफ़ रूपों से मैप हो जाते हैं। इसलिए टेक्स्ट, यद्यपि अभी भी चयन योग्य है, संशोधित हो जाएगा और संभवतः पढ़ने योग्य नहीं रहेगा।

**Returns:**
boolean - फ़्लैग मान।
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


XPS में, कुछ टेक्स्ट तत्व वैकल्पिक ग्लिफ़ रूपों के संदर्भ रख सकते हैं जो फ़ॉन्ट में किसी भी अक्षर कोड से मेल नहीं खाते। यदि यह फ़्लैग true पर सेट किया जाता है, तो ऐसे XPS तत्वों का टेक्स्ट ग्राफ़िक आकारों में बदल दिया जाता है। फिर टेक्स्ट स्वयं ऊपर पारदर्शी दिखता है। इससे ऐसे तत्वों का टेक्स्ट चयन योग्य रहता है। लेकिन इसका दुष्प्रभाव यह है कि आउटपुट फ़ाइल मूल से बहुत बड़ी हो सकती है। यदि यह फ़्लैग false पर सेट किया जाता है, तो वैकल्पिक रूपों के रूप में दिखाए जाने वाले अक्षरों को अन्य अक्षरों से बदल दिया जाता है जो वैकल्पिक ग्लिफ़ रूपों से मैप हो जाते हैं। इसलिए टेक्स्ट, यद्यपि अभी भी चयन योग्य है, संशोधित हो जाएगा और संभवतः पढ़ने योग्य नहीं रहेगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | फ़्लैग मान। |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


एन्क्रिप्शन विवरण सेट करता है। यदि सेट नहीं किया गया, तो कोई एन्क्रिप्शन नहीं किया जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | एन्क्रिप्शन विवरण। |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


दस्तावेज़ में सभी छवियों के लिए उपयोग किए जाने वाले संपीड़न प्रकार को सेट करता है। डिफ़ॉल्ट है PdfImageCompression.Auto।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | संपीड़न प्रकार। |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान सेट करता है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 सबसे अधिक गुणवत्ता वाली छवि देता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | छवि के लिए संपीड़न स्तर निर्दिष्ट करने वाला मान। |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


जब PDF फ़ाइल को व्यूअर में खोला जाता है, तो दस्तावेज़ रूपरेखा किस स्तर तक विस्तारित की जानी चाहिए, यह सेट करता है। 1 - केवल प्रथम स्तर के रूपरेखा आइटम दिखाए जाते हैं, 2 - प्रथम और द्वितीय स्तर के रूपरेखा आइटम दिखाए जाते हैं, आदि।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | रूपरेखा वृक्ष विस्तार स्तर। |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


सहेजने के लिए दस्तावेज़ रूपरेखा वृक्ष की ऊँचाई सेट करता है। 0 - रूपरेखा वृक्ष नहीं बदला जाएगा, 1 - केवल प्रथम स्तर के रूपरेखा आइटम बदले जाएंगे, आदि।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | रूपरेखा वृक्ष की ऊँचाई। |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


रेंडर करने के लिए पृष्ठों की संख्याओं की एरे सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int[] | पृष्ठों की संख्या। |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


छवियों को छोड़कर सभी सामग्री स्ट्रीम के लिए उपयोग किए जाने वाले संपीड़न प्रकार को सेट करता है। डिफ़ॉल्ट है PdfTextCompression.Flate।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | संपीड़न प्रकार। |

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

