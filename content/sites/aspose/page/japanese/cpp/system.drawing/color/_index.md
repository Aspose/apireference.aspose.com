---
title: "System::Drawing::Color クラス"
linktitle: "Color"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Color クラス。色を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。C++ では System::SmartPtr クラスを使用してこの型のオブジェクトを管理しないでください。"
type: docs
weight: 500
url: /ja/cpp/system.drawing/color/
---
## Color class


色を表します。この型はスタック上に割り当て、値渡しまたは参照渡しで関数に渡すべきです。[System::SmartPtr](../../system/smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class Color
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Color](./color/)() | 任意の色を表さない \"empty\" インスタンスの [Color](./) クラスを作成します。 |
| [Equals](./equals/)(const Color\&) const | 現在の [Color](./) オブジェクトと指定されたオブジェクトが同じ色を表すかどうかを判定します。 |
| static [FromArgb](./fromargb/)(int) | 指定された色を表す [Color](./) クラスのインスタンスを作成します。 |
| static [FromArgb](./fromargb/)(int, int, int, int) | 指定された色を表す [Color](./) クラスのインスタンスを作成します。 |
| static [FromArgb](./fromargb/)(int, int, int) | アルファ成分が 0xFF に設定された指定された色を表す [Color](./) クラスのインスタンスを作成します。 |
| static [FromArgb](./fromargb/)(int, Color) | 指定された色を表す [Color](./) クラスのインスタンスを作成します。 |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | 指定された既知の色を表す [Color](./) クラスのインスタンスを作成します。 |
| static [FromName](./fromname/)(const String\&) | 指定された名前の色を表す [Color](./) クラスのインスタンスを作成します。 |
| [get_A](./get_a/)() const | 現在のオブジェクトが表す色のアルファ成分の値を返します。 |
| static [get_AliceBlue](./get_aliceblue/)() | 16 進表記の ARGB 値が #FFF0F8FF の色を返します。 |
| static [get_AntiqueWhite](./get_antiquewhite/)() | 16 進表記の ARGB 値が #FFFAEBD7 の色を返します。 |
| static [get_Aqua](./get_aqua/)() | 16 進表記の ARGB 値が #FF00FFFF の色を返します。 |
| static [get_Aquamarine](./get_aquamarine/)() | 16 進表記の ARGB 値が #FF7FFFD4 の色を返します。 |
| static [get_Azure](./get_azure/)() | 16 進表記の ARGB 値が #FFF0FFFF の色を返します。 |
| [get_B](./get_b/)() const | 現在のオブジェクトで表される色の青成分の値を返します。 |
| static [get_Beige](./get_beige/)() | 16 進表記の ARGB 値が #FFF5F5DC の色を返します。 |
| static [get_Bisque](./get_bisque/)() | 16 進表記の ARGB 値が #FFFFE4C4 の色を返します。 |
| static [get_Black](./get_black/)() | 16 進表記の ARGB 値が #FF000000 の色を返します。 |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | 16 進表記の ARGB 値が #FFFFEBCD の色を返します。 |
| static [get_Blue](./get_blue/)() | 16 進表記の ARGB 値が #FF0000FF の色を返します。 |
| static [get_BlueViolet](./get_blueviolet/)() | 16 進表記の ARGB 値が #FF8A2BE2 の色を返します。 |
| static [get_Brown](./get_brown/)() | 16 進表記の ARGB 値が #FFA52A2A の色を返します。 |
| static [get_BurlyWood](./get_burlywood/)() | 16 進表記の ARGB 値が #FFDEB887 の色を返します。 |
| static [get_CadetBlue](./get_cadetblue/)() | 16 進表記の ARGB 値が #FF5F9EA0 の色を返します。 |
| static [get_Chartreuse](./get_chartreuse/)() | 16 進表記の ARGB 値が #FF7FFF00 の色を返します。 |
| static [get_Chocolate](./get_chocolate/)() | 16 進表記の ARGB 値が #FFD2691E の色を返します。 |
| static [get_Coral](./get_coral/)() | 16 進表記の ARGB 値が #FFFF7F50 の色を返します。 |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | 16 進表記の ARGB 値が #FF6495ED の色を返します。 |
| static [get_Cornsilk](./get_cornsilk/)() | 16 進表記の ARGB 値が #FFFFF8DC の色を返します。 |
| static [get_Crimson](./get_crimson/)() | 16 進表記の ARGB 値が #FFDC143C の色を返します。 |
| static [get_Cyan](./get_cyan/)() | 16 進表記の ARGB 値が #FF00FFFF の色を返します。 |
| static [get_DarkBlue](./get_darkblue/)() | 16 進表記の ARGB 値が #FF00008B の色を返します。 |
| static [get_DarkCyan](./get_darkcyan/)() | 16 進表記の ARGB 値が #FF008B8B の色を返します。 |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | 16 進表記の ARGB 値が #FFB8860B の色を返します。 |
| static [get_DarkGray](./get_darkgray/)() | 16 進表記の ARGB 値が #FFA9A9A9 の色を返します。 |
| static [get_DarkGreen](./get_darkgreen/)() | ARGB 値が十六進表記で #FF006400 の色を返します。 |
| static [get_DarkKhaki](./get_darkkhaki/)() | ARGB 値が十六進表記で #FFBDB76B の色を返します。 |
| static [get_DarkMagenta](./get_darkmagenta/)() | ARGB 値が十六進表記で #FF8B008B の色を返します。 |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | ARGB 値が十六進表記で #FF556B2F の色を返します。 |
| static [get_DarkOrange](./get_darkorange/)() | ARGB 値が十六進表記で #FFFF8C00 の色を返します。 |
| static [get_DarkOrchid](./get_darkorchid/)() | ARGB 値が十六進表記で #FF9932CC の色を返します。 |
| static [get_DarkRed](./get_darkred/)() | ARGB 値が十六進表記で #FF8B0000 の色を返します。 |
| static [get_DarkSalmon](./get_darksalmon/)() | ARGB 値が十六進表記で #FFE9967A の色を返します。 |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | ARGB 値が十六進表記で #FF8FBC8F の色を返します。 |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | ARGB 値が十六進表記で #FF483D8B の色を返します。 |
| static [get_DarkSlateGray](./get_darkslategray/)() | ARGB 値が十六進表記で #FF2F4F4F の色を返します。 |
| static [get_DarkTurquoise](./get_darkturquoise/)() | ARGB 値が十六進表記で #FF00CED1 の色を返します。 |
| static [get_DarkViolet](./get_darkviolet/)() | ARGB 値が十六進表記で #FF9400D3 の色を返します。 |
| static [get_DeepPink](./get_deeppink/)() | ARGB 値が十六進表記で #FFFF1493 の色を返します。 |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | ARGB 値が十六進表記で #FF00BFFF の色を返します。 |
| static [get_DimGray](./get_dimgray/)() | ARGB 値が十六進表記で #FF696969 の色を返します。 |
| static [get_DodgerBlue](./get_dodgerblue/)() | ARGB 値が十六進表記で #FF1E90FF の色を返します。 |
| static [get_Firebrick](./get_firebrick/)() | ARGB 値が十六進表記で #FFB22222 の色を返します。 |
| static [get_FloralWhite](./get_floralwhite/)() | ARGB 値が十六進表記で #FFFFFAF0 の色を返します。 |
| static [get_ForestGreen](./get_forestgreen/)() | ARGB 値が十六進表記で #FF228B22 の色を返します。 |
| static [get_Fuchsia](./get_fuchsia/)() | ARGB 値が十六進表記で #FFFF00FF の色を返します。 |
| [get_G](./get_g/)() const | 現在のオブジェクトで表される色の緑成分の値を返します。 |
| static [get_Gainsboro](./get_gainsboro/)() | ARGB 値が十六進表記で #FFDCDCDC の色を返します。 |
| static [get_GhostWhite](./get_ghostwhite/)() | ARGB 値が十六進表記で #FFF8F8FF の色を返します。 |
| static [get_Gold](./get_gold/)() | ARGB 値が十六進表記で #FFFFD700 の色を返します。 |
| static [get_Goldenrod](./get_goldenrod/)() | ARGB 値が 16 進表記で #FFDAA520 の色を返します。 |
| static [get_Gray](./get_gray/)() | ARGB 値が 16 進表記で #FF808080 の色を返します。 |
| static [get_Green](./get_green/)() | ARGB 値が 16 進表記で #FF008000 の色を返します。 |
| static [get_GreenYellow](./get_greenyellow/)() | ARGB 値が 16 進表記で #FFADFF2F の色を返します。 |
| static [get_Honeydew](./get_honeydew/)() | ARGB 値が 16 進表記で #FFF0FFF0 の色を返します。 |
| static [get_HotPink](./get_hotpink/)() | ARGB 値が 16 進表記で #FFFF69B4 の色を返します。 |
| static [get_IndianRed](./get_indianred/)() | ARGB 値が 16 進表記で #FFCD5C5C の色を返します。 |
| static [get_Indigo](./get_indigo/)() | ARGB 値が 16 進表記で #FF4B0082 の色を返します。 |
| [get_IsEmpty](./get_isempty/)() const | 現在のオブジェクトが「空」であるか（つまり、色を表さないか）を示す値を返します。 |
| [get_IsNamedColor](./get_isnamedcolor/)() const | [Color](./) 構造体が名前付きカラーか、[KnownColor](../knowncolor/) 列挙体のメンバーかを判定する値を返します。 |
| static [get_Ivory](./get_ivory/)() | ARGB 値が 16 進表記で #FFFFFFF0 の色を返します。 |
| static [get_Khaki](./get_khaki/)() | ARGB 値が 16 進表記で #FFF0E68C の色を返します。 |
| static [get_Lavender](./get_lavender/)() | ARGB 値が 16 進表記で #FFE6E6FA の色を返します。 |
| static [get_LavenderBlush](./get_lavenderblush/)() | ARGB 値が 16 進表記で #FFFFF0F5 の色を返します。 |
| static [get_LawnGreen](./get_lawngreen/)() | ARGB 値が 16 進表記で #FF7CFC00 の色を返します。 |
| static [get_LemonChiffon](./get_lemonchiffon/)() | ARGB 値が 16 進表記で #FFFFFACD の色を返します。 |
| static [get_LightBlue](./get_lightblue/)() | ARGB 値が 16 進表記で #FFADD8E6 の色を返します。 |
| static [get_LightCoral](./get_lightcoral/)() | ARGB 値が 16 進表記で #FFF08080 の色を返します。 |
| static [get_LightCyan](./get_lightcyan/)() | ARGB 値が 16 進表記で #FFE0FFFF の色を返します。 |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | ARGB 値が 16 進表記で #FFFAFAD2 の色を返します。 |
| static [get_LightGray](./get_lightgray/)() | ARGB 値が 16 進表記で #FFD3D3D3 の色を返します。 |
| static [get_LightGreen](./get_lightgreen/)() | ARGB 値が 16 進表記で #FF90EE90 の色を返します。 |
| static [get_LightPink](./get_lightpink/)() | ARGB 値が 16 進表記で #FFFFB6C1 の色を返します。 |
| static [get_LightSalmon](./get_lightsalmon/)() | ARGB 値が 16 進表記で #FFFFA07A の色を返します。 |
| static [get_LightSeaGreen](./get_lightseagreen/)() | ARGB 値が 16 進表記で #FF20B2AA の色を返します。 |
| static [get_LightSkyBlue](./get_lightskyblue/)() | 16 進表記の ARGB 値が #FF87CEFA の色を返します。 |
| static [get_LightSlateGray](./get_lightslategray/)() | 16 進表記の ARGB 値が #FF778899 の色を返します。 |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | 16 進表記の ARGB 値が #FFB0C4DE の色を返します。 |
| static [get_LightYellow](./get_lightyellow/)() | 16 進表記の ARGB 値が #FFFFFFE0 の色を返します。 |
| static [get_Lime](./get_lime/)() | 16 進表記の ARGB 値が #FF00FF00 の色を返します。 |
| static [get_LimeGreen](./get_limegreen/)() | 16 進表記の ARGB 値が #FF32CD32 の色を返します。 |
| static [get_Linen](./get_linen/)() | 16 進表記の ARGB 値が #FFFAF0E6 の色を返します。 |
| static [get_Magenta](./get_magenta/)() | ARGB 値が十六進表記で #FFFF00FF の色を返します。 |
| static [get_Maroon](./get_maroon/)() | 16 進表記の ARGB 値が #FF800000 の色を返します。 |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | 16 進表記の ARGB 値が #FF66CDAA の色を返します。 |
| static [get_MediumBlue](./get_mediumblue/)() | 16 進表記の ARGB 値が #FF0000CD の色を返します。 |
| static [get_MediumOrchid](./get_mediumorchid/)() | 16 進表記の ARGB 値が #FFBA55D3 の色を返します。 |
| static [get_MediumPurple](./get_mediumpurple/)() | 16 進表記の ARGB 値が #FF9370DB の色を返します。 |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | 16 進表記の ARGB 値が #FF3CB371 の色を返します。 |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | 16 進表記の ARGB 値が #FF7B68EE の色を返します。 |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | 16 進表記の ARGB 値が #FF00FA9A の色を返します。 |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | 16 進表記の ARGB 値が #FF48D1CC の色を返します。 |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | 16 進表記の ARGB 値が #FFC71585 の色を返します。 |
| static [get_MidnightBlue](./get_midnightblue/)() | 16 進表記の ARGB 値が #FF191970 の色を返します。 |
| static [get_MintCream](./get_mintcream/)() | 16 進表記の ARGB 値が #FFF5FFFA の色を返します。 |
| static [get_MistyRose](./get_mistyrose/)() | 16 進表記の ARGB 値が #FFFFE4E1 の色を返します。 |
| static [get_Moccasin](./get_moccasin/)() | 16 進表記の ARGB 値が #FFFFE4B5 の色を返します。 |
| [get_Name](./get_name/)() const | 現在のオブジェクトが表す色の名前を返します。 |
| static [get_NavajoWhite](./get_navajowhite/)() | 16 進表記の ARGB 値が #FFFFDEAD の色を返します。 |
| static [get_Navy](./get_navy/)() | 16 進表記の ARGB 値が #FF000080 の色を返します。 |
| static [get_OldLace](./get_oldlace/)() | 16 進表記の ARGB 値が #FFFDF5E6 の色を返します。 |
| static [get_Olive](./get_olive/)() | #FF808000 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_OliveDrab](./get_olivedrab/)() | #FF6B8E23 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Orange](./get_orange/)() | #FFFFA500 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_OrangeRed](./get_orangered/)() | #FFFF4500 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Orchid](./get_orchid/)() | #FFDA70D6 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | #FFEEE8AA の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PaleGreen](./get_palegreen/)() | #FF98FB98 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PaleTurquoise](./get_paleturquoise/)() | #FFAFEEEE の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PaleVioletRed](./get_palevioletred/)() | #FFDB7093 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PapayaWhip](./get_papayawhip/)() | #FFFFEFD5 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PeachPuff](./get_peachpuff/)() | #FFFFDAB9 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Peru](./get_peru/)() | #FFCD853F の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Pink](./get_pink/)() | #FFFFC0CB の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Plum](./get_plum/)() | #FFDDA0DD の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_PowderBlue](./get_powderblue/)() | #FFB0E0E6 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Purple](./get_purple/)() | #FF800080 の十六進表記 ARGB 値を持つ色を返します。 |
| [get_R](./get_r/)() const | 現在のオブジェクトで表される色の赤成分の値を返します。 |
| static [get_Red](./get_red/)() | #FFFF0000 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_RosyBrown](./get_rosybrown/)() | #FFBC8F8F の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_RoyalBlue](./get_royalblue/)() | #FF4169E1 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_SaddleBrown](./get_saddlebrown/)() | #FF8B4513 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Salmon](./get_salmon/)() | #FFFA8072 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_SandyBrown](./get_sandybrown/)() | #FFF4A460 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_SeaGreen](./get_seagreen/)() | #FF2E8B57 の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_SeaShell](./get_seashell/)() | #FFFFF5EE の十六進表記 ARGB 値を持つ色を返します。 |
| static [get_Sienna](./get_sienna/)() | ARGB 値が 16 進表記で #FFA0522D の色を返します。 |
| static [get_Silver](./get_silver/)() | ARGB 値が 16 進表記で #FFC0C0C0 の色を返します。 |
| static [get_SkyBlue](./get_skyblue/)() | ARGB 値が 16 進表記で #FF87CEEB の色を返します。 |
| static [get_SlateBlue](./get_slateblue/)() | ARGB 値が 16 進表記で #FF6A5ACD の色を返します。 |
| static [get_SlateGray](./get_slategray/)() | ARGB 値が 16 進表記で #FF708090 の色を返します。 |
| static [get_Snow](./get_snow/)() | ARGB 値が 16 進表記で #FFFFFAFA の色を返します。 |
| static [get_SpringGreen](./get_springgreen/)() | ARGB 値が 16 進表記で #FF00FF7F の色を返します。 |
| static [get_SteelBlue](./get_steelblue/)() | ARGB 値が 16 進表記で #FF4682B4 の色を返します。 |
| static [get_Tan](./get_tan/)() | ARGB 値が 16 進表記で #FFD2B48C の色を返します。 |
| static [get_Teal](./get_teal/)() | ARGB 値が 16 進表記で #FF008080 の色を返します。 |
| static [get_Thistle](./get_thistle/)() | ARGB 値が 16 進表記で #FFD8BFD8 の色を返します。 |
| static [get_Tomato](./get_tomato/)() | ARGB 値が 16 進表記で #FFFF6347 の色を返します。 |
| static [get_Transparent](./get_transparent/)() | ARGB 値が 16 進表記で #00FFFFFF の色を返します。 |
| static [get_Turquoise](./get_turquoise/)() | ARGB 値が 16 進表記で #FF40E0D0 の色を返します。 |
| static [get_Violet](./get_violet/)() | ARGB 値が 16 進表記で #FFEE82EE の色を返します。 |
| static [get_Wheat](./get_wheat/)() | ARGB 値が 16 進表記で #FFF5DEB3 の色を返します。 |
| static [get_White](./get_white/)() | ARGB 値が 16 進表記で #FFFFFFFF の色を返します。 |
| static [get_WhiteSmoke](./get_whitesmoke/)() | ARGB 値が 16 進表記で #FFF5F5F5 の色を返します。 |
| static [get_Yellow](./get_yellow/)() | ARGB 値が 16 進表記で #FFFFFF00 の色を返します。 |
| static [get_YellowGreen](./get_yellowgreen/)() | ARGB 値が 16 進表記で #FF9ACD32 の色を返します。 |
| [GetBrightness](./getbrightness/)() | 現在のオブジェクトが表す色の明度成分を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [GetHue](./gethue/)() | 現在のオブジェクトが表す色の Hue‑Saturation‑Brightness (HSB) の色相値（度単位）を返します。 |
| [GetSaturation](./getsaturation/)() | 現在のオブジェクトが表す色の Hue‑Saturation‑Brightness (HSB) の彩度を返します。 |
| [IsNull](./isnull/)() const | 常に false を返します。 |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | 常に true を返します。 |
| [operator!=](./operator!=/)(const Color\&) const | 現在のオブジェクトと指定された [Color](./) オブジェクトが異なる色を表すかどうかを判定します。 |
| [operator==](./operator==/)(const std::nullptr_t\&) const | 常に false を返します。 |
| [operator==](./operator==/)(const Color\&) const | 現在の [Color](./) オブジェクトと指定されたオブジェクトが同じ色を表すかどうかを判定します。 |
| [ToArgb](./toargb/)() const | 現在のオブジェクトが表す色の 32 ビット ARGB 値を返します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトの文字列表現を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | "empty" インスタンスの [Color](./) クラス、つまり色を表さないインスタンスです。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
