---
title: PageScaling.PageScalingOption
second_title: Aspose.Page for Java API Reference
description: Describes the PageScaling features options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

Describes the  PageScaling  features options.

## Fields

| Field | Description |
| --- | --- |
| [Custom](#Custom) | Specifies a custom scaling should be applied to the Application Media Size. |
| [CustomSquare](#CustomSquare) | Specifies a custom square scaling should be applied to the Application Media Size. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | Specifies the application bleed size should be scaled to the  PageImageableSize  preserving the aspect ratio. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | Specifies the application content size should be scaled to the  PageImageableSize  preserving the aspect ratio. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | Specifies the application media size should be scaled to the  PageImageableSize  preserving the aspect ratio. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | Specifies the application media size should be scaled to the  PageMediaSize  preserving the aspect ratio. |
| [None](#None) | Specifies that no scaling should be applied. |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


Specifies a custom scaling should be applied to the Application Media Size.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Specifies a custom square scaling should be applied to the Application Media Size.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```

Specifies the application bleed size should be scaled to the  PageImageableSize  preserving the aspect ratio.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```

Specifies the application content size should be scaled to the  PageImageableSize  preserving the aspect ratio.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```

Specifies the application media size should be scaled to the  PageImageableSize  preserving the aspect ratio.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```

Specifies the application media size should be scaled to the  PageMediaSize  preserving the aspect ratio.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


Specifies that no scaling should be applied.

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

