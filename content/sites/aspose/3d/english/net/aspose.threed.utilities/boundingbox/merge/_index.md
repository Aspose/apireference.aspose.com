---
title: BoundingBox.Merge
second_title: Aspose.3D for .NET API Reference
description: BoundingBox method. Merge current bounding box with given point
type: docs
weight: 130
url: /net/aspose.threed.utilities/boundingbox/merge/
---
## Merge(Vector4) {#merge_2}

Merge current bounding box with given point

```csharp
public void Merge(Vector4 pt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pt | Vector4 | The point to be merged into the bounding box |

### Examples

The following code shows how to merge a point to bounding box.

```csharp
var boundingBox = BoundingBox.Null;
boundingBox.Merge(new Vector4(1, 10, -1));
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* struct [Vector4](../../vector4/)
* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## Merge(Vector3) {#merge_1}

Merge current bounding box with given point

```csharp
public void Merge(Vector3 pt)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pt | Vector3 | The point to be merged into the bounding box |

### Examples

The following code shows how to merge a point to bounding box.

```csharp
var boundingBox = BoundingBox.Null;
boundingBox.Merge(new Vector3(1, 10, -1));
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* struct [Vector3](../../vector3/)
* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## Merge(double, double, double) {#merge_3}

Merge current bounding box with given point

```csharp
public void Merge(double x, double y, double z)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | The point to be merged into the bounding box |
| y | Double | The point to be merged into the bounding box |
| z | Double | The point to be merged into the bounding box |

### Examples

The following code shows how to merge a point to bounding box.

```csharp
var boundingBox = BoundingBox.Null;
boundingBox.Merge(1, 10, -1);
Console.WriteLine("Bounding box = " + boundingBox);
```

### See Also

* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## Merge(BoundingBox) {#merge}

Merges the new box into the current bounding box.

```csharp
public void Merge(BoundingBox bb)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bb | BoundingBox | The bounding box to merge |

### See Also

* struct [BoundingBox](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


