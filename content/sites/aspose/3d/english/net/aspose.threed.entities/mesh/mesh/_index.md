---
title: Mesh.Mesh
second_title: Aspose.3D for .NET API Reference
description: Mesh constructor. Initializes a new instance of the Mesh class
type: docs
weight: 10
url: /net/aspose.threed.entities/mesh/mesh/
---
## Mesh() {#constructor}

Initializes a new instance of the [`Mesh`](../) class.

```csharp
public Mesh()
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## Mesh(TextureData) {#constructor_1}

Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate.

```csharp
public Mesh(TextureData heightMap)
```

| Parameter | Type | Description |
| --- | --- | --- |
| heightMap | TextureData | Input height map |

### See Also

* class [TextureData](../../../aspose.threed.render/texturedata/)
* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## Mesh(TextureData, Matrix4) {#constructor_2}

Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate.

```csharp
public Mesh(TextureData heightMap, Matrix4 transform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| heightMap | TextureData | Input height map |
| transform | Matrix4 | The transform that applied on the control points |

### See Also

* class [TextureData](../../../aspose.threed.render/texturedata/)
* struct [Matrix4](../../../aspose.threed.utilities/matrix4/)
* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## Mesh(TextureData, bool, Matrix4) {#constructor_3}

Construct a mesh using specified height map, if the height map's pixel format contains multiple components, the first(usually the red) component will be used as the height value(z) The control point's x and y components are normalized pixel coordinate.

```csharp
public Mesh(TextureData heightMap, bool triMesh, Matrix4 transform)
```

| Parameter | Type | Description |
| --- | --- | --- |
| heightMap | TextureData | Input height map |
| triMesh | Boolean |  |
| transform | Matrix4 | The transform that applied on the control points |

### See Also

* class [TextureData](../../../aspose.threed.render/texturedata/)
* struct [Matrix4](../../../aspose.threed.utilities/matrix4/)
* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## Mesh(string) {#constructor_4}

Initializes a new instance of the [`Mesh`](../) class.

```csharp
public Mesh(string name)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | Name. |

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)


