---
title: Projection.GetParameterValue
second_title: Référence de l'API Aspose.GIS pour .NET
description: Projection méthode. Obtient le paramètre avec le nom spécifié de cette projection.
type: docs
weight: 40
url: /fr/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

Obtient le paramètre avec le nom spécifié de cette projection.

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| name | String | Nom du paramètre. |
| type | ParameterType | Type de paramètre. Définit le facteur unitaire qui sera appliqué : si le type estLinear alors[`LinearParametersUnit`](../linearparametersunit/) sera désappliqué et le résultat sera en mètres. si le type estAngular alors[`AngularParametersUnit`](../angularparametersunit/) sera désappliqué et le résultat sera en radians. si le type estOtherla valeur du paramètre sera renvoyée "telle quelle". |

### Return_Value

Paramètre avec le nom spécifié.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est nul. |
| InvalidOperationException | Il n'y a pas de paramètre avec ce nom. |

### Voir également

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../projection/)
* Assemblée [Aspose.GIS](../../../)


