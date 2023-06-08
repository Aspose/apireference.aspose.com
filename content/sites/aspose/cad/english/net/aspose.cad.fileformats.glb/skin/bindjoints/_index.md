---
title: Skin.BindJoints
second_title: Aspose.CAD for .NET API Reference
description: Skin method. 
type: docs
weight: 40
url: /net/aspose.cad.fileformats.glb/skin/bindjoints/
---
## BindJoints(params Node[]) {#bindjoints}

```csharp
public void BindJoints(params Node[] joints)
```

### See Also

* class [Node](../../node/)
* class [Skin](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../skin/)
* assembly [Aspose.CAD](../../../)

---

## BindJoints(Matrix4x4, params Node[]) {#bindjoints_1}

Binds a bone armature of [`Node`](../../node/) to the associated skinned mesh.

```csharp
public void BindJoints(Matrix4x4 meshBindTransform, params Node[] joints)
```

| Parameter | Type | Description |
| --- | --- | --- |
| meshBindTransform | Matrix4x4 | The world transform matrix of the mesh at the time of binding. |
| joints | Node[] | A collection of [`Node`](../../node/) joints. |

## Remarks

This method uses the [`WorldMatrix`](../../node/worldmatrix/) value of each joint to computer the inverse bind matrix.

### See Also

* class [Node](../../node/)
* class [Skin](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../skin/)
* assembly [Aspose.CAD](../../../)

---

## BindJoints((Node Joint, Matrix4x4 InverseBindMatrix)[]) {#bindjoints_2}

Binds a bone armature of [`Node`](../../node/) to the associated skinned mesh.

```csharp
public void BindJoints((Node Joint, Matrix4x4 InverseBindMatrix)[] joints)
```

| Parameter | Type | Description |
| --- | --- | --- |
| joints | ValueTuple`2[] | A collection of [`Node`](../../node/) joints, where each joint has an Inverse Bind Matrix. |

### See Also

* class [Node](../../node/)
* class [Skin](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../skin/)
* assembly [Aspose.CAD](../../../)


