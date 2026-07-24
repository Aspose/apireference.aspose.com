---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Bitmap class. Αντιπροσωπεύει μια εικόνα bitmap GDI+. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.drawing/bitmap/
---
## Bitmap class


Αντιπροσωπεύει μια εικόνα bitmap GDI+. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class Bitmap : public System::Drawing::Image
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Ενεργοποιεί τη λειτουργία επεξεργασίας εικονοστοιχείων. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) από την καθορισμένη υπάρχουσα εικόνα. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) από το καθορισμένο ρεύμα δεδομένων. |
| [Bitmap](./bitmap/)(const String\&) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) από το καθορισμένο αρχείο. |
| [Bitmap](./bitmap/)(const String\&, bool) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) από το καθορισμένο αρχείο. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) που αντιπροσωπεύει μια εικόνα bitmap με το καθορισμένο πλάτος, ύψος, μορφή εικονοστοιχείου και δεδομένα εικονοστοιχείων. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) από την καθορισμένη υπάρχουσα εικόνα, κλιμακωμένο στο καθορισμένο μέγεθος. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Δημιουργεί ένα νέο αντικείμενο [Bitmap](./) από την καθορισμένη υπάρχουσα εικόνα με το πλάτος και το ύψος κλιμακωμένα στις καθορισμένες τιμές. |
| [Clone](./clone/)() override | Δημιουργεί ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Δημιουργεί ένα αντικείμενο [Bitmap](./) που αντιπροσωπεύει ένα αντίγραφο μιας περιοχής της εικόνας bitmap που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Δημιουργεί ένα αντικείμενο [Bitmap](./) που αντιπροσωπεύει ένα αντίγραφο μιας περιοχής της εικόνας bitmap που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [ComputeHash](./computehash/)() | Υπολογίζει την τιμή κατακερματισμού SHA1. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Δημιουργεί ένα αντίγραφο της καθορισμένης εικόνας bitmap με τη μορφή εικονοστοιχείου να αλλάξει σε Format32bppArgb. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Απενεργοποιεί τη λειτουργία επεξεργασίας εικονοστοιχείων. |
| [get_Height](./get_height/)() const override | Επιστρέφει το ύψος της εικόνας σε εικονοστοιχεία. |
| [get_Palette](./get_palette/)() const override | Επιστρέφει την παλέτα χρωμάτων που χρησιμοποιείται από την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_PixelFormat](./get_pixelformat/)() const override | Επιστρέφει τη μορφή εικονοστοιχείου της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_RawFormat](./get_rawformat/)() const override | Επιστρέφει τη μορφή αρχείου της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Width](./get_width/)() const override | Επιστρέφει το πλάτος της εικόνας σε εικονοστοιχεία. |
| [GetHbitmap](./gethbitmap/)() | Δημιουργεί ένα αντικείμενο bitmap GDI από το bitmap που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetPixel](./getpixel/)(int, int) | Επιστρέφει το χρώμα του καθορισμένου εικονοστοιχείου. |
| [GetSkBitmap](./getskbitmap/)() const override | Επιστρέφει έναν ακατέργαστο δείκτη στο υποκείμενο αντικείμενο SkBitmap. |
| [IsMultiImage](./ismultiimage/)() const override | Επιστρέφει εάν η αρχική μορφή είναι πολλαπλή εικόνα. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | Κλειδώνει ένα [Bitmap](./) στη μνήμη συστήματος. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | Κλειδώνει ένα [Bitmap](./) στη μνήμη συστήματος. |
| [MakeTransparent](./maketransparent/)(Color) | Αλλάζει το χρώμα όλων των εικονοστοιχείων με το καθορισμένο χρώμα σε διαφανές. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Προπολλαπλασιάζει τα χρώματα των εικονοστοιχείων της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Περιστρέφει την εικόνα σε πολλαπλάσια των 90 μοιρών και την αντιστρέφει. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Ορίζει την παλέτα χρωμάτων που χρησιμοποιείται από την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [SetPixel](./setpixel/)(int, int, Color) | Ορίζει το χρώμα του καθορισμένου εικονοστοιχείου στην bitmap εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [SetResolution](./setresolution/)(float, float) | Ορίζει την ανάλυση της εικόνας. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Ξεκλειδώνει το καθορισμένο bitmap από τη μνήμη συστήματος. |
## Δείτε επίσης

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
