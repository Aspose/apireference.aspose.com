---
title: Projection.TryGetParameterValue
second_title: Aspose.GIS voor .NET API-referentie
description: Projection methode. Haalt de parameter op met de opgegeven naam van deze projectie. Als er geen dergelijke parameter is  retourneertnull .
type: docs
weight: 60
url: /nl/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Haalt de parameter op met de opgegeven naam van deze projectie. Als er geen dergelijke parameter is - retourneert`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Naam van parameter. |
| type | ParameterType | Type parameter. Definieert eenheidsfactor die niet meer wordt toegepast: als type isLinear Dan[`LinearParametersUnit`](../linearparametersunit/) wordt niet toegepast en het resultaat is in meters. als type isAngular Dan[`AngularParametersUnit`](../angularparametersunit/) wordt niet meer toegepast en het resultaat is in radialen. als type isOtherparameterwaarde wordt geretourneerd 'zoals het is'. |

### Winstwaarde

Parameter met opgegeven naam of`null` als deze niet aanwezig is.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is nul. |

### Zie ook

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../projection/)
* montage [Aspose.GIS](../../../)


