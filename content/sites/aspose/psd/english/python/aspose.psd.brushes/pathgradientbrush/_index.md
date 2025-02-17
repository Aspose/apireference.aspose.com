---
title: PathGradientBrush Class
type: docs
weight: 50
url: /python-net/aspose.psd.brushes/pathgradientbrush/
---

**Summary:** Encapsulates a [Brush](/psd/python-net/aspose.psd/brush/) object with a gradient. This class cannot be inherited.

**Module:** [aspose.psd.brushes](/psd/python-net/aspose.psd.brushes/)

**Full Name:** aspose.psd.brushes.PathGradientBrush

**Inheritance:** PathGradientBrushBase

**Aspose.PSD Version:** 24.12.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [PathGradientBrush(path)](#PathGradientBrush_path_1) | Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified path. |
| [PathGradientBrush(points)](#PathGradientBrush_points_2) | Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points. |
| [PathGradientBrush(points)](#PathGradientBrush_points_3) | Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points. |
| [PathGradientBrush(points, wrap_mode)](#PathGradientBrush_points_wrap_mode_4) | Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points and wrap mode. |
| [PathGradientBrush(points, wrap_mode)](#PathGradientBrush_points_wrap_mode_5) | Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points and wrap mode. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| blend | [Blend](/psd/python-net/aspose.psd/blend) | r/w | Gets or sets a [Blend](/psd/python-net/aspose.psd/blend/) that specifies positions and factors that define a custom falloff for the gradient. |
| center_color | [Color](/psd/python-net/aspose.psd/color) | r/w | Gets or sets the color at the center of the path gradient. |
| center_point | [PointF](/psd/python-net/aspose.psd/pointf) | r/w | Gets or sets the center point of the path gradient. |
| disposed | bool | r | Gets a value indicating whether this instance is disposed. |
| focus_scales | [PointF](/psd/python-net/aspose.psd/pointf) | r/w | Gets or sets the focus point for the gradient falloff. |
| graphics_path | [GraphicsPath](/psd/python-net/aspose.psd/graphicspath) | r | Gets the graphics path this brush was build upon. |
| interpolation_colors | [ColorBlend](/psd/python-net/aspose.psd/colorblend) | r/w | Gets or sets a [ColorBlend](/psd/python-net/aspose.psd/colorblend/) that defines a multicolor linear gradient. |
| is_transform_changed | bool | r | Gets a value indicating whether transformations were changed in some way. For example setting the transformation matrix or<br/>            calling any of the methods altering the transformation matrix. The property is introduced for backward compatibility with GDI+. |
| opacity | float | r/w | Gets or sets the brush opacity. The value should be between 0 and 1. Value of 0 means that brush is fully visible, value of 1 means the brush is fully opaque. |
| path_points | [PointF[]](/psd/python-net/aspose.psd/pointf) | r | Gets the path points this brush was build upon. |
| surround_colors | [Color[]](/psd/python-net/aspose.psd/color) | r/w | Gets or sets an array of colors that correspond to the points in the path this [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) fills. |
| transform | [Matrix](/psd/python-net/aspose.psd/matrix) | r/w | Gets or sets a copy [Matrix](/psd/python-net/aspose.psd/matrix/) that defines a local geometric transform for this [TransformBrush](/psd/python-net/aspose.psd.brushes/transformbrush/). |
| wrap_mode | [WrapMode](/psd/python-net/aspose.psd/wrapmode) | r/w | Gets or sets a [WrapMode](/psd/python-net/aspose.psd/wrapmode/) enumeration that indicates the wrap mode for this [TransformBrush](/psd/python-net/aspose.psd.brushes/transformbrush/). |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [deep_clone()](#deep_clone__1) | Creates a new deep clone of the current [Brush](/psd/python-net/aspose.psd/brush/). |
| [multiply_transform(matrix)](#multiply_transform_matrix_2) | Multiplies the [Matrix](/psd/python-net/aspose.psd/matrix/) that represents the local geometric transform of this [LinearGradientBrush](/psd/python-net/aspose.psd.brushes/lineargradientbrush/) by the specified [Matrix](/psd/python-net/aspose.psd/matrix/) by prepending the specified [Matrix](/psd/python-net/aspose.psd/matrix/). |
| [multiply_transform(matrix, order)](#multiply_transform_matrix_order_3) | Multiplies the [Matrix](/psd/python-net/aspose.psd/matrix/) that represents the local geometric transform of this [LinearGradientBrush](/psd/python-net/aspose.psd.brushes/lineargradientbrush/) by the specified [Matrix](/psd/python-net/aspose.psd/matrix/) in the specified order. |
| reset_transform() | Resets the [TransformBrush.transform](/psd/python-net/aspose.psd.brushes/transformbrush/) property to identity. |
| [rotate_transform(angle)](#rotate_transform_angle_4) | Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform. |
| [rotate_transform(angle, order)](#rotate_transform_angle_order_5) | Rotates the local geometric transform by the specified amount in the specified order. |
| [scale_transform(sx, sy)](#scale_transform_sx_sy_6) | Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform. |
| [scale_transform(sx, sy, order)](#scale_transform_sx_sy_order_7) | Scales the local geometric transform by the specified amounts in the specified order. |
| [set_blend_triangular_shape(focus)](#set_blend_triangular_shape_focus_8) | Creates a gradient with a center color and a linear falloff to one surrounding color. |
| [set_blend_triangular_shape(focus, scale)](#set_blend_triangular_shape_focus_scale_9) | Creates a gradient with a center color and a linear falloff to each surrounding color. |
| [set_sigma_bell_shape(focus)](#set_sigma_bell_shape_focus_10) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve. |
| [set_sigma_bell_shape(focus, scale)](#set_sigma_bell_shape_focus_scale_11) | Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve. |
| [translate_transform(dx, dy)](#translate_transform_dx_dy_12) | Translates the local geometric transform by the specified dimensions. This method prepends the translation to the transform. |
| [translate_transform(dx, dy, order)](#translate_transform_dx_dy_order_13) | Translates the local geometric transform by the specified dimensions in the specified order. |


### Constructor: PathGradientBrush(path) {#PathGradientBrush_path_1}


```
 PathGradientBrush(path) 
```

Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified path.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | [GraphicsPath](/psd/python-net/aspose.psd/graphicspath) | The [GraphicsPath](/psd/python-net/aspose.psd/graphicspath/) that defines the area filled by this [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/). |

### Constructor: PathGradientBrush(points) {#PathGradientBrush_points_2}


```
 PathGradientBrush(points) 
```

Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| points | [PointF[]](/psd/python-net/aspose.psd/pointf) | An array of [PointF](/psd/python-net/aspose.psd/pointf/) structures that represents the points that make up the vertices of the path. |

### Constructor: PathGradientBrush(points) {#PathGradientBrush_points_3}


```
 PathGradientBrush(points) 
```

Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| points | [Point[]](/psd/python-net/aspose.psd/point) | An array of [PointF](/psd/python-net/aspose.psd/pointf/) structures that represents the points that make up the vertices of the path. |

### Constructor: PathGradientBrush(points, wrap_mode) {#PathGradientBrush_points_wrap_mode_4}


```
 PathGradientBrush(points, wrap_mode) 
```

Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points and wrap mode.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| points | [PointF[]](/psd/python-net/aspose.psd/pointf) | An array of [PointF](/psd/python-net/aspose.psd/pointf/) structures that represents the points that make up the vertices of the path. |
| wrap_mode | [WrapMode](/psd/python-net/aspose.psd/wrapmode) | A [WrapMode](/psd/python-net/aspose.psd/wrapmode/) that specifies how fills drawn with this [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) are tiled. |

### Constructor: PathGradientBrush(points, wrap_mode) {#PathGradientBrush_points_wrap_mode_5}


```
 PathGradientBrush(points, wrap_mode) 
```

Initializes a new instance of the [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) class with the specified points and wrap mode.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| points | [Point[]](/psd/python-net/aspose.psd/point) | An array of [PointF](/psd/python-net/aspose.psd/pointf/) structures that represents the points that make up the vertices of the path. |
| wrap_mode | [WrapMode](/psd/python-net/aspose.psd/wrapmode) | A [WrapMode](/psd/python-net/aspose.psd/wrapmode/) that specifies how fills drawn with this [PathGradientBrush](/psd/python-net/aspose.psd.brushes/pathgradientbrush/) are tiled. |

### Method: deep_clone() {#deep_clone__1}


```
 deep_clone() 
```

Creates a new deep clone of the current [Brush](/psd/python-net/aspose.psd/brush/).

**Returns**

| Type | Description |
| :- | :- |
| [Brush](/psd/python-net/aspose.psd/brush) | A new [Brush](/psd/python-net/aspose.psd/brush/) which is the deep clone of this [Brush](/psd/python-net/aspose.psd/brush/) instance. |


### Method: multiply_transform(matrix) {#multiply_transform_matrix_2}


```
 multiply_transform(matrix) 
```

Multiplies the [Matrix](/psd/python-net/aspose.psd/matrix/) that represents the local geometric transform of this [LinearGradientBrush](/psd/python-net/aspose.psd.brushes/lineargradientbrush/) by the specified [Matrix](/psd/python-net/aspose.psd/matrix/) by prepending the specified [Matrix](/psd/python-net/aspose.psd/matrix/).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| matrix | [Matrix](/psd/python-net/aspose.psd/matrix) | The [Matrix](/psd/python-net/aspose.psd/matrix/) by which to multiply the geometric transform. |

### Method: multiply_transform(matrix, order) {#multiply_transform_matrix_order_3}


```
 multiply_transform(matrix, order) 
```

Multiplies the [Matrix](/psd/python-net/aspose.psd/matrix/) that represents the local geometric transform of this [LinearGradientBrush](/psd/python-net/aspose.psd.brushes/lineargradientbrush/) by the specified [Matrix](/psd/python-net/aspose.psd/matrix/) in the specified order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| matrix | [Matrix](/psd/python-net/aspose.psd/matrix) | The [Matrix](/psd/python-net/aspose.psd/matrix/) by which to multiply the geometric transform. |
| order | [MatrixOrder](/psd/python-net/aspose.psd/matrixorder) | A [MatrixOrder](/psd/python-net/aspose.psd/matrixorder/) that specifies in which order to multiply the two matrices. |

### Method: rotate_transform(angle) {#rotate_transform_angle_4}


```
 rotate_transform(angle) 
```

Rotates the local geometric transform by the specified amount. This method prepends the rotation to the transform.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| angle | float | The angle of rotation. |

### Method: rotate_transform(angle, order) {#rotate_transform_angle_order_5}


```
 rotate_transform(angle, order) 
```

Rotates the local geometric transform by the specified amount in the specified order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| angle | float | The angle of rotation. |
| order | [MatrixOrder](/psd/python-net/aspose.psd/matrixorder) | A [MatrixOrder](/psd/python-net/aspose.psd/matrixorder/) that specifies whether to append or prepend the rotation matrix. |

### Method: scale_transform(sx, sy) {#scale_transform_sx_sy_6}


```
 scale_transform(sx, sy) 
```

Scales the local geometric transform by the specified amounts. This method prepends the scaling matrix to the transform.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sx | float | The amount by which to scale the transform in the x-axis direction. |
| sy | float | The amount by which to scale the transform in the y-axis direction. |

### Method: scale_transform(sx, sy, order) {#scale_transform_sx_sy_order_7}


```
 scale_transform(sx, sy, order) 
```

Scales the local geometric transform by the specified amounts in the specified order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| sx | float | The amount by which to scale the transform in the x-axis direction. |
| sy | float | The amount by which to scale the transform in the y-axis direction. |
| order | [MatrixOrder](/psd/python-net/aspose.psd/matrixorder) | A [MatrixOrder](/psd/python-net/aspose.psd/matrixorder/) that specifies whether to append or prepend the scaling matrix. |

### Method: set_blend_triangular_shape(focus) {#set_blend_triangular_shape_focus_8}


```
 set_blend_triangular_shape(focus) 
```

Creates a gradient with a center color and a linear falloff to one surrounding color.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |

### Method: set_blend_triangular_shape(focus, scale) {#set_blend_triangular_shape_focus_scale_9}


```
 set_blend_triangular_shape(focus, scale) 
```

Creates a gradient with a center color and a linear falloff to each surrounding color.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |
| scale | float | A value from 0 through 1 that specifies the maximum intensity of the center color that gets blended with the boundary color. A value of 1 causes the highest possible intensity of the center color, and it is the default value. |

### Method: set_sigma_bell_shape(focus) {#set_sigma_bell_shape_focus_10}


```
 set_sigma_bell_shape(focus) 
```

Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |

### Method: set_sigma_bell_shape(focus, scale) {#set_sigma_bell_shape_focus_scale_11}


```
 set_sigma_bell_shape(focus, scale) 
```

Creates a gradient brush that changes color starting from the center of the path outward to the path's boundary. The transition from one color to another is based on a bell-shaped curve.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| focus | float | A value from 0 through 1 that specifies where, along any radial from the center of the path to the path's boundary, the center color will be at its highest intensity. A value of 1 (the default) places the highest intensity at the center of the path. |
| scale | float | A value from 0 through 1 that specifies the maximum intensity of the center color that gets blended with the boundary color. A value of 1 causes the highest possible intensity of the center color, and it is the default value. |

### Method: translate_transform(dx, dy) {#translate_transform_dx_dy_12}


```
 translate_transform(dx, dy) 
```

Translates the local geometric transform by the specified dimensions. This method prepends the translation to the transform.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |

### Method: translate_transform(dx, dy, order) {#translate_transform_dx_dy_order_13}


```
 translate_transform(dx, dy, order) 
```

Translates the local geometric transform by the specified dimensions in the specified order.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| dx | float | The value of the translation in x. |
| dy | float | The value of the translation in y. |
| order | [MatrixOrder](/psd/python-net/aspose.psd/matrixorder) | The order (prepend or append) in which to apply the translation. |

