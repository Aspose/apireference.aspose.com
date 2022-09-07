---
title: Pose
second_title: Aspose.3D for Java API Reference
description: The pose is used to store transformation matrix when the geometry is skinned.
type: docs
weight: 121
url: /java/com.aspose.threed/pose/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class Pose extends A3DObject
```

The pose is used to store transformation matrix when the geometry is skinned. The pose is a set of com.aspose.threed.BonePose, each com.aspose.threed.BonePose saves the concrete transformation information of the bone node.
## Constructors

| Constructor | Description |
| --- | --- |
| [Pose(String name)](#Pose-java.lang.String-) | Initializes a new instance of the com.aspose.threed.Pose class. |
| [Pose()](#Pose--) | Initializes a new instance of the com.aspose.threed.Pose class. |
## Methods

| Method | Description |
| --- | --- |
| [getPoseType()](#getPoseType--) | Gets the type of the pose. |
| [setPoseType(PoseType value)](#setPoseType-com.aspose.threed.PoseType-) | Sets the type of the pose. |
| [getBonePoses()](#getBonePoses--) | Gets all com.aspose.threed.BonePose. |
| [addBonePose(Node node, Matrix4 matrix, boolean localMatrix)](#addBonePose-com.aspose.threed.Node-com.aspose.threed.Matrix4-boolean-) | Saves pose transformation matrix for the given bone node. |
| [addBonePose(Node node, Matrix4 matrix)](#addBonePose-com.aspose.threed.Node-com.aspose.threed.Matrix4-) | Saves pose transformation matrix for the given bone node. |
### Pose(String name) {#Pose-java.lang.String-}
```
public Pose(String name)
```


Initializes a new instance of the com.aspose.threed.Pose class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### Pose() {#Pose--}
```
public Pose()
```


Initializes a new instance of the com.aspose.threed.Pose class.

### getPoseType() {#getPoseType--}
```
public PoseType getPoseType()
```


Gets the type of the pose.

**Returns:**
[PoseType](../../com.aspose.threed/posetype)
### setPoseType(PoseType value) {#setPoseType-com.aspose.threed.PoseType-}
```
public void setPoseType(PoseType value)
```


Sets the type of the pose.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PoseType](../../com.aspose.threed/posetype) | New value |

### getBonePoses() {#getBonePoses--}
```
public List<BonePose> getBonePoses()
```


Gets all com.aspose.threed.BonePose.

**Returns:**
java.util.List<com.aspose.threed.BonePose>
### addBonePose(Node node, Matrix4 matrix, boolean localMatrix) {#addBonePose-com.aspose.threed.Node-com.aspose.threed.Matrix4-boolean-}
```
public void addBonePose(Node node, Matrix4 matrix, boolean localMatrix)
```


Saves pose transformation matrix for the given bone node.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | Bone Node. |
| matrix | [Matrix4](../../com.aspose.threed/matrix4) | Transformation matrix. |
| localMatrix | boolean | If set to \`\`\` true \`\`\` means to use local matrix otherwise means global matrix. |

### addBonePose(Node node, Matrix4 matrix) {#addBonePose-com.aspose.threed.Node-com.aspose.threed.Matrix4-}
```
public void addBonePose(Node node, Matrix4 matrix)
```


Saves pose transformation matrix for the given bone node. Global transformation matrix is implied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) | Bone Node. |
| matrix | [Matrix4](../../com.aspose.threed/matrix4) | Transformation matrix. |

