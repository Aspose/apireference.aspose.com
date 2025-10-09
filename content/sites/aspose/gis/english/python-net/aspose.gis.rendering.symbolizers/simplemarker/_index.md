---
title: SimpleMarker Class
type: docs
weight: 130
url: /python-net/aspose.gis.rendering.symbolizers/simplemarker/
---

**Summary:** Simple point symbolizer.

**Module:** [aspose.gis.rendering.symbolizers](/psd/python-net/aspose.gis.rendering.symbolizers/)

**Full Name:** aspose.gis.rendering.symbolizers.SimpleMarker

**Inheritance:** VectorSymbolizer

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [SimpleMarker()](#SimpleMarker__1) | Initializes a new instance of the [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker/) class. |
| [SimpleMarker(other)](#SimpleMarker_other_2) | Initializes a new instance of the [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| fill_color | System.Drawing.Color | r/w | Specifies the color and transparency for filling. |
| horizontal_anchor_point | [HorizontalAnchor](/psd/python-net/aspose.gis.rendering.symbolizers/horizontalanchor) | r/w | Specifies which side of a marker shape will be aligned horizontally with the point location. |
| horizontal_offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies horizontal offset from a point location to the shape anchor point. |
| null [static] | [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer) | r | The [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer/) draws nothing and effectively skips rendering of a geometry it is applied to. |
| rotation | double | r/w | Specifies the rotation of the symbol about its center point, in decimal degrees.<br/>            Positive values indicate rotation in the clockwise direction, negative values indicate counter-clockwise rotation. |
| shape_type | [MarkerShapeType](/psd/python-net/aspose.gis.rendering.symbolizers/markershapetype) | r/w | Specifies the shape of the marker. |
| size | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the size of the marker. |
| stroke_color | System.Drawing.Color | r/w | Specifies the color and transparency given to the line. |
| stroke_dash_offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the distance from the start of a line to the beginning of a dash pattern. |
| stroke_dash_pattern | System.Collections.Generic.IEnumerable<Measurement> | r/w | Specifies an array of distances that specifies the lengths of alternating dashes and spaces<br/>            in dashed lines. |
| stroke_line_join | [LineJoin](/psd/python-net/aspose.gis.rendering/linejoin) | r/w | Determines how lines are rendered at intersection of line segments. |
| stroke_style | [StrokeStyle](/psd/python-net/aspose.gis.rendering/strokestyle) | r/w | Specifies how the symbol lines should be drawn. |
| stroke_width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the width of the line. |
| vertical_anchor_point | [VerticalAnchor](/psd/python-net/aspose.gis.rendering.symbolizers/verticalanchor) | r/w | Specifies which side of a marker shape will be aligned vertically with the point location. |
| vertical_offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies vertical offset from a point location to the shape anchor point. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Clones this instance. |


### Constructor: SimpleMarker() {#SimpleMarker__1}


```
 SimpleMarker() 
```

Initializes a new instance of the [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker/) class.

### Constructor: SimpleMarker(other) {#SimpleMarker_other_2}


```
 SimpleMarker(other) 
```

Initializes a new instance of the [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker) | The other [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker/) to copy data from. |

### Method: clone() {#clone__1}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [SimpleMarker](/psd/python-net/aspose.gis.rendering.symbolizers/simplemarker) | A clone of this instance. |


