---
title: "System::Net::Sockets::Socket class"
linktitle: "Socket"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket class. Η κλάση Socket υλοποιεί τη διεπαφή Berkeley sockets σε C++."
type: docs
weight: 400
url: /el/cpp/system.net.sockets/socket/
---
## Socket class


Η κλάση [Socket](./) υλοποιεί τη διεπαφή Berkeley sockets.

```cpp
class Socket : public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Accept](./accept/)() | Δημιουργεί μια νέα υποδοχή για τη νεοδημιουργημένη σύνδεση. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία σύνδεσης. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία εγγραφής. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία αποστολής. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Δέσμευει την υποδοχή με το καθορισμένο τοπικό σημείο άκρης. |
| [Close](./close/)() | Κλείνει τη σύνδεση της υποδοχής. |
| [Close](./close/)(int) | Κλείνει τη σύνδεση της υποδοχής με το καθορισμένο χρονικό όριο για να επιτραπεί η αποστολή των δεδομένων στην ουρά. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Καθιερώνει μια σύνδεση με το καθορισμένο απομακρυσμένο σημείο άκρης. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Καθιερώνει μια σύνδεση με το καθορισμένο απομακρυσμένο σημείο άκρης. |
| [Connect](./connect/)(String, int32_t) | Καθιερώνει μια σύνδεση με το καθορισμένο απομακρυσμένο σημείο άκρης. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Καθιερώνει μια σύνδεση με το καθορισμένο απομακρυσμένο σημείο άκρης. |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία σύνδεσης. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία αποστολής. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία αποστολής. |
| [get_AddressFamily](./get_addressfamily/)() | Επιστρέφει την οικογένεια διευθύνσεων. |
| [get_Available](./get_available/)() | Αποκτά τον αριθμό των byte που ελήφθησαν από το δίκτυο και είναι διαθέσιμα για ανάγνωση. |
| [get_Blocking](./get_blocking/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή βρίσκεται σε λειτουργία φραγής. |
| [get_Connected](./get_connected/)() | Επιστρέφει μια τιμή που υποδεικνύει αν η υποδοχή είναι συνδεδεμένη με τον απομακρυσμένο κεντρικό υπολογιστή. |
| [get_DontFragment](./get_dontfragment/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή επιτρέπει τη θραύση των πακέτων IP. |
| [get_DualMode](./get_dualmode/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή βρίσκεται σε διπλή λειτουργία. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή επιτρέπει τα πακέτα εκπομπής. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Αποκτά μια τιμή που υποδεικνύει αν μόνο μία διεργασία μπορεί να δεσμεύσει την υποδοχή σε μια θύρα. |
| [get_IsBound](./get_isbound/)() | Επιστρέφει μια τιμή που υποδεικνύει αν η υποδοχή είναι δεσμευμένη σε συγκεκριμένη τοπική θύρα. |
| [get_LingerState](./get_lingerstate/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή θα καθυστερήσει το κλείσιμο προσπαθώντας να στείλει όλα τα εκκρεμή δεδομένα. |
| [get_LocalEndPoint](./get_localendpoint/)() | Επιστρέφει το τοπικό σημείο άκρου. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή λαμβάνει εξερχόμενα πακέτα multicast. |
| [get_NoDelay](./get_nodelay/)() | Αποκτά μια τιμή που υποδεικνύει αν η υποδοχή χρησιμοποιεί τον αλγόριθμο Nagle. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Επιστρέφει μια τιμή που υποδεικνύει αν το λειτουργικό σύστημα και οι προσαρμογείς δικτύου υποστηρίζουν IPv4. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Επιστρέφει μια τιμή που υποδεικνύει αν το λειτουργικό σύστημα και οι προσαρμογείς δικτύου υποστηρίζουν IPv6. |
| [get_ProtocolType](./get_protocoltype/)() | Επιστρέφει τον τύπο πρωτοκόλλου. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Αποκτά το μέγεθος της προσωρινής μνήμης λήψης. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Αποκτά μια περίοδο μετά την οποία η κλήση 'Receive' λήγει. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Επιστρέφει το απομακρυσμένο σημείο άκρου. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Αποκτά το μέγεθος της προσωρινής μνήμης αποστολής. |
| [get_SendTimeout](./get_sendtimeout/)() | Αποκτά μια περίοδο μετά την οποία η κλήση 'Send' λήγει. |
| [get_SocketType](./get_sockettype/)() | Επιστρέφει τον τύπο της υποδοχής. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | Πληροφορίες RTTI. |
| [get_Ttl](./get_ttl/)() | Λαμβάνει την τιμή TTL. |
| [GetImpl](./getimpl/)() const | Επιστρέφει έναν δείκτη στην υλοποίηση. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Επιστρέφει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Λαμβάνει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Επιστρέφει την τιμή που αντιστοιχεί στο καθορισμένο όνομα επιλογής. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Ορίζει λειτουργίες χαμηλού επιπέδου για την υποδοχή. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Ορίζει λειτουργίες χαμηλού επιπέδου για την υποδοχή. |
| [Listen](./listen/)(int32_t) | Αλλάζει την κατάσταση της υποδοχής σε 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Επιστρέφει την κατάσταση της υποδοχής βάσει του καθορισμένου τρόπου ελέγχου. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στον καθορισμένο πίνακα byte. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στους καθορισμένους πίνακες byte. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στους καθορισμένους πίνακες byte. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Λαμβάνει δεδομένα από την υποδοχή και τα γράφει στους καθορισμένους πίνακες byte. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Λαμβάνει δεδομένα από το καθορισμένο σημείο άκρου και τα γράφει στον καθορισμένο πίνακα byte. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Στέλνει τα καθορισμένα δεδομένα στην υποδοχή. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Στέλνει τα καθορισμένα δεδομένα στο καθορισμένο σημείο άκρου. |
| [set_Blocking](./set_blocking/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή βρίσκεται σε λειτουργία φραγής. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Ορίζει το χρονικό όριο σύνδεσης. |
| [set_DontFragment](./set_dontfragment/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή επιτρέπει τη θραύση των πακέτων IP. |
| [set_DualMode](./set_dualmode/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή βρίσκεται σε διπλή λειτουργία. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή επιτρέπει πακέτα εκπομπής. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν μόνο μία διεργασία μπορεί να δεσμεύσει την υποδοχή σε μια θύρα. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή θα καθυστερήσει το κλείσιμο για να προσπαθήσει να στείλει όλα τα εκκρεμή δεδομένα. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή λαμβάνει εξερχόμενα πακέτα multicast. |
| [set_NoDelay](./set_nodelay/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν η υποδοχή χρησιμοποιεί τον αλγόριθμο Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Ορίζει το μέγεθος του buffer λήψης. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Ορίζει μια περίοδο μετά την οποία η κλήση 'Receive' θα λήξει. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Ορίζει το μέγεθος του buffer αποστολής. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Ορίζει μια περίοδο μετά την οποία η κλήση 'Send' θα λήξει. |
| [set_Ttl](./set_ttl/)(int16_t) | Ορίζει την τιμή TTL. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Ορίζει την καθορισμένη επιλογή υποδοχέα στην καθορισμένη τιμή. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Ορίζει την καθορισμένη επιλογή υποδοχέα στην καθορισμένη τιμή. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Ορίζει την καθορισμένη επιλογή υποδοχέα στην καθορισμένη τιμή. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Ορίζει την καθορισμένη επιλογή υποδοχέα στην καθορισμένη τιμή. |
| [Shutdown](./shutdown/)(SocketShutdown) | Απενεργοποιεί τις λειτουργίες αποστολής και λήψης του υποδοχέα. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Δημιουργεί μια νέα παρουσία. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Δημιουργεί μια νέα παρουσία. |
| virtual [~Socket](./~socket/)() | Καταστρέφει την τρέχουσα παρουσία. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [ImplPtr](./implptr/) | Η υλοποίηση του υποδοχέα. |
## Δείτε επίσης

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
