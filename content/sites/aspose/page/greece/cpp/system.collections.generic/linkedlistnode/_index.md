---
title: "System::Collections::Generic::LinkedListNode κλάση"
linktitle: "LinkedListNode"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::LinkedListNode κλάση. Κόμβος συνδεδεμένης λίστας. Υλοποιεί ένα wrapper πάνω από έναν iterator του std::list που είναι τυλιγμένος σε συνδεδεμένη λίστα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3200
url: /el/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Κόμβος συνδεδεμένης λίστας. Υλοποιεί ένα wrapper πάνω από έναν iterator του std::list που είναι τυλιγμένος σε συνδεδεμένη λίστα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος αποθηκευμένης τιμής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_List](./get_list/)() const | Λαμβάνει τη λίστα που περιέχει. |
| [get_Next](./get_next/)() const | Λαμβάνει τον επόμενο κόμβο. |
| [get_Previous](./get_previous/)() const | Λαμβάνει τον προηγούμενο κόμβο. |
| [get_Value](./get_value/)() const | Λαμβάνει την αποθηκευμένη τιμή. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Κατασκευαστής. |
| [set_Value](./set_value/)(const T\&) | Ορίζει την αποθηκευμένη τιμή. |

## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
