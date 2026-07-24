---
title: "System::Diagnostics::TraceListener class"
linktitle: "TraceListener"
second_title: "Aspose.Page για C++"
description: "System::Diagnostics::TraceListener class. Διεπαφή για αντίδραση σε πληροφορίες αποσφαλμάτωσης και εντοπισμού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 800
url: /el/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Διεπαφή για αντίδραση σε πληροφορίες αποσφαλμάτωσης και εντοπισμού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) . Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class TraceListener : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Γράφει μήνυμα αποτυχίας στον αποσφαλματωτή. |
| virtual [Fail](./fail/)(System::String, System::String) | Γράφει μήνυμα αποτυχίας στον αποσφαλματωτή. |
| virtual [Write](./write/)(System::String) | Πληροφορίες RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | Γράφει γραμμή στον αποσφαλματωτή. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
