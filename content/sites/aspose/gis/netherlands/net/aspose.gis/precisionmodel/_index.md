---
title: Class PrecisionModel
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.PrecisionModel klas. PrecisionModel specificeert een aantal significante cijfers in een coördinaat.
type: docs
weight: 1310
url: /nl/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` specificeert een aantal significante cijfers in een coördinaat.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Geeft een exact precisiemodel terug. Volgens het exacte precisiemodel zijn alle cijfers in een dubbele waarde significant. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Krijgt een waarde die aangeeft of dit precisiemodel exact is. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Krijgt een waarde die aangeeft of dit precisiemodel afrondt. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Krijgt een aantal significante cijfers in een precisiemodel als het afrondt. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Geeft als resultaat een afrondingsprecisiemodel. Volgens het afrondingsprecisiemodel is slechts een beperkt aantal cijfers significant. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Geeft aan of het huidige object gelijk is aan een ander object van hetzelfde type. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Geeft aan of het huidige object gelijk is aan een ander object van hetzelfde type. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Dient als de standaard hash-functie. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Implementeert de operator ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Implementeert de operator !=. |

### Opmerkingen

Er zijn twee soorten PrecisionModel:  Exact`PrecisionModel` (alle cijfers zijn significant); afgerond`PrecisionModel` (een aantal cijfers is significant). EEN`PrecisionModel` kan worden ingesteld[`VectorLayer`](../vectorlayer/) via[`DriverOptions`](../driveroptions/) om coördinaten af te ronden bij het schrijven of lezen van geometrieën.

### Zie ook

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


