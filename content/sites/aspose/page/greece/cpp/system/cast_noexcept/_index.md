---
title: "Μέθοδος System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Cast_noexcept. Εκτελεί μετατροπή σε αντικείμενα SmartPtr σε C++."
type: docs
weight: 15400
url: /el/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Εκτελεί cast σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast είναι επιτρεπτό ή nullptr διαφορετικά.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
