---
title: "System::ObjectExt::UnboxToNullable μέθοδος"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::UnboxToNullable μέθοδος. Αποσυσκευάζει το αντικείμενο σε τύπο nullable σε C++."
type: docs
weight: 1600
url: /el/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Αποσυσκευάζει αντικείμενο σε nullable τύπο.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος προορισμού. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) για αποσυσκευασία. |
| ασφαλές | bool | Αν είναι true, επιστρέφει nullptr σε περίπτωση αποτυχίας, διαφορετικά ρίχνει InvalidCastException. |

### ReturnValue

Αποσυσκευασμένη nullable τιμή (μπορεί να είναι null).

## Δείτε επίσης

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
