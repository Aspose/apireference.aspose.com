---
title: "System::Drawing::Image class"
linktitle: "Image"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Image class. Μια βασική κλάση για τις κλάσεις System::Drawing::Bitmap και System::Drawing::Metafile που παρέχει βασική λειτουργικότητα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.drawing/image/
---
## Image class


Μια βασική κλάση για τις κλάσεις [System::Drawing::Bitmap](../bitmap/) και System::Drawing::Metafile που παρέχει βασική λειτουργικότητα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Image : public virtual System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Clone](./clone/)() | Δημιουργεί ένα αντίγραφο του τρέχοντος αντικειμένου. |
| [Dispose](./dispose/)() override | Απελευθερώνει όλους τους πόρους που έχει αποκτήσει το τρέχον αντικείμενο. |
| static [FromFile](./fromfile/)(const String\&, bool) | Δημιουργεί ένα αντικείμενο [Image](./) από το καθορισμένο αρχείο. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | Δημιουργεί ένα αντικείμενο [Bitmap](../bitmap/) από το καθορισμένο bitmap GDI. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | Δημιουργεί ένα αντικείμενο [Image](./) από τη συγκεκριμένη ροή. |
| virtual [get_Flags](./get_flags/)() const | Επιστρέφει έναν δυαδικό συνδυασμό τιμών του enum ImageFlags που αντιπροσωπεύει τα χαρακτηριστικά της εικόνας. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | Επιστρέφει έναν πίνακα GUID που αντιπροσωπεύει τις διαστάσεις των πλαισίων μέσα στην εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [get_Height](./get_height/)() const | Επιστρέφει το ύψος της εικόνας σε εικονοστοιχεία. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | Επιστρέφει την οριζόντια ανάλυση της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο σε εικονοστοιχεία ανά ίντσα. |
| virtual [get_Palette](./get_palette/)() const | Επιστρέφει την παλέτα χρωμάτων που χρησιμοποιείται από την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | Επιστρέφει τη μορφή εικονοστοιχείου της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | Αποκτά τα αναγνωριστικά των στοιχείων ιδιοτήτων που αποθηκεύονται σε αυτήν την εικόνα. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | Αποκτά όλα τα στοιχεία ιδιοτήτων (τμήματα μεταδεδομένων) που αποθηκεύονται σε αυτήν την εικόνα. |
| virtual [get_RawFormat](./get_rawformat/)() const | Επιστρέφει τη μορφή αρχείου της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Size](./get_size/)() const | Επιστρέφει ένα αντικείμενο [Size](../size/) που αντιπροσωπεύει το πλάτος και το ύψος της εικόνας σε εικονοστοιχεία. |
| virtual [get_Tag](./get_tag/)() const | Αποκτά ένα αντικείμενο που παρέχει πρόσθετα δεδομένα σχετικά με την εικόνα. |
| [get_VerticalResolution](./get_verticalresolution/)() const | Επιστρέφει την κάθετη ανάλυση της εικόνας που αντιπροσωπεύεται από το τρέχον αντικείμενο σε εικονοστοιχεία ανά ίντσα. |
| virtual [get_Width](./get_width/)() const | Επιστρέφει το πλάτος της εικόνας σε εικονοστοιχεία. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | Επιστρέφει τα όρια της εικόνας στις καθορισμένες μονάδες μέτρησης. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | Επιστρέφει τον αριθμό των πλαισίων της καθορισμένης διάστασης πλαισίου. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | Επιστρέφει τον αριθμό των δυαδικών ψηφίων που χρησιμοποιούνται για την αναπαράσταση του βάθους χρώματος στη καθορισμένη μορφή εικονοστοιχείου. |
| virtual [GetSkBitmap](./getskbitmap/)() const | Επιστρέφει ένα υποκείμενο αντικείμενο SkBitmap. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | Αποκτά μια μικρογραφία για αυτό το αντικείμενο [System::Drawing::Image](./). |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | Καθορίζει εάν η καθορισμένη μορφή εικονοστοιχείου περιέχει πληροφορίες άλφα. |
| virtual [IsMultiImage](./ismultiimage/)() const | Επιστρέφει εάν η αρχική μορφή είναι πολλαπλή εικόνα. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | Περιστρέφει την εικόνα κατά πολλαπλάσια των 90 μοιρών και την αναστρέφει. |
| [Save](./save/)(const String\&) | Αποθηκεύει την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο στο καθορισμένο αρχείο σε μορφή PNG. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | Αποθηκεύει την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο στο καθορισμένο αρχείο στη καθορισμένη μορφή. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | Αποθηκεύει την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο στο καθορισμένο ρεύμα στη καθορισμένη μορφή. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Αποθηκεύει την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο στο καθορισμένο αρχείο χρησιμοποιώντας τον καθορισμένο κωδικοποιητή και τις παραμέτρους κωδικοποιητή. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Αποθηκεύει την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο στο καθορισμένο ρεύμα χρησιμοποιώντας τον καθορισμένο κωδικοποιητή και τις παραμέτρους κωδικοποιητή. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | Προσθέτει ένα πλαίσιο στο αρχείο ή ρεύμα που καθορίστηκε σε προηγούμενη κλήση της μεθόδου [Save()](./save/) . |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | Προσθέτει ένα πλαίσιο στο αρχείο ή ρεύμα που καθορίστηκε σε προηγούμενη κλήση της μεθόδου [Save()](./save/) . |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | Επιλέγει το καθορισμένο πλαίσιο. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | Ορίζει την παλέτα χρωμάτων που χρησιμοποιείται από την εικόνα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | Ορίζει ένα αντικείμενο που παρέχει πρόσθετα δεδομένα σχετικά με την εικόνα. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | Μία κλήση επιστροφής για την ακύρωση της εκτέλεσης του GetThumbnailImage. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
