---
title: "System::StaticCast_noexcept μέθοδος"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page για C++"
description: "System::StaticCast_noexcept μέθοδος. Εκτελεί στατικό cast σε αντικείμενα Exception σε C++."
type: docs
weight: 39400
url: /el/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Εκτελεί στατικό cast σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το AsCast αντ' αυτού.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Εκτελεί στατικό cast σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Εκτελεί στατικό cast σε αντικείμενα σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Εκτελεί στατικό cast σε αντικείμενα [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast είναι επιτρεπτό ή nullptr διαφορετικά.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το AsCast αντ' αυτού.

## Δείτε επίσης

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
