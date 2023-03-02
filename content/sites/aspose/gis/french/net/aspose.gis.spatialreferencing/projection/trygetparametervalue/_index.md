---
title: Projection.TryGetParameterValue
second_title: Référence de l'API Aspose.GIS pour .NET
description: Projection méthode. Obtient le paramètre avec le nom spécifié de cette projection. Sil ny a pas un tel paramètre  renvoienull .
type: docs
weight: 60
url: /fr/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Obtient le paramètre avec le nom spécifié de cette projection. S'il n'y a pas un tel paramètre - renvoie`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| name | String | Nom du paramètre. |
| type | ParameterType | Type de paramètre. Définit le facteur unitaire qui sera appliqué : si le type estLinear alors[`LinearParametersUnit`](../linearparametersunit/) sera désappliqué et le résultat sera en mètres. si le type estAngular alors[`AngularParametersUnit`](../angularparametersunit/) sera désappliqué et le résultat sera en radians. si le type estOtherla valeur du paramètre sera renvoyée "telle quelle". |

### Return_Value

Paramètre avec le nom spécifié ou`null` s'il n'est pas présent.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est nul. |

### Voir également

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../projection/)
* Assemblée [Aspose.GIS](../../../)


