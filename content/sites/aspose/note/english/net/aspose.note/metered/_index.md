---
title: Class Metered
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Metered class. Provides methods to set metered key
type: docs
weight: 420
url: /net/aspose.note/metered/
---
## Metered class

Provides methods to set metered key.

```csharp
public class Metered
```

## Constructors

| Name | Description |
| --- | --- |
| [Metered](metered/)() | The default constructor. |

## Methods

| Name | Description |
| --- | --- |
| [ResetMeteredKey](../../aspose.note/metered/resetmeteredkey/)() | Removes previously setup license. |
| [SetMeteredKey](../../aspose.note/metered/setmeteredkey/)(string, string) | Sets metered public and private keys. |
| static [GetConsumptionCredit](../../aspose.note/metered/getconsumptioncredit/)() | Gets consumption credit. |
| static [GetConsumptionQuantity](../../aspose.note/metered/getconsumptionquantity/)() | Gets consumption file size. |

## Examples

In this example, an attempt will be made to set metered public and private key

```csharp
[C#]

Metered metered = new Metered();
metered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim metered As Metered = New Metered
metered.SetMeteredKey("PublicKey", "PrivateKey")
```

Shows how to set metered license.

```csharp
Metered metered = new Metered();
metered.SetMeteredKey("MyPublicKey", "MyPrivateKey");

Console.WriteLine($"Credit before operation: {Metered.GetConsumptionCredit():F2}");
Console.WriteLine($"Consumption quantity before operation: {Metered.GetConsumptionQuantity():F2}");

// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_Pages();

// Load OneNote document and get first child           
Document document = new Document(Path.Combine(dataDir, "Aspose.one"));

document.Save(Path.Combine(dataDir, "MeteredLicense.pdf"));

Console.WriteLine($"Credit before operation: {Metered.GetConsumptionCredit():F2}");
Console.WriteLine($"Consumption quantity before operation: {Metered.GetConsumptionQuantity():F2}");
```

### See Also

* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)


