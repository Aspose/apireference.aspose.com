---
title: "Κλάση System::Net::IPAddress"
linktitle: "IPAddress"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Net::IPAddress. Αντιπροσωπεύει τη διεύθυνση IP. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2400
url: /el/cpp/system.net/ipaddress/
---
## IPAddress class


Αντιπροσωπεύει τη διεύθυνση IP. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class IPAddress : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_AddressFamily](./get_addressfamily/)() | Επιστρέφει την οικογένεια διευθύνσεων. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η διεύθυνση είναι διεύθυνση IPv4 και έχει αντιστοιχιστεί σε διεύθυνση IPv6. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η διεύθυνση είναι διεύθυνση IPv6 link-local. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η διεύθυνση είναι παγκόσμια διεύθυνση IPv6 multicast. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η διεύθυνση είναι διεύθυνση IPv6 site-local. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν η διεύθυνση είναι διεύθυνση IPv6 Teredo. |
| [get_ScopeId](./get_scopeid/)() | Αποκτά το αναγνωριστικό εμβέλειας της διεύθυνσης IPv6. |
| [GetAddressBytes](./getaddressbytes/)() | Επιστρέφει έναν πίνακα byte της διεύθυνσης IP. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [GetImpl](./getimpl/)() const | Επιστρέφει έναν δείκτη στην υλοποίηση. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Μετατρέπει τη συγκεκριμένη σειρά byte του κεντρικού υπολογιστή στη αντίστοιχη σειρά byte του δικτύου. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Μετατρέπει τη συγκεκριμένη σειρά byte του κεντρικού υπολογιστή στη αντίστοιχη σειρά byte του δικτύου. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Μετατρέπει τη συγκεκριμένη σειρά byte του κεντρικού υπολογιστή στη αντίστοιχη σειρά byte του δικτύου. |
| [IPAddress](./ipaddress/)(int64_t) | Δημιουργεί μια νέα παρουσία. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Δημιουργεί μια νέα παρουσία. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Δημιουργεί μια νέα παρουσία. |
| [IPAddress](./ipaddress/)() | Δημιουργεί μια νέα παρουσία. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Επιστρέφει μια τιμή που υποδεικνύει εάν η συγκεκριμένη διεύθυνση είναι διεύθυνση loopback. |
| [MapToIPv4](./maptoipv4/)() | Αντιστοιχίζει τη διεύθυνση στη διεύθυνση IPv4. |
| [MapToIPv6](./maptoipv6/)() | Αντιστοιχίζει τη διεύθυνση στη διεύθυνση IPv6. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Μετατρέπει τη συγκεκριμένη σειρά byte του δικτύου στη αντίστοιχη σειρά byte του κεντρικού υπολογιστή. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Μετατρέπει τη συγκεκριμένη σειρά byte του δικτύου στη αντίστοιχη σειρά byte του κεντρικού υπολογιστή. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Μετατρέπει τη συγκεκριμένη σειρά byte του δικτύου στη αντίστοιχη σειρά byte του κεντρικού υπολογιστή. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε ένα στιγμιότυπο της κλάσης [IPAddress](./). |
| [set_ScopeId](./set_scopeid/)(int64_t) | Ορίζει το αναγνωριστικό εμβέλειας της διεύθυνσης IPv6. |
| [SetImpl](./setimpl/)(ImplPtr) | Ορίζει έναν δείκτη στην υλοποίηση. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Προσπαθεί να μετατρέψει μια δοσμένη συμβολοσειρά σε μια παρουσία της κλάσης [IPAddress](./). |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [Any](./any/) | Πληροφορίες RTTI. |
| static [Broadcast](./broadcast/) | Η διεύθυνση μετάδοσης IPv4. |
| static [IPv6Any](./ipv6any/) | Η διεύθυνση IPv6 που υποδεικνύει αν ο διακομιστής πρέπει να ακούει σε όλες τις δικτυακές διεπαφές. |
| static [IPv6Loopback](./ipv6loopback/) | Η διεύθυνση loopback IPv6. |
| static [IPv6None](./ipv6none/) | Η διεύθυνση IPv6 που υποδεικνύει αν ο διακομιστής δεν πρέπει να ακούει καμία δικτυακή διεπαφή. |
| static [Loopback](./loopback/) | Η διεύθυνση loopback IPv4. |
| static [None](./none/) | Η διεύθυνση IPv4 που υποδεικνύει αν ο διακομιστής δεν πρέπει να ακούει καμία δικτυακή διεπαφή. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ImplPtr](./implptr/) | Ένας δείκτης στον τύπο υλοποίησης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
