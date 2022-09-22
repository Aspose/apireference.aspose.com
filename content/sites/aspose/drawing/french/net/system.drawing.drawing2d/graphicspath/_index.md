---
title: GraphicsPath
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Représente une série de lignes et de courbes connectées.
type: docs
weight: 260
url: /fr/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Représente une série de lignes et de courbes connectées.

```csharp
public class GraphicsPath : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Initialise une nouvelle instance de la classe GraphicsPath avec une valeur FillMode de Alternate. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | Initialise une nouvelle instance du[`GraphicsPath`](../graphicspath)classe avec le spécifié FillMode énumération. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | Initialise une nouvelle instance du[`GraphicsPath`](../graphicspath) classe avec le spécifié[`PathPointType`](../pathpointtype) etPointF tableaux. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | Initialise une nouvelle instance du[`GraphicsPath`](../graphicspath) classe avec le spécifié[`PathPointType`](../pathpointtype) etPoint tableaux. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | Initialise une nouvelle instance du[`GraphicsPath`](../graphicspath) classe avec le spécifiéPathPointType etPointF tableaux et avec les valeurs spécifiéesFillMode élément d'énumération.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | Initialise une nouvelle instance du[`GraphicsPath`](../graphicspath) classe avec le spécifiéPathPointType etPoint tableaux et avec les valeurs spécifiéesFillMode élément d'énumération.. |

## Propriétés

| Nom | La description |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | Obtient ou définit une énumération FillMode qui détermine comment les intérieurs des formes dans ce GraphicsPath sont remplis. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | Obtient unPathData qui encapsule des tableaux de points et de types pour celaGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | Récupère les points du chemin. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | Obtient les types des points correspondants dans lePathPoints tableau. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | Obtient le nombre d'éléments dans lePathPoints ou laPathTypes tableau. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | Ajoute un arc elliptique à la figure actuelle. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | Ajoute un arc elliptique à la figure actuelle. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | Ajoute une courbe de Bézier cubique à la figure actuelle. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | Ajoute une courbe de Bézier cubique à la figure actuelle. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | Ajoute une séquence de courbes de Bézier cubiques connectées à la figure actuelle. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | Ajoute une séquence de courbes de Bézier cubiques connectées à la figure actuelle. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | Ajoute une courbe fermée à ce chemin. Une courbe spline cardinale est utilisée car la courbe passe par chacun des points du tableau. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | Ajoute une courbe fermée à ce chemin. Une courbe spline cardinale est utilisée car la courbe passe par chacun des points du tableau. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | Ajoute une courbe spline à la figure actuelle. Une courbe spline cardinale est utilisée car la courbe passe par chacun des points du tableau. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | Ajoute une courbe spline à la figure actuelle. Une courbe spline cardinale est utilisée car la courbe passe par chacun des points du tableau. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | Ajoute une courbe spline à la figure actuelle. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | Ajoute une courbe spline à la figure actuelle. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | Ajoute une ellipse au chemin actuel. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | Ajoute une ellipse au chemin actuel. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | Ajoute un segment de ligne à ce GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | Ajoute un segment de ligne à ce GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | Ajoute une série de segments de ligne connectés à la fin de ceGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | Ajoute une série de segments de ligne connectés à la fin de ceGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | Ajoute le GraphicsPath spécifié à ce chemin. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | Ajoute le contour d'une forme de tarte à ce chemin. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | Ajoute le contour d'une forme de tarte à ce chemin. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | Ajoute un polygone à ce chemin. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | Ajoute un polygone à ce chemin. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | Ajoute un rectangle à ce chemin. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | Ajoute un rectangle à ce chemin. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | Ajoute une série de rectangles à ce chemin. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | Ajoute une série de rectangles à ce chemin. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | Ajoute une chaîne de texte à ce chemin. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Ajoute une chaîne de texte à ce chemin. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Ajoute une chaîne de texte à ce chemin. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Ajoute une chaîne de texte à ce chemin. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | Faire une copie de l'objet chemin actuel. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | Ferme toutes les figures ouvertes dans ce chemin et commence une nouvelle figure. Il ferme chaque figure ouverte en reliant une ligne de son extrémité à son point de départ. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | Ferme la figure actuelle et commence une nouvelle figure. Si la figure actuelle contient une séquence de lignes et de courbes connectées, la méthode ferme la boucle en connectant une ligne du point final au point de départ. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | Libère toutes les ressources utilisées par ce GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | Convertit chaque courbe de ce chemin en une séquence de segments de ligne connectés. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | Renvoie un rectangle qui délimite ceGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | Renvoie un rectangle qui délimite ceGraphicsPath lorsque ce chemin est transformé par le spécifiéMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | Renvoie un rectangle qui délimite ceGraphicsPath lorsque le chemin actuel est transformé par le spécifiéMatrix et dessiné avec le spécifiéPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | Récupère le dernier point du tableau PathPoints de ce[`GraphicsPath`](../graphicspath) . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | Indique si le point spécifié est contenu dans (sous) le contour de ceGraphicsPath lorsqu'il est dessiné avec le spécifiéPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | Indique si le point spécifié est contenu dans ceGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | Vide le[`PathPoints`](./pathpoints) et[`PathTypes`](./pathtypes)arrays et définit le[`FillMode`](../fillmode) àAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | Inverse l'ordre des points dans le[`PathPoints`](./pathpoints) tableau de ce[`GraphicsPath`](../graphicspath) . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | Définit un marqueur sur ce[`GraphicsPath`](../graphicspath) . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | Commence une nouvelle figure sans fermer la figure actuelle. Tous les points suivants ajoutés au chemin sont ajoutés à cette nouvelle figure. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | Applique une matrice de transformation à ce GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | Applique une transformation warp, définie par un rectangle et un parallélogramme, à cette[`GraphicsPath`](../graphicspath) . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | Applique une transformation warp, définie par un rectangle et un parallélogramme, à ce[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Applique une transformation warp, définie par un rectangle et un parallélogramme, à ce[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Applique une transformation warp, définie par un rectangle et un parallélogramme, à ce[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | Ajoute un contour supplémentaire au chemin. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | Remplace ceciGraphicsPath avec des courbes qui entourent la zone qui est remplie lorsque ce chemin est dessiné par le stylo spécifié. |

### Voir également

* espace de noms [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
