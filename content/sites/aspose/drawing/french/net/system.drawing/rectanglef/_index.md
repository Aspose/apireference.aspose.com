---
title: RectangleF
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Stocke un ensemble de quatre nombres à virgule flottante qui représentent lemplacement et la taille dun rectangle. Pour des fonctions de région plus avancées utilisez un objet Region.
type: docs
weight: 1050
url: /fr/net/system.drawing/rectanglef/
---
## RectangleF structure

Stocke un ensemble de quatre nombres à virgule flottante qui représentent l'emplacement et la taille d'un rectangle. Pour des fonctions de région plus avancées, utilisez un objet Region.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Initialise une nouvelle instance de la structure RectangleF avec l'emplacement et la taille spécifiés. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Initialise une nouvelle instance de la structure RectangleF avec l'emplacement et la taille spécifiés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Obtient la coordonnée y qui est la somme de Y et de la hauteur de cette structure RectangleF. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Obtient ou définit la hauteur de cette structure RectangleF. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | Obtient une valeur indiquant si leWidth ouHeight propriété de ceciRectangleF une valeur de zéro. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Obtient la coordonnée x du bord gauche de cette structure RectangleF. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Obtient ou définit les coordonnées du coin supérieur gauche de cetteRectangleF structure. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Obtient la coordonnée x qui est la somme de X et de la largeur de cette structure RectangleF. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Obtient ou définit la taille de ceRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Obtient la coordonnée y du bord supérieur de cette structure RectangleF. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Obtient ou définit la largeur de cette structure RectangleF. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Obtient ou définit la coordonnée x du coin supérieur gauche de cette structure RectangleF. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Obtient ou définit la coordonnée x du coin supérieur gauche de cette structure RectangleF. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Crée une structure RectangleF avec un coin supérieur gauche et un coin inférieur droit aux emplacements spécifiés. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Crée et renvoie une copie gonflée du spécifiéRectangleF structure. La copie est gonflée du montant spécifié. Le rectangle d'origine reste inchangé. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | Renvoie unRectangleF structure qui représente l'intersection de deux rectangles. S'il n'y a pas d'intersection, et videRectangleF est renvoyé. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Crée le plus petit troisième rectangle possible pouvant contenir les deux rectangles formant une union. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Détermine si le point spécifié est contenu dans ceRectangleF structure. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | Détermine si la région rectangulaire représentée par*rect* est entièrement contenu dans ceRectangleF structure. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Détermine si le point spécifié est contenu dans ceRectangleF structure. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | Détermine si la valeur spécifiéeObject , est égal à cette instance. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Teste si d'autres[`RectangleF`](../rectanglef) structure a le même emplacement et la même taille que celui-ci[`RectangleF`](../rectanglef) structure. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Renvoie un code de hachage pour cette instance. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | Gonfle çaRectangleF par le montant spécifié. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | Gonfle çaRectangleF structure par le montant spécifié. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Remplace ceciRectangleF structure avec l'intersection d'elle-même et du spécifié RectangleF structure. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Détermine si ce rectangle coupe avec*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Ajuste l'emplacement de ce rectangle du montant spécifié. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Ajuste l'emplacement de ce rectangle du montant spécifié. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Convertit les attributs de ce[`Rectangle`](../rectangle) en une chaîne lisible par l'homme. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | Teste si deuxRectangleF les structures ont un emplacement et une taille égaux. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Convertit la structure Rectangle spécifiée en une structure RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | Teste si deuxRectangleF les structures diffèrent par leur emplacement ou leur taille. |

## Des champs

| Nom | La description |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Représente une instance duRectangleF classe avec ses membres non initialisés. |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
