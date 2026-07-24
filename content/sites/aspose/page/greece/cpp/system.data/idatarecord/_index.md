---
title: "System::Data::IDataRecord κλάση"
linktitle: "IDataRecord"
second_title: "Aspose.Page για C++"
description: "System::Data::IDataRecord class. Διεπαφή για εγγραφή με στήλες. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1300
url: /el/cpp/system.data/idatarecord/
---
## IDataRecord class


Διεπαφή για εγγραφή με στήλες. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class IDataRecord : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | Πληροφορίες RTTI. |
| virtual [GetName](./getname/)(const int32_t) | Λαμβάνει το όνομα του πεδίου στη συγκεκριμένη θέση. |
| virtual [idx_get](./idx_get/)(const int32_t) | Λαμβάνει την τιμή στον καθορισμένο δείκτη. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
