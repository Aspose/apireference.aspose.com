---
title: "System::Drawing::Imaging::ImageFormat κλάση"
linktitle: "ImageFormat"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Imaging::ImageFormat κλάση. Αντιπροσωπεύει τη μορφή αρχείου μιας εικόνας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε αντί instance αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1100
url: /el/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Αντιπροσωπεύει τη μορφή αρχείου μιας εικόνας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντί instance αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ImageFormat : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Καθορίζει αν οι μορφές εικόνας που αντιπροσωπεύονται από τα τρέχοντα και τα καθορισμένα αντικείμενα είναι ίσες. |
| static [get_Bmp](./get_bmp/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας bitmap. |
| static [get_Emf](./get_emf/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή βελτιωμένου metafile. |
| static [get_Exif](./get_exif/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή Exchangeable [Image](../../system.drawing/image/) File (Exif). |
| static [get_Gif](./get_gif/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | Επιστρέφει το GUID που σχετίζεται με τη μορφή εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [get_Icon](./get_icon/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας εικονιδίου [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή ενός bitmap στη μνήμη. |
| static [get_Png](./get_png/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | Επιστρέφει έναν κοινόχρηστο δείκτη σε αντικείμενο [ImageFormat](./) που αντιπροσωπεύει τη μορφή εικόνας [Windows](../../system.windows/) metafile (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Δημιουργεί μια παρουσία της κλάσης [ImageFormat](./) που αντιπροσωπεύει μια μορφή εικόνας που σχετίζεται με το καθορισμένο GUID. |
| virtual [ToString](./tostring/)() const | Μετατρέπει αυτό το αντικείμενο [ImageFormat](./) σε μια αναγνώσιμη από άνθρωπο συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
