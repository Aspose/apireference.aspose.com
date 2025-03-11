---
title: TransformBuilder.Scale
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a scaling transform matrix with a component scaled by s
type: docs
weight: 140
url: /net/aspose.threed.utilities/transformbuilder/scale/
---
## Scale(double) {#scale_1}

Chain a scaling transform matrix with a component scaled by s

```csharp
public TransformBuilder Scale(double s)
```

| Parameter | Type | Description |
| --- | --- | --- |
| s | Double |  |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Scale(10);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)

---

## Scale(double, double, double) {#scale_2}

Chain a scaling transform matrix

```csharp
public TransformBuilder Scale(double x, double y, double z)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double |  |
| y | Double |  |
| z | Double |  |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Scale(10, 10, 10);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)

---

## Scale(Vector3) {#scale}

Chain a scale transform

```csharp
public TransformBuilder Scale(Vector3 s)
```

| Parameter | Type | Description |
| --- | --- | --- |
| s | Vector3 |  |

## Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Scale(new Vector3(10, 10, 10));
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Vector3](../../vector3/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../transformbuilder/)
* assembly [Aspose.3D](../../../)


