---
title: Class Font
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Font τάξη. Καθορίζει μια συγκεκριμένη μορφή για κείμενο συμπεριλαμβανομένων των χαρακτηριστικών όψης γραμματοσειράς μεγέθους και στυλ. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 500
url: /el/net/system.drawing/font/
---
## Font class

Καθορίζει μια συγκεκριμένη μορφή για κείμενο, συμπεριλαμβανομένων των χαρακτηριστικών όψης γραμματοσειράς, μεγέθους και στυλ. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class Font : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | Αρχικοποιεί μια νέα παρουσία του`Font` η κλάση χρησιμοποιεί το καθορισμένο υπάρχονFont καιFontStyle απαρίθμηση.. |
| [Font](font/#constructor_1)(FontFamily, float) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη. |
| [Font](font/#constructor_7)(string, float) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος. |
| [Font](font/#constructor_2)(FontFamily, float, FontStyle) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος και στυλ.. |
| [Font](font/#constructor_6)(FontFamily, float, GraphicsUnit) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος και μονάδα. Ορίζει το στυλ σεRegular . |
| [Font](font/#constructor_8)(string, float, FontStyle) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος και στυλ. |
| [Font](font/#constructor_12)(string, float, GraphicsUnit) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος και μονάδα. Το στυλ έχει οριστεί σεRegular . |
| [Font](font/#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος, στυλ και μονάδα. |
| [Font](font/#constructor_9)(string, float, FontStyle, GraphicsUnit) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος, στυλ και μονάδα. |
| [Font](font/#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος, στυλ, μονάδα και σύνολο χαρακτήρων.. |
| [Font](font/#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Αρχικοποιεί μια νέα παρουσία του`Font`τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος, στυλ, μονάδα και σύνολο χαρακτήρων. |
| [Font](font/#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας ένα καθορισμένο μέγεθος, στυλ, μονάδα και σύνολο χαρακτήρων.. |
| [Font](font/#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Αρχικοποιεί μια νέα παρουσία του`Font` τάξη χρησιμοποιώντας το καθορισμένο μέγεθος, στυλ, μονάδα και σύνολο χαρακτήρων. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Bold](../../system.drawing/font/bold/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτόFont είναι τολμηρή. |
| [FontFamily](../../system.drawing/font/fontfamily/) { get; } | Λαμβάνει τοFontFamily συνδέονται με αυτόFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset/) { get; } | Λαμβάνει μια τιμή byte που καθορίζει το σύνολο χαρακτήρων GDI που αυτόFont χρήσεις. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτόFont προέρχεται από μια κάθετη γραμματοσειρά GDI.. |
| [Height](../../system.drawing/font/height/) { get; } | Λαμβάνει το διάστιχο αυτής της γραμματοσειράς. |
| [IsSystemFont](../../system.drawing/font/issystemfont/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν η γραμματοσειρά είναι μέλος τηςSystemFonts . |
| [Italic](../../system.drawing/font/italic/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτόFont είναι πλάγιο. |
| [Name](../../system.drawing/font/name/) { get; } | Λαμβάνει το όνομα προσώπου αυτούFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname/) { get; } | Παίρνει το όνομα της γραμματοσειράς που καθορίστηκε αρχικά. |
| [Size](../../system.drawing/font/size/) { get; } | Παίρνει το em-size αυτούFont μετρημένη στις μονάδες που καθορίζονται από το Unit ιδιοκτησία. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints/) { get; } | Λαμβάνει το em-size, σε πόντους, αυτούFont . |
| [Strikeout](../../system.drawing/font/strikeout/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτόFont καθορίζει μια οριζόντια γραμμή μέσω της γραμματοσειράς. |
| [Style](../../system.drawing/font/style/) { get; } | Λαμβάνει πληροφορίες στυλ για αυτόFont . |
| [SystemFontName](../../system.drawing/font/systemfontname/) { get; } | Λαμβάνει το όνομα της γραμματοσειράς συστήματος εάν η ιδιότητα IsSystemFont επιστρέψει true. |
| [Underline](../../system.drawing/font/underline/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτόFont είναι υπογραμμισμένο. |
| [Unit](../../system.drawing/font/unit/) { get; } | Παίρνει τη μονάδα μέτρησης για αυτόFont . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../system.drawing/font/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτούFont . |
| [Dispose](../../system.drawing/font/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτόFont . |
| override [Equals](../../system.drawing/font/equals/)(object) | Υποδεικνύει εάν το καθορισμένο αντικείμενο είναι αFont και έχει το ίδιοFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , καιUnit αξίες ιδιοκτησίας ως αυτόFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode/)() | Λαμβάνει τον κωδικό κατακερματισμού για αυτόFont . |
| [GetHeight](../../system.drawing/font/getheight/#getheight)() | Επιστρέφει το διάστιχο, σε pixel, αυτής της γραμματοσειράς. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_1)(float) | Επιστρέφει το ύψος αυτού, σε pixelFontόταν έλκεται σε μια συσκευή με την καθορισμένη κατακόρυφη ανάλυση. |
| [GetHeight](../../system.drawing/font/getheight/#getheight_2)(Graphics) | Επιστρέφει το διάστιχο, στην τρέχουσα μονάδα ενός καθορισμένουGraphics , αυτής της γραμματοσειράς. |
| override [ToString](../../system.drawing/font/tostring/)() | Επιστρέφει μια αναπαράσταση συμβολοσειράς αναγνώσιμη από τον άνθρωποFont . |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


