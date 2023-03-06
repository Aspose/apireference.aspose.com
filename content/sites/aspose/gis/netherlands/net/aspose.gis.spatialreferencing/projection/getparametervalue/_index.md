---
title: Projection.GetParameterValue
second_title: Aspose.GIS voor .NET API-referentie
description: Projection methode. Krijgt parameter met opgegeven naam van deze projectie.
type: docs
weight: 40
url: /nl/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

Krijgt parameter met opgegeven naam van deze projectie.

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam van parameter. |
| type | ParameterType | Type parameter. Definieert eenheidsfactor die niet meer wordt toegepast: als type isLinear Dan[`LinearParametersUnit`](../linearparametersunit/) wordt niet toegepast en het resultaat is in meters. als type isAngular Dan[`AngularParametersUnit`](../angularparametersunit/) wordt niet meer toegepast en het resultaat is in radialen. als type isOtherparameterwaarde wordt geretourneerd 'zoals het is'. |

### Winstwaarde

Parameter met opgegeven naam.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is nul. |
| InvalidOperationException | Er is geen parameter met deze naam. |

### Zie ook

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../projection/)
* montage [Aspose.GIS](../../../)


