---
title: "System::ComponentModel::AsyncCompletedEventArgs κλάση"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::AsyncCompletedEventArgs κλάση. Μια παρουσία αυτής της κλάσης περνιέται ως όρισμα στον delegate AsyncCompletedEventHandler. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Μια παρουσία αυτής της κλάσης περνιέται ως όρισμα στον delegate AsyncCompletedEventHandler. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Κατασκευαστής. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν μια ασύγχρονη λειτουργία έχει ακυρωθεί. true εάν η λειτουργία στο παρασκήνιο έχει ακυρωθεί· διαφορετικά false. Η προεπιλογή είναι false. |
| [get_Error](./get_error/)() const | Λαμβάνει μια τιμή που υποδεικνύει ποιο σφάλμα συνέβη κατά τη διάρκεια μιας ασύγχρονης λειτουργίας. |
| [get_UserState](./get_userstate/)() const | Λαμβάνει το μοναδικό αναγνωριστικό για την ασύγχρονη εργασία. Μια αναφορά αντικειμένου που αναγνωρίζει μοναδικά την ασύγχρονη εργασία· διαφορετικά, null εάν δεν έχει οριστεί τιμή. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ένα στατικό μέλος που αντιπροσωπεύει έναν "κενό" [EventArgs](../../system/eventargs/) δείκτη κοινόχρηστου (null-pointer). |
## Δείτε επίσης

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
