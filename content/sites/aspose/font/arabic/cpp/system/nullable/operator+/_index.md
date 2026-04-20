---
title: "طريقة System::Nullable::operator+"
linktitle: "operator+"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Nullable::operator+. تقوم بجمع القيم القابلة للإلغاء في C++."
type: docs
weight: 1200
url: /ar/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


يجمع القيم nullable.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع العامل الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const Nullable\<T1\>\& | القيمة المراد إضافتها. |

### ReturnValue

نتيجة الجمع.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(const T1\&) const method


يجمع القيم nullable والقيم غير nullable.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع العامل الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| أخرى | const T1\& | القيمة المراد إضافتها. |

### ReturnValue

نتيجة الجمع.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


يرجع مثيلاً مُنشأً افتراضياً لفئة Nullable<T>.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
