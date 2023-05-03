---
title: Class Metered
second_title: Aspose.Drawing voor .NET API-referentie
description: Aspose.Drawing.Metered klas. Biedt methoden om gemeten sleutel in te stellen.
type: docs
weight: 20
url: /nl/net/aspose.drawing/metered/
---
## Metered class

Biedt methoden om gemeten sleutel in te stellen.

```csharp
public sealed class Metered : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Metered](metered/)() | Initialiseert een nieuw exemplaar van het`Metered` klasse. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Dispose](../../aspose.drawing/metered/dispose/)() | Voert door de toepassing gedefinieerde taken uit die verband houden met het vrijmaken, vrijgeven of resetten van onbeheerde bronnen. |
| [SetMeteredKey](../../aspose.drawing/metered/setmeteredkey/)(string, string) | Stelt gemeten publieke en private sleutel in |
| static [GetConsumptionCredit](../../aspose.drawing/metered/getconsumptioncredit/)() | Krijgt consumptietegoed. |
| static [GetConsumptionQuantity](../../aspose.drawing/metered/getconsumptionquantity/)() | Krijgt de bestandsgrootte van het verbruik. |

### Voorbeelden

In dit voorbeeld wordt geprobeerd een gemeten openbare en privésleutel in te stellen

```csharp
[C#]

Metered matered = new Metered();
matered.SetMeteredKey("PublicKey", "PrivateKey");


[Visual Basic]

Dim matered As Metered = New Metered
matered.SetMeteredKey("PublicKey", "PrivateKey")
```

het component jar-bestand:

```csharp
Metered matered = new Metered();
matered.setMeteredKey("PublicKey", "PrivateKey");
```

### Zie ook

* naamruimte [Aspose.Drawing](../../aspose.drawing/)
* montage [Aspose.Drawing](../../)


