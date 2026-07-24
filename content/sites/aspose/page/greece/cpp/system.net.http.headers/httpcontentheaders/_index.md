---
title: "System::Net::Http::Headers::HttpContentHeaders κλάση"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::HttpContentHeaders κλάση. Αναπαριστά τη συλλογή των ''Content'' κεφαλίδων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Αναπαριστά τη συλλογή των 'Content' κεφαλίδων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ισχυρισμού. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Προσθέτει τις γνωστές κεφαλίδες στη καθορισμένη συλλογή. |
| [get_Allow](./get_allow/)() | Πληροφορίες RTTI. |
| [get_ContentDisposition](./get_contentdisposition/)() | Αποκτά μια τιμή της κεφαλίδας 'Content-Disposition'. |
| [get_ContentEncoding](./get_contentencoding/)() | Αποκτά μια τιμή της κεφαλίδας 'Content-Encoding'. |
| [get_ContentLanguage](./get_contentlanguage/)() | Αποκτά μια τιμή της κεφαλίδας 'Content-Language'. |
| [get_ContentLength](./get_contentlength/)() | Αποκτά μια τιμή της κεφαλίδας 'Content-Length'. |
| [get_ContentLocation](./get_contentlocation/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Content-Location'. |
| [get_ContentMD5](./get_contentmd5/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Content-MD5'. |
| [get_ContentRange](./get_contentrange/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Content-Range'. |
| [get_ContentType](./get_contenttype/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Content-Type'. |
| [get_Expires](./get_expires/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Expires'. |
| [get_LastModified](./get_lastmodified/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Last-Modified'. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Δημιουργεί μια νέα παρουσία. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Content-Disposition'. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Ορίζει μια τιμή της κεφαλίδας 'Content-Length'. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Ορίζει μια τιμή της κεφαλίδας 'Content-Location'. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Ορίζει μια τιμή της κεφαλίδας 'Content-MD5'. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Content-Range'. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Ορίζει μια τιμή της κεφαλίδας 'Content-Type'. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Ορίζει μια τιμή της κεφαλίδας 'Expires'. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Ορίζει μια τιμή της κεφαλίδας 'Last-Modified'. |
## Δείτε επίσης

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
