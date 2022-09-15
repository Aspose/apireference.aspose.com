---
title: Graphics
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Encapsule la surface de dessin.
type: docs
weight: 530
url: /fr/net/system.drawing/graphics/
---
## Graphics class

Encapsule la surface de dessin.

```csharp
public class Graphics : IDisposable
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip) { get; set; } | Obtient ou définit unRegion qui limite la zone de dessin de ceGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds) { get; } | Obtient un[`RectangleF`](../rectanglef) structure qui délimite la région de découpage de ce[`Graphics`](../graphics) . |
| [CompositingMode](../../system.drawing/graphics/compositingmode) { get; set; } | Obtient ou définit une valeur qui spécifie comment les images composées sont dessinées sur ceGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality) { get; set; } | Obtient ou définit la qualité de rendu des images composites dessinées sur ceGraphics . |
| [DpiX](../../system.drawing/graphics/dpix) { get; } | Obtient la résolution horizontale de ceGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy) { get; } | Obtient la résolution verticale de ceGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode) { get; set; } | Obtient ou définit le mode d'interpolation associé à ce Graphics. |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty) { get; } | Obtient une valeur indiquant si la zone de découpage de ceGraphics est vide. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty) { get; } | Obtient une valeur indiquant si la zone de découpage visible de ceGraphics est vide. |
| [PageScale](../../system.drawing/graphics/pagescale) { get; set; } | Obtient ou définit la mise à l'échelle entre les unités universelles et les unités de page pour ceGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit) { get; set; } | Obtient ou définit l'unité de mesure utilisée pour les coordonnées de page dans ceGraphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode) { get; set; } | Obtient ou définit une valeur spécifiant comment les pixels sont décalés lors du rendu de ceGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin) { get; set; } | Obtient ou définit l'origine du rendu de ceGraphics pour le tramage et les pinceaux de hachures. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode) { get; set; } | Obtient ou définit la qualité de rendu de ce Graphics. |
| [TextContrast](../../system.drawing/graphics/textcontrast) { get; set; } | Obtient ou définit la valeur de correction gamma pour le rendu du texte. |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint) { get; set; } | Obtient ou définit le mode de rendu du texte associé à ceGraphics . |
| [Transform](../../system.drawing/graphics/transform) { get; set; } | Obtient ou définit une copie de la transformation du monde géométrique pour ceGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds) { get; } | Obtient le rectangle englobant de la zone de découpage visible de ceGraphics . |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd)(IntPtr) | Crée un nouveauGraphics du handle spécifié à une fenêtre. |
| static [FromImage](../../system.drawing/graphics/fromimage)(Image) | Crée un nouveau graphique à partir de l'image spécifiée. |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment)(byte[]) | Ajoute un commentaire à l'actuelMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer)() | Enregistre un conteneur graphique avec l'état actuel de ceGraphics et ouvre et utilise un nouveau conteneur graphique. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | Enregistre un conteneur graphique avec l'état actuel de ceGraphics et ouvre et utilise un nouveau conteneur graphique avec la transformation d'échelle spécifiée. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | Enregistre un conteneur graphique avec l'état actuel de ceGraphics et ouvre et utilise un nouveau conteneur graphique avec la transformation d'échelle spécifiée. |
| [Clear](../../system.drawing/graphics/clear)(Color) | Efface toute la surface de dessin et la remplit avec la couleur d'arrière-plan spécifiée. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_1)(Point, Point, Size) | Effectue un transfert par bloc de bits de données de couleur, correspondant à un rectangle de pixels, de l'écran vers la surface de dessin duGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | Effectue un transfert par bloc de bits de données de couleur, correspondant à un rectangle de pixels, de l'écran vers la surface de dessin duGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | Effectue un transfert par bloc de bits des données de couleur, correspondant à un rectangle de pixels, de l'écran vers la surface de dessin duGraphics . |
| [Dispose](../../system.drawing/graphics/dispose)() | Libère toutes les ressources utilisées par ce Graphics. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc_1)(Pen, RectangleF, float, float) | Dessine un arc représentant une portion d'ellipse spécifiée par une structure RectangleF. |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc)(Pen, float, float, float, float, float, float) | Dessine un arc représentant une portion d'ellipse spécifiée par une paire de coordonnées, une largeur et une hauteur. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | Dessine une spline de Bézier définie par quatre structures PointF. |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier)(Pen, float, float, float, float, float, float, float, float) | Dessine une spline de Bézier définie par quatre paires ordonnées de coordonnées qui représentent des points. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers)(Pen, PointF[]) | Dessine une série de splines de Bézier à partir d'un tableau dePoint structures. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers_1)(Pen, Point[]) | Dessine une série de splines de Bézier à partir d'un tableau dePointF structures. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve)(Pen, PointF[]) | Dessine une spline cardinale fermée définie par un tableau dePointF structures. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_2)(Pen, Point[]) | Dessine une spline cardinale fermée définie par un tableau dePoint structures. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | Dessine une spline cardinale fermée définie par un tableau de structures PointF en utilisant une tension spécifiée. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_3)(Pen, Point[], float, FillMode) | Dessine une spline cardinale fermée définie par un tableau dePoint structures utilisant une tension spécifiée. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve)(Pen, PointF[]) | Dessine une spline cardinale à travers un tableau spécifié dePointF structures. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_4)(Pen, Point[]) | Dessine une spline cardinale à travers un tableau spécifié dePoint structures. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_3)(Pen, PointF[], float) | Dessine une spline cardinale à travers un tableau spécifié dePointF structures utilisant une tension spécifiée. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_6)(Pen, Point[], float) | Dessine une spline cardinale à travers un tableau spécifié dePoint structures utilisant une tension spécifiée. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_1)(Pen, PointF[], int, int) | Dessine une spline cardinale à travers un tableau spécifié dePointF structures utilisant une tension spécifiée. Le dessin commence décalé par rapport au début du tableau. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_2)(Pen, PointF[], int, int, float) | Dessine une spline cardinale à travers un tableau spécifié dePointF structures utilisant une tension spécifiée. Le dessin commence décalé par rapport au début du tableau. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_5)(Pen, Point[], int, int, float) | Dessine une spline cardinale à travers un tableau spécifié dePoint structures utilisant une tension spécifiée. Le dessin commence décalé par rapport au début du tableau. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse_1)(Pen, RectangleF) | Dessine une ellipse définie par un Rectangle englobantF. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse)(Pen, float, float, float, float) | Dessine une ellipse définie par un rectangle englobant spécifié par une paire de coordonnées, une hauteur et une largeur. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon_1)(Icon, Rectangle) | Dessine l'image représentée par le spécifiéIcon dans la zone spécifiée par unRectangle structure. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon)(Icon, int, int) | Dessine l'image représentée par le spécifiéIcon aux coordonnées spécifiées. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched)(Icon, Rectangle) | Dessine l'image représentée par le spécifiéIcon sans redimensionner l'image. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_6)(Image, Point) | Dessine l'image spécifiée, en utilisant sa taille physique d'origine, à l'emplacement spécifié. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_7)(Image, PointF) | Dessine le spécifiéImage , en utilisant sa taille physique d'origine, à l'emplacement spécifié. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_8)(Image, PointF[]) | Dessine le spécifiéImage à l'emplacement spécifié et avec la forme et la taille spécifiées. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_11)(Image, Point[]) | Dessine le spécifiéЕ:Image à l'emplacement spécifié et avec la forme et la taille spécifiées. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_14)(Image, Rectangle) | Dessine l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_20)(Image, RectangleF) | Dessine l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_3)(Image, float, float) | Dessine le spécifiéImage , en utilisant sa taille physique d'origine, à l'emplacement spécifié. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage)(Image, int, int) | Dessine l'image spécifiée, en utilisant sa taille physique d'origine, à l'emplacement spécifié par une paire de coordonnées. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | Dessine la partie spécifiée de l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | Dessine la partie spécifiée de la valeur spécifiéeImage à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | Dessine la partie spécifiée de l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | Dessine la partie spécifiée de l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_4)(Image, float, float, float, float) | Dessine le spécifiéImage , en utilisant sa taille physique d'origine, à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | Dessine une partie d'une image à un emplacement spécifié. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_1)(Image, int, int, int, int) | Dessine l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | Dessine une partie d'une image à un emplacement spécifié. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | Dessine la partie spécifiée de l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | Dessine la partie spécifiée de la valeur spécifiéeImage à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | Dessine la partie spécifiée de la valeur spécifiéeImage à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | Dessine la partie spécifiée de la valeur spécifiéeImage à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | Dessine la partie spécifiée de la valeur spécifiéeImage à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | Dessine la partie spécifiée de l'image spécifiée à l'emplacement spécifié et avec la taille spécifiée. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_2)(Image, Point) | Dessine une image spécifiée en utilisant sa taille physique d'origine à un emplacement spécifié. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_3)(Image, Rectangle) | Dessine une image spécifiée en utilisant sa taille physique d'origine à un emplacement spécifié. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled)(Image, int, int) | Dessine l'image spécifiée en utilisant sa taille physique d'origine à l'emplacement spécifié par une paire de coordonnées. |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_1)(Image, int, int, int, int) | Dessine l'image spécifiée en utilisant sa taille physique d'origine à l'emplacement spécifié par une paire de coordonnées. |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped)(Image, Rectangle) | Dessine l'image spécifiée sans mise à l'échelle et la découpe, si nécessaire, pour qu'elle tienne dans le rectangle spécifié. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_2)(Pen, Point, Point) | Dessine une ligne reliant deuxPoint structures. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_3)(Pen, PointF, PointF) | Dessine une ligne reliant deux structures PointF. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_1)(Pen, float, float, float, float) | Dessine une ligne reliant les deux points spécifiés par les paires de coordonnées. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline)(Pen, int, int, int, int) | Dessine une ligne reliant les deux points spécifiés par les paires de coordonnées. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines)(Pen, PointF[]) | Dessine une série de segments de ligne qui relient un tableau dePointF structures. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines_1)(Pen, Point[]) | Dessine une série de segments de ligne qui relient un tableau dePoint structures. |
| [DrawPath](../../system.drawing/graphics/drawpath)(Pen, GraphicsPath) | Dessine un GraphicsPath. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie_1)(Pen, RectangleF, float, float) | Dessine une forme circulaire définie par une ellipse spécifiée par une structure RectangleF et deux lignes radiales. |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie)(Pen, float, float, float, float, float, float) | Dessine une forme circulaire définie par une ellipse spécifiée par une paire de coordonnées, une largeur, une hauteur et deux lignes radiales. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon)(Pen, PointF[]) | Dessine un polygone défini par un tableau de structures PointF. |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon_1)(Pen, Point[]) | Dessine un polygone défini par un tableau dePoint structures. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_2)(Pen, Rectangle) | Dessine un rectangle spécifié par une structure Rectangle. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_1)(Pen, float, float, float, float) | Dessine un rectangle spécifié par une paire de coordonnées, une largeur et une hauteur. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle)(Pen, int, int, int, int) | Dessine un rectangle spécifié par une paire de coordonnées, une largeur et une hauteur. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles)(Pen, RectangleF[]) | Dessine une série de rectangles spécifiés parRectangleF structures. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles_1)(Pen, Rectangle[]) | Dessine une série de rectangles spécifiés parRectangle structures. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_2)(string, Font, Brush, PointF) | Dessine la chaîne de texte spécifiée à l'emplacement spécifié avec leBrush etFont objets. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_4)(string, Font, Brush, RectangleF) | Dessine la chaîne de texte spécifiée dans le rectangle spécifié avec leBrush etFont objets utilisant les attributs de mise en forme du spécifiéStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring)(string, Font, Brush, float, float) | Dessine la chaîne de texte spécifiée à l'emplacement spécifié avec leBrush etFont objets. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_3)(string, Font, Brush, PointF, StringFormat) | Dessine la chaîne de texte spécifiée à l'emplacement spécifié avec leBrush et Font objets utilisant les attributs de mise en forme du spécifiéStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | Dessine la chaîne de texte spécifiée dans le rectangle spécifié avec leBrush etFont objets utilisant les attributs de mise en forme du spécifiéStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_1)(string, Font, Brush, float, float, StringFormat) | Dessine la chaîne de texte spécifiée à l'emplacement spécifié avec leBrush et Font objets utilisant les attributs de mise en forme du spécifiéStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer)(GraphicsContainer) | Ferme le conteneur graphique actuel et restaure l'état de celui-ciGraphics à l'état sauvegardé par un appel auBeginContainer méthode. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | Envoie les enregistrements du spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | Envoie les enregistrements du spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements du spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements du spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide d'attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un S[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans le format spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements du spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements du spécifié[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage à un point spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide d'attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) un par un, à une méthode de rappel pour un affichage à un point spécifié à l'aide d'attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements dans un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un par un, à une méthode de rappel pour l'affichage dans un parallélogramme spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | Envoie les enregistrements d'un rectangle sélectionné à partir d'un[`Metafile`](../../system.drawing.imaging/metafile) , un à la fois, à une méthode de rappel pour l'affichage dans un rectangle spécifié à l'aide des attributs d'image spécifiés. |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip)(Rectangle) | Met à jour la zone de clip de ceGraphics pour exclure la zone spécifiée par unRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip_1)(Region) | Met à jour la zone de clip de ceGraphics pour exclure la zone spécifiée par unRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve)(Brush, PointF[]) | Remplit l'intérieur d'une courbe spline cardinale fermée définie par un tableau dePointF structures. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_3)(Brush, Point[]) | Remplit l'intérieur d'une courbe spline cardinale fermée définie par un tableau dePoint structures. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_1)(Brush, PointF[], FillMode) | Remplit l'intérieur d'une courbe spline cardinale fermée définie par un tableau dePointF structures utilisant le mode de remplissage spécifié. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_4)(Brush, Point[], FillMode) | Remplit l'intérieur d'une courbe spline cardinale fermée définie par un tableau dePoint structures utilisant le mode de remplissage spécifié. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | Remplit l'intérieur d'une courbe spline cardinale fermée définie par un tableau de structures PointF en utilisant le mode de remplissage et la tension spécifiés. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_5)(Brush, Point[], FillMode, float) | Remplit l'intérieur d'une courbe spline cardinale fermée définie par un tableau dePoint structures utilisant le mode de remplissage spécifié. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse_1)(Brush, RectangleF) | Remplit l'intérieur d'une ellipse définie par un rectangle englobant spécifié par une structure RectangleF. |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse)(Brush, float, float, float, float) | Remplit l'intérieur d'une ellipse définie par un rectangle englobant spécifié par une paire de coordonnées, une largeur et une hauteur. |
| [FillPath](../../system.drawing/graphics/fillpath)(Brush, GraphicsPath) | Remplit l'intérieur d'un GraphicsPath. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_2)(Brush, Rectangle, float, float) | Remplit l'intérieur d'une section circulaire définie par une ellipse spécifiée par une structure Rectangle et deux lignes radiales. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_1)(Brush, float, float, float, float, float, float) | Remplit l'intérieur d'une section circulaire définie par une ellipse spécifiée par une paire de coordonnées, une largeur, une hauteur et deux lignes radiales. |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie)(Brush, int, int, int, int, int, int) | Remplit l'intérieur d'une section circulaire définie par une ellipse spécifiée par une paire de coordonnées, une largeur, une hauteur et deux lignes radiales. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon)(Brush, PointF[]) | Remplit l'intérieur d'un polygone défini par un tableau de points spécifié parPointF structures. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_2)(Brush, Point[]) | Remplit l'intérieur d'un polygone défini par un tableau de points spécifié parPoint structures. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_1)(Brush, PointF[], FillMode) | Remplit l'intérieur d'un polygone défini par un tableau de points spécifié par les structures PointF en utilisant le mode de remplissage spécifié. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_3)(Brush, Point[], FillMode) | Remplit l'intérieur d'un polygone défini par un tableau de points spécifié parPoint structures utilisant le mode de remplissage spécifié. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle_1)(Brush, RectangleF) | Remplit l'intérieur d'un rectangle spécifié par une structure RectangleF. |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle)(Brush, float, float, float, float) | Remplit l'intérieur d'un rectangle spécifié par une paire de coordonnées, une largeur et une hauteur. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles)(Brush, RectangleF[]) | Remplit l'intérieur d'une série de rectangles spécifiés parRectangleF structures. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles_1)(Brush, Rectangle[]) | Remplit l'intérieur d'une série de rectangles spécifiés parRectangle structures. |
| [FillRegion](../../system.drawing/graphics/fillregion)(Brush, Region) | Remplit l'intérieur d'une Région. |
| [Flush](../../system.drawing/graphics/flush#flush)() | Force l'exécution de toutes les opérations graphiques en attente et revient immédiatement sans attendre la fin des opérations. |
| [Flush](../../system.drawing/graphics/flush#flush_1)(FlushIntention) | Force l'exécution de toutes les opérations graphiques en attente avec la méthode en attente ou non, comme spécifié, pour revenir avant la fin des opérations. |
| [GetHdc](../../system.drawing/graphics/gethdc)() | Obtient le handle du contexte de périphérique associé à ceGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor)(Color) | Obtient la couleur la plus proche de la valeur spécifiéeColor structure. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip)(Rectangle) | Met à jour la zone de clip de ceGraphics à l'intersection de la région de clip actuelle et de la zone spécifiéeRectangle structure. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_1)(RectangleF) | Met à jour la zone de clip de ceGraphics à l'intersection de la région de clip actuelle et de la zone spécifiéeRectangleF structure. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_2)(Region) | Met à jour la zone de clip de ceGraphics à l'intersection de la région de clip actuelle et de la zone spécifiéeRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_4)(Point) | Indique si la valeur spécifiéePoint structure est contenue dans la zone de clip visible de cetteGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_5)(PointF) | Indique si la valeur spécifiéePointF structure est contenue dans la zone de clip visible de cetteGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_6)(Rectangle) | Indique si le rectangle spécifié par unRectangle structure est contenue dans la zone de clip visible de cetteGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_7)(RectangleF) | Indique si le rectangle spécifié par unRectangleF structure est contenue dans la zone de clip visible de cetteGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_2)(float, float) | Indique si le point spécifié par une paire de coordonnées est contenu dans la région de découpage visible de ceGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible)(int, int) | Indique si le point spécifié par une paire de coordonnées est contenu dans la région de découpage visible de ceGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_3)(float, float, float, float) | Indique si le rectangle spécifié par une paire de coordonnées, une largeur et une hauteur est contenu dans la zone de découpage visible de ceGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_1)(int, int, int, int) | Indique si le rectangle spécifié par une paire de coordonnées, une largeur et une hauteur est contenu dans la zone de découpage visible de ceGraphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges)(string, Font, RectangleF, StringFormat) | Obtient un tableau deRegion objets, chacun délimitant une plage de positions de caractères dans la chaîne spécifiée. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring)(string, Font) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_1)(string, Font, int) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_4)(string, Font, SizeF) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_2)(string, Font, int, StringFormat) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont et formatted avec le spécifiéStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_3)(string, Font, PointF, StringFormat) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont et formatted avec le spécifiéStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_5)(string, Font, SizeF, StringFormat) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont et formatted avec le spécifiéStringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | Mesure la chaîne spécifiée lorsqu'elle est dessinée avec leFont et formatted avec le spécifiéStringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform)(Matrix) | Multiplie la transformation mondiale de ceGraphics et précisé leMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplie la transformation mondiale de ceGraphics et spécifié leMatrix dans l'ordre spécifié. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc)() | Libère un descripteur de contexte de périphérique obtenu par un appel précédent à leGetHdc méthode de ceGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc_1)(IntPtr) | Libère un descripteur de contexte de périphérique obtenu par un appel précédent auGetHdc method de ceciGraphics . |
| [ResetClip](../../system.drawing/graphics/resetclip)() | Réinitialise la zone de clip de ceGraphics à une région infinie. |
| [ResetTransform](../../system.drawing/graphics/resettransform)() | Réinitialise la matrice de transformation du monde de ceGraphics à la matrice d'identité. |
| [Restore](../../system.drawing/graphics/restore)(GraphicsState) | Restaure l'état de ce[`Graphics`](../graphics) à l'État représenté par un[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform)(float) | Applique la rotation spécifiée à la matrice de transformation de ceGraphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Applique la rotation spécifiée à la matrice de transformation de ceGraphics dans l'ordre spécifié. |
| [Save](../../system.drawing/graphics/save)() | Enregistre l'état actuel de ce[`Graphics`](../graphics) et identifie l'état enregistré avec un[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform)(float, float) | Applique l'opération de mise à l'échelle spécifiée à la matrice de transformation de ceGraphics en ajoutant it à la matrice de transformation de l'objet. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Applique l'opération de mise à l'échelle spécifiée à la matrice de transformation de ceGraphics dans l'ordre spécifié. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_2)(Graphics) | Définit la zone de découpage de ce[`Graphics`](../graphics) à la propriété Clip du fichier spécifié[`Graphics`](../graphics) |
| [SetClip](../../system.drawing/graphics/setclip#setclip)(GraphicsPath) | Définit la zone de découpage de ce[`Graphics`](../graphics) au spécifié[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_4)(Rectangle) | Définit la zone de découpage de ce[`Graphics`](../graphics) au résultat de l'opération spécifiée combinant la région de clip actuelle et le rectangle spécifié par un[`Rectangle`](../rectangle) structure. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_6)(RectangleF) | Définit la zone de découpage de ce[`Graphics`](../graphics) au résultat de l'opération spécifiée combinant la région de clip actuelle et le rectangle spécifié par un[`RectangleF`](../rectanglef) structure. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_3)(Graphics, CombineMode) | Définit la zone de découpage de ce[`Graphics`](../graphics) au résultat de l'opération de combinaison spécifiée de la région de clip actuelle et de la propriété Clip de la[`Graphics`](../graphics) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_1)(GraphicsPath, CombineMode) | Définit la zone de découpage de ce[`Graphics`](../graphics) au résultat de l'opération spécifiée combinant la région de clip actuelle et le[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath) . |
| [SetClip](../../system.drawing/graphics/setclip#setclip_5)(Rectangle, CombineMode) | Définit la zone de découpage de ce[`Graphics`](../graphics) au résultat de l'opération spécifiée combinant la région de clip actuelle et le rectangle spécifié par un[`Rectangle`](../rectangle) structure. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_7)(RectangleF, CombineMode) | Définit la zone de découpage de ce[`Graphics`](../graphics) au résultat de l'opération spécifiée combinant la région de clip actuelle et le rectangle spécifié par un[`RectangleF`](../rectanglef) structure. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_8)(Region, CombineMode) | Définit la zone de découpage de ceGraphicsau résultat de l'opération spécifiée combinant la région de clip actuelle et la valeur spécifiéeRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | Transforme un tableau de points d'un espace de coordonnées à un autre en utilisant le monde actuel et les transformations de page de ceGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | Transforme un tableau de points d'un espace de coordonnées à un autre en utilisant le monde actuel et les transformations de page de ceGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip_1)(float, float) | Traduit la zone de découpage de ceGraphics par des quantités spécifiées dans les directions horizontale et verticale. |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip)(int, int) | Traduit la zone de découpage de ceGraphics par des quantités spécifiées dans les directions horizontale et verticale. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform)(float, float) | Modifie l'origine du système de coordonnées en ajoutant la traduction spécifiée à la matrice de transformation de ceGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Modifie l'origine du système de coordonnées en appliquant la translation spécifiée à la matrice de transformation de ceGraphics dans l'ordre spécifié. |

## Autres membres

| Nom | La description |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort) | Fournit une méthode de rappel pour décider quand le[`DrawImage`](./drawimage) La méthode doit annuler prématurément l'exécution et arrêter de dessiner une image. |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc) | Fournit une méthode de rappel pour le[`EnumerateMetafile`](./enumeratemetafile) méthode. |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
