---
title: "Μέθοδος System::DynamicCast_noexcept"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::DynamicCast_noexcept. Παλιά παρωχημένες μετατροπές. Θα αφαιρεθεί σε μελλοντικές εκδόσεις σε C++."
type: docs
weight: 17600
url: /el/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Παραδοχές παλαιά και παρωχημένες. Θα αφαιρεθούν σε μελλοντικές εκδόσεις.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου [Exception](../exception/). |
| TFrom | Τύπος πηγής [Exception](../exception/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const TFrom\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast είναι επιτρεπτό ή nullptr διαφορετικά.
## Παρατηρήσεις


Εκτελεί δυναμική μετατροπή σε αντικείμενα [Exception](../exception/). ## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το AsCast αντ' αυτού.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Εκτελεί δυναμική μετατροπή σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
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

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το AsCast αντ' αυτού.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Εκτελεί δυναμική μετατροπή αντικειμένων σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου [Exception](../exception/). |
| TFrom | Τύπος [Object](../object/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast είναι επιτρεπτό ή nullptr διαφορετικά.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το AsCast αντ' αυτού.

## Δείτε επίσης

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
