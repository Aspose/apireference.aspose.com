---
title: "XpsFillRule"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PathGeometry तत्वों की FillRule प्रॉपर्टी के मान्य मान।"
type: docs
weight: 59
url: /hi/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

PathGeometry एलिमेंट की FillRule प्रॉपर्टी के वैध मान।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [EvenOdd](#EvenOdd) | यह नियम कैनवास पर किसी बिंदु की “अंदर होने” को निर्धारित करता है, बिंदु से अनंत की ओर किसी भी दिशा में एक किरण खींचकर और दी गई आकृति के उन खंडों की संख्या गिनकर जो किरण को काटते हैं। |
| [NonZero](#NonZero) | यह नियम कैनवास पर किसी बिंदु की “अंदर होने” को निर्धारित करता है, बिंदु से अनंत की ओर किसी भी दिशा में एक किरण खींचकर और फिर उस स्थान की जाँच करके जहाँ आकृति का एक खंड किरण को काटता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


यह नियम कैनवास पर किसी बिंदु की “अंदर होने” को निर्धारित करता है, बिंदु से अनंत की ओर किसी भी दिशा में एक किरण खींचकर और दी गई आकृति के उन खंडों की संख्या गिनकर जो किरण को काटते हैं। यदि यह संख्या विषम है, तो बिंदु अंदर है; यदि यह सम है, तो बिंदु बाहर है।

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


यह नियम कैनवास पर किसी बिंदु की “अंदर होने” को निर्धारित करता है, बिंदु से अनंत की ओर किसी भी दिशा में एक किरण खींचकर और फिर उस स्थान की जाँच करके जहाँ आकृति का एक खंड किरण को काटता है। शून्य से गिनती शुरू करते हुए, प्रत्येक बार जब खंड बाएँ से दाएँ की ओर किरण को काटता है तो एक जोड़ें और प्रत्येक बार जब पथ खंड दाएँ से बाएँ की ओर किरण को काटता है तो एक घटाएँ। क्रॉसिंग गिनने के बाद, यदि परिणाम शून्य है तो बिंदु पथ के बाहर है; अन्यथा, यह अंदर है।

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

