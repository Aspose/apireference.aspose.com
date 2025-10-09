---
title: LineLabelPlacement Class
type: docs
weight: 40
url: /python-net/aspose.gis.rendering.labelings/linelabelplacement/
---

**Summary:** Line label placement places labels along line.

**Module:** [aspose.gis.rendering.labelings](/psd/python-net/aspose.gis.rendering.labelings/)

**Full Name:** aspose.gis.rendering.labelings.LineLabelPlacement

**Inheritance:** LabelPlacement

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [LineLabelPlacement()](#LineLabelPlacement__1) | Creates new instance. |
| [LineLabelPlacement(other)](#LineLabelPlacement_other_2) | Creates new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| alignment | [LineLabelAlignment](/psd/python-net/aspose.gis.rendering.labelings/linelabelalignment) | r/w | Specifies how the label is aligned with the linear path. Default is [LineLabelAlignment.PARALLEL](/psd/python-net/aspose.gis.rendering.labelings/linelabelalignment/). |
| max_angle_delta | double | r/w | When used with [LineLabelAlignment.CURVED](/psd/python-net/aspose.gis.rendering.labelings/linelabelalignment/) sets the maximum angle in degrees between two<br/>            subsequent characters in a curved label. Default is 25. |
| offset | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | The offset from the linear path.<br/>            Positive values offset to the left of the line, negative to the right. Default is 0. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Clones this instance. |


### Constructor: LineLabelPlacement() {#LineLabelPlacement__1}


```
 LineLabelPlacement() 
```

Creates new instance.

### Constructor: LineLabelPlacement(other) {#LineLabelPlacement_other_2}


```
 LineLabelPlacement(other) 
```

Creates new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [LineLabelPlacement](/psd/python-net/aspose.gis.rendering.labelings/linelabelplacement) | The other [LineLabelPlacement](/psd/python-net/aspose.gis.rendering.labelings/linelabelplacement/) to copy data from. |

### Method: clone() {#clone__1}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [LabelPlacement](/psd/python-net/aspose.gis.rendering.labelings/labelplacement) | A clone of this instance. |


