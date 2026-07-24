---
title: "طريقة System::ObjectExt::Unbox"
linktitle: "فك الصندوق"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::Unbox. تقوم بفك تغليف أنواع القيم بعد تحويلها إلى Object. تنفيذ لأنواع enum في C++."
type: docs
weight: 1400
url: /ar/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تغليف أنواع القيم بعد تحويلها إلى [Object](../../object/). تنفيذ لأنواع enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع [Enum](../../enum/). |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |

### ReturnValue

[Enum](../../enum/) value.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تغليف أنواع القيم بعد تحويلها إلى [Object](../../object/). تنفيذ للأنواع غير enum وغير nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |

### ReturnValue

قيمة مفكوكة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تغليف أنواع القيم بعد تحويلها إلى [Object](../../object/). تنفيذ للأنواع غير enum وغير nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |

### ReturnValue

قيمة مفكوكة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تعبئة قيم السلسلة.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## انظر أيضًا

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


يفك تعبئة أنواع التعداد إلى عدد صحيح.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عدد صحيح الوجهة. |
| E | نوع enum المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| e | E | القيمة لفك الصندوق. |

### ReturnValue

تمثيل عدد صحيح للتعداد.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


يحوّل أنواع التعداد.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع التعداد الهدف. |
| E | نوع enum المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| e | E | القيمة لفك الصندوق. |

### ReturnValue

قيمة التعداد المحوّلة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
