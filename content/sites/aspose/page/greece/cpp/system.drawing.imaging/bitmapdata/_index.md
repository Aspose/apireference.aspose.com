---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Imaging::BitmapData class. Αντιπροσωπεύει ένα σύνολο χαρακτηριστικών μιας bitmap εικόνας. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


Αντιπροσωπεύει ένα σύνολο χαρακτηριστικών μιας bitmap εικόνας. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class BitmapData : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Height](./get_height/)() const | Επιστρέφει το ύψος της εικόνας σε εικονοστοιχεία. |
| [get_PixelFormat](./get_pixelformat/)() const | Επιστρέφει τη μορφή pixel της bitmap εικόνας. |
| [get_Scan0](./get_scan0/)() const | Επιστρέφει τη διεύθυνση των πρώτων δεδομένων pixel στην bitmap. |
| [get_Stride](./get_stride/)() const | Επιστρέφει το πλάτος stride της εικόνας σε bytes. |
| [get_Width](./get_width/)() const | Επιστρέφει το πλάτος της εικόνας σε εικονοστοιχεία. |
| [set_Height](./set_height/)(int) | Ορίζει το ύψος της εικόνας σε pixel. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | Ορίζει τη μορφή pixel της bitmap εικόνας. |
| [set_Scan0](./set_scan0/)(IntPtr) | Ορίζει τη διεύθυνση των πρώτων δεδομένων pixel στην bitmap. |
| [set_Stride](./set_stride/)(int) | Ορίζει το πλάτος stride της εικόνας σε bytes. |
| [set_Width](./set_width/)(int) | Ορίζει το πλάτος της εικόνας σε pixel. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
