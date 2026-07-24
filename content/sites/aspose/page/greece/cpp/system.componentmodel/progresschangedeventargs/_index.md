---
title: "System::ComponentModel::ProgressChangedEventArgs κλάση"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::ProgressChangedEventArgs κλάση. Ένα αντίγραφο αυτής της κλάσης περνιέται ως όρισμα στον delegate ProgressChangedEventHandler. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε ως όρισμα σε συναρτήσεις στην C++."
type: docs
weight: 1100
url: /el/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Ένα αντίγραφο αυτής της κλάσης περνιέται ως όρισμα στον delegate ProgressChangedEventHandler. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε ως όρισμα σε συναρτήσεις.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Λαμβάνει το ποσοστό προόδου της ασύγχρονης εργασίας. |
| [get_UserState](./get_userstate/)() const | Λαμβάνει μια μοναδική κατάσταση χρήστη. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Κατασκευαστής. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Δείτε επίσης

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
