---
title: "System::ObjectType::GetType μέθοδος"
linktitle: "GetType"
second_title: "Aspose.Page για C++"
description: "System::ObjectType::GetType μέθοδος. Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για πρωτόγονους τύπους σε C++."
type: docs
weight: 100
url: /el/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για πρωτόγονους τύπους.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρωτόγονος τύπος. |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τον καθορισμένο τύπο.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για τύπους enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρωτόγονος τύπος. |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τον καθορισμένο τύπο.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για δομές και δείκτες.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρωτόγονος τύπος. |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τη δομή που καθορίζεται.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος [Nullable](../../nullable/). |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τη δομή που καθορίζεται.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για MutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος MutlicastDelegate. |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τη δομή που καθορίζεται.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για δομές και δείκτες.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρωτόγονος τύπος. |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τη δομή που καθορίζεται ή τον τύπο δείκτη εάν κληθεί για [SmartPtr](../../smartptr/).

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για uint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const String\&) method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για τύπο string.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρωτόγονος τύπος. |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τον τύπο [String](../../string/).

## Δείτε επίσης

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για έξυπνους δείκτες.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος αντικειμένου δείκτη. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) για λήψη του [TypeInfo](../../typeinfo/). |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει την τελική κλάση του περασμένου αντικειμένου.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για δομές.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος δομής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) για λήψη του [TypeInfo](../../typeinfo/). |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει την τελική κλάση του περασμένου αντικειμένου.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για εξαιρέσεις.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | [Exception](../../exception/) τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) για λήψη του [TypeInfo](../../typeinfo/). |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει την τελική κλάση του περασμένου αντικειμένου.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για πρωτόγονους τύπους.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Πρωτόγονος τύπος. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τον τύπο του περασμένου αντικειμένου.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


Υλοποιεί τη μετάφραση του typeof(). Υπερφόρτωση για τύπους [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος [Nullable](../../nullable/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Σταθερή αναφορά στο δομή [TypeInfo](../../typeinfo/) που περιγράφει τον τύπο του περασμένου αντικειμένου.

## Δείτε επίσης

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
