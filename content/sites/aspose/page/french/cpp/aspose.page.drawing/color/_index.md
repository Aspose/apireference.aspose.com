---
title: "Classe Aspose::Page::Drawing::Color"
linktitle: "Color"
second_title: "Aspose.Page pour C++"
description: "Classe Aspose::Page::Drawing::Color. Représente une couleur ARGB (alpha, rouge, vert, bleu) en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.drawing/color/
---
## Color class


Représente une couleur ARGB (alpha, rouge, vert, bleu).

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Clone cet [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Teste si l'objet spécifié est une structure [T:Aspose::Page::Drawing::Color](../) et est équivalente à cette structure [T:Aspose::Page::Drawing::Color](../). |
| static [FromArgb](./fromargb/)(int32_t) | Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir d'une valeur ARGB 32 bits. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir des quatre valeurs de composantes ARGB (alpha, rouge, vert et bleu). Bien que cette méthode permette de passer une valeur 32 bits pour chaque composante, la valeur de chaque composante est limitée à 8 bits. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir de la structure [T:Aspose::Page::Drawing::Color](../) spécifiée, mais avec la nouvelle valeur alpha spécifiée. Bien que cette méthode permette de passer une valeur 32 bits pour la valeur alpha, celle-ci est limitée à 8 bits. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir des valeurs de couleur 8 bits spécifiées (rouge, vert et bleu). La valeur alpha est implicitement 255 (complètement opaque). Bien que cette méthode permette de passer une valeur 32 bits pour chaque composante de couleur, la valeur de chaque composante est limitée à 8 bits. |
| static [FromName](./fromname/)(System::String) | Crée une structure [T:Aspose::Page::Drawing::Color](../) à partir du nom spécifié d'une couleur prédéfinie. |
| [get_A](./get_a/)() | Obtient la valeur du composant alpha de cette structure [T:Aspose::Page::Drawing::Color](../). |
| static [get_AliceBlue](./get_aliceblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF0FFFF. |
| [get_B](./get_b/)() | Obtient la valeur du composant bleu de cette structure [T:Aspose::Page::Drawing::Color](../). |
| static [get_Beige](./get_beige/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFE4C4. |
| static [get_Black](./get_black/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFD2691E. |
| static [get_Coral](./get_coral/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFF00FF. |
| [get_G](./get_g/)() | Obtient la valeur du composant vert de cette structure [T:Aspose::Page::Drawing::Color](../). |
| static [get_Gainsboro](./get_gainsboro/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFDAA520. |
| static [get_Gray](./get_gray/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF808080. |
| static [get_Green](./get_green/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | Spécifie si cette structure [T:Aspose::Page::Drawing::Color](../) est non initialisée. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Obtient une valeur indiquant si cette structure [T:Aspose::Page::Drawing::Color](../) est une couleur nommée ou un membre de l'énumération [T:System::Drawing::KnownColor](../). |
| static [get_Ivory](./get_ivory/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF32CD32. |
| static [get_Linen](./get_linen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Obtient une couleur définie par le système dont la valeur ARGB est #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF191970. |
| static [get_MintCream](./get_mintcream/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFE4B5. |
| [get_Name](./get_name/)() | Obtient le nom de ce [T:Aspose::Page::Drawing::Color](../). |
| static [get_NavajoWhite](./get_navajowhite/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF000080. |
| static [get_OldLace](./get_oldlace/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF6B8E23. |
| static [get_Orange](./get_orange/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFCD853F. |
| static [get_Pink](./get_pink/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF800080. |
| [get_R](./get_r/)() | Obtient la valeur du composant rouge de cette structure [T:Aspose::Page::Drawing::Color](../). |
| static [get_Red](./get_red/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFA0522D. |
| static [get_Silver](./get_silver/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF708090. |
| static [get_Snow](./get_snow/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF4682B4. |
| static [get_Tan](./get_tan/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF008080. |
| static [get_Thistle](./get_thistle/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Obtient une couleur définie par le système. |
| static [get_Turquoise](./get_turquoise/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF5DEB3. |
| static [get_White](./get_white/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Obtient une couleur définie par le système qui a une valeur ARGB de #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Obtient la valeur de luminosité hue-saturation-brightness (HSB) pour cette structure [T:Aspose::Page::Drawing::Color](../). |
| [GetHashCode](./gethashcode/)() const override | Renvoie un code de hachage pour cette structure [T:Aspose::Page::Drawing::Color](../). |
| [GetHue](./gethue/)() | Obtient la valeur de teinte hue-saturation-brightness (HSB), en degrés, pour cette structure [T:Aspose::Page::Drawing::Color](../). |
| [GetSaturation](./getsaturation/)() | Obtient la valeur de saturation hue-saturation-brightness (HSB) pour cette structure [T:Aspose::Page::Drawing::Color](../). |
| [ToArgb](./toargb/)() | Obtient la valeur ARGB 32 bits de cette structure [T:Aspose::Page::Drawing::Color](../). |
| [ToString](./tostring/)() const override | Convertit cette structure [T:Aspose::Page::Drawing::Color](../) en une chaîne lisible par l'homme. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](./empty/) | Représente une couleur qui est nulle. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
