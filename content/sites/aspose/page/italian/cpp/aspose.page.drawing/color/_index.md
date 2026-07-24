---
title: "Classe Aspose::Page::Drawing::Color"
linktitle: "Color"
second_title: "Aspose.Page per C++"
description: "Classe Aspose::Page::Drawing::Color. Rappresenta un colore ARGB (alpha, rosso, verde, blu) in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page.drawing/color/
---
## Color class


Rappresenta un colore ARGB (alpha, rosso, verde, blu).

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Clona questo [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Verifica se l'oggetto specificato è una struttura [T:Aspose::Page::Drawing::Color](../) ed è equivalente a questa struttura [T:Aspose::Page::Drawing::Color](../). |
| static [FromArgb](./fromargb/)(int32_t) | Crea una struttura [T:Aspose::Page::Drawing::Color](../) da un valore ARGB a 32 bit. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Crea una struttura [T:Aspose::Page::Drawing::Color](../) dai quattro valori dei componenti ARGB (alpha, rosso, verde e blu). Sebbene questo metodo consenta di passare un valore a 32 bit per ciascun componente, il valore di ogni componente è limitato a 8 bit. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Crea una struttura [T:Aspose::Page::Drawing::Color](../) dalla struttura [T:Aspose::Page::Drawing::Color](../) specificata, ma con il nuovo valore alpha specificato. Sebbene questo metodo consenta di passare un valore a 32 bit per il valore alpha, il valore è limitato a 8 bit. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Crea una struttura [T:Aspose::Page::Drawing::Color](../) dai valori di colore a 8 bit specificati (rosso, verde e blu). Il valore alpha è implicitamente 255 (completamente opaco). Sebbene questo metodo consenta di passare un valore a 32 bit per ciascun componente colore, il valore di ogni componente è limitato a 8 bit. |
| static [FromName](./fromname/)(System::String) | Crea una struttura [T:Aspose::Page::Drawing::Color](../) dal nome specificato di un colore predefinito. |
| [get_A](./get_a/)() | Ottiene il valore del componente alpha di questa struttura [T:Aspose::Page::Drawing::Color](../). |
| static [get_AliceBlue](./get_aliceblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF0FFFF. |
| [get_B](./get_b/)() | Ottiene il valore del componente blu di questa struttura [T:Aspose::Page::Drawing::Color](../). |
| static [get_Beige](./get_beige/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFE4C4. |
| static [get_Black](./get_black/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFD2691E. |
| static [get_Coral](./get_coral/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF00FF. |
| [get_G](./get_g/)() | Ottiene il valore del componente verde di questa struttura [T:Aspose::Page::Drawing::Color](../). |
| static [get_Gainsboro](./get_gainsboro/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDAA520. |
| static [get_Gray](./get_gray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF808080. |
| static [get_Green](./get_green/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | Specifica se questa struttura [T:Aspose::Page::Drawing::Color](../) non è inizializzata. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Ottiene un valore che indica se questa struttura [T:Aspose::Page::Drawing::Color](../) è un colore con nome o un membro dell'enumerazione [T:System::Drawing::KnownColor](../). |
| static [get_Ivory](./get_ivory/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF32CD32. |
| static [get_Linen](./get_linen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF191970. |
| static [get_MintCream](./get_mintcream/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFE4B5. |
| [get_Name](./get_name/)() | Ottiene il nome di questo [T:Aspose::Page::Drawing::Color](../). |
| static [get_NavajoWhite](./get_navajowhite/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF000080. |
| static [get_OldLace](./get_oldlace/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF6B8E23. |
| static [get_Orange](./get_orange/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFCD853F. |
| static [get_Pink](./get_pink/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF800080. |
| [get_R](./get_r/)() | Ottiene il valore del componente rosso di questa struttura [T:Aspose::Page::Drawing::Color](../). |
| static [get_Red](./get_red/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFA0522D. |
| static [get_Silver](./get_silver/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF708090. |
| static [get_Snow](./get_snow/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF4682B4. |
| static [get_Tan](./get_tan/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF008080. |
| static [get_Thistle](./get_thistle/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Ottiene un colore definito dal sistema. |
| static [get_Turquoise](./get_turquoise/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF5DEB3. |
| static [get_White](./get_white/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Ottiene un colore definito dal sistema che ha un valore ARGB di #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Ottiene il valore di luminosità hue-saturation-brightness (HSB) per questa struttura [T:Aspose::Page::Drawing::Color](../). |
| [GetHashCode](./gethashcode/)() const override | Restituisce un codice hash per questa struttura [T:Aspose::Page::Drawing::Color](../). |
| [GetHue](./gethue/)() | Ottiene il valore di tonalità hue-saturation-brightness (HSB), in gradi, per questa struttura [T:Aspose::Page::Drawing::Color](../). |
| [GetSaturation](./getsaturation/)() | Ottiene il valore di saturazione hue-saturation-brightness (HSB) per questa struttura [T:Aspose::Page::Drawing::Color](../). |
| [ToArgb](./toargb/)() | Ottiene il valore ARGB a 32 bit di questa struttura [T:Aspose::Page::Drawing::Color](../). |
| [ToString](./tostring/)() const override | Converte questa struttura [T:Aspose::Page::Drawing::Color](../) in una stringa leggibile dall'uomo. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Rappresenta un colore che è nullo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
