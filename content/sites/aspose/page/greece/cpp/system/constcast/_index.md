---
title: "System::ConstCast μέθοδος"
linktitle: "ConstCast"
second_title: "Aspose.Page για C++"
description: "System::ConstCast μέθοδος. Τέλος των παρωχημένων μετατροπών σε C++."
type: docs
weight: 16100
url: /el/cpp/system/constcast/
---
## System::ConstCast method


Τέλος των παρωχημένων μετατροπών.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast είναι επιτρεπτό ή nullptr διαφορετικά.
## Παρατηρήσεις


Εκτελεί const cast σε αντικείμενα [SmartPtr](../smartptr/).
## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
