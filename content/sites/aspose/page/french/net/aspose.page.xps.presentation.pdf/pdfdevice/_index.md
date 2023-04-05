---
title: Class PdfDevice
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice classe. Dispositif de composition dimage encapsulant la classe.
type: docs
weight: 400
url: /fr/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Dispositif de composition d'image encapsulant la classe.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Crée la nouvelle instance. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Crée la nouvelle instance avec la taille de média spécifiée. |

## Propriétés

| Nom | La description |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | Obtient/définit la couleur d'arrière-plan. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Renvoie ou spécifie la transformation actuelle des caractères. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Renvoie ou spécifie le créateur de la sortie de périphérique résultante. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | Renvoie le numéro absolu de la page courante dans le document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | Renvoie le numéro de la page courante dans la partition courante. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | Obtient/définit la police actuelle. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indique si l'appareil utilise le mode RVB direct, c'est-à-dire RVB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indique si cette instance de la bibliothèque Aspose.Page est sous licence. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | Obtient/définit l'opacité. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | Obtient/définit le pinceau pour le masque d'opacité. Le masque s'applique sur Paint ou Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | Obtient/définit le pinceau pour remplir les chemins. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Propriétés de l'appareil, y compris les métadonnées. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | Initialise les options de sauvegarde. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | Obtient/définit la taille du support de l'appareil. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | Obtient/définit le trait pour tracer des chemins. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Renvoie ou spécifie le mode de rendu du texte actuel. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Renvoie ou spécifie la largeur actuelle du trait de texte. |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | Ajoute un élément de plan avec le dernier objet comme cible. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | Ajoute un élément de plan avec le point d'origine comme cible. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | Accomplit la page. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | Réalisé la partition du document. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | Crée une nouvelle instance de l'appareil basée sur cette instance d'appareil. Écrit cet état graphique de l'appareil, c'est-à-dire créeApsCanvas instance(s) avec les propriétés RenderTransform et Clip correspondantes. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | Supprime cette instance d'appareil. Finalise cet état graphique d'instance de périphérique, c'est-à-dire bascule le contexte de composition APS vers leApsCanvas du niveau supérieur à l'état graphique de cet appareilApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | Dessine le chemin spécifié. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Dessine un arc. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Dessine une image avec transformation et arrière-plan assignés. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Dessine un segment de ligne. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Dessine un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Dessine un polygone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Dessine un polygone. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Dessine une polyligne. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Dessine une polyligne. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Dessine un rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Dessine un rectangle rond. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | Dessine une chaîne à la position spécifiée. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | Accomplit le document. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | Remplit le chemin spécifié. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Remplit un arc. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Remplit un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Remplit un polygone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Remplit un polygone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Remplit un rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Remplit un rectangle rond. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Obtient une valeur de propriété de chaîne. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Obtient une valeur de la propriété color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Obtient une valeur de propriété double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Obtient une valeur de la propriété entière. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Obtient une valeur de la propriété margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Obtient une valeur de la propriété rectangle. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Obtient une valeur de la propriété size. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | Renvoie la matrice de transformation actuelle. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initialise le clip de l'appareil. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | Initialise le nombre de pages à sortir. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Obtient une valeur de propriété booléenne. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | Démarre une nouvelle page avec le titre spécifié. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | Démarre une nouvelle page avec la largeur et la hauteur spécifiées. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | Démarre une nouvelle partition de document. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | Remet les appareils à l'état initial. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | Réinitialise l'appareil. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | Applique une rotation dans le sens des aiguilles d'une montre autour de l'origine à la matrice de transformation actuelle. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Faire pivoter la matrice de transformation actuelle autour d'un point. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | Applique le vecteur d'échelle spécifié à la matrice de transformation actuelle. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | Ajoute le chemin spécifié au chemin du clip actuel. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | Définit le lien hypertexte avec un numéro de page comme cible. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | Définit le lien hypertexte avec un URI externe comme cible. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | Définit la matrice de transformation actuelle. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | Applique le vecteur de cisaillement spécifié à la matrice de transformation actuelle. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | Démarre le document. |
| override [ToString](../../aspose.page/device/tostring/)() | Renvoie le nom du type d'appareil. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | Multiplie la matrice de transformation actuelle par la valeur spécifiéeMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | Applique le vecteur de translation spécifié à la matrice de transformation actuelle. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Met à jour les paramètres de la page actuelle. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Écrit un commentaire. |

### Voir également

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* espace de noms [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* Assemblée [Aspose.Page](../../)


