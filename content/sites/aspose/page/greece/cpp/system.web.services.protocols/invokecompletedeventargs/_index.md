---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs class"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs class. Μια παρουσία αυτής της κλάσης περνά ως όρισμα στον delegate InvokeCompletedEventHandler. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


Μια παρουσία αυτής της κλάσης περνά ως όρισμα στον delegate InvokeCompletedEventHandler. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Results](./get_results/)() | Επιστρέφει μια συλλογή αποτελεσμάτων ασύγχρονων λειτουργιών. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Δημιουργεί μια νέα παρουσία. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Δείτε επίσης

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
