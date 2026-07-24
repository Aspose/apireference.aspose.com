---
title: "System::Drawing::ImageConverter κλάση"
linktitle: "ImageConverter"
second_title: "Aspose.Page για C++"
description: "System::Drawing::ImageConverter κλάση. Μετατρέπει αντικείμενα Image από έναν τύπο δεδομένων σε άλλον. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1300
url: /el/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Μετατρέπει αντικείμενα [Image](../image/) από έναν τύπο δεδομένων σε άλλον. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| [ImageConverter](./imageconverter/)() | Δημιουργεί ένα νέο στιγμιότυπο του [ImageConverter](./). |
## Δείτε επίσης

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
