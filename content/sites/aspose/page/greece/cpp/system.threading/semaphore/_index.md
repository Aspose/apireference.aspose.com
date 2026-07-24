---
title: "System::Threading::Semaphore κλάση"
linktitle: "Semaphore"
second_title: "Aspose.Page για C++"
description: "System::Threading::Semaphore κλάση. Υλοποίηση του Semaphore. Τα αντικείμενα αυτής της κλάσης θα πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Release](./release/)() | Απελευθερώνει το κλείδωμα του semaphore. |
| [Release](./release/)(int) | Απελευθερώνει πολλαπλά κλειδώματα στο semaphore. |
| virtual [Reset](./reset/)() | Ορίζει το semaphore σε κατάσταση μη-σηματοδότησης. Δεν υποστηρίζεται. |
| [Semaphore](./semaphore/)(int, int) | Πληροφορίες RTTI. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Δημιουργεί ονομασμένο semaphore. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Δημιουργεί ονομασμένο semaphore. |
| virtual [Set](./set/)() | Ορίζει το semaphore σε κατάσταση σήματος. Δεν υποστηρίζεται. |
| [WaitOne](./waitone/)() override | Κλειδώνει το semaphore. Εκτελεί απεριόριστη αναμονή εάν είναι απαραίτητο. |
| [WaitOne](./waitone/)(int) override | Κλειδώνει το semaphore. Εκτελεί αναμονή εάν είναι απαραίτητο. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Ειδική τιμή που θα επιστραφεί από τη συνάρτηση, διαφορετικά επιστρέφει το δείκτη του αντικειμένου που έχει σήμα στον πίνακα, εάν το χρονικό όριο υπερβεί και τίποτα δεν σήμα. |
## Δείτε επίσης

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
