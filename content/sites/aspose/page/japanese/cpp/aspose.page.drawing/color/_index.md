---
title: "Aspose::Page::Drawing::Color クラス"
linktitle: "Color"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Drawing::Color クラス。C++ で ARGB（アルファ、赤、緑、青）カラーを表します。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.drawing/color/
---
## Color class


ARGB (アルファ、赤、緑、青) カラーを表します。

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | この [Aspose.Page.Drawing.Color](./) をクローンします。 |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 指定されたオブジェクトが [T:Aspose::Page::Drawing::Color](../) 構造体であり、この [T:Aspose::Page::Drawing::Color](../) 構造体と等価かどうかをテストします。 |
| static [FromArgb](./fromargb/)(int32_t) | 32 ビット ARGB 値から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。 |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | 4 つの ARGB コンポーネント（アルファ、赤、緑、青）の値から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。このメソッドは各コンポーネントに 32 ビット値を渡すことを許可しますが、各コンポーネントの値は 8 ビットに制限されます。 |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | 指定された [T:Aspose::Page::Drawing::Color](../) 構造体から、新しい指定アルファ値を使用して [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。このメソッドはアルファ値に 32 ビット値を渡すことを許可しますが、値は 8 ビットに制限されます。 |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | 指定された 8 ビットカラー値（赤、緑、青）から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。アルファ値は暗黙的に 255（完全に不透明）です。このメソッドは各カラーコンポーネントに 32 ビット値を渡すことを許可しますが、各コンポーネントの値は 8 ビットに制限されます。 |
| static [FromName](./fromname/)(System::String) | 指定されたプリセットカラー名から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。 |
| [get_A](./get_a/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体のアルファ コンポーネント値を取得します。 |
| static [get_AliceBlue](./get_aliceblue/)() | ARGB 値 #FFF0F8FF を持つシステム定義の色を取得します。 |
| static [get_AntiqueWhite](./get_antiquewhite/)() | ARGB 値 #FFFAEBD7 を持つシステム定義の色を取得します。 |
| static [get_Aqua](./get_aqua/)() | ARGB 値 #FF00FFFF を持つシステム定義の色を取得します。 |
| static [get_Aquamarine](./get_aquamarine/)() | ARGB 値 #FF7FFFD4 を持つシステム定義の色を取得します。 |
| static [get_Azure](./get_azure/)() | ARGB 値 #FFF0FFFF を持つシステム定義の色を取得します。 |
| [get_B](./get_b/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の青色成分の値を取得します。 |
| static [get_Beige](./get_beige/)() | ARGB 値 #FFF5F5DC を持つシステム定義の色を取得します。 |
| static [get_Bisque](./get_bisque/)() | ARGB 値 #FFFFE4C4 を持つシステム定義の色を取得します。 |
| static [get_Black](./get_black/)() | ARGB 値 #FF000000 を持つシステム定義の色を取得します。 |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | ARGB 値 #FFFFEBCD を持つシステム定義の色を取得します。 |
| static [get_Blue](./get_blue/)() | ARGB 値 #FF0000FF を持つシステム定義の色を取得します。 |
| static [get_BlueViolet](./get_blueviolet/)() | ARGB 値 #FF8A2BE2 を持つシステム定義の色を取得します。 |
| static [get_Brown](./get_brown/)() | ARGB 値 #FFA52A2A を持つシステム定義の色を取得します。 |
| static [get_BurlyWood](./get_burlywood/)() | ARGB 値 #FFDEB887 を持つシステム定義の色を取得します。 |
| static [get_CadetBlue](./get_cadetblue/)() | ARGB 値 #FF5F9EA0 を持つシステム定義の色を取得します。 |
| static [get_Chartreuse](./get_chartreuse/)() | ARGB 値 #FF7FFF00 を持つシステム定義の色を取得します。 |
| static [get_Chocolate](./get_chocolate/)() | ARGB 値 #FFD2691E を持つシステム定義の色を取得します。 |
| static [get_Coral](./get_coral/)() | ARGB 値 #FFFF7F50 を持つシステム定義の色を取得します。 |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | ARGB 値 #FF6495ED を持つシステム定義の色を取得します。 |
| static [get_Cornsilk](./get_cornsilk/)() | ARGB 値 #FFFFF8DC を持つシステム定義の色を取得します。 |
| static [get_Crimson](./get_crimson/)() | ARGB 値 #FFDC143C を持つシステム定義の色を取得します。 |
| static [get_Cyan](./get_cyan/)() | ARGB 値 #FF00FFFF を持つシステム定義の色を取得します。 |
| static [get_DarkBlue](./get_darkblue/)() | ARGB 値 #FF00008B を持つシステム定義の色を取得します。 |
| static [get_DarkCyan](./get_darkcyan/)() | ARGB 値 #FF008B8B を持つシステム定義の色を取得します。 |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | ARGB 値 #FFB8860B を持つシステム定義の色を取得します。 |
| static [get_DarkGray](./get_darkgray/)() | ARGB 値 #FFA9A9A9 を持つシステム定義の色を取得します。 |
| static [get_DarkGreen](./get_darkgreen/)() | システム定義の色を取得します（ARGB 値は #FF006400）。 |
| static [get_DarkKhaki](./get_darkkhaki/)() | システム定義の色を取得します（ARGB 値は #FFBDB76B）。 |
| static [get_DarkMagenta](./get_darkmagenta/)() | システム定義の色を取得します（ARGB 値は #FF8B008B）。 |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | システム定義の色を取得します（ARGB 値は #FF556B2F）。 |
| static [get_DarkOrange](./get_darkorange/)() | システム定義の色を取得します（ARGB 値は #FFFF8C00）。 |
| static [get_DarkOrchid](./get_darkorchid/)() | システム定義の色を取得します（ARGB 値は #FF9932CC）。 |
| static [get_DarkRed](./get_darkred/)() | システム定義の色を取得します（ARGB 値は #FF8B0000）。 |
| static [get_DarkSalmon](./get_darksalmon/)() | システム定義の色を取得します（ARGB 値は #FFE9967A）。 |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | システム定義の色を取得します（ARGB 値は #FF8FBC8F）。 |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | システム定義の色を取得します（ARGB 値は #FF483D8B）。 |
| static [get_DarkSlateGray](./get_darkslategray/)() | システム定義の色を取得します（ARGB 値は #FF2F4F4F）。 |
| static [get_DarkTurquoise](./get_darkturquoise/)() | システム定義の色を取得します（ARGB 値は #FF00CED1）。 |
| static [get_DarkViolet](./get_darkviolet/)() | システム定義の色を取得します（ARGB 値は #FF9400D3）。 |
| static [get_DeepPink](./get_deeppink/)() | システム定義の色を取得します（ARGB 値は #FFFF1493）。 |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | システム定義の色を取得します（ARGB 値は #FF00BFFF）。 |
| static [get_DimGray](./get_dimgray/)() | システム定義の色を取得します（ARGB 値は #FF696969）。 |
| static [get_DodgerBlue](./get_dodgerblue/)() | システム定義の色を取得します（ARGB 値は #FF1E90FF）。 |
| static [get_Firebrick](./get_firebrick/)() | システム定義の色を取得します（ARGB 値は #FFB22222）。 |
| static [get_FloralWhite](./get_floralwhite/)() | システム定義の色を取得します（ARGB 値は #FFFFFAF0）。 |
| static [get_ForestGreen](./get_forestgreen/)() | システム定義の色を取得します（ARGB 値は #FF228B22）。 |
| static [get_Fuchsia](./get_fuchsia/)() | システム定義の色を取得します（ARGB 値は #FFFF00FF）。 |
| [get_G](./get_g/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の緑成分の値を取得します。 |
| static [get_Gainsboro](./get_gainsboro/)() | システム定義の色を取得します（ARGB 値は #FFDCDCDC）。 |
| static [get_GhostWhite](./get_ghostwhite/)() | システム定義の色を取得します（ARGB 値は #FFF8F8FF）。 |
| static [get_Gold](./get_gold/)() | システム定義の色を取得します（ARGB 値は #FFFFD700）。 |
| static [get_Goldenrod](./get_goldenrod/)() | ARGB 値 #FFDAA520 を持つシステム定義の色を取得します。 |
| static [get_Gray](./get_gray/)() | ARGB 値 #FF808080 を持つシステム定義の色を取得します。 |
| static [get_Green](./get_green/)() | ARGB 値 #FF008000 を持つシステム定義の色を取得します。 |
| static [get_GreenYellow](./get_greenyellow/)() | ARGB 値 #FFADFF2F を持つシステム定義の色を取得します。 |
| static [get_Honeydew](./get_honeydew/)() | ARGB 値 #FFF0FFF0 を持つシステム定義の色を取得します。 |
| static [get_HotPink](./get_hotpink/)() | ARGB 値 #FFFF69B4 を持つシステム定義の色を取得します。 |
| static [get_IndianRed](./get_indianred/)() | ARGB 値 #FFCD5C5C を持つシステム定義の色を取得します。 |
| static [get_Indigo](./get_indigo/)() | ARGB 値 #FF4B0082 を持つシステム定義の色を取得します。 |
| [get_IsEmpty](./get_isempty/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体が初期化されていないかどうかを指定します。 |
| [get_IsNamedColor](./get_isnamedcolor/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体が名前付きの色であるか、または [T:System::Drawing::KnownColor](../) 列挙体のメンバーであるかを示す値を取得します。 |
| static [get_Ivory](./get_ivory/)() | ARGB 値 #FFFFFFF0 を持つシステム定義の色を取得します。 |
| static [get_Khaki](./get_khaki/)() | ARGB 値 #FFF0E68C を持つシステム定義の色を取得します。 |
| static [get_Lavender](./get_lavender/)() | ARGB 値 #FFE6E6FA を持つシステム定義の色を取得します。 |
| static [get_LavenderBlush](./get_lavenderblush/)() | ARGB 値 #FFFFF0F5 を持つシステム定義の色を取得します。 |
| static [get_LawnGreen](./get_lawngreen/)() | ARGB 値 #FF7CFC00 を持つシステム定義の色を取得します。 |
| static [get_LemonChiffon](./get_lemonchiffon/)() | ARGB 値 #FFFFFACD を持つシステム定義の色を取得します。 |
| static [get_LightBlue](./get_lightblue/)() | ARGB 値 #FFADD8E6 を持つシステム定義の色を取得します。 |
| static [get_LightCoral](./get_lightcoral/)() | ARGB 値 #FFF08080 を持つシステム定義の色を取得します。 |
| static [get_LightCyan](./get_lightcyan/)() | ARGB 値 #FFE0FFFF を持つシステム定義の色を取得します。 |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | ARGB 値 #FFFAFAD2 を持つシステム定義の色を取得します。 |
| static [get_LightGray](./get_lightgray/)() | ARGB 値 #FFD3D3D3 を持つシステム定義の色を取得します。 |
| static [get_LightGreen](./get_lightgreen/)() | ARGB 値 #FF90EE90 を持つシステム定義の色を取得します。 |
| static [get_LightPink](./get_lightpink/)() | ARGB 値 #FFFFB6C1 を持つシステム定義の色を取得します。 |
| static [get_LightSalmon](./get_lightsalmon/)() | ARGB 値 #FFFFA07A を持つシステム定義の色を取得します。 |
| static [get_LightSeaGreen](./get_lightseagreen/)() | ARGB 値 #FF20B2AA を持つシステム定義の色を取得します。 |
| static [get_LightSkyBlue](./get_lightskyblue/)() | ARGB 値が #FF87CEFA のシステム定義色を取得します。 |
| static [get_LightSlateGray](./get_lightslategray/)() | ARGB 値が #FF778899 のシステム定義色を取得します。 |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | ARGB 値が #FFB0C4DE のシステム定義色を取得します。 |
| static [get_LightYellow](./get_lightyellow/)() | ARGB 値が #FFFFFFE0 のシステム定義色を取得します。 |
| static [get_Lime](./get_lime/)() | ARGB 値が #FF00FF00 のシステム定義色を取得します。 |
| static [get_LimeGreen](./get_limegreen/)() | ARGB 値が #FF32CD32 のシステム定義色を取得します。 |
| static [get_Linen](./get_linen/)() | ARGB 値が #FFFAF0E6 のシステム定義色を取得します。 |
| static [get_Magenta](./get_magenta/)() | システム定義の色を取得します（ARGB 値は #FFFF00FF）。 |
| static [get_Maroon](./get_maroon/)() | ARGB 値が #FF800000 のシステム定義色を取得します。 |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | ARGB 値が #FF66CDAA のシステム定義色を取得します。 |
| static [get_MediumBlue](./get_mediumblue/)() | ARGB 値が #FF0000CD のシステム定義色を取得します。 |
| static [get_MediumOrchid](./get_mediumorchid/)() | ARGB 値が #FFBA55D3 のシステム定義色を取得します。 |
| static [get_MediumPurple](./get_mediumpurple/)() | ARGB 値が #FF9370DB のシステム定義色を取得します。 |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | ARGB 値が #FF3CB371 のシステム定義色を取得します。 |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | ARGB 値が #FF7B68EE のシステム定義色を取得します。 |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | ARGB 値が #FF00FA9A のシステム定義色を取得します。 |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | ARGB 値が #FF48D1CC のシステム定義色を取得します。 |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | ARGB 値が #FFC71585 のシステム定義色を取得します。 |
| static [get_MidnightBlue](./get_midnightblue/)() | ARGB 値が #FF191970 のシステム定義色を取得します。 |
| static [get_MintCream](./get_mintcream/)() | ARGB 値が #FFF5FFFA のシステム定義色を取得します。 |
| static [get_MistyRose](./get_mistyrose/)() | ARGB 値が #FFFFE4E1 のシステム定義色を取得します。 |
| static [get_Moccasin](./get_moccasin/)() | ARGB 値が #FFFFE4B5 のシステム定義色を取得します。 |
| [get_Name](./get_name/)() | この [T:Aspose::Page::Drawing::Color](../) の名前を取得します。 |
| static [get_NavajoWhite](./get_navajowhite/)() | ARGB 値が #FFFFDEAD のシステム定義色を取得します。 |
| static [get_Navy](./get_navy/)() | ARGB 値が #FF000080 のシステム定義色を取得します。 |
| static [get_OldLace](./get_oldlace/)() | ARGB 値が #FFFDF5E6 のシステム定義色を取得します。 |
| static [get_Olive](./get_olive/)() | ARGB 値が #FF808000 のシステム定義の色を取得します。 |
| static [get_OliveDrab](./get_olivedrab/)() | ARGB 値が #FF6B8E23 のシステム定義の色を取得します。 |
| static [get_Orange](./get_orange/)() | ARGB 値が #FFFFA500 のシステム定義の色を取得します。 |
| static [get_OrangeRed](./get_orangered/)() | ARGB 値が #FFFF4500 のシステム定義の色を取得します。 |
| static [get_Orchid](./get_orchid/)() | ARGB 値が #FFDA70D6 のシステム定義の色を取得します。 |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | ARGB 値が #FFEEE8AA のシステム定義の色を取得します。 |
| static [get_PaleGreen](./get_palegreen/)() | ARGB 値が #FF98FB98 のシステム定義の色を取得します。 |
| static [get_PaleTurquoise](./get_paleturquoise/)() | ARGB 値が #FFAFEEEE のシステム定義の色を取得します。 |
| static [get_PaleVioletRed](./get_palevioletred/)() | ARGB 値が #FFDB7093 のシステム定義の色を取得します。 |
| static [get_PapayaWhip](./get_papayawhip/)() | ARGB 値が #FFFFEFD5 のシステム定義の色を取得します。 |
| static [get_PeachPuff](./get_peachpuff/)() | ARGB 値が #FFFFDAB9 のシステム定義の色を取得します。 |
| static [get_Peru](./get_peru/)() | ARGB 値が #FFCD853F のシステム定義の色を取得します。 |
| static [get_Pink](./get_pink/)() | ARGB 値が #FFFFC0CB のシステム定義の色を取得します。 |
| static [get_Plum](./get_plum/)() | ARGB 値が #FFDDA0DD のシステム定義の色を取得します。 |
| static [get_PowderBlue](./get_powderblue/)() | ARGB 値が #FFB0E0E6 のシステム定義の色を取得します。 |
| static [get_Purple](./get_purple/)() | ARGB 値が #FF800080 のシステム定義の色を取得します。 |
| [get_R](./get_r/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の赤成分の値を取得します。 |
| static [get_Red](./get_red/)() | ARGB 値が #FFFF0000 のシステム定義の色を取得します。 |
| static [get_RosyBrown](./get_rosybrown/)() | ARGB 値が #FFBC8F8F のシステム定義の色を取得します。 |
| static [get_RoyalBlue](./get_royalblue/)() | ARGB 値が #FF4169E1 のシステム定義の色を取得します。 |
| static [get_SaddleBrown](./get_saddlebrown/)() | ARGB 値が #FF8B4513 のシステム定義の色を取得します。 |
| static [get_Salmon](./get_salmon/)() | ARGB 値が #FFFA8072 のシステム定義の色を取得します。 |
| static [get_SandyBrown](./get_sandybrown/)() | ARGB 値が #FFF4A460 のシステム定義の色を取得します。 |
| static [get_SeaGreen](./get_seagreen/)() | ARGB 値が #FF2E8B57 のシステム定義の色を取得します。 |
| static [get_SeaShell](./get_seashell/)() | ARGB 値が #FFFFF5EE のシステム定義の色を取得します。 |
| static [get_Sienna](./get_sienna/)() | システム定義の色を取得します（ARGB 値は #FFA0522D）。 |
| static [get_Silver](./get_silver/)() | システム定義の色を取得します（ARGB 値は #FFC0C0C0）。 |
| static [get_SkyBlue](./get_skyblue/)() | システム定義の色を取得します（ARGB 値は #FF87CEEB）。 |
| static [get_SlateBlue](./get_slateblue/)() | システム定義の色を取得します（ARGB 値は #FF6A5ACD）。 |
| static [get_SlateGray](./get_slategray/)() | システム定義の色を取得します（ARGB 値は #FF708090）。 |
| static [get_Snow](./get_snow/)() | システム定義の色を取得します（ARGB 値は #FFFFFAFA）。 |
| static [get_SpringGreen](./get_springgreen/)() | システム定義の色を取得します（ARGB 値は #FF00FF7F）。 |
| static [get_SteelBlue](./get_steelblue/)() | システム定義の色を取得します（ARGB 値は #FF4682B4）。 |
| static [get_Tan](./get_tan/)() | システム定義の色を取得します（ARGB 値は #FFD2B48C）。 |
| static [get_Teal](./get_teal/)() | システム定義の色を取得します（ARGB 値は #FF008080）。 |
| static [get_Thistle](./get_thistle/)() | システム定義の色を取得します（ARGB 値は #FFD8BFD8）。 |
| static [get_Tomato](./get_tomato/)() | システム定義の色を取得します（ARGB 値は #FFFF6347）。 |
| static [get_Transparent](./get_transparent/)() | システム定義の色を取得します。 |
| static [get_Turquoise](./get_turquoise/)() | システム定義の色を取得します（ARGB 値は #FF40E0D0）。 |
| static [get_Violet](./get_violet/)() | システム定義の色を取得します（ARGB 値は #FFEE82EE）。 |
| static [get_Wheat](./get_wheat/)() | システム定義の色を取得します（ARGB 値は #FFF5DEB3）。 |
| static [get_White](./get_white/)() | システム定義の色を取得します（ARGB 値は #FFFFFFFF）。 |
| static [get_WhiteSmoke](./get_whitesmoke/)() | システム定義の色を取得します（ARGB 値は #FFF5F5F5）。 |
| static [get_Yellow](./get_yellow/)() | システム定義の色を取得します（ARGB 値は #FFFFFF00）。 |
| static [get_YellowGreen](./get_yellowgreen/)() | システム定義の色を取得します（ARGB 値は #FF9ACD32）。 |
| [GetBrightness](./getbrightness/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の色相・彩度・明度 (HSB) の明度値を取得します。 |
| [GetHashCode](./gethashcode/)() const override | この [T:Aspose::Page::Drawing::Color](../) 構造体のハッシュコードを返します。 |
| [GetHue](./gethue/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の色相・彩度・明度 (HSB) の色相値（度単位）を取得します。 |
| [GetSaturation](./getsaturation/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の色相・彩度・明度 (HSB) の彩度値を取得します。 |
| [ToArgb](./toargb/)() | この [T:Aspose::Page::Drawing::Color](../) 構造体の 32 ビット ARGB 値を取得します。 |
| [ToString](./tostring/)() const override | この [T:Aspose::Page::Drawing::Color](../) 構造体を人が読みやすい文字列に変換します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | null のカラーを表します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
