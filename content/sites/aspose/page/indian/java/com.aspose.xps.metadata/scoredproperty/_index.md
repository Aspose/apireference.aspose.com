---
title: "ScoredProperty"
second_title: "Aspose.Page for Java API संदर्भ"
description: "एक सामान्य PrintTicket ScoredProperty को लागू करने वाली क्लास।"
type: docs
weight: 146
url: /hi/java/com.aspose.xps.metadata/scoredproperty/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem)
```
public class ScoredProperty extends CompositePrintTicketElement implements IOptionItem, IScoredPropertyItem
```

एक सामान्य PrintTicket  ScoredProperty को लागू करने वाली क्लास। सभी स्कीमा-परिभाषित स्कोर्ड प्रॉपर्टीज़ के लिए बेस क्लास। एक  ScoredProperty  तत्व एक ऐसी प्रॉपर्टी घोषित करता है जो  Option  परिभाषा में अंतर्निहित होती है। ऐसी प्रॉपर्टीज़ की तुलना तब करनी चाहिए जब यह मूल्यांकन किया जाए कि अनुरोधित  Option  डिवाइस‑समर्थित  Option  के कितनी निकट है। https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [ScoredProperty(String name, ParameterRef parameterRef)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-) | एक नया इंस्टेंस बनाता है। |
| [ScoredProperty(String name, Value value, IScoredPropertyItem[] items)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | एलिमेंट का नाम प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ScoredProperty(String name, ParameterRef parameterRef) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-}
```
public ScoredProperty(String name, ParameterRef parameterRef)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String | एक प्रॉपर्टी नाम। |
| parameterRef | [ParameterRef](../../com.aspose.xps.metadata/parameterref) | एक  ParameterRef  इंस्टेंस। |

### ScoredProperty(String name, Value value, IScoredPropertyItem[] items) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-}
```
public ScoredProperty(String name, Value value, IScoredPropertyItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String | एक प्रॉपर्टी नाम। |
| value | [Value](../../com.aspose.xps.metadata/value) | एक प्रॉपर्टी मान। |
| items | [IScoredPropertyItem\[\]](../../com.aspose.xps.metadata/iscoredpropertyitem) | IScoredPropertyItem  इंस्टेंस की एक मनमानी एरे। प्रत्येक को एक  ScoredProperty , एक  Property  या एक  Value  इंस्टेंस होना चाहिए। |

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

