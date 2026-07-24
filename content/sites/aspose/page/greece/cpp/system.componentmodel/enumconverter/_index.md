---
title: "System::ComponentModel::EnumConverter class"
linktitle: "EnumConverter"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::EnumConverter class. Ψεύτικη κλάση για μεταφρασμένο κώδικα που χρησιμοποιεί EnumConverter ώστε να μεταγλωττιστεί. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Ψεύτικη κλάση για μεταφρασμένο κώδικα που χρησιμοποιεί EnumConverter ώστε να μεταγλωττιστεί. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assertion. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Ελέγχει αν οι τύποι είναι μετατρέψιμοι· δεν έχει υλοποιηθεί. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Ελέγχει αν οι τύποι είναι μετατρέψιμοι· δεν έχει υλοποιηθεί. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Κάνει πραγματική μετατροπή τύπου· δεν έχει υλοποιηθεί. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Κάνει πραγματική μετατροπή τύπου· δεν έχει υλοποιηθεί. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | Πληροφορίες RTTI. |
| [get_EnumType](./get_enumtype/)() | Λαμβάνει τον τύπο enum με τον οποίο εργάζεται το [EnumConverter](./); δεν έχει υλοποιηθεί. |
## Δείτε επίσης

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
