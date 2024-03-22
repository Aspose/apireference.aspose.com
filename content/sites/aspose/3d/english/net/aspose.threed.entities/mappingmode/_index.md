---
title: Enum MappingMode
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.MappingMode enum. Determines how the element is mapped to a surface. The MappingMode defined how VertexElement is mapped to the surface of geometry
type: docs
weight: 2420
url: /net/aspose.threed.entities/mappingmode/
---
## MappingMode enumeration

Determines how the element is mapped to a surface. The `MappingMode` defined how [`VertexElement`](../vertexelement/) is mapped to the surface of geometry.

```csharp
public enum MappingMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| ControlPoint | `0` | Each data is mapped to the control point of the geometry. |
| PolygonVertex | `1` | The data is mapped to the polygon's vertex When a control point is shared by multiple polygons, and the data is mapped as PolygonVertex, the control point as different polygon vertex will have their own data |
| Polygon | `2` | The data is mapped to the polygon. Each polygon vertex shares the same data when mapping mode is Polygon. |
| Edge | `3` | The data is mapped to the edge. Each edge end point shares the same data when mapping is Edge. |
| AllSame | `4` | One data mapped to the whole surface. What ever data is interpreted as control point/polygon vertex/edge endpoints, the data is always the same as it defined by AllSame. |

### See Also

* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


