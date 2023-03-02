---
title: NumericFormat.Flat
second_title: Aspose.GIS voor .NET API-referentie
description: NumericFormat methode. Converteert een getal naar een vastekommatekst zonder wetenschappelijke notatie.
type: docs
weight: 20
url: /nl/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Converteert een getal naar een vaste-kommatekst zonder wetenschappelijke notatie.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| significantDigits | Int32 | Aantal significante cijfers. De maximaal beschikbare precisie is "308" |

### Winstwaarde

De afrondingsprecisiespecificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Aantal significante cijfers is kleiner dan 0 of groter dan 308. |

### Opmerkingen

Interne code genereert nummerstrings voor WKT via: coordinate.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### Zie ook

* class [NumericFormat](../)
* naamruimte [Aspose.Gis](../../numericformat/)
* montage [Aspose.GIS](../../../)


