---
title: "System::EnumValuesBase::Parse μέθοδος"
linktitle: "Parse"
second_title: "Aspose.Page για C++"
description: "System::EnumValuesBase::Parse μέθοδος. Επιστρέφει ένα αντικείμενο που αντιπροσωπεύει μια τιμή της σταθεράς απαρίθμησης του καθορισμένου τύπου απαρίθμησης με το καθορισμένο όνομα σε C++."
type: docs
weight: 400
url: /el/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Επιστρέφει ένα αντικείμενο που αντιπροσωπεύει μια τιμή της σταθεράς απαρίθμησης του καθορισμένου τύπου απαρίθμησης με το καθορισμένο όνομα.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| type | const TypeInfo\& | Το αντικείμενο [TypeInfo](../../typeinfo/) που αντιπροσωπεύει τον τύπο της τιμής της απαρίθμησης που θα επιστραφεί |
| str | const String\& | Το όνομα της σταθεράς enum |
| ignoreCase | bool | Καθορίζει αν η διάκριση πεζών-κεφαλαίων πρέπει να αγνοείται κατά την ερμηνεία του ονόματος της σταθεράς enum |

### ReturnValue

Ένα αντικείμενο που αντιπροσωπεύει την τιμή της σταθεράς enum της οποίας το όνομα έχει καθοριστεί στο **str**.

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
