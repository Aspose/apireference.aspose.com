---
title: "System::Net::Cache::HttpRequestCachePolicy κλάση"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page για C++"
description: "System::Net::Cache::HttpRequestCachePolicy κλάση. Πολιτική λανθάνουσας μνήμης HTTP που εκφράζει τη σημασιολογία της προσωρινής αποθήκευσης HTTP σύμφωνα με RFC2616. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Πολιτική λανθάνουσας μνήμης HTTP που εκφράζει τη σημασιολογία της προσωρινής αποθήκευσης HTTP σύμφωνα με RFC2616. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Λαμβάνει την ώρα που οι πόροι αποθηκευμένοι στη λανθάνουσα μνήμη πρέπει να επαληθευτούν. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Λαμβάνει την ώρα σε μορφή UTC όταν οι πόροι αποθηκευμένοι στη λανθάνουσα μνήμη πρέπει να επαληθευτούν. Μόνο για εσωτερική χρήση. |
| [get_Level](./get_level/)() const | Πληροφορίες RTTI. |
| [get_MaxAge](./get_maxage/)() const | Λαμβάνει τη μέγιστη ηλικία που επιτρέπεται για έναν πόρο. |
| [get_MaxStale](./get_maxstale/)() const | Λαμβάνει τη μέγιστη τιμή παλαιότητας που επιτρέπεται για έναν πόρο. |
| [get_MinFresh](./get_minfresh/)() const | Λαμβάνει τη ελάχιστη ηλικία που επιτρέπεται για έναν πόρο. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Δημιουργεί μια νέα παρουσία. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Δημιουργεί μια νέα παρουσία. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
