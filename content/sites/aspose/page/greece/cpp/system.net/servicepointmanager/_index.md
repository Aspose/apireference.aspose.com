---
title: "System::Net::ServicePointManager κλάση"
linktitle: "ServicePointManager"
second_title: "Aspose.Page για C++"
description: "System::Net::ServicePointManager κλάση. Διαχειρίζεται τα στάδια του κύκλου ζωής (δημιουργία, συντήρηση και διαγραφή) των στιγμιοτύπων της κλάσης ServicePoint. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3200
url: /el/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Διαχειρίζεται τα στάδια του κύκλου ζωής (δημιουργία, συντήρηση και διαγραφή) των στιγμιοτύπων της κλάσης [ServicePoint](../servicepoint/). Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ServicePointManager : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Λαμβάνει μια πολιτική πιστοποιητικού. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν το πιστοποιητικό πρέπει να ελεγχθεί έναντι της λίστας ανάκλησης της αρχής πιστοποίησης. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Λαμβάνει το μέγιστο αριθμό ταυτόχρονων συνδέσεων που επιτρέπονται από τις στιγμιότυπες κλάσης ServicePoint. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Λαμβάνει ένα χρονικό όριο σε χιλιοστά του δευτερολέπτου κατά το οποίο μια ανάλυση DNS θεωρείται έγκυρη. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν μια ανάλυση DNS περιστρέφεται μεταξύ των εφαρμόσιμων διευθύνσεων IP. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Επιστρέφει την πολιτική κρυπτογράφησης που χρησιμοποιείται από το τρέχον στιγμιότυπο. |
| static [get_Expect100Continue](./get_expect100continue/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν οι στιγμιότυπες κλάσης ServicePoint χρησιμοποιούν τη συμπεριφορά 100-Continue. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Λαμβάνει το μέγιστο χρόνο αδράνειας των στιγμιοτύπων κλάσης ServicePoint. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Λαμβάνει το μέγιστο αριθμό των στιγμιοτύπων κλάσης ServicePoint που μπορούν να διαχειριστούν από το τρέχον στιγμιότυπο. |
| static [get_ReusePort](./get_reuseport/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν οι υποδοχές εξόδου των συνδέσεων χρησιμοποιούν την επιλογή 'SO_REUSE_UNICASTPORT'. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Λαμβάνει τον τύπο πρωτοκόλλου ασφαλείας που χρησιμοποιείται από τις στιγμιότυπες κλάσης ServicePoint που διαχειρίζονται από το τρέχον στιγμιότυπο. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Λαμβάνει την κλήση επιστροφής (callback) που χρησιμοποιείται για την επικύρωση ενός πιστοποιητικού διακομιστή. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν οι στιγμιότυπες κλάσης ServicePoint χρησιμοποιούν τον αλγόριθμο Nagle. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Ορίζει μια πολιτική πιστοποιητικού. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το πιστοποιητικό πρέπει να ελεγχθεί έναντι της λίστας ανάκλησης της αρχής πιστοποίησης. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Ορίζει το μέγιστο αριθμό ταυτόχρονων συνδέσεων που επιτρέπονται από τις στιγμιότυπες κλάσης ServicePoint. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Ορίζει ένα χρονικό όριο σε χιλιοστά του δευτερολέπτου κατά το οποίο μια ανάλυση DNS θεωρείται έγκυρη. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν μια ανάλυση DNS περιστρέφεται μεταξύ των εφαρμόσιμων διευθύνσεων IP. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν οι στιγμές της κλάσης ServicePoint-class χρησιμοποιούν τη συμπεριφορά 100-Continue. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Ορίζει το μέγιστο χρόνο αδράνειας των στιγμών της κλάσης ServicePoint-class. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Ορίζει τον μέγιστο αριθμό των στιγμών της κλάσης ServicePoint-class που μπορούν να διαχειριστούν από την τρέχουσα στιγμή. |
| static [set_ReusePort](./set_reuseport/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν οι υποδοχές εξόδου των συνδέσεων χρησιμοποιούν την επιλογή 'SO_REUSE_UNICASTPORT'. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Ορίζει τον τύπο του πρωτοκόλλου ασφαλείας που χρησιμοποιείται από τις στιγμές της κλάσης ServicePoint-class που διαχειρίζονται από την τρέχουσα στιγμή. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Ορίζει την κλήση επιστροφής (callback) που χρησιμοποιείται για την επικύρωση ενός πιστοποιητικού διακομιστή. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν οι στιγμές της κλάσης ServicePoint-class χρησιμοποιούν τον αλγόριθμο Nagle. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Ορίζει την τιμή που υποδεικνύει αν η επιλογή 'Keep-Alive' είναι ενεργοποιημένη. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | Πληροφορίες RTTI. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Ο προεπιλεγμένος αριθμός μόνιμων συνδέσεων. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
