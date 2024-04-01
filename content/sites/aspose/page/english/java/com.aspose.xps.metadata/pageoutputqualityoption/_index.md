---
title: PageOutputQuality.PageOutputQualityOption
second_title: Aspose.Page for Java API Reference
description: Defines PageOutputQuality feature options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

Defines  PageOutputQuality  feature options.
## Fields

| Field | Description |
| --- | --- |
| [Automatic](#Automatic) | Specifies the intent for automatic output (allow the client to automatically choose the best settings). |
| [Draft](#Draft) | Specifies the intent for draft output (balanced for draft quality text and graphics). |
| [Fax](#Fax) | Specifies the intent for fax output (balanced for standard fax quality). |
| [High](#High) | Specifies the intent for high quality output (balanced for high quality text and graphics). |
| [Normal](#Normal) | Specifies the intent for normal output (balanced for good quality text and graphics). |
| [Photographic](#Photographic) | Specifies the intent for photographic output (images should have the highest quality). |
| [Text](#Text) | Specifies the intent for text only output (graphics may output poorly or not at all). |
## Methods

| Method | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Adds a list of items to the end of this option's item list. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the element name. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Specifies the intent for automatic output (allow the client to automatically choose the best settings).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Specifies the intent for draft output (balanced for draft quality text and graphics).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Specifies the intent for fax output (balanced for standard fax quality).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Specifies the intent for high quality output (balanced for high quality text and graphics).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Specifies the intent for normal output (balanced for good quality text and graphics).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Specifies the intent for photographic output (images should have the highest quality).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Specifies the intent for text only output (graphics may output poorly or not at all).

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Adds a list of items to the end of this option's item list. Each one must be a  ScoredProperty  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | List of items to add. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


Gets the element name.

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

