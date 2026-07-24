---
title: "Aspose::Page::Drawing::Color क्लास"
linktitle: "Color"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::Drawing::Color क्लास। C++ में ARGB (अल्फा, लाल, हरा, नीला) रंग का प्रतिनिधित्व करता है।"
type: docs
weight: 100
url: /hi/cpp/aspose.page.drawing/color/
---
## Color class


एक ARGB (अल्फा, रेड, ग्रीन, ब्लू) रंग का प्रतिनिधित्व करता है।

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | इस [Aspose.Page.Drawing.Color](./) को क्लोन करता है। |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | जाँचता है कि निर्दिष्ट ऑब्जेक्ट एक [T:Aspose::Page::Drawing::Color](../) संरचना है और यह [T:Aspose::Page::Drawing::Color](../) संरचना के बराबर है या नहीं। |
| static [FromArgb](./fromargb/)(int32_t) | एक 32-बिट ARGB मान से एक [T:Aspose::Page::Drawing::Color](../) संरचना बनाता है। |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | चार ARGB घटकों (अल्फा, लाल, हरा, और नीला) मानों से एक [T:Aspose::Page::Drawing::Color](../) संरचना बनाता है। यद्यपि यह विधि प्रत्येक घटक के लिए 32-बिट मान पास करने की अनुमति देती है, प्रत्येक घटक का मान 8 बिट तक सीमित है। |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | निर्दिष्ट [T:Aspose::Page::Drawing::Color](../) संरचना से, लेकिन नए निर्दिष्ट अल्फा मान के साथ, एक [T:Aspose::Page::Drawing::Color](../) संरचना बनाता है। यद्यपि यह विधि अल्फा मान के लिए 32-बिट मान पास करने की अनुमति देती है, मान 8 बिट तक सीमित है। |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | निर्दिष्ट 8-बिट रंग मानों (लाल, हरा, और नीला) से एक [T:Aspose::Page::Drawing::Color](../) संरचना बनाता है। अल्फा मान स्वचालित रूप से 255 (पूरी तरह अपारदर्शी) है। यद्यपि यह विधि प्रत्येक रंग घटक के लिए 32-बिट मान पास करने की अनुमति देती है, प्रत्येक घटक का मान 8 बिट तक सीमित है। |
| static [FromName](./fromname/)(System::String) | एक पूर्वनिर्धारित रंग के निर्दिष्ट नाम से एक [T:Aspose::Page::Drawing::Color](../) संरचना बनाता है। |
| [get_A](./get_a/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना के अल्फा घटक मान को प्राप्त करता है। |
| static [get_AliceBlue](./get_aliceblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF0F8FF है। |
| static [get_AntiqueWhite](./get_antiquewhite/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFAEBD7 है। |
| static [get_Aqua](./get_aqua/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF00FFFF है। |
| static [get_Aquamarine](./get_aquamarine/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF7FFFD4 है। |
| static [get_Azure](./get_azure/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF0FFFF है। |
| [get_B](./get_b/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना का नीला घटक मान प्राप्त करता है। |
| static [get_Beige](./get_beige/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF5F5DC है। |
| static [get_Bisque](./get_bisque/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFE4C4 है। |
| static [get_Black](./get_black/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF000000 है। |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFEBCD है। |
| static [get_Blue](./get_blue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF0000FF है। |
| static [get_BlueViolet](./get_blueviolet/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF8A2BE2 है। |
| static [get_Brown](./get_brown/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFA52A2A है। |
| static [get_BurlyWood](./get_burlywood/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDEB887 है। |
| static [get_CadetBlue](./get_cadetblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF5F9EA0 है। |
| static [get_Chartreuse](./get_chartreuse/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF7FFF00 है। |
| static [get_Chocolate](./get_chocolate/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFD2691E है। |
| static [get_Coral](./get_coral/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF7F50 है। |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF6495ED है। |
| static [get_Cornsilk](./get_cornsilk/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFF8DC है। |
| static [get_Crimson](./get_crimson/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDC143C है। |
| static [get_Cyan](./get_cyan/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF00FFFF है। |
| static [get_DarkBlue](./get_darkblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF00008B है। |
| static [get_DarkCyan](./get_darkcyan/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF008B8B है। |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFB8860B है। |
| static [get_DarkGray](./get_darkgray/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFA9A9A9 है। |
| static [get_DarkGreen](./get_darkgreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF006400 है। |
| static [get_DarkKhaki](./get_darkkhaki/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFBDB76B है। |
| static [get_DarkMagenta](./get_darkmagenta/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF8B008B है। |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF556B2F है। |
| static [get_DarkOrange](./get_darkorange/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF8C00 है। |
| static [get_DarkOrchid](./get_darkorchid/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF9932CC है। |
| static [get_DarkRed](./get_darkred/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF8B0000 है। |
| static [get_DarkSalmon](./get_darksalmon/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFE9967A है। |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF8FBC8F है। |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF483D8B है। |
| static [get_DarkSlateGray](./get_darkslategray/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF2F4F4F है। |
| static [get_DarkTurquoise](./get_darkturquoise/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF00CED1 है। |
| static [get_DarkViolet](./get_darkviolet/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF9400D3 है। |
| static [get_DeepPink](./get_deeppink/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF1493 है। |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF00BFFF है। |
| static [get_DimGray](./get_dimgray/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF696969 है। |
| static [get_DodgerBlue](./get_dodgerblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF1E90FF है। |
| static [get_Firebrick](./get_firebrick/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFB22222 है। |
| static [get_FloralWhite](./get_floralwhite/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFFAF0 है। |
| static [get_ForestGreen](./get_forestgreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF228B22 है। |
| static [get_Fuchsia](./get_fuchsia/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF00FF है। |
| [get_G](./get_g/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना का हरा घटक मान प्राप्त करता है। |
| static [get_Gainsboro](./get_gainsboro/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDCDCDC है। |
| static [get_GhostWhite](./get_ghostwhite/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF8F8FF है। |
| static [get_Gold](./get_gold/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFD700 है। |
| static [get_Goldenrod](./get_goldenrod/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDAA520 है। |
| static [get_Gray](./get_gray/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF808080 है। |
| static [get_Green](./get_green/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF008000 है। |
| static [get_GreenYellow](./get_greenyellow/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFADFF2F है। |
| static [get_Honeydew](./get_honeydew/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF0FFF0 है। |
| static [get_HotPink](./get_hotpink/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF69B4 है। |
| static [get_IndianRed](./get_indianred/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFCD5C5C है। |
| static [get_Indigo](./get_indigo/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF4B0082 है। |
| [get_IsEmpty](./get_isempty/)() | निर्दिष्ट करता है कि यह [T:Aspose::Page::Drawing::Color](../) संरचना अनइनिशियलाइज़्ड है या नहीं। |
| [get_IsNamedColor](./get_isnamedcolor/)() | एक मान प्राप्त करता है जो दर्शाता है कि यह [T:Aspose::Page::Drawing::Color](../) संरचना एक नामित रंग है या [T:System::Drawing::KnownColor](../) एन्यूमरेशन का सदस्य है। |
| static [get_Ivory](./get_ivory/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFFFF0 है। |
| static [get_Khaki](./get_khaki/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF0E68C है। |
| static [get_Lavender](./get_lavender/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFE6E6FA है। |
| static [get_LavenderBlush](./get_lavenderblush/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFF0F5 है। |
| static [get_LawnGreen](./get_lawngreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF7CFC00 है। |
| static [get_LemonChiffon](./get_lemonchiffon/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFFACD है। |
| static [get_LightBlue](./get_lightblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFADD8E6 है। |
| static [get_LightCoral](./get_lightcoral/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF08080 है। |
| static [get_LightCyan](./get_lightcyan/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFE0FFFF है। |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFAFAD2 है। |
| static [get_LightGray](./get_lightgray/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFD3D3D3 है। |
| static [get_LightGreen](./get_lightgreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF90EE90 है। |
| static [get_LightPink](./get_lightpink/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFB6C1 है। |
| static [get_LightSalmon](./get_lightsalmon/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFA07A है। |
| static [get_LightSeaGreen](./get_lightseagreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF20B2AA है। |
| static [get_LightSkyBlue](./get_lightskyblue/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF87CEFA है। |
| static [get_LightSlateGray](./get_lightslategray/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF778899 है। |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFB0C4DE है। |
| static [get_LightYellow](./get_lightyellow/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFFFFFE0 है। |
| static [get_Lime](./get_lime/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF00FF00 है। |
| static [get_LimeGreen](./get_limegreen/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF32CD32 है। |
| static [get_Linen](./get_linen/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFFAF0E6 है। |
| static [get_Magenta](./get_magenta/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF00FF है। |
| static [get_Maroon](./get_maroon/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF800000 है। |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF66CDAA है। |
| static [get_MediumBlue](./get_mediumblue/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF0000CD है। |
| static [get_MediumOrchid](./get_mediumorchid/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFBA55D3 है। |
| static [get_MediumPurple](./get_mediumpurple/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF9370DB है। |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF3CB371 है। |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF7B68EE है। |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF00FA9A है। |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF48D1CC है। |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFC71585 है। |
| static [get_MidnightBlue](./get_midnightblue/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF191970 है। |
| static [get_MintCream](./get_mintcream/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFF5FFFA है। |
| static [get_MistyRose](./get_mistyrose/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFFFE4E1 है। |
| static [get_Moccasin](./get_moccasin/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFFFE4B5 है। |
| [get_Name](./get_name/)() | इस [T:Aspose::Page::Drawing::Color](../) का नाम प्राप्त करता है। |
| static [get_NavajoWhite](./get_navajowhite/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFFFDEAD है। |
| static [get_Navy](./get_navy/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FF000080 है। |
| static [get_OldLace](./get_oldlace/)() | प्राप्त करता है एक सिस्टम-परिभाषित रंग जिसका ARGB मान #FFFDF5E6 है। |
| static [get_Olive](./get_olive/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF808000 है। |
| static [get_OliveDrab](./get_olivedrab/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF6B8E23 है। |
| static [get_Orange](./get_orange/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFA500 है। |
| static [get_OrangeRed](./get_orangered/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF4500 है। |
| static [get_Orchid](./get_orchid/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDA70D6 है। |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFEEE8AA है। |
| static [get_PaleGreen](./get_palegreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF98FB98 है। |
| static [get_PaleTurquoise](./get_paleturquoise/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFAFEEEE है। |
| static [get_PaleVioletRed](./get_palevioletred/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDB7093 है। |
| static [get_PapayaWhip](./get_papayawhip/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFEFD5 है। |
| static [get_PeachPuff](./get_peachpuff/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFDAB9 है। |
| static [get_Peru](./get_peru/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFCD853F है। |
| static [get_Pink](./get_pink/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFC0CB है। |
| static [get_Plum](./get_plum/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFDDA0DD है। |
| static [get_PowderBlue](./get_powderblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFB0E0E6 है। |
| static [get_Purple](./get_purple/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF800080 है। |
| [get_R](./get_r/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना का लाल घटक मान प्राप्त करता है। |
| static [get_Red](./get_red/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF0000 है। |
| static [get_RosyBrown](./get_rosybrown/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFBC8F8F है। |
| static [get_RoyalBlue](./get_royalblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF4169E1 है। |
| static [get_SaddleBrown](./get_saddlebrown/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF8B4513 है। |
| static [get_Salmon](./get_salmon/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFA8072 है। |
| static [get_SandyBrown](./get_sandybrown/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF4A460 है। |
| static [get_SeaGreen](./get_seagreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF2E8B57 है। |
| static [get_SeaShell](./get_seashell/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFF5EE है। |
| static [get_Sienna](./get_sienna/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFA0522D है। |
| static [get_Silver](./get_silver/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFC0C0C0 है। |
| static [get_SkyBlue](./get_skyblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF87CEEB है। |
| static [get_SlateBlue](./get_slateblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF6A5ACD है। |
| static [get_SlateGray](./get_slategray/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF708090 है। |
| static [get_Snow](./get_snow/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFFAFA है। |
| static [get_SpringGreen](./get_springgreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF00FF7F है। |
| static [get_SteelBlue](./get_steelblue/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF4682B4 है। |
| static [get_Tan](./get_tan/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFD2B48C है। |
| static [get_Teal](./get_teal/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF008080 है। |
| static [get_Thistle](./get_thistle/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFD8BFD8 है। |
| static [get_Tomato](./get_tomato/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFF6347 है। |
| static [get_Transparent](./get_transparent/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है। |
| static [get_Turquoise](./get_turquoise/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF40E0D0 है। |
| static [get_Violet](./get_violet/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFEE82EE है। |
| static [get_Wheat](./get_wheat/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF5DEB3 है। |
| static [get_White](./get_white/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFFFFF है। |
| static [get_WhiteSmoke](./get_whitesmoke/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFF5F5F5 है। |
| static [get_Yellow](./get_yellow/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FFFFFF00 है। |
| static [get_YellowGreen](./get_yellowgreen/)() | एक सिस्टम-परिभाषित रंग प्राप्त करता है जिसका ARGB मान #FF9ACD32 है। |
| [GetBrightness](./getbrightness/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना के लिए hue-saturation-brightness (HSB) चमक मान प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | इस [T:Aspose::Page::Drawing::Color](../) संरचना के लिए हैश कोड लौटाता है। |
| [GetHue](./gethue/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना के लिए hue-saturation-brightness (HSB) hue मान, डिग्री में, प्राप्त करता है। |
| [GetSaturation](./getsaturation/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना के लिए hue-saturation-brightness (HSB) संतृप्ति मान प्राप्त करता है। |
| [ToArgb](./toargb/)() | इस [T:Aspose::Page::Drawing::Color](../) संरचना का 32-बिट ARGB मान प्राप्त करता है। |
| [ToString](./tostring/)() const override | इस [T:Aspose::Page::Drawing::Color](../) संरचना को मानव-पठनीय स्ट्रिंग में बदलता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](./empty/) | एक शून्य रंग का प्रतिनिधित्व करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
