---
title: "System::Net::Sockets::TcpListener κλάση"
linktitle: "TcpListener"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::TcpListener κλάση. Αντιπροσωπεύει έναν ακροατή για τις υπηρεσίες δικτύου TCP. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και να χρησιμοποιείτε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


Αντιπροσωπεύει έναν ακροατή για τις υπηρεσίες δικτύου TCP. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TcpListener : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Αποδέχεται το εκκρεμές αίτημα σύνδεσης και επιστρέφει το socket που χρησιμοποιείται για αποστολή και λήψη δεδομένων. |
| [AcceptTcpClient](./accepttcpclient/)() | Αποδέχεται το εκκρεμές αίτημα σύνδεσης και επιστρέφει το στιγμιότυπο της κλάσης TcpClient που χρησιμοποιείται για αποστολή και λήψη δεδομένων. |
| [AllowNatTraversal](./allownattraversal/)(bool) | Ενεργοποιεί ή απενεργοποιεί τη διέλευση NAT. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία αποδοχής. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία αποδοχής. |
| static [Create](./create/)(int32_t) | Δημιουργεί ένα νέο στιγμιότυπο χρησιμοποιώντας τον καθορισμένο αριθμό θύρας. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία αποδοχής. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία αποδοχής. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν το τρέχον στιγμιότυπο επιτρέπει μόνο έναν πελάτη να χρησιμοποιήσει μια θύρα. |
| [get_LocalEndpoint](./get_localendpoint/)() | Επιστρέφει το υποκείμενο σημείο άκρου. |
| [get_Server](./get_server/)() | Πληροφορίες RTTI. |
| [Pending](./pending/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν υπάρχουν εκκρεμή αιτήματα σύνδεσης. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το τρέχον στιγμιότυπο επιτρέπει μόνο έναν πελάτη να χρησιμοποιήσει μια θύρα. |
| [Start](./start/)() | Ξεκινά την ακρόαση για τις εισερχόμενες συνδέσεις. |
| [Start](./start/)(int32_t) | Ξεκινά την ακρόαση για τις εισερχόμενες συνδέσεις. |
| [Stop](./stop/)() | Σταματά την ακρόαση για τις εισερχόμενες συνδέσεις. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Δημιουργεί μια νέα παρουσία. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [TcpListener](./tcplistener/)(int32_t) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
