---
title: "System::ObjectExt::UnknownToObject μέθοδος"
linktitle: "UnknownToObject"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::UnknownToObject μέθοδος. Μετατρέπει άγνωστο τύπο σε Object, χειριζόμενος τόσο τύπο έξυπνου δείκτη όσο και καταστάσεις τύπου τιμής σε C++."
type: docs
weight: 1800
url: /el/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Μετατρέπει άγνωστο τύπο σε [Object](../../object/), χειριζόμενος τόσο τύπο έξυπνου δείκτη όσο και καταστάσεις τύπου τιμής.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος για μετατροπή σε [Object](../../object/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) για μετατροπή. |

### ReturnValue

Έξυπνος δείκτης σε [Object](../../object/) που είναι είτε μετατρεπόμενος δείκτης είτε τιμή σε κουτί.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Μετατρέπει άγνωστο τύπο σε [Object](../../object/), χειριζόμενος τόσο τύπο έξυπνου δείκτη όσο και καταστάσεις τύπου τιμής.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος για μετατροπή σε [Object](../../object/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | T | [Object](../../object/) για μετατροπή. |

### ReturnValue

Έξυπνος δείκτης σε [Object](../../object/) που είναι είτε μετατρεπόμενος δείκτης είτε τιμή σε κουτί.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
