---
title: Class Metered
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.AsposeDrawing.Metered class. Provides methods to set metered key
type: docs
weight: 30
url: /net/system.drawing.asposedrawing/metered/
---
## Metered class

Provides methods to set metered key.

```csharp
public sealed class Metered : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Metered](metered/)() | Initializes a new instance of the `Metered` class. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../system.drawing.asposedrawing/metered/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [SetMeteredKey](../../system.drawing.asposedrawing/metered/setmeteredkey/)(string, string) | Sets metered public and private key |
| static [GetConsumptionCredit](../../system.drawing.asposedrawing/metered/getconsumptioncredit/)() | Gets consumption credit. |
| static [GetConsumptionQuantity](../../system.drawing.asposedrawing/metered/getconsumptionquantity/)() | Gets consumption file size. |

## Examples

In this example, an attempt will be made to set metered public and private key

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

### See Also

* namespace [System.Drawing.AsposeDrawing](../../system.drawing.asposedrawing/)
* assembly [Aspose.Drawing](../../)


