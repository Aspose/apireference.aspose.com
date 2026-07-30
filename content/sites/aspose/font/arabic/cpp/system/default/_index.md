---
title: "طريقة System::Default"
linktitle: "الافتراضي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Default. تُرجع المرجع إلى النسخة الوحيدة المُنشأة افتراضيًا من نوع الاستثناء في C++."
type: docs
weight: 16300
url: /ar/cpp/system/default/
---
## System::Default() method


تُرجع المرجع إلى النسخة الوحيدة المُنشأة افتراضيًا من نوع الاستثناء.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| معامل | الوصف |
| --- | --- |
| T | النوع الذي تُرجع مثيلته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


تُرجع المرجع إلى النسخة الوحيدة المُنشأة افتراضيًا من النوع غير الاستثنائي.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| معامل | الوصف |
| --- | --- |
| T | النوع الذي تُرجع مثيلته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
