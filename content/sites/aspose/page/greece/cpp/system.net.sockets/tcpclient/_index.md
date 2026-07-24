---
title: "System::Net::Sockets::TcpClient class"
linktitle: "TcpClient"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::TcpClient class. Αντιπροσωπεύει έναν πελάτη για τις υπηρεσίες δικτύου TCP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


Αντιπροσωπεύει έναν πελάτη για τις υπηρεσίες δικτύου TCP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class TcpClient : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [Close](./close/)() | Κλείνει τη σύνδεση και απελευθερώνει το τρέχον στιγμιότυπο. |
| [Connect](./connect/)(String, int32_t) | Καθιερώνει μια σύνδεση με τον καθορισμένο απομακρυσμένο κεντρικό υπολογιστή. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Καθιερώνει μια σύνδεση με τον καθορισμένο απομακρυσμένο κεντρικό υπολογιστή. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Καθιερώνει μια σύνδεση με τον καθορισμένο απομακρυσμένο κεντρικό υπολογιστή. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Καθιερώνει μια σύνδεση με τον καθορισμένο απομακρυσμένο κεντρικό υπολογιστή. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία σύνδεσης. |
| [get_Available](./get_available/)() | Επιστρέφει τον αριθμό των byte που έχουν ληφθεί και είναι έτοιμα για ανάγνωση. |
| [get_Client](./get_client/)() | Πληροφορίες RTTI. |
| [get_Connected](./get_connected/)() | Επιστρέφει μια τιμή που υποδεικνύει αν η υποδοχή είναι συνδεδεμένη με τον απομακρυσμένο κεντρικό υπολογιστή. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν το τρέχον στιγμιότυπο επιτρέπει μόνο έναν πελάτη να χρησιμοποιήσει μια θύρα. |
| [get_LingerState](./get_lingerstate/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή θα καθυστερήσει το κλείσιμο προσπαθώντας να στείλει όλα τα εκκρεμή δεδομένα. |
| [get_NoDelay](./get_nodelay/)() | Λαμβάνει μια τιμή που υποδεικνύει αν το τρέχον στιγμιότυπο χρησιμοποιεί τον αλγόριθμο Nagle. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Λαμβάνει το μέγεθος της προσωρινής μνήμης που χρησιμοποιείται για τη λήψη δεδομένων. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Λαμβάνει μια τιμή που υποδεικνύει το χρονικό διάστημα μετά το οποίο η λήψη δεδομένων θα λήξει. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Λαμβάνει το μέγεθος της προσωρινής μνήμης που χρησιμοποιείται για την αποστολή δεδομένων. |
| [get_SendTimeout](./get_sendtimeout/)() | Λαμβάνει μια τιμή που υποδεικνύει το χρονικό διάστημα μετά το οποίο η αποστολή δεδομένων θα λήξει. |
| [GetStream](./getstream/)() | Επιστρέφει τη ροή που χρησιμοποιείται για την αποστολή και λήψη δεδομένων. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Ορίζει τον υποδοχέα. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το τρέχον στιγμιότυπο επιτρέπει μόνο έναν πελάτη να χρησιμοποιήσει μια θύρα. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή θα καθυστερήσει το κλείσιμο για να προσπαθήσει να στείλει όλα τα εκκρεμή δεδομένα. |
| [set_NoDelay](./set_nodelay/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν το τρέχον στιγμιότυπο χρησιμοποιεί τον αλγόριθμο Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Ορίζει το μέγεθος της προσωρινής μνήμης που χρησιμοποιείται για τη λήψη δεδομένων. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Ορίζει μια τιμή που υποδεικνύει το χρονικό διάστημα μετά το οποίο η λήψη δεδομένων θα λήξει. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Ορίζει το μέγεθος της προσωρινής μνήμης που χρησιμοποιείται για την αποστολή δεδομένων. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Ορίζει μια τιμή που υποδεικνύει το χρονικό διάστημα μετά το οποίο η αποστολή δεδομένων θα λήξει. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Δημιουργεί μια νέα παρουσία. |
| [TcpClient](./tcpclient/)() | Δημιουργεί μια νέα παρουσία. |
| [TcpClient](./tcpclient/)(AddressFamily) | Δημιουργεί μια νέα παρουσία. |
| [TcpClient](./tcpclient/)(String, int32_t) | Δημιουργεί μια νέα παρουσία. |
| virtual [~TcpClient](./~tcpclient/)() | Καταστρέφει την τρέχουσα παρουσία. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
