---
title: "System::Drawing::ImageFormatConverter κλάση"
linktitle: "ImageFormatConverter"
second_title: "Aspose.Page για C++"
description: "System::Drawing::ImageFormatConverter κλάση. Μετατρέπει αντικείμενα ImageFormat από έναν τύπο δεδομένων σε άλλον. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1400
url: /el/cpp/system.drawing/imageformatconverter/
---
## ImageFormatConverter class


Μετατρέπει τα αντικείμενα ImageFormat από έναν τύπο δεδομένων σε άλλο. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ImageFormatConverter : public System::ComponentModel::TypeConverter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&) override | Μετατρέπει αντικείμενα. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενα. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενα. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Μετατρέπει συμβολοσειρά σε αντικείμενο. |
| [ConvertTo](./convertto/)(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) override | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| [ImageFormatConverter](./imageformatconverter/)() | Δημιουργεί ένα νέο στιγμιότυπο του [ImageFormatConverter](./). |
## Δείτε επίσης

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
