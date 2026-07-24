---
title: "System::Drawing::Color 클래스"
linktitle: "Color"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Color 클래스. 색을 나타냅니다. 이 타입은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 500
url: /ko/cpp/system.drawing/color/
---
## Color class


색을 나타냅니다. 이 타입은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../../system/smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
class Color
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Color](./color/)() | [Color](./) 클래스의 "empty" 인스턴스를 생성하며, 이는 어떤 색도 나타내지 않습니다. |
| [Equals](./equals/)(const Color\&) const | 현재 [Color](./) 객체와 지정된 객체가 동일한 색을 나타내는지 확인합니다. |
| static [FromArgb](./fromargb/)(int) | [Color](./) 클래스의 인스턴스를 생성하며, 지정된 색을 나타냅니다. |
| static [FromArgb](./fromargb/)(int, int, int, int) | [Color](./) 클래스의 인스턴스를 생성하며, 지정된 색을 나타냅니다. |
| static [FromArgb](./fromargb/)(int, int, int) | [Color](./) 클래스의 인스턴스를 생성하며, 알파 구성 요소가 0xFF로 설정된 지정된 색을 나타냅니다. |
| static [FromArgb](./fromargb/)(int, Color) | [Color](./) 클래스의 인스턴스를 생성하며, 지정된 색을 나타냅니다. |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | [Color](./) 클래스의 인스턴스를 생성하며, 지정된 알려진 색을 나타냅니다. |
| static [FromName](./fromname/)(const String\&) | [Color](./) 클래스의 인스턴스를 생성하며, 지정된 이름을 가진 색을 나타냅니다. |
| [get_A](./get_a/)() const | 현재 객체가 나타내는 색의 알파 구성 요소 값을 반환합니다. |
| static [get_AliceBlue](./get_aliceblue/)() | 16진수 표기법으로 ARGB 값이 #FFF0F8FF인 색상을 반환합니다. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | 16진수 표기법으로 ARGB 값이 #FFFAEBD7인 색상을 반환합니다. |
| static [get_Aqua](./get_aqua/)() | 16진수 표기법으로 ARGB 값이 #FF00FFFF인 색상을 반환합니다. |
| static [get_Aquamarine](./get_aquamarine/)() | 16진수 표기법으로 ARGB 값이 #FF7FFFD4인 색상을 반환합니다. |
| static [get_Azure](./get_azure/)() | 16진수 표기법으로 ARGB 값이 #FFF0FFFF인 색상을 반환합니다. |
| [get_B](./get_b/)() const | 현재 객체가 나타내는 색상의 파란색 구성 요소 값을 반환합니다. |
| static [get_Beige](./get_beige/)() | 16진수 표기법으로 ARGB 값이 #FFF5F5DC인 색상을 반환합니다. |
| static [get_Bisque](./get_bisque/)() | 16진수 표기법으로 ARGB 값이 #FFFFE4C4인 색상을 반환합니다. |
| static [get_Black](./get_black/)() | 16진수 표기법으로 ARGB 값이 #FF000000인 색상을 반환합니다. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | 16진수 표기법으로 ARGB 값이 #FFFFEBCD인 색상을 반환합니다. |
| static [get_Blue](./get_blue/)() | 16진수 표기법으로 ARGB 값이 #FF0000FF인 색상을 반환합니다. |
| static [get_BlueViolet](./get_blueviolet/)() | 16진수 표기법으로 ARGB 값이 #FF8A2BE2인 색상을 반환합니다. |
| static [get_Brown](./get_brown/)() | 16진수 표기법으로 ARGB 값이 #FFA52A2A인 색상을 반환합니다. |
| static [get_BurlyWood](./get_burlywood/)() | 16진수 표기법으로 ARGB 값이 #FFDEB887인 색상을 반환합니다. |
| static [get_CadetBlue](./get_cadetblue/)() | 16진수 표기법으로 ARGB 값이 #FF5F9EA0인 색상을 반환합니다. |
| static [get_Chartreuse](./get_chartreuse/)() | 16진수 표기법으로 ARGB 값이 #FF7FFF00인 색상을 반환합니다. |
| static [get_Chocolate](./get_chocolate/)() | 16진수 표기법으로 ARGB 값이 #FFD2691E인 색상을 반환합니다. |
| static [get_Coral](./get_coral/)() | 16진수 표기법으로 ARGB 값이 #FFFF7F50인 색상을 반환합니다. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | 16진수 표기법으로 ARGB 값이 #FF6495ED인 색상을 반환합니다. |
| static [get_Cornsilk](./get_cornsilk/)() | 16진수 표기법으로 ARGB 값이 #FFFFF8DC인 색상을 반환합니다. |
| static [get_Crimson](./get_crimson/)() | 16진수 표기법으로 ARGB 값이 #FFDC143C인 색상을 반환합니다. |
| static [get_Cyan](./get_cyan/)() | 16진수 표기법으로 ARGB 값이 #FF00FFFF인 색상을 반환합니다. |
| static [get_DarkBlue](./get_darkblue/)() | 16진수 표기법으로 ARGB 값이 #FF00008B인 색상을 반환합니다. |
| static [get_DarkCyan](./get_darkcyan/)() | 16진수 표기법으로 ARGB 값이 #FF008B8B인 색상을 반환합니다. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | 16진수 표기법으로 ARGB 값이 #FFB8860B인 색상을 반환합니다. |
| static [get_DarkGray](./get_darkgray/)() | 16진수 표기법으로 ARGB 값이 #FFA9A9A9인 색상을 반환합니다. |
| static [get_DarkGreen](./get_darkgreen/)() | 16진수 표기법으로 ARGB 값이 #FF006400인 색을 반환합니다. |
| static [get_DarkKhaki](./get_darkkhaki/)() | 16진수 표기법으로 ARGB 값이 #FFBDB76B인 색을 반환합니다. |
| static [get_DarkMagenta](./get_darkmagenta/)() | 16진수 표기법으로 ARGB 값이 #FF8B008B인 색을 반환합니다. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | 16진수 표기법으로 ARGB 값이 #FF556B2F인 색을 반환합니다. |
| static [get_DarkOrange](./get_darkorange/)() | 16진수 표기법으로 ARGB 값이 #FFFF8C00인 색을 반환합니다. |
| static [get_DarkOrchid](./get_darkorchid/)() | 16진수 표기법으로 ARGB 값이 #FF9932CC인 색을 반환합니다. |
| static [get_DarkRed](./get_darkred/)() | 16진수 표기법으로 ARGB 값이 #FF8B0000인 색을 반환합니다. |
| static [get_DarkSalmon](./get_darksalmon/)() | 16진수 표기법으로 ARGB 값이 #FFE9967A인 색을 반환합니다. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | 16진수 표기법으로 ARGB 값이 #FF8FBC8F인 색을 반환합니다. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | 16진수 표기법으로 ARGB 값이 #FF483D8B인 색을 반환합니다. |
| static [get_DarkSlateGray](./get_darkslategray/)() | 16진수 표기법으로 ARGB 값이 #FF2F4F4F인 색을 반환합니다. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | 16진수 표기법으로 ARGB 값이 #FF00CED1인 색을 반환합니다. |
| static [get_DarkViolet](./get_darkviolet/)() | 16진수 표기법으로 ARGB 값이 #FF9400D3인 색을 반환합니다. |
| static [get_DeepPink](./get_deeppink/)() | 16진수 표기법으로 ARGB 값이 #FFFF1493인 색을 반환합니다. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | 16진수 표기법으로 ARGB 값이 #FF00BFFF인 색을 반환합니다. |
| static [get_DimGray](./get_dimgray/)() | 16진수 표기법으로 ARGB 값이 #FF696969인 색을 반환합니다. |
| static [get_DodgerBlue](./get_dodgerblue/)() | 16진수 표기법으로 ARGB 값이 #FF1E90FF인 색을 반환합니다. |
| static [get_Firebrick](./get_firebrick/)() | 16진수 표기법으로 ARGB 값이 #FFB22222인 색을 반환합니다. |
| static [get_FloralWhite](./get_floralwhite/)() | 16진수 표기법으로 ARGB 값이 #FFFFFAF0인 색을 반환합니다. |
| static [get_ForestGreen](./get_forestgreen/)() | 16진수 표기법으로 ARGB 값이 #FF228B22인 색을 반환합니다. |
| static [get_Fuchsia](./get_fuchsia/)() | 16진수 표기법으로 ARGB 값이 #FFFF00FF인 색을 반환합니다. |
| [get_G](./get_g/)() const | 현재 객체가 나타내는 색상의 녹색 구성 요소 값을 반환합니다. |
| static [get_Gainsboro](./get_gainsboro/)() | 16진수 표기법으로 ARGB 값이 #FFDCDCDC인 색을 반환합니다. |
| static [get_GhostWhite](./get_ghostwhite/)() | 16진수 표기법으로 ARGB 값이 #FFF8F8FF인 색을 반환합니다. |
| static [get_Gold](./get_gold/)() | 16진수 표기법으로 ARGB 값이 #FFFFD700인 색을 반환합니다. |
| static [get_Goldenrod](./get_goldenrod/)() | 16진수 표기법으로 ARGB 값이 #FFDAA520인 색상을 반환합니다. |
| static [get_Gray](./get_gray/)() | 16진수 표기법으로 ARGB 값이 #FF808080인 색상을 반환합니다. |
| static [get_Green](./get_green/)() | 16진수 표기법으로 ARGB 값이 #FF008000인 색상을 반환합니다. |
| static [get_GreenYellow](./get_greenyellow/)() | 16진수 표기법으로 ARGB 값이 #FFADFF2F인 색상을 반환합니다. |
| static [get_Honeydew](./get_honeydew/)() | 16진수 표기법으로 ARGB 값이 #FFF0FFF0인 색상을 반환합니다. |
| static [get_HotPink](./get_hotpink/)() | 16진수 표기법으로 ARGB 값이 #FFFF69B4인 색상을 반환합니다. |
| static [get_IndianRed](./get_indianred/)() | 16진수 표기법으로 ARGB 값이 #FFCD5C5C인 색상을 반환합니다. |
| static [get_Indigo](./get_indigo/)() | 16진수 표기법으로 ARGB 값이 #FF4B0082인 색상을 반환합니다. |
| [get_IsEmpty](./get_isempty/)() const | 현재 객체가 "empty"인지, 즉 어떤 색도 나타내지 않는지를 나타내는 값을 반환합니다. |
| [get_IsNamedColor](./get_isnamedcolor/)() const | 값을 반환하여 [Color](./) 구조가 명명된 색상을 나타내는지 또는 [KnownColor](../knowncolor/) 열거형의 멤버인지 여부를 결정합니다. |
| static [get_Ivory](./get_ivory/)() | 16진수 표기법으로 ARGB 값이 #FFFFFFF0인 색상을 반환합니다. |
| static [get_Khaki](./get_khaki/)() | 16진수 표기법으로 ARGB 값이 #FFF0E68C인 색상을 반환합니다. |
| static [get_Lavender](./get_lavender/)() | 16진수 표기법으로 ARGB 값이 #FFE6E6FA인 색상을 반환합니다. |
| static [get_LavenderBlush](./get_lavenderblush/)() | 16진수 표기법으로 ARGB 값이 #FFFFF0F5인 색상을 반환합니다. |
| static [get_LawnGreen](./get_lawngreen/)() | 16진수 표기법으로 ARGB 값이 #FF7CFC00인 색상을 반환합니다. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | 16진수 표기법으로 ARGB 값이 #FFFFFACD인 색상을 반환합니다. |
| static [get_LightBlue](./get_lightblue/)() | 16진수 표기법으로 ARGB 값이 #FFADD8E6인 색상을 반환합니다. |
| static [get_LightCoral](./get_lightcoral/)() | 16진수 표기법으로 ARGB 값이 #FFF08080인 색상을 반환합니다. |
| static [get_LightCyan](./get_lightcyan/)() | 16진수 표기법으로 ARGB 값이 #FFE0FFFF인 색상을 반환합니다. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | 16진수 표기법으로 ARGB 값이 #FFFAFAD2인 색상을 반환합니다. |
| static [get_LightGray](./get_lightgray/)() | 16진수 표기법으로 ARGB 값이 #FFD3D3D3인 색상을 반환합니다. |
| static [get_LightGreen](./get_lightgreen/)() | 16진수 표기법으로 ARGB 값이 #FF90EE90인 색상을 반환합니다. |
| static [get_LightPink](./get_lightpink/)() | 16진수 표기법으로 ARGB 값이 #FFFFB6C1인 색상을 반환합니다. |
| static [get_LightSalmon](./get_lightsalmon/)() | 16진수 표기법으로 ARGB 값이 #FFFFA07A인 색상을 반환합니다. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | 16진수 표기법으로 ARGB 값이 #FF20B2AA인 색상을 반환합니다. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | ARGB 값이 16진수 표기법으로 #FF87CEFA인 색상을 반환합니다. |
| static [get_LightSlateGray](./get_lightslategray/)() | ARGB 값이 16진수 표기법으로 #FF778899인 색상을 반환합니다. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | ARGB 값이 16진수 표기법으로 #FFB0C4DE인 색상을 반환합니다. |
| static [get_LightYellow](./get_lightyellow/)() | ARGB 값이 16진수 표기법으로 #FFFFFFE0인 색상을 반환합니다. |
| static [get_Lime](./get_lime/)() | ARGB 값이 16진수 표기법으로 #FF00FF00인 색상을 반환합니다. |
| static [get_LimeGreen](./get_limegreen/)() | ARGB 값이 16진수 표기법으로 #FF32CD32인 색상을 반환합니다. |
| static [get_Linen](./get_linen/)() | ARGB 값이 16진수 표기법으로 #FFFAF0E6인 색상을 반환합니다. |
| static [get_Magenta](./get_magenta/)() | 16진수 표기법으로 ARGB 값이 #FFFF00FF인 색을 반환합니다. |
| static [get_Maroon](./get_maroon/)() | ARGB 값이 16진수 표기법으로 #FF800000인 색상을 반환합니다. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | ARGB 값이 16진수 표기법으로 #FF66CDAA인 색상을 반환합니다. |
| static [get_MediumBlue](./get_mediumblue/)() | ARGB 값이 16진수 표기법으로 #FF0000CD인 색상을 반환합니다. |
| static [get_MediumOrchid](./get_mediumorchid/)() | ARGB 값이 16진수 표기법으로 #FFBA55D3인 색상을 반환합니다. |
| static [get_MediumPurple](./get_mediumpurple/)() | ARGB 값이 16진수 표기법으로 #FF9370DB인 색상을 반환합니다. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | ARGB 값이 16진수 표기법으로 #FF3CB371인 색상을 반환합니다. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | ARGB 값이 16진수 표기법으로 #FF7B68EE인 색상을 반환합니다. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | ARGB 값이 16진수 표기법으로 #FF00FA9A인 색상을 반환합니다. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | ARGB 값이 16진수 표기법으로 #FF48D1CC인 색상을 반환합니다. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | ARGB 값이 16진수 표기법으로 #FFC71585인 색상을 반환합니다. |
| static [get_MidnightBlue](./get_midnightblue/)() | ARGB 값이 16진수 표기법으로 #FF191970인 색상을 반환합니다. |
| static [get_MintCream](./get_mintcream/)() | ARGB 값이 16진수 표기법으로 #FFF5FFFA인 색상을 반환합니다. |
| static [get_MistyRose](./get_mistyrose/)() | ARGB 값이 16진수 표기법으로 #FFFFE4E1인 색상을 반환합니다. |
| static [get_Moccasin](./get_moccasin/)() | ARGB 값이 16진수 표기법으로 #FFFFE4B5인 색상을 반환합니다. |
| [get_Name](./get_name/)() const | 현재 객체가 나타내는 색상의 이름을 반환합니다. |
| static [get_NavajoWhite](./get_navajowhite/)() | ARGB 값이 16진수 표기법으로 #FFFFDEAD인 색상을 반환합니다. |
| static [get_Navy](./get_navy/)() | ARGB 값이 16진수 표기법으로 #FF000080인 색상을 반환합니다. |
| static [get_OldLace](./get_oldlace/)() | ARGB 값이 16진수 표기법으로 #FFFDF5E6인 색상을 반환합니다. |
| static [get_Olive](./get_olive/)() | 16진수 표기법으로 ARGB 값이 #FF808000인 색상을 반환합니다. |
| static [get_OliveDrab](./get_olivedrab/)() | 16진수 표기법으로 ARGB 값이 #FF6B8E23인 색상을 반환합니다. |
| static [get_Orange](./get_orange/)() | 16진수 표기법으로 ARGB 값이 #FFFFA500인 색상을 반환합니다. |
| static [get_OrangeRed](./get_orangered/)() | 16진수 표기법으로 ARGB 값이 #FFFF4500인 색상을 반환합니다. |
| static [get_Orchid](./get_orchid/)() | 16진수 표기법으로 ARGB 값이 #FFDA70D6인 색상을 반환합니다. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | 16진수 표기법으로 ARGB 값이 #FFEEE8AA인 색상을 반환합니다. |
| static [get_PaleGreen](./get_palegreen/)() | 16진수 표기법으로 ARGB 값이 #FF98FB98인 색상을 반환합니다. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | 16진수 표기법으로 ARGB 값이 #FFAFEEEE인 색상을 반환합니다. |
| static [get_PaleVioletRed](./get_palevioletred/)() | 16진수 표기법으로 ARGB 값이 #FFDB7093인 색상을 반환합니다. |
| static [get_PapayaWhip](./get_papayawhip/)() | 16진수 표기법으로 ARGB 값이 #FFFFEFD5인 색상을 반환합니다. |
| static [get_PeachPuff](./get_peachpuff/)() | 16진수 표기법으로 ARGB 값이 #FFFFDAB9인 색상을 반환합니다. |
| static [get_Peru](./get_peru/)() | 16진수 표기법으로 ARGB 값이 #FFCD853F인 색상을 반환합니다. |
| static [get_Pink](./get_pink/)() | 16진수 표기법으로 ARGB 값이 #FFFFC0CB인 색상을 반환합니다. |
| static [get_Plum](./get_plum/)() | 16진수 표기법으로 ARGB 값이 #FFDDA0DD인 색상을 반환합니다. |
| static [get_PowderBlue](./get_powderblue/)() | 16진수 표기법으로 ARGB 값이 #FFB0E0E6인 색상을 반환합니다. |
| static [get_Purple](./get_purple/)() | 16진수 표기법으로 ARGB 값이 #FF800080인 색상을 반환합니다. |
| [get_R](./get_r/)() const | 현재 객체가 나타내는 색상의 빨간색 구성 요소 값을 반환합니다. |
| static [get_Red](./get_red/)() | 16진수 표기법으로 ARGB 값이 #FFFF0000인 색상을 반환합니다. |
| static [get_RosyBrown](./get_rosybrown/)() | 16진수 표기법으로 ARGB 값이 #FFBC8F8F인 색상을 반환합니다. |
| static [get_RoyalBlue](./get_royalblue/)() | 16진수 표기법으로 ARGB 값이 #FF4169E1인 색상을 반환합니다. |
| static [get_SaddleBrown](./get_saddlebrown/)() | 16진수 표기법으로 ARGB 값이 #FF8B4513인 색상을 반환합니다. |
| static [get_Salmon](./get_salmon/)() | 16진수 표기법으로 ARGB 값이 #FFFA8072인 색상을 반환합니다. |
| static [get_SandyBrown](./get_sandybrown/)() | 16진수 표기법으로 ARGB 값이 #FFF4A460인 색상을 반환합니다. |
| static [get_SeaGreen](./get_seagreen/)() | 16진수 표기법으로 ARGB 값이 #FF2E8B57인 색상을 반환합니다. |
| static [get_SeaShell](./get_seashell/)() | 16진수 표기법으로 ARGB 값이 #FFFFF5EE인 색상을 반환합니다. |
| static [get_Sienna](./get_sienna/)() | ARGB 값이 16진수 표기법으로 #FFA0522D인 색을 반환합니다. |
| static [get_Silver](./get_silver/)() | ARGB 값이 16진수 표기법으로 #FFC0C0C0인 색을 반환합니다. |
| static [get_SkyBlue](./get_skyblue/)() | ARGB 값이 16진수 표기법으로 #FF87CEEB인 색을 반환합니다. |
| static [get_SlateBlue](./get_slateblue/)() | ARGB 값이 16진수 표기법으로 #FF6A5ACD인 색을 반환합니다. |
| static [get_SlateGray](./get_slategray/)() | ARGB 값이 16진수 표기법으로 #FF708090인 색을 반환합니다. |
| static [get_Snow](./get_snow/)() | ARGB 값이 16진수 표기법으로 #FFFFFAFA인 색을 반환합니다. |
| static [get_SpringGreen](./get_springgreen/)() | ARGB 값이 16진수 표기법으로 #FF00FF7F인 색을 반환합니다. |
| static [get_SteelBlue](./get_steelblue/)() | ARGB 값이 16진수 표기법으로 #FF4682B4인 색을 반환합니다. |
| static [get_Tan](./get_tan/)() | ARGB 값이 16진수 표기법으로 #FFD2B48C인 색을 반환합니다. |
| static [get_Teal](./get_teal/)() | ARGB 값이 16진수 표기법으로 #FF008080인 색을 반환합니다. |
| static [get_Thistle](./get_thistle/)() | ARGB 값이 16진수 표기법으로 #FFD8BFD8인 색을 반환합니다. |
| static [get_Tomato](./get_tomato/)() | ARGB 값이 16진수 표기법으로 #FFFF6347인 색을 반환합니다. |
| static [get_Transparent](./get_transparent/)() | ARGB 값이 16진수 표기법으로 #00FFFFFF인 색을 반환합니다. |
| static [get_Turquoise](./get_turquoise/)() | ARGB 값이 16진수 표기법으로 #FF40E0D0인 색을 반환합니다. |
| static [get_Violet](./get_violet/)() | ARGB 값이 16진수 표기법으로 #FFEE82EE인 색을 반환합니다. |
| static [get_Wheat](./get_wheat/)() | ARGB 값이 16진수 표기법으로 #FFF5DEB3인 색을 반환합니다. |
| static [get_White](./get_white/)() | ARGB 값이 16진수 표기법으로 #FFFFFFFF인 색을 반환합니다. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | ARGB 값이 16진수 표기법으로 #FFF5F5F5인 색을 반환합니다. |
| static [get_Yellow](./get_yellow/)() | ARGB 값이 16진수 표기법으로 #FFFFFF00인 색을 반환합니다. |
| static [get_YellowGreen](./get_yellowgreen/)() | ARGB 값이 16진수 표기법으로 #FF9ACD32인 색을 반환합니다. |
| [GetBrightness](./getbrightness/)() | 현재 객체가 나타내는 색상의 밝기 구성 요소를 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체의 해시 코드를 반환합니다. |
| [GetHue](./gethue/)() | 현재 객체가 나타내는 색상의 색조-채도-밝기(HSB) 색조 값을 도 단위로 반환합니다. |
| [GetSaturation](./getsaturation/)() | 현재 객체가 나타내는 색상의 색조-채도-밝기(HSB) 채도를 반환합니다. |
| [IsNull](./isnull/)() const | 항상 false를 반환합니다. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | 항상 true를 반환합니다. |
| [operator!=](./operator!=/)(const Color\&) const | 현재 객체와 지정된 [Color](./) 객체가 서로 다른 색을 나타내는지 확인합니다. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | 항상 false를 반환합니다. |
| [operator==](./operator==/)(const Color\&) const | 현재 [Color](./) 객체와 지정된 객체가 동일한 색을 나타내는지 확인합니다. |
| [ToArgb](./toargb/)() const | 현재 객체가 나타내는 색상의 32비트 ARGB 값을 반환합니다. |
| [ToString](./tostring/)() const | 현재 객체의 문자열 표현을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 빈 "empty" 인스턴스인 [Color](./) 클래스, 즉 어떤 색도 나타내지 않는 인스턴스입니다. |
## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
