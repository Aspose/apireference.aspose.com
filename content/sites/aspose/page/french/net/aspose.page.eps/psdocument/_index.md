---
title: Class PsDocument
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.EPS.PsDocument classe. Cette classe encapsule les documents PS/EPS.
type: docs
weight: 140
url: /fr/net/aspose.page.eps/psdocument/
---
## PsDocument class

Cette classe encapsule les documents PS/EPS.

```csharp
public sealed class PsDocument : Document
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Initialise`PsDocument` avec un flux de fichier PS/EPS. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Initialise vide`PsDocument` avec page initialisée. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Initialise vide`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Initialise vide`PsDocument` lorsque le nombre de pages du document Postscript est connu à l'avance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Renvoie le nombre de pages dans le document PDF résultant. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Ajoute le clip à l'état graphique actuel. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Ajoute le clip à l'état graphique actuel et écrit ensuite l'opérateur "newpath". Il est nécessaire de faire pour échapper de la confluence de ce chemin de détourage et de certains chemins suivants tels que les glyphes soulignés avec l'opérateur "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Ajoute un rectangle de découpage à l'état graphique actuel. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Compléter la page actuelle. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Dessine un chemin arbitraire. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Dessiner une image masquée. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Dessiner une image. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Dessine une image transformée avec un arrière-plan. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Remplissez un chemin arbitraire. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes et en dessinant les contours des glyphes. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | Ajoute une chaîne de texte en remplissant l'intérieur des glyphes. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Obtient la peinture de l'état graphique actuel. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Obtient le trait de l'état graphique actuel. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Lit le fichier PS/EPS et extrait XmpMetdata s'il existe déjà ou en ajoute un nouveau s'il n'existe pas. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Fusionne les fichiers PS/EPS sur un appareil. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | Crée une nouvelle page et en fait une page actuelle. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | Ajoute une rotation à l'état graphique actuel (faire pivoter la matrice actuelle). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Sauvegardes données`PsDocument` sous forme de fichier EPS. Cette méthode est utilisée uniquement lorsque PsDocument a été créé à partir de zéro. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Sauvegardes données`PsDocument` sous forme de fichier EPS. Cette méthode est utilisée uniquement après la mise à jour des métadonnées XMP. Elle enregistre le fichier EPS initial avec les métadonnées existantes mises à jour ou les nouvelles créées lors de l'appel de la méthode GetMetadata. Dans le dernier cas, tous les codes PostScript et commentaires EPS nécessaires sont ajoutés. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Enregistre le fichier PS/EPS sur un appareil. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Ajoute une échelle à l'état graphique actuel (mise à l'échelle de la matrice actuelle). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Définit les paramètres du périphérique de page (voir la spécification PostScript de l'opérateur "setpagedevice"). Parmi ceux-ci peuvent figurer la taille et la couleur de la page, etc. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Définit la taille de la page. Pour créer des pages de tailles différentes dans un document, utilisez[`SetPageDevice`](./setpagedevice/) méthode juste après cette méthode. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Définit la peinture dans l'état graphique actuel. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Définit le trait dans l'état graphique actuel. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Ajoute une transformation de cisaillement à l'état graphique actuel (matrice de courant de cisaillement). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Ajoute une transformation à l'état graphique actuel (concatène cette matrice avec celle actuelle). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Ajoute la traduction à l'état graphique actuel (traduit la matrice actuelle). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Ecrit la restauration de l'état graphique actuel (Voir spécification PostScript sur l'opérateur "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Ecrit la sauvegarde de l'état graphique actuel (Voir spécification PostScript sur l'opérateur "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Enregistre l'objet Bitmap dans le flux de sortie EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Enregistre l'objet Bitmap dans un fichier EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Enregistre l'image PNG/JPEG/TIFF/BMP/GIF/EMF du flux d'entrée vers le flux de sortie EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Enregistre l'image PNG/JPEG/TIFF/BMP/GIF/EMF d'un fichier à un fichier EPS. |

### Voir également

* class [Document](../../aspose.page/document/)
* espace de noms [Aspose.Page.EPS](../../aspose.page.eps/)
* Assemblée [Aspose.Page](../../)


