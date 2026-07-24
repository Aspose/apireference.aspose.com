---
title: "System::ObjectExt::CoalesceInternal μέθοδος"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::CoalesceInternal μέθοδος. Υλοποίηση της μετάφρασης του τελεστή ''??'' για μη μηδενικούς τύπους. Υπερφόρτωση για την περίπτωση όπου το RT2 είναι μετατρέψιμο σε RT1 σε C++."
type: docs
weight: 600
url: /el/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Υλοποίηση μετάφρασης του τελεστή '??' για μη‑null τύπους. Υπερφόρτωση για την περίπτωση που το RT2 μπορεί να μετατραπεί σε RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Περιγραφή |
| --- | --- |
| T0 | Τύπος τιμής LHS. |
| T1 | Τύπος της lambda που περιβάλλει την έκφραση RHS. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | RT1 | Τιμή LHS. |
| func | F | Έκφραση RHS. |

### ReturnValue

Εάν η τιμή LHS δεν είναι null, επιστρέφει το LHS, διαφορετικά υπολογίζει την έκφραση RHS και επιστρέφει το αποτέλεσμα.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
