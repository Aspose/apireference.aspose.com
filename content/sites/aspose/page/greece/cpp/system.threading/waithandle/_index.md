---
title: "System::Threading::WaitHandle κλάση"
linktitle: "WaitHandle"
second_title: "Aspose.Page για C++"
description: "System::Threading::WaitHandle κλάση. Βασική κλάση πρωτογενούς αναμονής. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1700
url: /el/cpp/system.threading/waithandle/
---
## WaitHandle class


Βασική κλάση πρωτογενούς αναμονής. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class WaitHandle : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Close](./close/)() | Απελευθερώνει οποιονδήποτε πόρο που σχετίζεται με το handle. |
| [get_Handle](./get_handle/)() | Λαμβάνει το handle. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Πληροφορίες RTTI. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Περιμένει μέχρι όλα τα handles να ενεργοποιηθούν. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Περιμένει μέχρι όλα τα handles να ενεργοποιηθούν. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Περιμένει μέχρι οποιοδήποτε από τα handles να ενεργοποιηθεί. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Περιμένει μέχρι οποιοδήποτε από τα handles να ενεργοποιηθεί. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Περιμένει μέχρι οποιοδήποτε από τα handles να ενεργοποιηθεί. |
| virtual [WaitOne](./waitone/)() | Περιμένει το χειριστήριο να ενεργοποιηθεί για απεριόριστη χρονική διάρκεια. |
| virtual [WaitOne](./waitone/)(int) | Περιμένει το χειριστήριο να ενεργοποιηθεί. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Περιμένει το χειριστήριο να ενεργοποιηθεί. |
| virtual [WaitOne](./waitone/)(int, bool) | Περιμένει το χειριστήριο να ενεργοποιηθεί. |
| virtual [~WaitHandle](./~waithandle/)() | Καταστροφέας. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Ειδική τιμή που θα επιστραφεί από τη συνάρτηση, διαφορετικά επιστρέφει το δείκτη του αντικειμένου που έχει σήμα στον πίνακα, εάν το χρονικό όριο υπερβεί και τίποτα δεν σήμα. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
