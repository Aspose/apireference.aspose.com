---
title: Staple.StapleOption
second_title: Aspose.Page for Java API Reference
description: Describes the JobStapleAllDocuments and DocumentStaple features options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Describes the  JobStapleAllDocuments  and  DocumentStaple  features options.
## Constructors

| Constructor | Description |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Creates a new instance. |
## Fields

| Field | Description |
| --- | --- |
| [None](#None) | Specifies no stapling. |
| [SaddleStitch](#SaddleStitch) | Specifies saddle stitch stapling. |
| [StapleBottomLeft](#StapleBottomLeft) | Specifies a single staple in the bottom, left corner. |
| [StapleBottomRight](#StapleBottomRight) | Specifies a single staple in the bottom, right corner. |
| [StapleDualBottom](#StapleDualBottom) | Specifies two staples along the bottom edge. |
| [StapleDualLeft](#StapleDualLeft) | Specifies two staples along the left edge. |
| [StapleDualRight](#StapleDualRight) | Specifies two staples along the right edge. |
| [StapleDualTop](#StapleDualTop) | Specifies two staples along the top edge |
| [StapleTopLeft](#StapleTopLeft) | Specifies a single staple in the top, left corner. |
| [StapleTopRight](#StapleTopRight) | Specifies a single staple in the top, right corner. |
## Methods

| Method | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Adds a list of items to the end of this option's item list. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Adds an array of  IStapleOptionItem  instances to the feature. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the element name. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Sets an  Angle  scored property value. |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Sets an  SheetCapacity  scored property value. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | An options name. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | An arbitrary array of  IStapleOptionItem  instances. |

### None {#None}
```
public static final Staple.StapleOption None
```


Specifies no stapling.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Specifies saddle stitch stapling.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Specifies a single staple in the bottom, left corner.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Specifies a single staple in the bottom, right corner.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Specifies two staples along the bottom edge.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Specifies two staples along the left edge.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Specifies two staples along the right edge.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Specifies two staples along the top edge

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Specifies a single staple in the top, left corner.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Specifies a single staple in the top, right corner.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Adds a list of items to the end of this option's item list. Each one must be a  ScoredProperty  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | List of items to add. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Adds an array of  IStapleOptionItem  instances to the feature.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | An arbitrary array of  IStapleOptionItem  instances. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Sets an  Angle  scored property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | int | An  Angle  scored property value. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Sets an  SheetCapacity  scored property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sheetCapacity | int | An  SheetCapacity  scored property value. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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

