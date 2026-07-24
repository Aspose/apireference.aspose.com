---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::CaptureCollection κλάση. Λίστα των καταγραφών που πραγματοποιήθηκαν από μία μόνο ομάδα σύλληψης. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Λίστα των καταγραφών που πραγματοποιήθηκαν από μία μόνο ομάδα σύλληψης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Απενεργοποιεί την τροποποίηση της συλλογής. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Μέθοδος υπηρεσίας για την προσθήκη καταγραφής στη συλλογή. |
| [Clear](./clear/)() override | Απενεργοποιεί τον καθαρισμό της συλλογής. |
| [get_Count](./get_count/)() const override | Επιστρέφει τον αριθμό των καταγραφών. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Σημειώνει τη συλλογή ως μόνο για ανάγνωση. |
| [get_IsSynchronized](./get_issynchronized/)() const | Σημειώνει τη συλλογή ως μη συγχρονισμένη. |
| [idx_get](./idx_get/)(int) const override | Πρόσβαση [Capture](../capture/). |
| [operator[]](./operator[]/)(int) | Πρόσβαση [Capture](../capture/). |
| [operator[]](./operator[]/)(int) const | Πρόσβαση [Capture](../capture/). |
| [Remove](./remove/)(const CapturePtr\&) override | Απενεργοποιεί την τροποποίηση της συλλογής. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Base](./base/) | Τύπος [Base](./base/). |
## Δείτε επίσης

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
