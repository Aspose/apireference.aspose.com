---
title: "Property"
second_title: "Aspose.Page for Java API संदर्भ"
description: "प्रिंट टिकट प्रॉपर्टी को लागू करने वाली क्लास।"
type: docs
weight: 143
url: /hi/java/com.aspose.xps.metadata/property/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem), [com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem), [com.aspose.xps.metadata.IPropertyItem](../../com.aspose.xps.metadata/ipropertyitem)
```
public class Property extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem, IOptionItem, IScoredPropertyItem, IPropertyItem
```

प्रिंट टिकट प्रॉपर्टी को लागू करने वाली कक्षा। यह कक्षा एक सामान्य PrintTicket Property को लागू करती है। सभी स्कीमा-परिभाषित प्रॉपर्टी के लिए बेस क्लास। एक Property तत्व डिवाइस, जॉब फ़ॉर्मेटिंग, या अन्य संबंधित प्रॉपर्टी को घोषित करता है जिसका नाम उसके name एट्रिब्यूट द्वारा दिया जाता है। एक Value तत्व का उपयोग Property को मान असाइन करने के लिए किया जाता है। एक Property जटिल हो सकती है, जिसमें कई सबप्रॉपर्टी शामिल हो सकते हैं। सबप्रॉपर्टी भी Property तत्वों द्वारा प्रतिनिधित्व किए जाते हैं। https://docs.microsoft.com/en-us/windows/win32/printdocs/property
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [Property(String name, Property property, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-) | एक नया इंस्टेंस बनाता है। |
| [Property(String name, Value value, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-) | एक नया इंस्टेंस बनाता है। |
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
### Property(String name, Property property, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Property property, IPropertyItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String | एक प्रॉपर्टी नाम। |
| property | [Property](../../com.aspose.xps.metadata/property) | एक अनिवार्य Property इंस्टेंस। |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | IPropertyItem इंस्टेंस की एक मनमानी एरे। प्रत्येक को एक Property या Value इंस्टेंस होना चाहिए। |

### Property(String name, Value value, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Value value, IPropertyItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String | एक प्रॉपर्टी नाम। |
| value | [Value](../../com.aspose.xps.metadata/value) | एक अनिवार्य  Value  उदाहरण। |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | IPropertyItem इंस्टेंस की एक मनमानी एरे। प्रत्येक को एक Property या Value इंस्टेंस होना चाहिए। |

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

