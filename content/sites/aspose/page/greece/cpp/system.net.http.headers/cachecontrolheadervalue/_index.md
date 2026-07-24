---
title: "System::Net::Http::Headers::CacheControlHeaderValue κλάση"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue κλάση. Αντιπροσωπεύει μια τιμή της κεφαλίδας ''Cache-Control''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


Αντιπροσωπεύει μια τιμή της κεφαλίδας 'Cache-Control'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Δημιουργεί μια νέα παρουσία. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Extensions](./get_extensions/)() | Επιστρέφει τη συλλογή των διακριτικών cache-extension. |
| [get_MaxAge](./get_maxage/)() | Λαμβάνει τη μέγιστη τιμή ηλικίας σε δευτερόλεπτα που καθορίζει το χρονικό διάστημα κατά το οποίο ο πελάτης θα αποδεχτεί μια απάντηση. |
| [get_MaxStale](./get_maxstale/)() | Λαμβάνει την τιμή που καθορίζει εάν ο πελάτης θα αποδεχτεί τις ληγμένες απαντήσεις. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | Λαμβάνει την τιμή σε δευτερόλεπτα που καθορίζει το χρονικό διάστημα κατά το οποίο ο πελάτης θα αποδεχτεί τις ληγμένες απαντήσεις. |
| [get_MinFresh](./get_minfresh/)() | Λαμβάνει την τιμή που καθορίζει τη διάρκεια φρεσκάδας. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Λαμβάνει την τιμή που καθορίζει εάν ο διακομιστής απαιτεί επαλήθευση μιας καταχώρησης cache όταν αυτή γίνει παλιά. |
| [get_NoCache](./get_nocache/)() | Πληροφορίες RTTI. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | Λαμβάνει τη συλλογή των ονομάτων πεδίων στην οδηγία 'no-cache' στην κεφαλίδα 'Cache-Control'. |
| [get_NoStore](./get_nostore/)() | Λαμβάνει την τιμή που καθορίζει εάν μια cache δεν πρέπει να αποθηκεύει κανένα μέρος ενός αιτήματος ή απάντησης HTTP. |
| [get_NoTransform](./get_notransform/)() | Λαμβάνει την τιμή που καθορίζει εάν μια cache ή διακομιστής μεσολάβησης δεν πρέπει να αλλάξει κανένα μέρος του σώματος της οντότητας. |
| [get_OnlyIfCached](./get_onlyifcached/)() | Λαμβάνει την τιμή που καθορίζει εάν ο πελάτης πρέπει να χρησιμοποιεί μόνο αποθηκευμένες καταχωρήσεις. |
| [get_Private](./get_private/)() | Λαμβάνει την τιμή που καθορίζει εάν το μήνυμα απόκρισης HTTP ή το μέρος του προορίζεται για έναν μόνο χρήστη και δεν πρέπει να αποθηκευτεί από κοινόχρηστη cache. |
| [get_PrivateHeaders](./get_privateheaders/)() | Λαμβάνει τη συλλογή των ονομάτων πεδίων στην οδηγία 'private' στην κεφαλίδα 'Cache-Control'. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Λαμβάνει την τιμή που καθορίζει εάν ο διακομιστής απαιτεί επαλήθευση μιας καταχώρησης cache όταν αυτή γίνει παλιά για τις κοινόχρηστες cache του πράκτορα χρήστη. |
| [get_Public](./get_public/)() | Λαμβάνει την τιμή που καθορίζει εάν μια απόκριση HTTP μπορεί να αποθηκευτεί από οποιαδήποτε cache. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Λαμβάνει την κοινόχρηστη μέγιστη τιμή ηλικίας σε δευτερόλεπτα που παρακάμπτει την οδηγία 'max-age' στην κεφαλίδα 'Cache-Control' ή την κεφαλίδα 'Expires' για μια κοινόχρηστη cache. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Μετατρέπει μια δοσμένη συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [CacheControlHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοσμένη συμβολοσειρά σε μια παρουσία της κλάσης [CacheControlHeaderValue](./). |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | Ορίζει τη μέγιστη τιμή ηλικίας σε δευτερόλεπτα που καθορίζει μια χρονική διάρκεια κατά την οποία ο πελάτης θα αποδεχτεί μια απόκριση. |
| [set_MaxStale](./set_maxstale/)(bool) | Ορίζει την τιμή που καθορίζει εάν ο πελάτης θα αποδεχτεί τις ληγμένες αποκρίσεις. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | Ορίζει την τιμή σε δευτερόλεπτα που καθορίζει το χρονικό διάστημα κατά το οποίο ο πελάτης θα αποδεχτεί τις ληγμένες αποκρίσεις. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Ορίζει την τιμή που καθορίζει τη διάρκεια φρεσκάδας. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Ορίζει την τιμή που καθορίζει εάν ο διακομιστής απαιτεί επαλήθευση μιας καταχώρησης cache όταν αυτή γίνει παλιά. |
| [set_NoCache](./set_nocache/)(bool) | Ορίζει την τιμή που καθορίζει εάν ο πελάτης θα αποδεχτεί μια αποθηκευμένη απόκριση. |
| [set_NoStore](./set_nostore/)(bool) | Ορίζει την τιμή που καθορίζει εάν μια cache δεν πρέπει να αποθηκεύει κανένα μέρος ενός αιτήματος ή απάντησης HTTP. |
| [set_NoTransform](./set_notransform/)(bool) | Ορίζει την τιμή που καθορίζει εάν μια cache ή διακομιστής μεσολάβησης δεν πρέπει να αλλάξει κανένα μέρος του σώματος της οντότητας. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | Ορίζει την τιμή που καθορίζει εάν ο πελάτης πρέπει να χρησιμοποιεί μόνο αποθηκευμένες καταχωρήσεις. |
| [set_Private](./set_private/)(bool) | Ορίζει την τιμή που καθορίζει εάν το μήνυμα απόκρισης HTTP ή το μέρος του προορίζεται για έναν μόνο χρήστη και δεν πρέπει να αποθηκευτεί από κοινόχρηστη cache. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Ορίζει την τιμή που καθορίζει εάν ο διακομιστής απαιτεί επαλήθευση μιας καταχώρησης cache όταν αυτή γίνει παλιά για τις κοινόχρηστες cache του πράκτορα χρήστη. |
| [set_Public](./set_public/)(bool) | Ορίζει την τιμή που καθορίζει εάν μια απόκριση HTTP μπορεί να αποθηκευτεί από οποιαδήποτε cache. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Ορίζει την κοινόχρηστη μέγιστη τιμή ηλικίας σε δευτερόλεπτα που παρακάμπτει την οδηγία 'max-age' στην κεφαλίδα 'Cache-Control' ή την κεφαλίδα 'Expires' για μια κοινόχρηστη προσωρινή μνήμη. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [CacheControlHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
