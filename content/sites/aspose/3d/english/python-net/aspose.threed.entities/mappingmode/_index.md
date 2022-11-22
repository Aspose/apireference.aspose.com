---
title: MappingMode enumeration
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 620
url: /python-net/aspose.threed.entities/mappingmode/
is_root: false
---

## MappingMode enumeration

Determines how the element is mapped to a surface. 
            The [MappingMode](/3d/python-net/aspose.threed.entities/mappingmode) defined how [VertexElement](/3d/python-net/aspose.threed.entities/vertexelement) is mapped to the surface of geometry.



The MappingMode type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| CONTROL_POINT | Each data is mapped to the control point of the geometry. |
| POLYGON_VERTEX | The data is mapped to the polygon's vertex<br/>            When a control point is shared by multiple polygons, and the data is mapped as [MappingMode.POLYGON_VERTEX](/3d/python-net/aspose.threed.entities/mappingmode#POLYGON_VERTEX), the control point as different polygon vertex will have their own data |
| POLYGON | The data is mapped to the polygon.<br/>            Each polygon vertex shares the same data when mapping mode is [MappingMode.POLYGON](/3d/python-net/aspose.threed.entities/mappingmode#POLYGON). |
| EDGE | The data is mapped to the edge.<br/>            Each edge end point shares the same data when mapping is [MappingMode.EDGE](/3d/python-net/aspose.threed.entities/mappingmode#EDGE). |
| ALL_SAME | One data mapped to the whole surface.<br/>            What ever data is interpreted as control point/polygon vertex/edge endpoints, the data is always the same as it defined by [MappingMode.ALL_SAME](/3d/python-net/aspose.threed.entities/mappingmode#ALL_SAME). |


### See Also

* module [aspose.threed.entities](../)
