---
title: "System::Net::Http::Headers::EntityTagHeaderValue κλάση"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue κλάση. Αντιπροσωπεύει μια τιμή της κεφαλίδας ''Entity-Tag''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Αντιπροσωπεύει μια τιμή της κεφαλίδας 'Entity-Tag'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στο stack ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Δημιουργεί μια νέα παρουσία. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Δημιουργεί μια νέα παρουσία. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| static [get_Any](./get_any/)() | Λαμβάνει μια τιμή της κεφαλίδας 'ETag'. |
| [get_IsWeak](./get_isweak/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η τρέχουσα παρουσία είναι αδύναμος επικυρωτής. |
| [get_Tag](./get_tag/)() | Πληροφορίες RTTI. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από το συγκεκριμένο δείκτη σε μια παρουσία της κλάσης [EntityTagHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [EntityTagHeaderValue](./). |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [EntityTagHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
