---
title: "System::Web::Services::Protocols::HttpWebClientProtocol κλάση"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol κλάση. Αυτή η βασική κλάση χρησιμοποιείται σε όλα τα XML Web service client proxies που χρησιμοποιούν HTTP. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Αυτή η βασική κλάση χρησιμοποιείται σε όλα τα XML [Web](../../system.web/) service client proxies που χρησιμοποιούν HTTP. Αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Προσθέτει cookies από το καθορισμένο αίτημα στον εσωτερικό κάτοχο cookies. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν ο πελάτης ακολουθεί τις ανακατευθύνσεις του διακομιστή. |
| [get_ClientCertificates](./get_clientcertificates/)() | Επιστρέφει τη συλλογή των πιστοποιητικών του πελάτη. |
| [get_CookieContainer](./get_cookiecontainer/)() | Λαμβάνει έναν κάτοχο που χρησιμοποιείται για την αποθήκευση των cookies. |
| [get_EnableDecompression](./get_enabledecompression/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η αποσυμπίεση είναι ενεργοποιημένη. |
| [get_Proxy](./get_proxy/)() | Λαμβάνει πληροφορίες διαμεσολαβητή. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η κοινή χρήση σύνδεσης είναι ενεργοποιημένη όταν ο πελάτης χρησιμοποιεί έλεγχο ταυτότητας NTLM. |
| [get_UserAgent](./get_useragent/)() | Λαμβάνει μια τιμή της κεφαλίδας 'User-Agent'. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν ο πελάτης ακολουθεί τις ανακατευθύνσεις του διακομιστή. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Ορίζει έναν κάτοχο που χρησιμοποιείται για την αποθήκευση των cookies. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η αποσυμπίεση είναι ενεργοποιημένη. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Ορίζει πληροφορίες διαμεσολαβητή. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η κοινή χρήση σύνδεσης είναι ενεργοποιημένη όταν ο πελάτης χρησιμοποιεί έλεγχο ταυτότητας NTLM. |
| [set_UserAgent](./set_useragent/)(String) | Ορίζει μια τιμή της κεφαλίδας 'User-Agent'. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Δείτε επίσης

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
