---
title: "System::Net::Http::Headers::ContentRangeHeaderValue κλάση"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue κλάση. Αντιπροσωπεύει μια τιμή της κεφαλίδας ''Content-Range''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Αντιπροσωπεύει μια τιμή της κεφαλίδας 'Content-Range'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Δημιουργεί μια νέα παρουσία. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Δημιουργεί μια νέα παρουσία. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Δημιουργεί μια νέα παρουσία. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_From](./get_from/)() | Λαμβάνει μια θέση στην οποία η αποστολή δεδομένων πρέπει να ξεκινήσει. |
| [get_HasLength](./get_haslength/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το μήκος έχει οριστεί για την τρέχουσα κεφαλίδα. |
| [get_HasRange](./get_hasrange/)() const | Λαμβάνει μια τιμή που υποδεικνύει εάν το εύρος έχει οριστεί για την τρέχουσα κεφαλίδα. |
| [get_Length](./get_length/)() | Λαμβάνει το μήκος του σώματος μιας οντότητας. |
| [get_To](./get_to/)() | Λαμβάνει μια θέση στην οποία η αποστολή δεδομένων πρέπει να σταματήσει. |
| [get_Unit](./get_unit/)() | Πληροφορίες RTTI. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από τη συγκεκριμένη θέση σε μια παρουσία της κλάσης [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | Ορίζει τις μονάδες που χρησιμοποιούνται στο εύρος. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [ContentRangeHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
