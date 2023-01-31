---
title: RelativeRectangle
second_title: Aspose.3D for Java API Reference
description: Relative rectangle
 The formula between relative component to absolute value is
 Scale  Reference Width  offset
 So if we want it to represent an absolute value leave all scale fields zero and use offset fields instead.
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
| [getScaleX()](#getScaleX--) | Relative coordinate X |
| [setScaleX(float value)](#setScaleX-float-) | Relative coordinate X |
| [getScaleY()](#getScaleY--) | Relative coordinate Y |
| [setScaleY(float value)](#setScaleY-float-) | Relative coordinate Y |
| [getScaleWidth()](#getScaleWidth--) | Relative width |
| [setScaleWidth(float value)](#setScaleWidth-float-) | Relative width |
| [getScaleHeight()](#getScaleHeight--) | Relative height |
| [setScaleHeight(float value)](#setScaleHeight-float-) | Relative height |
| [getOffsetX()](#getOffsetX--) | Gets the offset for coordinate X |
| [setOffsetX(int value)](#setOffsetX-int-) | Sets the offset for coordinate X |
| [getOffsetY()](#getOffsetY--) | Gets the offset for coordinate Y |
| [setOffsetY(int value)](#setOffsetY-int-) | Sets the offset for coordinate Y |
| [getOffsetWidth()](#getOffsetWidth--) | Gets the offset for width |
| [setOffsetWidth(int value)](#setOffsetWidth-int-) | Sets the offset for width |
| [getOffsetHeight()](#getOffsetHeight--) | Gets the offset for height |
| [setOffsetHeight(int value)](#setOffsetHeight-int-) | Sets the offset for height |
| [toAbsolute(Dimension rect)](#toAbsolute-java.awt.Dimension-) | Convert the relative rectangle to absolute rectangle |
| [toAbsolute(Rectangle rect)](#toAbsolute-java.awt.Rectangle-) | Convert the relative rectangle to absolute rectangle |
| [fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight)](#fromScale-float-float-float-float-) | Construct a com.aspose.threed.RelativeRectangle with all offset fields zero and scale fields from given parameters. |
| [toString()](#toString--) | Converts the value of this instance to a java.lang.String. |
| [clone()](#clone--) |  |
| [copyFrom(RelativeRectangle src)](#copyFrom-com.aspose.threed.RelativeRectangle-) |  |
| [hashCode()](#hashCode--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) |  |
### RelativeRectangle() {#RelativeRectangle--}
```
public RelativeRectangle()
```


### getScaleX() {#getScaleX--}
```
public float getScaleX()
```


Relative coordinate X

**Returns:**
float
### setScaleX(float value) {#setScaleX-float-}
```
public void setScaleX(float value)
```


Relative coordinate X

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getScaleY() {#getScaleY--}
```
public float getScaleY()
```


Relative coordinate Y

**Returns:**
float
### setScaleY(float value) {#setScaleY-float-}
```
public void setScaleY(float value)
```


Relative coordinate Y

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getScaleWidth() {#getScaleWidth--}
```
public float getScaleWidth()
```


Relative width

**Returns:**
float
### setScaleWidth(float value) {#setScaleWidth-float-}
```
public void setScaleWidth(float value)
```


Relative width

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getScaleHeight() {#getScaleHeight--}
```
public float getScaleHeight()
```


Relative height

**Returns:**
float
### setScaleHeight(float value) {#setScaleHeight-float-}
```
public void setScaleHeight(float value)
```


Relative height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### getOffsetX() {#getOffsetX--}
```
public int getOffsetX()
```


Gets the offset for coordinate X

**Returns:**
int
### setOffsetX(int value) {#setOffsetX-int-}
```
public void setOffsetX(int value)
```


Sets the offset for coordinate X

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getOffsetY() {#getOffsetY--}
```
public int getOffsetY()
```


Gets the offset for coordinate Y

**Returns:**
int
### setOffsetY(int value) {#setOffsetY-int-}
```
public void setOffsetY(int value)
```


Sets the offset for coordinate Y

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getOffsetWidth() {#getOffsetWidth--}
```
public int getOffsetWidth()
```


Gets the offset for width

**Returns:**
int
### setOffsetWidth(int value) {#setOffsetWidth-int-}
```
public void setOffsetWidth(int value)
```


Sets the offset for width

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getOffsetHeight() {#getOffsetHeight--}
```
public int getOffsetHeight()
```


Gets the offset for height

**Returns:**
int
### setOffsetHeight(int value) {#setOffsetHeight-int-}
```
public void setOffsetHeight(int value)
```


Sets the offset for height

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

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
### fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight) {#fromScale-float-float-float-float-}
```
public static RelativeRectangle fromScale(float scaleX, float scaleY, float scaleWidth, float scaleHeight)
```


Construct a com.aspose.threed.RelativeRectangle with all offset fields zero and scale fields from given parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scaleX | float |  |
| scaleY | float |  |
| scaleWidth | float |  |
| scaleHeight | float |  |

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle)
### toString() {#toString--}
```
public String toString()
```


Converts the value of this instance to a java.lang.String.

**Returns:**
java.lang.String
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

### hashCode() {#hashCode--}
```
public int hashCode()
```




**Returns:**
int
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
