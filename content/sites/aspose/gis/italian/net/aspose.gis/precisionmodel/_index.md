---
title: Class PrecisionModel
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.PrecisionModel classe. PrecisionModel specifica un numero di cifre significative in una coordinata.
type: docs
weight: 1310
url: /it/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` specifica un numero di cifre significative in una coordinata.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Restituisce un modello di precisione esatta. Secondo il modello di precisione esatta tutte le cifre in un valore double sono significative. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Ottiene un valore che indica se questo modello di precisione è esatto. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Ottiene un valore che indica se questo modello di precisione sta arrotondando. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Ottiene un numero di cifre significative in un modello di precisione se è arrotondato. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Restituisce un modello di precisione di arrotondamento. Secondo il modello di precisione di arrotondamento solo un numero limitato di cifre è significativo. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Funge da funzione hash predefinita. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Implementa l'operatore ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Implementa l'operatore !=. |

### Osservazioni

Esistono due tipi di PrecisionModel:  Esatto`PrecisionModel` (tutte le cifre sono significative); Arrotondato`PrecisionModel` (un certo numero di cifre è significativo). A`PrecisionModel` può essere impostato su[`VectorLayer`](../vectorlayer/) attraverso[`DriverOptions`](../driveroptions/) per arrotondare le coordinate durante la scrittura o la lettura di geometrie.

### Guarda anche

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


