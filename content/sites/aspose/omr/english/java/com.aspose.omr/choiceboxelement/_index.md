---
title: ChoiceBoxElement
second_title: Aspose.OMR for Java API Reference
description: Represents ChoiceBox question
type: docs
weight: 12
url: /java/com.aspose.omr/choiceboxelement/
---

**Inheritance:**
java.lang.Object, [com.aspose.omr.OmrElement](../../com.aspose.omr/omrelement)
```
public class ChoiceBoxElement extends OmrElement
```

Represents ChoiceBox question
## Constructors

| Constructor | Description |
| --- | --- |
| [ChoiceBoxElement()](#ChoiceBoxElement--) | Initializes a new instance of the [ChoiceBoxElement](../../com.aspose.omr/choiceboxelement) class |
## Fields

| Field | Description |
| --- | --- |
| [ElementType](#ElementType) |  |
## Methods

| Method | Description |
| --- | --- |
| [addBubble(String name, int width, int height, int top, int left, boolean isValid)](#addBubble-java.lang.String-int-int-int-int-boolean-) | Adds bubble inside question |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBubbleHeight()](#getBubbleHeight--) |  |
| [getBubbleWidth()](#getBubbleWidth--) |  |
| [getBubbles()](#getBubbles--) | Gets or sets bubbles collection |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Gets or sets question height |
| [getLeft()](#getLeft--) | Gets or sets question left position |
| [getMultipleSelectionAllowed()](#getMultipleSelectionAllowed--) | Gets or sets a value indicating whether multiple selection is allowed |
| [getName()](#getName--) | Gets question name |
| [getOrientation()](#getOrientation--) |  |
| [getOrientationString()](#getOrientationString--) | Gets string representation of orientation property |
| [getTop()](#getTop--) | Gets or sets question top position |
| [getWidth()](#getWidth--) | Gets or sets question width |
| [hashCode()](#hashCode--) |  |
| [isAlignedHorizontal()](#isAlignedHorizontal--) | Gets or sets a value indicating whether bubbles aligned horizontally |
| [isAlignedVertical()](#isAlignedVertical--) | Gets or sets a value indicating whether bubbles aligned vertically |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAlignedHorizontal(boolean value)](#setAlignedHorizontal-boolean-) | Gets or sets a value indicating whether bubbles aligned horizontally |
| [setAlignedVertical(boolean value)](#setAlignedVertical-boolean-) | Gets or sets a value indicating whether bubbles aligned vertically |
| [setBubbleHeight(double value)](#setBubbleHeight-double-) |  |
| [setBubbleWidth(double value)](#setBubbleWidth-double-) |  |
| [setBubbles(System.Collections.Generic.List<OmrBubble> value)](#setBubbles-com.aspose.ms.System.Collections.Generic.List-com.aspose.omr.OmrBubble--) | Gets or sets bubbles collection |
| [setHeight(double value)](#setHeight-double-) | Gets or sets question height |
| [setLeft(double value)](#setLeft-double-) | Gets or sets question left position |
| [setMultipleSelectionAllowed(boolean value)](#setMultipleSelectionAllowed-boolean-) | Gets or sets a value indicating whether multiple selection is allowed |
| [setName(String value)](#setName-java.lang.String-) | Sets question name |
| [setOrientation(int value)](#setOrientation-int-) |  |
| [setTop(double value)](#setTop-double-) | Gets or sets question top position |
| [setWidth(double value)](#setWidth-double-) | Gets or sets question width |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ChoiceBoxElement() {#ChoiceBoxElement--}
```
public ChoiceBoxElement()
```


Initializes a new instance of the [ChoiceBoxElement](../../com.aspose.omr/choiceboxelement) class

### ElementType {#ElementType}
```
public String ElementType
```


### addBubble(String name, int width, int height, int top, int left, boolean isValid) {#addBubble-java.lang.String-int-int-int-int-boolean-}
```
public final void addBubble(String name, int width, int height, int top, int left, boolean isValid)
```


Adds bubble inside question

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Bubble name |
| width | int | Bubble width |
| height | int | Bubble height |
| top | int | Bubble top position |
| left | int | Bubble left position |
| isValid | boolean | Bubble valid flag |

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
### getBubbleHeight() {#getBubbleHeight--}
```
public final double getBubbleHeight()
```




**Returns:**
double
### getBubbleWidth() {#getBubbleWidth--}
```
public final double getBubbleWidth()
```




**Returns:**
double
### getBubbles() {#getBubbles--}
```
public final System.Collections.Generic.List<OmrBubble> getBubbles()
```


Gets or sets bubbles collection

**Returns:**
com.aspose.ms.System.Collections.Generic.List<com.aspose.omr.OmrBubble> - bubbles collection
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
### getMultipleSelectionAllowed() {#getMultipleSelectionAllowed--}
```
public final boolean getMultipleSelectionAllowed()
```


Gets or sets a value indicating whether multiple selection is allowed

**Returns:**
boolean - value indicating whether multiple selection is allowed
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


Gets string representation of orientation property

**Returns:**
java.lang.String - string representation of orientation property
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

### setBubbleHeight(double value) {#setBubbleHeight-double-}
```
public final void setBubbleHeight(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### setBubbleWidth(double value) {#setBubbleWidth-double-}
```
public final void setBubbleWidth(double value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double |  |

### setBubbles(System.Collections.Generic.List<OmrBubble> value) {#setBubbles-com.aspose.ms.System.Collections.Generic.List-com.aspose.omr.OmrBubble--}
```
public final void setBubbles(System.Collections.Generic.List<OmrBubble> value)
```


Gets or sets bubbles collection

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.ms.System.Collections.Generic.List<com.aspose.omr.OmrBubble> | bubbles collection |

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

### setMultipleSelectionAllowed(boolean value) {#setMultipleSelectionAllowed-boolean-}
```
public final void setMultipleSelectionAllowed(boolean value)
```


Gets or sets a value indicating whether multiple selection is allowed

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether multiple selection is allowed |

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

