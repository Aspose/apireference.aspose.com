---
title: "XpsGradientStop"
second_title: "Aspose.Page for Java API संदर्भ"
description: "GradientStop तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 27
url: /hi/java/com.aspose.xps/xpsgradientstop/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsGradientStop extends XpsObject
```

GradientStop तत्व की विशेषताओं को समाहित करने वाला वर्ग। यह तत्व LinearGradientBrush और RadialGradientBrush दोनों तत्वों द्वारा ग्रेडिएंट रेंडर करने के लिए रंग प्रगति के स्थान और सीमा को परिभाषित करने हेतु उपयोग किया जाता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस ग्रेडिएंट स्टॉप की प्रतिलिपि बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | ग्रेडिएंट स्टॉप का रंग लौटाता है। |
| [getOffset()](#getOffset--) | ग्रेडिएंट ऑफ़सेट लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGradientStop deepClone()
```


इस ग्रेडिएंट स्टॉप की प्रतिलिपि बनाता है।

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - Clone of this gradient stop.
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
### getColor() {#getColor--}
```
public XpsColor getColor()
```


ग्रेडिएंट स्टॉप का रंग लौटाता है।

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - The gradient stop color.
### getOffset() {#getOffset--}
```
public float getOffset()
```


ग्रेडिएंट ऑफ़सेट लौटाता है। ऑफ़सेट ग्रेडिएंट की प्रगति के दौरान उस बिंदु को दर्शाता है जहाँ रंग निर्दिष्ट किया गया है। प्रगति में ग्रेडिएंट ऑफ़सेट के बीच के रंगों का इंटरपोलेशन किया जाता है।

**Returns:**
float - ग्रेडिएंट ऑफ़सेट।
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

