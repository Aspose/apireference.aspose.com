---
title: "طريقة System::ObjectExt::Unbox"
linktitle: "فك الصندوق"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectExt::Unbox. تقوم بفك تغليف الأنواع القيمية بعد تحويلها إلى Object. تنفيذ لأنواع enum في C++."
type: docs
weight: 1500
url: /ar/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تغليف الأنواع القيمية بعد تحويلها إلى [Object](../../object/). تنفيذ لأنواع enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع [Enum](../../enum/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |

### ReturnValue

[Enum](../../enum/) value.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تغليف الأنواع القيمية بعد تحويلها إلى [Object](../../object/). تنفيذ للأنواع غير enum وغير nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |

### ReturnValue

قيمة مفكوكة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تغليف الأنواع القيمية بعد تحويلها إلى [Object](../../object/). تنفيذ للأنواع غير enum وغير nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |

### ReturnValue

قيمة مفكوكة.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


يفك تعبئة قيم السلسلة.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| معامل | نوع | الوصف |
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
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


يفك تعبئة أنواع التعداد إلى عدد صحيح.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| معامل | الوصف |
| --- | --- |
| T | نوع عدد صحيح الوجهة. |
| E | نوع enum المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| e | E | قيمة للفك. |

### ReturnValue

تمثيل عدد صحيح للـ enum.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


يحوّل أنواع التعداد.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| معامل | الوصف |
| --- | --- |
| T | نوع التعداد الوجهة. |
| E | نوع enum المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| e | E | قيمة للفك. |

### ReturnValue

قيمة التعداد المحوَّلة.

## انظر أيضًا

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
