---
title: "System::Text::RegularExpressions::GroupCollection κλάση"
linktitle: "GroupCollection"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::GroupCollection class. Λίστα των ομάδων σύλληψης σε μία μόνο αντιστοίχιση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Λίστα των ομάδων σύλληψης σε μία μόνο αντιστοίχιση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Απενεργοποιεί την προσθήκη στοιχείου στη συλλογή. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Προσθέτει ομάδα στη συλλογή. |
| [Clear](./clear/)() override | Απενεργοποιεί την αφαίρεση στοιχείων από τη συλλογή. |
| [get_Item](./get_item/)(int) const | [Group](../group/) πρόσβαση. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) πρόσβαση. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Κατασκευαστής. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) πρόσβαση. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) πρόσβαση. |
| [IsReadOnly](./isreadonly/)() const | Σημειώνει τη συλλογή ως μόνο για ανάγνωση. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) πρόσβαση. |
| [operator[]](./operator[]/)(int) | [Group](../group/) πρόσβαση. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) πρόσβαση. |
| [Remove](./remove/)(const GroupPtr\&) override | Απενεργοποιεί την αφαίρεση στοιχείου από τη συλλογή. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Base](./base/) | [Base](./base/) κλάση. |
## Δείτε επίσης

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
