---
title: Option
second_title: Aspose.Page for Java API Reference
description: The class that implements a common PrintTicket Option.
type: docs
weight: 76
url: /java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

The class that implements a common PrintTicket  Option . The base class for all schema-defined options. An Option element contains all of the  Property  and  ScoredProperty  elements associated with this option. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Constructors

| Constructor | Description |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Creates a new PrintTicket option instance. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Creates a new PrintTicket option instance. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Creates a clone option instance. |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Creates a new PrintTicket option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | An arbitrary option name. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | An arbitrary array of  IOptionItem  instance. Each one must be a  ScoredProperty  or a  Property  instance. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Creates a new PrintTicket option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | An arbitrary array of  IOptionItem  instance. Each one must be a  ScoredProperty  or a  Property  instance. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Creates a clone option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | An option instance to clone. |

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

