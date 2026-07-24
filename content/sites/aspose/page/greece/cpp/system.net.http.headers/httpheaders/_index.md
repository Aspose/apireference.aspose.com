---
title: "System::Net::Http::Headers::HttpHeaders κλάση"
linktitle: "HttpHeaders"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::HttpHeaders κλάση. Η συλλογή των κεφαλίδων HTTP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 700
url: /el/cpp/system.net.http.headers/httpheaders/
---
## HttpHeaders class


Η συλλογή των κεφαλίδων HTTP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο με τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή με τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class HttpHeaders : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<System::Collections::Generic::IEnumerable<System::String>>>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Επικυρώνει ένα νέο ζεύγος ονομα-τιμές και το προσθέτει στην τρέχουσα συλλογή. |
| [Add](./add/)(String, String) | Επικυρώνει ένα νέο ζεύγος όνομα-τιμή και το προσθέτει στην τρέχουσα συλλογή. |
| virtual [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) | Συνενώνει την καθορισμένη παρουσία της κλάσης HttpHeaders με την τρέχουσα. |
| [AddParsedValue](./addparsedvalue/)(String, System::SharedPtr\<Object\>) | Αποκτά μια κεφαλίδα με το συγκεκριμένο όνομα και προσθέτει μια αναλυμένη τιμή στην κεφαλίδα. |
| [Clear](./clear/)() | Αφαιρεί όλα τα στοιχεία από τη συλλογή. |
| [Contains](./contains/)(String) |  |
| [ContainsParsedValue](./containsparsedvalue/)(String, System::SharedPtr\<Object\>) | Ελέγχει αν η κεφαλίδα περιέχει τη συγκεκριμένη τιμή. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον ενομετρητή. |
| [GetHeaderString](./getheaderstring/)(String) | Επιστρέφει μια αναπαράσταση κειμένου των τιμών με το συγκεκριμένο όνομα κεφαλίδας. |
| [GetHeaderString](./getheaderstring/)(String, System::SharedPtr\<Object\>) | Επιστρέφει μια αναπαράσταση κειμένου των τιμών με το συγκεκριμένο όνομα κεφαλίδας. |
| [GetHeaderStrings](./getheaderstrings/)() | Επιστρέφει μια συλλογή που περιέχει αναπαραστάσεις κειμένου των τιμών των κεφαλίδων. |
| [GetParsedValues](./getparsedvalues/)(String) | Επιστρέφει τις αναλυμένες τιμές με το συγκεκριμένο όνομα κεφαλίδας. |
| [GetValues](./getvalues/)(String) | Επιστρέφει τις αντίστοιχες τιμές με το συγκεκριμένο όνομα. |
| static [ParsedValuesAsList](./parsedvaluesaslist/)(const System::SharedPtr\<Object\>) | Μετατρέπει τις αναλυμένες τιμές σε λίστα. |
| [Remove](./remove/)(String) | Προσπαθεί να αφαιρέσει ένα στοιχείο με το συγκεκριμένο όνομα. |
| [RemoveParsedValue](./removeparsedvalue/)(String, System::SharedPtr\<Object\>) | Αποκτά μια κεφαλίδα με το συγκεκριμένο όνομα και αφαιρεί μια αναλυμένη τιμή από την κεφαλίδα. |
| [SetConfiguration](./setconfiguration/)(System::SharedPtr\<Collections::Generic::Dictionary\<String, System::SharedPtr\<HttpHeaderParser\>\>\>, System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) |  |
| [SetOrRemoveParsedValue](./setorremoveparsedvalue/)(String, System::SharedPtr\<Object\>) | Αποκτά μια κεφαλίδα με το συγκεκριμένο όνομα και ορίζει ή αφαιρεί την τιμή της. Η τιμή της κεφαλίδας θα αφαιρεθεί όταν η παράμετρος 'value' είναι nullptr, διαφορετικά θα οριστεί μια αναλυμένη τιμή. |
| [SetParsedValue](./setparsedvalue/)(String, System::SharedPtr\<Object\>) | Αποκτά μια κεφαλίδα με το συγκεκριμένο όνομα και ορίζει μια αναλυμένη τιμή στην κεφαλίδα. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, String) | Προσπαθεί να προσθέσει ένα νέο ζεύγος όνομα-τιμή στην τρέχουσα συλλογή. |
| [TryAddWithoutValidation](./tryaddwithoutvalidation/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>) | Προσθέτει μια συλλογή ζευγών όνομα-τιμή στην τρέχουσα συλλογή. |
| [TryGetValues](./trygetvalues/)(String, System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&) | Προσπαθεί να λάβει τις αντίστοιχες τιμές με το συγκεκριμένο όνομα. |
| [TryParseAndAddValue](./tryparseandaddvalue/)(String, String) | Προσπαθεί να αναλύσει τη συγκεκριμένη τιμή και να την προσθέσει στις τιμές της κεφαλίδας. |
## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
