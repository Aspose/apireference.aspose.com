---
title: "System::Net::HttpWebRequest class"
linktitle: "HttpWebRequest"
second_title: "Aspose.Page για C++"
description: "System::Net::HttpWebRequest class. Αντιπροσωπεύει το HTTP web request. Τα αντικείμενα αυτής της κλάσης θα πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2000
url: /el/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


Αντιπροσωπεύει το HTTP web request. Τα αντικείμενα αυτής της κλάσης θα πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε μια παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα assert. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Abort](./abort/)() override | Ακυρώνει το τρέχον αίτημα. |
| virtual [AddRange](./addrange/)(int32_t) | Προσθέτει την κεφαλίδα 'Range' στο τρέχον αίτημα. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | Προσθέτει την κεφαλίδα 'Range' στο τρέχον αίτημα. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά μια ασύγχρονη λειτουργία για λήψη ροής για την εγγραφή δεδομένων στον πόρο. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Ξεκινά ένα ασύγχρονο αίτημα για τον πόρο. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης ροής. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Περιμένει μέχρι να ολοκληρωθεί το καθορισμένο ασύγχρονο αίτημα για τον πόρο. |
| [get_Accept](./get_accept/)() | Λαμβάνει την τιμή της κεφαλίδας HTTP 'Accept'. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | Λαμβάνει μια τιμή που υποδεικνύει αν το αίτημα πρέπει να ακολουθεί ανακατευθύνσεις. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | Λαμβάνει μια τιμή που υποδεικνύει αν τα δεδομένα που λαμβάνονται από τον πόρο πρέπει να αποθηκευτούν στη μνήμη. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | Λαμβάνει μια τιμή που υποδεικνύει αν η αποθήκευση στη μνήμη είναι ενεργοποιημένη για αποστολή δεδομένων. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | Λαμβάνει τη συλλογή των πιστοποιητικών που σχετίζονται με το τρέχον αίτημα. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | Λαμβάνει το όνομα της ομάδας σύνδεσης. |
| [get_ContentLength](./get_contentlength/)() override | Λαμβάνει τον αριθμό των byte των δεδομένων του αιτήματος που θα σταλούν. |
| [get_ContentType](./get_contenttype/)() override | Λαμβάνει τον τύπο MIME του αιτήματος. |
| [get_ContinueTimeout](./get_continuetimeout/)() | Λαμβάνει ένα χρονικό όριο αναμονής μέχρι να ληφθεί ο κωδικός κατάστασης 100-Continue. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | Λαμβάνει ένα δοχείο cookie που σχετίζεται με το τρέχον web αίτημα. |
| [get_Credentials](./get_credentials/)() override | Λαμβάνει πληροφορίες ταυτοποίησης που σχετίζονται με το τρέχον αίτημα. |
| virtual [get_HaveResponse](./get_haveresponse/)() | Επιστρέφει μια τιμή που υποδεικνύει αν έχει ληφθεί απάντηση. |
| [get_Headers](./get_headers/)() override | Λαμβάνει τη συλλογή των κεφαλίδων HTTP. |
| virtual [get_KeepAlive](./get_keepalive/)() | Λαμβάνει μια τιμή που υποδεικνύει αν το τρέχον αίτημα πρέπει να περιέχει την κεφαλίδα 'Keep-Alive'. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | Λαμβάνει τον μέγιστο αριθμό επιτρεπόμενων ανακατευθύνσεων. |
| [get_Method](./get_method/)() override | Λαμβάνει τη μέθοδο HTTP. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | Λαμβάνει μια τιμή που υποδεικνύει αν το αίτημα πρέπει να είναι προ-αυθεντικοποιημένο. |
| [get_Proxy](./get_proxy/)() override | Λαμβάνει τον διακομιστή μεσολάβησης HTTP. |
| virtual [get_Referer](./get_referer/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Referer'. |
| [get_RequestUri](./get_requesturi/)() override | Επιστρέφει το URI του αιτήματος. |
| virtual [get_SendChunked](./get_sendchunked/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν τα δεδομένα πρέπει να αποστέλλονται σε τμήματα. |
| [get_ServicePoint](./get_servicepoint/)() | Επιστρέφει ένα σημείο υπηρεσίας που αντιπροσωπεύει τη δικτυακή σύνδεση προς τον πόρο. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | Επιστρέφει μια τιμή που υποδεικνύει εάν το τρέχον αίτημα μπορεί να χρησιμοποιήσει έναν κάτοχο cookie. |
| [get_Timeout](./get_timeout/)() override | Λαμβάνει μια διάρκεια χρόνου σε χιλιοστά του δευτερολέπτου μετά την οποία το αίτημα θα λήξει. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | Λαμβάνει μια τιμή που υποδεικνύει εάν η ιδιότητα 'Credential' είναι ίση με την ιδιότητα 'DefaultCredentials'. |
| virtual [get_UserAgent](./get_useragent/)() | Λαμβάνει μια τιμή της κεφαλίδας 'User-Agent'. |
| [GetRequestStream](./getrequeststream/)() override | Επιστρέφει τη ροή για την εγγραφή δεδομένων στον πόρο. |
| [GetResponse](./getresponse/)() override | Επιστρέφει την απάντηση web που σχετίζεται με το τρέχον web αίτημα. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | Δημιουργεί μια νέα παρουσία. |
| [set_Accept](./set_accept/)(String) | Ορίζει την τιμή της κεφαλίδας HTTP 'Accept'. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το αίτημα πρέπει να ακολουθεί ανακατευθύνσεις. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν τα δεδομένα που λαμβάνονται από τον πόρο πρέπει να αποθηκευτούν σε buffer. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η προσωρινή αποθήκευση είναι ενεργοποιημένη για την αποστολή δεδομένων. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | Ορίζει τη συλλογή των πιστοποιητικών που σχετίζονται με το τρέχον αίτημα. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | Ορίζει το όνομα της ομάδας σύνδεσης. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | Ορίζει τον αριθμό των byte των δεδομένων του αιτήματος που θα σταλούν. |
| [set_ContentType](./set_contenttype/)(String) override | Ορίζει τον τύπο MIME του αιτήματος. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | Ορίζει χρόνο λήξης για να περιμένει μέχρι να ληφθεί ο κωδικός κατάστασης 100-Continue. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Ορίζει έναν κάτοχο cookie που σχετίζεται με το τρέχον web αίτημα. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | Ορίζει πληροφορίες πιστοποίησης που σχετίζονται με το τρέχον αίτημα. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Ορίζει τη συλλογή των κεφαλίδων HTTP. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το τρέχον αίτημα πρέπει να περιέχει την κεφαλίδα 'Keep-Alive'. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | Ορίζει το μέγιστο αριθμό επιτρεπόμενων ανακατευθύνσεων. |
| [set_Method](./set_method/)(String) override | Ορίζει τη μέθοδο HTTP. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | Ορίζει μια τιμή που υποδεικνύει εάν το αίτημα πρέπει να προ-αυθεντικοποιηθεί. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | Πληροφορίες RTTI. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | Ορίζει τον διαμεσολαβητή HTTP. |
| virtual [set_Referer](./set_referer/)(System::String) | Ορίζει μια τιμή της κεφαλίδας 'Referer'. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν τα δεδομένα πρέπει να αποστέλλονται σε τμήματα. |
| [set_Timeout](./set_timeout/)(int) override | Ορίζει μια χρονική διάρκεια σε χιλιοστά του δευτερολέπτου μετά την οποία το αίτημα θα λήξει. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | Ορίζει μια τιμή που υποδεικνύει εάν η ιδιότητα 'Credential' είναι ίση με την ιδιότητα 'DefaultCredentials'. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | Ορίζει μια τιμή της κεφαλίδας 'User-Agent'. |
## Δείτε επίσης

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
