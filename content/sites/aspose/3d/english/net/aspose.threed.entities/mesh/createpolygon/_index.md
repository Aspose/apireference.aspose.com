---
title: Mesh.CreatePolygon
second_title: Aspose.3D for .NET API Reference
description: Mesh method. Creates a new polygon with all vertices defined in indices. To create polygon vertex by vertex please use PolygonBuilder
type: docs
weight: 60
url: /net/aspose.threed.entities/mesh/createpolygon/
---
## CreatePolygon(int[], int, int) {#createpolygon_3}

Creates a new polygon with all vertices defined in *indices*. To create polygon vertex by vertex, please use [`PolygonBuilder`](../../polygonbuilder/).

```csharp
public void CreatePolygon(int[] indices, int offset, int length)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indices | Int32[] | Array of the polygon indices, each index points to a control point that forms the polygon. |
| offset | Int32 | The offset of the first polygon index |
| length | Int32 | The length of the indices |

### Examples

The following code shows how to create a new polygon with control point's indices.

```csharp
var mesh = new Mesh();
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## CreatePolygon(int[]) {#createpolygon_2}

Creates a new polygon with all vertices defined in *indices*. To create polygon vertex by vertex, please use [`PolygonBuilder`](../../polygonbuilder/).

```csharp
public void CreatePolygon(int[] indices)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indices | Int32[] | Array of the polygon indices, each index points to a control point that forms the polygon. |

### Examples

```csharp
var mesh = new Mesh();
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## CreatePolygon(int, int, int, int) {#createpolygon_1}

Create a polygon with 4 vertices(quad)

```csharp
public void CreatePolygon(int v1, int v2, int v3, int v4)
```

| Parameter | Type | Description |
| --- | --- | --- |
| v1 | Int32 | Index of the first vertex |
| v2 | Int32 | Index of the second vertex |
| v3 | Int32 | Index of the third vertex |
| v4 | Int32 | Index of the fourth vertex |

### Examples

The following code shows how to create a new polygon with control point's indices.

```csharp
var mesh = new Mesh();
mesh.CreatePolygon(0, 1, 2, 3);
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)

---

## CreatePolygon(int, int, int) {#createpolygon}

Create a polygon with 3 vertices(triangle)

```csharp
public void CreatePolygon(int v1, int v2, int v3)
```

| Parameter | Type | Description |
| --- | --- | --- |
| v1 | Int32 | Index of the first vertex |
| v2 | Int32 | Index of the second vertex |
| v3 | Int32 | Index of the third vertex |

### Examples

The following code shows how to create a new polygon with control point's indices.

```csharp
var mesh = new Mesh();
mesh.CreatePolygon(0, 1, 2);
```

### See Also

* class [Mesh](../)
* namespace [Aspose.ThreeD.Entities](../../../aspose.threed.entities/)
* assembly [Aspose.3D](../../../)


