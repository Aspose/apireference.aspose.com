---
title: "System::ObjectExt::Coalesce μέθοδος"
linktitle: "Coalesce"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::Coalesce μέθοδος. Υλοποίηση της μετάφρασης του τελεστή ''??'' για τύπους nullable σε C++."
type: docs
weight: 500
url: /el/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Υλοποίηση μετάφρασης του τελεστή '??' για nullable τύπους.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | Περιγραφή |
| --- | --- |
| T0 | Τύπος τιμής LHS. |
| T1 | Τύπος της lambda που περιβάλλει την έκφραση RHS. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | System::Nullable\<T0\> | Τιμή LHS. |
| func | T1 | Έκφραση RHS. |

### ReturnValue

Εάν η τιμή LHS δεν είναι null, επιστρέφει το LHS, διαφορετικά υπολογίζει την έκφραση RHS και επιστρέφει το αποτέλεσμα.

## Δείτε επίσης

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Υλοποίηση μετάφρασης του τελεστή '??' για μη‑null τύπους.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | Περιγραφή |
| --- | --- |
| T0 | Τύπος τιμής LHS. |
| T1 | Τύπος της lambda που περιβάλλει την έκφραση RHS. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | T0 | Τιμή LHS. |
| func | T1 | Έκφραση RHS. |

### ReturnValue

Εάν η τιμή LHS δεν είναι null, επιστρέφει το LHS, διαφορετικά υπολογίζει την έκφραση RHS και επιστρέφει το αποτέλεσμα.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
