---
title: PdfRenderMode enumeration
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 370
url: /python-net/aspose.threed.formats/pdfrendermode/
is_root: false
---

## PdfRenderMode enumeration

Render mode specifies the style in which the 3D artwork is rendered.



The PdfRenderMode type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| SOLID | Displays textured and lit geometric shapes. |
| SOLID_WIREFRAME | Displays textured and lit geometric shapes (triangles) with single color edges on top of them. |
| TRANSPARENT | Displays textured and lit geometric shapes (triangles) with an added level of transparency. |
| TRANSPARENT_WIREFRAME | Displays textured and lit geometric shapes (triangles) with an added level of transparency, with single color opaque edges on top of it. |
| BOUNDING_BOX | Displays the bounding box edges of each node, aligned with the axes of the local coordinate space for that node. |
| TRANSPARENT_BOUNDING_BOX | Displays bounding boxes faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency. |
| TRANSPARENT_BOUNDING_BOX_OUTLINE | Displays bounding boxes edges and faces of each node, aligned with the axes of the local coordinate space for that node, with an added level of transparency. |
| WIREFRAME | Displays only edges in a single color. |
| SHADED_WIREFRAME | Displays only edges, though interpolates their color between their two vertices and applies lighting. |
| HIDDEN_WIREFRAME | Displays edges in a single color, though removes back-facing and obscured edges. |
| VERTICES | Displays only vertices in a single color. |
| SHADED_VERTICES | Displays only vertices, though uses their vertex color and applies lighting. |
| ILLUSTRATION | Displays silhouette edges with surfaces, removes obscured lines. |
| SOLID_OUTLINE | Displays silhouette edges with lit and textured surfaces, removes obscured lines. |
| SHADED_ILLUSTRATION | Displays silhouette edges with lit and textured surfaces and an additional emissive term to remove poorly lit areas of the artwork. |



### See Also
* module [`aspose.threed.formats`](..)
