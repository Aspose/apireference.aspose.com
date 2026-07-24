---
title: "System::Data::Common::DbDataReader κλάση"
linktitle: "DbDataReader"
second_title: "Aspose.Page για C++"
description: "System::Data::Common::DbDataReader κλάση. API για λήψη δεδομένων από τη βάση δεδομένων. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API για λήψη δεδομένων από τη βάση δεδομένων. Αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class DbDataReader : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Close](./close/)() | Κλείνει το κανάλι ανάκτησης δεδομένων. |
| virtual [idx_get](./idx_get/)(String) | Λαμβάνει το ονομασμένο στοιχείο. |
| virtual [idx_get](./idx_get/)(int) | Λαμβάνει το στοιχείο κατά δείκτη. |
| virtual [Read](./read/)() | Διαβάζει την επόμενη εγγραφή από τη βάση δεδομένων. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
