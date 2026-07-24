---
title: "StringResult"
second_title: "Aspose.Page for Java API संदर्भ"
description: "ऑपरेशन परिणाम को स्ट्रिंग के रूप में दर्शाता है।"
type: docs
weight: 19
url: /hi/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

ऑपरेशन परिणाम को स्ट्रिंग के रूप में दर्शाता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | एक स्ट्रिंग के साथ नया StringResult इंस्टेंस प्रारंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | कच्चा डेटा प्राप्त करता है। |
| [getText()](#getText--) | परिणाम का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | संकेत करता है कि परिणाम बाइट्स एरे है या नहीं। |
| [isFile()](#isFile--) | संकेत करता है कि परिणाम आउटपुट फ़ाइल का पथ है या नहीं। |
| [isStream()](#isStream--) | संकेत करता है कि परिणाम आउटपुट फ़ाइल का पथ है या नहीं। |
| [isString()](#isString--) | संकेत करता है कि परिणाम स्ट्रिंग है या नहीं। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | परिणाम को फ़ाइल में बदलने का प्रयास करता है। |
| [toStream()](#toStream--) | परिणाम को स्ट्रीम ऑब्जेक्ट में बदलने का प्रयास करता है। |
| [toString()](#toString--) | परिणाम को स्ट्रिंग में बदलने का प्रयास करता है। |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


एक स्ट्रिंग के साथ नया StringResult इंस्टेंस प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| परिणाम | java.lang.String | परिणाम का प्रतिनिधित्व करने वाली स्ट्रिंग |

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
### getData() {#getData--}
```
public final Object getData()
```


कच्चा डेटा प्राप्त करता है।

**Returns:**
java.lang.Object - आउटपुट डेटा का प्रतिनिधित्व करने वाला एक ऑब्जेक्ट।
### getText() {#getText--}
```
public final String getText()
```


परिणाम का स्ट्रिंग प्रतिनिधित्व लौटाता है।

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


संकेत करता है कि परिणाम बाइट्स एरे है या नहीं।

**Returns:**
boolean - true यदि परिणाम बाइट्स एरे है; अन्यथा false।
### isFile() {#isFile--}
```
public final boolean isFile()
```


संकेत करता है कि परिणाम आउटपुट फ़ाइल का पथ है या नहीं।

**Returns:**
boolean - true यदि परिणाम फ़ाइल है; अन्यथा false।
### isStream() {#isStream--}
```
public final boolean isStream()
```


संकेत करता है कि परिणाम आउटपुट फ़ाइल का पथ है या नहीं।

**Returns:**
boolean - true यदि परिणाम स्ट्रीम ऑब्जेक्ट है; अन्यथा false।
### isString() {#isString--}
```
public final boolean isString()
```


संकेत करता है कि परिणाम स्ट्रिंग है या नहीं।

**Returns:**
boolean - true यदि परिणाम स्ट्रिंग है; अन्यथा false।
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


परिणाम को फ़ाइल में बदलने का प्रयास करता है।

**Returns:**
java.lang.String - यदि परिणाम फ़ाइल है तो आउटपुट फ़ाइल के पथ को दर्शाने वाली स्ट्रिंग; अन्यथा null।
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


परिणाम को स्ट्रीम ऑब्जेक्ट में बदलने का प्रयास करता है।

**Returns:**
java.io.OutputStream - यदि परिणाम स्ट्रीम है तो आउटपुट डेटा को दर्शाने वाला स्ट्रीम ऑब्जेक्ट; अन्यथा null।
### toString() {#toString--}
```
public String toString()
```


परिणाम को स्ट्रिंग में बदलने का प्रयास करता है।

**Returns:**
java.lang.String - यदि परिणाम स्ट्रिंग है तो टेक्स्ट सामग्री का प्रतिनिधित्व करने वाली स्ट्रिंग; अन्यथा base.ToString() लौटाता है।
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

