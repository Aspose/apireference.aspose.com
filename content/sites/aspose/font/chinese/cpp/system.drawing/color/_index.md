---
title: "System::Drawing::Color 类"
linktitle: "Color"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Color 类。表示一种颜色。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 500
url: /zh/cpp/system.drawing/color/
---
## Color class


表示一种颜色。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../../system/smartptr/) 类来管理此类型的对象。

```cpp
class Color
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Color](./color/)() | 构造一个不表示任何颜色的 [Color](./) 类的“空”实例。 |
| [Equals](./equals/)(const Color\&) const | 确定当前 [Color](./) 对象和指定的 [Color](./) 对象是否表示相同的颜色。 |
| static [FromArgb](./fromargb/)(int) | 构造一个表示指定颜色的 [Color](./) 类实例。 |
| static [FromArgb](./fromargb/)(int, int, int, int) | 构造一个表示指定颜色的 [Color](./) 类实例。 |
| static [FromArgb](./fromargb/)(int, int, int) | 构造一个表示指定颜色且 alpha 分量设为 0xFF 的 [Color](./) 类实例。 |
| static [FromArgb](./fromargb/)(int, Color) | 构造一个表示指定颜色的 [Color](./) 类实例。 |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | 构造一个表示指定已知颜色的 [Color](./) 类实例。 |
| static [FromName](./fromname/)(const String\&) | 构造一个表示具有指定名称的颜色的 [Color](./) 类实例。 |
| [get_A](./get_a/)() const | 返回当前对象所表示颜色的 alpha 分量的值。 |
| static [get_AliceBlue](./get_aliceblue/)() | 返回一种颜色，其 ARGB 十六进制表示为 #FFF0F8FF。 |
| static [get_AntiqueWhite](./get_antiquewhite/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF0FFFF. |
| [get_B](./get_b/)() const | 返回当前对象表示的颜色的蓝色分量的值. |
| static [get_Beige](./get_beige/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFE4C4. |
| static [get_Black](./get_black/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFD2691E. |
| static [get_Coral](./get_coral/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFBDB76B。 |
| static [get_DarkMagenta](./get_darkmagenta/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF8B008B。 |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF556B2F。 |
| static [get_DarkOrange](./get_darkorange/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFFF8C00。 |
| static [get_DarkOrchid](./get_darkorchid/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF9932CC。 |
| static [get_DarkRed](./get_darkred/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF8B0000。 |
| static [get_DarkSalmon](./get_darksalmon/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFE9967A。 |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF8FBC8F。 |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF483D8B。 |
| static [get_DarkSlateGray](./get_darkslategray/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF2F4F4F。 |
| static [get_DarkTurquoise](./get_darkturquoise/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF00CED1。 |
| static [get_DarkViolet](./get_darkviolet/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF9400D3。 |
| static [get_DeepPink](./get_deeppink/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFFF1493。 |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF00BFFF。 |
| static [get_DimGray](./get_dimgray/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF696969。 |
| static [get_DodgerBlue](./get_dodgerblue/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF1E90FF。 |
| static [get_Firebrick](./get_firebrick/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFB22222。 |
| static [get_FloralWhite](./get_floralwhite/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFFFFAF0。 |
| static [get_ForestGreen](./get_forestgreen/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FF228B22。 |
| static [get_Fuchsia](./get_fuchsia/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFFF00FF。 |
| [get_G](./get_g/)() const | 返回当前对象表示的颜色的绿色分量的值。 |
| static [get_Gainsboro](./get_gainsboro/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFDCDCDC。 |
| static [get_GhostWhite](./get_ghostwhite/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFF8F8FF。 |
| static [get_Gold](./get_gold/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFFFD700。 |
| static [get_Goldenrod](./get_goldenrod/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFDAA520。 |
| static [get_Gray](./get_gray/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF808080。 |
| static [get_Green](./get_green/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF008000。 |
| static [get_GreenYellow](./get_greenyellow/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFADFF2F。 |
| static [get_Honeydew](./get_honeydew/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF0FFF0。 |
| static [get_HotPink](./get_hotpink/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFF69B4。 |
| static [get_IndianRed](./get_indianred/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFCD5C5C。 |
| static [get_Indigo](./get_indigo/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF4B0082。 |
| [get_IsEmpty](./get_isempty/)() const | 返回一个值，指示当前对象是 "empty"，即不表示任何颜色。 |
| [get_IsNamedColor](./get_isnamedcolor/)() const | 返回一个值，用于确定 [Color](./) 结构是否表示命名颜色或是 [KnownColor](../knowncolor/) 枚举的成员。 |
| static [get_Ivory](./get_ivory/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFFFF0。 |
| static [get_Khaki](./get_khaki/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF0E68C。 |
| static [get_Lavender](./get_lavender/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFE6E6FA。 |
| static [get_LavenderBlush](./get_lavenderblush/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFF0F5。 |
| static [get_LawnGreen](./get_lawngreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF7CFC00。 |
| static [get_LemonChiffon](./get_lemonchiffon/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFFACD。 |
| static [get_LightBlue](./get_lightblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFADD8E6。 |
| static [get_LightCoral](./get_lightcoral/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF08080。 |
| static [get_LightCyan](./get_lightcyan/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFE0FFFF。 |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFAFAD2。 |
| static [get_LightGray](./get_lightgray/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFD3D3D3。 |
| static [get_LightGreen](./get_lightgreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF90EE90。 |
| static [get_LightPink](./get_lightpink/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFB6C1。 |
| static [get_LightSalmon](./get_lightsalmon/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFA07A。 |
| static [get_LightSeaGreen](./get_lightseagreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF20B2AA。 |
| static [get_LightSkyBlue](./get_lightskyblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF87CEFA。 |
| static [get_LightSlateGray](./get_lightslategray/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF32CD32. |
| static [get_Linen](./get_linen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | 返回一个颜色，其 ARGB 值的十六进制表示为 #FFFF00FF。 |
| static [get_Maroon](./get_maroon/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF191970. |
| static [get_MintCream](./get_mintcream/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFE4B5. |
| [get_Name](./get_name/)() const | 返回当前对象表示的颜色的名称。 |
| static [get_NavajoWhite](./get_navajowhite/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF000080. |
| static [get_OldLace](./get_oldlace/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF6B8E23。 |
| static [get_Orange](./get_orange/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFA500。 |
| static [get_OrangeRed](./get_orangered/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFF4500。 |
| static [get_Orchid](./get_orchid/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFDA70D6。 |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFEEE8AA。 |
| static [get_PaleGreen](./get_palegreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF98FB98。 |
| static [get_PaleTurquoise](./get_paleturquoise/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFAFEEEE。 |
| static [get_PaleVioletRed](./get_palevioletred/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFDB7093。 |
| static [get_PapayaWhip](./get_papayawhip/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFEFD5。 |
| static [get_PeachPuff](./get_peachpuff/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFDAB9。 |
| static [get_Peru](./get_peru/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFCD853F。 |
| static [get_Pink](./get_pink/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFC0CB。 |
| static [get_Plum](./get_plum/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFDDA0DD。 |
| static [get_PowderBlue](./get_powderblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFB0E0E6。 |
| static [get_Purple](./get_purple/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF800080。 |
| [get_R](./get_r/)() const | 返回当前对象所表示的颜色的红色分量的值。 |
| static [get_Red](./get_red/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFF0000。 |
| static [get_RosyBrown](./get_rosybrown/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFBC8F8F。 |
| static [get_RoyalBlue](./get_royalblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF4169E1。 |
| static [get_SaddleBrown](./get_saddlebrown/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF8B4513。 |
| static [get_Salmon](./get_salmon/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFA8072。 |
| static [get_SandyBrown](./get_sandybrown/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF4A460。 |
| static [get_SeaGreen](./get_seagreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF2E8B57。 |
| static [get_SeaShell](./get_seashell/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFF5EE。 |
| static [get_Sienna](./get_sienna/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFA0522D。 |
| static [get_Silver](./get_silver/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFC0C0C0。 |
| static [get_SkyBlue](./get_skyblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF87CEEB。 |
| static [get_SlateBlue](./get_slateblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF6A5ACD。 |
| static [get_SlateGray](./get_slategray/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF708090。 |
| static [get_Snow](./get_snow/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFFAFA。 |
| static [get_SpringGreen](./get_springgreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF00FF7F。 |
| static [get_SteelBlue](./get_steelblue/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF4682B4。 |
| static [get_Tan](./get_tan/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFD2B48C。 |
| static [get_Teal](./get_teal/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF008080。 |
| static [get_Thistle](./get_thistle/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFD8BFD8。 |
| static [get_Tomato](./get_tomato/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFF6347。 |
| static [get_Transparent](./get_transparent/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #00FFFFFF。 |
| static [get_Turquoise](./get_turquoise/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF40E0D0。 |
| static [get_Violet](./get_violet/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFEE82EE。 |
| static [get_Wheat](./get_wheat/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF5DEB3。 |
| static [get_White](./get_white/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFFFFF。 |
| static [get_WhiteSmoke](./get_whitesmoke/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFF5F5F5。 |
| static [get_Yellow](./get_yellow/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FFFFFF00。 |
| static [get_YellowGreen](./get_yellowgreen/)() | 返回一种颜色，其 ARGB 值的十六进制表示为 #FF9ACD32。 |
| [GetBrightness](./getbrightness/)() | 返回当前对象表示的颜色的亮度分量。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [GetHue](./gethue/)() | 返回当前对象表示的颜色的色相-饱和度-亮度（HSB）色相值（以度为单位）。 |
| [GetSaturation](./getsaturation/)() | 返回当前对象表示的颜色的色相-饱和度-亮度（HSB）饱和度。 |
| [IsNull](./isnull/)() const | 始终返回 false。 |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | 始终返回 true。 |
| [operator!=](./operator!=/)(const Color\&) const | 确定当前对象和指定的 [Color](./) 对象是否表示不同的颜色。 |
| [operator==](./operator==/)(const std::nullptr_t\&) const | 始终返回 false。 |
| [operator==](./operator==/)(const Color\&) const | 确定当前 [Color](./) 对象和指定的 [Color](./) 对象是否表示相同的颜色。 |
| [ToArgb](./toargb/)() const | 返回当前对象表示的颜色的 32 位 ARGB 值。 |
| [ToString](./tostring/)() const | 返回当前对象的字符串表示形式。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 一个 \"empty\" 实例的 [Color](./) 类，即一个不表示任何颜色的实例。 |
## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
