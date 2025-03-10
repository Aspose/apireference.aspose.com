---
title: MathUtils.Clamp
second_title: Aspose.3D for .NET API Reference
description: MathUtils method. Clamp value to range min max
type: docs
weight: 20
url: /net/aspose.threed.utilities/mathutils/clamp/
---
## MathUtils.Clamp method

Clamp value to range [min, max]

```csharp
public static double Clamp(double val, double min, double max)
```

| Parameter | Type | Description |
| --- | --- | --- |
| val | Double | Value to clamp. |
| min | Double | Minimum value. |
| max | Double | Maximum value. |

### Return Value

The value between [min, max]

## Examples

```csharp
var val = 195;
//Clamp value to [0, 100]
var clampedValue = MathUtils.Clamp(val, 0, 100);
//This will output 100
Console.WriteLine($"Value = {val}");
```

### See Also

* class [MathUtils](../)
* namespace [Aspose.ThreeD.Utilities](../../mathutils/)
* assembly [Aspose.3D](../../../)


