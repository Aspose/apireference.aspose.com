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
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow(Inherited from [`Geometry`](../geometry/).) |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Gets all control points(Inherited from [`Geometry`](../geometry/).) |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Gets all deformers associated with this geometry.(Inherited from [`Geometry`](../geometry/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow.(Inherited from [`Geometry`](../geometry/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [U](../../aspose.threed.entities/nurbssurface/u/) { get; } | Gets the NURBS surface's U direction |
| [V](../../aspose.threed.entities/nurbssurface/v/) { get; } | Gets the NURBS surface's V direction |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Gets all vertex elements(Inherited from [`Geometry`](../geometry/).) |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Gets or sets if the geometry is visible(Inherited from [`Geometry`](../geometry/).) |

## Methods

| Name | Description |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Adds an existing vertex element to current geometry(Inherited from [`Geometry`](../geometry/).) |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | Creates a vertex element with specified type and add it to the geometry.(Inherited from [`Geometry`](../geometry/).) |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | Creates a vertex element with specified type and add it to the geometry.(Inherited from [`Geometry`](../geometry/).) |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type.(Inherited from [`Geometry`](../geometry/).) |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type.(Inherited from [`Geometry`](../geometry/).) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() | (Inherited from [`Geometry`](../geometry/).) |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Gets a vertex element with specified type(Inherited from [`Geometry`](../geometry/).) |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Gets a [`VertexElementUV`](../vertexelementuv/) instance with given texture mapping type(Inherited from [`Geometry`](../geometry/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ToMesh](../../aspose.threed.entities/nurbssurface/tomesh/)() | Convert the NURBS surface to the mesh |

### See Also

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


