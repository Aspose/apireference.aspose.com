---
title: ImageDevice
second_title: Aspose.Page pour la référence de l'API .NET
description: Cette classe encapsule le rendu du document en image.
type: docs
weight: 40
url: /fr/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Cette classe encapsule le rendu du document en image.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Initialise la nouvelle instance de[`ImageDevice`](../imagedevice) . |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | Initialise la nouvelle instance de[`ImageDevice`](../imagedevice) avec le format d'image spécifié. |
| [ImageDevice](imagedevice#constructor_2)(Size) | Initialise la nouvelle instance de[`ImageDevice`](../imagedevice) avec la taille spécifiée d'une page. |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | Initialise la nouvelle instance de[`ImageDevice`](../imagedevice)avec une taille de page et un format d'image spécifiés. |

## Propriétés

| Nom | La description |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Indique si l'appareil utilise le mode RVB direct, c'est-à-dire RVB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Renvoie ou spécifie la transformation actuelle des caractères. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Renvoie ou spécifie le créateur de la sortie de périphérique résultante. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Numéro de la page actuelle. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Renvoie ou spécifie la police actuelle. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Format d'image. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Renvoie les images résultantes en octets, un tableau d'octets pour une page. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Indique si l'appareil utilise le mode RVB direct, c'est-à-dire RVB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indique si cette instance de la bibliothèque Aspose.Page est sous licence. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Renvoie ou spécifie l'arrière-plan actuel de la page. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Renvoie ou spécifie le masque d'opacité actuel. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Renvoie ou spécifie la peinture actuelle. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Propriétés de l'appareil, y compris les métadonnées. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Options de gestion du processus de rendu. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Renvoie ou spécifie une taille de la page. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Renvoie ou spécifie le trait actuel. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Renvoie ou spécifie le mode de rendu du texte actuel. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Renvoie ou spécifie la largeur actuelle du trait de texte. |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Rend la préparation nécessaire de l'appareil après le rendu de la page. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Crée une copie de cet appareil. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Elimine l'appareil. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Dessine un chemin. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Dessine un arc. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Dessine une image avec transformation et arrière-plan assignés. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Dessine un segment de ligne. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Dessine un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Dessine un polygone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Dessine un polygone. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Dessine une polyligne. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Dessine une polyligne. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Dessine un rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Dessine un rectangle rond. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Dessine une chaîne à un point donné. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Rend la préparation nécessaire de l'appareil après le rendu du document. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Remplit un chemin. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Remplit un arc. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Remplit un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Remplit un polygone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Remplit un polygone. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Remplit un rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Remplit un rectangle rond. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | Obtient une valeur de propriété de chaîne. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | Obtient une valeur de la propriété color. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | Obtient une valeur de propriété double. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | Obtient une valeur de la propriété entière. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | Obtient une valeur de la propriété margins. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | Obtient une valeur de la propriété rectangle. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | Obtient une valeur de la propriété size. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Obtient la transformation actuelle. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Initialise un clip de l'appareil. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Initialise le nombre de pages à sortir. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | Obtient une valeur de propriété booléenne. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | Rend la préparation nécessaire de l'appareil avant le rendu de la page. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | Effectue la préparation nécessaire de l'appareil avant chaque rendu de page. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Réinitialiser l'appareil à l'état initial pour tout le document. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Réinitialiser l'appareil à l'état initial pour une page. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | Faites pivoter la matrice de transformation actuelle sur l'axe Z. Appelle writeTransform(Transform). La rotation avec un angle thêta positif fait pivoter les points sur l'axe x positif vers l'axe y positif. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Faire pivoter la matrice de transformation actuelle autour d'un point. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Met à l'échelle la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Forme des clips. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Spécifie la transformation actuelle. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Cisaille la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Fait la préparation nécessaire de l'appareil avant de commencer le rendu du document. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Renvoie le nom du type d'appareil. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Transforme la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Traduit la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Met à jour les paramètres de page d'un autre appareil multipage. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | Écrit un commentaire. |

## Des champs

| Nom | La description |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | Clé de propriété "Arrière-plan". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | Clé de propriété "Couleur de fond". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | Clé de propriété "Intégrer la police dans le document". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | Valeur de la propriété "Émettre des erreurs". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | Valeur de la propriété "Émettre des avertissements". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | Clé de propriété "Ajuster le contenu à la page". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | Clé de propriété "Orientation". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | Clé de propriété "Marges de page". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | Clé de propriété "Taille de la page". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | Valeur de la propriété "Producteur". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | Clé de propriété "Transparente". |

### Voir également

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* espace de noms [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* Assemblée [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
