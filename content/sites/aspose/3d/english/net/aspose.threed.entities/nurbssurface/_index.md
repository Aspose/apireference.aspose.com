---
title: Class NurbsSurface
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.NurbsSurface class. NurbsSurface is a surface represented by NURBSNonuniform rational basis spline A NurbsSurface is defined by two NurbsDirectionU and V. The w component in control point is used as control points weight whatever the directions type is a TwoDimensional or ThreeDimensional
type: docs
weight: 510
url: /net/aspose.threed.entities/nurbssurface/
---
## NurbsSurface class

`NurbsSurface` is a surface represented by [NURBS(Non-uniform rational basis spline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A `NurbsSurface` is defined by two [`NurbsDirection`](../nurbsdirection/)[`U`](./u/) and [`V`](./v/). The w component in control point is used as control point's weight whatever the direction's type is a TwoDimensional or ThreeDimensional

```csharp
public class NurbsSurface : Geometry, IMeshConvertible
```

## Constructors

| Name | Description |
| --- | --- |
| [NurbsSurface](nurbssurface/#constructor)() | Initializes a new instance of the `NurbsSurface` class. |
| [NurbsSurface](nurbssurface/#constructor_1)(string) | Initializes a new instance of the `NurbsSurface` class. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Gets all control points |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Gets all deformers associated with this geometry. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to |
| [U](../../aspose.threed.entities/nurbssurface/u/) { get; } | Gets the NURBS surface's U direction |
| [V](../../aspose.threed.entities/nurbssurface/v/) { get; } | Gets the NURBS surface's V direction |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Gets all vertex elements |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Gets or sets if the geometry is visible |

## Methods

| Name | Description |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Adds an existing vertex element to current geometry |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Gets a vertex element with specified type |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Gets a [`VertexElementUV`](../vertexelementuv/) instance with given texture mapping type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh/)() | Convert the NURBS surface to the mesh |

### See Also

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


