---
title: "System::Drawing::Color class"
linktitle: "Renk"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Color sınıfı. Bir rengi temsil eder. Bu tip yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'de bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 500
url: /tr/cpp/system.drawing/color/
---
## Color class


Bir rengi temsil eder. Bu tip yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../../system/smartptr/) sınıfını asla kullanmayın.

```cpp
class Color
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Color](./color/)() | Bir "boş" [Color](./) sınıf örneği oluşturur ve bu örnek herhangi bir rengi temsil etmez. |
| [Equals](./equals/)(const Color\&) const | Mevcut ve belirtilen [Color](./) nesnelerinin aynı rengi temsil edip etmediğini belirler. |
| static [FromArgb](./fromargb/)(int) | Belirtilen rengi temsil eden bir [Color](./) sınıf örneği oluşturur. |
| static [FromArgb](./fromargb/)(int, int, int, int) | Belirtilen rengi temsil eden bir [Color](./) sınıf örneği oluşturur. |
| static [FromArgb](./fromargb/)(int, int, int) | Alfa bileşeni 0xFF olarak ayarlanmış belirtilen rengi temsil eden bir [Color](./) sınıf örneği oluşturur. |
| static [FromArgb](./fromargb/)(int, Color) | Belirtilen rengi temsil eden bir [Color](./) sınıf örneği oluşturur. |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | Belirtilen bilinen rengi temsil eden bir [Color](./) sınıf örneği oluşturur. |
| static [FromName](./fromname/)(const String\&) | Belirtilen isimdeki bir rengi temsil eden bir [Color](./) sınıf örneği oluşturur. |
| [get_A](./get_a/)() const | Mevcut nesne tarafından temsil edilen rengin alfa bileşeninin değerini döndürür. |
| static [get_AliceBlue](./get_aliceblue/)() | ARGB değeri onaltılık gösterimde #FFF0F8FF olan bir rengi döndürür. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | ARGB değeri onaltılık gösterimde #FFFAEBD7 olan bir rengi döndürür. |
| static [get_Aqua](./get_aqua/)() | ARGB değeri onaltılık gösterimde #FF00FFFF olan bir rengi döndürür. |
| static [get_Aquamarine](./get_aquamarine/)() | ARGB değeri onaltılık gösterimde #FF7FFFD4 olan bir rengi döndürür. |
| static [get_Azure](./get_azure/)() | ARGB değeri onaltılık gösterimde #FFF0FFFF olan bir rengi döndürür. |
| [get_B](./get_b/)() const | Geçerli nesne tarafından temsil edilen rengin mavi bileşeninin değerini döndürür. |
| static [get_Beige](./get_beige/)() | ARGB değeri onaltılık gösterimde #FFF5F5DC olan bir rengi döndürür. |
| static [get_Bisque](./get_bisque/)() | ARGB değeri onaltılık gösterimde #FFFFE4C4 olan bir rengi döndürür. |
| static [get_Black](./get_black/)() | ARGB değeri onaltılık gösterimde #FF000000 olan bir rengi döndürür. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | ARGB değeri onaltılık gösterimde #FFFFEBCD olan bir rengi döndürür. |
| static [get_Blue](./get_blue/)() | ARGB değeri onaltılık gösterimde #FF0000FF olan bir rengi döndürür. |
| static [get_BlueViolet](./get_blueviolet/)() | ARGB değeri onaltılık gösterimde #FF8A2BE2 olan bir rengi döndürür. |
| static [get_Brown](./get_brown/)() | ARGB değeri onaltılık gösterimde #FFA52A2A olan bir rengi döndürür. |
| static [get_BurlyWood](./get_burlywood/)() | ARGB değeri onaltılık gösterimde #FFDEB887 olan bir rengi döndürür. |
| static [get_CadetBlue](./get_cadetblue/)() | ARGB değeri onaltılık gösterimde #FF5F9EA0 olan bir rengi döndürür. |
| static [get_Chartreuse](./get_chartreuse/)() | ARGB değeri onaltılık gösterimde #FF7FFF00 olan bir rengi döndürür. |
| static [get_Chocolate](./get_chocolate/)() | ARGB değeri onaltılık gösterimde #FFD2691E olan bir rengi döndürür. |
| static [get_Coral](./get_coral/)() | ARGB değeri onaltılık gösterimde #FFFF7F50 olan bir rengi döndürür. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | ARGB değeri onaltılık gösterimde #FF6495ED olan bir rengi döndürür. |
| static [get_Cornsilk](./get_cornsilk/)() | ARGB değeri onaltılık gösterimde #FFFFF8DC olan bir rengi döndürür. |
| static [get_Crimson](./get_crimson/)() | ARGB değeri onaltılık gösterimde #FFDC143C olan bir rengi döndürür. |
| static [get_Cyan](./get_cyan/)() | ARGB değeri onaltılık gösterimde #FF00FFFF olan bir rengi döndürür. |
| static [get_DarkBlue](./get_darkblue/)() | ARGB değeri onaltılık gösterimde #FF00008B olan bir rengi döndürür. |
| static [get_DarkCyan](./get_darkcyan/)() | ARGB değeri onaltılık gösterimde #FF008B8B olan bir rengi döndürür. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | ARGB değeri onaltılık gösterimde #FFB8860B olan bir rengi döndürür. |
| static [get_DarkGray](./get_darkgray/)() | ARGB değeri onaltılık gösterimde #FFA9A9A9 olan bir rengi döndürür. |
| static [get_DarkGreen](./get_darkgreen/)() | ARGB değeri onaltılık gösterimde #FF006400 olan bir rengi döndürür. |
| static [get_DarkKhaki](./get_darkkhaki/)() | ARGB değeri onaltılık gösterimde #FFBDB76B olan bir rengi döndürür. |
| static [get_DarkMagenta](./get_darkmagenta/)() | ARGB değeri onaltılık gösterimde #FF8B008B olan bir rengi döndürür. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | ARGB değeri onaltılık gösterimde #FF556B2F olan bir rengi döndürür. |
| static [get_DarkOrange](./get_darkorange/)() | ARGB değeri onaltılık gösterimde #FFFF8C00 olan bir rengi döndürür. |
| static [get_DarkOrchid](./get_darkorchid/)() | ARGB değeri onaltılık gösterimde #FF9932CC olan bir rengi döndürür. |
| static [get_DarkRed](./get_darkred/)() | ARGB değeri onaltılık gösterimde #FF8B0000 olan bir rengi döndürür. |
| static [get_DarkSalmon](./get_darksalmon/)() | ARGB değeri onaltılık gösterimde #FFE9967A olan bir rengi döndürür. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | ARGB değeri onaltılık gösterimde #FF8FBC8F olan bir rengi döndürür. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | ARGB değeri onaltılık gösterimde #FF483D8B olan bir rengi döndürür. |
| static [get_DarkSlateGray](./get_darkslategray/)() | ARGB değeri onaltılık gösterimde #FF2F4F4F olan bir rengi döndürür. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | ARGB değeri onaltılık gösterimde #FF00CED1 olan bir rengi döndürür. |
| static [get_DarkViolet](./get_darkviolet/)() | ARGB değeri onaltılık gösterimde #FF9400D3 olan bir rengi döndürür. |
| static [get_DeepPink](./get_deeppink/)() | ARGB değeri onaltılık gösterimde #FFFF1493 olan bir rengi döndürür. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | ARGB değeri onaltılık gösterimde #FF00BFFF olan bir rengi döndürür. |
| static [get_DimGray](./get_dimgray/)() | ARGB değeri onaltılık gösterimde #FF696969 olan bir rengi döndürür. |
| static [get_DodgerBlue](./get_dodgerblue/)() | ARGB değeri onaltılık gösterimde #FF1E90FF olan bir rengi döndürür. |
| static [get_Firebrick](./get_firebrick/)() | ARGB değeri onaltılık gösterimde #FFB22222 olan bir rengi döndürür. |
| static [get_FloralWhite](./get_floralwhite/)() | ARGB değeri onaltılık gösterimde #FFFFFAF0 olan bir rengi döndürür. |
| static [get_ForestGreen](./get_forestgreen/)() | ARGB değeri onaltılık gösterimde #FF228B22 olan bir rengi döndürür. |
| static [get_Fuchsia](./get_fuchsia/)() | ARGB değeri onaltılık gösterimde #FFFF00FF olan bir rengi döndürür. |
| [get_G](./get_g/)() const | Geçerli nesne tarafından temsil edilen rengin yeşil bileşeninin değerini döndürür. |
| static [get_Gainsboro](./get_gainsboro/)() | ARGB değeri onaltılık gösterimde #FFDCDCDC olan bir rengi döndürür. |
| static [get_GhostWhite](./get_ghostwhite/)() | ARGB değeri onaltılık gösterimde #FFF8F8FF olan bir rengi döndürür. |
| static [get_Gold](./get_gold/)() | ARGB değeri onaltılık gösterimde #FFFFD700 olan bir rengi döndürür. |
| static [get_Goldenrod](./get_goldenrod/)() | ARGB değeri onaltılık gösterimde #FFDAA520 olan bir rengi döndürür. |
| static [get_Gray](./get_gray/)() | ARGB değeri onaltılık gösterimde #FF808080 olan bir rengi döndürür. |
| static [get_Green](./get_green/)() | ARGB değeri onaltılık gösterimde #FF008000 olan bir rengi döndürür. |
| static [get_GreenYellow](./get_greenyellow/)() | ARGB değeri onaltılık gösterimde #FFADFF2F olan bir rengi döndürür. |
| static [get_Honeydew](./get_honeydew/)() | ARGB değeri onaltılık gösterimde #FFF0FFF0 olan bir rengi döndürür. |
| static [get_HotPink](./get_hotpink/)() | ARGB değeri onaltılık gösterimde #FFFF69B4 olan bir rengi döndürür. |
| static [get_IndianRed](./get_indianred/)() | ARGB değeri onaltılık gösterimde #FFCD5C5C olan bir rengi döndürür. |
| static [get_Indigo](./get_indigo/)() | ARGB değeri onaltılık gösterimde #FF4B0082 olan bir rengi döndürür. |
| [get_IsEmpty](./get_isempty/)() const | Geçerli nesnenin "empty" olup olmadığını, yani herhangi bir rengi temsil etmediğini gösteren bir değer döndürür. |
| [get_IsNamedColor](./get_isnamedcolor/)() const | Bir değer döndürür; bu değer, [Color](./) yapısının adlandırılmış bir rengi mi yoksa [KnownColor](../knowncolor/) enum üyesi mi olduğunu belirler. |
| static [get_Ivory](./get_ivory/)() | ARGB değeri onaltılık gösterimde #FFFFFFF0 olan bir rengi döndürür. |
| static [get_Khaki](./get_khaki/)() | ARGB değeri onaltılık gösterimde #FFF0E68C olan bir rengi döndürür. |
| static [get_Lavender](./get_lavender/)() | ARGB değeri onaltılık gösterimde #FFE6E6FA olan bir rengi döndürür. |
| static [get_LavenderBlush](./get_lavenderblush/)() | ARGB değeri onaltılık gösterimde #FFFFF0F5 olan bir rengi döndürür. |
| static [get_LawnGreen](./get_lawngreen/)() | ARGB değeri onaltılık gösterimde #FF7CFC00 olan bir rengi döndürür. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | ARGB değeri onaltılık gösterimde #FFFFFACD olan bir rengi döndürür. |
| static [get_LightBlue](./get_lightblue/)() | ARGB değeri onaltılık gösterimde #FFADD8E6 olan bir rengi döndürür. |
| static [get_LightCoral](./get_lightcoral/)() | ARGB değeri onaltılık gösterimde #FFF08080 olan bir rengi döndürür. |
| static [get_LightCyan](./get_lightcyan/)() | ARGB değeri onaltılık gösterimde #FFE0FFFF olan bir rengi döndürür. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | ARGB değeri onaltılık gösterimde #FFFAFAD2 olan bir rengi döndürür. |
| static [get_LightGray](./get_lightgray/)() | ARGB değeri onaltılık gösterimde #FFD3D3D3 olan bir rengi döndürür. |
| static [get_LightGreen](./get_lightgreen/)() | ARGB değeri onaltılık gösterimde #FF90EE90 olan bir rengi döndürür. |
| static [get_LightPink](./get_lightpink/)() | ARGB değeri onaltılık gösterimde #FFFFB6C1 olan bir rengi döndürür. |
| static [get_LightSalmon](./get_lightsalmon/)() | ARGB değeri onaltılık gösterimde #FFFFA07A olan bir rengi döndürür. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | ARGB değeri onaltılık gösterimde #FF20B2AA olan bir rengi döndürür. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | ARGB değeri onaltılık gösterimde #FF87CEFA olan bir rengi döndürür. |
| static [get_LightSlateGray](./get_lightslategray/)() | ARGB değeri onaltılık gösterimde #FF778899 olan bir rengi döndürür. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | ARGB değeri onaltılık gösterimde #FFB0C4DE olan bir rengi döndürür. |
| static [get_LightYellow](./get_lightyellow/)() | ARGB değeri onaltılık gösterimde #FFFFFFE0 olan bir rengi döndürür. |
| static [get_Lime](./get_lime/)() | ARGB değeri onaltılık gösterimde #FF00FF00 olan bir rengi döndürür. |
| static [get_LimeGreen](./get_limegreen/)() | ARGB değeri onaltılık gösterimde #FF32CD32 olan bir rengi döndürür. |
| static [get_Linen](./get_linen/)() | ARGB değeri onaltılık gösterimde #FFFAF0E6 olan bir rengi döndürür. |
| static [get_Magenta](./get_magenta/)() | ARGB değeri onaltılık gösterimde #FFFF00FF olan bir rengi döndürür. |
| static [get_Maroon](./get_maroon/)() | ARGB değeri onaltılık gösterimde #FF800000 olan bir rengi döndürür. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | ARGB değeri onaltılık gösterimde #FF66CDAA olan bir rengi döndürür. |
| static [get_MediumBlue](./get_mediumblue/)() | ARGB değeri onaltılık gösterimde #FF0000CD olan bir rengi döndürür. |
| static [get_MediumOrchid](./get_mediumorchid/)() | ARGB değeri onaltılık gösterimde #FFBA55D3 olan bir rengi döndürür. |
| static [get_MediumPurple](./get_mediumpurple/)() | ARGB değeri onaltılık gösterimde #FF9370DB olan bir rengi döndürür. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | ARGB değeri onaltılık gösterimde #FF3CB371 olan bir rengi döndürür. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | ARGB değeri onaltılık gösterimde #FF7B68EE olan bir rengi döndürür. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | ARGB değeri onaltılık gösterimde #FF00FA9A olan bir rengi döndürür. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | ARGB değeri onaltılık gösterimde #FF48D1CC olan bir rengi döndürür. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | ARGB değeri onaltılık gösterimde #FFC71585 olan bir rengi döndürür. |
| static [get_MidnightBlue](./get_midnightblue/)() | ARGB değeri onaltılık gösterimde #FF191970 olan bir rengi döndürür. |
| static [get_MintCream](./get_mintcream/)() | ARGB değeri onaltılık gösterimde #FFF5FFFA olan bir rengi döndürür. |
| static [get_MistyRose](./get_mistyrose/)() | ARGB değeri onaltılık gösterimde #FFFFE4E1 olan bir rengi döndürür. |
| static [get_Moccasin](./get_moccasin/)() | ARGB değeri onaltılık gösterimde #FFFFE4B5 olan bir rengi döndürür. |
| [get_Name](./get_name/)() const | Geçerli nesne tarafından temsil edilen rengin adını döndürür. |
| static [get_NavajoWhite](./get_navajowhite/)() | ARGB değeri onaltılık gösterimde #FFFFDEAD olan bir rengi döndürür. |
| static [get_Navy](./get_navy/)() | ARGB değeri onaltılık gösterimde #FF000080 olan bir rengi döndürür. |
| static [get_OldLace](./get_oldlace/)() | ARGB değeri onaltılık gösterimde #FFFDF5E6 olan bir rengi döndürür. |
| static [get_Olive](./get_olive/)() | ARGB değeri onaltılık gösterimde #FF808000 olan bir rengi döndürür. |
| static [get_OliveDrab](./get_olivedrab/)() | Hexadecimal gösterimde ARGB değeri #FF6B8E23 olan bir rengi döndürür. |
| static [get_Orange](./get_orange/)() | Hexadecimal gösterimde ARGB değeri #FFFFA500 olan bir rengi döndürür. |
| static [get_OrangeRed](./get_orangered/)() | Hexadecimal gösterimde ARGB değeri #FFFF4500 olan bir rengi döndürür. |
| static [get_Orchid](./get_orchid/)() | Hexadecimal gösterimde ARGB değeri #FFDA70D6 olan bir rengi döndürür. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Hexadecimal gösterimde ARGB değeri #FFEEE8AA olan bir rengi döndürür. |
| static [get_PaleGreen](./get_palegreen/)() | Hexadecimal gösterimde ARGB değeri #FF98FB98 olan bir rengi döndürür. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Hexadecimal gösterimde ARGB değeri #FFAFEEEE olan bir rengi döndürür. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Hexadecimal gösterimde ARGB değeri #FFDB7093 olan bir rengi döndürür. |
| static [get_PapayaWhip](./get_papayawhip/)() | Hexadecimal gösterimde ARGB değeri #FFFFEFD5 olan bir rengi döndürür. |
| static [get_PeachPuff](./get_peachpuff/)() | Hexadecimal gösterimde ARGB değeri #FFFFDAB9 olan bir rengi döndürür. |
| static [get_Peru](./get_peru/)() | Hexadecimal gösterimde ARGB değeri #FFCD853F olan bir rengi döndürür. |
| static [get_Pink](./get_pink/)() | Hexadecimal gösterimde ARGB değeri #FFFFC0CB olan bir rengi döndürür. |
| static [get_Plum](./get_plum/)() | Hexadecimal gösterimde ARGB değeri #FFDDA0DD olan bir rengi döndürür. |
| static [get_PowderBlue](./get_powderblue/)() | Hexadecimal gösterimde ARGB değeri #FFB0E0E6 olan bir rengi döndürür. |
| static [get_Purple](./get_purple/)() | Hexadecimal gösterimde ARGB değeri #FF800080 olan bir rengi döndürür. |
| [get_R](./get_r/)() const | Geçerli nesne tarafından temsil edilen rengin kırmızı bileşeninin değerini döndürür. |
| static [get_Red](./get_red/)() | Hexadecimal gösterimde ARGB değeri #FFFF0000 olan bir rengi döndürür. |
| static [get_RosyBrown](./get_rosybrown/)() | Hexadecimal gösterimde ARGB değeri #FFBC8F8F olan bir rengi döndürür. |
| static [get_RoyalBlue](./get_royalblue/)() | Hexadecimal gösterimde ARGB değeri #FF4169E1 olan bir rengi döndürür. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Hexadecimal gösterimde ARGB değeri #FF8B4513 olan bir rengi döndürür. |
| static [get_Salmon](./get_salmon/)() | Hexadecimal gösterimde ARGB değeri #FFFA8072 olan bir rengi döndürür. |
| static [get_SandyBrown](./get_sandybrown/)() | Hexadecimal gösterimde ARGB değeri #FFF4A460 olan bir rengi döndürür. |
| static [get_SeaGreen](./get_seagreen/)() | Hexadecimal gösterimde ARGB değeri #FF2E8B57 olan bir rengi döndürür. |
| static [get_SeaShell](./get_seashell/)() | Hexadecimal gösterimde ARGB değeri #FFFFF5EE olan bir rengi döndürür. |
| static [get_Sienna](./get_sienna/)() | Hexadecimal gösterimde ARGB değeri #FFA0522D olan bir rengi döndürür. |
| static [get_Silver](./get_silver/)() | ARGB değeri onaltılık gösterimde #FFC0C0C0 olan bir renk döndürür. |
| static [get_SkyBlue](./get_skyblue/)() | ARGB değeri onaltılık gösterimde #FF87CEEB olan bir renk döndürür. |
| static [get_SlateBlue](./get_slateblue/)() | ARGB değeri onaltılık gösterimde #FF6A5ACD olan bir renk döndürür. |
| static [get_SlateGray](./get_slategray/)() | ARGB değeri onaltılık gösterimde #FF708090 olan bir renk döndürür. |
| static [get_Snow](./get_snow/)() | ARGB değeri onaltılık gösterimde #FFFFFAFA olan bir renk döndürür. |
| static [get_SpringGreen](./get_springgreen/)() | ARGB değeri onaltılık gösterimde #FF00FF7F olan bir renk döndürür. |
| static [get_SteelBlue](./get_steelblue/)() | ARGB değeri onaltılık gösterimde #FF4682B4 olan bir renk döndürür. |
| static [get_Tan](./get_tan/)() | ARGB değeri onaltılık gösterimde #FFD2B48C olan bir renk döndürür. |
| static [get_Teal](./get_teal/)() | ARGB değeri onaltılık gösterimde #FF008080 olan bir renk döndürür. |
| static [get_Thistle](./get_thistle/)() | ARGB değeri onaltılık gösterimde #FFD8BFD8 olan bir renk döndürür. |
| static [get_Tomato](./get_tomato/)() | ARGB değeri onaltılık gösterimde #FFFF6347 olan bir renk döndürür. |
| static [get_Transparent](./get_transparent/)() | ARGB değeri onaltılık gösterimde #00FFFFFF olan bir renk döndürür. |
| static [get_Turquoise](./get_turquoise/)() | ARGB değeri onaltılık gösterimde #FF40E0D0 olan bir renk döndürür. |
| static [get_Violet](./get_violet/)() | ARGB değeri onaltılık gösterimde #FFEE82EE olan bir renk döndürür. |
| static [get_Wheat](./get_wheat/)() | ARGB değeri onaltılık gösterimde #FFF5DEB3 olan bir renk döndürür. |
| static [get_White](./get_white/)() | ARGB değeri onaltılık gösterimde #FFFFFFFF olan bir renk döndürür. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | ARGB değeri onaltılık gösterimde #FFF5F5F5 olan bir renk döndürür. |
| static [get_Yellow](./get_yellow/)() | ARGB değeri onaltılık gösterimde #FFFFFF00 olan bir renk döndürür. |
| static [get_YellowGreen](./get_yellowgreen/)() | ARGB değeri onaltılık gösterimde #FF9ACD32 olan bir renk döndürür. |
| [GetBrightness](./getbrightness/)() | Geçerli nesne tarafından temsil edilen rengin parlaklık bileşenini döndürür. |
| [GetHashCode](./gethashcode/)() const | Geçerli nesnenin karma kodunu döndürür. |
| [GetHue](./gethue/)() | Geçerli nesne tarafından temsil edilen rengin Hue-Saturation-Brightness (HSB) ton değerini, derece cinsinden döndürür. |
| [GetSaturation](./getsaturation/)() | Geçerli nesne tarafından temsil edilen rengin Hue-Saturation-Brightness (HSB) doygunluğunu döndürür. |
| [IsNull](./isnull/)() const | Her zaman false döndürür. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Her zaman true döndürür. |
| [operator!=](./operator!=/)(const Color\&) const | Geçerli ve belirtilen [Color](./) nesnelerinin farklı renkleri temsil edip etmediğini belirler. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Her zaman false döndürür. |
| [operator==](./operator==/)(const Color\&) const | Mevcut ve belirtilen [Color](./) nesnelerinin aynı rengi temsil edip etmediğini belirler. |
| [ToArgb](./toargb/)() const | Geçerli nesne tarafından temsil edilen rengin 32-bit ARGB değerini döndürür. |
| [ToString](./tostring/)() const | Geçerli nesnenin string temsilini döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Bir "empty" [Color](./) sınıfı örneği, yani herhangi bir rengi temsil etmeyen bir örnek. |
## Ayrıca Bakınız

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
