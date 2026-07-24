---
title: "TransformedStroke"
second_title: "Aspose.Page for Java API संदर्भ"
description: "एक स्ट्रोक जिसमें रूपांतरण शामिल है।"
type: docs
weight: 17
url: /hi/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

एक स्ट्रोक जिसमें रूपांतरण शामिल है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | एक अन्य Stroke और एक AffineTransform के आधार पर TransformedStroke बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | दिए गए Shape को इस stroke से स्ट्रोक करता है, जिससे एक रूपरेखा बनती है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | बेसिक stroke प्राप्त करता है। |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | एक ट्रांसफ़ॉर्मेशन प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


एक अन्य Stroke और एक AffineTransform के आधार पर TransformedStroke बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| base | java.awt.Stroke | stroke base। |
| at | java.awt.geom.AffineTransform | Affine transformation। |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


दिए गए Shape को इस stroke से स्ट्रोक करता है, जिससे एक रूपरेखा बनती है। यह रूपरेखा हमारे AffineTransform द्वारा विकृत होती है, जो base stroke द्वारा दी गई रूपरेखा के सापेक्ष होती है, लेकिन केवल स्केलिंग (यानी रेखाओं की मोटाई) के संदर्भ में, क्योंकि ट्रांसलेशन और रोटेशन स्ट्रोकिंग के बाद वापस ले लिए जाते हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | java.awt.Shape | रूपरेखा बनाने के लिए shape के रूप में। |

**Returns:**
java.awt.Shape - shape की एक रूपरेखा।
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


बेसिक stroke प्राप्त करता है।

**Returns:**
java.awt.Stroke - बेसिक stroke।
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


एक ट्रांसफ़ॉर्मेशन प्राप्त करता है।

**Returns:**
java.awt.geom.AffineTransform - एक ट्रांसफ़ॉर्मेशन।
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

