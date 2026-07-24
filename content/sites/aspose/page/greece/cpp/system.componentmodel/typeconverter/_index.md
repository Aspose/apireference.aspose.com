---
title: "System::ComponentModel::TypeConverter κλάση"
linktitle: "TypeConverter"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::TypeConverter κλάση. Κλάση που διαχειρίζεται τη μετατροπή τύπων στο μοντέλο στοιχείου. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1400
url: /el/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Κλάση που διαχειρίζεται τη μετατροπή τύπων στο μοντέλο στοιχείου. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TypeConverter : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενα. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενα. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Μετατρέπει συμβολοσειρά σε αντικείμενο. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | Μετατρέπει αμετάβλητη συμβολοσειρά σε αντικείμενο. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Μετατρέπει αμετάβλητη συμβολοσειρά σε αντικείμενο. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | Μετατρέπει συμβολοσειρά σε αντικείμενο. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Μετατρέπει συμβολοσειρά σε αντικείμενο. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Μετατρέπει συμβολοσειρά σε αντικείμενο. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενο σε αμετάβλητη συμβολοσειρά. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενο σε αμετάβλητη συμβολοσειρά. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενο σε συμβολοσειρά. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενο σε συμβολοσειρά. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Μετατρέπει αντικείμενο σε συμβολοσειρά. |
| [TypeConverter](./typeconverter/)() | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
