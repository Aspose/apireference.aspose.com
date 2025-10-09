---
title: SystemDrawingAdapter Class
type: docs
weight: 180
url: /python-net/aspose.gis.painting/systemdrawingadapter/
---

**Summary:** 

**Module:** [aspose.gis.painting](/psd/python-net/aspose.gis.painting/)

**Full Name:** aspose.gis.painting.SystemDrawingAdapter

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| string_format [static] | System.Drawing.StringFormat | r |    |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [convert_brush(brush)](#convert_brush_brush_1) |    |
| [convert_coordinate(coordinate)](#convert_coordinate_coordinate_2) |    |
| [convert_pen(pen)](#convert_pen_pen_3) |    |
| [convert_shape(shape)](#convert_shape_shape_4) |    |
| [convert_transformation(transformation)](#convert_transformation_transformation_5) |    |
| [font_design_units_to_pixels(font, value_in_design_units)](#font_design_units_to_pixels_font_value_in_design_units_6) |    |
| [get_cell_ascent(font)](#get_cell_ascent_font_7) |    |
| [get_cell_descent(font)](#get_cell_descent_font_8) |    |
| [measure_text(graphics, text, font)](#measure_text_graphics_text_font_9) |    |


### Method: convert_brush(brush)  [static] {#convert_brush_brush_1}


```
 convert_brush(brush) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| brush | [SolidPainterBrush](/psd/python-net/aspose.gis.painting/solidpainterbrush) |  |

**Returns**

| Type | Description |
| :- | :- |
| System.Drawing.Brush |  |


### Method: convert_coordinate(coordinate)  [static] {#convert_coordinate_coordinate_2}


```
 convert_coordinate(coordinate) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| coordinate | [Coordinate](/psd/python-net/aspose.gis.common/coordinate/) |  |

**Returns**

| Type | Description |
| :- | :- |
| System.Drawing.PointF |  |


### Method: convert_pen(pen)  [static] {#convert_pen_pen_3}


```
 convert_pen(pen) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| pen | [PainterPen](/psd/python-net/aspose.gis.painting/painterpen) |  |

**Returns**

| Type | Description |
| :- | :- |
| System.Drawing.Pen |  |


### Method: convert_shape(shape)  [static] {#convert_shape_shape_4}


```
 convert_shape(shape) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| shape | [PolylinesShape](/psd/python-net/aspose.gis.painting/polylinesshape) |  |

**Returns**

| Type | Description |
| :- | :- |
| System.Drawing.Drawing2D.GraphicsPath |  |


### Method: convert_transformation(transformation)  [static] {#convert_transformation_transformation_5}


```
 convert_transformation(transformation) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| transformation | [MatrixTransformation](/psd/python-net/aspose.gis.common/matrixtransformation/) |  |

**Returns**

| Type | Description |
| :- | :- |
| System.Drawing.Drawing2D.Matrix |  |


### Method: font_design_units_to_pixels(font, value_in_design_units)  [static] {#font_design_units_to_pixels_font_value_in_design_units_6}


```
 font_design_units_to_pixels(font, value_in_design_units) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| font | System.Drawing.Font |  |
| value_in_design_units | int |  |

**Returns**

| Type | Description |
| :- | :- |
| double |  |


### Method: get_cell_ascent(font)  [static] {#get_cell_ascent_font_7}


```
 get_cell_ascent(font) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| font | System.Drawing.Font |  |

**Returns**

| Type | Description |
| :- | :- |
| double |  |


### Method: get_cell_descent(font)  [static] {#get_cell_descent_font_8}


```
 get_cell_descent(font) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| font | System.Drawing.Font |  |

**Returns**

| Type | Description |
| :- | :- |
| double |  |


### Method: measure_text(graphics, text, font)  [static] {#measure_text_graphics_text_font_9}


```
 measure_text(graphics, text, font) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| graphics | System.Drawing.Graphics |  |
| text | string |  |
| font | System.Drawing.Font |  |

**Returns**

| Type | Description |
| :- | :- |
| [Size](/psd/python-net/aspose.gis.common/size/) |  |


