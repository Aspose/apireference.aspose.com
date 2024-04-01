---
title: LinearGradientBrush
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates a  with a linear gradient.
type: docs
weight: 31
url: /java/com.aspose.drawing.drawing2d/lineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.Brush](../../com.aspose.drawing/brush)
```
public final class LinearGradientBrush extends Brush
```

Encapsulates a [Brush](../../com.aspose.drawing/brush) with a linear gradient. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [LinearGradientBrush(PointF point1, PointF point2, Color color1, Color color2)](#LinearGradientBrush-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.Color-com.aspose.drawing.Color-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class with the specified points and colors. |
| [LinearGradientBrush(Point point1, Point point2, Color color1, Color color2)](#LinearGradientBrush-com.aspose.drawing.Point-com.aspose.drawing.Point-com.aspose.drawing.Color-com.aspose.drawing.Color-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class with the specified points and colors. |
| [LinearGradientBrush(RectangleF rect, Color color1, Color color2, int linearGradientMode)](#LinearGradientBrush-com.aspose.drawing.RectangleF-com.aspose.drawing.Color-com.aspose.drawing.Color-int-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation mode. |
| [LinearGradientBrush(Rectangle rect, Color color1, Color color2, int linearGradientMode)](#LinearGradientBrush-com.aspose.drawing.Rectangle-com.aspose.drawing.Color-com.aspose.drawing.Color-int-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and orientation. |
| [LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle)](#LinearGradientBrush-com.aspose.drawing.RectangleF-com.aspose.drawing.Color-com.aspose.drawing.Color-float-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle, boolean isAngleScaleable)](#LinearGradientBrush-com.aspose.drawing.RectangleF-com.aspose.drawing.Color-com.aspose.drawing.Color-float-boolean-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle)](#LinearGradientBrush-com.aspose.drawing.Rectangle-com.aspose.drawing.Color-com.aspose.drawing.Color-float-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
| [LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle, boolean isAngleScaleable)](#LinearGradientBrush-com.aspose.drawing.Rectangle-com.aspose.drawing.Color-com.aspose.drawing.Color-float-boolean-) | Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle. |
## Methods

| Method | Description |
| --- | --- |
| [getLinearColors()](#getLinearColors--) | Gets or sets the starting and ending colors of the gradient. |
| [setLinearColors(Color[] value)](#setLinearColors-com.aspose.drawing.Color---) | Gets or sets the starting and ending colors of the gradient. |
| [getRectangle()](#getRectangle--) | Gets a rectangular region that defines the starting and ending points of the gradient. |
| [getGammaCorrection()](#getGammaCorrection--) | Gets or sets a value indicating whether gamma correction is enabled for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [setGammaCorrection(boolean value)](#setGammaCorrection-boolean-) | Gets or sets a value indicating whether gamma correction is enabled for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [getBlend()](#getBlend--) | Gets or sets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient. |
| [setBlend(Blend value)](#setBlend-com.aspose.drawing.drawing2d.Blend-) | Gets or sets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient. |
| [getInterpolationColors()](#getInterpolationColors--) | Gets or sets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient. |
| [setInterpolationColors(ColorBlend value)](#setInterpolationColors-com.aspose.drawing.drawing2d.ColorBlend-) | Gets or sets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient. |
| [getWrapMode()](#getWrapMode--) | Gets or sets a `WrapMode` enumeration that indicates the wrap mode for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [setWrapMode(int value)](#setWrapMode-int-) | Gets or sets a `WrapMode` enumeration that indicates the wrap mode for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [getTransform()](#getTransform--) | Gets or sets a copy [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [setTransform(Matrix value)](#setTransform-com.aspose.drawing.drawing2d.Matrix-) | Gets or sets a copy [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [deepClone()](#deepClone--) | Creates an exact copy of this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush). |
| [setSigmaBellShape(float focus)](#setSigmaBellShape-float-) | Creates a gradient falloff based on a bell-shaped curve. |
| [setSigmaBellShape(float focus, float scale)](#setSigmaBellShape-float-float-) | Creates a gradient falloff based on a bell-shaped curve. |
| [setBlendTriangularShape(float focus)](#setBlendTriangularShape-float-) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [setBlendTriangularShape(float focus, float scale)](#setBlendTriangularShape-float-float-) | Creates a linear gradient with a center color and a linear falloff to a single color on both ends. |
| [resetTransform()](#resetTransform--) | Resets the `LinearGradientBrush.Transform` property to identity. |
| [multiplyTransform(Matrix matrix)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-) | Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the local geometric transform of this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) by prepending the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [multiplyTransform(Matrix matrix, int order)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-) | Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the local geometric transform of this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) in the specified order. |
| [translateTransform(float dx, float dy)](#translateTransform-float-float-) | Translates the local geometric transform by the specified dimensions. |
| [translateTransform(float dx, float dy, int order)](#translateTransform-float-float-int-) | Translates the local geometric transform by the specified dimensions in the specified order. |
| [scaleTransform(float sx, float sy)](#scaleTransform-float-float-) | Scales the local geometric transform by the specified amounts. |
| [scaleTransform(float sx, float sy, int order)](#scaleTransform-float-float-int-) | Scales the local geometric transform by the specified amounts in the specified order. |
| [rotateTransform(float angle)](#rotateTransform-float-) | Rotates the local geometric transform by the specified amount. |
| [rotateTransform(float angle, int order)](#rotateTransform-float-int-) | Rotates the local geometric transform by the specified amount in the specified order. |
### LinearGradientBrush(PointF point1, PointF point2, Color color1, Color color2) {#LinearGradientBrush-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.Color-com.aspose.drawing.Color-}
```
public LinearGradientBrush(PointF point1, PointF point2, Color color1, Color color2)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class with the specified points and colors.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point1 | [PointF](../../com.aspose.drawing/pointf) | A [PointF](../../com.aspose.drawing/pointf) structure that represents the starting point of the linear gradient. |
| point2 | [PointF](../../com.aspose.drawing/pointf) | A [PointF](../../com.aspose.drawing/pointf) structure that represents the endpoint of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color of the linear gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color of the linear gradient. |

### LinearGradientBrush(Point point1, Point point2, Color color1, Color color2) {#LinearGradientBrush-com.aspose.drawing.Point-com.aspose.drawing.Point-com.aspose.drawing.Color-com.aspose.drawing.Color-}
```
public LinearGradientBrush(Point point1, Point point2, Color color1, Color color2)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class with the specified points and colors.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point1 | [Point](../../com.aspose.drawing/point) | A [Point](../../com.aspose.drawing/point) structure that represents the starting point of the linear gradient. |
| point2 | [Point](../../com.aspose.drawing/point) | A [Point](../../com.aspose.drawing/point) structure that represents the endpoint of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color of the linear gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color of the linear gradient. |

### LinearGradientBrush(RectangleF rect, Color color1, Color color2, int linearGradientMode) {#LinearGradientBrush-com.aspose.drawing.RectangleF-com.aspose.drawing.Color-com.aspose.drawing.Color-int-}
```
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, int linearGradientMode)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the bounds of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color for the gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color for the gradient. |
| linearGradientMode | int | A [LinearGradientMode](../../com.aspose.drawing.drawing2d/lineargradientmode) enumeration element that specifies the orientation of the gradient. The orientation determines the starting and ending points of the gradient. For example, LinearGradientMode.ForwardDiagonal specifies that the starting point is the upper-left corner of the rectangle and the ending point is the lower-right corner of the rectangle. |

### LinearGradientBrush(Rectangle rect, Color color1, Color color2, int linearGradientMode) {#LinearGradientBrush-com.aspose.drawing.Rectangle-com.aspose.drawing.Color-com.aspose.drawing.Color-int-}
```
public LinearGradientBrush(Rectangle rect, Color color1, Color color2, int linearGradientMode)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and orientation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A `Rectangle`([.getRectangle](../../null/\#getRectangle)) structure that specifies the bounds of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color for the gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color for the gradient. |
| linearGradientMode | int | A [LinearGradientMode](../../com.aspose.drawing.drawing2d/lineargradientmode) enumeration element that specifies the orientation of the gradient. The orientation determines the starting and ending points of the gradient. For example, LinearGradientMode.ForwardDiagonal specifies that the starting point is the upper-left corner of the rectangle and the ending point is the lower-right corner of the rectangle. |

### LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle) {#LinearGradientBrush-com.aspose.drawing.RectangleF-com.aspose.drawing.Color-com.aspose.drawing.Color-float-}
```
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the bounds of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color for the gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color for the gradient. |
| angle | float | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |

### LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle, boolean isAngleScaleable) {#LinearGradientBrush-com.aspose.drawing.RectangleF-com.aspose.drawing.Color-com.aspose.drawing.Color-float-boolean-}
```
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle, boolean isAngleScaleable)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the bounds of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color for the gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color for the gradient. |
| angle | float | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |
| isAngleScaleable | boolean | Set to true to specify that the angle is affected by the transform associated with this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush); otherwise, false. |

### LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle) {#LinearGradientBrush-com.aspose.drawing.Rectangle-com.aspose.drawing.Color-com.aspose.drawing.Color-float-}
```
public LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A `Rectangle`([.getRectangle](../../null/\#getRectangle)) structure that specifies the bounds of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color for the gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color for the gradient. |
| angle | float | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |

### LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle, boolean isAngleScaleable) {#LinearGradientBrush-com.aspose.drawing.Rectangle-com.aspose.drawing.Color-com.aspose.drawing.Color-float-boolean-}
```
public LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle, boolean isAngleScaleable)
```


Initializes a new instance of the [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) class based on a rectangle, starting and ending colors, and an orientation angle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A `Rectangle`([.getRectangle](../../null/\#getRectangle)) structure that specifies the bounds of the linear gradient. |
| color1 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the starting color for the gradient. |
| color2 | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the ending color for the gradient. |
| angle | float | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |
| isAngleScaleable | boolean | Set to true to specify that the angle is affected by the transform associated with this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush); otherwise, false. |

### getLinearColors() {#getLinearColors--}
```
public Color[] getLinearColors()
```


Gets or sets the starting and ending colors of the gradient.

**Returns:**
com.aspose.drawing.Color[]
### setLinearColors(Color[] value) {#setLinearColors-com.aspose.drawing.Color---}
```
public void setLinearColors(Color[] value)
```


Gets or sets the starting and ending colors of the gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Color\[\]](../../com.aspose.drawing/color) |  |

### getRectangle() {#getRectangle--}
```
public RectangleF getRectangle()
```


Gets a rectangular region that defines the starting and ending points of the gradient.

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef)
### getGammaCorrection() {#getGammaCorrection--}
```
public boolean getGammaCorrection()
```


Gets or sets a value indicating whether gamma correction is enabled for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Returns:**
boolean
### setGammaCorrection(boolean value) {#setGammaCorrection-boolean-}
```
public void setGammaCorrection(boolean value)
```


Gets or sets a value indicating whether gamma correction is enabled for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### getBlend() {#getBlend--}
```
public Blend getBlend()
```


Gets or sets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient.

**Returns:**
[Blend](../../com.aspose.drawing.drawing2d/blend)
### setBlend(Blend value) {#setBlend-com.aspose.drawing.drawing2d.Blend-}
```
public void setBlend(Blend value)
```


Gets or sets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Blend](../../com.aspose.drawing.drawing2d/blend) |  |

### getInterpolationColors() {#getInterpolationColors--}
```
public ColorBlend getInterpolationColors()
```


Gets or sets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient.

**Returns:**
[ColorBlend](../../com.aspose.drawing.drawing2d/colorblend)
### setInterpolationColors(ColorBlend value) {#setInterpolationColors-com.aspose.drawing.drawing2d.ColorBlend-}
```
public void setInterpolationColors(ColorBlend value)
```


Gets or sets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) |  |

### getWrapMode() {#getWrapMode--}
```
public int getWrapMode()
```


Gets or sets a `WrapMode` enumeration that indicates the wrap mode for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Returns:**
int
### setWrapMode(int value) {#setWrapMode-int-}
```
public void setWrapMode(int value)
```


Gets or sets a `WrapMode` enumeration that indicates the wrap mode for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getTransform() {#getTransform--}
```
public Matrix getTransform()
```


Gets or sets a copy [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Returns:**
[Matrix](../../com.aspose.drawing.drawing2d/matrix)
### setTransform(Matrix value) {#setTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public void setTransform(Matrix value)
```


Gets or sets a copy [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix](../../com.aspose.drawing.drawing2d/matrix) |  |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Creates an exact copy of this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush).

**Returns:**
java.lang.Object - The [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) this method creates, cast as an object.
### setSigmaBellShape(float focus) {#setSigmaBellShape-float-}
```
public void setSigmaBellShape(float focus)
```


Creates a gradient falloff based on a bell-shaped curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies the center of the gradient (the point where the starting color and ending color are blended equally). |

### setSigmaBellShape(float focus, float scale) {#setSigmaBellShape-float-float-}
```
public void setSigmaBellShape(float focus, float scale)
```


Creates a gradient falloff based on a bell-shaped curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies the center of the gradient (the point where the gradient is composed of only the ending color). |
| scale | float | A value from 0 through 1 that specifies how fast the colors falloff from the `focus`. |

### setBlendTriangularShape(float focus) {#setBlendTriangularShape-float-}
```
public void setBlendTriangularShape(float focus)
```


Creates a linear gradient with a center color and a linear falloff to a single color on both ends.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies the center of the gradient (the point where the gradient is composed of only the ending color). |

### setBlendTriangularShape(float focus, float scale) {#setBlendTriangularShape-float-float-}
```
public void setBlendTriangularShape(float focus, float scale)
```


Creates a linear gradient with a center color and a linear falloff to a single color on both ends.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies the center of the gradient (the point where the gradient is composed of only the ending color). |
| scale | float | A value from 0 through 1 that specifies how fast the colors falloff from the starting color to `focus` (ending color) |

### resetTransform() {#resetTransform--}
```
public void resetTransform()
```


Resets the `LinearGradientBrush.Transform` property to identity.

### multiplyTransform(Matrix matrix) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public void multiplyTransform(Matrix matrix)
```


Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the local geometric transform of this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) by prepending the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which to multiply the geometric transform. |

### multiplyTransform(Matrix matrix, int order) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-}
```
public void multiplyTransform(Matrix matrix, int order)
```


Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the local geometric transform of this [LinearGradientBrush](../../com.aspose.drawing.drawing2d/lineargradientbrush) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which to multiply the geometric transform. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies in which order to multiply the two matrices. |

### translateTransform(float dx, float dy) {#translateTransform-float-float-}
```
public void translateTransform(float dx, float dy)
```


Translates the local geometric transform by the specified dimensions. This method prepends the translation to the transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |

### translateTransform(float dx, float dy, int order) {#translateTransform-float-float-int-}
```
public void translateTransform(float dx, float dy, int order)
```


Translates the local geometric transform by the specified dimensions in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |
| order | int | The order (prepend or append) in which to apply the translation. |

### scaleTransform(float sx, float sy) {#scaleTransform-float-float-}
```
public void scaleTransform(float sx, float sy)
```


Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The amount by which to scale the transform in the x-axis direction. |
| sy | float | The amount by which to scale the transform in the y-axis direction. |

### scaleTransform(float sx, float sy, int order) {#scaleTransform-float-float-int-}
```
public void scaleTransform(float sx, float sy, int order)
```


Scales the local geometric transform by the specified amounts in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The amount by which to scale the transform in the x-axis direction. |
| sy | float | The amount by which to scale the transform in the y-axis direction. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies whether to append or prepend the scaling matrix. |

### rotateTransform(float angle) {#rotateTransform-float-}
```
public void rotateTransform(float angle)
```


Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of rotation. |

### rotateTransform(float angle, int order) {#rotateTransform-float-int-}
```
public void rotateTransform(float angle, int order)
```


Rotates the local geometric transform by the specified amount in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of rotation. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies whether to append or prepend the rotation matrix. |

