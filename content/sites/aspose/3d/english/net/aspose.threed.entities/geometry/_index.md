---
title: Class Geometry
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Geometry class. The base class of all renderable geometric objects like Mesh NurbsSurface Patch and etc
type: docs
weight: 2030
url: /net/aspose.threed.entities/geometry/
---
## Geometry class

The base class of all renderable geometric objects (like [`Mesh`](../mesh/), [`NurbsSurface`](../nurbssurface/), [`Patch`](../patch/) and etc.).

The `Geometry` base class supports: **Control point management**, control points defines the base 3D spatial structure of the geometry, different geometric types has different way to define concrete 3D models. **Vertex element definition**, vertex elements applies extra information like normals/uv coordinates/vertex colors to the geometry, see [`VertexElement`](../vertexelement/) for more details.**Object deforming**, [`Deformer`](../../aspose.threed.deformers/deformer/) can be bonded to animate geometry's shape.

```csharp
public class Geometry : Entity
```

## Constructors

| Name | Description |
| --- | --- |
| [Geometry](geometry/)(string) | Initializes a new instance of the `Geometry` class. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Gets all control points |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Gets all deformers associated with this geometry. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Gets all vertex elements |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Gets or sets if the geometry is visible |

## Methods

| Name | Description |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Adds an existing vertex element to current geometry |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/#createelement)(VertexElementType) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/#createelement_1)(VertexElementType, MappingMode, ReferenceMode) | Creates a vertex element with specified type and add it to the geometry. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/#createelementuv)(TextureMapping) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/#createelementuv_1)(TextureMapping, MappingMode, ReferenceMode) | Creates a [`VertexElementUV`](../vertexelementuv/) with given texture mapping type. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Gets the bounding box of current entity in its object space coordinate system.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Gets a vertex element with specified type |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Gets the key of the entity renderer registered in the renderer(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Get the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Gets a [`VertexElementUV`](../vertexelementuv/) instance with given texture mapping type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Removes a dynamic property.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Remove the specified property identified by name(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Sets the value of specified property(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |

### See Also

* class [Entity](../../aspose.threed/entity/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


