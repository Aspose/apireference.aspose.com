---
title: "Aspose::Page::Drawing::Color Klasse"
linktitle: "Farbe"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Drawing::Color Klasse. Stellt eine ARGB‑Farbe (Alpha, Rot, Grün, Blau) in C++ dar."
type: docs
weight: 100
url: /de/cpp/aspose.page.drawing/color/
---
## Color class


Stellt eine ARGB‑Farbe (Alpha, Rot, Grün, Blau) dar.

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Klonen Sie dieses [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Prüft, ob das angegebene Objekt eine [T:Aspose::Page::Drawing::Color](../) Struktur ist und dieser [T:Aspose::Page::Drawing::Color](../) Struktur entspricht. |
| static [FromArgb](./fromargb/)(int32_t) | Erstellt eine [T:Aspose::Page::Drawing::Color](../) Struktur aus einem 32‑Bit‑ARGB‑Wert. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Erstellt eine [T:Aspose::Page::Drawing::Color](../) Struktur aus den vier ARGB‑Komponenten (Alpha, Rot, Grün und Blau). Obwohl diese Methode für jede Komponente einen 32‑Bit‑Wert zulässt, ist der Wert jeder Komponente auf 8 Bit begrenzt. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Erstellt eine [T:Aspose::Page::Drawing::Color](../) Struktur aus der angegebenen [T:Aspose::Page::Drawing::Color](../) Struktur, jedoch mit dem neu angegebenen Alpha‑Wert. Obwohl diese Methode einen 32‑Bit‑Wert für den Alpha‑Wert zulässt, ist der Wert auf 8 Bit begrenzt. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Erstellt eine [T:Aspose::Page::Drawing::Color](../) Struktur aus den angegebenen 8‑Bit‑Farbwerten (Rot, Grün und Blau). Der Alpha‑Wert ist implizit 255 (vollständig undurchsichtig). Obwohl diese Methode für jede Farbkomponente einen 32‑Bit‑Wert zulässt, ist der Wert jeder Komponente auf 8 Bit begrenzt. |
| static [FromName](./fromname/)(System::String) | Erstellt eine [T:Aspose::Page::Drawing::Color](../) Struktur aus dem angegebenen Namen einer vordefinierten Farbe. |
| [get_A](./get_a/)() | Gibt den Alpha‑Komponentenwert dieser [T:Aspose::Page::Drawing::Color](../) Struktur zurück. |
| static [get_AliceBlue](./get_aliceblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF0F8FF hat. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFAEBD7 hat. |
| static [get_Aqua](./get_aqua/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00FFFF hat. |
| static [get_Aquamarine](./get_aquamarine/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF7FFFD4 hat. |
| static [get_Azure](./get_azure/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF0FFFF hat. |
| [get_B](./get_b/)() | Ruft den Blaukomponentenwert dieser [T:Aspose::Page::Drawing::Color](../)-Struktur ab. |
| static [get_Beige](./get_beige/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF5F5DC hat. |
| static [get_Bisque](./get_bisque/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFE4C4 hat. |
| static [get_Black](./get_black/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF000000 hat. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFEBCD hat. |
| static [get_Blue](./get_blue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF0000FF hat. |
| static [get_BlueViolet](./get_blueviolet/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF8A2BE2 hat. |
| static [get_Brown](./get_brown/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFA52A2A hat. |
| static [get_BurlyWood](./get_burlywood/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFDEB887 hat. |
| static [get_CadetBlue](./get_cadetblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF5F9EA0 hat. |
| static [get_Chartreuse](./get_chartreuse/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF7FFF00 hat. |
| static [get_Chocolate](./get_chocolate/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFD2691E hat. |
| static [get_Coral](./get_coral/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFF7F50 hat. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF6495ED hat. |
| static [get_Cornsilk](./get_cornsilk/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFF8DC hat. |
| static [get_Crimson](./get_crimson/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFDC143C hat. |
| static [get_Cyan](./get_cyan/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00FFFF hat. |
| static [get_DarkBlue](./get_darkblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00008B hat. |
| static [get_DarkCyan](./get_darkcyan/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF008B8B hat. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFB8860B hat. |
| static [get_DarkGray](./get_darkgray/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFA9A9A9 hat. |
| static [get_DarkGreen](./get_darkgreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF006400 hat. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFBDB76B hat. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF8B008B hat. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF556B2F hat. |
| static [get_DarkOrange](./get_darkorange/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFF8C00 hat. |
| static [get_DarkOrchid](./get_darkorchid/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF9932CC hat. |
| static [get_DarkRed](./get_darkred/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF8B0000 hat. |
| static [get_DarkSalmon](./get_darksalmon/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFE9967A hat. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF8FBC8F hat. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF483D8B hat. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF2F4F4F hat. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00CED1 hat. |
| static [get_DarkViolet](./get_darkviolet/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF9400D3 hat. |
| static [get_DeepPink](./get_deeppink/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFF1493 hat. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00BFFF hat. |
| static [get_DimGray](./get_dimgray/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF696969 hat. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF1E90FF hat. |
| static [get_Firebrick](./get_firebrick/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFB22222 hat. |
| static [get_FloralWhite](./get_floralwhite/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFFAF0 hat. |
| static [get_ForestGreen](./get_forestgreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF228B22 hat. |
| static [get_Fuchsia](./get_fuchsia/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFF00FF hat. |
| [get_G](./get_g/)() | Ruft den Grünkomponentenwert dieser [T:Aspose::Page::Drawing::Color](../)-Struktur ab. |
| static [get_Gainsboro](./get_gainsboro/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFDCDCDC hat. |
| static [get_GhostWhite](./get_ghostwhite/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF8F8FF hat. |
| static [get_Gold](./get_gold/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFD700 hat. |
| static [get_Goldenrod](./get_goldenrod/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFDAA520 hat. |
| static [get_Gray](./get_gray/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF808080 hat. |
| static [get_Green](./get_green/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF008000 hat. |
| static [get_GreenYellow](./get_greenyellow/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFADFF2F hat. |
| static [get_Honeydew](./get_honeydew/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF0FFF0 hat. |
| static [get_HotPink](./get_hotpink/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFF69B4 hat. |
| static [get_IndianRed](./get_indianred/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFCD5C5C hat. |
| static [get_Indigo](./get_indigo/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF4B0082 hat. |
| [get_IsEmpty](./get_isempty/)() | Gibt an, ob diese [T:Aspose::Page::Drawing::Color](../)-Struktur nicht initialisiert ist. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Ruft einen Wert ab, der angibt, ob diese [T:Aspose::Page::Drawing::Color](../)-Struktur eine benannte Farbe oder ein Mitglied der [T:System::Drawing::KnownColor](../)-Aufzählung ist. |
| static [get_Ivory](./get_ivory/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFFFF0 hat. |
| static [get_Khaki](./get_khaki/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF0E68C hat. |
| static [get_Lavender](./get_lavender/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFE6E6FA hat. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFF0F5 hat. |
| static [get_LawnGreen](./get_lawngreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF7CFC00 hat. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFFACD hat. |
| static [get_LightBlue](./get_lightblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFADD8E6 hat. |
| static [get_LightCoral](./get_lightcoral/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF08080 hat. |
| static [get_LightCyan](./get_lightcyan/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFE0FFFF hat. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFAFAD2 hat. |
| static [get_LightGray](./get_lightgray/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFD3D3D3 hat. |
| static [get_LightGreen](./get_lightgreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF90EE90 hat. |
| static [get_LightPink](./get_lightpink/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFB6C1 hat. |
| static [get_LightSalmon](./get_lightsalmon/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFA07A hat. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF20B2AA hat. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF87CEFA hat. |
| static [get_LightSlateGray](./get_lightslategray/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF778899 hat. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFB0C4DE hat. |
| static [get_LightYellow](./get_lightyellow/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFFFE0 hat. |
| static [get_Lime](./get_lime/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00FF00 hat. |
| static [get_LimeGreen](./get_limegreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF32CD32 hat. |
| static [get_Linen](./get_linen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFAF0E6 hat. |
| static [get_Magenta](./get_magenta/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFF00FF hat. |
| static [get_Maroon](./get_maroon/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF800000 hat. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF66CDAA hat. |
| static [get_MediumBlue](./get_mediumblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF0000CD hat. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFBA55D3 hat. |
| static [get_MediumPurple](./get_mediumpurple/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF9370DB hat. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF3CB371 hat. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF7B68EE hat. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF00FA9A hat. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF48D1CC hat. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFC71585 hat. |
| static [get_MidnightBlue](./get_midnightblue/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF191970 hat. |
| static [get_MintCream](./get_mintcream/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFF5FFFA hat. |
| static [get_MistyRose](./get_mistyrose/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFE4E1 hat. |
| static [get_Moccasin](./get_moccasin/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFE4B5 hat. |
| [get_Name](./get_name/)() | Ruft den Namen dieses [T:Aspose::Page::Drawing::Color](../) ab. |
| static [get_NavajoWhite](./get_navajowhite/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFFDEAD hat. |
| static [get_Navy](./get_navy/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FF000080 hat. |
| static [get_OldLace](./get_oldlace/)() | Ruft eine systemdefinierte Farbe ab, die einen ARGB-Wert von #FFFDF5E6 hat. |
| static [get_Olive](./get_olive/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF808000 hat. |
| static [get_OliveDrab](./get_olivedrab/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF6B8E23 hat. |
| static [get_Orange](./get_orange/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFFA500 hat. |
| static [get_OrangeRed](./get_orangered/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFF4500 hat. |
| static [get_Orchid](./get_orchid/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFDA70D6 hat. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFEEE8AA hat. |
| static [get_PaleGreen](./get_palegreen/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF98FB98 hat. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFAFEEEE hat. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFDB7093 hat. |
| static [get_PapayaWhip](./get_papayawhip/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFFEFD5 hat. |
| static [get_PeachPuff](./get_peachpuff/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFFDAB9 hat. |
| static [get_Peru](./get_peru/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFCD853F hat. |
| static [get_Pink](./get_pink/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFFC0CB hat. |
| static [get_Plum](./get_plum/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFDDA0DD hat. |
| static [get_PowderBlue](./get_powderblue/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFB0E0E6 hat. |
| static [get_Purple](./get_purple/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF800080 hat. |
| [get_R](./get_r/)() | Ruft den Rotkomponentenwert dieser [T:Aspose::Page::Drawing::Color](../)-Struktur ab. |
| static [get_Red](./get_red/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFF0000 hat. |
| static [get_RosyBrown](./get_rosybrown/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFBC8F8F hat. |
| static [get_RoyalBlue](./get_royalblue/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF4169E1 hat. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF8B4513 hat. |
| static [get_Salmon](./get_salmon/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFA8072 hat. |
| static [get_SandyBrown](./get_sandybrown/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFF4A460 hat. |
| static [get_SeaGreen](./get_seagreen/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FF2E8B57 hat. |
| static [get_SeaShell](./get_seashell/)() | Gibt eine systemdefinierte Farbe zurück, die einen ARGB-Wert von #FFFFF5EE hat. |
| static [get_Sienna](./get_sienna/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFA0522D hat. |
| static [get_Silver](./get_silver/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFC0C0C0 hat. |
| static [get_SkyBlue](./get_skyblue/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF87CEEB hat. |
| static [get_SlateBlue](./get_slateblue/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF6A5ACD hat. |
| static [get_SlateGray](./get_slategray/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF708090 hat. |
| static [get_Snow](./get_snow/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFFFFAFA hat. |
| static [get_SpringGreen](./get_springgreen/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF00FF7F hat. |
| static [get_SteelBlue](./get_steelblue/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF4682B4 hat. |
| static [get_Tan](./get_tan/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFD2B48C hat. |
| static [get_Teal](./get_teal/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF008080 hat. |
| static [get_Thistle](./get_thistle/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFD8BFD8 hat. |
| static [get_Tomato](./get_tomato/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFFF6347 hat. |
| static [get_Transparent](./get_transparent/)() | Gibt eine systemdefinierte Farbe zurück. |
| static [get_Turquoise](./get_turquoise/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF40E0D0 hat. |
| static [get_Violet](./get_violet/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFEE82EE hat. |
| static [get_Wheat](./get_wheat/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFF5DEB3 hat. |
| static [get_White](./get_white/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFFFFFFF hat. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFF5F5F5 hat. |
| static [get_Yellow](./get_yellow/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FFFFFF00 hat. |
| static [get_YellowGreen](./get_yellowgreen/)() | Gibt eine systemdefinierte Farbe zurück, die den ARGB-Wert #FF9ACD32 hat. |
| [GetBrightness](./getbrightness/)() | Gibt den Helligkeitswert der Farbton‑Sättigungs‑Helligkeit (HSB) für diese [T:Aspose::Page::Drawing::Color](../)-Struktur zurück. |
| [GetHashCode](./gethashcode/)() const override | Gibt einen Hashcode für diese [T:Aspose::Page::Drawing::Color](../)-Struktur zurück. |
| [GetHue](./gethue/)() | Gibt den Farbtonwert der Farbton‑Sättigungs‑Helligkeit (HSB) in Grad für diese [T:Aspose::Page::Drawing::Color](../)-Struktur zurück. |
| [GetSaturation](./getsaturation/)() | Gibt den Sättigungswert der Farbton‑Sättigungs‑Helligkeit (HSB) für diese [T:Aspose::Page::Drawing::Color](../)-Struktur zurück. |
| [ToArgb](./toargb/)() | Gibt den 32‑Bit‑ARGB‑Wert dieser [T:Aspose::Page::Drawing::Color](../)-Struktur zurück. |
| [ToString](./tostring/)() const override | Konvertiert diese [T:Aspose::Page::Drawing::Color](../)-Struktur in eine menschenlesbare Zeichenkette. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Stellt eine Farbe dar, die null ist. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
