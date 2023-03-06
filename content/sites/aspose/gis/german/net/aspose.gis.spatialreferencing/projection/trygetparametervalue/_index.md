---
title: Projection.TryGetParameterValue
second_title: Aspose.GIS für .NET-API-Referenz
description: Projection methode. Ruft Parameter mit dem angegebenen Namen dieser Projektion ab. Wenn es keinen solchen Parameter gibt  kehrt zurücknull .
type: docs
weight: 60
url: /de/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Ruft Parameter mit dem angegebenen Namen dieser Projektion ab. Wenn es keinen solchen Parameter gibt - kehrt zurück`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Name des Parameters. |
| type | ParameterType | Typ des Parameters. Definiert den Einheitenfaktor, der aufgehoben wird: wenn Typ istLinear Dann[`LinearParametersUnit`](../linearparametersunit/) wird aufgehoben und das Ergebnis wird in Metern angezeigt. wenn Typ istAngular Dann[`AngularParametersUnit`](../angularparametersunit/) wird aufgehoben und das Ergebnis wird in Radianten angegeben. wenn der Typ istOtherDer Parameterwert wird unverändert zurückgegeben. |

### Rückgabewert

Parameter mit angegebenem Namen oder`null` wenn es nicht vorhanden ist.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Das Argument ist null. |

### Siehe auch

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* namensraum [Aspose.Gis.SpatialReferencing](../../projection/)
* Montage [Aspose.GIS](../../../)


