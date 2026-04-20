---
title: "طريقة System::Nullable::operator="
linktitle: "operator="
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Nullable::operator=. تستبدل القيمة الممثلة حاليًا للكائن بالقيمة المحددة في C++."
type: docs
weight: 1800
url: /ar/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


يستبدل القيمة الممثلة حالياً للكائن بالقيمة المحددة.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| معامل | الوصف |
| --- | --- |
| ال | نوع القيمة الجديدة التي ستمثلها الكائن الحالي |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | القيمة الجديدة التي ستمثلها الكائن الحالي |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


يستبدل القيمة الممثلة حالياً للكائن بالقيمة المحددة.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| معامل | الوصف |
| --- | --- |
| ال | نوع القيمة الجديدة التي ستمثلها الكائن الحالي |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const T1\& | القيمة الجديدة التي ستمثلها الكائن الحالي |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


يعين قيمة null للكائن الحالي.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

كائن [Nullable](../) يمثل قيمة null.

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
