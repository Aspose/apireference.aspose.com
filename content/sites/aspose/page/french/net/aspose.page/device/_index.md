---
title: Device
second_title: Aspose.Page pour la référence de l'API .NET
description: Cette classe encapsule le rendu du document sur un périphérique abstrait. Le rendu du document est effectué page par page.
type: docs
weight: 20
url: /fr/net/aspose.page/device/
---
## Device class

Cette classe encapsule le rendu du document sur un périphérique abstrait. Le rendu du document est effectué page par page.

```csharp
public abstract class Device
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Device](device)(Size) | Initialise[`Device`](../device) avec une taille d'une page. |

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | Renvoie ou spécifie l'arrière-plan actuel de la page. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Renvoie ou spécifie la transformation actuelle des caractères. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Renvoie ou spécifie le créateur de la sortie de périphérique résultante. |
| virtual [Font](../../aspose.page/device/font) { get; set; } | Renvoie ou spécifie la police actuelle. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Indique si l'appareil utilise le mode RVB direct, c'est-à-dire RVB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indique si cette instance de la bibliothèque Aspose.Page est sous licence. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | Renvoie ou spécifie l'opacité actuelle. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Renvoie ou spécifie le masque d'opacité actuel. |
| virtual [Paint](../../aspose.page/device/paint) { get; set; } | Renvoie ou spécifie la peinture actuelle. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Propriétés de l'appareil, y compris les métadonnées. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | Options de gestion du processus de rendu. |
| virtual [Size](../../aspose.page/device/size) { get; set; } | Renvoie ou spécifie une taille de la page. |
| virtual [Stroke](../../aspose.page/device/stroke) { get; set; } | Renvoie ou spécifie le trait actuel. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Renvoie ou spécifie le mode de rendu du texte actuel. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Renvoie ou spécifie la largeur actuelle du trait de texte. |

## Méthodes

| Nom | La description |
| --- | --- |
| virtual [Create](../../aspose.page/device/create)() | Crée une copie de cet appareil. |
| virtual [Dispose](../../aspose.page/device/dispose)() | Elimine l'appareil. |
| virtual [Draw](../../aspose.page/device/draw)(GraphicsPath) | Dessine un chemin. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Dessine un arc. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Dessine une image avec transformation et arrière-plan assignés. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Dessine un segment de ligne. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Dessine un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon)(double[], double[], int) | Dessine un polygone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon_1)(int[], int[], int) | Dessine un polygone. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline)(double[], double[], int) | Dessine une polyligne. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline_1)(int[], int[], int) | Dessine une polyligne. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Dessine un rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Dessine un rectangle rond. |
| virtual [DrawString](../../aspose.page/device/drawstring)(string, double, double) | Dessine une chaîne à un point donné. |
| virtual [EndDocument](../../aspose.page/device/enddocument)() | Rend la préparation nécessaire de l'appareil après le rendu du document. |
| virtual [Fill](../../aspose.page/device/fill)(GraphicsPath) | Remplit un chemin. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Remplit un arc. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Remplit un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon)(double[], double[], int) | Remplit un polygone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon_1)(int[], int[], int) | Remplit un polygone. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Remplit un rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Remplit un rectangle rond. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Obtient une valeur de propriété de chaîne. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Obtient une valeur de la propriété color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Obtient une valeur de propriété double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Obtient une valeur de la propriété entière. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Obtient une valeur de la propriété margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Obtient une valeur de la propriété rectangle. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Obtient une valeur de la propriété size. |
| virtual [GetTransform](../../aspose.page/device/gettransform)() | Obtient la transformation actuelle. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Initialise le clip de l'appareil. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Obtient une valeur de propriété booléenne. |
| virtual [ReNew](../../aspose.page/device/renew)() | Réinitialiser l'appareil à l'état initial pour tout le document. Utilisé pour réinitialiser le flux de sortie. |
| virtual [Reset](../../aspose.page/device/reset)() | Réinitialiser l'appareil à l'état initial pour une page. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate)(double) | Faites pivoter la matrice de transformation actuelle. Appelle writeTransform(Transform). La rotation avec un angle thêta positif fait pivoter les points sur l'axe x positif vers l'axe y positif. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate_1)(double, double, double) | Faire pivoter la matrice de transformation actuelle autour d'un point. |
| virtual [Scale](../../aspose.page/device/scale)(double, double) | Met à l'échelle la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip)(GraphicsPath) | Spécifie le clip de l'appareil. |
| virtual [SetTransform](../../aspose.page/device/settransform)(Matrix) | Spécifie la transformation actuelle. |
| virtual [Shear](../../aspose.page/device/shear)(double, double) | Cisaille la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument)() | Fait la préparation nécessaire de l'appareil avant de commencer le rendu du document. |
| override [ToString](../../aspose.page/device/tostring)() | Renvoie le nom du type d'appareil. |
| virtual [Transform](../../aspose.page/device/transform)(Matrix) | Transforme la matrice de transformation actuelle. Appelle writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate)(double, double) | Traduit la matrice de transformation actuelle. Appelle writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Écrit un commentaire. |

## Des champs

| Nom | La description |
| --- | --- |
| static [VERSION](../../aspose.page/device/version) | Version actuelle de l'appareil. |

### Voir également

* espace de noms [Aspose.Page](../../aspose.page)
* Assemblée [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
