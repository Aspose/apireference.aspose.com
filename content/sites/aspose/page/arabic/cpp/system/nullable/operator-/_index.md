---
title: "System::Nullable::operator- طريقة"
linktitle: "operator-"
second_title: "Aspose.Page لـ C++"
description: "System::Nullable::operator- طريقة. يطرح القيم القابلة للانعدام في C++."
type: docs
weight: 1400
url: /ar/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


يطرح القيم القابلة للإنكار.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع العامل الأيمن. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const Nullable\<T1\>\& | القيمة المراد طرحها. |

### ReturnValue

نتيجة الطرح.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


يطرح القيم القابلة للإنكار والقيم غير القابلة للإنكار.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع العامل الأيمن. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| آخر | const T1\& | القيمة المراد طرحها. |

### ReturnValue

نتيجة الطرح.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


يطرح القيم القابلة للإنكار والقيم التي تشير إلى null.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع المعامل الأيمن، يجب أن يكون nullptr_t. |

### ReturnValue

كائن [Nullable](../) فارغ.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
