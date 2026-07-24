---
title: "κλάση System::Net::WebRequest"
linktitle: "WebRequest"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Net::WebRequest. Αντιπροσωπεύει ένα αίτημα ιστού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3800
url: /el/cpp/system.net/webrequest/
---
## WebRequest class


Αντιπροσωπεύει ένα αίτημα ιστού. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στο στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Abort](./abort/)() | Ακυρώνει το τρέχον αίτημα. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία για λήψη ροής για την εγγραφή δεδομένων στον πόρο. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά ένα ασύγχρονο αίτημα για τον πόρο. |
| static [Create](./create/)(String) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [WebRequest](./) χρησιμοποιώντας το καθορισμένο URI. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [WebRequest](./) χρησιμοποιώντας το καθορισμένο URI. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | Δημιουργεί ένα απόγονο [WebRequest](./) για το καθορισμένο σχήμα URI. |
| static [CreateHttp](./createhttp/)(String) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [WebRequest](./) χρησιμοποιώντας το καθορισμένο URI. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | Δημιουργεί ένα νέο στιγμιότυπο της κλάσης [WebRequest](./) χρησιμοποιώντας το καθορισμένο URI. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης ροής. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί το καθορισμένο ασύγχρονο αίτημα για τον πόρο. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | Λαμβάνει την πολιτική cache. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | Λαμβάνει το όνομα της ομάδας σύνδεσης. |
| virtual [get_ContentLength](./get_contentlength/)() | Λαμβάνει τον αριθμό των byte των δεδομένων του αιτήματος που θα σταλούν. |
| virtual [get_ContentType](./get_contenttype/)() | Λαμβάνει τον τύπο MIME του αιτήματος. |
| virtual [get_Credentials](./get_credentials/)() | Λαμβάνει πληροφορίες ταυτοποίησης που σχετίζονται με το τρέχον αίτημα. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | Λαμβάνει τον παγκόσμιο διακομιστή μεσολάβησης HTTP. |
| virtual [get_Headers](./get_headers/)() | Λαμβάνει τη συλλογή των κεφαλίδων HTTP. |
| virtual [get_Method](./get_method/)() | Λαμβάνει τη μέθοδο HTTP. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | Λαμβάνει μια τιμή που υποδεικνύει αν το αίτημα πρέπει να είναι προ-αυθεντικοποιημένο. |
| static [get_PrefixList](./get_prefixlist/)() | Λαμβάνει τη λίστα προθεμάτων. |
| virtual [get_Proxy](./get_proxy/)() | Λαμβάνει τον διακομιστή μεσολάβησης HTTP. |
| virtual [get_RequestUri](./get_requesturi/)() | Επιστρέφει το URI του αιτήματος. |
| virtual [get_Timeout](./get_timeout/)() | Λαμβάνει μια διάρκεια χρόνου σε χιλιοστά του δευτερολέπτου μετά την οποία το αίτημα θα λήξει. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η ιδιότητα 'Credential' είναι ίση με την ιδιότητα 'DefaultCredentials'. |
| virtual [GetRequestStream](./getrequeststream/)() | Επιστρέφει τη ροή για την εγγραφή δεδομένων στον πόρο. |
| virtual [GetResponse](./getresponse/)() | Επιστρέφει την απάντηση web που σχετίζεται με το τρέχον web αίτημα. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | Καταχωρεί το απόγονο [WebRequest](./) για το καθορισμένο URI. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | Ορίζει την πολιτική cache. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | Ορίζει το όνομα της ομάδας σύνδεσης. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | Ορίζει τον αριθμό των byte των δεδομένων του αιτήματος που θα σταλούν. |
| virtual [set_ContentType](./set_contenttype/)(String) | Ορίζει τον τύπο MIME του αιτήματος. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Ορίζει πληροφορίες πιστοποίησης που σχετίζονται με το τρέχον αίτημα. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | Ορίζει τον παγκόσμιο διακομιστή μεσολάβησης HTTP. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | Ορίζει τη συλλογή των κεφαλίδων HTTP. |
| virtual [set_Method](./set_method/)(String) | Ορίζει τη μέθοδο HTTP. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν το αίτημα πρέπει να προ-αυθεντικοποιηθεί. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | Ορίζει τη λίστα προθεμάτων. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Ορίζει τον διαμεσολαβητή HTTP. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | Ορίζει μια χρονική διάρκεια σε χιλιοστά του δευτερολέπτου μετά την οποία το αίτημα θα λήξει. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Ορίζει μια τιμή που υποδεικνύει εάν η ιδιότητα 'Credential' είναι ίση με την ιδιότητα 'DefaultCredentials'. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
