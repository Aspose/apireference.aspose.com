---
title: "System::Collections::IList κλάση"
linktitle: "IList"
second_title: "Aspose.Page για C++"
description: "System::Collections::IList κλάση. IList αντιπροσωπεύει μια μη-γενική συλλογή αντικειμένων που μπορούν να προσπελαστούν ατομικά με δείκτη σε C++."
type: docs
weight: 1000
url: /el/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | Προσθέτει στοιχείο στο τέλος της λίστας. |
| virtual [Clear](./clear/)() | Αφαιρεί όλα τα στοιχεία από τη λίστα. |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | Ελέγχει αν το στοιχείο βρίσκεται στη λίστα. |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | Λαμβάνει μια τιμή που υποδεικνύει αν η λίστα έχει σταθερό μέγεθος. |
| virtual [idx_get](./idx_get/)(int, int) const | Πληροφορίες RTTI. |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | Λαμβάνει τον πρώτο δείκτη του καθορισμένου στοιχείου. |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | Εισάγει το στοιχείο στη λίστα στον καθορισμένο δείκτη. |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | Αφαιρεί την πρώτη παρουσία του καθορισμένου στοιχείου από τη λίστα. |
| virtual [RemoveAt](./removeat/)(int) | Αφαιρεί το στοιχείο από τη λίστα στον καθορισμένο δείκτη. |
## Δείτε επίσης

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
