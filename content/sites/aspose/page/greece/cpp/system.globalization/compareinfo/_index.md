---
title: "System::Globalization::CompareInfo class"
linktitle: "CompareInfo"
second_title: "Aspose.Page για C++"
description: "System::Globalization::CompareInfo class. Εκτελεί σύγκριση συμβολοσειρών με ευαισθησία στον πολιτισμό. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Εκτελεί σύγκριση συμβολοσειρών με ευαισθησία στον πολιτισμό. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class CompareInfo : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Συγκρίνει συμβολοσειρές. Δεν έχει υλοποιηθεί. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Συγκρίνει συμβολοσειρές. Υποστηρίζονται μόνο οι λειτουργίες Ordinal και OrdinalIgnoreCase. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Συγκρίνει ένα τμήμα μιας συμβολοσειράς με ένα τμήμα δεύτερης συμβολοσειράς. Δεν έχει υλοποιηθεί. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Συγκρίνει το τελικό τμήμα μιας συμβολοσειράς με το τελικό τμήμα δεύτερης συμβολοσειράς χρησιμοποιώντας μεθόδους σύγκρισης συμβολοσειρών. Δεν έχει υλοποιηθεί. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Συγκρίνει το τελικό τμήμα μιας συμβολοσειράς με το τελικό τμήμα δεύτερης συμβολοσειράς. Δεν έχει υλοποιηθεί. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Συγκρίνει ένα τμήμα μιας συμβολοσειράς με ένα τμήμα δεύτερης συμβολοσειράς χρησιμοποιώντας μεθόδους σύγκρισης συμβολοσειρών. Δεν έχει υλοποιηθεί. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | Πληροφορίες RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Αποκτά το LCID του πολιτισμού που σχετίζεται με το συγκριτή. |
| virtual [get_Name](./get_name/)() const | Αποκτά το όνομα του πολιτισμού που σχετίζεται με το συγκριτή. |
| [get_Version](./get_version/)() const | Αποκτά πληροφορίες σχετικά με την έκδοση ταξινόμησης. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Λαμβάνει το [CompareInfo](./) που σχετίζεται με την καθορισμένη πολιτισμική ρύθμιση και χρησιμοποιεί μεθόδους σύγκρισης συμβολοσειρών στην καθορισμένη συναρμολόγηση. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Λαμβάνει το [CompareInfo](./) που σχετίζεται με την καθορισμένη πολιτισμική ρύθμιση και χρησιμοποιεί μεθόδους σύγκρισης συμβολοσειρών στην καθορισμένη συναρμολόγηση. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Λαμβάνει το [CompareInfo](./) που σχετίζεται με την καθορισμένη πολιτισμική ρύθμιση. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Λαμβάνει το [CompareInfo](./) που σχετίζεται με την καθορισμένη πολιτισμική ρύθμιση. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Λαμβάνει τον κωδικό κατακερματισμού της συμβολοσειράς βάσει των καθορισμένων επιλογών σύγκρισης. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Λαμβάνει το αντικείμενο [SortKey](../sortkey/) για τη καθορισμένη συμβολοσειρά χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Λαμβάνει το αντικείμενο [SortKey](../sortkey/) για τη καθορισμένη συμβολοσειρά. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Αναζητά υποσυμβολοσειρά. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Αναζητά υποσυμβολοσειρά. Υποστηρίζεται μόνο η λειτουργία Ordinal. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Αναζητά υποσυμβολοσειρά. Υποστηρίζεται μόνο η λειτουργία Ordinal. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Αναζητά τον καθορισμένο χαρακτήρα. Υποστηρίζεται μόνο η λειτουργία Ordinal. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Αναζητά υποσυμβολοσειρά. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Αναζητά τον καθορισμένο χαρακτήρα. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Αναζητά υποσυμβολοσειρά. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Αναζητά τον καθορισμένο χαρακτήρα. Υποστηρίζεται μόνο η λειτουργία Ordinal. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Αναζητά τον καθορισμένο χαρακτήρα. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Αναζητά τον καθορισμένο χαρακτήρα. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Αναζητά υποσυμβολοσειρά. Υποστηρίζεται μόνο η λειτουργία Ordinal. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Αναζητά τον καθορισμένο χαρακτήρα. Υποστηρίζεται μόνο η λειτουργία Ordinal. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Ελέγχει εάν η καθορισμένη συμβολοσειρά αρχίζει με το καθορισμένο πρόθεμα χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Ελέγχει εάν η καθορισμένη συμβολοσειρά αρχίζει με το καθορισμένο πρόθεμα. |
| static [IsSortable](./issortable/)(char16_t) | Ελέγχει εάν ένας καθορισμένος χαρακτήρας είναι ταξινομήσιμος. |
| static [IsSortable](./issortable/)(const String\&) | Ελέγχει εάν μια καθορισμένη συμβολοσειρά είναι ταξινομήσιμη. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Ελέγχει εάν η καθορισμένη συμβολοσειρά λήγει με το καθορισμένο επίθημα χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Ελέγχει εάν η καθορισμένη συμβολοσειρά λήγει με το καθορισμένο επίθημα. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Αναζητά την τελευταία εμφάνιση της καθορισμένης υποσυμβολοσειράς. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Αναζητά την τελευταία εμφάνιση της καθορισμένης υποσυμβολοσειράς χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Αναζητά την τελευταία εμφάνιση του καθορισμένου χαρακτήρα χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Αναζητά την τελευταία εμφάνιση της καθορισμένης συμβολοσειράς. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Αναζητά την τελευταία εμφάνιση της καθορισμένης συμβολοσειράς χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Αναζητά την τελευταία εμφάνιση του καθορισμένου χαρακτήρα χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Αναζητά την τελευταία εμφάνιση της καθορισμένης συμβολοσειράς. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Αναζητά την τελευταία εμφάνιση του καθορισμένου χαρακτήρα. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Αναζητά την τελευταία εμφάνιση της καθορισμένης συμβολοσειράς χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Αναζητά την τελευταία εμφάνιση του καθορισμένου χαρακτήρα χρησιμοποιώντας τις καθορισμένες επιλογές σύγκρισης. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Αναζητά την τελευταία εμφάνιση του καθορισμένου χαρακτήρα. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Αναζητά την τελευταία εμφάνιση του καθορισμένου χαρακτήρα. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
