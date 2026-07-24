---
title: "System::Net::Http::Headers::ViaHeaderValue κλάση"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::ViaHeaderValue κλάση. Αντιπροσωπεύει μια τιμή της κεφαλίδας ''Via''. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2600
url: /el/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Αντιπροσωπεύει μια τιμή της κεφαλίδας 'Via'. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Comment](./get_comment/)() | Επιστρέφει το σχόλιο από την τιμή της κεφαλίδας 'Via'. |
| [get_ProtocolName](./get_protocolname/)() | Πληροφορίες RTTI. |
| [get_ProtocolVersion](./get_protocolversion/)() | Επιστρέφει την έκδοση πρωτοκόλλου από την τιμή της κεφαλίδας 'Via'. |
| [get_ReceivedBy](./get_receivedby/)() | Επιστρέφει τον κεντρικό υπολογιστή και τη θύρα από τα οποία ελήφθη το αίτημα ή η απάντηση. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε ένα στιγμιότυπο της κλάσης [ViaHeaderValue](./). |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε ένα στιγμιότυπο της κλάσης [ViaHeaderValue](./). |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε ένα στιγμιότυπο της κλάσης [ViaHeaderValue](./). |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Δημιουργεί μια νέα παρουσία. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Δημιουργεί μια νέα παρουσία. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
