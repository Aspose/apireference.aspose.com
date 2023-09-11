---
title: Class Metered
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Metered class. Provides methods to set metered key
type: docs
weight: 870
url: /net/aspose.drawing/metered/
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
| [Dispose](../../aspose.drawing/metered/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [SetMeteredKey](../../aspose.drawing/metered/setmeteredkey/)(string, string) | Sets metered public and private key |
| static [GetConsumptionCredit](../../aspose.drawing/metered/getconsumptioncredit/)() | Gets consumption credit. |
| static [GetConsumptionQuantity](../../aspose.drawing/metered/getconsumptionquantity/)() | Gets consumption file size. |

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

the component jar file:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


