---
title: "System::ObjectExt::Box μέθοδος"
linktitle: "Box"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::Box μέθοδος. Καλύπτει τιμές συμβολοσειράς σε C++."
type: docs
weight: 200
url: /el/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Κάνει boxing τιμών συμβολοσειρών.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const String\& | Τιμή για να γίνει boxed. |

### ReturnValue

Τιμή σε κουτί ή null, εάν η συμβολοσειρά πηγής είναι null.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Καλύπτει τύπους τιμών για μετατροπή σε [Object](../../object/). Υλοποίηση για τύπους enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | τύπος [Enum](../../enum/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const T\& | Τιμή [Enum](../../enum/) για να γίνει boxed. |

### ReturnValue

Έξυπνος δείκτης σε αντικείμενο που διατηρεί την τιμή σε κουτί.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Καλύπτει τύπους τιμών για μετατροπή σε [Object](../../object/). Υλοποίηση για μη-enum τύπους.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const T\& | Τιμή για να γίνει boxed. |

### ReturnValue

Έξυπνος δείκτης σε αντικείμενο που διατηρεί την τιμή σε κουτί.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Καλύπτει τύπους [Nullable](../../nullable/) για μετατροπή σε [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος τιμής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const T\& | Τιμή για να γίνει boxed. |

### ReturnValue

Έξυπνος δείκτης σε αντικείμενο που διατηρεί την τιμή σε κουτί.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
