---
title: TransformBuilder.Translate
second_title: Aspose.3D for .NET API Reference
description: TransformBuilder method. Chain a translation transform
type: docs
weight: 150
url: /net/aspose.threed.utilities/transformbuilder/translate/
---
## Translate(double, double, double) {#translate_1}

Chain a translation transform

```csharp
public TransformBuilder Translate(double tx, double ty, double tz)
```

| Parameter | Type | Description |
| --- | --- | --- |
| tx | Double |  |
| ty | Double |  |
| tz | Double |  |

### Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Translate(0, 10, 0);
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## Translate(Vector3) {#translate}

Chain a translation transform

```csharp
public TransformBuilder Translate(Vector3 v)
```

| Parameter | Type | Description |
| --- | --- | --- |
| v | Vector3 |  |

### Examples

```csharp
TransformBuilder tb = new TransformBuilder();
tb.Translate(new Vector3(0, 10, 0));
Console.WriteLine($"Transform Matrix: {tb.Matrix}");
```

### See Also

* struct [Vector3](../../vector3/)
* class [TransformBuilder](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


