---
title: "System::Net::IPEndPoint κλάση"
linktitle: "IPEndPoint"
second_title: "Aspose.Page για C++"
description: "System::Net::IPEndPoint κλάση. Αντιπροσωπεύει ένα σημείο δικτύου που περιέχει μια διεύθυνση IP και μια θύρα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2500
url: /el/cpp/system.net/ipendpoint/
---
## IPEndPoint class


Αντιπροσωπεύει ένα σημείο δικτύου που περιέχει μια διεύθυνση IP και μια θύρα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | Δημιουργήστε ένα νέο στιγμιότυπο της κλάσης [EndPoint](../endpoint/) χρησιμοποιώντας τη συγκεκριμένη διεύθυνση υποδοχής. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Address](./get_address/)() | Λαμβάνει τη διεύθυνση του σημείου. |
| [get_AddressFamily](./get_addressfamily/)() override | Πληροφορίες RTTI. |
| [get_Port](./get_port/)() | Λαμβάνει τον αριθμό θύρας. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [GetImpl](./getimpl/)() const override | Επιστρέφει έναν δείκτη στην υλοποίηση. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | Ορίζει τη διεύθυνση του σημείου. |
| [set_Port](./set_port/)(int32_t) | Ορίζει τον αριθμό θύρας. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Any](./any/) | Το σημείο για οποιαδήποτε διεύθυνση IPv4 και οποιαδήποτε θύρα. |
| static [AnyPort](./anyport/) | Μια τιμή που υποδεικνύει αν μπορεί να χρησιμοποιηθεί οποιαδήποτε θύρα. |
| static [IPv6Any](./ipv6any/) | Το σημείο για οποιαδήποτε διεύθυνση IPv6 και οποιαδήποτε θύρα. |
| static [MaxPort](./maxport/) | Ο μέγιστος αριθμός θύρας. |
| static [MinPort](./minport/) | Πληροφορίες RTTI. |
## Δείτε επίσης

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
