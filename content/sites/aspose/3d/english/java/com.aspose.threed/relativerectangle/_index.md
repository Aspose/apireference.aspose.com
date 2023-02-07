---
title: RelativeRectangle
second_title: Aspose.3D for Java API Reference
description: Relative rectangle The formula between relative component to absolute value is Scale  Reference Width  offset So if we want it to represent an absolute value leave all scale fields zero and use offset fields instead.
type: docs
weight: 132
url: /java/com.aspose.threed/relativerectangle/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.csporter.helpers.Struct, java.io.Serializable
```
public final class RelativeRectangle implements Struct<RelativeRectangle>, Serializable
```

Relative rectangle The formula between relative component to absolute value is: Scale \* (Reference Width) + offset So if we want it to represent an absolute value, leave all scale fields zero, and use offset fields instead.
## Constructors

| Constructor | Description |
| --- | --- |
| [RelativeRectangle()](#RelativeRectangle--) |  |
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [copyFrom(RelativeRectangle src)](#copyFrom-com.aspose.threed.RelativeRectangle-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
| [fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight)](#fromScale-float-float-float-float-) | Construct a [RelativeRectangle](../../com.aspose.threed/relativerectangle) with all offset fields zero and scale fields from given parameters. |
| [getClass()](#getClass--) |  |
| [getOffsetHeight()](#getOffsetHeight--) | Gets the offset for height |
| [getOffsetWidth()](#getOffsetWidth--) | Gets the offset for width |
| [getOffsetX()](#getOffsetX--) | Gets the offset for coordinate X |
| [getOffsetY()](#getOffsetY--) | Gets the offset for coordinate Y |
| [getScaleHeight()](#getScaleHeight--) | Relative height |
| [getScaleWidth()](#getScaleWidth--) | Relative width |
| [getScaleX()](#getScaleX--) | Relative coordinate X |
| [getScaleY()](#getScaleY--) | Relative coordinate Y |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOffsetHeight(int value)](#setOffsetHeight-int-) | Sets the offset for height |
| [setOffsetWidth(int value)](#setOffsetWidth-int-) | Sets the offset for width |
| [setOffsetX(int value)](#setOffsetX-int-) | Sets the offset for coordinate X |
| [setOffsetY(int value)](#setOffsetY-int-) | Sets the offset for coordinate Y |
| [setScaleHeight(float value)](#setScaleHeight-float-) | Relative height |
| [setScaleWidth(float value)](#setScaleWidth-float-) | Relative width |
| [setScaleX(float value)](#setScaleX-float-) | Relative coordinate X |
| [setScaleY(float value)](#setScaleY-float-) | Relative coordinate Y |
| [toAbsolute(Dimension rect)](#toAbsolute-java.awt.Dimension-) | Convert the relative rectangle to absolute rectangle |
| [toAbsolute(Rectangle rect)](#toAbsolute-java.awt.Rectangle-) | Convert the relative rectangle to absolute rectangle |
| [toString()](#toString--) | Converts the value of this instance to a java.lang.String. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RelativeRectangle() {#RelativeRectangle--}
```
public RelativeRectangle()
```


### clone() {#clone--}
```
public RelativeRectangle clone()
```




**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle)
### copyFrom(RelativeRectangle src) {#copyFrom-com.aspose.threed.RelativeRectangle-}
```
public void copyFrom(RelativeRectangle src)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| src | [RelativeRectangle](../../com.aspose.threed/relativerectangle) |  |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight) {#fromScale-float-float-float-float-}
```
public static RelativeRectangle fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight)
```


Construct a [RelativeRectangle](../../com.aspose.threed/relativerectangle) with all offset fields zero and scale fields from given parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float |  |
| scaleY | float |  |
| scaleWidth | float |  |
| scaleHeight | float |  |

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOffsetHeight() {#getOffsetHeight--}
```
public int getOffsetHeight()
```


Gets the offset for height

**Returns:**
int
### getOffsetWidth() {#getOffsetWidth--}
```
public int getOffsetWidth()
```


Gets the offset for width

**Returns:**
int
### getOffsetX() {#getOffsetX--}
```
public int getOffsetX()
```


Gets the offset for coordinate X

**Returns:**
int
### getOffsetY() {#getOffsetY--}
```
public int getOffsetY()
```


Gets the offset for coordinate Y

**Returns:**
int
### getScaleHeight() {#getScaleHeight--}
```
public float getScaleHeight()
```


Relative height

**Returns:**
float
### getScaleWidth() {#getScaleWidth--}
```
public float getScaleWidth()
```


Relative width

**Returns:**
float
### getScaleX() {#getScaleX--}
```
public float getScaleX()
```


Relative coordinate X

**Returns:**
float
### getScaleY() {#getScaleY--}
```
public float getScaleY()
```


Relative coordinate Y

**Returns:**
float
### hashCode() {#hashCode--}
```
public int hashCode()
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




### setOffsetHeight(int value) {#setOffsetHeight-int-}
```
public void setOffsetHeight(int value)
```


Sets the offset for height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setOffsetWidth(int value) {#setOffsetWidth-int-}
```
public void setOffsetWidth(int value)
```


Sets the offset for width

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setOffsetX(int value) {#setOffsetX-int-}
```
public void setOffsetX(int value)
```


Sets the offset for coordinate X

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setOffsetY(int value) {#setOffsetY-int-}
```
public void setOffsetY(int value)
```


Sets the offset for coordinate Y

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setScaleHeight(float value) {#setScaleHeight-float-}
```
public void setScaleHeight(float value)
```


Relative height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setScaleWidth(float value) {#setScaleWidth-float-}
```
public void setScaleWidth(float value)
```


Relative width

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setScaleX(float value) {#setScaleX-float-}
```
public void setScaleX(float value)
```


Relative coordinate X

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setScaleY(float value) {#setScaleY-float-}
```
public void setScaleY(float value)
```


Relative coordinate Y

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### toAbsolute(Dimension rect) {#toAbsolute-java.awt.Dimension-}
```
public Rectangle toAbsolute(Dimension rect)
```


Convert the relative rectangle to absolute rectangle

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | java.awt.Dimension |  |

**Returns:**
java.awt.Rectangle
### toAbsolute(Rectangle rect) {#toAbsolute-java.awt.Rectangle-}
```
public Rectangle toAbsolute(Rectangle rect)
```


Convert the relative rectangle to absolute rectangle

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | java.awt.Rectangle |  |

**Returns:**
java.awt.Rectangle
### toString() {#toString--}
```
public String toString()
```


Converts the value of this instance to a java.lang.String.

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

