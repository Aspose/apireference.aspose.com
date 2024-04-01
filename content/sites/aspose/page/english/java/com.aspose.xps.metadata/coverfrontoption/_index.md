---
title: JobPrimaryCoverFront.CoverFrontOption
second_title: Aspose.Page for Java API Reference
description: Describes the JobPrimaryCoverFront feature options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/jobprimarycoverfront.coverfrontoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverFront.CoverFrontOption extends Option
```

Describes the  JobPrimaryCoverFront  feature options.
## Fields

| Field | Description |
| --- | --- |
| [BlankCover](#BlankCover) | Specifies a blank cover sheet should be printed. |
| [NoCover](#NoCover) | Specifies no cover will be output. |
| [PrintBack](#PrintBack) | Specifies the cover indicated by "CoverFrontSource" should be printed on the back side of the cover sheet. |
| [PrintBoth](#PrintBoth) | Specifies the cover indicated by "CoverFrontSource" may be printed on either side of the cover sheet. |
| [PrintFront](#PrintFront) | Specifies the cover indicated by "CoverFrontSource" should be printed on the front side of the cover sheet. |
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
### BlankCover {#BlankCover}
```
public static JobPrimaryCoverFront.CoverFrontOption BlankCover
```


Specifies a blank cover sheet should be printed.

### NoCover {#NoCover}
```
public static JobPrimaryCoverFront.CoverFrontOption NoCover
```


Specifies no cover will be output.

### PrintBack {#PrintBack}
```
public static JobPrimaryCoverFront.CoverFrontOption PrintBack
```


Specifies the cover indicated by "CoverFrontSource" should be printed on the back side of the cover sheet. If a  JobPrimaryCoverFrontSource   ParameterInit  element is not specified, this Option should be ignored.

### PrintBoth {#PrintBoth}
```
public static JobPrimaryCoverFront.CoverFrontOption PrintBoth
```


Specifies the cover indicated by "CoverFrontSource" may be printed on either side of the cover sheet. If a  JobPrimaryCoverFrontSource   ParameterInit  element is not specified, this Option should be ignored.

### PrintFront {#PrintFront}
```
public static JobPrimaryCoverFront.CoverFrontOption PrintFront
```


Specifies the cover indicated by "CoverFrontSource" should be printed on the front side of the cover sheet. If a  JobPrimaryCoverFrontSource   ParameterInit  element is not specified, this Option should be ignored.

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

