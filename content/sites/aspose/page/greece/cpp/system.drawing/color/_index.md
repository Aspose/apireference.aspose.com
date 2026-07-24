---
title: "System::Drawing::Color class"
linktitle: "Color"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Color class. Αντιπροσωπεύει ένα χρώμα. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περνιέται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση System::SmartPtr για τη διαχείριση αντικειμένων αυτού του τύπου σε C++."
type: docs
weight: 500
url: /el/cpp/system.drawing/color/
---
## Color class


Αντιπροσωπεύει ένα χρώμα. Αυτός ο τύπος πρέπει να κατανεμηθεί στη στοίβα και να περνιέται σε συναρτήσεις με τιμή ή με αναφορά. Ποτέ μην χρησιμοποιείτε την κλάση [System::SmartPtr](../../system/smartptr/) για τη διαχείριση αντικειμένων αυτού του τύπου.

```cpp
class Color
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Color](./color/)() | Δημιουργεί ένα \"κενό\" αντικείμενο της κλάσης [Color](./) που δεν αντιπροσωπεύει κανένα χρώμα. |
| [Equals](./equals/)(const Color\&) const | Καθορίζει εάν το τρέχον και το καθορισμένο αντικείμενο [Color](./) αντιπροσωπεύουν το ίδιο χρώμα. |
| static [FromArgb](./fromargb/)(int) | Δημιουργεί ένα αντικείμενο της κλάσης [Color](./) που αντιπροσωπεύει το καθορισμένο χρώμα. |
| static [FromArgb](./fromargb/)(int, int, int, int) | Δημιουργεί ένα αντικείμενο της κλάσης [Color](./) που αντιπροσωπεύει το καθορισμένο χρώμα. |
| static [FromArgb](./fromargb/)(int, int, int) | Δημιουργεί ένα αντικείμενο της κλάσης [Color](./) που αντιπροσωπεύει το καθορισμένο χρώμα με το συστατικό άλφα ορισμένο στο 0xFF. |
| static [FromArgb](./fromargb/)(int, Color) | Δημιουργεί ένα αντικείμενο της κλάσης [Color](./) που αντιπροσωπεύει το καθορισμένο χρώμα. |
| static [FromKnownColor](./fromknowncolor/)(KnownColor) | Δημιουργεί ένα αντικείμενο της κλάσης [Color](./) που αντιπροσωπεύει το καθορισμένο γνωστό χρώμα. |
| static [FromName](./fromname/)(const String\&) | Δημιουργεί ένα αντικείμενο της κλάσης [Color](./) που αντιπροσωπεύει ένα χρώμα με το καθορισμένο όνομα. |
| [get_A](./get_a/)() const | Επιστρέφει την τιμή του συστατικού άλφα του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_AliceBlue](./get_aliceblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF0F8FF. |
| static [get_AntiqueWhite](./get_antiquewhite/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFAEBD7. |
| static [get_Aqua](./get_aqua/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00FFFF. |
| static [get_Aquamarine](./get_aquamarine/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF7FFFD4. |
| static [get_Azure](./get_azure/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF0FFFF. |
| [get_B](./get_b/)() const | Επιστρέφει την τιμή του μπλε συστατικού του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Beige](./get_beige/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF5F5DC. |
| static [get_Bisque](./get_bisque/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFE4C4. |
| static [get_Black](./get_black/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF000000. |
| static [get_BlanchedAlmond](./get_blanchedalmond/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFEBCD. |
| static [get_Blue](./get_blue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF0000FF. |
| static [get_BlueViolet](./get_blueviolet/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF8A2BE2. |
| static [get_Brown](./get_brown/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFA52A2A. |
| static [get_BurlyWood](./get_burlywood/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDEB887. |
| static [get_CadetBlue](./get_cadetblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF5F9EA0. |
| static [get_Chartreuse](./get_chartreuse/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF7FFF00. |
| static [get_Chocolate](./get_chocolate/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFD2691E. |
| static [get_Coral](./get_coral/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF7F50. |
| static [get_CornflowerBlue](./get_cornflowerblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF6495ED. |
| static [get_Cornsilk](./get_cornsilk/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFF8DC. |
| static [get_Crimson](./get_crimson/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDC143C. |
| static [get_Cyan](./get_cyan/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00FFFF. |
| static [get_DarkBlue](./get_darkblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00008B. |
| static [get_DarkCyan](./get_darkcyan/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF008B8B. |
| static [get_DarkGoldenrod](./get_darkgoldenrod/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFB8860B. |
| static [get_DarkGray](./get_darkgray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFA9A9A9. |
| static [get_DarkGreen](./get_darkgreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF006400. |
| static [get_DarkKhaki](./get_darkkhaki/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFBDB76B. |
| static [get_DarkMagenta](./get_darkmagenta/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF8B008B. |
| static [get_DarkOliveGreen](./get_darkolivegreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF556B2F. |
| static [get_DarkOrange](./get_darkorange/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF8C00. |
| static [get_DarkOrchid](./get_darkorchid/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF9932CC. |
| static [get_DarkRed](./get_darkred/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF8B0000. |
| static [get_DarkSalmon](./get_darksalmon/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFE9967A. |
| static [get_DarkSeaGreen](./get_darkseagreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF8FBC8F. |
| static [get_DarkSlateBlue](./get_darkslateblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF483D8B. |
| static [get_DarkSlateGray](./get_darkslategray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF2F4F4F. |
| static [get_DarkTurquoise](./get_darkturquoise/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00CED1. |
| static [get_DarkViolet](./get_darkviolet/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF9400D3. |
| static [get_DeepPink](./get_deeppink/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF1493. |
| static [get_DeepSkyBlue](./get_deepskyblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00BFFF. |
| static [get_DimGray](./get_dimgray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF696969. |
| static [get_DodgerBlue](./get_dodgerblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF1E90FF. |
| static [get_Firebrick](./get_firebrick/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFB22222. |
| static [get_FloralWhite](./get_floralwhite/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFAF0. |
| static [get_ForestGreen](./get_forestgreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF228B22. |
| static [get_Fuchsia](./get_fuchsia/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF00FF. |
| [get_G](./get_g/)() const | Επιστρέφει την τιμή του πράσινου συστατικού του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Gainsboro](./get_gainsboro/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDCDCDC. |
| static [get_GhostWhite](./get_ghostwhite/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF8F8FF. |
| static [get_Gold](./get_gold/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFD700. |
| static [get_Goldenrod](./get_goldenrod/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDAA520. |
| static [get_Gray](./get_gray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF808080. |
| static [get_Green](./get_green/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF008000. |
| static [get_GreenYellow](./get_greenyellow/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFADFF2F. |
| static [get_Honeydew](./get_honeydew/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF0FFF0. |
| static [get_HotPink](./get_hotpink/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF69B4. |
| static [get_IndianRed](./get_indianred/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFCD5C5C. |
| static [get_Indigo](./get_indigo/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF4B0082. |
| [get_IsEmpty](./get_isempty/)() const | Επιστρέφει μια τιμή που υποδεικνύει εάν το τρέχον αντικείμενο είναι "κενό", δηλαδή δεν αντιπροσωπεύει κανένα χρώμα. |
| [get_IsNamedColor](./get_isnamedcolor/)() const | Επιστρέφει μια τιμή που καθορίζει εάν η δομή [Color](./) αντιπροσωπεύει ένα ονομαστικό χρώμα ή ένα μέλος της απαρίθμησης [KnownColor](../knowncolor/). |
| static [get_Ivory](./get_ivory/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFFF0. |
| static [get_Khaki](./get_khaki/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF0E68C. |
| static [get_Lavender](./get_lavender/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFE6E6FA. |
| static [get_LavenderBlush](./get_lavenderblush/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFF0F5. |
| static [get_LawnGreen](./get_lawngreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF7CFC00. |
| static [get_LemonChiffon](./get_lemonchiffon/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFACD. |
| static [get_LightBlue](./get_lightblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFADD8E6. |
| static [get_LightCoral](./get_lightcoral/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF08080. |
| static [get_LightCyan](./get_lightcyan/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFE0FFFF. |
| static [get_LightGoldenrodYellow](./get_lightgoldenrodyellow/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFAFAD2. |
| static [get_LightGray](./get_lightgray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFD3D3D3. |
| static [get_LightGreen](./get_lightgreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF90EE90. |
| static [get_LightPink](./get_lightpink/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFB6C1. |
| static [get_LightSalmon](./get_lightsalmon/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFA07A. |
| static [get_LightSeaGreen](./get_lightseagreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF20B2AA. |
| static [get_LightSkyBlue](./get_lightskyblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF87CEFA. |
| static [get_LightSlateGray](./get_lightslategray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF778899. |
| static [get_LightSteelBlue](./get_lightsteelblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFB0C4DE. |
| static [get_LightYellow](./get_lightyellow/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFFE0. |
| static [get_Lime](./get_lime/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00FF00. |
| static [get_LimeGreen](./get_limegreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF32CD32. |
| static [get_Linen](./get_linen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFAF0E6. |
| static [get_Magenta](./get_magenta/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF00FF. |
| static [get_Maroon](./get_maroon/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF800000. |
| static [get_MediumAquamarine](./get_mediumaquamarine/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF66CDAA. |
| static [get_MediumBlue](./get_mediumblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF0000CD. |
| static [get_MediumOrchid](./get_mediumorchid/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFBA55D3. |
| static [get_MediumPurple](./get_mediumpurple/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF9370DB. |
| static [get_MediumSeaGreen](./get_mediumseagreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF3CB371. |
| static [get_MediumSlateBlue](./get_mediumslateblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF7B68EE. |
| static [get_MediumSpringGreen](./get_mediumspringgreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00FA9A. |
| static [get_MediumTurquoise](./get_mediumturquoise/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF48D1CC. |
| static [get_MediumVioletRed](./get_mediumvioletred/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFC71585. |
| static [get_MidnightBlue](./get_midnightblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF191970. |
| static [get_MintCream](./get_mintcream/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF5FFFA. |
| static [get_MistyRose](./get_mistyrose/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFE4E1. |
| static [get_Moccasin](./get_moccasin/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFE4B5. |
| [get_Name](./get_name/)() const | Επιστρέφει το όνομα του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_NavajoWhite](./get_navajowhite/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFDEAD. |
| static [get_Navy](./get_navy/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF000080. |
| static [get_OldLace](./get_oldlace/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFDF5E6. |
| static [get_Olive](./get_olive/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF808000. |
| static [get_OliveDrab](./get_olivedrab/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF6B8E23. |
| static [get_Orange](./get_orange/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFA500. |
| static [get_OrangeRed](./get_orangered/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF4500. |
| static [get_Orchid](./get_orchid/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDA70D6. |
| static [get_PaleGoldenrod](./get_palegoldenrod/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFEEE8AA. |
| static [get_PaleGreen](./get_palegreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF98FB98. |
| static [get_PaleTurquoise](./get_paleturquoise/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFAFEEEE. |
| static [get_PaleVioletRed](./get_palevioletred/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDB7093. |
| static [get_PapayaWhip](./get_papayawhip/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFEFD5. |
| static [get_PeachPuff](./get_peachpuff/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFDAB9. |
| static [get_Peru](./get_peru/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFCD853F. |
| static [get_Pink](./get_pink/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFC0CB. |
| static [get_Plum](./get_plum/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFDDA0DD. |
| static [get_PowderBlue](./get_powderblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFB0E0E6. |
| static [get_Purple](./get_purple/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF800080. |
| [get_R](./get_r/)() const | Επιστρέφει την τιμή του κόκκινου συστατικού του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Red](./get_red/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF0000. |
| static [get_RosyBrown](./get_rosybrown/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFBC8F8F. |
| static [get_RoyalBlue](./get_royalblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF4169E1. |
| static [get_SaddleBrown](./get_saddlebrown/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF8B4513. |
| static [get_Salmon](./get_salmon/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFA8072. |
| static [get_SandyBrown](./get_sandybrown/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF4A460. |
| static [get_SeaGreen](./get_seagreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF2E8B57. |
| static [get_SeaShell](./get_seashell/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFF5EE. |
| static [get_Sienna](./get_sienna/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFA0522D. |
| static [get_Silver](./get_silver/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFC0C0C0. |
| static [get_SkyBlue](./get_skyblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF87CEEB. |
| static [get_SlateBlue](./get_slateblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF6A5ACD. |
| static [get_SlateGray](./get_slategray/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF708090. |
| static [get_Snow](./get_snow/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFAFA. |
| static [get_SpringGreen](./get_springgreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF00FF7F. |
| static [get_SteelBlue](./get_steelblue/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF4682B4. |
| static [get_Tan](./get_tan/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFD2B48C. |
| static [get_Teal](./get_teal/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF008080. |
| static [get_Thistle](./get_thistle/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFD8BFD8. |
| static [get_Tomato](./get_tomato/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFF6347. |
| static [get_Transparent](./get_transparent/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #00FFFFFF. |
| static [get_Turquoise](./get_turquoise/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF40E0D0. |
| static [get_Violet](./get_violet/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFEE82EE. |
| static [get_Wheat](./get_wheat/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF5DEB3. |
| static [get_White](./get_white/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFFFF. |
| static [get_WhiteSmoke](./get_whitesmoke/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFF5F5F5. |
| static [get_Yellow](./get_yellow/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FFFFFF00. |
| static [get_YellowGreen](./get_yellowgreen/)() | Επιστρέφει ένα χρώμα του οποίου η τιμή ARGB σε δεκαεξαδική σημειογραφία είναι #FF9ACD32. |
| [GetBrightness](./getbrightness/)() | Επιστρέφει το στοιχείο φωτεινότητας του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetHashCode](./gethashcode/)() const | Επιστρέφει τον κωδικό κατακερματισμού του τρέχοντος αντικειμένου. |
| [GetHue](./gethue/)() | Επιστρέφει την τιμή απόχρωσης Hue-Saturation-Brightness (HSB), σε μοίρες, για το χρώμα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetSaturation](./getsaturation/)() | Επιστρέφει τον κορεσμό Hue-Saturation-Brightness (HSB) για το χρώμα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [IsNull](./isnull/)() const | Πάντα επιστρέφει false. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Επιστρέφει πάντα true. |
| [operator!=](./operator!=/)(const Color\&) const | Καθορίζει εάν το τρέχον και τα καθορισμένα αντικείμενα [Color](./) αντιπροσωπεύουν διαφορετικά χρώματα. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Πάντα επιστρέφει false. |
| [operator==](./operator==/)(const Color\&) const | Καθορίζει εάν το τρέχον και το καθορισμένο αντικείμενο [Color](./) αντιπροσωπεύουν το ίδιο χρώμα. |
| [ToArgb](./toargb/)() const | Επιστρέφει μια τιμή ARGB 32-bit του χρώματος που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [ToString](./tostring/)() const | Επιστρέφει την αναπαράσταση σε συμβολοσειρά του τρέχοντος αντικειμένου. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](./empty/) | Μία "άδεια" παρουσία της κλάσης [Color](./) δηλαδή μια παρουσία που δεν αντιπροσωπεύει κανένα χρώμα. |
## Δείτε επίσης

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
