---
title: "System::Drawing::Imaging::ImageCodecInfo κλάση"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page για C++"
description: "System::Drawing::Imaging::ImageCodecInfo κλάση. Παρέχει πληροφορίες σχετικά με έναν κωδικοποιητή εικόνας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Παρέχει πληροφορίες σχετικά με έναν κωδικοποιητή εικόνας. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ImageCodecInfo : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Επιστρέφει ένα GUID που σχετίζεται με τη μορφή του κωδικοποιητή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_MimeType](./get_mimetype/)() | Επιστρέφει τον τύπο Multipurpose Internet Mail Extensions (MIME) του κωδικοποιητή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [GetImageDecoders](./getimagedecoders/)() | Επιστρέφει έναν πίνακα από αντικείμενα [ImageCodecInfo](./) που αντιπροσωπεύουν τους υποστηριζόμενους αποκωδικοποιητές εικόνας. |
| static [GetImageEncoders](./getimageencoders/)() | Επιστρέφει έναν πίνακα από αντικείμενα [ImageCodecInfo](./) που αντιπροσωπεύουν τους υποστηριζόμενους κωδικοποιητές εικόνας. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Ορίζει ένα GUID που σχετίζεται με τη μορφή του κωδικοποιητή που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
