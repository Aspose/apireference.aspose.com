---
title: SimpleLabeling Class
type: docs
weight: 80
url: /python-net/aspose.gis.rendering.labelings/simplelabeling/
---

**Summary:** A simple labeling places label on every feature.

**Module:** [aspose.gis.rendering.labelings](/psd/python-net/aspose.gis.rendering.labelings/)

**Full Name:** aspose.gis.rendering.labelings.SimpleLabeling

**Inheritance:** Labeling

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [SimpleLabeling()](#SimpleLabeling__1) | Initializes a new instance of the [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) class. |
| [SimpleLabeling(label_attribute)](#SimpleLabeling_label_attribute_2) | Initializes a new instance of the [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) class. |
| [SimpleLabeling(other)](#SimpleLabeling_other_3) | Initializes a new instance of the [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| font_color | System.Drawing.Color | r/w | Determines color of text. |
| font_family | string | r/w | Font family to use to render text. The default is system dependent value. |
| font_size | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Size of the text. |
| font_style | [FontStyle](/psd/python-net/aspose.gis.rendering.labelings/fontstyle) | r/w | Style to apply to text. |
| halo_color | System.Drawing.Color | r/w | Color of the halo (stroke) around text. |
| halo_size | [Measurement](/psd/python-net/aspose.gis.rendering/measurement) | r/w | Size of the halo (stroke) around text. |
| label_attribute | string | r/w | Attribute name to use as a source of labels. Ignored if [None](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) is set.<br/>            Either [SimpleLabeling.label_attribute](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) or [None](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) must be set before rendering;<br/>            InvalidOperationException is thrown otherwise. |
| multipart_mode | [MultipartMode](/psd/python-net/aspose.gis.rendering.labelings/multipartmode) | r/w | Specifies rendering behavior for multipart geometries. Default is [MultipartMode.ALL](/psd/python-net/aspose.gis.rendering.labelings/multipartmode/). |
| null [static] | [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling) | r | Gets an instance of [NullLabeling](/psd/python-net/aspose.gis.rendering.labelings/nulllabeling/). |
| placement | [LabelPlacement](/psd/python-net/aspose.gis.rendering.labelings/labelplacement) | r/w | Label placement specifies how labels are placed relatively to feature's geometries. |
| priority | int | r/w | Indicates priority of this label in case if it overlaps with another label. The label with lower priority is not rendered.<br/>            Default is 1000. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [clone()](#clone__1) | Clones this instance. |


### Constructor: SimpleLabeling() {#SimpleLabeling__1}


```
 SimpleLabeling() 
```

Initializes a new instance of the [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) class.

### Constructor: SimpleLabeling(label_attribute) {#SimpleLabeling_label_attribute_2}


```
 SimpleLabeling(label_attribute) 
```

Initializes a new instance of the [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| label_attribute | string | Attribute name to use as a source of labels. |

### Constructor: SimpleLabeling(other) {#SimpleLabeling_other_3}


```
 SimpleLabeling(other) 
```

Initializes a new instance of the [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling) | The other [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling/) to copy data from. |

### Method: clone() {#clone__1}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [SimpleLabeling](/psd/python-net/aspose.gis.rendering.labelings/simplelabeling) | A clone of this instance. |


