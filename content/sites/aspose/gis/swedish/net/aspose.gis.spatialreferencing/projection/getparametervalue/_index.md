---
title: Projection.GetParameterValue
second_title: Aspose.GIS för .NET API Referens
description: Projection metod. Hämtar parameter med specificerat namn på denna projektion.
type: docs
weight: 40
url: /sv/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

Hämtar parameter med specificerat namn på denna projektion.

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | String | Namn på parameter. |
| type | ParameterType | Typ av parameter. Definierar enhetsfaktor som kommer att tas bort: om typen ärLinear sedan[`LinearParametersUnit`](../linearparametersunit/) kommer att tas bort och resultatet kommer att vara i meter. om typ ärAngular sedan[`AngularParametersUnit`](../angularparametersunit/) kommer att avappliceras och resultatet kommer att vara i radianer. om typen ärOtherparametervärdet kommer att returneras "som det är". |

### Returvärde

Parameter med angivet namn.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är ogiltigt. |
| InvalidOperationException | Det finns ingen parameter med detta namn. |

### Se även

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../projection/)
* hopsättning [Aspose.GIS](../../../)


