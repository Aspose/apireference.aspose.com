---
title: "System::ObjectExt::ObjectToUnknown μέθοδος"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::ObjectToUnknown μέθοδος. Μετατρέπει το Object σε άγνωστο τύπο, χειρίζεται τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις bpxed τιμής σε C++."
type: docs
weight: 1200
url: /el/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Μετατρέπει το [Object](../../object/) σε άγνωστο τύπο, χειρίζεται τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις bpxed τιμής.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στον οποίο θα μετατραπεί το [Object](../../object/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) για μετατροπή. |

### ReturnValue

Είτε αποσυσκευασμένη τιμή είτε μετατρεπόμενος δείκτης.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Μετατρέπει το [Object](../../object/) σε άγνωστο τύπο, χειρίζεται τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις boxed τιμής.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στον οποίο θα μετατραπεί το [Object](../../object/). |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) για μετατροπή. |

### ReturnValue

Είτε αποσυσκευασμένη τιμή είτε μετατρεπόμενος δείκτης.

## Δείτε επίσης

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
