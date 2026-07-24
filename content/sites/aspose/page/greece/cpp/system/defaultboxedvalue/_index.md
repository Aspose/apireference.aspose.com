---
title: "Κλάση System::DefaultBoxedValue"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Page για C++"
description: "Κλάση System::DefaultBoxedValue. Υλοποίηση κλάσης BoxedValue. Επιτρέπει στις ειδικεύσεις BoxingValue να δηλώνονται χωρίς την αντιγραφή του κοινόχρηστου κώδικα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2000
url: /el/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [DefaultBoxedValue](./) που αντιπροσωπεύει την καθορισμένη τιμή. |
| [Equals](./equals/)(ptr) override | Καθορίζει την ισότητα των συσκευασμένων τιμών που αντιπροσωπεύονται από το τρέχον και το συγκεκριμένο αντικείμενο. |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει έναν κωδικό κατακερματισμού για το τρέχον αντικείμενο. |
| [GetType](./gettype/)() const override | Λαμβάνει τον πραγματικό τύπο του αντικειμένου. |
| [is](./is/)() const | Καθορίζει εάν ο τύπος της συσκευασμένης τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι **V**. |
| [ToString](./tostring/)() const override | Επιστρέφει την αναπαράσταση κειμένου της συσκευασμένης τιμής. |
| [unbox](./unbox/)() const | Αποσυσκευάζει τη συσκευασμένη τιμή. |
## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
