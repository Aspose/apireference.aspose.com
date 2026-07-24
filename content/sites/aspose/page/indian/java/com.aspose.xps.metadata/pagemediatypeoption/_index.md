---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageMediaType फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 13
url: /hi/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

PageMediaType फीचर विकल्पों का वर्णन करता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | एक नया इंस्टेंस बनाता है। |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | इस विकल्प इंस्टेंस को क्लोन करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Archival](#Archival) | आर्काइवल क्वालिटी मीडिया को निर्दिष्ट करता है। |
| [AutoSelect](#AutoSelect) | निर्दिष्ट करता है कि मीडिया स्वचालित रूप से चयनित होगा। |
| [BackPrintFilm](#BackPrintFilm) | विशेष बैक प्रिंटिंग फ़िल्म मीडिया निर्दिष्ट करता है। |
| [Bond](#Bond) | मानक बॉन्ड मीडिया निर्दिष्ट करता है। |
| [CardStock](#CardStock) | मानक कार्ड स्टॉक मीडिया निर्दिष्ट करता है। |
| [Continous](#Continous) | सतत फ़ीड मीडिया निर्दिष्ट करता है। |
| [EnvelopePlain](#EnvelopePlain) | मानक लिफ़ाफ़ा मीडिया निर्दिष्ट करता है। |
| [EnvelopeWindow](#EnvelopeWindow) | विंडो वाले लिफ़ाफ़ा मीडिया निर्दिष्ट करता है। |
| [Fabric](#Fabric) | कपड़ा मीडिया निर्दिष्ट करता है। |
| [HighResolution](#HighResolution) | विशेष उच्च रिज़ॉल्यूशन मीडिया निर्दिष्ट करता है। |
| [Label](#Label) | लेबल मीडिया निर्दिष्ट करता है। |
| [MultiLayerForm](#MultiLayerForm) | संलग्न मल्टी-पार्ट फ़ॉर्म्स मीडिया निर्दिष्ट करता है। |
| [MultiPartForm](#MultiPartForm) | अलग मल्टी-पार्ट फ़ॉर्म्स मीडिया निर्दिष्ट करता है। |
| [None](#None) | अज्ञात या सूचीबद्ध नहीं मीडिया निर्दिष्ट करता है। |
| [Photographic](#Photographic) | मानक फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [PhotographicFilm](#PhotographicFilm) | फ़िल्म फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [PhotographicGlossy](#PhotographicGlossy) | ग्लॉसी फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [PhotographicHighGloss](#PhotographicHighGloss) | उच्च ग्लॉस फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [PhotographicMatte](#PhotographicMatte) | मैट फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [PhotographicSatin](#PhotographicSatin) | सैटिन फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | सेमी-ग्लॉस फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है। |
| [Plain](#Plain) | मानक कागज़ मीडिया निर्दिष्ट करता है। |
| [Screen](#Screen) | सतत रूप में आउटपुट डिस्प्ले पर आउटपुट निर्दिष्ट करता है। |
| [ScreenPaged](#ScreenPaged) | पृष्ठीय रूप में आउटपुट डिस्प्ले पर आउटपुट निर्दिष्ट करता है। |
| [Stationary](#Stationary) | विशेष स्टेशनरी मीडिया निर्दिष्ट करता है। |
| [TShirtTransfer](#TShirtTransfer) | विशेष टी-शर्ट ट्रांसफ़र मीडिया निर्दिष्ट करता है। |
| [TabStockFull](#TabStockFull) | टैब स्टॉक मीडिया को निर्दिष्ट करता है जो पूर्व-कटा नहीं है (एकल टैब)। |
| [TabStockPreCut](#TabStockPreCut) | टैब स्टॉक मीडिया को निर्दिष्ट करता है जो पूर्व-कटा हुआ है (एकाधिक टैब)। |
| [Transparency](#Transparency) | पारदर्शी मीडिया को निर्दिष्ट करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | विकल्प में IPageMediaTypeOptionItem इंस्टैंस की एक सरणी जोड़ता है। |
| [clone()](#clone--) | इस विकल्प इंस्टेंस को क्लोन करता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | एलिमेंट का नाम प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Weight स्कोर वाली प्रॉपर्टी मान को सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionName | java.lang.String | एक विकल्प का नाम। |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | IPageMediaTypeOptionItem इंस्टैंस की एक मनमानी सरणी। |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


इस विकल्प इंस्टेंस को क्लोन करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | क्लोन करने के लिए एक इंस्टेंस। |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


आर्काइवल क्वालिटी मीडिया को निर्दिष्ट करता है।

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


निर्दिष्ट करता है कि मीडिया स्वचालित रूप से चयनित होगा।

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


विशेष बैक प्रिंटिंग फ़िल्म मीडिया निर्दिष्ट करता है।

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


मानक बॉन्ड मीडिया निर्दिष्ट करता है।

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


मानक कार्ड स्टॉक मीडिया निर्दिष्ट करता है।

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


सतत फ़ीड मीडिया निर्दिष्ट करता है।

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


मानक लिफ़ाफ़ा मीडिया निर्दिष्ट करता है।

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


विंडो वाले लिफ़ाफ़ा मीडिया निर्दिष्ट करता है।

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


कपड़ा मीडिया निर्दिष्ट करता है।

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


विशेष उच्च रिज़ॉल्यूशन मीडिया निर्दिष्ट करता है।

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


लेबल मीडिया निर्दिष्ट करता है।

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


संलग्न मल्टी-पार्ट फ़ॉर्म्स मीडिया निर्दिष्ट करता है।

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


अलग मल्टी-पार्ट फ़ॉर्म्स मीडिया निर्दिष्ट करता है।

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


अज्ञात या सूचीबद्ध नहीं मीडिया निर्दिष्ट करता है।

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


मानक फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


फ़िल्म फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


ग्लॉसी फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


उच्च ग्लॉस फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


मैट फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


सैटिन फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


सेमी-ग्लॉस फ़ोटोग्राफ़िक मीडिया निर्दिष्ट करता है।

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


मानक कागज़ मीडिया निर्दिष्ट करता है।

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


सतत रूप में आउटपुट डिस्प्ले पर आउटपुट निर्दिष्ट करता है।

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


पृष्ठीय रूप में आउटपुट डिस्प्ले पर आउटपुट निर्दिष्ट करता है।

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


विशेष स्टेशनरी मीडिया निर्दिष्ट करता है।

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


विशेष टी-शर्ट ट्रांसफ़र मीडिया निर्दिष्ट करता है।

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


टैब स्टॉक मीडिया को निर्दिष्ट करता है जो पूर्व-कटा नहीं है (एकल टैब)।

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


टैब स्टॉक मीडिया को निर्दिष्ट करता है जो पूर्व-कटा हुआ है (एकाधिक टैब)।

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


पारदर्शी मीडिया को निर्दिष्ट करता है।

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को  ScoredProperty  या  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | जोड़ने के लिए आइटमों की सूची। |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


विकल्प में IPageMediaTypeOptionItem इंस्टैंस की एक सरणी जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | IPageMediaTypeOptionItem इंस्टैंस की एक मनमानी सरणी। |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


इस विकल्प इंस्टेंस को क्लोन करता है। क्लोनिंग कन्स्ट्रक्टर का शॉर्टकट।

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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
### getName() {#getName--}
```
public String getName()
```


एलिमेंट का नाम प्राप्त करता है।

**Returns:**
java.lang.String
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Weight स्कोर वाली प्रॉपर्टी मान को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| वजन | int | Weight स्कोर वाली प्रॉपर्टी मान। |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

