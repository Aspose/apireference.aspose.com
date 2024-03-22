---
title: Class Shape
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Entities.Shape class. The shape describes the deformation on a set of control points which is similar to the cluster deformer in Maya. For example we can add a shape to a created geometry. And the shape and the geometry have the same topological information but different position of the control points. With varying amounts of influence the geometry performs a deformation effect
type: docs
weight: 2340
url: /net/aspose.threed.entities/shape/
---
## Shape class

The shape describes the deformation on a set of control points, which is similar to the cluster deformer in Maya. For example, we can add a shape to a created geometry. And the shape and the geometry have the same topological information but different position of the control points. With varying amounts of influence, the geometry performs a deformation effect.

```csharp
public class Shape : Geometry
```

## Constructors

| Name | Description |
| --- | --- |
| [Shape](shape/#constructor)() | Initializes a new instance of the `Shape` class. |
| [Shape](shape/#constructor_1)(string) | Initializes a new instance of the `Shape` class. |

## Properties

| Name | Description |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Gets or sets whether this geometry can cast shadow(Inherited from [`Geometry`](../geometry/).) |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Gets all control points(Inherited from [`Geometry`](../geometry/).) |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Gets all deformers associated with this geometry.(Inherited from [`Geometry`](../geometry/).) |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Gets or sets whether to exclude this entity during exporting.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Indices](../../aspose.threed.entities/shape/indices/) { get; } | Gets the indices. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Gets or sets the name.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing(Inherited from [`Entity`](../../aspose.threed/entity/).) |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Gets the collection of all properties.(Inherited from [`A3DObject`](../../aspose.threed/a3dobject/).) |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Gets or sets whether this geometry can receive shadow.(Inherited from [`Geometry`](../geometry/).) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Gets the scene that this object belongs to(Inherited from [`SceneObject`](../../aspose.threed/sceneobject/).) |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Gets all vertex elements(Inherited from [`Geometry`](../geometry/).) |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Gets or sets if the geometry is visible(Inherited from [`Geometry`](../geometry/).) |

## Methods

| Name | Description |
| --- | --- |
| static [FromControlPoints](../../aspose.threed.entities/shape/fromcontrolpoints/)(params Vector3[]) | Create a shape with specified control points with a default indices. |
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

### See Also

* class [Geometry](../geometry/)
* namespace [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* assembly [Aspose.3D](../../)


