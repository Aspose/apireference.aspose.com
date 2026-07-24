---
title: "Aspose::Page::Drawing::Color 类"
linktitle: "Color"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Drawing::Color 类。表示 C++ 中的 ARGB（alpha、red、green、blue）颜色。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.drawing/color/
---
## Color class


表示 ARGB（alpha、red、green、blue）颜色。

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 克隆此 [Aspose.Page.Drawing.Color](./)。 |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 测试指定的对象是否为 [T:Aspose::Page::Drawing::Color](../) 结构且等价于此 [T:Aspose::Page::Drawing::Color](../) 结构。 |
| static [FromArgb](./fromargb/)(int32_t) | 从 32 位 ARGB 值创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。 |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | 从四个 ARGB 分量（alpha、red、green 和 blue）值创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。虽然此方法允许为每个分量传入 32 位值，但每个分量的值限制为 8 位。 |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | 从指定的 [T:Aspose::Page::Drawing::Color](../) 结构创建一个 [T:Aspose::Page::Drawing::Color](../) 结构，但使用新的指定 alpha 值。虽然此方法允许为 alpha 值传入 32 位值，但该值限制为 8 位。 |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | 从指定的 8 位颜色值（red、green、blue）创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。alpha 值隐式为 255（完全不透明）。虽然此方法允许为每个颜色分量传入 32 位值，但每个分量的值限制为 8 位。 |
| static [FromName](./fromname/)(System::String) | 从指定的预定义颜色名称创建一个 [T:Aspose::Page::Drawing::Color](../) 结构。 |
| [get_A](./get_a/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的 alpha 分量值。 |
| static [get_AliceBlue](./get_aliceblue/)() | 获取具有 ARGB 值 #FFF0F8FF 的系统定义颜色。 |
| static [get_AntiqueWhite](./get_antiquewhite/)() | 获取具有 ARGB 值 #FFFAEBD7 的系统定义颜色。 |
| static [get_Aqua](./get_aqua/)() | 获取具有 ARGB 值 #FF00FFFF 的系统定义颜色。 |
| static [get_Aquamarine](./get_aquamarine/)() | 获取具有 ARGB 值 #FF7FFFD4 的系统定义颜色。 |
| static [get_Azure](./get_azure/)() | 获取具有 ARGB 值 #FFF0FFFF 的系统定义颜色。 |
| [get_B](./get_b/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的蓝色分量值。 |
| static [get_Beige](./get_beige/)() | 获取具有 ARGB 值 #FFF5F5DC 的系统定义颜色。 |
| static [get_Bisque](./get_bisque/)() | 获取具有 ARGB 值 #FFFFE4C4 的系统定义颜色。 |
| static [get_Black](./get_black/)() | 获取具有 ARGB 值 #FF000000 的系统定义颜色。 |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | 获取具有 ARGB 值 #FFFFEBCD 的系统定义颜色。 |
| static [get_Blue](./get_blue/)() | 获取具有 ARGB 值 #FF0000FF 的系统定义颜色。 |
| static [get_BlueViolet](./get_blueviolet/)() | 获取具有 ARGB 值 #FF8A2BE2 的系统定义颜色。 |
| static [get_Brown](./get_brown/)() | 获取具有 ARGB 值 #FFA52A2A 的系统定义颜色。 |
| static [get_BurlyWood](./get_burlywood/)() | 获取具有 ARGB 值 #FFDEB887 的系统定义颜色。 |
| static [get_CadetBlue](./get_cadetblue/)() | 获取具有 ARGB 值 #FF5F9EA0 的系统定义颜色。 |
| static [get_Chartreuse](./get_chartreuse/)() | 获取具有 ARGB 值 #FF7FFF00 的系统定义颜色。 |
| static [get_Chocolate](./get_chocolate/)() | 获取具有 ARGB 值 #FFD2691E 的系统定义颜色。 |
| static [get_Coral](./get_coral/)() | 获取具有 ARGB 值 #FFFF7F50 的系统定义颜色。 |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | 获取具有 ARGB 值 #FF6495ED 的系统定义颜色。 |
| static [get_Cornsilk](./get_cornsilk/)() | 获取具有 ARGB 值 #FFFFF8DC 的系统定义颜色。 |
| static [get_Crimson](./get_crimson/)() | 获取具有 ARGB 值 #FFDC143C 的系统定义颜色。 |
| static [get_Cyan](./get_cyan/)() | 获取具有 ARGB 值 #FF00FFFF 的系统定义颜色。 |
| static [get_DarkBlue](./get_darkblue/)() | 获取具有 ARGB 值 #FF00008B 的系统定义颜色。 |
| static [get_DarkCyan](./get_darkcyan/)() | 获取具有 ARGB 值 #FF008B8B 的系统定义颜色。 |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | 获取具有 ARGB 值 #FFB8860B 的系统定义颜色。 |
| static [get_DarkGray](./get_darkgray/)() | 获取具有 ARGB 值 #FFA9A9A9 的系统定义颜色。 |
| static [get_DarkGreen](./get_darkgreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF006400。 |
| static [get_DarkKhaki](./get_darkkhaki/)() | 获取系统定义的颜色，其 ARGB 值为 #FFBDB76B。 |
| static [get_DarkMagenta](./get_darkmagenta/)() | 获取系统定义的颜色，其 ARGB 值为 #FF8B008B。 |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF556B2F。 |
| static [get_DarkOrange](./get_darkorange/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF8C00。 |
| static [get_DarkOrchid](./get_darkorchid/)() | 获取系统定义的颜色，其 ARGB 值为 #FF9932CC。 |
| static [get_DarkRed](./get_darkred/)() | 获取系统定义的颜色，其 ARGB 值为 #FF8B0000。 |
| static [get_DarkSalmon](./get_darksalmon/)() | 获取系统定义的颜色，其 ARGB 值为 #FFE9967A。 |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF8FBC8F。 |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF483D8B。 |
| static [get_DarkSlateGray](./get_darkslategray/)() | 获取系统定义的颜色，其 ARGB 值为 #FF2F4F4F。 |
| static [get_DarkTurquoise](./get_darkturquoise/)() | 获取系统定义的颜色，其 ARGB 值为 #FF00CED1。 |
| static [get_DarkViolet](./get_darkviolet/)() | 获取系统定义的颜色，其 ARGB 值为 #FF9400D3。 |
| static [get_DeepPink](./get_deeppink/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF1493。 |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF00BFFF。 |
| static [get_DimGray](./get_dimgray/)() | 获取系统定义的颜色，其 ARGB 值为 #FF696969。 |
| static [get_DodgerBlue](./get_dodgerblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF1E90FF。 |
| static [get_Firebrick](./get_firebrick/)() | 获取系统定义的颜色，其 ARGB 值为 #FFB22222。 |
| static [get_FloralWhite](./get_floralwhite/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFFAF0。 |
| static [get_ForestGreen](./get_forestgreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF228B22。 |
| static [get_Fuchsia](./get_fuchsia/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF00FF。 |
| [get_G](./get_g/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的绿色分量值。 |
| static [get_Gainsboro](./get_gainsboro/)() | 获取系统定义的颜色，其 ARGB 值为 #FFDCDCDC。 |
| static [get_GhostWhite](./get_ghostwhite/)() | 获取系统定义的颜色，其 ARGB 值为 #FFF8F8FF。 |
| static [get_Gold](./get_gold/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFD700。 |
| static [get_Goldenrod](./get_goldenrod/)() | 获取具有 ARGB 值 #FFDAA520 的系统定义颜色。 |
| static [get_Gray](./get_gray/)() | 获取具有 ARGB 值 #FF808080 的系统定义颜色。 |
| static [get_Green](./get_green/)() | 获取具有 ARGB 值 #FF008000 的系统定义颜色。 |
| static [get_GreenYellow](./get_greenyellow/)() | 获取具有 ARGB 值 #FFADFF2F 的系统定义颜色。 |
| static [get_Honeydew](./get_honeydew/)() | 获取具有 ARGB 值 #FFF0FFF0 的系统定义颜色。 |
| static [get_HotPink](./get_hotpink/)() | 获取具有 ARGB 值 #FFFF69B4 的系统定义颜色。 |
| static [get_IndianRed](./get_indianred/)() | 获取具有 ARGB 值 #FFCD5C5C 的系统定义颜色。 |
| static [get_Indigo](./get_indigo/)() | 获取具有 ARGB 值 #FF4B0082 的系统定义颜色。 |
| [get_IsEmpty](./get_isempty/)() | 指定此 [T:Aspose::Page::Drawing::Color](../) 结构是否未初始化。 |
| [get_IsNamedColor](./get_isnamedcolor/)() | 获取一个值，指示此 [T:Aspose::Page::Drawing::Color](../) 结构是命名颜色还是 [T:System::Drawing::KnownColor](../) 枚举的成员。 |
| static [get_Ivory](./get_ivory/)() | 获取具有 ARGB 值 #FFFFFFF0 的系统定义颜色。 |
| static [get_Khaki](./get_khaki/)() | 获取具有 ARGB 值 #FFF0E68C 的系统定义颜色。 |
| static [get_Lavender](./get_lavender/)() | 获取具有 ARGB 值 #FFE6E6FA 的系统定义颜色。 |
| static [get_LavenderBlush](./get_lavenderblush/)() | 获取具有 ARGB 值 #FFFFF0F5 的系统定义颜色。 |
| static [get_LawnGreen](./get_lawngreen/)() | 获取具有 ARGB 值 #FF7CFC00 的系统定义颜色。 |
| static [get_LemonChiffon](./get_lemonchiffon/)() | 获取具有 ARGB 值 #FFFFFACD 的系统定义颜色。 |
| static [get_LightBlue](./get_lightblue/)() | 获取具有 ARGB 值 #FFADD8E6 的系统定义颜色。 |
| static [get_LightCoral](./get_lightcoral/)() | 获取具有 ARGB 值 #FFF08080 的系统定义颜色。 |
| static [get_LightCyan](./get_lightcyan/)() | 获取具有 ARGB 值 #FFE0FFFF 的系统定义颜色。 |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | 获取具有 ARGB 值 #FFFAFAD2 的系统定义颜色。 |
| static [get_LightGray](./get_lightgray/)() | 获取具有 ARGB 值 #FFD3D3D3 的系统定义颜色。 |
| static [get_LightGreen](./get_lightgreen/)() | 获取具有 ARGB 值 #FF90EE90 的系统定义颜色。 |
| static [get_LightPink](./get_lightpink/)() | 获取具有 ARGB 值 #FFFFB6C1 的系统定义颜色。 |
| static [get_LightSalmon](./get_lightsalmon/)() | 获取具有 ARGB 值 #FFFFA07A 的系统定义颜色。 |
| static [get_LightSeaGreen](./get_lightseagreen/)() | 获取具有 ARGB 值 #FF20B2AA 的系统定义颜色。 |
| static [get_LightSkyBlue](./get_lightskyblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF87CEFA。 |
| static [get_LightSlateGray](./get_lightslategray/)() | 获取系统定义的颜色，其 ARGB 值为 #FF778899。 |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FFB0C4DE。 |
| static [get_LightYellow](./get_lightyellow/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFFFE0。 |
| static [get_Lime](./get_lime/)() | 获取系统定义的颜色，其 ARGB 值为 #FF00FF00。 |
| static [get_LimeGreen](./get_limegreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF32CD32。 |
| static [get_Linen](./get_linen/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFAF0E6。 |
| static [get_Magenta](./get_magenta/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF00FF。 |
| static [get_Maroon](./get_maroon/)() | 获取系统定义的颜色，其 ARGB 值为 #FF800000。 |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | 获取系统定义的颜色，其 ARGB 值为 #FF66CDAA。 |
| static [get_MediumBlue](./get_mediumblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF0000CD。 |
| static [get_MediumOrchid](./get_mediumorchid/)() | 获取系统定义的颜色，其 ARGB 值为 #FFBA55D3。 |
| static [get_MediumPurple](./get_mediumpurple/)() | 获取系统定义的颜色，其 ARGB 值为 #FF9370DB。 |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF3CB371。 |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF7B68EE。 |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF00FA9A。 |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | 获取系统定义的颜色，其 ARGB 值为 #FF48D1CC。 |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | 获取系统定义的颜色，其 ARGB 值为 #FFC71585。 |
| static [get_MidnightBlue](./get_midnightblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF191970。 |
| static [get_MintCream](./get_mintcream/)() | 获取系统定义的颜色，其 ARGB 值为 #FFF5FFFA。 |
| static [get_MistyRose](./get_mistyrose/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFE4E1。 |
| static [get_Moccasin](./get_moccasin/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFE4B5。 |
| [get_Name](./get_name/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 的名称。 |
| static [get_NavajoWhite](./get_navajowhite/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFDEAD。 |
| static [get_Navy](./get_navy/)() | 获取系统定义的颜色，其 ARGB 值为 #FF000080。 |
| static [get_OldLace](./get_oldlace/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFDF5E6。 |
| static [get_Olive](./get_olive/)() | 获取系统定义的颜色，其 ARGB 值为 #FF808000。 |
| static [get_OliveDrab](./get_olivedrab/)() | 获取系统定义的颜色，其 ARGB 值为 #FF6B8E23。 |
| static [get_Orange](./get_orange/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFA500。 |
| static [get_OrangeRed](./get_orangered/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF4500。 |
| static [get_Orchid](./get_orchid/)() | 获取系统定义的颜色，其 ARGB 值为 #FFDA70D6。 |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | 获取系统定义的颜色，其 ARGB 值为 #FFEEE8AA。 |
| static [get_PaleGreen](./get_palegreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF98FB98。 |
| static [get_PaleTurquoise](./get_paleturquoise/)() | 获取系统定义的颜色，其 ARGB 值为 #FFAFEEEE。 |
| static [get_PaleVioletRed](./get_palevioletred/)() | 获取系统定义的颜色，其 ARGB 值为 #FFDB7093。 |
| static [get_PapayaWhip](./get_papayawhip/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFEFD5。 |
| static [get_PeachPuff](./get_peachpuff/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFDAB9。 |
| static [get_Peru](./get_peru/)() | 获取系统定义的颜色，其 ARGB 值为 #FFCD853F。 |
| static [get_Pink](./get_pink/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFC0CB。 |
| static [get_Plum](./get_plum/)() | 获取系统定义的颜色，其 ARGB 值为 #FFDDA0DD。 |
| static [get_PowderBlue](./get_powderblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FFB0E0E6。 |
| static [get_Purple](./get_purple/)() | 获取系统定义的颜色，其 ARGB 值为 #FF800080。 |
| [get_R](./get_r/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的红色分量值。 |
| static [get_Red](./get_red/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF0000。 |
| static [get_RosyBrown](./get_rosybrown/)() | 获取系统定义的颜色，其 ARGB 值为 #FFBC8F8F。 |
| static [get_RoyalBlue](./get_royalblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF4169E1。 |
| static [get_SaddleBrown](./get_saddlebrown/)() | 获取系统定义的颜色，其 ARGB 值为 #FF8B4513。 |
| static [get_Salmon](./get_salmon/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFA8072。 |
| static [get_SandyBrown](./get_sandybrown/)() | 获取系统定义的颜色，其 ARGB 值为 #FFF4A460。 |
| static [get_SeaGreen](./get_seagreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF2E8B57。 |
| static [get_SeaShell](./get_seashell/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFF5EE。 |
| static [get_Sienna](./get_sienna/)() | 获取系统定义的颜色，其 ARGB 值为 #FFA0522D。 |
| static [get_Silver](./get_silver/)() | 获取系统定义的颜色，其 ARGB 值为 #FFC0C0C0。 |
| static [get_SkyBlue](./get_skyblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF87CEEB。 |
| static [get_SlateBlue](./get_slateblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF6A5ACD。 |
| static [get_SlateGray](./get_slategray/)() | 获取系统定义的颜色，其 ARGB 值为 #FF708090。 |
| static [get_Snow](./get_snow/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFFAFA。 |
| static [get_SpringGreen](./get_springgreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF00FF7F。 |
| static [get_SteelBlue](./get_steelblue/)() | 获取系统定义的颜色，其 ARGB 值为 #FF4682B4。 |
| static [get_Tan](./get_tan/)() | 获取系统定义的颜色，其 ARGB 值为 #FFD2B48C。 |
| static [get_Teal](./get_teal/)() | 获取系统定义的颜色，其 ARGB 值为 #FF008080。 |
| static [get_Thistle](./get_thistle/)() | 获取系统定义的颜色，其 ARGB 值为 #FFD8BFD8。 |
| static [get_Tomato](./get_tomato/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFF6347。 |
| static [get_Transparent](./get_transparent/)() | 获取系统定义的颜色。 |
| static [get_Turquoise](./get_turquoise/)() | 获取系统定义的颜色，其 ARGB 值为 #FF40E0D0。 |
| static [get_Violet](./get_violet/)() | 获取系统定义的颜色，其 ARGB 值为 #FFEE82EE。 |
| static [get_Wheat](./get_wheat/)() | 获取系统定义的颜色，其 ARGB 值为 #FFF5DEB3。 |
| static [get_White](./get_white/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFFFFF。 |
| static [get_WhiteSmoke](./get_whitesmoke/)() | 获取系统定义的颜色，其 ARGB 值为 #FFF5F5F5。 |
| static [get_Yellow](./get_yellow/)() | 获取系统定义的颜色，其 ARGB 值为 #FFFFFF00。 |
| static [get_YellowGreen](./get_yellowgreen/)() | 获取系统定义的颜色，其 ARGB 值为 #FF9ACD32。 |
| [GetBrightness](./getbrightness/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的色相-饱和度-亮度 (HSB) 亮度值。 |
| [GetHashCode](./gethashcode/)() const override | 返回此 [T:Aspose::Page::Drawing::Color](../) 结构的哈希码。 |
| [GetHue](./gethue/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的色相-饱和度-亮度 (HSB) 色相值（以度为单位）。 |
| [GetSaturation](./getsaturation/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的色相-饱和度-亮度 (HSB) 饱和度值。 |
| [ToArgb](./toargb/)() | 获取此 [T:Aspose::Page::Drawing::Color](../) 结构的 32 位 ARGB 值。 |
| [ToString](./tostring/)() const override | 将此 [T:Aspose::Page::Drawing::Color](../) 结构转换为人类可读的字符串。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](./empty/) | 表示一个空（null）的颜色。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
