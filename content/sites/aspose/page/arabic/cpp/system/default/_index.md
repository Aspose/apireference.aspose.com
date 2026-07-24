---
title: "طريقة System::Default"
linktitle: "Default"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Default. تُرجِع المرجع إلى النسخة الوحيدة المُنشأة افتراضيًا من نوع الاستثناء في C++."
type: docs
weight: 16200
url: /ar/cpp/system/default/
---
## System::Default() method


يُرجِع المرجع إلى النسخة الوحيدة المُنشأة افتراضيًا من نوع الاستثناء.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | الوصف |
| --- | --- |
| T | النوع الذي تُرجَع مثيلته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


يُرجِع المرجع إلى النسخة الوحيدة المُنشأة افتراضيًا من النوع غير الاستثنائي.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | الوصف |
| --- | --- |
| T | النوع الذي تُرجَع مثيلته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
