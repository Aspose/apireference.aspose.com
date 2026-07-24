---
title: "XpsPage"
second_title: "Aspose.Page for Java API संदर्भ"
description: "फ़िक्स्डपेज एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 38
url: /hi/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

FixedPage तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व पृष्ठ की सामग्री रखता है और FixedPage भाग का मूल तत्व है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस पृष्ठ की प्रतिलिपि बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | पेज की ऊँचाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [getWidth()](#getWidth--) | पेज की चौड़ाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [getXmlLang()](#getXmlLang--) | वर्तमान तत्व और किसी भी बाल या वंशज तत्वों के लिए उपयोग की जाने वाली डिफ़ॉल्ट भाषा को निर्दिष्ट करने वाला मान लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable इंटरफ़ेस का कार्यान्वयन। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | पेज की ऊँचाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [setWidth(float value)](#setWidth-float-) | पेज की चौड़ाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | वर्तमान तत्व और किसी भी बाल या वंशज तत्वों के लिए उपयोग की जाने वाली डिफ़ॉल्ट भाषा को निर्दिष्ट करने वाला मान सेट करता है। |
| [size()](#size--) | चाइल्ड एलिमेंट्स की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


इस पृष्ठ की प्रतिलिपि बनाता है।

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int | चाइल्ड एलिमेंट का इंडेक्स। |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


पेज की ऊँचाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Returns:**
float - पृष्ठ की ऊँचाई।
### getWidth() {#getWidth--}
```
public float getWidth()
```


पेज की चौड़ाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Returns:**
float - पृष्ठ की चौड़ाई।
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


वर्तमान तत्व और किसी भी बाल या वंशज तत्वों के लिए उपयोग की जाने वाली डिफ़ॉल्ट भाषा को निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
java.lang.String - डिफ़ॉल्ट भाषा को निर्दिष्ट करने वाला मान।
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Iterable इंटरफ़ेस का कार्यान्वयन।

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - सूची के लिए एन्यूमरेटर लौटाता है।
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


पेज की ऊँचाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | पृष्ठ की ऊँचाई। |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


पेज की चौड़ाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | पृष्ठ की चौड़ाई। |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


वर्तमान तत्व और किसी भी बाल या वंशज तत्वों के लिए उपयोग की जाने वाली डिफ़ॉल्ट भाषा को निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.lang.String | डिफ़ॉल्ट भाषा को निर्दिष्ट करने वाला मान। |

### size() {#size--}
```
public int size()
```


चाइल्ड एलिमेंट्स की संख्या लौटाता है।

**Returns:**
int - चाइल्ड एलिमेंट्स की संख्या।
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

