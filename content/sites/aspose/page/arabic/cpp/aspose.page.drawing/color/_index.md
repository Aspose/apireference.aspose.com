---
title: "فئة Aspose::Page::Drawing::Color"
linktitle: "لون"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::Drawing::Color. تمثل لون ARGB (ألفا، أحمر، أخضر، أزرق) في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page.drawing/color/
---
## Color class


يمثل لون ARGB (ألفا، أحمر، أخضر، أزرق).

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | ينسخ هذا [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يفحص ما إذا كان الكائن المحدد هو بنية [T:Aspose::Page::Drawing::Color](../) ومكافئ لهذه البنية [T:Aspose::Page::Drawing::Color](../). |
| static [FromArgb](./fromargb/)(int32_t) | ينشئ بنية [T:Aspose::Page::Drawing::Color](../) من قيمة ARGB 32-بت. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | ينشئ بنية [T:Aspose::Page::Drawing::Color](../) من القيم الأربعة لمكوّنات ARGB (ألفا، أحمر، أخضر، وأزرق). على الرغم من أن هذه الطريقة تسمح بتمرير قيمة 32-بت لكل مكوّن، فإن قيمة كل مكوّن محدودة بـ 8 بت. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | ينشئ بنية [T:Aspose::Page::Drawing::Color](../) من بنية [T:Aspose::Page::Drawing::Color](../) المحددة، ولكن مع قيمة ألفا الجديدة المحددة. على الرغم من أن هذه الطريقة تسمح بتمرير قيمة 32-بت لقيمة ألفا، فإن القيمة محدودة بـ 8 بت. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | ينشئ بنية [T:Aspose::Page::Drawing::Color](../) من قيم الألوان 8-بت المحددة (أحمر، أخضر، وأزرق). قيمة ألفا تكون ضمنيًا 255 (معتمة تمامًا). على الرغم من أن هذه الطريقة تسمح بتمرير قيمة 32-بت لكل مكوّن لون، فإن قيمة كل مكوّن محدودة بـ 8 بت. |
| static [FromName](./fromname/)(System::String) | ينشئ بنية [T:Aspose::Page::Drawing::Color](../) من الاسم المحدد للون المعرّف مسبقًا. |
| [get_A](./get_a/)() | يحصل على قيمة مكوّن ألفا لهذه البنية [T:Aspose::Page::Drawing::Color](../). |
| static [get_AliceBlue](./get_aliceblue/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFF0FFFF. |
| [get_B](./get_b/)() | يحصل على قيمة المكوّن الأزرق لهذا [T:Aspose::Page::Drawing::Color](../) الهيكل. |
| static [get_Beige](./get_beige/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFFFE4C4. |
| static [get_Black](./get_black/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFD2691E. |
| static [get_Coral](./get_coral/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | يحصل على لون معرف من النظام بقيمة ARGB #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | يحصل على لون معرف من النظام بقيمة ARGB #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF00FF. |
| [get_G](./get_g/)() | يحصل على قيمة المكوّن الأخضر لهذا الهيكل [T:Aspose::Page::Drawing::Color](../) structure. |
| static [get_Gainsboro](./get_gainsboro/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFDAA520. |
| static [get_Gray](./get_gray/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF808080. |
| static [get_Green](./get_green/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | يحدد ما إذا كان هذا [T:Aspose::Page::Drawing::Color](../) غير مهيأ. |
| [get_IsNamedColor](./get_isnamedcolor/)() | يحصل على قيمة تشير إلى ما إذا كان هذا [T:Aspose::Page::Drawing::Color](../) لونًا مسمىً أو عضوًا في تعداد [T:System::Drawing::KnownColor](../). |
| static [get_Ivory](./get_ivory/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF32CD32. |
| static [get_Linen](./get_linen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF191970. |
| static [get_MintCream](./get_mintcream/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFE4B5. |
| [get_Name](./get_name/)() | يحصل على اسم هذا [T:Aspose::Page::Drawing::Color](../). |
| static [get_NavajoWhite](./get_navajowhite/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF000080. |
| static [get_OldLace](./get_oldlace/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF6B8E23. |
| static [get_Orange](./get_orange/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFCD853F. |
| static [get_Pink](./get_pink/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF800080. |
| [get_R](./get_r/)() | يحصل على قيمة المكوّن الأحمر لهذا الهيكل [T:Aspose::Page::Drawing::Color](../). |
| static [get_Red](./get_red/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFA0522D. |
| static [get_Silver](./get_silver/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF708090. |
| static [get_Snow](./get_snow/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF4682B4. |
| static [get_Tan](./get_tan/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFD2B48C. |
| static [get_Teal](./get_teal/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF008080. |
| static [get_Thistle](./get_thistle/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | يحصل على لون معرف من النظام. |
| static [get_Turquoise](./get_turquoise/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF40E0D0. |
| static [get_Violet](./get_violet/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF5DEB3. |
| static [get_White](./get_white/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | يحصل على لون معرف من النظام له قيمة ARGB #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | يحصل على لون معرف من النظام له قيمة ARGB #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | يحصل على قيمة السطوع (HSB) لهذا الهيكل [T:Aspose::Page::Drawing::Color](../). |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز التجزئة لهذا الهيكل [T:Aspose::Page::Drawing::Color](../). |
| [GetHue](./gethue/)() | يحصل على قيمة درجة اللون (HSB) بالدرجات لهذا الهيكل [T:Aspose::Page::Drawing::Color](../). |
| [GetSaturation](./getsaturation/)() | يحصل على قيمة التشبع (HSB) لهذا الهيكل [T:Aspose::Page::Drawing::Color](../). |
| [ToArgb](./toargb/)() | يحصل على قيمة ARGB ذات 32 بت لهذا الهيكل [T:Aspose::Page::Drawing::Color](../). |
| [ToString](./tostring/)() const override | يقوم بتحويل بنية [T:Aspose::Page::Drawing::Color](../) هذه إلى سلسلة قابلة للقراءة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | يمثل لونًا غير مُعرَّف. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
