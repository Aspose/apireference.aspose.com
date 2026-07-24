---
title: "System::Net::HttpWebResponse κλάση"
linktitle: "HttpWebResponse"
second_title: "Aspose.Page για C++"
description: "System::Net::HttpWebResponse κλάση. Αντιπροσωπεύει την απάντηση web HTTP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε instance αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2100
url: /el/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Αντιπροσωπεύει την απάντηση web HTTP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε instance αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Κλείνει τη ροή της απάντησης. |
| [get_CharacterSet](./get_characterset/)() | Δεν έχει υλοποιηθεί. |
| [get_ContentLength](./get_contentlength/)() override | Πληροφορίες RTTI. |
| [get_ContentType](./get_contenttype/)() override | Επιστρέφει τον τύπο MIME του πόρου. |
| virtual [get_Cookies](./get_cookies/)() | Επιστρέφει cookies που σχετίζονται με την απάντηση web. |
| [get_Headers](./get_headers/)() override | Επιστρέφει τη συλλογή των κεφαλίδων που σχετίζονται με την τρέχουσα απάντηση. |
| virtual [get_Method](./get_method/)() | Επιστρέφει τη μέθοδο HTTP. |
| [get_ResponseUri](./get_responseuri/)() override | Επιστρέφει το URI του πόρου. |
| virtual [get_StatusCode](./get_statuscode/)() | Επιστρέφει τον κωδικό κατάστασης HTTP που σχετίζεται με την απόκριση web. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Επιστρέφει την αναπαράσταση σε συμβολοσειρά του κωδικού κατάστασης. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν η τρέχουσα απόκριση υποστηρίζει κεφαλίδες. |
| [GetResponseHeader](./getresponseheader/)(String) | Επιστρέφει την αντίστοιχη τιμή για το καθορισμένο όνομα κεφαλίδας. |
| [GetResponseStream](./getresponsestream/)() override | Επιστρέφει τη ροή απόκρισης. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
