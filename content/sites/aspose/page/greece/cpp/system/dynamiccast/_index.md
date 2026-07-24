---
title: "Μέθοδος System::DynamicCast"
linktitle: "DynamicCast"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::DynamicCast. Εκτελεί δυναμική μετατροπή (dynamic cast) σε αντικείμενα Exception σε C++."
type: docs
weight: 16900
url: /el/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Εκτελεί δυναμική μετατροπή (dynamic cast) σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Εκτελεί δυναμική μετατροπή σε αντικείμενα [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


Αποσυσκευάζει την συσκευασμένη enum μέσω μετατροπής.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου enum. |
| TFrom | Τύπος δείκτη πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Δείκτης στο αντικείμενο από το οποίο θα αποσυσκευαστούν τα δεδομένα. |

### ReturnValue

Αποσυσκευασμένη τιμή enum.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Εκτελεί δυναμική μετατροπή αντικειμένων σε αντικείμενα [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


Εκτελεί dynamic cast σε null αντικείμενα.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


Εκτελεί dynamic cast σε αντικείμενα που δεν είναι δείκτες.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου. |
| TFrom | Τύπος πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | TFrom\& | Αντικείμενο πηγής. |

### ReturnValue

Αποτέλεσμα cast.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


Εκτελεί dynamic cast από IntPtr σε δείκτη.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parameter | Περιγραφή |
| --- | --- |
| TTo | Τύπος στόχου. |
| TFrom | Τύπος πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | TFrom | Τιμή IntPtr προέλευσης. |

### ReturnValue

Αποτέλεσμα cast.

## Deprecated
Απομένει για συμβατότητα με παλαιότερες εκδόσεις. Χρησιμοποιήστε το ExplicitCast αντί αυτού.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
