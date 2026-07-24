---
title: "Aspose::Page::Drawing::Color 클래스"
linktitle: "Color"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Drawing::Color 클래스. C++에서 ARGB(알파, 빨강, 초록, 파랑) 색상을 나타냅니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.drawing/color/
---
## Color class


ARGB (alpha, red, green, blue) 색상을 나타냅니다.

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 이 [Aspose.Page.Drawing.Color](./)을 복제합니다. |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 지정된 객체가 [T:Aspose::Page::Drawing::Color](../) 구조체인지 그리고 이 [T:Aspose::Page::Drawing::Color](../) 구조체와 동등한지 테스트합니다. |
| static [FromArgb](./fromargb/)(int32_t) | 32비트 ARGB 값으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | 네 개의 ARGB 구성 요소(알파, 빨강, 초록, 파랑) 값으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. 이 메서드는 각 구성 요소에 32비트 값을 전달할 수 있지만, 각 구성 요소의 값은 8비트로 제한됩니다. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | 지정된 [T:Aspose::Page::Drawing::Color](../) 구조체와 새로운 알파 값을 사용하여 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. 이 메서드는 알파 값에 32비트 값을 전달할 수 있지만, 값은 8비트로 제한됩니다. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | 지정된 8비트 색상 값(빨강, 초록, 파랑)으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. 알파 값은 암시적으로 255(완전 불투명)입니다. 이 메서드는 각 색상 구성 요소에 32비트 값을 전달할 수 있지만, 각 구성 요소의 값은 8비트로 제한됩니다. |
| static [FromName](./fromname/)(System::String) | 지정된 사전 정의 색상의 이름으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. |
| [get_A](./get_a/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체의 알파 구성 요소 값을 가져옵니다. |
| static [get_AliceBlue](./get_aliceblue/)() | ARGB 값이 #FFF0F8FF인 시스템 정의 색상을 가져옵니다. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | ARGB 값이 #FFFAEBD7인 시스템 정의 색상을 가져옵니다. |
| static [get_Aqua](./get_aqua/)() | ARGB 값이 #FF00FFFF인 시스템 정의 색상을 가져옵니다. |
| static [get_Aquamarine](./get_aquamarine/)() | ARGB 값이 #FF7FFFD4인 시스템 정의 색상을 가져옵니다. |
| static [get_Azure](./get_azure/)() | ARGB 값이 #FFF0FFFF인 시스템 정의 색상을 가져옵니다. |
| [get_B](./get_b/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조의 파란색 구성 요소 값을 가져옵니다. |
| static [get_Beige](./get_beige/)() | ARGB 값이 #FFF5F5DC인 시스템 정의 색상을 가져옵니다. |
| static [get_Bisque](./get_bisque/)() | ARGB 값이 #FFFFE4C4인 시스템 정의 색상을 가져옵니다. |
| static [get_Black](./get_black/)() | ARGB 값이 #FF000000인 시스템 정의 색상을 가져옵니다. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | ARGB 값이 #FFFFEBCD인 시스템 정의 색상을 가져옵니다. |
| static [get_Blue](./get_blue/)() | ARGB 값이 #FF0000FF인 시스템 정의 색상을 가져옵니다. |
| static [get_BlueViolet](./get_blueviolet/)() | ARGB 값이 #FF8A2BE2인 시스템 정의 색상을 가져옵니다. |
| static [get_Brown](./get_brown/)() | ARGB 값이 #FFA52A2A인 시스템 정의 색상을 가져옵니다. |
| static [get_BurlyWood](./get_burlywood/)() | ARGB 값이 #FFDEB887인 시스템 정의 색상을 가져옵니다. |
| static [get_CadetBlue](./get_cadetblue/)() | ARGB 값이 #FF5F9EA0인 시스템 정의 색상을 가져옵니다. |
| static [get_Chartreuse](./get_chartreuse/)() | ARGB 값이 #FF7FFF00인 시스템 정의 색상을 가져옵니다. |
| static [get_Chocolate](./get_chocolate/)() | ARGB 값이 #FFD2691E인 시스템 정의 색상을 가져옵니다. |
| static [get_Coral](./get_coral/)() | ARGB 값이 #FFFF7F50인 시스템 정의 색상을 가져옵니다. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | ARGB 값이 #FF6495ED인 시스템 정의 색상을 가져옵니다. |
| static [get_Cornsilk](./get_cornsilk/)() | ARGB 값이 #FFFFF8DC인 시스템 정의 색상을 가져옵니다. |
| static [get_Crimson](./get_crimson/)() | ARGB 값이 #FFDC143C인 시스템 정의 색상을 가져옵니다. |
| static [get_Cyan](./get_cyan/)() | ARGB 값이 #FF00FFFF인 시스템 정의 색상을 가져옵니다. |
| static [get_DarkBlue](./get_darkblue/)() | ARGB 값이 #FF00008B인 시스템 정의 색상을 가져옵니다. |
| static [get_DarkCyan](./get_darkcyan/)() | ARGB 값이 #FF008B8B인 시스템 정의 색상을 가져옵니다. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | ARGB 값이 #FFB8860B인 시스템 정의 색상을 가져옵니다. |
| static [get_DarkGray](./get_darkgray/)() | ARGB 값이 #FFA9A9A9인 시스템 정의 색상을 가져옵니다. |
| static [get_DarkGreen](./get_darkgreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF006400입니다. |
| static [get_DarkKhaki](./get_darkkhaki/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFBDB76B입니다. |
| static [get_DarkMagenta](./get_darkmagenta/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF8B008B입니다. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF556B2F입니다. |
| static [get_DarkOrange](./get_darkorange/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF8C00입니다. |
| static [get_DarkOrchid](./get_darkorchid/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF9932CC입니다. |
| static [get_DarkRed](./get_darkred/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF8B0000입니다. |
| static [get_DarkSalmon](./get_darksalmon/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFE9967A입니다. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF8FBC8F입니다. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF483D8B입니다. |
| static [get_DarkSlateGray](./get_darkslategray/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF2F4F4F입니다. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF00CED1입니다. |
| static [get_DarkViolet](./get_darkviolet/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF9400D3입니다. |
| static [get_DeepPink](./get_deeppink/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF1493입니다. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF00BFFF입니다. |
| static [get_DimGray](./get_dimgray/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF696969입니다. |
| static [get_DodgerBlue](./get_dodgerblue/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF1E90FF입니다. |
| static [get_Firebrick](./get_firebrick/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFB22222입니다. |
| static [get_FloralWhite](./get_floralwhite/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFFAF0입니다. |
| static [get_ForestGreen](./get_forestgreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF228B22입니다. |
| static [get_Fuchsia](./get_fuchsia/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF00FF입니다. |
| [get_G](./get_g/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체의 녹색 구성 요소 값을 가져옵니다. |
| static [get_Gainsboro](./get_gainsboro/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFDCDCDC입니다. |
| static [get_GhostWhite](./get_ghostwhite/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFF8F8FF입니다. |
| static [get_Gold](./get_gold/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFD700입니다. |
| static [get_Goldenrod](./get_goldenrod/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFDAA520입니다. |
| static [get_Gray](./get_gray/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF808080입니다. |
| static [get_Green](./get_green/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF008000입니다. |
| static [get_GreenYellow](./get_greenyellow/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFADFF2F입니다. |
| static [get_Honeydew](./get_honeydew/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFF0FFF0입니다. |
| static [get_HotPink](./get_hotpink/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF69B4입니다. |
| static [get_IndianRed](./get_indianred/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFCD5C5C입니다. |
| static [get_Indigo](./get_indigo/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF4B0082입니다. |
| [get_IsEmpty](./get_isempty/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조가 초기화되지 않았는지 지정합니다. |
| [get_IsNamedColor](./get_isnamedcolor/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조가 명명된 색상인지 또는 [T:System::Drawing::KnownColor](../) 열거형의 멤버인지 나타내는 값을 가져옵니다. |
| static [get_Ivory](./get_ivory/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFFFF0입니다. |
| static [get_Khaki](./get_khaki/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFF0E68C입니다. |
| static [get_Lavender](./get_lavender/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFE6E6FA입니다. |
| static [get_LavenderBlush](./get_lavenderblush/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFF0F5입니다. |
| static [get_LawnGreen](./get_lawngreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF7CFC00입니다. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFFACD입니다. |
| static [get_LightBlue](./get_lightblue/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFADD8E6입니다. |
| static [get_LightCoral](./get_lightcoral/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFF08080입니다. |
| static [get_LightCyan](./get_lightcyan/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFE0FFFF입니다. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFAFAD2입니다. |
| static [get_LightGray](./get_lightgray/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFD3D3D3입니다. |
| static [get_LightGreen](./get_lightgreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF90EE90입니다. |
| static [get_LightPink](./get_lightpink/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFB6C1입니다. |
| static [get_LightSalmon](./get_lightsalmon/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFA07A입니다. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF20B2AA입니다. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF87CEFA입니다. |
| static [get_LightSlateGray](./get_lightslategray/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF778899입니다. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFB0C4DE입니다. |
| static [get_LightYellow](./get_lightyellow/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFFFFFE0입니다. |
| static [get_Lime](./get_lime/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF00FF00입니다. |
| static [get_LimeGreen](./get_limegreen/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF32CD32입니다. |
| static [get_Linen](./get_linen/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFFAF0E6입니다. |
| static [get_Magenta](./get_magenta/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF00FF입니다. |
| static [get_Maroon](./get_maroon/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF800000입니다. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF66CDAA입니다. |
| static [get_MediumBlue](./get_mediumblue/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF0000CD입니다. |
| static [get_MediumOrchid](./get_mediumorchid/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFBA55D3입니다. |
| static [get_MediumPurple](./get_mediumpurple/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF9370DB입니다. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF3CB371입니다. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF7B68EE입니다. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF00FA9A입니다. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF48D1CC입니다. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFC71585입니다. |
| static [get_MidnightBlue](./get_midnightblue/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF191970입니다. |
| static [get_MintCream](./get_mintcream/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFF5FFFA입니다. |
| static [get_MistyRose](./get_mistyrose/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFFFE4E1입니다. |
| static [get_Moccasin](./get_moccasin/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFFFE4B5입니다. |
| [get_Name](./get_name/)() | 이 [T:Aspose::Page::Drawing::Color](../)의 이름을 가져옵니다. |
| static [get_NavajoWhite](./get_navajowhite/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFFFDEAD입니다. |
| static [get_Navy](./get_navy/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FF000080입니다. |
| static [get_OldLace](./get_oldlace/)() | 시스템 정의 색상을 가져옵니다. ARGB 값은 #FFFDF5E6입니다. |
| static [get_Olive](./get_olive/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF808000입니다. |
| static [get_OliveDrab](./get_olivedrab/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF6B8E23입니다. |
| static [get_Orange](./get_orange/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFA500입니다. |
| static [get_OrangeRed](./get_orangered/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF4500입니다. |
| static [get_Orchid](./get_orchid/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFDA70D6입니다. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFEEE8AA입니다. |
| static [get_PaleGreen](./get_palegreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF98FB98입니다. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFAFEEEE입니다. |
| static [get_PaleVioletRed](./get_palevioletred/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFDB7093입니다. |
| static [get_PapayaWhip](./get_papayawhip/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFEFD5입니다. |
| static [get_PeachPuff](./get_peachpuff/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFDAB9입니다. |
| static [get_Peru](./get_peru/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFCD853F입니다. |
| static [get_Pink](./get_pink/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFC0CB입니다. |
| static [get_Plum](./get_plum/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFDDA0DD입니다. |
| static [get_PowderBlue](./get_powderblue/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFB0E0E6입니다. |
| static [get_Purple](./get_purple/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF800080입니다. |
| [get_R](./get_r/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체의 빨간색 구성 요소 값을 가져옵니다. |
| static [get_Red](./get_red/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFF0000입니다. |
| static [get_RosyBrown](./get_rosybrown/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFBC8F8F입니다. |
| static [get_RoyalBlue](./get_royalblue/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF4169E1입니다. |
| static [get_SaddleBrown](./get_saddlebrown/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF8B4513입니다. |
| static [get_Salmon](./get_salmon/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFA8072입니다. |
| static [get_SandyBrown](./get_sandybrown/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFF4A460입니다. |
| static [get_SeaGreen](./get_seagreen/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FF2E8B57입니다. |
| static [get_SeaShell](./get_seashell/)() | 시스템 정의 색상을 가져오며 ARGB 값은 #FFFFF5EE입니다. |
| static [get_Sienna](./get_sienna/)() | ARGB 값이 #FFA0522D인 시스템 정의 색상을 가져옵니다. |
| static [get_Silver](./get_silver/)() | ARGB 값이 #FFC0C0C0인 시스템 정의 색상을 가져옵니다. |
| static [get_SkyBlue](./get_skyblue/)() | ARGB 값이 #FF87CEEB인 시스템 정의 색상을 가져옵니다. |
| static [get_SlateBlue](./get_slateblue/)() | ARGB 값이 #FF6A5ACD인 시스템 정의 색상을 가져옵니다. |
| static [get_SlateGray](./get_slategray/)() | ARGB 값이 #FF708090인 시스템 정의 색상을 가져옵니다. |
| static [get_Snow](./get_snow/)() | ARGB 값이 #FFFFFAFA인 시스템 정의 색상을 가져옵니다. |
| static [get_SpringGreen](./get_springgreen/)() | ARGB 값이 #FF00FF7F인 시스템 정의 색상을 가져옵니다. |
| static [get_SteelBlue](./get_steelblue/)() | ARGB 값이 #FF4682B4인 시스템 정의 색상을 가져옵니다. |
| static [get_Tan](./get_tan/)() | ARGB 값이 #FFD2B48C인 시스템 정의 색상을 가져옵니다. |
| static [get_Teal](./get_teal/)() | ARGB 값이 #FF008080인 시스템 정의 색상을 가져옵니다. |
| static [get_Thistle](./get_thistle/)() | ARGB 값이 #FFD8BFD8인 시스템 정의 색상을 가져옵니다. |
| static [get_Tomato](./get_tomato/)() | ARGB 값이 #FFFF6347인 시스템 정의 색상을 가져옵니다. |
| static [get_Transparent](./get_transparent/)() | 시스템 정의 색상을 가져옵니다. |
| static [get_Turquoise](./get_turquoise/)() | ARGB 값이 #FF40E0D0인 시스템 정의 색상을 가져옵니다. |
| static [get_Violet](./get_violet/)() | ARGB 값이 #FFEE82EE인 시스템 정의 색상을 가져옵니다. |
| static [get_Wheat](./get_wheat/)() | ARGB 값이 #FFF5DEB3인 시스템 정의 색상을 가져옵니다. |
| static [get_White](./get_white/)() | ARGB 값이 #FFFFFFFF인 시스템 정의 색상을 가져옵니다. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | ARGB 값이 #FFF5F5F5인 시스템 정의 색상을 가져옵니다. |
| static [get_Yellow](./get_yellow/)() | ARGB 값이 #FFFFFF00인 시스템 정의 색상을 가져옵니다. |
| static [get_YellowGreen](./get_yellowgreen/)() | ARGB 값이 #FF9ACD32인 시스템 정의 색상을 가져옵니다. |
| [GetBrightness](./getbrightness/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체에 대한 색조-채도-밝기(HSB) 밝기 값을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 이 [T:Aspose::Page::Drawing::Color](../) 구조체에 대한 해시 코드를 반환합니다. |
| [GetHue](./gethue/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체에 대한 색조-채도-밝기(HSB) 색조 값을(도) 가져옵니다. |
| [GetSaturation](./getsaturation/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체에 대한 색조-채도-밝기(HSB) 채도 값을 가져옵니다. |
| [ToArgb](./toargb/)() | 이 [T:Aspose::Page::Drawing::Color](../) 구조체의 32비트 ARGB 값을 가져옵니다. |
| [ToString](./tostring/)() const override | 이 [T:Aspose::Page::Drawing::Color](../) 구조를 사람이 읽을 수 있는 문자열로 변환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | null인 색상을 나타냅니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
