---
title: Font
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Définit un format particulier pour le texte y compris les attributs de police de taille et de style. Cette classe ne peut pas être héritée.
type: docs
weight: 500
url: /fr/net/system.drawing/font/
---
## Font class

Définit un format particulier pour le texte, y compris les attributs de police, de taille et de style. Cette classe ne peut pas être héritée.

```csharp
public sealed class Font : IDisposable
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Initialise une nouvelle instance du[`Font`](../font) la classe utilise l'existant spécifiéFont etFontStyle énumération.. |
| [Font](font#constructor_1)(FontFamily, float) | Initialise une nouvelle instance du[`Font`](../font) classe. |
| [Font](font#constructor_7)(string, float) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille spécifiée. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille et un style spécifiés.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Initialise une nouvelle instance du[`Font`](../font) classe en utilisant une taille et une unité spécifiées. Définit le style surRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille et un style spécifiés. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Initialise une nouvelle instance du[`Font`](../font) classe en utilisant une taille et une unité spécifiées. Le style est réglé surRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille, un style et une unité spécifiés. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille, un style et une unité spécifiés. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille, un style, une unité et un jeu de caractères spécifiés.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Initialise une nouvelle instance du[`Font`](../font)classe utilisant une taille, un style, une unité et un jeu de caractères spécifiés. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant une taille, un style, une unité et un jeu de caractères spécifiés.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Initialise une nouvelle instance du[`Font`](../font) classe utilisant la taille, le style, l'unité et le jeu de caractères spécifiés. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Obtient une valeur indiquant si celaFont est en gras. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | Obtient leFontFamily associé à ceFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Obtient une valeur d'octet qui spécifie le jeu de caractères GDI que ceFont utilise. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Obtient une valeur indiquant si celaFont est dérivé d'une police verticale GDI.. |
| [Height](../../system.drawing/font/height) { get; } | Obtient l'interligne de cette police. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Obtient une valeur indiquant si la police est membre deSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Obtient une valeur indiquant si celaFont est en italique. |
| [Name](../../system.drawing/font/name) { get; } | Obtient le nom du visage de ceFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Obtient le nom de la police initialement spécifiée. |
| [Size](../../system.drawing/font/size) { get; } | Obtient la taille em de ceFont mesuré dans les unités spécifiées par the Unit propriété. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Obtient la taille em, en points, de ceFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Obtient une valeur indiquant si celaFont spécifie une ligne horizontale à travers la police. |
| [Style](../../system.drawing/font/style) { get; } | Obtient les informations de style pour celaFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Obtient le nom de la police système si la propriété IsSystemFont renvoie true. |
| [Underline](../../system.drawing/font/underline) { get; } | Obtient une valeur indiquant si celaFont est souligné. |
| [Unit](../../system.drawing/font/unit) { get; } | Obtient l'unité de mesure pour ceFont . |

## Méthodes

| Nom | La description |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Crée une copie exacte de ceciFont . |
| [Dispose](../../system.drawing/font/dispose)() | Libère toutes les ressources utilisées par ceFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Indique si l'objet spécifié est unFont et a le mêmeFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , etUnit valeurs de propriété comme ceciFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Obtient le code de hachage pour celaFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Renvoie l'interligne, en pixels, de cette police. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Renvoie la hauteur, en pixels, de ceFontlorsqu'il est dessiné sur un appareil avec la résolution verticale spécifiée. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Renvoie l'interligne, dans l'unité courante d'unGraphics , de cette police. |
| override [ToString](../../system.drawing/font/tostring)() | Renvoie une représentation sous forme de chaîne lisible par l'homme de ceFont . |

### Voir également

* espace de noms [System.Drawing](../../system.drawing)
* Assemblée [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
