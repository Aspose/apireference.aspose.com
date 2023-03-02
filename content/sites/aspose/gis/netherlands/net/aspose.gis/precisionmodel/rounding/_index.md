---
title: PrecisionModel.Rounding
second_title: Aspose.GIS voor .NET API-referentie
description: PrecisionModel methode. Geeft als resultaat een afrondingsprecisiemodel. Volgens het afrondingsprecisiemodel is slechts een beperkt aantal cijfers significant.
type: docs
weight: 20
url: /nl/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Geeft als resultaat een afrondingsprecisiemodel. Volgens het afrondingsprecisiemodel is slechts een beperkt aantal cijfers significant.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| significantDigits | Int32 | Aantal significante cijfers. |

### Winstwaarde

Afrondingsprecisiemodel.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Aantal significante cijfers is minder dan 0 of meer dan 15. |

### Opmerkingen

Wanneer toegepast op een coördinaat, wordt de volgende code gebruikt om de precisie te verminderen:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Zie ook

* class [PrecisionModel](../)
* naamruimte [Aspose.Gis](../../precisionmodel/)
* montage [Aspose.GIS](../../../)


