---
title: "System::Data::Common::DbCommand κλάση"
linktitle: "DbCommand"
second_title: "Aspose.Page για C++"
description: "System::Data::Common::DbCommand κλάση. Εντολή βάσης δεδομένων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.data.common/dbcommand/
---
## DbCommand class


Εντολή βάσης δεδομένων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class DbCommand : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Εκτελεί εντολή μη ερωτήματος. |
| virtual [ExecuteReader](./executereader/)() | Εκτελεί εντολή ερωτήματος. |
| virtual [get_CommandText](./get_commandtext/)() const | Πληροφορίες RTTI. |
| virtual [get_Connection](./get_connection/)() const | Λαμβάνει τη σύνδεση βάσης δεδομένων που σχετίζεται με την εντολή. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Ορίζει το κείμενο εντολής DB. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Λαμβάνει τη σύνδεση βάσης δεδομένων που σχετίζεται με την εντολή. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
