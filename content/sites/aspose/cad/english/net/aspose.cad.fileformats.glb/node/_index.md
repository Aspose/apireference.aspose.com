---
title: Class Node
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Node class. A node in the node hierarchy. When the node contains skin all mesh.primitives MUST contain JOINTS_0 and WEIGHTS_0 attributes. A node MAY have either a matrix or any combination of translation/rotation/scale TRS properties. TRS properties are converted to matrices and postmultiplied in the T  R  S order to compose the transformation matrix first the scale is applied to the vertices then the rotation and then the translation. If none are provided the transform is the identity. When a node is targeted for animation referenced by an animation.channel.target matrix MUST NOT be present
type: docs
weight: 10780
url: /net/aspose.cad.fileformats.glb/node/
---
## Node class

A node in the node hierarchy. When the node contains `skin`, all `mesh.primitives` **MUST** contain `JOINTS_0` and `WEIGHTS_0` attributes. A node **MAY** have either a `matrix` or any combination of `translation`/`rotation`/`scale` (TRS) properties. TRS properties are converted to matrices and postmultiplied in the `T * R * S` order to compose the transformation matrix; first the scale is applied to the vertices, then the rotation, and then the translation. If none are provided, the transform is the identity. When a node is targeted for animation (referenced by an animation.channel.target), `matrix` **MUST NOT** be present.

```csharp
public sealed class Node : LogicalChildOfRoot, IVisualNodeContainer
```

## Properties

| Name | Description |
| --- | --- |
| [Camera](../../aspose.cad.fileformats.glb/node/camera/) { get; set; } | Gets or sets the [`Camera`](../camera/) of this `Node`. |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [IsSkinJoint](../../aspose.cad.fileformats.glb/node/isskinjoint/) { get; } | Gets a value indicating whether this node is used as a Bone joint in a [`Skin`](./skin/). |
| [IsSkinSkeleton](../../aspose.cad.fileformats.glb/node/isskinskeleton/) { get; } | Gets a value indicating whether this node is used as a Skeleton node in a [`Skin`](./skin/). |
| [IsTransformAnimated](../../aspose.cad.fileformats.glb/node/istransformanimated/) { get; } | Gets a value indicating whether this transform is affected by any animation. |
| [LocalMatrix](../../aspose.cad.fileformats.glb/node/localmatrix/) { get; set; } | Gets or sets the local transform Matrix4x4 of this `Node`. |
| [LocalTransform](../../aspose.cad.fileformats.glb/node/localtransform/) { get; set; } | Gets or sets the local Scale, Rotation and Translation of this `Node`. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Mesh](../../aspose.cad.fileformats.glb/node/mesh/) { get; set; } | Gets or sets the [`Mesh`](../mesh/) of this `Node`. |
| [MorphWeights](../../aspose.cad.fileformats.glb/node/morphweights/) { get; } | Gets the Morph Weights of this `Node`. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [PunctualLight](../../aspose.cad.fileformats.glb/node/punctuallight/) { get; set; } | Gets or sets the [`PunctualLight`](../punctuallight/) of this `Node`. |
| [Skin](../../aspose.cad.fileformats.glb/node/skin/) { get; set; } | Gets or sets the [`Skin`](../skin/) of this `Node`. |
| [VisualChildren](../../aspose.cad.fileformats.glb/node/visualchildren/) { get; } | Gets the visual children `Node` instances contained in this `Node`. |
| [VisualParent](../../aspose.cad.fileformats.glb/node/visualparent/) { get; } | Gets the visual parent `Node` instance that contains this `Node`. |
| [VisualRoot](../../aspose.cad.fileformats.glb/node/visualroot/) { get; } | Gets the visual root `Node` instance that contains this `Node`. |
| [VisualScenes](../../aspose.cad.fileformats.glb/node/visualscenes/) { get; } | Gets the collection of [`Scene`](../scene/) instances that reference this `Node`. |
| [WorldMatrix](../../aspose.cad.fileformats.glb/node/worldmatrix/) { get; set; } | Gets or sets the world Matrix4x4 of this `Node`. |

## Methods

| Name | Description |
| --- | --- |
| [CreateNode](../../aspose.cad.fileformats.glb/node/createnode/)(string) | Creates a new `Node` instance, adds it to !:GlbImage.LogicalNodes and references it as a child in the current graph. |
| [GetCurveSamplers](../../aspose.cad.fileformats.glb/node/getcurvesamplers/)(Animation) |  |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [GetGpuInstancing](../../aspose.cad.fileformats.glb/node/getgpuinstancing/)() |  |
| [GetLocalTransform](../../aspose.cad.fileformats.glb/node/getlocaltransform/)(Animation, float) | Gets the local transform of this node in a given animation at a given time. |
| [GetMorphWeights](../../aspose.cad.fileformats.glb/node/getmorphweights/)() |  |
| [GetWorldMatrix](../../aspose.cad.fileformats.glb/node/getworldmatrix/)(Animation, float) | Gets the world matrix of this node in a given animation at a given time. |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [RemoveGpuInstancing](../../aspose.cad.fileformats.glb/node/removegpuinstancing/)() |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [SetMorphWeights](../../aspose.cad.fileformats.glb/node/setmorphweights/)(SparseWeight8) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |
| [UseGpuInstancing](../../aspose.cad.fileformats.glb/node/usegpuinstancing/)() |  |
| static [FindNodesUsingMesh](../../aspose.cad.fileformats.glb/node/findnodesusingmesh/)(Mesh) | Gets a collection of `Node` instances using *mesh*. |
| static [FindNodesUsingSkin](../../aspose.cad.fileformats.glb/node/findnodesusingskin/)(Skin) | Gets a collection of `Node` instances using *skin*. |
| static [Flatten](../../aspose.cad.fileformats.glb/node/flatten/)(IVisualNodeContainer) | Returns all the `Node` instances of a visual hierarchy as a flattened list. |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* interface [IVisualNodeContainer](../ivisualnodecontainer/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


