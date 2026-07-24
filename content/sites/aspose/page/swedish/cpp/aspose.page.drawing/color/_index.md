---
title: "Aspose::Page::Drawing::Color-klass"
linktitle: "Färg"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::Drawing::Color-klass. Representerar en ARGB‑färg (alpha, röd, grön, blå) i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page.drawing/color/
---
## Color class


Representerar en ARGB‑färg (alpha, röd, grön, blå).

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Klonar detta [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Testar om det angivna objektet är en [T:Aspose::Page::Drawing::Color](../) struktur och är ekvivalent med denna [T:Aspose::Page::Drawing::Color](../) struktur. |
| static [FromArgb](./fromargb/)(int32_t) | Skapar en [T:Aspose::Page::Drawing::Color](../) struktur från ett 32‑bitars ARGB‑värde. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Skapar en [T:Aspose::Page::Drawing::Color](../) struktur från de fyra ARGB‑komponenterna (alpha, röd, grön och blå). Även om denna metod tillåter ett 32‑bitars värde för varje komponent, är värdet för varje komponent begränsat till 8 bitar. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Skapar en [T:Aspose::Page::Drawing::Color](../) struktur från den angivna [T:Aspose::Page::Drawing::Color](../) strukturen, men med det nya angivna alfa‑värdet. Även om denna metod tillåter ett 32‑bitars värde för alfa‑värdet, är värdet begränsat till 8 bitar. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Skapar en [T:Aspose::Page::Drawing::Color](../) struktur från de angivna 8‑bitars färgvärdena (röd, grön och blå). Alfa‑värdet är implicit 255 (fullt ogenomskinligt). Även om denna metod tillåter ett 32‑bitars värde för varje färgkomponent, är värdet för varje komponent begränsat till 8 bitar. |
| static [FromName](./fromname/)(System::String) | Skapar en [T:Aspose::Page::Drawing::Color](../) struktur från det angivna namnet på en fördefinierad färg. |
| [get_A](./get_a/)() | Hämtar alfa‑komponentens värde för denna [T:Aspose::Page::Drawing::Color](../) struktur. |
| static [get_AliceBlue](./get_aliceblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF0FFFF. |
| [get_B](./get_b/)() | Hämtar blåkomponentens värde för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| static [get_Beige](./get_beige/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFE4C4. |
| static [get_Black](./get_black/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFD2691E. |
| static [get_Coral](./get_coral/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF00FF. |
| [get_G](./get_g/)() | Hämtar det gröna komponentvärdet för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| static [get_Gainsboro](./get_gainsboro/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFDAA520. |
| static [get_Gray](./get_gray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FF808080. |
| static [get_Green](./get_green/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | Anger om denna [T:Aspose::Page::Drawing::Color](../) struktur är oinitierad. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Hämtar ett värde som indikerar om denna [T:Aspose::Page::Drawing::Color](../) struktur är en namngiven färg eller en medlem av [T:System::Drawing::KnownColor](../)‑enumerationen. |
| static [get_Ivory](./get_ivory/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF32CD32. |
| static [get_Linen](./get_linen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF191970. |
| static [get_MintCream](./get_mintcream/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFE4B5. |
| [get_Name](./get_name/)() | Hämtar namnet på detta [T:Aspose::Page::Drawing::Color](../). |
| static [get_NavajoWhite](./get_navajowhite/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF000080. |
| static [get_OldLace](./get_oldlace/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF6B8E23. |
| static [get_Orange](./get_orange/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFCD853F. |
| static [get_Pink](./get_pink/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF800080. |
| [get_R](./get_r/)() | Hämtar värdet för den röda komponenten i denna [T:Aspose::Page::Drawing::Color](../) struktur. |
| static [get_Red](./get_red/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFA0522D. |
| static [get_Silver](./get_silver/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF708090. |
| static [get_Snow](./get_snow/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF4682B4. |
| static [get_Tan](./get_tan/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF008080. |
| static [get_Thistle](./get_thistle/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Hämtar en systemdefinierad färg. |
| static [get_Turquoise](./get_turquoise/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF5DEB3. |
| static [get_White](./get_white/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Hämtar en systemdefinierad färg som har ett ARGB‑värde på #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Hämtar nyans‑mättnad‑ljus (HSB) ljusstyrkevärdet för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| [GetHashCode](./gethashcode/)() const override | Returnerar en hashkod för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| [GetHue](./gethue/)() | Hämtar nyans‑mättnad‑ljus (HSB) nyansvärdet, i grader, för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| [GetSaturation](./getsaturation/)() | Hämtar nyans‑mättnad‑ljus (HSB) mättnadsvärdet för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| [ToArgb](./toargb/)() | Hämtar det 32‑bitars ARGB‑värdet för detta [T:Aspose::Page::Drawing::Color](../) struktur. |
| [ToString](./tostring/)() const override | Konverterar denna [T:Aspose::Page::Drawing::Color](../) struktur till en människoläsbar sträng. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Empty](./empty/) | Representerar en färg som är null. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
