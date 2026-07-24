---
title: "System::Net::PathList κλάση"
linktitle: "PathList"
second_title: "Aspose.Page για C++"
description: "System::Net::PathList κλάση. Αντιπροσωπεύει τη λίστα των στιγμιοτύπων της κλάσης CookieCollection. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3000
url: /el/cpp/system.net/pathlist/
---
## PathList class


Αντιπροσωπεύει τη λίστα των στιγμιοτύπων της κλάσης [CookieCollection](../cookiecollection/). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class PathList : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)() | Δημιουργεί μια νέα παρουσία. |
| [get_Count](./get_count/)() const | Επιστρέφει τον αριθμό των στοιχείων. |
| [get_SyncRoot](./get_syncroot/)() const | Επιστρέφει το αντικείμενο μέσω του οποίου συγχρονίζεται η συλλογή. |
| [GetCookiesCount](./getcookiescount/)() | Επιστρέφει τον αριθμό των cookie όλων των στοιχείων της συλλογής. |
| [GetEnumerator](./getenumerator/)() | Επιστρέφει τον απαριθμητή για την τρέχουσα συλλογή. |
| [idx_get](./idx_get/)(String) | Λαμβάνει τη συλλογή cookie με το καθορισμένο μονοπάτι. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Ορίζει τη συλλογή cookie με το καθορισμένο μονοπάτι. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
