---
title: "طريقة System::Object::ReferenceEquals"
linktitle: "ReferenceEquals"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Object::ReferenceEquals. تخصيص خاص لـ Object::ReferenceEquals لحالة السلسلة و nullptr في C++."
type: docs
weight: 1200
url: /ar/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


تخصيص خاص لـ [Object::ReferenceEquals](./) لحالة السلسلة و nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | String const\& | [String](../../string/) للمقارنة بـ nullptr. |

### ReturnValue

true إذا كان السلسلة null، false خلاف ذلك.

## انظر أيضًا

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


تخصيص خاص لـ [Object::ReferenceEquals](./) لحالة السلاسل.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str1 | String const\& | السلسلة الأولى للمقارنة. |
| str2 | String const\& | السلسلة الثانية للمقارنة. |

### ReturnValue

صحيح إذا تطابقت السلاسل، خطأ خلاف ذلك.

## انظر أيضًا

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


يقارن الكائنات بالمرجع.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| objA | ptr const\& | المؤشر الأول للمقارنة. |
| objB | ptr const\& | المؤشر الثاني للمقارنة. |

### ReturnValue

صحيح إذا كانت المؤشرات متطابقة وخطأ غير ذلك.

## انظر أيضًا

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


يقارن المرجع كائن نوع القيمة مع nullptr.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن للمقارنة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| objA | T const\& | الكائن الأول للمقارنة. |

### ReturnValue

دائمًا يُعيد خطأ لأن الأنواع القيمية لا يمكن أن تكون فارغة.

## انظر أيضًا

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


يقارن الكائنات بالمرجع.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائنات للمقارنة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| objA | T const\& | الكائن الأول للمقارنة. |
| objB | T const\& | الكائن الثاني للمقارنة. |

### ReturnValue

صحيح إذا كانت عناوين الكائنات متطابقة وخطأ غير ذلك.

## انظر أيضًا

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
