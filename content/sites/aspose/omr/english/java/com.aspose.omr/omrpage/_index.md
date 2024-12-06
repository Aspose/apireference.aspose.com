---
title: OmrPage
second_title: Aspose.OMR for Java API Reference
description: Represents single omr page
type: docs
weight: 24
url: /java/com.aspose.omr/omrpage/
---

**Inheritance:**
java.lang.Object
```
public class OmrPage
```

Represents single omr page
## Constructors

| Constructor | Description |
| --- | --- |
| [OmrPage()](#OmrPage) | Initializes a new instance of the [OmrPage](../../com.aspose.omr/omrpage/) class |
## Methods

| Method | Description |
| --- | --- |
| [addBarcodeElement(BarcodeElement element)](#addBarcodeElement-com.aspose.omr.BarcodeElement) |  |
| [addChoiceBoxElement(String name, int width, int height, int top, int left)](#addChoiceBoxElement-java.lang.String-int-int-int-int) | Add choice box element on page |
| [addClipAreaElement(String name, int width, int height, int top, int left)](#addClipAreaElement-java.lang.String-int-int-int-int) |  |
| [addGridElement(GridElement grid)](#addGridElement-com.aspose.omr.GridElement) |  |
| [addGridElement(String name, int width, int height, int top, int left)](#addGridElement-java.lang.String-int-int-int-int) |  |
| [addRefPointElement(ReferencePointElement item)](#addRefPointElement-com.aspose.omr.ReferencePointElement) |  |
| [equals(Object arg0)](#equals-java.lang.Object) |  |
| [getClass()](#getClass) |  |
| [getElements()](#getElements) | Gets or sets list of elements on page |
| [getHeight()](#getHeight) | Gets or sets page height |
| [getImageFormat()](#getImageFormat) | Gets or sets the image file format |
| [getImageName()](#getImageName) | Gets or sets the image data |
| [getWidth()](#getWidth) | Gets or sets page width |
| [hashCode()](#hashCode) |  |
| [notify()](#notify) |  |
| [notifyAll()](#notifyAll) |  |
| [setElements(System.Collections.Generic.List<OmrElement> value)](#setElements-com.aspose.ms.System.Collections.Generic.List-com.aspose.omr.OmrElement) | Gets or sets list of elements on page |
| [setHeight(double value)](#setHeight-double) | Gets or sets page height |
| [setImageFormat(String value)](#setImageFormat-java.lang.String) | Gets or sets the image file format |
| [setImageName(String value)](#setImageName-java.lang.String) | Gets or sets the image name |
| [setWidth(double value)](#setWidth-double) | Gets or sets page width |
| [toString()](#toString) |  |
| [wait()](#wait) |  |
| [wait(long arg0)](#wait-long) |  |
| [wait(long arg0, int arg1)](#wait-long-int) |  |
### OmrPage() {#OmrPage}
```
public OmrPage()
```


Initializes a new instance of the [OmrPage](../../com.aspose.omr/omrpage/) class

### addBarcodeElement(BarcodeElement element) {#addBarcodeElement-com.aspose.omr.BarcodeElement}
```
public final void addBarcodeElement(BarcodeElement element)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [BarcodeElement](../../com.aspose.omr/barcodeelement/) |  |

### addChoiceBoxElement(String name, int width, int height, int top, int left) {#addChoiceBoxElement-java.lang.String-int-int-int-int}
```
public final ChoiceBoxElement addChoiceBoxElement(String name, int width, int height, int top, int left)
```


Add choice box element on page

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Element name |
| width | int | Element width |
| height | int | Element height |
| top | int | Element top position |
| left | int | Element left position |

**Returns:**
[ChoiceBoxElement](../../com.aspose.omr/choiceboxelement/) - Created choice box
### addClipAreaElement(String name, int width, int height, int top, int left) {#addClipAreaElement-java.lang.String-int-int-int-int}
```
public final ClipAreaElement addClipAreaElement(String name, int width, int height, int top, int left)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| width | int |  |
| height | int |  |
| top | int |  |
| left | int |  |

**Returns:**
[ClipAreaElement](../../com.aspose.omr/clipareaelement/)
### addGridElement(GridElement grid) {#addGridElement-com.aspose.omr.GridElement}
```
public final void addGridElement(GridElement grid)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| grid | [GridElement](../../com.aspose.omr/gridelement/) |  |

### addGridElement(String name, int width, int height, int top, int left) {#addGridElement-java.lang.String-int-int-int-int}
```
public final GridElement addGridElement(String name, int width, int height, int top, int left)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |
| width | int |  |
| height | int |  |
| top | int |  |
| left | int |  |

**Returns:**
[GridElement](../../com.aspose.omr/gridelement/)
### addRefPointElement(ReferencePointElement item) {#addRefPointElement-com.aspose.omr.ReferencePointElement}
```
public final void addRefPointElement(ReferencePointElement item)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| item | [ReferencePointElement](../../com.aspose.omr/referencepointelement/) |  |

### equals(Object arg0) {#equals-java.lang.Object}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getElements() {#getElements}
```
public final System.Collections.Generic.List<OmrElement> getElements()
```


Gets or sets list of elements on page

**Returns:**
com.aspose.ms.System.Collections.Generic.List<com.aspose.omr.OmrElement> - list of elements on page
### getHeight() {#getHeight}
```
public final double getHeight()
```


Gets or sets page height

**Returns:**
double - page height
### getImageFormat() {#getImageFormat}
```
public final String getImageFormat()
```


Gets or sets the image file format

**Returns:**
java.lang.String - the image file format
### getImageName() {#getImageName}
```
public final String getImageName()
```


Gets or sets the image data

**Returns:**
java.lang.String - the image name
### getWidth() {#getWidth}
```
public final double getWidth()
```


Gets or sets page width

**Returns:**
double - page width
### hashCode() {#hashCode}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify}
```
public final native void notify()
```




### notifyAll() {#notifyAll}
```
public final native void notifyAll()
```




### setElements(System.Collections.Generic.List<OmrElement> value) {#setElements-com.aspose.ms.System.Collections.Generic.List-com.aspose.omr.OmrElement}
```
public final void setElements(System.Collections.Generic.List<OmrElement> value)
```


Gets or sets list of elements on page

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.ms.System.Collections.Generic.List<com.aspose.omr.OmrElement> | list of elements on page |

### setHeight(double value) {#setHeight-double}
```
public final void setHeight(double value)
```


Gets or sets page height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | page height |

### setImageFormat(String value) {#setImageFormat-java.lang.String}
```
public final void setImageFormat(String value)
```


Gets or sets the image file format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | the image file format |

### setImageName(String value) {#setImageName-java.lang.String}
```
public final void setImageName(String value)
```


Gets or sets the image name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | image name |

### setWidth(double value) {#setWidth-double}
```
public final void setWidth(double value)
```


Gets or sets page width

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | page width |

### toString() {#toString}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait}
```
public final void wait()
```




### wait(long arg0) {#wait-long}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

