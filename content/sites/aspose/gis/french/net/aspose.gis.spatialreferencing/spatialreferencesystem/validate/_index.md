---
title: SpatialReferenceSystem.Validate
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem méthode. Déterminez si ce SRS est valide.
type: docs
weight: 240
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

Déterminez si ce SRS est valide.

```csharp
public abstract bool Validate(out string errorMessage)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| errorMessage | String& | Si la méthode revient`false` alors c'est la description de l'invalidité. |

### Return_Value

`true` si SRS est valide,`false` sinon.

### Remarques

Un SRS valide doit avoir un ellipsoïde valide. - Le SRS géographique doit avoir exactement un axe Est/Ouest, exactement un axe Nord/Sud et un axe Haut/Bas facultatif (l'axe facultatif est présent lorsque le SRS géographique est composé d'un SRS géographique 2D et SRS vertical). - Le SRS projeté doit avoir exactement un axe Est/Ouest, exactement un axe Nord/Sud et un axe haut/bas facultatif (l'axe facultatif est présent lorsque le SRS projeté est composé d'un SRS géographique 2D et d'un SRS vertical). - Le SRS géocentrique doit avoir exactement un axe Est/Ouest, exactement un axe Nord/Sud et exactement un autre axe. - Le SRS vertical doit avoir exactement un axe Haut/Bas. - Le SRS local doit avoir au moins un axe. Les directions des axes ne mesurent pas. - Le SRS composé doit être une combinaison d'un SRS géographique/projeté valide et d'un SRS vertical valide.

### Voir également

* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


