---
title: "System::Net::Http::Headers::HttpHeaderValueCollection κλάση"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection κλάση. Αντιπροσωπεύει τη συλλογή των τιμών των κεφαλίδων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 800
url: /el/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Αντιπροσωπεύει τη συλλογή των τιμών των κεφαλίδων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| Το | τύπος των τιμών των κεφαλίδων που αντιπροσωπεύονται στη συλλογή. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const T\&) override | Προσθέτει στοιχείο στη συλλογή. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία από τη συλλογή. |
| [Contains](./contains/)(const T\&) const override | Ελέγχει αν το στοιχείο υπάρχει στη συλλογή. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Αντιγράφει όλα τα στοιχεία της συλλογής σε υπάρχοντα στοιχεία του πίνακα. |
| [get_Count](./get_count/)() const override | Πληροφορίες RTTI. |
| [get_IsReadOnly](./get_isreadonly/)() | Λαμβάνει μια τιμή που υποδεικνύει αν η τρέχουσα συλλογή είναι μόνο για ανάγνωση. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Λαμβάνει μια τιμή που υποδεικνύει αν η τρέχουσα συλλογή περιέχει μια "ειδική τιμή". |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον ενομετρητή. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Επιστρέφει μια αναπαράσταση συμβολοσειράς της τρέχουσας συλλογής χωρίς μια "ειδική τιμή". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Δημιουργεί μια νέα παρουσία. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Δημιουργεί μια νέα παρουσία. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Δημιουργεί μια νέα παρουσία. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Δημιουργεί μια νέα παρουσία. |
| [ParseAdd](./parseadd/)(String) | Αναλύει μια αναπαράσταση συμβολοσειράς κεφαλίδας και την προσθέτει στην τρέχουσα συλλογή. |
| [Remove](./remove/)(const T\&) override | Διαγράφει το στοιχείο από τη συλλογή. |
| [RemoveSpecialValue](./removespecialvalue/)() | Αφαιρεί μια "ειδική τιμή". |
| [SetSpecialValue](./setspecialvalue/)() | Ορίζει μια "ειδική τιμή". |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ορίστε το n'th όρισμα προτύπου ως αδύναμο δείκτη (αντί για κοινόχρηστο). Επιτρέπει την εναλλαγή δεικτών σε containers σε αδύναμη λειτουργία. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| [TryParseAdd](./tryparseadd/)(String) | Προσπαθεί να αναλύσει μια αναπαράσταση συμβολοσειράς κεφαλίδας και να την προσθέσει στην τρέχουσα συλλογή. |

## Δείτε επίσης

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
