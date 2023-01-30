---
title: GridElement
second_title: Aspose.OMR for Java API Reference
description: 
type: docs
weight: 17
url: /java/com.aspose.omr/gridelement/
---

**Inheritance:**
java.lang.Object, [com.aspose.omr.OmrElement](../../com.aspose.omr/omrelement)
```
public class GridElement extends OmrElement
```
## Constructors

| Constructor | Description |
| --- | --- |
| [GridElement()](#GridElement--) |  |
## Fields

| Field | Description |
| --- | --- |
| [ElementType](#ElementType) |  |
## Methods

| Method | Description |
| --- | --- |
| [addChoiceBox(ChoiceBoxElement choiceBox)](#addChoiceBox-com.aspose.omr.ChoiceBoxElement-) |  |
| [addChoiceBox(String name, int width, int height, int top, int left)](#addChoiceBox-java.lang.String-int-int-int-int-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getChoiceBoxes()](#getChoiceBoxes--) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Gets or sets question height |
| [getLeft()](#getLeft--) | Gets or sets question left position |
| [getName()](#getName--) | Gets question name |
| [getOrientation()](#getOrientation--) |  |
| [getOrientationString()](#getOrientationString--) |  |
| [getTop()](#getTop--) | Gets or sets question top position |
| [getWidth()](#getWidth--) | Gets or sets question width |
| [hashCode()](#hashCode--) |  |
| [isAlignedHorizontal()](#isAlignedHorizontal--) | Gets or sets a value indicating whether bubbles aligned horizontally |
| [isAlignedVertical()](#isAlignedVertical--) | Gets or sets a value indicating whether bubbles aligned vertically |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAlignedHorizontal(boolean value)](#setAlignedHorizontal-boolean-) | Gets or sets a value indicating whether bubbles aligned horizontally |
| [setAlignedVertical(boolean value)](#setAlignedVertical-boolean-) | Gets or sets a value indicating whether bubbles aligned vertically |
| [setChoiceBoxes(System.Collections.Generic.List<OmrElement> value)](#setChoiceBoxes-com.aspose.ms.System.Collections.Generic.List-com.aspose.omr.OmrElement--) |  |
| [setHeight(double value)](#setHeight-double-) | Gets or sets question height |
| [setLeft(double value)](#setLeft-double-) | Gets or sets question left position |
| [setName(String value)](#setName-java.lang.String-) | Sets question name |
| [setOrientation(int value)](#setOrientation-int-) |  |
| [setTop(double value)](#setTop-double-) | Gets or sets question top position |
| [setWidth(double value)](#setWidth-double-) | Gets or sets question width |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### GridElement() {#GridElement--}
```
public GridElement()
```


### ElementType {#ElementType}
```
public String ElementType
```


### addChoiceBox(ChoiceBoxElement choiceBox) {#addChoiceBox-com.aspose.omr.ChoiceBoxElement-}
```
public final void addChoiceBox(ChoiceBoxElement choiceBox)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| choiceBox | [ChoiceBoxElement](../../com.aspose.omr/choiceboxelement) |  |

### addChoiceBox(String name, int width, int height, int top, int left) {#addChoiceBox-java.lang.String-int-int-int-int-}
```
public final ChoiceBoxElement addChoiceBox(String name, int width, int height, int top, int left)
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
[ChoiceBoxElement](../../com.aspose.omr/choiceboxelement)
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
### getChoiceBoxes() {#getChoiceBoxes--}
```
public final System.Collections.Generic.List<OmrElement> getChoiceBoxes()
```




**Returns:**
com.aspose.ms.System.Collections.Generic.List<com.aspose.omr.OmrElement>
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public final double getHeight()
```


Gets or sets question height

**Returns:**
double - The height
### getLeft() {#getLeft--}
```
public final double getLeft()
```


Gets or sets question left position

**Returns:**
double - The left
### getName() {#getName--}
```
public final String getName()
```


Gets question name

**Returns:**
java.lang.String - The question name
### getOrientation() {#getOrientation--}
```
public final int getOrientation()
```




**Returns:**
int
### getOrientationString() {#getOrientationString--}
```
public final String getOrientationString()
```




**Returns:**
java.lang.String
### getTop() {#getTop--}
```
public final double getTop()
```


Gets or sets question top position

**Returns:**
double - The top
### getWidth() {#getWidth--}
```
public final double getWidth()
```


Gets or sets question width

**Returns:**
double - The width
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isAlignedHorizontal() {#isAlignedHorizontal--}
```
public final boolean isAlignedHorizontal()
```


Gets or sets a value indicating whether bubbles aligned horizontally

**Returns:**
boolean - value indicating whether bubbles aligned horizontally
### isAlignedVertical() {#isAlignedVertical--}
```
public final boolean isAlignedVertical()
```


Gets or sets a value indicating whether bubbles aligned vertically

**Returns:**
boolean - a value indicating whether bubbles aligned vertically
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAlignedHorizontal(boolean value) {#setAlignedHorizontal-boolean-}
```
public final void setAlignedHorizontal(boolean value)
```


Gets or sets a value indicating whether bubbles aligned horizontally

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether bubbles aligned horizontally |

### setAlignedVertical(boolean value) {#setAlignedVertical-boolean-}
```
public final void setAlignedVertical(boolean value)
```


Gets or sets a value indicating whether bubbles aligned vertically

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether bubbles aligned vertically |

### setChoiceBoxes(System.Collections.Generic.List<OmrElement> value) {#setChoiceBoxes-com.aspose.ms.System.Collections.Generic.List-com.aspose.omr.OmrElement--}
```
public final void setChoiceBoxes(System.Collections.Generic.List<OmrElement> value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.ms.System.Collections.Generic.List<com.aspose.omr.OmrElement> |  |

### setHeight(double value) {#setHeight-double-}
```
public final void setHeight(double value)
```


Gets or sets question height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The height |

### setLeft(double value) {#setLeft-double-}
```
public final void setLeft(double value)
```


Gets or sets question left position

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The left |

### setName(String value) {#setName-java.lang.String-}
```
public final void setName(String value)
```


Sets question name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The question name |

### setOrientation(int value) {#setOrientation-int-}
```
public final void setOrientation(int value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### setTop(double value) {#setTop-double-}
```
public final void setTop(double value)
```


Gets or sets question top position

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The top |

### setWidth(double value) {#setWidth-double-}
```
public final void setWidth(double value)
```


Gets or sets question width

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The width |

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

