---
title: Aspose.ThreeD.Utilities
second_title: Aspose.3D for .NET API Reference
description: All utility classes are defined in this namespace
type: docs
weight: 100
url: /net/aspose.threed.utilities/
---
All utility classes are defined in this namespace.

## Classes

| Class | Description |
| --- | --- |
| [FileSystem](./filesystem/) | File system encapsulation. Aspose.3D will use this to read/write dependencies. |
| [IOExtension](./ioextension/) | Utilities to write matrix/vector to binary writer |
| [MathUtils](./mathutils/) | A set of useful mathematical utilities. |
| [ParseException](./parseexception/) | Exception when Aspose.3D failed to parse the input. |
| [SemanticAttribute](./semanticattribute/) | Allow user to use their own structure for static declaration of [`VertexDeclaration`](../aspose.threed.utilities/vertexdeclaration/) |
| [TransformBuilder](./transformbuilder/) | The [`TransformBuilder`](../aspose.threed.utilities/transformbuilder/) is used to build transform matrix by a chain of transformations. |
| [Vertex](./vertex/) | Vertex reference, used to access the raw vertex in [`TriMesh`](../aspose.threed.entities/trimesh/). |
| [VertexDeclaration](./vertexdeclaration/) | The declaration of a custom defined vertex's structure |
| [VertexField](./vertexfield/) | Vertex's field memory layout description. |
| [Watermark](./watermark/) | Utility to encode/decode blind watermark to/from a mesh. |
## Structures

| Structure | Description |
| --- | --- |
| [BoundingBox](./boundingbox/) | The axis-aligned bounding box |
| [BoundingBox2D](./boundingbox2d/) | The axis-aligned bounding box for [`Vector2`](../aspose.threed.utilities/vector2/) |
| [FMatrix4](./fmatrix4/) | Matrix 4x4 with all component in float type |
| [FVector2](./fvector2/) | A float vector with two components. |
| [FVector3](./fvector3/) | A float vector with three components. |
| [FVector4](./fvector4/) | A float vector with four components. |
| [Matrix4](./matrix4/) | 4x4 matrix implementation. |
| [Quaternion](./quaternion/) | Quaternion is usually used to perform rotation in computer graphics. |
| [Rect](./rect/) | A class to represent the rectangle |
| [RelativeRectangle](./relativerectangle/) | Relative rectangle The formula between relative component to absolute value is: Scale * (Reference Width) + offset So if we want it to represent an absolute value, leave all scale fields zero, and use offset fields instead. |
| [Vector2](./vector2/) | A vector with two components. |
| [Vector3](./vector3/) | A vector with three components. |
| [Vector4](./vector4/) | A vector with four components. |
## Interfaces

| Interface | Description |
| --- | --- |
| [IArrayList&lt;T&gt;](./iarraylist-1/) | Aspose.3D has its own highly optimized implementation of List for better loading/saving performance Only this interface is exposed for user with IList compatible and similar interfaces. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [BoundingBoxExtent](./boundingboxextent/) | The extent of the bounding box |
| [ComposeOrder](./composeorder/) | The order to compose transform matrix |
| [RotationOrder](./rotationorder/) | The order controls which rx ry rz are applied in the transformation matrix. |
| [VertexFieldDataType](./vertexfielddatatype/) | Vertex field's data type |
| [VertexFieldSemantic](./vertexfieldsemantic/) | The semantic of the vertex field |


