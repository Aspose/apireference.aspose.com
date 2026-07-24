---
title: "System::StringComparer class"
linktitle: "StringComparer"
second_title: "Aspose.Page για C++"
description: "System::StringComparer class. Συγκρίνει συμβολοσειρές χρησιμοποιώντας διαφορετικές λειτουργίες σύγκρισης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 5900
url: /el/cpp/system/stringcomparer/
---
## StringComparer class


Συγκρίνει συμβολοσειρές χρησιμοποιώντας διαφορετικές λειτουργίες σύγκρισης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Συγκρίνει δύο συμβολοσειρές χρησιμοποιώντας τις τρέχουσες ρυθμίσεις. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Δημιουργεί συγκριτή ειδικό για τον πολιτισμό. |
| [Equals](./equals/)(String, String) const override | Ελέγχει αν δύο συμβολοσειρές είναι ίσες χρησιμοποιώντας τις τρέχουσες ρυθμίσεις. |
| static [get_CurrentCulture](./get_currentculture/)() | Singleton συγκριτή τρέχουσας πολιτιστικής ρύθμισης. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Singleton συγκριτή τρέχουσας πολιτιστικής ρύθμισης που αγνοεί τη διάκριση πεζών-κεφαλαίων. |
| static [get_InvariantCulture](./get_invariantculture/)() | Singleton συγκριτή αμετάβλητης πολιτιστικής ρύθμισης. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Singleton συγκριτή αμετάβλητης πολιτιστικής ρύθμισης που αγνοεί τη διάκριση πεζών-κεφαλαίων. |
| static [get_Ordinal](./get_ordinal/)() | Singleton συγκριτή διατεταγμένης σειράς. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Singleton συγκριτή διατεταγμένης σειράς που αγνοεί τη διάκριση πεζών-κεφαλαίων. |
| [GetHashCode](./gethashcode/)(String) const override | Λαμβάνει τον κωδικό κατακερματισμού της συμβολοσειράς. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [args_type](./args_type/) | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
