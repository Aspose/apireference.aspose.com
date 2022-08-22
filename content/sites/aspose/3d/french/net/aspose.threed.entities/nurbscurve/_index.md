---
title: NurbsCurve
second_title: Référence de l'API Aspose.3D pour .NET
description: Courbe NURBShttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline est une courbe représentée par NURBSNonuniform rational based spline Une courbe NURBS est définie par saOrder./nurbscurve/order  un ensemble de pondérationsControlPoints./geometry/controlpoints et unKnotVectors./nurbscurve/knotvectors La composante w du point de contrôle est utilisée comme poids du point de contrôle quel quil soitTwoDimensional ouThreeDimensional
type: docs
weight: 460
url: /fr/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[Courbe NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) est une courbe représentée par NURBS(Non-uniform rational based spline), Une courbe NURBS est définie par sa[`Order`](./order) , un ensemble de pondérations[`ControlPoints`](../geometry/controlpoints) et un[`KnotVectors`](./knotvectors) La composante w du point de contrôle est utilisée comme poids du point de contrôle, quel qu'il soitTwoDimensional ouThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [NurbsCurve](nurbscurve#constructor)() | Initialise une nouvelle instance du[`NurbsCurve`](../nurbscurve) classe. |
| [NurbsCurve](nurbscurve#constructor_1)(string) | Initialise une nouvelle instance du[`NurbsCurve`](../nurbscurve) classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Obtient ou définit la couleur de la ligne, la valeur par défaut est blanc(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints) { get; } | Obtient tous les points de contrôle |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype) { get; set; } | Obtient ou définit le type de la courbe. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension) { get; set; } | Obtient ou définit la dimension de la courbe. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtient ou définit s'il faut exclure cette entité lors de l'exportation. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors) { get; } | Obtient le vecteur de nœud, c'est une séquence de valeurs de paramètres qui détermine où et comment les points de contrôle affectent la courbe NURBS. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity) { get; } | Obtient la multiplicité. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtient ou définit le nom. |
| [Order](../../aspose.threed.entities/nurbscurve/order) { get; set; } | Obtient ou définit l'ordre d'une courbe NURBS, il définit le nombre de points de contrôle à proximité qui influencent un point donné sur la courbe. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtient ou définit le premier nœud parent, si défini le premier nœud parent, cette entité sera détachée des autres nœuds parents. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtient tous les nœuds parents, une entité peut être attachée à plusieurs nœuds parents pour l'instanciation de la géométrie |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtient la collection de toutes les propriétés. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational) { get; set; } | Obtient ou définit s'il est rationnel, cette valeur indique si ce[`NurbsCurve`](../nurbscurve) est une spline rationnelle ou une spline non rationnelle. La spline B non rationnelle est un cas particulier de splines B rationnelles. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtient la scène à laquelle cet objet appartient |

## Méthodes

| Nom | La description |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate)(int) | Evaluer la courbe NURBS |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat)(double) | Évalue le point de la courbe à la position spécifiée |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trouve la propriété. Il peut s'agir d'une propriété dynamique (créée par CreateDynamicProperty/SetProperty) ou d'une propriété native (identifiée par son nom) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtient la boîte englobante de l'entité actuelle dans son système de coordonnées de l'espace objet. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Obtient la clé du rendu d'entité enregistré dans le rendu |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtenir la valeur de la propriété spécifiée |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Supprime une propriété dynamique. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Supprimer la propriété spécifiée identifiée par name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Définit la valeur de la propriété spécifiée |

### Voir également

* class [Curve](../curve)
* espace de noms [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* Assemblée [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
