---
title: PathGradientBrush
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates a  object that fills the interior of a  object with a gradient.
type: docs
weight: 36
url: /java/com.aspose.drawing.drawing2d/pathgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.Brush](../../com.aspose.drawing/brush)
```
public final class PathGradientBrush extends Brush
```

Encapsulates a [Brush](../../com.aspose.drawing/brush) object that fills the interior of a [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object with a gradient. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [PathGradientBrush(PointF[] points)](#PathGradientBrush-com.aspose.drawing.PointF---) | Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points. |
| [PathGradientBrush(PointF[] points, int wrapMode)](#PathGradientBrush-com.aspose.drawing.PointF---int-) | Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points and wrap mode. |
| [PathGradientBrush(Point[] points)](#PathGradientBrush-com.aspose.drawing.Point---) | Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points. |
| [PathGradientBrush(Point[] points, int wrapMode)](#PathGradientBrush-com.aspose.drawing.Point---int-) | Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points and wrap mode. |
| [PathGradientBrush(GraphicsPath path)](#PathGradientBrush-com.aspose.drawing.drawing2d.GraphicsPath-) | Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified path. |
## Methods

| Method | Description |
| --- | --- |
| [getCenterColor()](#getCenterColor--) | Gets the color at the center of the path gradient. |
| [setCenterColor(Color value)](#setCenterColor-com.aspose.drawing.Color-) | Sets the color at the center of the path gradient. |
| [getSurroundColors()](#getSurroundColors--) | Gets an array of colors that correspond to the points in the path this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) fills. |
| [setSurroundColors(Color[] value)](#setSurroundColors-com.aspose.drawing.Color---) | Sets an array of colors that correspond to the points in the path this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) fills. |
| [getCenterPoint()](#getCenterPoint--) | Gets the center point of the path gradient. |
| [setCenterPoint(PointF value)](#setCenterPoint-com.aspose.drawing.PointF-) | Sets the center point of the path gradient. |
| [getRectangle()](#getRectangle--) | Gets a bounding rectangle for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |
| [getBlend()](#getBlend--) | Gets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient. |
| [setBlend(Blend value)](#setBlend-com.aspose.drawing.drawing2d.Blend-) | Sets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient. |
| [getInterpolationColors()](#getInterpolationColors--) | Gets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient. |
| [setInterpolationColors(ColorBlend value)](#setInterpolationColors-com.aspose.drawing.drawing2d.ColorBlend-) | Sets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient. |
| [getTransform()](#getTransform--) | Gets a copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |
| [setTransform(Matrix value)](#setTransform-com.aspose.drawing.drawing2d.Matrix-) | Sets a copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |
| [getFocusScales()](#getFocusScales--) | Gets the focus point for the gradient falloff. |
| [setFocusScales(PointF value)](#setFocusScales-com.aspose.drawing.PointF-) | Sets the focus point for the gradient falloff. |
| [getWrapMode()](#getWrapMode--) | Gets a `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that indicates the wrap mode for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |
| [setWrapMode(int value)](#setWrapMode-int-) | Sets a `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that indicates the wrap mode for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |
| [deepClone()](#deepClone--) | Creates an exact copy of this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |
| [setSigmaBellShape(float focus)](#setSigmaBellShape-float-) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. |
| [setSigmaBellShape(float focus, float scale)](#setSigmaBellShape-float-float-) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. |
| [setBlendTriangularShape(float focus)](#setBlendTriangularShape-float-) | Creates a gradient with a center color and a linear falloff to one surrounding color. |
| [setBlendTriangularShape(float focus, float scale)](#setBlendTriangularShape-float-float-) | Creates a gradient with a center color and a linear falloff to each surrounding color. |
| [resetTransform()](#resetTransform--) | Resets the `P:PathGradientBrush.Transform` property to identity. |
| [multiplyTransform(Matrix matrix)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-) | Updates the brush's transformation matrix with the product of brush's transformation matrix multiplied by another matrix. |
| [multiplyTransform(Matrix matrix, int order)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-) | Updates the brush's transformation matrix with the product of the brush's transformation matrix multiplied by another matrix. |
| [translateTransform(float dx, float dy)](#translateTransform-float-float-) | Applies the specified translation to the local geometric transform. |
| [translateTransform(float dx, float dy, int order)](#translateTransform-float-float-int-) | Applies the specified translation to the local geometric transform in the specified order. |
| [scaleTransform(float sx, float sy)](#scaleTransform-float-float-) | Scales the local geometric transform by the specified amounts. |
| [scaleTransform(float sx, float sy, int order)](#scaleTransform-float-float-int-) | Scales the local geometric transform by the specified amounts in the specified order. |
| [rotateTransform(float angle)](#rotateTransform-float-) | Rotates the local geometric transform by the specified amount. |
| [rotateTransform(float angle, int order)](#rotateTransform-float-int-) | Rotates the local geometric transform by the specified amount in the specified order. |
### PathGradientBrush(PointF[] points) {#PathGradientBrush-com.aspose.drawing.PointF---}
```
public PathGradientBrush(PointF[] points)
```


Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points that make up the vertices of the path. |

### PathGradientBrush(PointF[] points, int wrapMode) {#PathGradientBrush-com.aspose.drawing.PointF---int-}
```
public PathGradientBrush(PointF[] points, int wrapMode)
```


Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points and wrap mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points that make up the vertices of the path. |
| wrapMode | int | A `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that specifies how fills drawn with this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) are tiled. |

### PathGradientBrush(Point[] points) {#PathGradientBrush-com.aspose.drawing.Point---}
```
public PathGradientBrush(Point[] points)
```


Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that represents the points that make up the vertices of the path. |

### PathGradientBrush(Point[] points, int wrapMode) {#PathGradientBrush-com.aspose.drawing.Point---int-}
```
public PathGradientBrush(Point[] points, int wrapMode)
```


Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified points and wrap mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that represents the points that make up the vertices of the path. |
| wrapMode | int | A `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that specifies how fills drawn with this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) are tiled. |

### PathGradientBrush(GraphicsPath path) {#PathGradientBrush-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public PathGradientBrush(GraphicsPath path)
```


Initializes a new instance of the [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) class with the specified path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) that defines the area filled by this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |

### getCenterColor() {#getCenterColor--}
```
public Color getCenterColor()
```


Gets the color at the center of the path gradient.

**Returns:**
[Color](../../com.aspose.drawing/color) - the color at the center of the path gradient.
### setCenterColor(Color value) {#setCenterColor-com.aspose.drawing.Color-}
```
public void setCenterColor(Color value)
```


Sets the color at the center of the path gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Color](../../com.aspose.drawing/color) | the color at the center of the path gradient. |

### getSurroundColors() {#getSurroundColors--}
```
public Color[] getSurroundColors()
```


Gets an array of colors that correspond to the points in the path this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) fills.

**Returns:**
com.aspose.drawing.Color[] - an array of colors that correspond to the points in the path this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) fills.
### setSurroundColors(Color[] value) {#setSurroundColors-com.aspose.drawing.Color---}
```
public void setSurroundColors(Color[] value)
```


Sets an array of colors that correspond to the points in the path this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) fills.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Color\[\]](../../com.aspose.drawing/color) | an array of colors that correspond to the points in the path this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) fills. |

### getCenterPoint() {#getCenterPoint--}
```
public PointF getCenterPoint()
```


Gets the center point of the path gradient.

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - the center point of the path gradient.
### setCenterPoint(PointF value) {#setCenterPoint-com.aspose.drawing.PointF-}
```
public void setCenterPoint(PointF value)
```


Sets the center point of the path gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PointF](../../com.aspose.drawing/pointf) | the center point of the path gradient. |

### getRectangle() {#getRectangle--}
```
public RectangleF getRectangle()
```


Gets a bounding rectangle for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - a bounding rectangle for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).
### getBlend() {#getBlend--}
```
public Blend getBlend()
```


Gets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient.

**Returns:**
[Blend](../../com.aspose.drawing.drawing2d/blend) - a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient.
### setBlend(Blend value) {#setBlend-com.aspose.drawing.drawing2d.Blend-}
```
public void setBlend(Blend value)
```


Sets a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Blend](../../com.aspose.drawing.drawing2d/blend) | a `Blend`([.getBlend](../../null/\#getBlend)/[.setBlend(Blend)](../../null/\#setBlend-Blend-)) that specifies positions and factors that define a custom falloff for the gradient. |

### getInterpolationColors() {#getInterpolationColors--}
```
public ColorBlend getInterpolationColors()
```


Gets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient.

**Returns:**
[ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) - a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient.
### setInterpolationColors(ColorBlend value) {#setInterpolationColors-com.aspose.drawing.drawing2d.ColorBlend-}
```
public void setInterpolationColors(ColorBlend value)
```


Sets a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) | a [ColorBlend](../../com.aspose.drawing.drawing2d/colorblend) that defines a multicolor linear gradient. |

### getTransform() {#getTransform--}
```
public Matrix getTransform()
```


Gets a copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).

**Returns:**
[Matrix](../../com.aspose.drawing.drawing2d/matrix) - a copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).
### setTransform(Matrix value) {#setTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public void setTransform(Matrix value)
```


Sets a copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | a copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that defines a local geometric transform for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |

### getFocusScales() {#getFocusScales--}
```
public PointF getFocusScales()
```


Gets the focus point for the gradient falloff.

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - the focus point for the gradient falloff.
### setFocusScales(PointF value) {#setFocusScales-com.aspose.drawing.PointF-}
```
public void setFocusScales(PointF value)
```


Sets the focus point for the gradient falloff.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PointF](../../com.aspose.drawing/pointf) | the focus point for the gradient falloff. |

### getWrapMode() {#getWrapMode--}
```
public int getWrapMode()
```


Gets a `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that indicates the wrap mode for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).

**Returns:**
int - a `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that indicates the wrap mode for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).
### setWrapMode(int value) {#setWrapMode-int-}
```
public void setWrapMode(int value)
```


Sets a `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that indicates the wrap mode for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | a `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) that indicates the wrap mode for this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush). |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Creates an exact copy of this [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush).

**Returns:**
java.lang.Object - The [PathGradientBrush](../../com.aspose.drawing.drawing2d/pathgradientbrush) this method creates, cast as an object.
### setSigmaBellShape(float focus) {#setSigmaBellShape-float-}
```
public void setSigmaBellShape(float focus)
```


Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |

### setSigmaBellShape(float focus, float scale) {#setSigmaBellShape-float-float-}
```
public void setSigmaBellShape(float focus, float scale)
```


Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |
| scale | float | A value from 0 through 1 that specifies the maximum intensity of the center color that gets blended with the boundary color. A value of 1 causes the highest possible intensity of the center color, and it is the default value. |

### setBlendTriangularShape(float focus) {#setBlendTriangularShape-float-}
```
public void setBlendTriangularShape(float focus)
```


Creates a gradient with a center color and a linear falloff to one surrounding color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |

### setBlendTriangularShape(float focus, float scale) {#setBlendTriangularShape-float-float-}
```
public void setBlendTriangularShape(float focus, float scale)
```


Creates a gradient with a center color and a linear falloff to each surrounding color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |
| scale | float | A value from 0 through 1 that specifies the maximum intensity of the center color that gets blended with the boundary color. A value of 1 causes the highest possible intensity of the center color, and it is the default value. |

### resetTransform() {#resetTransform--}
```
public void resetTransform()
```


Resets the `P:PathGradientBrush.Transform` property to identity.

### multiplyTransform(Matrix matrix) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public void multiplyTransform(Matrix matrix)
```


Updates the brush's transformation matrix with the product of brush's transformation matrix multiplied by another matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) that will be multiplied by the brush's current transformation matrix. |

### multiplyTransform(Matrix matrix, int order) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-}
```
public void multiplyTransform(Matrix matrix, int order)
```


Updates the brush's transformation matrix with the product of the brush's transformation matrix multiplied by another matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) that will be multiplied by the brush's current transformation matrix. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies in which order to multiply the two matrices. |

### translateTransform(float dx, float dy) {#translateTransform-float-float-}
```
public void translateTransform(float dx, float dy)
```


Applies the specified translation to the local geometric transform. This method prepends the translation to the transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |

### translateTransform(float dx, float dy, int order) {#translateTransform-float-float-int-}
```
public void translateTransform(float dx, float dy, int order)
```


Applies the specified translation to the local geometric transform in the specified order.

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
| sx | float | The transform scale factor in the x-axis direction. |
| sy | float | The transform scale factor in the y-axis direction. |

### scaleTransform(float sx, float sy, int order) {#scaleTransform-float-float-int-}
```
public void scaleTransform(float sx, float sy, int order)
```


Scales the local geometric transform by the specified amounts in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The transform scale factor in the x-axis direction. |
| sy | float | The transform scale factor in the y-axis direction. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies whether to append or prepend the scaling matrix. |

### rotateTransform(float angle) {#rotateTransform-float-}
```
public void rotateTransform(float angle)
```


Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle (extent) of rotation. |

### rotateTransform(float angle, int order) {#rotateTransform-float-int-}
```
public void rotateTransform(float angle, int order)
```


Rotates the local geometric transform by the specified amount in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle (extent) of rotation. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) that specifies whether to append or prepend the rotation matrix. |

