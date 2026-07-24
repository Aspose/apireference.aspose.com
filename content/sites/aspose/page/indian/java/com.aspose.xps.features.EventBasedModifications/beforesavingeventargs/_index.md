---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page for Java API संदर्भ"
description: "विभिन्न सहेजने से पहले इवेंट्स के तर्कों के लिए बेस क्लास को परिभाषित करता है।"
type: docs
weight: 11
url: /hi/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

विभिन्न सहेजने से पहले इवेंट्स के तर्कों के लिए बेस क्लास को परिभाषित करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | वर्तमान निरपेक्ष पृष्ठ संख्या सभी दस्तावेज़ों में XPS पैकेज के भीतर लौटाता है। |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | XPS पैकेज के भीतर वर्तमान दस्तावेज़ संख्या लौटाता है। |
| [getElementAPI()](#getElementAPI--) | सहेजे जाने वाले तत्व की संशोधन API लौटाता है। |
| [getOutputPageNumber()](#getOutputPageNumber--) | वर्तमान आउटपुट संख्या लौटाता है। |
| [getRelativePageNumber()](#getRelativePageNumber--) | XPS पैकेज के भीतर वर्तमान दस्तावेज़ के सापेक्ष वर्तमान पृष्ठ संख्या लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


वर्तमान निरपेक्ष पृष्ठ संख्या सभी दस्तावेज़ों में XPS पैकेज के भीतर लौटाता है।

**Returns:**
int - XPS पैकेज के भीतर सभी दस्तावेज़ों में वर्तमान निरपेक्ष पृष्ठ संख्या।
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


XPS पैकेज के भीतर वर्तमान दस्तावेज़ संख्या लौटाता है।

**Returns:**
int - XPS पैकेज के भीतर वर्तमान दस्तावेज़ संख्या।
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


सहेजे जाने वाले तत्व की संशोधन API लौटाता है।

**Returns:**
T - सहेजे जाने वाले तत्व की संशोधन API।
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


वर्तमान आउटपुट संख्या लौटाता है। यह **AbsolutePageNumber** से अलग होता है यदि **PageNumbers** सहेजने विकल्प निर्दिष्ट किया गया हो।

**Returns:**
int - वर्तमान आउटपुट संख्या।
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


XPS पैकेज के भीतर वर्तमान दस्तावेज़ के सापेक्ष वर्तमान पृष्ठ संख्या लौटाता है।

**Returns:**
int - XPS पैकेज के भीतर वर्तमान दस्तावेज़ के सापेक्ष वर्तमान पृष्ठ संख्या।
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

