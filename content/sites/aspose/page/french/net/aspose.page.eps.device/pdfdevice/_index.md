---
title: Class PdfDevice
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.EPS.Device.PdfDevice classe. Cette classe encapsule le rendu du document au format PDF.
type: docs
weight: 60
url: /fr/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Cette classe encapsule le rendu du document au format PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Initialise la nouvelle instance de`PdfDevice` avec flux de sortie. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Initialise la nouvelle instance de`PdfDevice` avec flux de sortie et taille spécifiée d'une page. |

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Renvoie ou spécifie l'arrière-plan actuel de la page. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Renvoie ou spécifie la transformation actuelle des caractères. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Renvoie ou spécifie le créateur de la sortie de périphérique résultante. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Numéro de la page actuelle. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Spécifie la police actuelle. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indique si l'appareil utilise le mode RVB direct, c'est-à-dire RVB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indique si cette instance de la bibliothèque Aspose.Page est sous licence. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Renvoie ou spécifie l'opacité actuelle. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Renvoie ou spécifie le masque d'opacité actuel. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Spécifie ou renvoie un flux de sortie. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Renvoie ou spécifie la peinture actuelle. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Propriétés de l'appareil, y compris les métadonnées. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Options de gestion du processus de rendu. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Renvoie ou spécifie une taille de la page. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Renvoie ou spécifie le trait actuel. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Renvoie ou spécifie le mode de rendu du texte actuel. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Renvoie ou spécifie la largeur actuelle du trait de texte. |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Rend la préparation nécessaire de l'appareil après le rendu de la page. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Crée une copie de cet appareil. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Supprime le contexte graphique. Si à la création restoreOnDispose était vrai, writeGraphicsRestore() sera appelé. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Dessine un chemin. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Dessine un arc. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Dessine une image avec transformation et arrière-plan assignés. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Dessine un segment de ligne. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Dessine un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Dessine un polygone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Dessine un polygone. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Dessine une polyligne. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Dessine une polyligne. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Dessine un rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Dessine un rectangle rond. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Dessine une chaîne à un point donné. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Rend la préparation nécessaire de l'appareil après le rendu du document. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Remplit un chemin. |
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
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Obtient la transformation actuelle. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Initialise le clip de l'appareil. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Initialise le nombre de pages à sortir. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Obtient une valeur de propriété booléenne. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Rend la préparation nécessaire de l'appareil avant le rendu de la page. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Effectue la préparation nécessaire de l'appareil avant chaque rendu de page. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Réinitialiser l'appareil à l'état initial pour tout le document. Utilisé pour réinitialiser le flux de sortie. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Si les paramètres du périphérique de page sont définis, cette méthode permet de renvoyer le flux d'écriture au début de la page. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Faites pivoter la transformation actuelle sur l'axe Z. Appelle writeTransform(Transform). La rotation avec un angle thêta positif fait pivoter les points sur l'axe x positif vers l'axe y positif. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Faire pivoter la matrice de transformation actuelle autour d'un point. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Met à l'échelle la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Spécifie le clip de l'appareil. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Spécifie la transformation actuelle. Étant donné que la plupart des formats de sortie n'implémentent pas cette fonctionnalité, la transformation inverse de the currentTransform est calculée et multipliée par the transform à définir. Le résultat est ensuite transmis par un call à writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Cisaille la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Fait la préparation nécessaire de l'appareil avant de commencer le rendu du document. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Renvoie le nom du type d'appareil. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Transforme la matrice de transformation actuelle. Appelle writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Traduit la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Met à jour les paramètres de page d'un autre appareil multipage. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Écrit un commentaire. |

## Des champs

| Nom | La description |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Valeur de la propriété "Auteur". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Clé de propriété "Arrière-plan". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Clé de propriété "Couleur de fond". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Clé de propriété "Compresser". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Clé de propriété "Intégrer la police dans le document". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Clé de propriété "Quel type de police est utilisé pour l'incorporation". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Valeur de la propriété "Émettre des erreurs". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Valeur de la propriété "Émettre des avertissements". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Clé de propriété "Ajuster le contenu à la page". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Valeur de la propriété "Mots clés". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Clé de propriété "Orientation". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Clé de propriété "Marges de page". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Clé de propriété "Taille de la page". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Valeur de la propriété "Sujet". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Valeur de la propriété "Titre". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | Clé de propriété "Transparente". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Clé de propriété "Version". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Valeur de la propriété "Version d'Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Clé de propriété "Format des images". |

### Voir également

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* espace de noms [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* Assemblée [Aspose.Page](../../)


