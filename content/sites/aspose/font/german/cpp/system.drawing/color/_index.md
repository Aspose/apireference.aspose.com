---
title: "System::Drawing::Color-Klasse"
linktitle: "Farbe"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Color-Klasse. Stellt eine Farbe dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr-Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 500
url: /de/cpp/system.drawing/color/
---
## Color class


Stellt eine Farbe dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../../system/smartptr/)-Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class Color
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Color](./color/)() | Konstruiert eine \"leere\" Instanz der [Color](./)-Klasse, die keine Farbe darstellt. |
| [Equals](./equals/)(const Color\&) const | Bestimmt, ob das aktuelle und das angegebene [Color](./)-Objekt dieselbe Farbe darstellen. |
| static [FromArgb](./fromargb/)(int) | Konstruiert eine Instanz der [Color](./)-Klasse, die die angegebene Farbe darstellt. |
| static [FromArgb](./fromargb/)(int, int, int, int) | Konstruiert eine Instanz der [Color](./)-Klasse, die die angegebene Farbe darstellt. |
| static [FromArgb](./fromargb/)(int, int, int) | Konstruiert eine Instanz der [Color](./)-Klasse, die die angegebene Farbe mit dem Alpha‑Komponentenwert 0xFF darstellt. |
| static [FromArgb](./fromargb/)(int, Color) | Konstruiert eine Instanz der [Color](./)-Klasse, die die angegebene Farbe darstellt. |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | Konstruiert eine Instanz der [Color](./)-Klasse, die die angegebene bekannte Farbe darstellt. |
| static [FromName](./fromname/)(const String\&) | Konstruiert eine Instanz der [Color](./)-Klasse, die eine Farbe mit dem angegebenen Namen darstellt. |
| [get_A](./get_a/)() const | Gibt den Wert der Alpha‑Komponente der vom aktuellen Objekt dargestellten Farbe zurück. |
| static [get_AliceBlue](./get_aliceblue/)() | Gibt eine Farbe zurück, deren ARGB‑Wert in hexadezimaler Schreibweise #FFF0F8FF ist. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFAEBD7 ist. |
| static [get_Aqua](./get_aqua/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF00FFFF ist. |
| static [get_Aquamarine](./get_aquamarine/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF7FFFD4 ist. |
| static [get_Azure](./get_azure/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFF0FFFF ist. |
| [get_B](./get_b/)() const | Gibt den Wert der blauen Komponente der vom aktuellen Objekt dargestellten Farbe zurück. |
| static [get_Beige](./get_beige/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFF5F5DC ist. |
| static [get_Bisque](./get_bisque/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFE4C4 ist. |
| static [get_Black](./get_black/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF000000 ist. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFEBCD ist. |
| static [get_Blue](./get_blue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF0000FF ist. |
| static [get_BlueViolet](./get_blueviolet/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF8A2BE2 ist. |
| static [get_Brown](./get_brown/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFA52A2A ist. |
| static [get_BurlyWood](./get_burlywood/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDEB887 ist. |
| static [get_CadetBlue](./get_cadetblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF5F9EA0 ist. |
| static [get_Chartreuse](./get_chartreuse/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF7FFF00 ist. |
| static [get_Chocolate](./get_chocolate/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFD2691E ist. |
| static [get_Coral](./get_coral/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF7F50 ist. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF6495ED ist. |
| static [get_Cornsilk](./get_cornsilk/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFF8DC ist. |
| static [get_Crimson](./get_crimson/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDC143C ist. |
| static [get_Cyan](./get_cyan/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF00FFFF ist. |
| static [get_DarkBlue](./get_darkblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF00008B ist. |
| static [get_DarkCyan](./get_darkcyan/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF008B8B ist. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFB8860B ist. |
| static [get_DarkGray](./get_darkgray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFA9A9A9 ist. |
| static [get_DarkGreen](./get_darkgreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF006400 ist. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFBDB76B ist. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF8B008B ist. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF556B2F ist. |
| static [get_DarkOrange](./get_darkorange/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF8C00 ist. |
| static [get_DarkOrchid](./get_darkorchid/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF9932CC ist. |
| static [get_DarkRed](./get_darkred/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF8B0000 ist. |
| static [get_DarkSalmon](./get_darksalmon/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFE9967A ist. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF8FBC8F ist. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF483D8B ist. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF2F4F4F ist. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF00CED1 ist. |
| static [get_DarkViolet](./get_darkviolet/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF9400D3 ist. |
| static [get_DeepPink](./get_deeppink/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF1493 ist. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF00BFFF ist. |
| static [get_DimGray](./get_dimgray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF696969 ist. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF1E90FF ist. |
| static [get_Firebrick](./get_firebrick/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFB22222 ist. |
| static [get_FloralWhite](./get_floralwhite/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFFAF0 ist. |
| static [get_ForestGreen](./get_forestgreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF228B22 ist. |
| static [get_Fuchsia](./get_fuchsia/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF00FF ist. |
| [get_G](./get_g/)() const | Gibt den Wert der grünen Komponente der vom aktuellen Objekt dargestellten Farbe zurück. |
| static [get_Gainsboro](./get_gainsboro/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDCDCDC ist. |
| static [get_GhostWhite](./get_ghostwhite/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFF8F8FF ist. |
| static [get_Gold](./get_gold/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFD700 ist. |
| static [get_Goldenrod](./get_goldenrod/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDAA520 ist. |
| static [get_Gray](./get_gray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF808080 ist. |
| static [get_Green](./get_green/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF008000 ist. |
| static [get_GreenYellow](./get_greenyellow/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFADFF2F ist. |
| static [get_Honeydew](./get_honeydew/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFF0FFF0 ist. |
| static [get_HotPink](./get_hotpink/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFF69B4 ist. |
| static [get_IndianRed](./get_indianred/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFCD5C5C ist. |
| static [get_Indigo](./get_indigo/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF4B0082 ist. |
| [get_IsEmpty](./get_isempty/)() const | Gibt einen Wert zurück, der angibt, ob das aktuelle Objekt \"leer\" ist, d. h. keine Farbe darstellt. |
| [get_IsNamedColor](./get_isnamedcolor/)() const | Gibt einen Wert zurück, der bestimmt, ob die [Color](./)-Struktur eine benannte Farbe oder ein Mitglied der [KnownColor](../knowncolor/)-Aufzählung darstellt. |
| static [get_Ivory](./get_ivory/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFFFF0 ist. |
| static [get_Khaki](./get_khaki/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFF0E68C ist. |
| static [get_Lavender](./get_lavender/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFE6E6FA ist. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFF0F5 ist. |
| static [get_LawnGreen](./get_lawngreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF7CFC00 ist. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFFACD ist. |
| static [get_LightBlue](./get_lightblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFADD8E6 ist. |
| static [get_LightCoral](./get_lightcoral/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFF08080 ist. |
| static [get_LightCyan](./get_lightcyan/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFE0FFFF ist. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFAFAD2 ist. |
| static [get_LightGray](./get_lightgray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFD3D3D3 ist. |
| static [get_LightGreen](./get_lightgreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF90EE90 ist. |
| static [get_LightPink](./get_lightpink/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFB6C1 ist. |
| static [get_LightSalmon](./get_lightsalmon/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFA07A ist. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF20B2AA ist. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF87CEFA ist. |
| static [get_LightSlateGray](./get_lightslategray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF778899 ist. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFB0C4DE ist. |
| static [get_LightYellow](./get_lightyellow/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFFFE0 ist. |
| static [get_Lime](./get_lime/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF00FF00 ist. |
| static [get_LimeGreen](./get_limegreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF32CD32 ist. |
| static [get_Linen](./get_linen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFAF0E6 ist. |
| static [get_Magenta](./get_magenta/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF00FF ist. |
| static [get_Maroon](./get_maroon/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF800000 ist. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF66CDAA ist. |
| static [get_MediumBlue](./get_mediumblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF0000CD ist. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFBA55D3 ist. |
| static [get_MediumPurple](./get_mediumpurple/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF9370DB ist. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF3CB371 ist. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF7B68EE ist. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF00FA9A ist. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF48D1CC ist. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFC71585 ist. |
| static [get_MidnightBlue](./get_midnightblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF191970 ist. |
| static [get_MintCream](./get_mintcream/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFF5FFFA ist. |
| static [get_MistyRose](./get_mistyrose/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFE4E1 ist. |
| static [get_Moccasin](./get_moccasin/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFE4B5 ist. |
| [get_Name](./get_name/)() const | Gibt den Namen der Farbe zurück, die vom aktuellen Objekt dargestellt wird. |
| static [get_NavajoWhite](./get_navajowhite/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFFDEAD ist. |
| static [get_Navy](./get_navy/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF000080 ist. |
| static [get_OldLace](./get_oldlace/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FFFDF5E6 ist. |
| static [get_Olive](./get_olive/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Schreibweise #FF808000 ist. |
| static [get_OliveDrab](./get_olivedrab/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF6B8E23 ist. |
| static [get_Orange](./get_orange/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFA500 ist. |
| static [get_OrangeRed](./get_orangered/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF4500 ist. |
| static [get_Orchid](./get_orchid/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDA70D6 ist. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFEEE8AA ist. |
| static [get_PaleGreen](./get_palegreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF98FB98 ist. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFAFEEEE ist. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDB7093 ist. |
| static [get_PapayaWhip](./get_papayawhip/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFEFD5 ist. |
| static [get_PeachPuff](./get_peachpuff/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFDAB9 ist. |
| static [get_Peru](./get_peru/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFCD853F ist. |
| static [get_Pink](./get_pink/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFC0CB ist. |
| static [get_Plum](./get_plum/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFDDA0DD ist. |
| static [get_PowderBlue](./get_powderblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFB0E0E6 ist. |
| static [get_Purple](./get_purple/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF800080 ist. |
| [get_R](./get_r/)() const | Gibt den Wert der roten Komponente der vom aktuellen Objekt dargestellten Farbe zurück. |
| static [get_Red](./get_red/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF0000 ist. |
| static [get_RosyBrown](./get_rosybrown/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFBC8F8F ist. |
| static [get_RoyalBlue](./get_royalblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF4169E1 ist. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF8B4513 ist. |
| static [get_Salmon](./get_salmon/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFA8072 ist. |
| static [get_SandyBrown](./get_sandybrown/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFF4A460 ist. |
| static [get_SeaGreen](./get_seagreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF2E8B57 ist. |
| static [get_SeaShell](./get_seashell/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFF5EE ist. |
| static [get_Sienna](./get_sienna/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFA0522D ist. |
| static [get_Silver](./get_silver/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFC0C0C0 ist. |
| static [get_SkyBlue](./get_skyblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF87CEEB ist. |
| static [get_SlateBlue](./get_slateblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF6A5ACD ist. |
| static [get_SlateGray](./get_slategray/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF708090 ist. |
| static [get_Snow](./get_snow/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFFAFA ist. |
| static [get_SpringGreen](./get_springgreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF00FF7F ist. |
| static [get_SteelBlue](./get_steelblue/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF4682B4 ist. |
| static [get_Tan](./get_tan/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFD2B48C ist. |
| static [get_Teal](./get_teal/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF008080 ist. |
| static [get_Thistle](./get_thistle/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFD8BFD8 ist. |
| static [get_Tomato](./get_tomato/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFF6347 ist. |
| static [get_Transparent](./get_transparent/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #00FFFFFF ist. |
| static [get_Turquoise](./get_turquoise/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF40E0D0 ist. |
| static [get_Violet](./get_violet/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFEE82EE ist. |
| static [get_Wheat](./get_wheat/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFF5DEB3 ist. |
| static [get_White](./get_white/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFFFFF ist. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFF5F5F5 ist. |
| static [get_Yellow](./get_yellow/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FFFFFF00 ist. |
| static [get_YellowGreen](./get_yellowgreen/)() | Gibt eine Farbe zurück, deren ARGB-Wert in hexadezimaler Notation #FF9ACD32 ist. |
| [GetBrightness](./getbrightness/)() | Gibt die Helligkeitskomponente der vom aktuellen Objekt dargestellten Farbe zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt den Hashcode des aktuellen Objekts zurück. |
| [GetHue](./gethue/)() | Gibt den Farbtonwert des Hue‑Saturation‑Brightness (HSB)-Modells in Grad für die vom aktuellen Objekt dargestellte Farbe zurück. |
| [GetSaturation](./getsaturation/)() | Gibt die Sättigung des Hue‑Saturation‑Brightness (HSB)-Modells für die vom aktuellen Objekt dargestellte Farbe zurück. |
| [IsNull](./isnull/)() const | Gibt immer false zurück. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Gibt immer true zurück. |
| [operator!=](./operator!=/)(const Color\&) const | Bestimmt, ob das aktuelle und das angegebene [Color](./)-Objekt unterschiedliche Farben darstellen. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Gibt immer false zurück. |
| [operator==](./operator==/)(const Color\&) const | Bestimmt, ob das aktuelle und das angegebene [Color](./)-Objekt dieselbe Farbe darstellen. |
| [ToArgb](./toargb/)() const | Gibt einen 32‑Bit‑ARGB‑Wert der vom aktuellen Objekt dargestellten Farbe zurück. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des aktuellen Objekts zurück. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Eine "leere" Instanz der [Color](./) Klasse, d.h. eine Instanz, die keine Farbe darstellt. |
## Siehe auch

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
