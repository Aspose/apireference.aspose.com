---
title: "Κλάση System::Reflection::Assembly"
linktitle: "Assembly"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Reflection::Assembly. Κλάση αντανάκλασης που περιγράφει τη συναρμολόγηση. Η υποστήριξη είναι περιορισμένη καθώς οι κανόνες διαφέρουν σημαντικά μεταξύ C# και C++. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Assembly](./assembly/)() | Κατασκευαστής. |
| virtual [get_CodeBase](./get_codebase/)() const | Λαμβάνει τον κατάλογο της τρέχουσας συναρμολόγησης. Η υποστήριξη είναι περιορισμένη. |
| virtual [get_FullName](./get_fullname/)() const | Λαμβάνει το πλήρες όνομα της συναρμολόγησης. |
| virtual [get_Location](./get_location/)() const | Λαμβάνει τη θέση της συναρμολόγησης. Δεν έχει υλοποιηθεί. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Λαμβάνει τη συναρμολόγηση που ορίζει συγκεκριμένο τύπο. |
| static [GetCallingAssembly](./getcallingassembly/)() | Λαμβάνει τη συναρμολόγηση που καλεί. |
| static [GetEntryAssembly](./getentryassembly/)() | Λαμβάνει τη συναρμολόγηση εισόδου. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Λαμβάνει τη συναρμολόγηση εκτέλεσης. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Λαμβάνει τα ονόματα των πόρων του μανιφέστου. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Λαμβάνει τη ροή που συνδέεται με τον πόρο του μανιφέστου. |
| virtual [GetName](./getname/)() const | Λαμβάνει το όνομα της συναρμολόγησης. |
| virtual [GetTypes](./gettypes/)() const | Λαμβάνει τους τύπους που δηλώνονται από τη συναρμολόγηση. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
