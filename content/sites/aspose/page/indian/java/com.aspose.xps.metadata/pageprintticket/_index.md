---
title: "PagePrintTicket"
second_title: "Aspose.Page for Java API संदर्भ"
description: "वह क्लास जो पृष्ठ-स्तर प्रिंट टिकट को समाहित करती है।"
type: docs
weight: 119
url: /hi/java/com.aspose.xps.metadata/pageprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class PagePrintTicket extends PrintTicket
```

वह क्लास जो पृष्ठ-स्तर प्रिंट टिकट को समाहित करती है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PagePrintTicket(IPagePrintTicketItem[] items)](#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-) | एक पृष्ठ-स्तरीय प्रिंट टिकट इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IPagePrintTicketItem[] items)](#add-com.aspose.xps.metadata.IPagePrintTicketItem...-) | इस PrintTicket आइटम सूची के अंत में आइटमों का एक एरे जोड़ता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | प्रिंट टिकट आइटम नामों का इटररेटर लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | इस PrintTicket आइटम सूची से एक आइटम हटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PagePrintTicket(IPagePrintTicketItem[] items) {#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public PagePrintTicket(IPagePrintTicketItem[] items)
```


एक पृष्ठ-स्तरीय प्रिंट टिकट इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | IPagePrintTicketItem इंस्टेंस की एक मनमानी ऐरे। प्रत्येक को एक Feature, एक ParameterInit या एक Property इंस्टेंस होना चाहिए। |

### add(IPagePrintTicketItem[] items) {#add-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public void add(IPagePrintTicketItem[] items)
```


इस PrintTicket आइटम सूची के अंत में आइटमों की एक ऐरे जोड़ता है। प्रत्येक एक Feature, एक ParameterInit या एक Property इंस्टेंस हो सकता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | जोड़ने के लिए आइटमों का एक एरे। |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


प्रिंट टिकट आइटम नामों का इटररेटर लौटाता है।

**Returns:**
java.util.Iterator<java.lang.String> - सूची के लिए इटररेटर लौटाता है।
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


इस PrintTicket आइटम सूची से एक आइटम हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String[] | आइटम नामों का एक एरे। |

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

