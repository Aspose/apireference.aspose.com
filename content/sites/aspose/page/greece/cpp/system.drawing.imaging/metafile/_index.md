---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Imaging::Metafile class. Αντιπροσωπεύει ένα γραφικό metafile. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Αντιπροσωπεύει ένα γραφικό metafile. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Metafile : public System::Drawing::Image
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Επιστρέφει ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [get_Height](./get_height/)() const override | Επιστρέφει τα ύψη της εικόνας σε εικονοστοιχεία. |
| [get_PixelFormat](./get_pixelformat/)() const override | Επιστρέφει μια τιμή που υποδεικνύει τη μορφή εικονοστοιχείου. |
| [get_RawFormat](./get_rawformat/)() const override | Επιστρέφει μια τιμή που υποδεικνύει τη μορφή εικόνας. |
| [get_Width](./get_width/)() const override | Επιστρέφει το πλάτος της εικόνας σε εικονοστοιχεία. |
| [GetHenhmetafile](./gethenhmetafile/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [GetMetafileHeader](./getmetafileheader/)() | Επιστρέφει μια κεφαλίδα που σχετίζεται με το τρέχον αντικείμενο. |
| [Metafile](./metafile/)(const System::String\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [Metafile](./metafile/)(IntPtr, EmfType) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| virtual [~Metafile](./~metafile/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
