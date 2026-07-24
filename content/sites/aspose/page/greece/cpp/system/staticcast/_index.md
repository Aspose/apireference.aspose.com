---
title: "Μέθοδος System::StaticCast"
linktitle: "StaticCast"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::StaticCast. Εκτελεί static cast σε αντικείμενα χωρίς δείκτη σε C++."
type: docs
weight: 38500
url: /el/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Εκτελεί static cast σε αντικείμενα χωρίς δείκτη.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου. |
| TFrom | Τύπος πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const TFrom\& | Αντικείμενο πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast επιτρέπεται.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


Εκτελεί στατικό cast σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου [Exception](../exception/). |
| TFrom | Τύπος πηγής [Exception](../exception/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const TFrom\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast επιτρέπεται.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


Ειδίκευση για αριθμητικούς τύπους.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Εκτελεί στατικό cast σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
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

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Εκτελεί στατικό cast σε αντικείμενα σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου [Exception](../exception/). |
| TFrom | Τύπος [Object](../object/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast επιτρέπεται.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


Εκτελεί static cast σε μηδενικά αντικείμενα.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |

### ReturnValue

nullptr.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


Ειδίκευση για αριθμητικούς τύπους.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


Επεξεργασία cast από [String](../string/) σε [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Εκτελεί στατικό cast σε αντικείμενα [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος δείκτη στόχου. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Δείκτης πηγής. |

### ReturnValue

Αποτέλεσμα cast εάν το cast επιτρέπεται.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
