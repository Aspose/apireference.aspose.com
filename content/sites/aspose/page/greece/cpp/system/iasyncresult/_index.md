---
title: "Κλάση System::IAsyncResult"
linktitle: "IAsyncResult"
second_title: "Aspose.Page για C++"
description: "Κλάση System::IAsyncResult. Αντιπροσωπεύει την κατάσταση της ασύγχρονης λειτουργίας. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο με τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3100
url: /el/cpp/system/iasyncresult/
---
## IAsyncResult class


Αντιπροσωπεύει την κατάσταση της ασύγχρονης λειτουργίας. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο με τη συνάρτηση [System::MakeObject()](../makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class IAsyncResult : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | Επιστρέφει ένα αντικείμενο που περιέχει τις πληροφορίες για την ασύγχρονη λειτουργία. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | Επιστρέφει μια παρουσία του WaitHandle που μπορεί να χρησιμοποιηθεί για να περιμένει την ολοκλήρωση της ασύγχρονης λειτουργίας. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η ασύγχρονη λειτουργία ολοκληρώθηκε συγχρονισμένα. |
| virtual [get_IsCompleted](./get_iscompleted/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η ασύγχρονη λειτουργία έχει ολοκληρωθεί. |
| virtual [~IAsyncResult](./~iasyncresult/)() | Καταστροφέας. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [smart_ptr](./smart_ptr/) | Κοινός δείκτης προς [IAsyncResult](./). |
## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
