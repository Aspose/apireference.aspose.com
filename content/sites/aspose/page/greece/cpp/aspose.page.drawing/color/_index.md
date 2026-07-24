---
title: "Κλάση Aspose::Page::Drawing::Color"
linktitle: "Color"
second_title: "Aspose.Page για C++"
description: "Κλάση Aspose::Page::Drawing::Color. Αντιπροσωπεύει ένα χρώμα ARGB (άλφα, κόκκινο, πράσινο, μπλε) σε C++."
type: docs
weight: 100
url: /el/cpp/aspose.page.drawing/color/
---
## Color class


Αναπαριστά ένα χρώμα ARGB (άλφα, κόκκινο, πράσινο, μπλε).

```cpp
class Color : public System::Object,
              public System::Details::BoxableObjectBase
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() | Κλωνοποιεί αυτό το [Aspose.Page.Drawing.Color](./). |
| [Color](./color/)() |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Δοκιμάζει εάν το καθορισμένο αντικείμενο είναι μια δομή [T:Aspose::Page::Drawing::Color](../) και είναι ισοδύναμη με αυτή τη δομή [T:Aspose::Page::Drawing::Color](../). |
| static [FromArgb](./fromargb/)(int32_t) | Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από μια 32-bit τιμή ARGB. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t, int32_t) | Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από τις τέσσερις τιμές των συστατικών ARGB (άλφα, κόκκινο, πράσινο και μπλε). Παρόλο που αυτή η μέθοδος επιτρέπει τη μετάδοση 32-bit τιμής για κάθε συστατικό, η τιμή κάθε συστατικού περιορίζεται σε 8 bits. |
| static [FromArgb](./fromargb/)(int32_t, Aspose::Page::Drawing::Color) | Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από τη συγκεκριμένη δομή [T:Aspose::Page::Drawing::Color](../), αλλά με τη νέα καθορισμένη τιμή άλφα. Παρόλο που αυτή η μέθοδος επιτρέπει τη μετάδοση 32-bit τιμής για την τιμή άλφα, η τιμή περιορίζεται σε 8 bits. |
| static [FromArgb](./fromargb/)(int32_t, int32_t, int32_t) | Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από τις καθορισμένες 8-bit τιμές χρώματος (κόκκινο, πράσινο και μπλε). Η τιμή άλφα είναι έμμεσα 255 (πλήρως αδιαφανής). Παρόλο που αυτή η μέθοδος επιτρέπει τη μετάδοση 32-bit τιμής για κάθε συστατικό χρώματος, η τιμή κάθε συστατικού περιορίζεται σε 8 bits. |
| static [FromName](./fromname/)(System::String) | Δημιουργεί μια δομή [T:Aspose::Page::Drawing::Color](../) από το καθορισμένο όνομα ενός προκαθορισμένου χρώματος. |
| [get_A](./get_a/)() | Λαμβάνει την τιμή του συστατικού άλφα αυτής της δομής [T:Aspose::Page::Drawing::Color](../). |
| static [get_AliceBlue](./get_aliceblue/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFF0FFFF. |
| [get_B](./get_b/)() | Λαμβάνει την τιμή του μπλε συστατικού αυτού του [T:Aspose::Page::Drawing::Color](../) δομής. |
| static [get_Beige](./get_beige/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFFFE4C4. |
| static [get_Black](./get_black/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFD2691E. |
| static [get_Coral](./get_coral/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα με τιμή ARGB #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFF00FF. |
| [get_G](./get_g/)() | Λαμβάνει την τιμή του πράσινου συστατικού αυτού του [T:Aspose::Page::Drawing::Color](../) δομής. |
| static [get_Gainsboro](./get_gainsboro/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFDAA520. |
| static [get_Gray](./get_gray/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FF808080. |
| static [get_Green](./get_green/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() | Καθορίζει εάν αυτή η δομή [T:Aspose::Page::Drawing::Color](../) είναι μη αρχικοποιημένη. |
| [get_IsNamedColor](./get_isnamedcolor/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτή η δομή [T:Aspose::Page::Drawing::Color](../) είναι χρώμα με όνομα ή μέλος της απαρίθμησης [T:System::Drawing::KnownColor](../). |
| static [get_Ivory](./get_ivory/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Λαμβάνει ένα χρώμα ορισμένο από το σύστημα που έχει τιμή ARGB #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF32CD32. |
| static [get_Linen](./get_linen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF191970. |
| static [get_MintCream](./get_mintcream/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFE4B5. |
| [get_Name](./get_name/)() | Λαμβάνει το όνομα αυτού του [T:Aspose::Page::Drawing::Color](../). |
| static [get_NavajoWhite](./get_navajowhite/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF000080. |
| static [get_OldLace](./get_oldlace/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF6B8E23. |
| static [get_Orange](./get_orange/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFCD853F. |
| static [get_Pink](./get_pink/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF800080. |
| [get_R](./get_r/)() | Λαμβάνει την τιμή του κόκκινου συστατικού αυτής της δομής [T:Aspose::Page::Drawing::Color](../). |
| static [get_Red](./get_red/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα και έχει τιμή ARGB #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFA0522D. |
| static [get_Silver](./get_silver/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF708090. |
| static [get_Snow](./get_snow/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF4682B4. |
| static [get_Tan](./get_tan/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF008080. |
| static [get_Thistle](./get_thistle/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα. |
| static [get_Turquoise](./get_turquoise/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFF5DEB3. |
| static [get_White](./get_white/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Λαμβάνει ένα χρώμα που ορίζεται από το σύστημα με τιμή ARGB #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Λαμβάνει την τιμή φωτεινότητας hue-saturation-brightness (HSB) για αυτή τη δομή [T:Aspose::Page::Drawing::Color](../). |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει έναν κωδικό κατακερματισμού για αυτή τη δομή [T:Aspose::Page::Drawing::Color](../). |
| [GetHue](./gethue/)() | Λαμβάνει την τιμή απόχρωσης hue-saturation-brightness (HSB), σε μοίρες, για αυτή τη δομή [T:Aspose::Page::Drawing::Color](../). |
| [GetSaturation](./getsaturation/)() | Λαμβάνει την τιμή κορεσμού hue-saturation-brightness (HSB) για αυτή τη δομή [T:Aspose::Page::Drawing::Color](../). |
| [ToArgb](./toargb/)() | Λαμβάνει την 32-bit τιμή ARGB αυτής της δομής [T:Aspose::Page::Drawing::Color](../). |
| [ToString](./tostring/)() const override | Μετατρέπει αυτή τη δομή [T:Aspose::Page::Drawing::Color](../) σε μια αναγνώσιμη συμβολοσειρά. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](./empty/) | Αναπαριστά ένα χρώμα που είναι null. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Drawing](../)
* Library [Aspose.Page for C++](../../)
