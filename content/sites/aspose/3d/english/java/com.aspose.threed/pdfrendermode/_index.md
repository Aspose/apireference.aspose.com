---
title: PdfRenderMode
second_title: Aspose.3D for Java API Reference
description: Render mode specifies the style in which the 3D artwork is rendered.
type: docs
weight: 260
url: /java/com.aspose.threed/pdfrendermode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfRenderMode extends Enum<PdfRenderMode>
```

Render mode specifies the style in which the 3D artwork is rendered.
## Fields

| Field | Description |
| --- | --- |
| [SOLID](#SOLID) | Displays textured and lit geometric shapes. |
| [SOLID_WIREFRAME](#SOLID-WIREFRAME) | Displays textured and lit geometric shapes (triangles) with single color edges on top of them. |
| [TRANSPARENT](#TRANSPARENT) | Displays textured and lit geometric shapes (triangles) with an added level of transparency. |
| [TRANSPARENT_WIREFRAME](#TRANSPARENT-WIREFRAME) | Displays textured and lit geometric shapes (triangles) with an added level of transparency, with single color opaque edges on top of it. |
| [BOUNDING_BOX](#BOUNDING-BOX) | Displays the bounding box edges of each node, aligned with the axes of the local coordinate space for that node. |
| [TRANSPARENT_BOUNDING_BOX](#TRANSPARENT-BOUNDING-BOX) | Displays bounding boxes faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency. |
| [TRANSPARENT_BOUNDING_BOX_OUTLINE](#TRANSPARENT-BOUNDING-BOX-OUTLINE) | Displays bounding boxes edges and faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency. |
| [WIREFRAME](#WIREFRAME) | Displays only edges in a single color. |
| [SHADED_WIREFRAME](#SHADED-WIREFRAME) | Displays only edges, though interpolates their color between their two vertices and applies lighting. |
| [HIDDEN_WIREFRAME](#HIDDEN-WIREFRAME) | Displays edges in a single color, though removes back-facing and obscured edges. |
| [VERTICES](#VERTICES) | Displays only vertices in a single color. |
| [SHADED_VERTICES](#SHADED-VERTICES) | Displays only vertices, though uses their vertex color and applies lighting. |
| [ILLUSTRATION](#ILLUSTRATION) | Displays silhouette edges with surfaces, removes obscured lines. |
| [SOLID_OUTLINE](#SOLID-OUTLINE) | Displays silhouette edges with lit and textured surfaces, removes obscured lines. |
| [SHADED_ILLUSTRATION](#SHADED-ILLUSTRATION) | Displays silhouette edges with lit and textured surfaces and an additional emissive term to remove poorly lit areas of the artwork. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### SOLID {#SOLID}
```
public static final PdfRenderMode SOLID
```


Displays textured and lit geometric shapes.

### SOLID_WIREFRAME {#SOLID-WIREFRAME}
```
public static final PdfRenderMode SOLID_WIREFRAME
```


Displays textured and lit geometric shapes (triangles) with single color edges on top of them.

### TRANSPARENT {#TRANSPARENT}
```
public static final PdfRenderMode TRANSPARENT
```


Displays textured and lit geometric shapes (triangles) with an added level of transparency.

### TRANSPARENT_WIREFRAME {#TRANSPARENT-WIREFRAME}
```
public static final PdfRenderMode TRANSPARENT_WIREFRAME
```


Displays textured and lit geometric shapes (triangles) with an added level of transparency, with single color opaque edges on top of it.

### BOUNDING_BOX {#BOUNDING-BOX}
```
public static final PdfRenderMode BOUNDING_BOX
```


Displays the bounding box edges of each node, aligned with the axes of the local coordinate space for that node.

### TRANSPARENT_BOUNDING_BOX {#TRANSPARENT-BOUNDING-BOX}
```
public static final PdfRenderMode TRANSPARENT_BOUNDING_BOX
```


Displays bounding boxes faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency.

### TRANSPARENT_BOUNDING_BOX_OUTLINE {#TRANSPARENT-BOUNDING-BOX-OUTLINE}
```
public static final PdfRenderMode TRANSPARENT_BOUNDING_BOX_OUTLINE
```


Displays bounding boxes edges and faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency.

### WIREFRAME {#WIREFRAME}
```
public static final PdfRenderMode WIREFRAME
```


Displays only edges in a single color.

### SHADED_WIREFRAME {#SHADED-WIREFRAME}
```
public static final PdfRenderMode SHADED_WIREFRAME
```


Displays only edges, though interpolates their color between their two vertices and applies lighting.

### HIDDEN_WIREFRAME {#HIDDEN-WIREFRAME}
```
public static final PdfRenderMode HIDDEN_WIREFRAME
```


Displays edges in a single color, though removes back-facing and obscured edges.

### VERTICES {#VERTICES}
```
public static final PdfRenderMode VERTICES
```


Displays only vertices in a single color.

### SHADED_VERTICES {#SHADED-VERTICES}
```
public static final PdfRenderMode SHADED_VERTICES
```


Displays only vertices, though uses their vertex color and applies lighting.

### ILLUSTRATION {#ILLUSTRATION}
```
public static final PdfRenderMode ILLUSTRATION
```


Displays silhouette edges with surfaces, removes obscured lines.

### SOLID_OUTLINE {#SOLID-OUTLINE}
```
public static final PdfRenderMode SOLID_OUTLINE
```


Displays silhouette edges with lit and textured surfaces, removes obscured lines.

### SHADED_ILLUSTRATION {#SHADED-ILLUSTRATION}
```
public static final PdfRenderMode SHADED_ILLUSTRATION
```


Displays silhouette edges with lit and textured surfaces and an additional emissive term to remove poorly lit areas of the artwork.

### values() {#values--}
```
public static PdfRenderMode[] values()
```




**Returns:**
com.aspose.threed.PdfRenderMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfRenderMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[PdfRenderMode](../../com.aspose.threed/pdfrendermode)
