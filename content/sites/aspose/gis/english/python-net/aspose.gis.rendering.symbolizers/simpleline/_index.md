---
title: SimpleLine Class
type: docs
weight: 120
url: /python-net/aspose.gis.rendering.symbolizers/simpleline/
---

**Summary:** Simple line symbolizer.

**Module:** [aspose.gis.rendering.symbolizers](/psd/python-net/aspose.gis.rendering.symbolizers/)

**Full Name:** aspose.gis.rendering.symbolizers.SimpleLine

**Inheritance:** VectorSymbolizer

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [SimpleLine()](#SimpleLine__1) | Creates new instance. |
| [SimpleLine(other)](#SimpleLine_other_2) | Initializes a new instance of the [SimpleLine](/psd/python-net/aspose.gis.rendering.symbolizers/simpleline/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| cap_style | [CapStyle](/psd/python-net/aspose.gis.rendering/capstyle) | r/w | Specifies how lines are rendered at their ends. |
| color | System.Drawing.Color | r/w | Specifies the color and transparency given to the line. |
| dash_offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the distance from the start of a line to the beginning of a dash pattern. |
| dash_pattern | System.Collections.Generic.IEnumerable<Measurement> | r/w | Specifies an array of distances that specifies the lengths of alternating dashes and spaces<br/>            in dashed lines. |
| line_join | [LineJoin](/psd/python-net/aspose.gis.rendering/linejoin) | r/w | Determines how lines are rendered at intersection of line segments. |
| null [static] | [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer) | r | The [NullVectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/nullvectorsymbolizer/) draws nothing and effectively skips rendering of a geometry it is applied to. |
| offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies offset from the original line.<br/>            For positive distance the offset will be at the left side of the input line (relative to the line direction).<br/>            For a negative distance it will be at the right side. |
| style | [StrokeStyle](/psd/python-net/aspose.gis.rendering/strokestyle) | r/w | Specifies how the symbol lines should be drawn. |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Specifies the width of the line. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Clones this instance. |


### Constructor: SimpleLine() {#SimpleLine__1}


```
 SimpleLine() 
```

Creates new instance.

### Constructor: SimpleLine(other) {#SimpleLine_other_2}


```
 SimpleLine(other) 
```

Initializes a new instance of the [SimpleLine](/psd/python-net/aspose.gis.rendering.symbolizers/simpleline/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [SimpleLine](/psd/python-net/aspose.gis.rendering.symbolizers/simpleline) | The other [SimpleLine](/psd/python-net/aspose.gis.rendering.symbolizers/simpleline/) to copy data from. |

### Method: clone() {#clone__1}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [SimpleLine](/psd/python-net/aspose.gis.rendering.symbolizers/simpleline) | A clone of this instance. |


