---
title: "System::Net::Http::Headers::MediaTypeHeaderValue κλάση"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue κλάση. Αντιπροσωπεύει έναν τύπο MIME σε μια τιμή της κεφαλίδας ''Content-Type''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1200
url: /el/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Αντιπροσωπεύει έναν τύπο MIME σε μια τιμή της κεφαλίδας 'Content-Type'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_CharSet](./get_charset/)() | Πληροφορίες RTTI. |
| [get_MediaType](./get_mediatype/)() | Λαμβάνει μια τιμή της κεφαλίδας τύπου μέσου. |
| [get_Parameters](./get_parameters/)() | Επιστρέφει τις παραμέτρους τιμής της κεφαλίδας τύπου μέσου. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [MediaTypeHeaderValue](./). |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Δημιουργεί μια νέα παρουσία. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Δημιουργεί μια νέα παρουσία. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [MediaTypeHeaderValue](./). |
| [set_CharSet](./set_charset/)(String) | Ορίζει ένα σύνολο χαρακτήρων. |
| [set_MediaType](./set_mediatype/)(String) | Ορίζει μια τιμή της κεφαλίδας τύπου μέσου. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [MediaTypeHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
