---
title: "System::Net::ServicePoint κλάση"
linktitle: "ServicePoint"
second_title: "Aspose.Page για C++"
description: "System::Net::ServicePoint κλάση. Παρέχει διαχείριση HTTP συνδέσεων. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3100
url: /el/cpp/system.net/servicepoint/
---
## ServicePoint class


Παρέχει διαχείριση HTTP συνδέσεων. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ServicePoint : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Κλείνει και αφαιρεί συνδέσεις που ανήκουν στην καθορισμένη ομάδα συνδέσεων. |
| [get_Address](./get_address/)() | Επιστρέφει το URI του διακομιστή στο οποίο συνδέεται η τρέχουσα παρουσία. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | Πληροφορίες RTTI. |
| [get_Certificate](./get_certificate/)() | Επιστρέφει ένα πιστοποιητικό που χρησιμοποιείται από την τρέχουσα παρουσία. |
| [get_ClientCertificate](./get_clientcertificate/)() | Επιστρέφει το τελευταίο πιστοποιητικό πελάτη. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Λαμβάνει ένα χρονικό όριο σε χιλιοστά του δευτερολέπτου μετά το οποίο το ενεργό [ServicePoint](./) θα κλείσει. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Λαμβάνει τον μέγιστο αριθμό συνδέσεων που επιτρέπονται από την τρέχουσα παρουσία. |
| [get_ConnectionName](./get_connectionname/)() | Επιστρέφει το όνομα της σύνδεσης. |
| [get_CurrentConnections](./get_currentconnections/)() | Επιστρέφει έναν αριθμό ανοιχτών συνδέσεων. |
| [get_Expect100Continue](./get_expect100continue/)() | Λαμβάνει μια τιμή που υποδεικνύει αν χρησιμοποιείται η συμπεριφορά 100-Continue. |
| [get_IdleSince](./get_idlesince/)() | Επιστρέφει την ημερομηνία και ώρα της τελευταίας σύνδεσης σε έναν κεντρικό υπολογιστή. |
| [get_MaxIdleTime](./get_maxidletime/)() | Λαμβάνει μια διάρκεια σε χιλιοστά του δευτερολέπτου μετά την οποία μια αδρανής σύνδεση θα κλείσει. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Επιστρέφει την έκδοση HTTP. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Λαμβάνει το μέγεθος του buffer λήψης. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Επιστρέφει μια τιμή που υποδεικνύει αν η τρέχουσα παρουσία υποστηρίζει τις συνδέσεις pipeline. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Λαμβάνει μια τιμή που υποδεικνύει αν ο αλγόριθμος Nagle χρησιμοποιείται από τις συνδέσεις που διαχειρίζονται από την τρέχουσα παρουσία. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Ορίζει τον delegate που χρησιμοποιείται για τη συσχέτιση του τοπικού [IPEndPoint](../ipendpoint/) με την τρέχουσα παρουσία. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Ορίζει ένα χρονικό όριο σε χιλιοστά του δευτερολέπτου μετά το οποίο το ενεργό [ServicePoint](./) θα κλείσει. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Ορίζει τον μέγιστο αριθμό συνδέσεων που επιτρέπονται από την τρέχουσα παρουσία. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν χρησιμοποιείται η συμπεριφορά 100-Continue. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Ορίζει μια διάρκεια σε χιλιοστά του δευτερολέπτου μετά την οποία μια αδρανής σύνδεση θα κλείσει. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Ορίζει το μέγεθος του buffer λήψης. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Ορίζει μια τιμή που υποδεικνύει αν ο αλγόριθμος Nagle χρησιμοποιείται από τις συνδέσεις που διαχειρίζονται από την τρέχουσα παρουσία. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Ορίζει την τιμή που υποδεικνύει αν η επιλογή 'Keep-Alive' είναι ενεργοποιημένη. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
