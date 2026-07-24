---
title: "Aspose::Page::EPS::XMP::XmpMetadata κλάση"
linktitle: "XmpMetadata"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata κλάση. Παρέχει πρόσβαση στη ροή XMP μεταδεδομένων σε C++."
type: docs
weight: 200
url: /el/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Παρέχει πρόσβαση στη ροή μεταδεδομένων [XMP](../).

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Προσθέτει τιμή στα μεταδεδομένα. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Προσθέτει τιμή στα μεταδεδομένα. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Προσθέτει ζεύγος με κλειδί και τιμή στο λεξικό. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Προσθέτει τιμή σε έναν πίνακα. Η τιμή θα προστεθεί στο τέλος του πίνακα. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Προσθέτει τιμή σε έναν πίνακα με καθορισμένο δείκτη. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Προσθέτει ονομαστική τιμή σε μια δομή. |
| [Clear](./clear/)() override | Καθαρίζει τα μεταδεδομένα. |
| [Contains](./contains/)(const System::String\&) const | Ελέγχει αν το κλειδί βρίσκεται στα μεταδεδομένα. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Ελέγχει αν το καθορισμένο ζεύγος κλειδί-τιμή βρίσκεται στο λεξικό. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Καθορίζει αν αυτό το λεξικό περιέχει το καθορισμένο κλειδί. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Αντιγράφει τα στοιχεία της συλλογής σε έναν πίνακα. |
| [get_Count](./get_count/)() const override | Λαμβάνει τον αριθμό των στοιχείων στη συλλογή. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Ελέγχει αν η συλλογή έχει σταθερό μέγεθος. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Ελέγχει αν η συλλογή είναι μόνο για ανάγνωση. |
| [get_IsSynchronized](./get_issynchronized/)() | Ελέγχει αν η συλλογή είναι συγχρονισμένη. |
| [get_Keys](./get_keys/)() const override | Λαμβάνει τη συλλογή των κλειδιών μεταδεδομένων. |
| [get_NamespaceManager](./get_namespacemanager/)() | Λαμβάνει τον διαχειριστή χώρου ονομάτων. |
| [get_SyncRoot](./get_syncroot/)() const | Λαμβάνει το αντικείμενο συγχρονισμού της συλλογής. |
| [get_Values](./get_values/)() const override | Λαμβάνει τις τιμές στα μεταδεδομένα. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει τον απαριθμητή του λεξικού. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Επιστρέφει το URI του χώρου ονομάτων με βάση το πρόθεμα. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Επιστρέφει το πρόθεμα με βάση το URI του χώρου ονομάτων. |
| [idx_get](./idx_get/)(const System::String\&) const override | Αποκτά δεδομένα από τα μεταδεδομένα. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Ορίζει δεδομένα από τα μεταδεδομένα. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Καταχωρεί το URI του χώρου ονομάτων. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Καταχωρεί το URI του χώρου ονομάτων. |
| [Remove](./remove/)(const System::String\&) override | Αφαιρεί την καταχώρηση από τα μεταδεδομένα. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Αφαιρεί το ζεύγος κλειδί/τιμή από τη συλλογή. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Ορίζει τιμή σε έναν πίνακα. Η προηγούμενη τιμή θα αντικατασταθεί με τη νέα. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Ορίζει ονομασμένη τιμή σε μια δομή. Η προηγούμενη ονομασμένη τιμή, αν υπάρχει ήδη, θα αντικατασταθεί με τη νέα. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Προσπαθεί να βρει το κλειδί στο λεξικό και να ανακτήσει την τιμή αν βρεθεί. |
## Δείτε επίσης

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
