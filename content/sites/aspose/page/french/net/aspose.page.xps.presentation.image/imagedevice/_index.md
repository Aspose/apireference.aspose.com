---
title: Class ImageDevice
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.Presentation.Image.ImageDevice classe. Dispositif de composition dimage encapsulant la classe.
type: docs
weight: 350
url: /fr/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Dispositif de composition d'image encapsulant la classe.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Crée la nouvelle instance. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Crée la nouvelle instance avec la taille de média spécifiée. |

## Propriétés

| Nom | La description |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Obtient/définit la couleur d'arrière-plan. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Renvoie ou spécifie la transformation actuelle des caractères. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Renvoie ou spécifie le créateur de la sortie de périphérique résultante. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Renvoie le numéro absolu de la page actuelle dans le document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Renvoie le numéro relatif de la page actuelle dans la partition actuelle. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Obtient/définit la police actuelle. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indique si l'appareil utilise le mode RVB direct, c'est-à-dire RVB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indique si cette instance de la bibliothèque Aspose.Page est sous licence. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Obtient/définit l'opacité. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Obtient/définit le pinceau pour le masque d'opacité. Le masque s'applique sur Paint ou Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Obtient/définit le pinceau pour remplir les chemins. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Propriétés de l'appareil, y compris les métadonnées. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Renvoie les tableaux d'octets des images résultantes. La première dimension concerne les documents internes et la seconde concerne les pages des documents internes. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Initialise les options de sauvegarde. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Obtient/définit la taille du support de l'appareil. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Obtient/définit le trait pour tracer des chemins. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Renvoie ou spécifie le mode de rendu du texte actuel. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Renvoie ou spécifie la largeur actuelle du trait de texte. |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Accomplit la page. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Réalisé la partition du document. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Crée une nouvelle instance de l'appareil basée sur cette instance d'appareil. Écrit cet état graphique de l'appareil, c'est-à-dire créeApsCanvas instance(s) avec les propriétés RenderTransform et Clip correspondantes. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Supprime cette instance d'appareil. Finalise cet état graphique d'instance de périphérique, c'est-à-dire bascule le contexte de composition APS vers leApsCanvas du niveau supérieur à l'état graphique de cet appareilApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Dessine le chemin spécifié. |
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
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Dessine une chaîne à la position spécifiée. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Accomplit le document. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Remplit le chemin spécifié. |
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
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Renvoie la matrice de transformation actuelle. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initialise le clip de l'appareil. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Initialise le nombre de pages à sortir. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Obtient une valeur de propriété booléenne. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Démarre une nouvelle page avec le titre spécifié. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Démarre une nouvelle page avec la largeur et la hauteur spécifiées. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Démarre une nouvelle partition de document. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Remet les appareils à l'état initial. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Réinitialise l'appareil. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Applique une rotation dans le sens des aiguilles d'une montre autour de l'origine à la matrice de transformation actuelle. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Faire pivoter la matrice de transformation actuelle autour d'un point. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Applique le vecteur d'échelle spécifié à la matrice de transformation actuelle. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Ajoute le chemin spécifié au chemin du clip actuel. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Définit la matrice de transformation actuelle. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Applique le vecteur de cisaillement spécifié à la matrice de transformation actuelle. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Démarre le document. |
| override [ToString](../../aspose.page/device/tostring/)() | Renvoie le nom du type d'appareil. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Multiplie la matrice de transformation actuelle par la valeur spécifiéeMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Applique le vecteur de translation spécifié à la matrice de transformation actuelle. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Met à jour les paramètres de la page actuelle. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Écrit un commentaire. |

### Voir également

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* espace de noms [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* Assemblée [Aspose.Page](../../)


