---
title: "System::Threading::EventWaitHandle class"
linktitle: "EventWaitHandle"
second_title: "Aspose.Page για C++"
description: "System::Threading::EventWaitHandle class. Συμβάν που μπορεί να σταλεί σε νήμα που περιμένει. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | Πληροφορίες RTTI. |
| virtual [Reset](./reset/)() | Ορίζει το γεγονός σε κατάσταση μη-σήμανσης. |
| virtual [Set](./set/)() | Ορίζει το γεγονός σε κατάσταση σήμανσης. |
| [~EventWaitHandle](./~eventwaithandle/)() | Καταστροφέας. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Ειδική τιμή που θα επιστραφεί από τη συνάρτηση, διαφορετικά επιστρέφει το δείκτη του αντικειμένου που έχει σήμα στον πίνακα, εάν το χρονικό όριο υπερβεί και τίποτα δεν σήμα. |
## Δείτε επίσης

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
