---
title: NumericFormat.Flat
second_title: Aspose.GIS für .NET-API-Referenz
description: NumericFormat methode. Konvertiert eine Zahl in einen Festkommatext ohne wissenschaftliche Schreibweise.
type: docs
weight: 20
url: /de/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Konvertiert eine Zahl in einen Festkommatext ohne wissenschaftliche Schreibweise.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| significantDigits | Int32 | Anzahl signifikanter Stellen. Die maximal verfügbare Genauigkeit ist "308". |

### Rückgabewert

Der Rundungspräzisionsbezeichner.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | Anzahl signifikanter Stellen ist kleiner als 0 oder größer als 308. |

### Bemerkungen

Interner Code generiert Zahlenzeichenfolgen für WKT über:ordinate.ToString("0.##..", CultureInfo.InvariantCulture) Decision.

### Siehe auch

* class [NumericFormat](../)
* namensraum [Aspose.Gis](../../numericformat/)
* Montage [Aspose.GIS](../../../)


