---
title: "Κλάση System::Net::Http::Headers::NameValueHeaderValue"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Net::Http::Headers::NameValueHeaderValue. Αντιπροσωπεύει ένα ζεύγος κλειδί/τιμή για χρήση στις κεφαλίδες. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1400
url: /el/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Αντιπροσωπεύει ένα ζεύγος κλειδί/τιμή για χρήση στις κεφαλίδες. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Εντοπίζει την παρουσία της κλάσης NameValueHeaderValue σε μια συλλογή με βάση το καθορισμένο όνομα. |
| [get_Name](./get_name/)() | Επιστρέφει το όνομα της τρέχουσας παρουσίας. |
| [get_Value](./get_value/)() | Λαμβάνει μια τιμή της τρέχουσας παρουσίας. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Επιστρέφει έναν κωδικό κατακερματισμού όλων των στοιχείων της συλλογής. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [NameValueHeaderValue](./). |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [NameValueHeaderValue](./). |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη στη συλλογή των παρουσιών της κλάσης NameValueHeaderValue-class και επιστρέφει το μήκος ενός αναλυμένου υποσυμβολοσειράς. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Επιστρέφει το μήκος μιας τιμής από το καθορισμένο δείκτη. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Δημιουργεί μια νέα παρουσία. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Δημιουργεί μια νέα παρουσία. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Δημιουργεί μια νέα παρουσία. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [NameValueHeaderValue](./). |
| [set_Value](./set_value/)(String) | Ορίζει μια τιμή της τρέχουσας παρουσίας. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | Επιστρέφει μια αναπαράσταση συμβολοσειράς της συλλογής των παρουσιών της κλάσης NameValueHeaderValue. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | Επιστρέφει μια αναπαράσταση συμβολοσειράς της συλλογής των παρουσιών της κλάσης NameValueHeaderValue. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [NameValueHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
