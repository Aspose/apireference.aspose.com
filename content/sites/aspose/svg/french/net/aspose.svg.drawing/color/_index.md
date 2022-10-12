---
title: Color
second_title: Référence de l'API Aspose.SVG pour .NET
description: La classe Couleur vous permet de spécifier les couleurs sous forme de valeurs RougeVertBleu RVB Valeurs de teintesaturationluminosité HSL Valeurs de teintesaturationvaleur HSV TeinteBlancheurNoir HWB   valeurs de luminositéAB LAB valeurs de luminancechromateinte LCH valeurs de cyanmagentajauneclé CMJN valeurs de couleurs naturelles NCOL ou avec un nom de couleur . Un canal Alpha est également disponible pour indiquer la transparence.
type: docs
weight: 1390
url: /fr/net/aspose.svg.drawing/color/
---
## Color class

La classe Couleur vous permet de spécifier les couleurs sous forme de valeurs Rouge-Vert-Bleu (RVB), Valeurs de teinte-saturation-luminosité (HSL), Valeurs de teinte-saturation-valeur (HSV), Teinte-Blancheur-Noir (HWB) ) , valeurs de luminosité-AB (LAB), valeurs de luminance-chroma-teinte (LCH), valeurs de cyan-magenta-jaune-clé (CMJN), valeurs de couleurs naturelles (NCOL), ou avec un nom de couleur . Un canal Alpha est également disponible pour indiquer la transparence.

```csharp
public class Color
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [Color](color#constructor)() | Initialise une nouvelle instance du[`Color`](../color) class. Par défaut, la couleur est le noir. |
| [Color](color#constructor_1)(byte, byte, byte) | Initialise une nouvelle instance du[`Color`](../color)class. Toutes les composantes de couleur doivent être comprises entre 0 et 255. |
| [Color](color#constructor_5)(float, float, float) | Initialise une nouvelle instance du[`Color`](../color) class. Toutes les composantes de couleur doivent être comprises entre 0 et 1. |
| [Color](color#constructor_3)(int, int, int) | Initialise une nouvelle instance du[`Color`](../color)class. Toutes les composantes de couleur doivent être comprises entre 0 et 255. |
| [Color](color#constructor_2)(byte, byte, byte, byte) | Initialise une nouvelle instance du[`Color`](../color)class. Toutes les composantes de couleur doivent être comprises entre 0 et 255. |
| [Color](color#constructor_6)(float, float, float, float) | Initialise une nouvelle instance du[`Color`](../color) class. Toutes les composantes de couleur doivent être comprises entre 0 et 1. |
| [Color](color#constructor_4)(int, int, int, int) | Initialise une nouvelle instance du[`Color`](../color)class. Toutes les composantes de couleur doivent être comprises entre 0 et 255. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha) { get; } | Représente la composante alpha de la couleur. |
| [Blue](../../aspose.svg.drawing/color/blue) { get; } | Représente la composante bleue de la couleur. |
| [Green](../../aspose.svg.drawing/color/green) { get; } | Représente la composante verte de la couleur. |
| [Red](../../aspose.svg.drawing/color/red) { get; } | Représente la composante rouge de la couleur |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk)(float, float, float, float) | Renvoie une nouvelle couleur avec les valeurs cyan, magenta, jaune, clé (noir) demandées. |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka)(float, float, float, float, float) | Renvoie une nouvelle couleur avec les valeurs cyan, magenta, jaune, clé (noir) et alpha demandées. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray)(float) | Renvoie une nouvelle couleur avec la valeur de gris demandée. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl)(float, float, float) | Renvoie une nouvelle couleur avec les valeurs de teinte, de saturation et de saturation demandées. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla)(float, float, float, float) | Renvoie une nouvelle couleur avec la teinte, la saturation, la saturation et les valeurs alpha demandées. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv)(float, float, float) | Renvoie une nouvelle couleur avec la teinte, la saturation et la valeur demandées. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva)(float, float, float, float) | Renvoie une nouvelle couleur avec la teinte, la saturation, la valeur et l'alpha demandés. |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb)(float, float, float) | Renvoie une nouvelle couleur avec les valeurs de teinte, de blancheur et de noirceur demandées. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba)(float, float, float, float) | Renvoie une nouvelle couleur avec les valeurs de teinte, de blancheur et de noirceur demandées. |
| static [FromInt](../../aspose.svg.drawing/color/fromint)(int) | Renvoie une nouvelle couleur avec la valeur ARGB demandée. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab)(float, float, float) | Renvoie une nouvelle couleur avec la luminosité demandée, valeurs A, B. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba)(float, float, float, float) | Renvoie une nouvelle couleur avec la luminosité demandée, A, B, valeurs alpha. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch)(float, float, float) | Renvoie une nouvelle couleur avec les valeurs de luminance, de chrominance et de teinte demandées. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha)(float, float, float, float) | Renvoie une nouvelle couleur avec les valeurs de luminance, chroma, teinte et alpha demandées. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab)(float, float, float) | Renvoie une nouvelle couleur avec la luminosité demandée, les valeurs A, B pour le modèle OKLAB. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba)(float, float, float, float) | Renvoie une nouvelle couleur avec la luminosité demandée, A, B, valeurs alpha pour le modèle OKLAB. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch)(float, float, float) | Renvoie une nouvelle couleur avec les valeurs de luminance, de chrominance et de teinte demandées pour le modèle OKLAB. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha)(float, float, float, float) | Renvoie une nouvelle couleur avec les valeurs de luminance, chrominance, teinte et alpha demandées pour le modèle OKLAB. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb)(byte, byte, byte) | Renvoie une nouvelle couleur avec les valeurs ged, green, blue demandées. Tous les composants de couleur doivent être compris entre 0 et 255. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_2)(float, float, float) | Renvoie une nouvelle couleur avec les valeurs ged, green, blue demandées. Toutes les composantes de couleur doivent être comprises entre 0 et 1. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_1)(int, int, int) | Renvoie une nouvelle couleur avec les valeurs ged, green, blue demandées. Tous les composants de couleur doivent être compris entre 0 et 255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba)(byte, byte, byte, byte) | Renvoie une nouvelle couleur avec les valeurs ged, green, blue et alpha demandées. Toutes les composantes de couleur doivent être comprises entre 0 et 255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_2)(float, float, float, float) | Renvoie une nouvelle couleur avec les valeurs ged, green, blue et alpha demandées. Toutes les composantes de couleur doivent être comprises entre 0 et 1. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_1)(int, int, int, int) | Renvoie une nouvelle couleur avec les valeurs ged, green, blue et alpha demandées. Toutes les composantes de couleur doivent être comprises entre 0 et 255. |
| static [FromString](../../aspose.svg.drawing/color/fromstring)(string) | Analyse la chaîne contenant la couleur CSS et renvoie une nouvelle couleur. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint)(uint) | Renvoie une nouvelle couleur avec la valeur ARGB demandée. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity)(float) | Crée une copie de la couleur avec la somme de sa luminosité et la valeur delta. |
| [Convert](../../aspose.svg.drawing/color/convert)(ColorModel) | Renvoie une composante de couleur dans le format du modèle de couleur spécifié. |
| override [Equals](../../aspose.svg.drawing/color/equals)(object) | Détermine si la valeur spécifiée[`Color`](../color) est égal à cette instance. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary)() | Renvoie une nouvelle couleur qui se trouve du côté opposé de la roue chromatique à l'original. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode)() | Renvoie un code de hachage. |
| [GetHue](../../aspose.svg.drawing/color/gethue)() | Renvoie une teinte de la couleur. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity)() | Renvoie une luminosité de la Couleur. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation)() | Renvoie une saturation de la Couleur. |
| [ToInt](../../aspose.svg.drawing/color/toint)() | Encode les composants Couleur ARGB en int. |
| [ToName](../../aspose.svg.drawing/color/toname)() | Renvoie le nom de la couleur si elle correspond à une couleur dans la liste des couleurs CSS nommées, ou une chaîne vide. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring)(int) | Renvoie une couleur spécifiée par les couleurs naturelles (NCol) en utilisant une lettre de couleur avec un nombre pour spécifier la distance (en pourcentage) de la couleur. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring)() | Renvoie une couleur hexadécimale spécifiée avec : #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring)() | Renvoie une chaîne contenant la couleur RGBA spécifiée par : rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring)() | Renvoie une couleur hexadécimale spécifiée avec : #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring)() | Renvoie une chaîne contenant la couleur RVB spécifiée par : rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring)() | Renvoie une chaîne composée des valeurs des composants RGBA. |
| [ToUint](../../aspose.svg.drawing/color/touint)() | Encode les composants Couleur ARGB en unsigned int. |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha)(float) | Crée une copie de la couleur avec le composant alpha spécifié. |
| [WithHue](../../aspose.svg.drawing/color/withhue)(float) | Crée une copie de la couleur avec la teinte spécifiée. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity)(float) | Crée une copie de la couleur avec la luminosité spécifiée. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation)(float) | Crée une copie de la couleur avec la saturation spécifiée. |

### Voir également

* espace de noms [Aspose.Svg.Drawing](../../aspose.svg.drawing)
* Assemblée [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
