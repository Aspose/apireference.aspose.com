---
title: "System::Drawing::Color فئة"
linktitle: "Color"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Color فئة. يمثل لونًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 500
url: /ar/cpp/system.drawing/color/
---
## Color class


يمثل لونًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](../../system/smartptr/) لإدارة كائنات هذا النوع.

```cpp
class Color
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Color](./color/)() | ينشئ نسخة "فارغة" من فئة [Color](./) التي لا تمثل أي لون. |
| [Equals](./equals/)(const Color\&) const | يحدد ما إذا كان الكائنان [Color](./) الحالي والمحدد يمثلان نفس اللون. |
| static [FromArgb](./fromargb/)(int) | ينشئ نسخة من فئة [Color](./) التي تمثل اللون المحدد. |
| static [FromArgb](./fromargb/)(int, int, int, int) | ينشئ نسخة من فئة [Color](./) التي تمثل اللون المحدد. |
| static [FromArgb](./fromargb/)(int, int, int) | ينشئ نسخة من فئة [Color](./) التي تمثل اللون المحدد مع تعيين مكوّن ألفا إلى 0xFF. |
| static [FromArgb](./fromargb/)(int, Color) | ينشئ نسخة من فئة [Color](./) التي تمثل اللون المحدد. |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | ينشئ نسخة من فئة [Color](./) التي تمثل اللون المعروف المحدد. |
| static [FromName](./fromname/)(const String\&) | ينشئ نسخة من فئة [Color](./) التي تمثل لونًا بالاسم المحدد. |
| [get_A](./get_a/)() const | يعيد قيمة مكوّن ألفا للون الذي تمثله الكائن الحالي. |
| static [get_AliceBlue](./get_aliceblue/)() | يعيد لونًا تكون قيمته ARGB بالصيغة السداسية عشرية هي #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFF0FFFF. |
| [get_B](./get_b/)() const | إرجاع قيمة المكوّن الأزرق للون الممثّل بواسطة الكائن الحالي. |
| static [get_Beige](./get_beige/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFE4C4. |
| static [get_Black](./get_black/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFD2691E. |
| static [get_Coral](./get_coral/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | إرجاع لون تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFFF00FF. |
| [get_G](./get_g/)() const | يرجع قيمة المكوّن الأخضر للون الممثَّل بواسطة الكائن الحالي. |
| static [get_Gainsboro](./get_gainsboro/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFDAA520. |
| static [get_Gray](./get_gray/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF808080. |
| static [get_Green](./get_green/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() const | يرجع قيمة تشير إلى ما إذا كان الكائن الحالي "فارغ" أي لا يمثل أي لون. |
| [get_IsNamedColor](./get_isnamedcolor/)() const | يرجع قيمة تحدد ما إذا كان هيكل [Color](./) يمثل لونًا مسمىً أو عضوًا في تعداد [KnownColor](../knowncolor/). |
| static [get_Ivory](./get_ivory/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية عشرية هي #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF32CD32. |
| static [get_Linen](./get_linen/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | يرجع لونًا تكون قيمة ARGB له في الصيغة السداسية العشرية هي #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF191970. |
| static [get_MintCream](./get_mintcream/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFE4B5. |
| [get_Name](./get_name/)() const | يرجع اسم اللون الممثل بواسطة الكائن الحالي. |
| static [get_NavajoWhite](./get_navajowhite/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF000080. |
| static [get_OldLace](./get_oldlace/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | يرجع لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية هي #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FF6B8E23. |
| static [get_Orange](./get_orange/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFCD853F. |
| static [get_Pink](./get_pink/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FF800080. |
| [get_R](./get_r/)() const | يعيد قيمة المكوّن الأحمر للون الممثَّل بواسطة الكائن الحالي. |
| static [get_Red](./get_red/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | يعيد لونًا تكون قيمة ARGB الخاصة به في الصيغة السداسية عشرية #FFA0522D. |
| static [get_Silver](./get_silver/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF708090. |
| static [get_Snow](./get_snow/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF4682B4. |
| static [get_Tan](./get_tan/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFD2B48C. |
| static [get_Teal](./get_teal/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF008080. |
| static [get_Thistle](./get_thistle/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #00FFFFFF. |
| static [get_Turquoise](./get_turquoise/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF40E0D0. |
| static [get_Violet](./get_violet/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFF5DEB3. |
| static [get_White](./get_white/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | يعيد لونًا تكون قيمة ARGB له في التدوين السداسي العشري هي #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | يعيد مكوّن السطوع للون الممثّل بواسطة الكائن الحالي. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز التجزئة (hash code) للكائن الحالي. |
| [GetHue](./gethue/)() | يعيد قيمة Hue-Saturation-Brightness (HSB) بالدرجات للون الممثّل بواسطة الكائن الحالي. |
| [GetSaturation](./getsaturation/)() | يعيد تشبع Hue-Saturation-Brightness (HSB) للون الممثّل بواسطة الكائن الحالي. |
| [IsNull](./isnull/)() const | دائمًا تُعيد false. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | دائمًا تُعيد true. |
| [operator!=](./operator!=/)(const Color\&) const | يحدد ما إذا كان الكائنان الحالي والمحددان من نوع [Color](./) يمثلان ألوانًا متميزة. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | دائمًا تُعيد false. |
| [operator==](./operator==/)(const Color\&) const | يحدد ما إذا كان الكائنان [Color](./) الحالي والمحدد يمثلان نفس اللون. |
| [ToArgb](./toargb/)() const | يعيد قيمة ARGB ذات 32 بت للون الممثّل بواسطة الكائن الحالي. |
| [ToString](./tostring/)() const | يرجع تمثيل النص للكائن الحالي. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | مثال "فارغ" من فئة [Color](./) أي مثال لا يمثل أي لون. |
## انظر أيضًا

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
