---
title: "Aspose::Page::Drawing::Color sınıfı"
linktitle: "Renk"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::Drawing::Color sınıfı. C++'ta bir ARGB (alfa, kırmızı, yeşil, mavi) rengi temsil eder."
type: docs
weight: 100
url: /tr/cpp/aspose.page.drawing/color/
---
## Color class


ARGB (alfa, kırmızı, yeşil, mavi) bir rengi temsil eder.

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Bu [Aspose.Page.Drawing.Color](./) nesnesini kopyalar. |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Belirtilen nesnenin bir [T:Aspose::Page::Drawing::Color](../) yapısı olup olmadığını ve bu [T:Aspose::Page::Drawing::Color](../) yapısıyla eşdeğer olup olmadığını test eder. |
| static [FromArgb](./fromargb/)(int32_t) | 32 bitlik bir ARGB değerinden bir [T:Aspose::Page::Drawing::Color](../) yapısı oluşturur. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Dört ARGB bileşeninin (alfa, kırmızı, yeşil ve mavi) değerlerinden bir [T:Aspose::Page::Drawing::Color](../) yapısı oluşturur. Bu yöntem her bileşen için 32 bitlik bir değer geçirmeye izin verse de, her bileşenin değeri 8 bit ile sınırlıdır. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Belirtilen [T:Aspose::Page::Drawing::Color](../) yapısından, yeni belirtilen alfa değeriyle bir [T:Aspose::Page::Drawing::Color](../) yapısı oluşturur. Bu yöntem alfa değeri için 32 bitlik bir değer geçirmeye izin verse de, değer 8 bit ile sınırlıdır. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Belirtilen 8 bitlik renk değerlerinden (kırmızı, yeşil ve mavi) bir [T:Aspose::Page::Drawing::Color](../) yapısı oluşturur. Alfa değeri varsayılan olarak 255'tir (tamamen opak). Bu yöntem her renk bileşeni için 32 bitlik bir değer geçirmeye izin verse de, her bileşenin değeri 8 bit ile sınırlıdır. |
| static [FromName](./fromname/)(System::String) | Önceden tanımlı bir rengin belirtilen adından bir [T:Aspose::Page::Drawing::Color](../) yapısı oluşturur. |
| [get_A](./get_a/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının alfa bileşen değerini alır. |
| static [get_AliceBlue](./get_aliceblue/)() | Sistemin tanımladığı, ARGB değeri #FFF0F8FF olan bir rengi alır. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Sistemin tanımladığı, ARGB değeri #FFFAEBD7 olan bir rengi alır. |
| static [get_Aqua](./get_aqua/)() | Sistemin tanımladığı, ARGB değeri #FF00FFFF olan bir rengi alır. |
| static [get_Aquamarine](./get_aquamarine/)() | Sistemin tanımladığı, ARGB değeri #FF7FFFD4 olan bir rengi alır. |
| static [get_Azure](./get_azure/)() | Sistemin tanımladığı, ARGB değeri #FFF0FFFF olan bir rengi alır. |
| [get_B](./get_b/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının mavi bileşen değerini alır. |
| static [get_Beige](./get_beige/)() | Sistemin tanımladığı, ARGB değeri #FFF5F5DC olan bir rengi alır. |
| static [get_Bisque](./get_bisque/)() | Sistemin tanımladığı, ARGB değeri #FFFFE4C4 olan bir rengi alır. |
| static [get_Black](./get_black/)() | Sistemin tanımladığı, ARGB değeri #FF000000 olan bir rengi alır. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Sistemin tanımladığı, ARGB değeri #FFFFEBCD olan bir rengi alır. |
| static [get_Blue](./get_blue/)() | Sistemin tanımladığı, ARGB değeri #FF0000FF olan bir rengi alır. |
| static [get_BlueViolet](./get_blueviolet/)() | Sistemin tanımladığı, ARGB değeri #FF8A2BE2 olan bir rengi alır. |
| static [get_Brown](./get_brown/)() | Sistemin tanımladığı, ARGB değeri #FFA52A2A olan bir rengi alır. |
| static [get_BurlyWood](./get_burlywood/)() | Sistemin tanımladığı, ARGB değeri #FFDEB887 olan bir rengi alır. |
| static [get_CadetBlue](./get_cadetblue/)() | Sistemin tanımladığı, ARGB değeri #FF5F9EA0 olan bir rengi alır. |
| static [get_Chartreuse](./get_chartreuse/)() | Sistemin tanımladığı, ARGB değeri #FF7FFF00 olan bir rengi alır. |
| static [get_Chocolate](./get_chocolate/)() | Sistemin tanımladığı, ARGB değeri #FFD2691E olan bir rengi alır. |
| static [get_Coral](./get_coral/)() | Sistemin tanımladığı, ARGB değeri #FFFF7F50 olan bir rengi alır. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Sistemin tanımladığı, ARGB değeri #FF6495ED olan bir rengi alır. |
| static [get_Cornsilk](./get_cornsilk/)() | Sistemin tanımladığı, ARGB değeri #FFFFF8DC olan bir rengi alır. |
| static [get_Crimson](./get_crimson/)() | Sistemin tanımladığı, ARGB değeri #FFDC143C olan bir rengi alır. |
| static [get_Cyan](./get_cyan/)() | Sistemin tanımladığı, ARGB değeri #FF00FFFF olan bir rengi alır. |
| static [get_DarkBlue](./get_darkblue/)() | Sistemin tanımladığı, ARGB değeri #FF00008B olan bir rengi alır. |
| static [get_DarkCyan](./get_darkcyan/)() | Sistemin tanımladığı, ARGB değeri #FF008B8B olan bir rengi alır. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Sistemin tanımladığı, ARGB değeri #FFB8860B olan bir rengi alır. |
| static [get_DarkGray](./get_darkgray/)() | Sistemin tanımladığı, ARGB değeri #FFA9A9A9 olan bir rengi alır. |
| static [get_DarkGreen](./get_darkgreen/)() | ARGB değeri #FF006400 olan sistem tanımlı bir rengi alır. |
| static [get_DarkKhaki](./get_darkkhaki/)() | ARGB değeri #FFBDB76B olan sistem tanımlı bir rengi alır. |
| static [get_DarkMagenta](./get_darkmagenta/)() | ARGB değeri #FF8B008B olan sistem tanımlı bir rengi alır. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | ARGB değeri #FF556B2F olan sistem tanımlı bir rengi alır. |
| static [get_DarkOrange](./get_darkorange/)() | ARGB değeri #FFFF8C00 olan sistem tanımlı bir rengi alır. |
| static [get_DarkOrchid](./get_darkorchid/)() | ARGB değeri #FF9932CC olan sistem tanımlı bir rengi alır. |
| static [get_DarkRed](./get_darkred/)() | ARGB değeri #FF8B0000 olan sistem tanımlı bir rengi alır. |
| static [get_DarkSalmon](./get_darksalmon/)() | ARGB değeri #FFE9967A olan sistem tanımlı bir rengi alır. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | ARGB değeri #FF8FBC8F olan sistem tanımlı bir rengi alır. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | ARGB değeri #FF483D8B olan sistem tanımlı bir rengi alır. |
| static [get_DarkSlateGray](./get_darkslategray/)() | ARGB değeri #FF2F4F4F olan sistem tanımlı bir rengi alır. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | ARGB değeri #FF00CED1 olan sistem tanımlı bir rengi alır. |
| static [get_DarkViolet](./get_darkviolet/)() | ARGB değeri #FF9400D3 olan sistem tanımlı bir rengi alır. |
| static [get_DeepPink](./get_deeppink/)() | ARGB değeri #FFFF1493 olan sistem tanımlı bir rengi alır. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | ARGB değeri #FF00BFFF olan sistem tanımlı bir rengi alır. |
| static [get_DimGray](./get_dimgray/)() | ARGB değeri #FF696969 olan sistem tanımlı bir rengi alır. |
| static [get_DodgerBlue](./get_dodgerblue/)() | ARGB değeri #FF1E90FF olan sistem tanımlı bir rengi alır. |
| static [get_Firebrick](./get_firebrick/)() | ARGB değeri #FFB22222 olan sistem tanımlı bir rengi alır. |
| static [get_FloralWhite](./get_floralwhite/)() | ARGB değeri #FFFFFAF0 olan sistem tanımlı bir rengi alır. |
| static [get_ForestGreen](./get_forestgreen/)() | ARGB değeri #FF228B22 olan sistem tanımlı bir rengi alır. |
| static [get_Fuchsia](./get_fuchsia/)() | ARGB değeri #FFFF00FF olan sistem tanımlı bir rengi alır. |
| [get_G](./get_g/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının yeşil bileşen değerini alır. |
| static [get_Gainsboro](./get_gainsboro/)() | ARGB değeri #FFDCDCDC olan sistem tanımlı bir rengi alır. |
| static [get_GhostWhite](./get_ghostwhite/)() | ARGB değeri #FFF8F8FF olan sistem tanımlı bir rengi alır. |
| static [get_Gold](./get_gold/)() | ARGB değeri #FFFFD700 olan sistem tanımlı bir rengi alır. |
| static [get_Goldenrod](./get_goldenrod/)() | Sistem tarafından tanımlanan, ARGB değeri #FFDAA520 olan bir rengi alır. |
| static [get_Gray](./get_gray/)() | Sistem tarafından tanımlanan, ARGB değeri #FF808080 olan bir rengi alır. |
| static [get_Green](./get_green/)() | Sistem tarafından tanımlanan, ARGB değeri #FF008000 olan bir rengi alır. |
| static [get_GreenYellow](./get_greenyellow/)() | Sistem tarafından tanımlanan, ARGB değeri #FFADFF2F olan bir rengi alır. |
| static [get_Honeydew](./get_honeydew/)() | Sistem tarafından tanımlanan, ARGB değeri #FFF0FFF0 olan bir rengi alır. |
| static [get_HotPink](./get_hotpink/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFF69B4 olan bir rengi alır. |
| static [get_IndianRed](./get_indianred/)() | Sistem tarafından tanımlanan, ARGB değeri #FFCD5C5C olan bir rengi alır. |
| static [get_Indigo](./get_indigo/)() | Sistem tarafından tanımlanan, ARGB değeri #FF4B0082 olan bir rengi alır. |
| [get_IsEmpty](./get_isempty/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının başlatılmamış olup olmadığını belirtir. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının adlandırılmış bir renk mi yoksa [T:System::Drawing::KnownColor](../) enumunun bir üyesi mi olduğunu gösteren bir değeri alır. |
| static [get_Ivory](./get_ivory/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFFFFF0 olan bir rengi alır. |
| static [get_Khaki](./get_khaki/)() | Sistem tarafından tanımlanan, ARGB değeri #FFF0E68C olan bir rengi alır. |
| static [get_Lavender](./get_lavender/)() | Sistem tarafından tanımlanan, ARGB değeri #FFE6E6FA olan bir rengi alır. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFFF0F5 olan bir rengi alır. |
| static [get_LawnGreen](./get_lawngreen/)() | Sistem tarafından tanımlanan, ARGB değeri #FF7CFC00 olan bir rengi alır. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFFFACD olan bir rengi alır. |
| static [get_LightBlue](./get_lightblue/)() | Sistem tarafından tanımlanan, ARGB değeri #FFADD8E6 olan bir rengi alır. |
| static [get_LightCoral](./get_lightcoral/)() | Sistem tarafından tanımlanan, ARGB değeri #FFF08080 olan bir rengi alır. |
| static [get_LightCyan](./get_lightcyan/)() | Sistem tarafından tanımlanan, ARGB değeri #FFE0FFFF olan bir rengi alır. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFAFAD2 olan bir rengi alır. |
| static [get_LightGray](./get_lightgray/)() | Sistem tarafından tanımlanan, ARGB değeri #FFD3D3D3 olan bir rengi alır. |
| static [get_LightGreen](./get_lightgreen/)() | Sistem tarafından tanımlanan, ARGB değeri #FF90EE90 olan bir rengi alır. |
| static [get_LightPink](./get_lightpink/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFFB6C1 olan bir rengi alır. |
| static [get_LightSalmon](./get_lightsalmon/)() | Sistem tarafından tanımlanan, ARGB değeri #FFFFA07A olan bir rengi alır. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Sistem tarafından tanımlanan, ARGB değeri #FF20B2AA olan bir rengi alır. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Sistemin tanımladığı ve ARGB değeri #FF87CEFA olan bir rengi alır. |
| static [get_LightSlateGray](./get_lightslategray/)() | Sistemin tanımladığı ve ARGB değeri #FF778899 olan bir rengi alır. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Sistemin tanımladığı ve ARGB değeri #FFB0C4DE olan bir rengi alır. |
| static [get_LightYellow](./get_lightyellow/)() | Sistemin tanımladığı ve ARGB değeri #FFFFFFE0 olan bir rengi alır. |
| static [get_Lime](./get_lime/)() | Sistemin tanımladığı ve ARGB değeri #FF00FF00 olan bir rengi alır. |
| static [get_LimeGreen](./get_limegreen/)() | Sistemin tanımladığı ve ARGB değeri #FF32CD32 olan bir rengi alır. |
| static [get_Linen](./get_linen/)() | Sistemin tanımladığı ve ARGB değeri #FFFAF0E6 olan bir rengi alır. |
| static [get_Magenta](./get_magenta/)() | ARGB değeri #FFFF00FF olan sistem tanımlı bir rengi alır. |
| static [get_Maroon](./get_maroon/)() | Sistemin tanımladığı ve ARGB değeri #FF800000 olan bir rengi alır. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Sistemin tanımladığı ve ARGB değeri #FF66CDAA olan bir rengi alır. |
| static [get_MediumBlue](./get_mediumblue/)() | Sistemin tanımladığı ve ARGB değeri #FF0000CD olan bir rengi alır. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Sistemin tanımladığı ve ARGB değeri #FFBA55D3 olan bir rengi alır. |
| static [get_MediumPurple](./get_mediumpurple/)() | Sistemin tanımladığı ve ARGB değeri #FF9370DB olan bir rengi alır. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Sistemin tanımladığı ve ARGB değeri #FF3CB371 olan bir rengi alır. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Sistemin tanımladığı ve ARGB değeri #FF7B68EE olan bir rengi alır. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Sistemin tanımladığı ve ARGB değeri #FF00FA9A olan bir rengi alır. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Sistemin tanımladığı ve ARGB değeri #FF48D1CC olan bir rengi alır. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Sistemin tanımladığı ve ARGB değeri #FFC71585 olan bir rengi alır. |
| static [get_MidnightBlue](./get_midnightblue/)() | Sistemin tanımladığı ve ARGB değeri #FF191970 olan bir rengi alır. |
| static [get_MintCream](./get_mintcream/)() | Sistemin tanımladığı ve ARGB değeri #FFF5FFFA olan bir rengi alır. |
| static [get_MistyRose](./get_mistyrose/)() | Sistemin tanımladığı ve ARGB değeri #FFFFE4E1 olan bir rengi alır. |
| static [get_Moccasin](./get_moccasin/)() | Sistemin tanımladığı ve ARGB değeri #FFFFE4B5 olan bir rengi alır. |
| [get_Name](./get_name/)() | Bu [T:Aspose::Page::Drawing::Color](../) adını alır. |
| static [get_NavajoWhite](./get_navajowhite/)() | Sistemin tanımladığı ve ARGB değeri #FFFFDEAD olan bir rengi alır. |
| static [get_Navy](./get_navy/)() | Sistemin tanımladığı ve ARGB değeri #FF000080 olan bir rengi alır. |
| static [get_OldLace](./get_oldlace/)() | Sistemin tanımladığı ve ARGB değeri #FFFDF5E6 olan bir rengi alır. |
| static [get_Olive](./get_olive/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF808000 olan bir rengi alır. |
| static [get_OliveDrab](./get_olivedrab/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF6B8E23 olan bir rengi alır. |
| static [get_Orange](./get_orange/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFFA500 olan bir rengi alır. |
| static [get_OrangeRed](./get_orangered/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFF4500 olan bir rengi alır. |
| static [get_Orchid](./get_orchid/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFDA70D6 olan bir rengi alır. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFEEE8AA olan bir rengi alır. |
| static [get_PaleGreen](./get_palegreen/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF98FB98 olan bir rengi alır. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFAFEEEE olan bir rengi alır. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFDB7093 olan bir rengi alır. |
| static [get_PapayaWhip](./get_papayawhip/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFFEFD5 olan bir rengi alır. |
| static [get_PeachPuff](./get_peachpuff/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFFDAB9 olan bir rengi alır. |
| static [get_Peru](./get_peru/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFCD853F olan bir rengi alır. |
| static [get_Pink](./get_pink/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFFC0CB olan bir rengi alır. |
| static [get_Plum](./get_plum/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFDDA0DD olan bir rengi alır. |
| static [get_PowderBlue](./get_powderblue/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFB0E0E6 olan bir rengi alır. |
| static [get_Purple](./get_purple/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF800080 olan bir rengi alır. |
| [get_R](./get_r/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının kırmızı bileşen değerini alır. |
| static [get_Red](./get_red/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFF0000 olan bir rengi alır. |
| static [get_RosyBrown](./get_rosybrown/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFBC8F8F olan bir rengi alır. |
| static [get_RoyalBlue](./get_royalblue/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF4169E1 olan bir rengi alır. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF8B4513 olan bir rengi alır. |
| static [get_Salmon](./get_salmon/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFA8072 olan bir rengi alır. |
| static [get_SandyBrown](./get_sandybrown/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFF4A460 olan bir rengi alır. |
| static [get_SeaGreen](./get_seagreen/)() | Sistem tarafından tanımlanan ve ARGB değeri #FF2E8B57 olan bir rengi alır. |
| static [get_SeaShell](./get_seashell/)() | Sistem tarafından tanımlanan ve ARGB değeri #FFFFF5EE olan bir rengi alır. |
| static [get_Sienna](./get_sienna/)() | ARGB değeri #FFA0522D olan sistem tanımlı bir rengi alır. |
| static [get_Silver](./get_silver/)() | ARGB değeri #FFC0C0C0 olan sistem tanımlı bir rengi alır. |
| static [get_SkyBlue](./get_skyblue/)() | ARGB değeri #FF87CEEB olan sistem tanımlı bir rengi alır. |
| static [get_SlateBlue](./get_slateblue/)() | ARGB değeri #FF6A5ACD olan sistem tanımlı bir rengi alır. |
| static [get_SlateGray](./get_slategray/)() | ARGB değeri #FF708090 olan sistem tanımlı bir rengi alır. |
| static [get_Snow](./get_snow/)() | ARGB değeri #FFFFFAFA olan sistem tanımlı bir rengi alır. |
| static [get_SpringGreen](./get_springgreen/)() | ARGB değeri #FF00FF7F olan sistem tanımlı bir rengi alır. |
| static [get_SteelBlue](./get_steelblue/)() | ARGB değeri #FF4682B4 olan sistem tanımlı bir rengi alır. |
| static [get_Tan](./get_tan/)() | ARGB değeri #FFD2B48C olan sistem tanımlı bir rengi alır. |
| static [get_Teal](./get_teal/)() | ARGB değeri #FF008080 olan sistem tanımlı bir rengi alır. |
| static [get_Thistle](./get_thistle/)() | ARGB değeri #FFD8BFD8 olan sistem tanımlı bir rengi alır. |
| static [get_Tomato](./get_tomato/)() | ARGB değeri #FFFF6347 olan sistem tanımlı bir rengi alır. |
| static [get_Transparent](./get_transparent/)() | Sistem tanımlı bir rengi alır. |
| static [get_Turquoise](./get_turquoise/)() | ARGB değeri #FF40E0D0 olan sistem tanımlı bir rengi alır. |
| static [get_Violet](./get_violet/)() | ARGB değeri #FFEE82EE olan sistem tanımlı bir rengi alır. |
| static [get_Wheat](./get_wheat/)() | ARGB değeri #FFF5DEB3 olan sistem tanımlı bir rengi alır. |
| static [get_White](./get_white/)() | ARGB değeri #FFFFFFFF olan sistem tanımlı bir rengi alır. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | ARGB değeri #FFF5F5F5 olan sistem tanımlı bir rengi alır. |
| static [get_Yellow](./get_yellow/)() | ARGB değeri #FFFFFF00 olan sistem tanımlı bir rengi alır. |
| static [get_YellowGreen](./get_yellowgreen/)() | ARGB değeri #FF9ACD32 olan sistem tanımlı bir rengi alır. |
| [GetBrightness](./getbrightness/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısı için hue-saturation-brightness (HSB) parlaklık değerini alır. |
| [GetHashCode](./gethashcode/)() const override | Bu [T:Aspose::Page::Drawing::Color](../) yapısı için bir hash kodu döndürür. |
| [GetHue](./gethue/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısı için hue-saturation-brightness (HSB) ton değerini derece cinsinden alır. |
| [GetSaturation](./getsaturation/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısı için hue-saturation-brightness (HSB) doygunluk değerini alır. |
| [ToArgb](./toargb/)() | Bu [T:Aspose::Page::Drawing::Color](../) yapısının 32-bit ARGB değerini alır. |
| [ToString](./tostring/)() const override | Bu [T:Aspose::Page::Drawing::Color](../) yapısını okunabilir bir dizeye dönüştürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Null olan bir rengi temsil eder. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
