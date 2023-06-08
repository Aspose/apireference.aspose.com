---
title: SceneBuilder.AddRigidMesh
second_title: Aspose.CAD for .NET API Reference
description: SceneBuilder method. Adds a mesh instance to the scene attached to an animatable NodeBuilder
type: docs
weight: 90
url: /net/aspose.cad.fileformats.glb.scenes/scenebuilder/addrigidmesh/
---
## AddRigidMesh(IMeshBuilder&lt;MaterialBuilder&gt;, NodeBuilder) {#addrigidmesh}

Adds a mesh instance to the scene, attached to an animatable [`NodeBuilder`](../../nodebuilder/)

```csharp
public InstanceBuilder AddRigidMesh(IMeshBuilder<MaterialBuilder> mesh, NodeBuilder node)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mesh | IMeshBuilder`1 | The mesh to add. |
| node | NodeBuilder | The node to which the mesh will be attached. |

### Return Value

The instance representing this mesh-node pair.

### See Also

* class [InstanceBuilder](../../instancebuilder/)
* interface [IMeshBuilder&lt;TMaterial&gt;](../../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* class [NodeBuilder](../../nodebuilder/)
* class [SceneBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../scenebuilder/)
* assembly [Aspose.CAD](../../../)

---

## AddRigidMesh(IMeshBuilder&lt;MaterialBuilder&gt;, AffineTransform) {#addrigidmesh_2}

Adds a mesh instance to the scene, at the given location.

```csharp
public InstanceBuilder AddRigidMesh(IMeshBuilder<MaterialBuilder> mesh, 
    AffineTransform meshWorldTransform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mesh | IMeshBuilder`1 | The mesh to add. |
| meshWorldTransform | AffineTransform | The location of the mesh. |

### Return Value

The instance representing this mesh.

## Remarks

Mesh instances with a fixed transform cannot be animated, If you need morph animations, use `AddRigidMesh` instead.

### See Also

* class [InstanceBuilder](../../instancebuilder/)
* interface [IMeshBuilder&lt;TMaterial&gt;](../../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* struct [AffineTransform](../../../aspose.cad.fileformats.glb.transforms/affinetransform/)
* class [SceneBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../scenebuilder/)
* assembly [Aspose.CAD](../../../)

---

## AddRigidMesh(IMeshBuilder&lt;MaterialBuilder&gt;, NodeBuilder, AffineTransform) {#addrigidmesh_1}

Adds a mesh instance to the scene, at the given location, relative to the given node.

```csharp
public InstanceBuilder AddRigidMesh(IMeshBuilder<MaterialBuilder> mesh, NodeBuilder node, 
    AffineTransform instanceTransform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mesh | IMeshBuilder`1 | The mesh to add. |
| node | NodeBuilder | The parent node. |
| instanceTransform | AffineTransform | The location of the mesh. |

### Return Value

The instance representing this mesh.

## Remarks

Mesh instances with a fixed transform cannot be animated, If you need morph animations, use `AddRigidMesh` instead.

### See Also

* class [InstanceBuilder](../../instancebuilder/)
* interface [IMeshBuilder&lt;TMaterial&gt;](../../../aspose.cad.fileformats.glb.geometry/imeshbuilder-1/)
* class [MaterialBuilder](../../../aspose.cad.fileformats.glb.materials/materialbuilder/)
* class [NodeBuilder](../../nodebuilder/)
* struct [AffineTransform](../../../aspose.cad.fileformats.glb.transforms/affinetransform/)
* class [SceneBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Scenes](../../scenebuilder/)
* assembly [Aspose.CAD](../../../)


