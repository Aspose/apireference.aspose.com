---
title: "Aspose::Page::Drawing::Color klasse"
linktitle: "Kleur"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::Drawing::Color klasse. Stelt een ARGB (alpha, rood, groen, blauw) kleur voor in C++."
type: docs
weight: 100
url: /nl/cpp/aspose.page.drawing/color/
---
## Color class


Stelt een ARGB (alpha, rood, groen, blauw) kleur voor.

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Kopieert dit [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Test of het opgegeven object een [T:Aspose::Page::Drawing::Color](../) structuur is en gelijk is aan deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| static [FromArgb](./fromargb/)(int32_t) | Maakt een [T:Aspose::Page::Drawing::Color](../) structuur van een 32‑bit ARGB‑waarde. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Maakt een [T:Aspose::Page::Drawing::Color](../) structuur van de vier ARGB‑componentwaarden (alpha, rood, groen en blauw). Hoewel deze methode een 32‑bit waarde voor elke component toestaat, is de waarde van elke component beperkt tot 8 bits. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Maakt een [T:Aspose::Page::Drawing::Color](../) structuur van de opgegeven [T:Aspose::Page::Drawing::Color](../) structuur, maar met de nieuw opgegeven alfa‑waarde. Hoewel deze methode een 32‑bit waarde voor de alfa‑waarde toestaat, is de waarde beperkt tot 8 bits. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Maakt een [T:Aspose::Page::Drawing::Color](../) structuur van de opgegeven 8‑bit kleurwaarden (rood, groen en blauw). De alfa‑waarde is impliciet 255 (volledig ondoorzichtig). Hoewel deze methode een 32‑bit waarde voor elke kleurcomponent toestaat, is de waarde van elke component beperkt tot 8 bits. |
| static [FromName](./fromname/)(System::String) | Maakt een [T:Aspose::Page::Drawing::Color](../) structuur van de opgegeven naam van een vooraf gedefinieerde kleur. |
| [get_A](./get_a/)() | Haalt de alfa‑componentwaarde van deze [T:Aspose::Page::Drawing::Color](../) structuur op. |
| static [get_AliceBlue](./get_aliceblue/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FFF0F8FF heeft. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FFFAEBD7 heeft. |
| static [get_Aqua](./get_aqua/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FF00FFFF heeft. |
| static [get_Aquamarine](./get_aquamarine/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FF7FFFD4 heeft. |
| static [get_Azure](./get_azure/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FFF0FFFF heeft. |
| [get_B](./get_b/)() | Haalt de blauwe componentwaarde van deze [T:Aspose::Page::Drawing::Color](../) structuur op. |
| static [get_Beige](./get_beige/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FFF5F5DC heeft. |
| static [get_Bisque](./get_bisque/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FFFFE4C4 heeft. |
| static [get_Black](./get_black/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FF000000 heeft. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFFEBCD heeft. |
| static [get_Blue](./get_blue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF0000FF heeft. |
| static [get_BlueViolet](./get_blueviolet/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF8A2BE2 heeft. |
| static [get_Brown](./get_brown/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFA52A2A heeft. |
| static [get_BurlyWood](./get_burlywood/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFDEB887 heeft. |
| static [get_CadetBlue](./get_cadetblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF5F9EA0 heeft. |
| static [get_Chartreuse](./get_chartreuse/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF7FFF00 heeft. |
| static [get_Chocolate](./get_chocolate/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFD2691E heeft. |
| static [get_Coral](./get_coral/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFF7F50 heeft. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF6495ED heeft. |
| static [get_Cornsilk](./get_cornsilk/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFFF8DC heeft. |
| static [get_Crimson](./get_crimson/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFDC143C heeft. |
| static [get_Cyan](./get_cyan/)() | Haalt een systeem‑gedefinieerde kleur op die een ARGB‑waarde van #FF00FFFF heeft. |
| static [get_DarkBlue](./get_darkblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF00008B heeft. |
| static [get_DarkCyan](./get_darkcyan/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF008B8B heeft. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFB8860B heeft. |
| static [get_DarkGray](./get_darkgray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFA9A9A9 heeft. |
| static [get_DarkGreen](./get_darkgreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF006400 heeft. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFBDB76B heeft. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF8B008B heeft. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF556B2F heeft. |
| static [get_DarkOrange](./get_darkorange/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFF8C00 heeft. |
| static [get_DarkOrchid](./get_darkorchid/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF9932CC heeft. |
| static [get_DarkRed](./get_darkred/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF8B0000 heeft. |
| static [get_DarkSalmon](./get_darksalmon/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFE9967A heeft. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF8FBC8F heeft. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF00FF. |
| [get_G](./get_g/)() | Haalt de groene componentwaarde op van deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| static [get_Gainsboro](./get_gainsboro/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFDAA520. |
| static [get_Gray](./get_gray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF808080. |
| static [get_Green](./get_green/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | Specificeert of deze [T:Aspose::Page::Drawing::Color](../) structuur niet is geïnitialiseerd. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Haalt een waarde op die aangeeft of deze [T:Aspose::Page::Drawing::Color](../) structuur een benoemde kleur is of een lid van de [T:System::Drawing::KnownColor](../) enumeratie. |
| static [get_Ivory](./get_ivory/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF32CD32. |
| static [get_Linen](./get_linen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF0000CD heeft. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFBA55D3 heeft. |
| static [get_MediumPurple](./get_mediumpurple/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF9370DB heeft. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF3CB371 heeft. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF7B68EE heeft. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF00FA9A heeft. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF48D1CC heeft. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFC71585 heeft. |
| static [get_MidnightBlue](./get_midnightblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF191970 heeft. |
| static [get_MintCream](./get_mintcream/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFF5FFFA heeft. |
| static [get_MistyRose](./get_mistyrose/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFFE4E1 heeft. |
| static [get_Moccasin](./get_moccasin/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFFE4B5 heeft. |
| [get_Name](./get_name/)() | Haalt de naam van deze [T:Aspose::Page::Drawing::Color](../) op. |
| static [get_NavajoWhite](./get_navajowhite/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFFDEAD heeft. |
| static [get_Navy](./get_navy/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF000080 heeft. |
| static [get_OldLace](./get_oldlace/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FFFDF5E6 heeft. |
| static [get_Olive](./get_olive/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF808000 heeft. |
| static [get_OliveDrab](./get_olivedrab/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde van #FF6B8E23 heeft. |
| static [get_Orange](./get_orange/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFCD853F. |
| static [get_Pink](./get_pink/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF800080. |
| [get_R](./get_r/)() | Haalt de waarde van de rode component op van deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| static [get_Red](./get_red/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFA0522D. |
| static [get_Silver](./get_silver/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF708090. |
| static [get_Snow](./get_snow/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF4682B4. |
| static [get_Tan](./get_tan/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF008080. |
| static [get_Thistle](./get_thistle/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Haalt een systeemgedefinieerde kleur op. |
| static [get_Turquoise](./get_turquoise/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF5DEB3. |
| static [get_White](./get_white/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Haalt een systeemgedefinieerde kleur op die een ARGB-waarde heeft van #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Haalt de helderheidswaarde van hue-saturation-brightness (HSB) op voor deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| [GetHashCode](./gethashcode/)() const override | Retourneert een hashcode voor deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| [GetHue](./gethue/)() | Haalt de hue-waarde van hue-saturation-brightness (HSB), in graden, op voor deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| [GetSaturation](./getsaturation/)() | Haalt de verzadigingswaarde van hue-saturation-brightness (HSB) op voor deze [T:Aspose::Page::Drawing::Color](../) structuur. |
| [ToArgb](./toargb/)() | Haalt de 32-bits ARGB-waarde van deze [T:Aspose::Page::Drawing::Color](../) structuur op. |
| [ToString](./tostring/)() const override | Converteert deze [T:Aspose::Page::Drawing::Color](../) structuur naar een menselijk leesbare tekenreeks. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](./empty/) | Stelt een kleur voor die null is. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
