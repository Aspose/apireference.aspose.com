---
title: "System::ComponentModel::Component κλάση"
linktitle: "Συστατικό"
second_title: "Aspose.Page για C++"
description: "System::ComponentModel::Component κλάση. Κατηγορία ψεύτικου για να είναι μεταγλωττιζόμενος ο κώδικας μετάφρασης χρησιμοποιώντας την κλάση Component. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε ως όρισμα σε συναρτήσεις στην C++."
type: docs
weight: 400
url: /el/cpp/system.componentmodel/component/
---
## Component class


Κατηγορία ψεύτικου για να είναι μεταγλωττιζόμενος ο κώδικας μετάφρασης χρησιμοποιώντας την κλάση [Component](./). Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε ως όρισμα σε συναρτήσεις.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Component](./component/)() | Πληροφορίες RTTI. |
| [Dispose](./dispose/)(bool) | Υποστήριξη του προτύπου Disposable· δεν κάνει τίποτα. |
| [get_DesignMode](./get_designmode/)() | Ελέγχει αν το συστατικό βρίσκεται σε λειτουργία σχεδίασης. |
## Δείτε επίσης

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
