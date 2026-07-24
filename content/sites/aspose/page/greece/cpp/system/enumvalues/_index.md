---
title: "Κλάση System::EnumValues"
linktitle: "EnumValues"
second_title: "Aspose.Page για C++"
description: "Κλάση System::EnumValues. Παρέχει μεταπληροφορίες σχετικά με τις σταθερές της απαρίθμησης του τύπου enum E σε C++."
type: docs
weight: 2300
url: /el/cpp/system/enumvalues/
---
## EnumValues class


Παρέχει μεταπληροφορίες σχετικά με τις σταθερές της απαρίθμησης του τύπου enum **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parameter | Περιγραφή |
| --- | --- |
| E | Ο τύπος της απαρίθμησης |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [EnumValues](./enumvalues/)() | Δημιουργεί ένα στιγμιότυπο. |
| [GetNames](./getnames/)() const override | Επιστρέφει έναν πίνακα που περιέχει όλα τα ονόματα της απαρίθμησης **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Ανακτά έναν πίνακα με τα ονόματα των σταθερών σε μια καθορισμένη απαρίθμηση. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Επιστρέφει τον υποκείμενο τύπο της καθορισμένης απαρίθμησης. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Επιστρέφει τον υποκείμενο τύπο της καθορισμένης απαρίθμησης. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Επιστρέφει τη συσκευασμένη τιμή της σταθεράς enum με το καθορισμένο όνομα. |
| [GetValueOf](./getvalueof/)(long) const override | Επιστρέφει την αντικειμενοποιημένη τιμή της σταθεράς enum με την καθορισμένη τιμή. |
| [GetValues](./getvalues/)() const override | Επιστρέφει έναν πίνακα που περιέχει όλες τις τιμές της απαρίθμησης **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Επιστρέφει έναν πίνακα που περιέχει όλες τις τιμές του καθορισμένου τύπου απαρίθμησης. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Επιστρέφει ένα αντικείμενο που αντιπροσωπεύει μια τιμή της σταθεράς απαρίθμησης του καθορισμένου τύπου απαρίθμησης με το καθορισμένο όνομα. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Μετατρέπει την καθορισμένη τιμή 64-bit ακεραίου χωρίς πρόσημο σε μέλος απαρίθμησης. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Μετατρέπει το καθορισμένο αντικείμενο με ακέραια τιμή σε μέλος απαρίθμησης. |
| virtual [~EnumValues](./~enumvalues/)() | Καταστροφέας. |

## Δείτε επίσης

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
