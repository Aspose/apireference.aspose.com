---
title: "System::Collections::Specialized::NameValueCollection κλάση"
linktitle: "NameValueCollection"
second_title: "Aspose.Page για C++"
description: "System::Collections::Specialized::NameValueCollection κλάση. Συλλογή συσχετισμένων κλειδιών String και τιμών String που μπορούν να προσπελαστούν είτε με το κλειδί είτε με το ευρετήριο σε C++."
type: docs
weight: 200
url: /el/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Συλλογή συσχετισμένων κλειδιών [String](../../system/string/) και τιμών [String](../../system/string/) που μπορούν να προσπελαστούν είτε με το κλειδί είτε με το ευρετήριο.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const String\&) override | Αντικατάσταση μεθόδου [ICollection](../../system.collections/icollection/) - δεν έχει υλοποιηθεί. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Αντιγράφει τις καταχωρήσεις στη καθορισμένη [NameValueCollection](./) στην τρέχουσα. |
| virtual [Add](./add/)(const String\&, const String\&) | Προσθέτει μια καταχώρηση με το καθορισμένο όνομα και τιμή. |
| [Clear](./clear/)() override | Διαγράφει όλα τα στοιχεία. |
| [Contains](./contains/)(const String\&) const override | Ελέγχει αν το στοιχείο υπάρχει στη συλλογή. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Αντιγράφει τα στοιχεία της συλλογής σε υπάρχοντα στοιχεία πίνακα. |
| virtual [Get](./get/)(const String\&) | Αποκτά τις τιμές που συσχετίζονται με το καθορισμένο κλειδί. |
| virtual [get_AllKeys](./get_allkeys/)() | Λαμβάνει όλα τα κλειδιά. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των ζευγών κλειδί/τιμή. |
| virtual [get_Keys](./get_keys/)() | Λαμβάνει όλα τα κλειδιά. |
| [GetEnumerator](./getenumerator/)() override | Λαμβάνει τον απαριθμητή για επανάληψη μέσω της συλλογής. |
| virtual [GetValues](./getvalues/)(const String\&) | Αποκτά τις τιμές που συσχετίζονται με το καθορισμένο κλειδί. |
| [HasKeys](./haskeys/)() | Λαμβάνει μια τιμή που υποδεικνύει αν το [NameValueCollection](./) περιέχει κλειδιά που δεν είναι null. |
| [idx_get](./idx_get/)(const String\&) | Λαμβάνει την τιμή στο καθορισμένο δείκτη. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Ορίζει την τιμή μιας καταχώρησης. |
| [NameValueCollection](./namevaluecollection/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [NameValueCollection](./) που είναι κενή. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Αντιγράφει τις καταχωρήσεις από το καθορισμένο [NameValueCollection](./) σε ένα νέο [NameValueCollection](./). |
| [Remove](./remove/)(const String\&) override | Αφαιρεί συγκεκριμένο στοιχείο. |
| virtual [Set](./set/)(const String\&, const String\&) | Ορίζει την τιμή μιας καταχώρησης. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Δείτε επίσης

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
