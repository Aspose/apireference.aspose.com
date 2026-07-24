---
title: "DimensionF"
second_title: "Aspose.Page for Java API संदर्भ"
description: "Dimension क्लास एक घटक की चौड़ाई और ऊँचाई को एकल प्रिसीजन में एक ही ऑब्जेक्ट में समाहित करता है।"
type: docs
weight: 11
url: /hi/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

`Dimension` क्लास एक घटक की चौड़ाई और ऊँचाई (एकल सटीकता में) को एक ही वस्तु में समाहित करती है।

आमतौर पर `width` और `height` के मान गैर-नकारात्मक पूर्णांक होते हैं। वे कंस्ट्रक्टर जो आपको एक डाइमेंशन बनाने की अनुमति देते हैं, इन गुणों के लिए नकारात्मक मान सेट करने से नहीं रोकते। यदि `width` या `height` का मान नकारात्मक है, तो अन्य ऑब्जेक्ट्स द्वारा परिभाषित कुछ मेथड्स का व्यवहार अपरिभाषित रहता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [DimensionF()](#DimensionF--) | `Dimension` का एक इंस्टेंस बनाता है जिसकी चौड़ाई शून्य और ऊँचाई शून्य होती है। |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | `Dimension` का एक इंस्टेंस बनाता है जिसकी चौड़ाई और ऊँचाई निर्दिष्ट डाइमेंशन के समान होती है। |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | `Dimension` बनाता है और इसे निर्दिष्ट चौड़ाई और निर्दिष्ट ऊँचाई से प्रारंभ करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [height](#height) | ऊँचाई डाइमेंशन; नकारात्मक मानों का उपयोग किया जा सकता है। |
| [width](#width) | चौड़ाई डाइमेंशन; नकारात्मक मानों का उपयोग किया जा सकता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | जाँचता है कि क्या दो डाइमेंशन ऑब्जेक्ट्स के मान समान हैं। |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | इस `Dimension` ऑब्जेक्ट का आकार प्राप्त करता है। |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | इस `Dimension` के लिए हैश कोड लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | इस `Dimension` ऑब्जेक्ट का आकार निर्दिष्ट आकार पर सेट करता है। |
| [setSize(double width, double height)](#setSize-double-double-) | इस `Dimension` ऑब्जेक्ट का आकार डबल प्रिसीजन में निर्दिष्ट चौड़ाई और ऊँचाई पर सेट करता है। |
| [setSize(float width, float height)](#setSize-float-float-) | इस `Dimension` ऑब्जेक्ट का आकार निर्दिष्ट चौड़ाई और ऊँचाई पर सेट करता है। |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | इस `Dimension` ऑब्जेक्ट के `height` और `width` फ़ील्ड्स के मानों का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


`Dimension` का एक इंस्टेंस बनाता है जिसकी चौड़ाई शून्य और ऊँचाई शून्य होती है।

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


`Dimension` का एक इंस्टेंस बनाता है जिसकी चौड़ाई और ऊँचाई निर्दिष्ट डाइमेंशन के समान होती है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | `width` और `height` मानों के लिए निर्दिष्ट डाइमेंशन |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


`Dimension` बनाता है और इसे निर्दिष्ट चौड़ाई और निर्दिष्ट ऊँचाई से प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | निर्दिष्ट चौड़ाई |
| ऊँचाई | float | निर्दिष्ट ऊँचाई |

### height {#height}
```
public float height
```


ऊँचाई डाइमेंशन; नकारात्मक मानों का उपयोग किया जा सकता है।

### width {#width}
```
public float width
```


चौड़ाई डाइमेंशन; नकारात्मक मानों का उपयोग किया जा सकता है।

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


जाँचता है कि क्या दो डाइमेंशन ऑब्जेक्ट्स के मान समान हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


इस `Dimension` ऑब्जेक्ट का आकार प्राप्त करता है। यह मेथड पूर्णता के लिए शामिल किया गया है, ताकि `Component` द्वारा परिभाषित `getSize` मेथड के समान हो।

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


इस `Dimension` के लिए हैश कोड लौटाता है।

**Returns:**
int - इस `Dimension` का हैश कोड
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


इस `Dimension` ऑब्जेक्ट का आकार निर्दिष्ट आकार में सेट करता है। यह मेथड पूर्णता के लिए शामिल किया गया है, ताकि `Component` द्वारा परिभाषित `setSize` मेथड के समान हो।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | इस `Dimension` ऑब्जेक्ट के लिए नया आकार |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


इस `Dimension` ऑब्जेक्ट का आकार निर्दिष्ट चौड़ाई और ऊँचाई में डबल प्रिसीजन के साथ सेट करता है। ध्यान दें कि यदि `width` या `height` `Integer.MAX_VALUE` से बड़े हैं, तो उन्हें `Integer.MAX_VALUE` पर रीसेट कर दिया जाएगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | double | `Dimension` ऑब्जेक्ट के लिए नई चौड़ाई |
| ऊँचाई | double | `Dimension` ऑब्जेक्ट के लिए नई ऊँचाई |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


इस `Dimension` ऑब्जेक्ट का आकार निर्दिष्ट चौड़ाई और ऊँचाई में सेट करता है। यह मेथड पूर्णता के लिए शामिल किया गया है, ताकि `Component` द्वारा परिभाषित `setSize` मेथड के समान हो।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | इस `Dimension` ऑब्जेक्ट के लिए नई चौड़ाई |
| ऊँचाई | float | इस `Dimension` ऑब्जेक्ट के लिए नई ऊँचाई |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


इस `Dimension` ऑब्जेक्ट के `height` और `width` फ़ील्ड के मानों का स्ट्रिंग प्रतिनिधित्व लौटाता है। यह मेथड केवल डिबगिंग उद्देश्यों के लिए उपयोग किया जाता है, और लौटाए गए स्ट्रिंग की सामग्री और स्वरूप कार्यान्वयन के बीच भिन्न हो सकते हैं। लौटाया गया स्ट्रिंग खाली हो सकता है लेकिन `null` नहीं हो सकता।

**Returns:**
java.lang.String - इस `Dimension` ऑब्जेक्ट का स्ट्रिंग प्रतिनिधित्व
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

