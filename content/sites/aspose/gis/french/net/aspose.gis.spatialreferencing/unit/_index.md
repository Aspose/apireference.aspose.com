---
title: Class Unit
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.SpatialReferencing.Unit classe. Représente lunité de mesure.
type: docs
weight: 2290
url: /fr/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Représente l'unité de mesure.

```csharp
public class Unit : IdentifiableObject
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Créer une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Obtenez l'unité qui représente les degrés. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Get Unit qui représente les mètres. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Obtenez l'unité qui représente les radians. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si cet identifiant d'objet est un identifiant EPSG - retourne son code. Sinon - renvoie -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Facteur en mètre, s'il s'agit d'une unité de longueur, facteur en radian, s'il s'agit d'une unité d'angle. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identifiant de cet objet identifiable. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nom de cet objet. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Convertit l'argument en unité, décrit par cette instance. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Convertit l'argument de l'unité, décrite par cette instance, en radians ou en mètres. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Retourne une chaîne qui représente l'objet actuel. |

### Voir également

* class [IdentifiableObject](../identifiableobject/)
* espace de noms [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Assemblée [Aspose.GIS](../../)


