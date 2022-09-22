---
title: Rectangle
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Stocke un ensemble de quatre nombres entiers qui représentent lemplacement et la taille dun rectangle.
type: docs
weight: 1040
url: /fr/net/system.drawing/rectangle/
---
## Rectangle structure

Stocke un ensemble de quatre nombres entiers qui représentent l'emplacement et la taille d'un rectangle.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Initialise une nouvelle instance du[`Rectangle`](../rectangle) struct avec l'emplacement et la taille spécifiés. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Initialise une nouvelle instance de la structure Rectangle avec l'emplacement et la taille spécifiés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Obtient la coordonnée y qui est la somme des valeurs des propriétés Y et Height de cette structure Rectangle. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Obtient ou définit la hauteur de cette structure Rectangle. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Obtient une valeur indiquant si toutes les propriétés numériques de ce[`Rectangle`](../rectangle) ont des valeurs de zéro. |
| [Left](../../system.drawing/rectangle/left) { get; } | Obtient la coordonnée x du bord gauche de cette structure Rectangle. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Obtient ou définit les coordonnées du coin supérieur gauche de cetteRectangle structure. |
| [Right](../../system.drawing/rectangle/right) { get; } | Obtient la coordonnée x qui est la somme des valeurs de propriété X et Width de cette structure Rectangle. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Obtient ou définit la taille de ceRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Obtient la coordonnée y du bord supérieur de cette structure Rectangle. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Obtient ou définit la largeur de cette structure Rectangle. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Obtient ou définit la coordonnée x du coin supérieur gauche de cette structure Rectangle. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Obtient ou définit la coordonnée y du coin supérieur gauche de cette structure Rectangle. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Convertit le spécifiéRectangleF structurer à unRectangle structure en arrondissantRectangleF valeurs aux valeurs entières immédiatement supérieures. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | Crée unRectangle structure avec les emplacements de bord spécifiés. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Crée un[`Rectangle`](../rectangle) qui est gonflé par le montant spécifié. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Renvoie un tiersRectangle structure qui représente l'intersection de deux autresRectangle structures. S'il n'y a pas d'intersection, un videRectangle est renvoyé. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Convertit le spécifiéRectangleF à unRectangle en arrondissant leRectangleFvaleurs aux valeurs entières les plus proches. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Convertit le spécifiéRectangleF à unRectangle en tronquant leRectangleF valeurs. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | Obtient unRectangle structure qui contient l'union de deuxRectangle structures. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Détermine si le point spécifié est contenu dans ceRectangle structure. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | Détermine si la région rectangulaire représentée par*rect* est entièrement contenu dans la région rectangulaire représentée par ce[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Détermine si le point spécifié est contenu dans ceRectangle structure. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Teste si obj est unRectangle structure avec le même emplacement et la même taille que celle-ciRectangle structure. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Teste si d'autres[`Rectangle`](../rectangle) structure a le même emplacement et la même taille que celui-ci[`Rectangle`](../rectangle) structure. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Renvoie le code de hachage pour ceRectangle structure. Pour plus d'informations sur l'utilisation des codes de hachage, voir GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Agrandit ceciRectangle par le montant spécifié. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Agrandit ceciRectangle par le montant spécifié. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Remplace ceciRectangleavec l'intersection de lui-même et du spécifiéRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Détermine si ce rectangle coupe avec*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Ajuste l'emplacement de ce rectangle du montant spécifié. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Ajuste l'emplacement de ce rectangle du montant spécifié. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Convertit les attributs de ce[`Rectangle`](../rectangle) en une chaîne lisible par l'homme. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Teste si deuxRectangle les structures ont un emplacement et une taille égaux. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Teste si deuxRectangle les structures diffèrent par leur emplacement ou leur taille. |

## Des champs

| Nom | La description |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | Représente unRectangle structure avec ses propriétés laissées non initialisées. |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
