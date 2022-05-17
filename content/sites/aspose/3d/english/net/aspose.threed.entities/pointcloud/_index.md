---
title: PointCloud
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 540
url: /net/aspose.threed.entities/pointcloud/
---
## PointCloud class

The point cloud contains no topology information but only the control points and the vertex elements.

```csharp
public class PointCloud : Geometry
```

## Constructors

| Name | Description |
| --- | --- |
| [PointCloud](pointcloud)() | Constructor of [`PointCloud`](../pointcloud) |
| [PointCloud](pointcloud)(string) | Constructor of [`PointCloud`](../pointcloud) |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Gets all control points |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Gets all deformers associated with this geometry. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Gets the collection of all properties. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Gets the scene that this object belongs to |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Gets all vertex elements |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Gets or sets if the geometry is visible |

## Methods

| Name | Description |
| --- | --- |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry)(Geometry) | Create a new PointCloud instance from a geometry object |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry)(Geometry, int) | Create a new point cloud instance from a geometry object. Density is the number of points per unit triangle(Unit triangle are the triangle with maximum surface area from the mesh) |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Adds an existing vertex element to current geometry |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Creates a [`VertexElementUV`](../vertexelementuv) with given texture mapping type. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Creates a [`VertexElementUV`](../vertexelementuv) with given texture mapping type. |
| virtual [Equals](equals)(object) |  |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Gets the bounding box of current entity in its object space coordinate system. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Gets a vertex element with specified type |
| override [GetEntityRendererKey](../../aspose.threed.entities/pointcloud/getentityrendererkey)() | Gets the key of the entity renderer registered in the renderer |
| virtual [GetHashCode](gethashcode)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Get the value of specified property |
| [GetType](gettype)() |  |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Gets a [`VertexElementUV`](../vertexelementuv) instance with given texture mapping type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Sets the value of specified property |
| virtual [ToString](tostring)() |  |

### See Also

* class [Geometry](../geometry)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3d.dll -->
