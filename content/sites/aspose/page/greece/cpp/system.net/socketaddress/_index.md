---
title: "System::Net::SocketAddress κλάση"
linktitle: "SocketAddress"
second_title: "Aspose.Page για C++"
description: "System::Net::SocketAddress κλάση. Χρησιμοποιείται για την αποθήκευση σειριασμένων πληροφοριών σχετικά με τις εμφανίσεις της κλάσης EndPoint. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε εμφάνιση αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3300
url: /el/cpp/system.net/socketaddress/
---
## SocketAddress class


Χρησιμοποιείται για την αποθήκευση σειριασμένων πληροφοριών σχετικά με τις εμφανίσεις της κλάσης [EndPoint](../endpoint/). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε εμφάνιση αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SocketAddress : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Family](./get_family/)() | Πληροφορίες RTTI. |
| [get_Size](./get_size/)() | Επιστρέφει το μέγεθος του υποκείμενου buffer. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [idx_get](./idx_get/)(int32_t) | Λαμβάνει μια τιμή του υποκείμενου buffer στη καθορισμένη θέση. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Ορίζει μια τιμή του υποκείμενου buffer στη καθορισμένη θέση. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Δημιουργεί μια νέα παρουσία. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
