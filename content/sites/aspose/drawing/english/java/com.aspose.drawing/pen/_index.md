---
title: Pen
second_title: Aspose.Drawing for Java API Reference
description: Defines an object used to draw lines and curves.
type: docs
weight: 34
url: /java/com.aspose.drawing/pen/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public class Pen implements System.IDisposable
```

Defines an object used to draw lines and curves.
## Constructors

| Constructor | Description |
| --- | --- |
| [Pen(Color color)](#Pen-com.aspose.drawing.Color-) | Initializes a new instance of the [Pen](../../com.aspose.drawing/pen) class with the specified `Color`([.getColor](../../null/\#getColor)/[.setColor(Color)](../../null/\#setColor-Color-)). |
| [Pen(Brush brush, float width)](#Pen-com.aspose.drawing.Brush-float-) | Initializes a new instance of the Pen class with the specified Brush and Width. |
| [Pen(Brush brush)](#Pen-com.aspose.drawing.Brush-) | Initializes a new instance of the [Pen](../../com.aspose.drawing/pen) class with the specified `Brush`([.getBrush](../../null/\#getBrush)/[.setBrush(Brush)](../../null/\#setBrush-Brush-)). |
| [Pen(Color color, float width)](#Pen-com.aspose.drawing.Color-float-) | Initializes a new instance of the Pen class with the specified Color and Width properties. |
## Methods

| Method | Description |
| --- | --- |
| [getColor()](#getColor--) | Gets or sets the color of this [Pen](../../com.aspose.drawing/pen). |
| [setColor(Color value)](#setColor-com.aspose.drawing.Color-) | Gets or sets the color of this [Pen](../../com.aspose.drawing/pen). |
| [getBrush()](#getBrush--) | Gets or sets the Brush that determines attributes of this [Pen](../../com.aspose.drawing/pen). |
| [setBrush(Brush value)](#setBrush-com.aspose.drawing.Brush-) | Gets or sets the Brush that determines attributes of this [Pen](../../com.aspose.drawing/pen). |
| [getCompoundArray()](#getCompoundArray--) | Gets or sets an array of values that specifies a compound pen. |
| [setCompoundArray(float[] value)](#setCompoundArray-float---) | Gets or sets an array of values that specifies a compound pen. |
| [getWidth()](#getWidth--) | Gets or sets the width of this Pen, in units of the Graphics object used for drawing. |
| [setWidth(float value)](#setWidth-float-) | Gets or sets the width of this Pen, in units of the Graphics object used for drawing. |
| [getStartCap()](#getStartCap--) | Gets or sets the cap style used at the beginning of lines drawn with this Pen. |
| [setStartCap(int value)](#setStartCap-int-) | Gets or sets the cap style used at the beginning of lines drawn with this Pen. |
| [getEndCap()](#getEndCap--) | Gets or sets the cap style used at the end of lines drawn with this Pen. |
| [setEndCap(int value)](#setEndCap-int-) | Gets or sets the cap style used at the end of lines drawn with this Pen. |
| [getLineJoin()](#getLineJoin--) | Gets or sets the join style for the ends of two consecutive lines drawn with this Pen. |
| [setLineJoin(int value)](#setLineJoin-int-) | Gets or sets the join style for the ends of two consecutive lines drawn with this Pen. |
| [getMiterLimit()](#getMiterLimit--) | Gets or sets the limit of the thickness of the join on a mitered corner. |
| [setMiterLimit(float value)](#setMiterLimit-float-) | Gets or sets the limit of the thickness of the join on a mitered corner. |
| [getAlignment()](#getAlignment--) | Gets or sets the alignment for this [Pen](../../com.aspose.drawing/pen). |
| [setAlignment(int value)](#setAlignment-int-) | Gets or sets the alignment for this [Pen](../../com.aspose.drawing/pen). |
| [getTransform()](#getTransform--) | Gets or sets a copy of the geometric transformation for this [Pen](../../com.aspose.drawing/pen). |
| [setTransform(Matrix value)](#setTransform-com.aspose.drawing.drawing2d.Matrix-) | Gets or sets a copy of the geometric transformation for this [Pen](../../com.aspose.drawing/pen). |
| [getCustomStartCap()](#getCustomStartCap--) | Gets or sets a custom cap to use at the beginning of lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [setCustomStartCap(CustomLineCap value)](#setCustomStartCap-com.aspose.drawing.drawing2d.CustomLineCap-) | Gets or sets a custom cap to use at the beginning of lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [getCustomEndCap()](#getCustomEndCap--) | Gets or sets a custom cap to use at the end of lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [setCustomEndCap(CustomLineCap value)](#setCustomEndCap-com.aspose.drawing.drawing2d.CustomLineCap-) | Gets or sets a custom cap to use at the end of lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [getDashCap()](#getDashCap--) | Gets or sets the cap style used at the end of the dashes that make up dashed lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [setDashCap(int value)](#setDashCap-int-) | Gets or sets the cap style used at the end of the dashes that make up dashed lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [getDashOffset()](#getDashOffset--) | Gets or sets the distance from the start of a line to the beginning of a dash pattern. |
| [setDashOffset(float value)](#setDashOffset-float-) | Gets or sets the distance from the start of a line to the beginning of a dash pattern. |
| [getDashPattern()](#getDashPattern--) | Gets or sets an array of custom dashes and spaces. |
| [setDashPattern(float[] value)](#setDashPattern-float---) | Gets or sets an array of custom dashes and spaces. |
| [getDashStyle()](#getDashStyle--) | Gets or sets the style used for dashed lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [setDashStyle(int value)](#setDashStyle-int-) | Gets or sets the style used for dashed lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| [getPenType()](#getPenType--) | Gets the style of lines drawn with this Pen. |
| [dispose()](#dispose--) | Releases all resources used by this Pen. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [Pen](../../com.aspose.drawing/pen). |
| [setLineCap(int startCap, int endCap, int dashCap)](#setLineCap-int-int-int-) | Sets the values that determine the style of cap used to end lines drawn by this [Pen](../../com.aspose.drawing/pen). |
| [scaleTransform(float sx, float sy)](#scaleTransform-float-float-) | Scales the local geometric transformation by the specified factors. |
| [scaleTransform(float sx, float sy, int order)](#scaleTransform-float-float-int-) | Scales the local geometric transformation by the specified factors in the specified order. |
| [translateTransform(float dx, float dy)](#translateTransform-float-float-) | Translates the local geometric transformation by the specified dimensions. |
| [translateTransform(float dx, float dy, int order)](#translateTransform-float-float-int-) | Translates the local geometric transformation by the specified dimensions in the specified order. |
| [rotateTransform(float angle)](#rotateTransform-float-) | Rotates the local geometric transformation by the specified angle. |
| [rotateTransform(float angle, int order)](#rotateTransform-float-int-) | Rotates the local geometric transformation by the specified angle in the specified order. |
| [resetTransform()](#resetTransform--) | Resets the geometric transformation matrix for this [Pen](../../com.aspose.drawing/pen) to identity. |
| [multiplyTransform(Matrix matrix)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-) | Multiplies the transformation matrix for this [Pen](../../com.aspose.drawing/pen) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [multiplyTransform(Matrix matrix, int order)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-) | Multiplies the transformation matrix for this [Pen](../../com.aspose.drawing/pen) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) in the specified order. |
### Pen(Color color) {#Pen-com.aspose.drawing.Color-}
```
public Pen(Color color)
```


Initializes a new instance of the [Pen](../../com.aspose.drawing/pen) class with the specified `Color`([.getColor](../../null/\#getColor)/[.setColor(Color)](../../null/\#setColor-Color-)).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [Color](../../com.aspose.drawing/color) | A `Color`([.getColor](../../null/\#getColor)/[.setColor(Color)](../../null/\#setColor-Color-)) that determines the fill properties of this [Pen](../../com.aspose.drawing/pen). |

### Pen(Brush brush, float width) {#Pen-com.aspose.drawing.Brush-float-}
```
public Pen(Brush brush, float width)
```


Initializes a new instance of the Pen class with the specified Brush and Width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | A Brush that determines the characteristics of this Pen. |
| width | float | The width of the new Pen. |

### Pen(Brush brush) {#Pen-com.aspose.drawing.Brush-}
```
public Pen(Brush brush)
```


Initializes a new instance of the [Pen](../../com.aspose.drawing/pen) class with the specified `Brush`([.getBrush](../../null/\#getBrush)/[.setBrush(Brush)](../../null/\#setBrush-Brush-)).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | A `Brush`([.getBrush](../../null/\#getBrush)/[.setBrush(Brush)](../../null/\#setBrush-Brush-)) that determines the fill properties of this [Pen](../../com.aspose.drawing/pen). |

### Pen(Color color, float width) {#Pen-com.aspose.drawing.Color-float-}
```
public Pen(Color color, float width)
```


Initializes a new instance of the Pen class with the specified Color and Width properties.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [Color](../../com.aspose.drawing/color) | A Color structure that indicates the color of this Pen. |
| width | float | A value indicating the width of this Pen. |

### getColor() {#getColor--}
```
public final Color getColor()
```


Gets or sets the color of this [Pen](../../com.aspose.drawing/pen).

Value: A `Color`([.getColor](../../null/\#getColor)/[.setColor(Color)](../../null/\#setColor-Color-)) structure that represents the color of this [Pen](../../com.aspose.drawing/pen).

**Returns:**
[Color](../../com.aspose.drawing/color)
### setColor(Color value) {#setColor-com.aspose.drawing.Color-}
```
public final void setColor(Color value)
```


Gets or sets the color of this [Pen](../../com.aspose.drawing/pen).

Value: A `Color`([.getColor](../../null/\#getColor)/[.setColor(Color)](../../null/\#setColor-Color-)) structure that represents the color of this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Color](../../com.aspose.drawing/color) |  |

### getBrush() {#getBrush--}
```
public final Brush getBrush()
```


Gets or sets the Brush that determines attributes of this [Pen](../../com.aspose.drawing/pen).

**Returns:**
[Brush](../../com.aspose.drawing/brush)
### setBrush(Brush value) {#setBrush-com.aspose.drawing.Brush-}
```
public final void setBrush(Brush value)
```


Gets or sets the Brush that determines attributes of this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Brush](../../com.aspose.drawing/brush) |  |

### getCompoundArray() {#getCompoundArray--}
```
public final float[] getCompoundArray()
```


Gets or sets an array of values that specifies a compound pen. A compound pen draws a compound line made up of parallel lines and spaces.

**Returns:**
float[] - An array of real numbers that specifies the compound array. The elements in the array must be in increasing order, not less than 0, and not greater than 1.
### setCompoundArray(float[] value) {#setCompoundArray-float---}
```
public final void setCompoundArray(float[] value)
```


Gets or sets an array of values that specifies a compound pen. A compound pen draws a compound line made up of parallel lines and spaces.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float[] |  |

### getWidth() {#getWidth--}
```
public final float getWidth()
```


Gets or sets the width of this Pen, in units of the Graphics object used for drawing.

**Returns:**
float
### setWidth(float value) {#setWidth-float-}
```
public final void setWidth(float value)
```


Gets or sets the width of this Pen, in units of the Graphics object used for drawing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float |  |

### getStartCap() {#getStartCap--}
```
public final int getStartCap()
```


Gets or sets the cap style used at the beginning of lines drawn with this Pen.

**Returns:**
int
### setStartCap(int value) {#setStartCap-int-}
```
public final void setStartCap(int value)
```


Gets or sets the cap style used at the beginning of lines drawn with this Pen.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getEndCap() {#getEndCap--}
```
public final int getEndCap()
```


Gets or sets the cap style used at the end of lines drawn with this Pen.

**Returns:**
int
### setEndCap(int value) {#setEndCap-int-}
```
public final void setEndCap(int value)
```


Gets or sets the cap style used at the end of lines drawn with this Pen.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getLineJoin() {#getLineJoin--}
```
public final int getLineJoin()
```


Gets or sets the join style for the ends of two consecutive lines drawn with this Pen.

--------------------

At the moment Miter join actually works as MiterClipped.

**Returns:**
int
### setLineJoin(int value) {#setLineJoin-int-}
```
public final void setLineJoin(int value)
```


Gets or sets the join style for the ends of two consecutive lines drawn with this Pen.

--------------------

At the moment Miter join actually works as MiterClipped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getMiterLimit() {#getMiterLimit--}
```
public final float getMiterLimit()
```


Gets or sets the limit of the thickness of the join on a mitered corner.

**Returns:**
float
### setMiterLimit(float value) {#setMiterLimit-float-}
```
public final void setMiterLimit(float value)
```


Gets or sets the limit of the thickness of the join on a mitered corner.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float |  |

### getAlignment() {#getAlignment--}
```
public final int getAlignment()
```


Gets or sets the alignment for this [Pen](../../com.aspose.drawing/pen).

**Returns:**
int - A [PenAlignment](../../com.aspose.drawing.drawing2d/penalignment) that represents the alignment for this [Pen](../../com.aspose.drawing/pen).
### setAlignment(int value) {#setAlignment-int-}
```
public final void setAlignment(int value)
```


Gets or sets the alignment for this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getTransform() {#getTransform--}
```
public final Matrix getTransform()
```


Gets or sets a copy of the geometric transformation for this [Pen](../../com.aspose.drawing/pen).

Value: A copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the geometric transformation for this [Pen](../../com.aspose.drawing/pen).

**Returns:**
[Matrix](../../com.aspose.drawing.drawing2d/matrix)
### setTransform(Matrix value) {#setTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public final void setTransform(Matrix value)
```


Gets or sets a copy of the geometric transformation for this [Pen](../../com.aspose.drawing/pen).

Value: A copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the geometric transformation for this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix](../../com.aspose.drawing.drawing2d/matrix) |  |

### getCustomStartCap() {#getCustomStartCap--}
```
public final CustomLineCap getCustomStartCap()
```


Gets or sets a custom cap to use at the beginning of lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Returns:**
[CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) - A [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) that represents the cap used at the beginning of lines drawn with this [Pen](../../com.aspose.drawing/pen).
### setCustomStartCap(CustomLineCap value) {#setCustomStartCap-com.aspose.drawing.drawing2d.CustomLineCap-}
```
public final void setCustomStartCap(CustomLineCap value)
```


Gets or sets a custom cap to use at the beginning of lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) |  |

### getCustomEndCap() {#getCustomEndCap--}
```
public final CustomLineCap getCustomEndCap()
```


Gets or sets a custom cap to use at the end of lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Returns:**
[CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) - A [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) that represents the cap used at the end of lines drawn with this [Pen](../../com.aspose.drawing/pen).
### setCustomEndCap(CustomLineCap value) {#setCustomEndCap-com.aspose.drawing.drawing2d.CustomLineCap-}
```
public final void setCustomEndCap(CustomLineCap value)
```


Gets or sets a custom cap to use at the end of lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) |  |

### getDashCap() {#getDashCap--}
```
public final int getDashCap()
```


Gets or sets the cap style used at the end of the dashes that make up dashed lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Returns:**
int - One of the `DashCap`([.getDashCap](../../null/\#getDashCap)/[.setDashCap(int)](../../null/\#setDashCap-int-)) values that represents the cap style used at the beginning and end of the dashes that make up dashed lines drawn with this [Pen](../../com.aspose.drawing/pen).
### setDashCap(int value) {#setDashCap-int-}
```
public final void setDashCap(int value)
```


Gets or sets the cap style used at the end of the dashes that make up dashed lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getDashOffset() {#getDashOffset--}
```
public final float getDashOffset()
```


Gets or sets the distance from the start of a line to the beginning of a dash pattern.

**Returns:**
float - The distance from the start of a line to the beginning of a dash pattern.
### setDashOffset(float value) {#setDashOffset-float-}
```
public final void setDashOffset(float value)
```


Gets or sets the distance from the start of a line to the beginning of a dash pattern.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float |  |

### getDashPattern() {#getDashPattern--}
```
public final float[] getDashPattern()
```


Gets or sets an array of custom dashes and spaces.

**Returns:**
float[] - An array of real numbers that specifies the lengths of alternating dashes and spaces in dashed lines.
### setDashPattern(float[] value) {#setDashPattern-float---}
```
public final void setDashPattern(float[] value)
```


Gets or sets an array of custom dashes and spaces.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float[] |  |

### getDashStyle() {#getDashStyle--}
```
public final int getDashStyle()
```


Gets or sets the style used for dashed lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Returns:**
int - A `DashStyle`([.getDashStyle](../../null/\#getDashStyle)/[.setDashStyle(int)](../../null/\#setDashStyle-int-)) that represents the style used for dashed lines drawn with this [Pen](../../com.aspose.drawing/pen).
### setDashStyle(int value) {#setDashStyle-int-}
```
public final void setDashStyle(int value)
```


Gets or sets the style used for dashed lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getPenType() {#getPenType--}
```
public final int getPenType()
```


Gets the style of lines drawn with this Pen.

Value: A `PenType`([.getPenType](../../null/\#getPenType)) enumeration that specifies the style of lines drawn with this [Pen](../../com.aspose.drawing/pen).

**Returns:**
int
### dispose() {#dispose--}
```
public final void dispose()
```


Releases all resources used by this Pen.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API.

### deepClone() {#deepClone--}
```
public final Object deepClone()
```


Creates an exact copy of this [Pen](../../com.aspose.drawing/pen).

**Returns:**
java.lang.Object - An Object that can be cast to a [Pen](../../com.aspose.drawing/pen).
### setLineCap(int startCap, int endCap, int dashCap) {#setLineCap-int-int-int-}
```
public final void setLineCap(int startCap, int endCap, int dashCap)
```


Sets the values that determine the style of cap used to end lines drawn by this [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startCap | int | A [LineCap](../../com.aspose.drawing.drawing2d/linecap) that represents the cap style to use at the beginning of lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| endCap | int | A [LineCap](../../com.aspose.drawing.drawing2d/linecap) that represents the cap style to use at the end of lines drawn with this [Pen](../../com.aspose.drawing/pen). |
| dashCap | int | A [LineCap](../../com.aspose.drawing.drawing2d/linecap) that represents the cap style to use at the beginning or end of dashed lines drawn with this [Pen](../../com.aspose.drawing/pen). |

### scaleTransform(float sx, float sy) {#scaleTransform-float-float-}
```
public final void scaleTransform(float sx, float sy)
```


Scales the local geometric transformation by the specified factors. This method prepends the scaling matrix to the transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The factor by which to scale the transformation in the x-axis direction. |
| sy | float | The factor by which to scale the transformation in the y-axis direction. |

### scaleTransform(float sx, float sy, int order) {#scaleTransform-float-float-int-}
```
public final void scaleTransform(float sx, float sy, int order)
```


Scales the local geometric transformation by the specified factors in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The factor by which to scale the transformation in the x-axis direction. |
| sy | float | The factor by which to scale the transformation in the y-axis direction. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies whether to append or prepend the scaling matrix. |

### translateTransform(float dx, float dy) {#translateTransform-float-float-}
```
public final void translateTransform(float dx, float dy)
```


Translates the local geometric transformation by the specified dimensions. This method prepends the translation to the transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |

### translateTransform(float dx, float dy, int order) {#translateTransform-float-float-int-}
```
public final void translateTransform(float dx, float dy, int order)
```


Translates the local geometric transformation by the specified dimensions in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |
| order | int | The order (prepend or append) in which to apply the translation. |

### rotateTransform(float angle) {#rotateTransform-float-}
```
public final void rotateTransform(float angle)
```


Rotates the local geometric transformation by the specified angle. This method prepends the rotation to the transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of rotation. |

### rotateTransform(float angle, int order) {#rotateTransform-float-int-}
```
public final void rotateTransform(float angle, int order)
```


Rotates the local geometric transformation by the specified angle in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of rotation. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies whether to append or prepend the rotation matrix. |

### resetTransform() {#resetTransform--}
```
public final void resetTransform()
```


Resets the geometric transformation matrix for this [Pen](../../com.aspose.drawing/pen) to identity.

### multiplyTransform(Matrix matrix) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public final void multiplyTransform(Matrix matrix)
```


Multiplies the transformation matrix for this [Pen](../../com.aspose.drawing/pen) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) object by which to multiply the transformation matrix. |

### multiplyTransform(Matrix matrix, int order) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-}
```
public final void multiplyTransform(Matrix matrix, int order)
```


Multiplies the transformation matrix for this [Pen](../../com.aspose.drawing/pen) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The java.awt.geom.AffineTransform by which to multiply the transformation matrix. |
| order | int | The order in which to perform the multiplication operation. |

