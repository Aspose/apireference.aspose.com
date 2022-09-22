---
title: Region
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Décrit lintérieur dune forme graphique composée de rectangles et de chemins. Cette classe ne peut pas être héritée.
type: docs
weight: 1060
url: /fr/net/system.drawing/region/
---
## Region class

Décrit l'intérieur d'une forme graphique composée de rectangles et de chemins. Cette classe ne peut pas être héritée.

```csharp
public sealed class Region : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Region](region#constructor)() | Initialise une nouvelle instance du[`Region`](../region) classe. |
| [Region](region#constructor_1)(GraphicsPath) | Initialise une nouvelle instance du[`Region`](../region) classe avec le spécifiéGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Initialise une nouvelle instance du[`Region`](../region) classe de la classe spécifiéeRectangle structure. |
| [Region](region#constructor_4)(RectangleF) | Initialise une nouvelle instance du[`Region`](../region) classe de la classe spécifiéeRectangleF structure. |
| [Region](region#constructor_2)(RegionData) | Initialise une nouvelle instance du[`Region`](../region) classe à partir des données spécifiées. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Crée une copie exacte de ceciRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | Met à jour ceciRegion pour contenir la partie du spécifiéGraphicsPath qui ne ne croise pas celaRegion . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | Met à jour ceciRegion pour contenir la partie du spécifiéRectangle structure qui ne se croise pas avec ceciRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | Met à jour ceciRegion pour contenir la partie du spécifiéRectangleF structure qui ne se croise pas avec ceciRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | Met à jour ceciRegion pour contenir la partie du spécifiéRegion qui ne croise pas avec ceciRegion . |
| [Dispose](../../system.drawing/region/dispose)() | Libère toutes les ressources utilisées par ceRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | Teste si le spécifiéRegion est identique à celui-ciRegion sur la surface de dessin spécifiée. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | Met à jour ceciRegion pour contenir uniquement la partie de son intérieur qui ne croise pas le spécifiéGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | Met à jour ceciRegion pour contenir uniquement la partie de son intérieur qui ne croise pas avec le spécifiéRectangle structure. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | Met à jour ceciRegion pour contenir uniquement la partie de son intérieur qui ne croise pas le spécifiéRectangleF structure. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | Met à jour ceciRegion pour contenir uniquement la partie de son intérieur qui ne croise pas avec le spécifiéRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | Obtient unRectangleFstructure qui représente un rectangle qui délimite cetteRegion sur la surface de dessin d'unGraphics objet. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | Renvoie unRegionData qui représente les informations qui décrivent ceRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Renvoie un tableau deRectangleF structures qui se rapprochent de celaRegion après l'application de la transformation matricielle spécifiée. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | Met à jour ceciRegion à l'intersection de lui-même avec le spécifiéGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | Met à jour ceciRegion à l'intersection de lui-même avec le spécifiéRectangle structure. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | Met à jour ceciRegion à l'intersection de lui-même avec le spécifié RectangleF structure. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | Met à jour ceciRegion à l'intersection de lui-même avec le spécifiéRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Teste si celaRegion a un intérieur vide sur la surface de dessin spécifiée. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Teste si celaRegion a un intérieur infini sur la surface de dessin spécifiée. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | Teste si le spécifiéPoint structure est contenue dans ceRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | Teste si le spécifiéPointF structure est contenue dans ceRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Teste si une partie de la valeur spécifiéeRectangle la structure est contenue dans this Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Teste si une partie de la valeur spécifiéeRectangleF structure est contenue dans ceRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Teste si le point spécifié est contenu dans ceRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | Teste si le spécifiéPoint structure est contenue dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | Teste si le spécifiéPointF structure est contenue dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Teste si une partie de la valeur spécifiéeRectangle structure est contenue dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Teste si une partie de la valeur spécifiéeRectangleF structure est contenue dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Teste si le point spécifié est contenu dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Teste si le point spécifié est contenu dans ceRegion objet lorsqu'il est dessiné en utilisant le spécifiéGraphics objet. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Teste si une partie du rectangle spécifié est contenue dans ceRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Teste si une partie du rectangle spécifié est contenue dans ceRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Teste si une partie du rectangle spécifié est contenue dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Teste si une partie du rectangle spécifié est contenue dans ceRegion lorsqu'il est dessiné en utilisant le spécifiéGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Initialise ceciRegion à un intérieur vide. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Initialise ceciRegion objet à un intérieur infini. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Transforme ceciRegion par le spécifiéMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Décale les coordonnées de ceRegion par le montant spécifié. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Décale les coordonnées de ceRegion par le montant spécifié. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | Met à jour ceciRegion à l'union de lui-même et du spécifiéGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | Met à jour ceciRegion à l'union de lui-même et du spécifiéRectangle structure. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | Met à jour ceciRegion à l'union de lui-même et du spécifiéRectangleF structure. |
| [Union](../../system.drawing/region/union#union_3)(Region) | Met à jour ceciRegion à l'union de lui-même et du spécifiéRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | Met à jour ceciRegionà l'union moins l'intersection de lui-même avec the spécifiéGraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | Met à jour ceciRegionà l'union moins l'intersection de lui-même avec the spécifiéRectangle structure. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | Met à jour ceciRegion à l'union moins l'intersection de lui-même avec le spécifiéRectangleF structure. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | Met à jour ceciRegionà l'union moins l'intersection de lui-même avec the spécifiéRegion . |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
