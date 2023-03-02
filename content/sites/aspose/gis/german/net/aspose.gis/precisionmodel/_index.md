---
title: Class PrecisionModel
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.PrecisionModel klas. PrecisionModel gibt eine Anzahl signifikanter Stellen in einer Koordinate an.
type: docs
weight: 1310
url: /de/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` gibt eine Anzahl signifikanter Stellen in einer Koordinate an.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Gibt ein exaktes Präzisionsmodell zurück. Gemäß dem exakten Präzisionsmodell sind alle Ziffern in einem Double-Wert signifikant. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Ruft einen Wert ab, der angibt, ob dieses Präzisionsmodell exakt ist. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Ruft einen Wert ab, der angibt, ob dieses Genauigkeitsmodell rundet. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Ruft eine Anzahl signifikanter Ziffern in einem Präzisionsmodell ab, wenn es gerundet wird. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Gibt ein Rundungspräzisionsmodell zurück. Gemäß dem Rundungspräzisionsmodell ist nur eine begrenzte Anzahl von Ziffern signifikant. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Gibt an, ob das aktuelle Objekt gleich einem anderen Objekt desselben Typs ist. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Gibt an, ob das aktuelle Objekt gleich einem anderen Objekt desselben Typs ist. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Dient als Standard-Hash-Funktion. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Implementiert den Operator ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Implementiert den Operator !=. |

### Bemerkungen

Es gibt zwei Arten von PrecisionModel:  Genau`PrecisionModel` (alle Ziffern sind signifikant); Gerundet`PrecisionModel` (Einige Anzahl von Ziffern sind signifikant). A`PrecisionModel` eingestellt werden kann[`VectorLayer`](../vectorlayer/) über[`DriverOptions`](../driveroptions/) um Koordinaten beim Schreiben oder Lesen von Geometrien zu runden.

### Siehe auch

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* namensraum [Aspose.Gis](../../aspose.gis/)
* Montage [Aspose.GIS](../../)


