---
title: "System::Cast μέθοδος"
linktitle: "Cast"
second_title: "Aspose.Page για C++"
description: "System::Cast μέθοδος. Εκτελεί cast σε αντικείμενα SmartPtr σε C++."
type: docs
weight: 15300
url: /el/cpp/system/cast/
---
## System::Cast method


Εκτελεί cast σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast επιτρέπεται.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
