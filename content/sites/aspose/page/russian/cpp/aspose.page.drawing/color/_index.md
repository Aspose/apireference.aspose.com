---
title: "Aspose::Page::Drawing::Color класс"
linktitle: "Color"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Drawing::Color класс. Представляет цвет ARGB (альфа, красный, зелёный, синий) в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.drawing/color/
---
## Color class


Представляет цвет ARGB (альфа, красный, зелёный, синий).

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() | Клонирует этот [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Проверяет, является ли указанный объект структурой [T:Aspose::Page::Drawing::Color](../) и эквивалентен ли он этой структуре [T:Aspose::Page::Drawing::Color](../). |
| static [FromArgb](./fromargb/)(int32_t) | Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из 32‑битного значения ARGB. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из четырёх значений компонентов ARGB (альфа, красный, зелёный и синий). Хотя этот метод позволяет передавать 32‑битное значение для каждого компонента, значение каждого компонента ограничено 8 битами. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из указанной структуры [T:Aspose::Page::Drawing::Color](../), но с новым указанным значением альфа. Хотя этот метод позволяет передавать 32‑битное значение для альфа‑компонента, значение ограничено 8 битами. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из указанных 8‑битных значений цветов (красный, зелёный и синий). Значение альфа подразумевается как 255 (полностью непрозрачное). Хотя этот метод позволяет передавать 32‑битное значение для каждого цветового компонента, значение каждого компонента ограничено 8 битами. |
| static [FromName](./fromname/)(System::String) | Создаёт структуру [T:Aspose::Page::Drawing::Color](../) из указанного имени предопределённого цвета. |
| [get_A](./get_a/)() | Получает значение альфа‑компонента этой структуры [T:Aspose::Page::Drawing::Color](../). |
| static [get_AliceBlue](./get_aliceblue/)() | Получает системный цвет с ARGB‑значением #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Получает системный цвет с ARGB‑значением #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | Получает системный цвет с ARGB‑значением #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | Получает системный цвет с ARGB‑значением #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | Получает системный цвет с ARGB‑значением #FFF0FFFF. |
| [get_B](./get_b/)() | Получает значение синего компонента этой структуры [T:Aspose::Page::Drawing::Color](../). |
| static [get_Beige](./get_beige/)() | Получает системный цвет с ARGB‑значением #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | Получает системный цвет с ARGB‑значением #FFFFE4C4. |
| static [get_Black](./get_black/)() | Получает системный цвет с ARGB‑значением #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Получает системный цвет с ARGB‑значением #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | Получает системный цвет с ARGB‑значением #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | Получает системный цвет с ARGB‑значением #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | Получает системный цвет с ARGB‑значением #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | Получает системный цвет с ARGB‑значением #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | Получает системный цвет с ARGB‑значением #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | Получает системный цвет с ARGB‑значением #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | Получает системный цвет с ARGB‑значением #FFD2691E. |
| static [get_Coral](./get_coral/)() | Получает системный цвет с ARGB‑значением #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Получает системный цвет с ARGB‑значением #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | Получает системный цвет с ARGB‑значением #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | Получает системный цвет с ARGB‑значением #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | Получает системный цвет с ARGB‑значением #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | Получает системный цвет с ARGB‑значением #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | Получает системный цвет с ARGB‑значением #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Получает системный цвет с ARGB‑значением #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | Получает системный цвет с ARGB‑значением #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | Получает системно определённый цвет с ARGB‑значением #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Получает системно определённый цвет с ARGB‑значением #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Получает системно определённый цвет с ARGB‑значением #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Получает системно определённый цвет с ARGB‑значением #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | Получает системно определённый цвет с ARGB‑значением #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | Получает системно определённый цвет с ARGB‑значением #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | Получает системно определённый цвет с ARGB‑значением #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | Получает системно определённый цвет с ARGB‑значением #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Получает системно определённый цвет с ARGB‑значением #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Получает системно определённый цвет с ARGB‑значением #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Получает системно определённый цвет с ARGB‑значением #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Получает системно определённый цвет с ARGB‑значением #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Получает системно определённый цвет с ARGB‑значением #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Получает системно определённый цвет с ARGB‑значением #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Получает системно определённый цвет с ARGB‑значением #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Получает системно определённый цвет с ARGB‑значением #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Получает системно определённый цвет с ARGB‑значением #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Получает системно определённый цвет с ARGB‑значением #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Получает системно определённый цвет с ARGB‑значением #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Получает системно определённый цвет с ARGB‑значением #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Получает системно определённый цвет с ARGB‑значением #FFFF00FF. |
| [get_G](./get_g/)() | Получает значение зелёного компонента этой структуры [T:Aspose::Page::Drawing::Color](../). |
| static [get_Gainsboro](./get_gainsboro/)() | Получает системно определённый цвет с ARGB‑значением #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Получает системно определённый цвет с ARGB‑значением #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Получает системно определённый цвет с ARGB‑значением #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Получает системно определённый цвет, значение ARGB которого #FFDAA520. |
| static [get_Gray](./get_gray/)() | Получает системно определённый цвет, значение ARGB которого #FF808080. |
| static [get_Green](./get_green/)() | Получает системно определённый цвет, значение ARGB которого #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Получает системно определённый цвет, значение ARGB которого #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Получает системно определённый цвет, значение ARGB которого #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Получает системно определённый цвет, значение ARGB которого #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Получает системно определённый цвет, значение ARGB которого #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Получает системно определённый цвет, значение ARGB которого #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | Указывает, является ли эта структура [T:Aspose::Page::Drawing::Color](../) неинициализированной. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Получает значение, указывающее, является ли эта структура [T:Aspose::Page::Drawing::Color](../) именованным цветом или членом перечисления [T:System::Drawing::KnownColor](../). |
| static [get_Ivory](./get_ivory/)() | Получает системно определённый цвет, значение ARGB которого #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Получает системно определённый цвет, значение ARGB которого #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Получает системно определённый цвет, значение ARGB которого #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Получает системно определённый цвет, значение ARGB которого #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Получает системно определённый цвет, значение ARGB которого #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Получает системно определённый цвет, значение ARGB которого #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Получает системно определённый цвет, значение ARGB которого #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Получает системно определённый цвет, значение ARGB которого #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Получает системно определённый цвет, значение ARGB которого #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Получает системно определённый цвет, значение ARGB которого #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Получает системно определённый цвет, значение ARGB которого #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Получает системно определённый цвет, значение ARGB которого #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Получает системно определённый цвет, значение ARGB которого #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Получает системно определённый цвет, значение ARGB которого #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Получает системно определённый цвет, значение ARGB которого #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Получает системно определённый цвет, значение ARGB которого #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Получает системно определённый цвет, значение ARGB которого #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Получает системно определённый цвет, значение ARGB которого #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Получает системно определённый цвет, значение ARGB которого #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Получает системно определённый цвет, значение ARGB которого #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Получает системно определённый цвет, значение ARGB которого #FF32CD32. |
| static [get_Linen](./get_linen/)() | Получает системно определённый цвет, значение ARGB которого #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Получает системно определённый цвет с ARGB‑значением #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Получает системно определённый цвет, значение ARGB которого #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Получает системно определённый цвет, значение ARGB которого #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Получает системно определённый цвет, значение ARGB которого #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Получает системно определённый цвет, значение ARGB которого #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | Получает системно определённый цвет, значение ARGB которого #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Получает системно определённый цвет, значение ARGB которого #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Получает системно определённый цвет, значение ARGB которого #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Получает системно определённый цвет, значение ARGB которого #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Получает системно определённый цвет, значение ARGB которого #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Получает системно определённый цвет, значение ARGB которого #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | Получает системно определённый цвет, значение ARGB которого #FF191970. |
| static [get_MintCream](./get_mintcream/)() | Получает системно определённый цвет, значение ARGB которого #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | Получает системно определённый цвет, значение ARGB которого #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | Получает системно определённый цвет, значение ARGB которого #FFFFE4B5. |
| [get_Name](./get_name/)() | Получает имя этого [T:Aspose::Page::Drawing::Color](../). |
| static [get_NavajoWhite](./get_navajowhite/)() | Получает системно определённый цвет, значение ARGB которого #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | Получает системно определённый цвет, значение ARGB которого #FF000080. |
| static [get_OldLace](./get_oldlace/)() | Получает системно определённый цвет, значение ARGB которого #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | Получает системно определённый цвет, значение ARGB которого #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | Получает системно определённый цвет, значение ARGB которого #FF6B8E23. |
| static [get_Orange](./get_orange/)() | Получает системно определённый цвет, значение ARGB которого #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Получает системно определённый цвет, значение ARGB которого #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Получает системно определённый цвет, значение ARGB которого #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Получает системно определённый цвет, значение ARGB которого #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Получает системно определённый цвет, значение ARGB которого #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Получает системно определённый цвет, значение ARGB которого #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Получает системно определённый цвет, значение ARGB которого #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Получает системно определённый цвет, значение ARGB которого #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Получает системно определённый цвет, значение ARGB которого #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Получает системно определённый цвет, значение ARGB которого #FFCD853F. |
| static [get_Pink](./get_pink/)() | Получает системно определённый цвет, значение ARGB которого #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Получает системно определённый цвет, значение ARGB которого #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Получает системно определённый цвет, значение ARGB которого #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Получает системно определённый цвет, значение ARGB которого #FF800080. |
| [get_R](./get_r/)() | Получает значение красного компонента этой структуры [T:Aspose::Page::Drawing::Color](../). |
| static [get_Red](./get_red/)() | Получает системно определённый цвет, значение ARGB которого #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Получает системно определённый цвет, значение ARGB которого #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Получает системно определённый цвет, значение ARGB которого #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Получает системно определённый цвет, значение ARGB которого #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Получает системно определённый цвет, значение ARGB которого #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Получает системно определённый цвет, значение ARGB которого #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Получает системно определённый цвет, значение ARGB которого #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Получает системно определённый цвет, значение ARGB которого #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFA0522D. |
| static [get_Silver](./get_silver/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF708090. |
| static [get_Snow](./get_snow/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF4682B4. |
| static [get_Tan](./get_tan/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF008080. |
| static [get_Thistle](./get_thistle/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Возвращает системный цвет. |
| static [get_Turquoise](./get_turquoise/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFF5DEB3. |
| static [get_White](./get_white/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Возвращает системный цвет, имеющий ARGB‑значение #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Возвращает системный цвет, имеющий ARGB‑значение #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Возвращает значение яркости hue-saturation-brightness (HSB) для этой структуры [T:Aspose::Page::Drawing::Color](../). |
| [GetHashCode](./gethashcode/)() const override | Возвращает хеш‑код для этой структуры [T:Aspose::Page::Drawing::Color](../). |
| [GetHue](./gethue/)() | Возвращает значение оттенка hue-saturation-brightness (HSB) в градусах для этой структуры [T:Aspose::Page::Drawing::Color](../). |
| [GetSaturation](./getsaturation/)() | Возвращает значение насыщенности hue-saturation-brightness (HSB) для этой структуры [T:Aspose::Page::Drawing::Color](../). |
| [ToArgb](./toargb/)() | Возвращает 32‑битное значение ARGB этой структуры [T:Aspose::Page::Drawing::Color](../). |
| [ToString](./tostring/)() const override | Преобразует эту структуру [T:Aspose::Page::Drawing::Color](../) в человекочитаемую строку. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Empty](./empty/) | Представляет цвет, который является null. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
