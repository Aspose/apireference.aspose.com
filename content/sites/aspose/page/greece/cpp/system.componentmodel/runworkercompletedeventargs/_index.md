---
title: "System::ComponentModel::RunWorkerCompletedEventArgs κλάση"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs κλάση. Ένα στιγμιότυπο αυτής της κλάσης περνιέται ως όρισμα στον delegate RunWorkerCompletedEventHandler. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1300
url: /el/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


Ένα στιγμιότυπο αυτής της κλάσης περνιέται ως όρισμα στον delegate RunWorkerCompletedEventHandler. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Result](./get_result/)() const | Λαμβάνει τιμή που αντιπροσωπεύει το αποτέλεσμα μιας ασύγχρονης λειτουργίας. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | Πληροφορίες RTTI. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Δείτε επίσης

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
