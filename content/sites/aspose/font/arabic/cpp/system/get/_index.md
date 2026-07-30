---
title: "System::Get method"
linktitle: "احصل على"
second_title: "Aspose.Font لـ C++"
description: "System::Get method. دالة للحصول على العنصر N‑th من الـ tuple المعطى. تحميل زائد للكائن الأساسي في C++."
type: docs
weight: 20800
url: /ar/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


دالة للحصول على العنصر N‑th من الـ tuple المعطى. تحميل زائد للكائن الأساسي.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| معامل | الوصف |
| --- | --- |
| N | فهرس العنصر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | const SharedPtr\<Object\>\& | كائن للفحص. |

### ReturnValue

قيمة العنصر N‑th من الـ tuple محوّلة إلى كائن.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


دالة للحصول على العنصر N‑th من الـ tuple المعطى. تحميل زائد للمؤشرات المشتركة.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| معامل | الوصف |
| --- | --- |
| N | فهرس العنصر. |
| T | نوع الكائن المفحوص. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | const SharedPtr\<T\>\& | كائن للفحص. |

### ReturnValue

قيمة العنصر N‑th من الـ tuple.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const T\&) method


دالة للحصول على العنصر N‑th من الـ tuple المعطى. تحميل زائد للكائنات التي تحتوي على طريقة Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| معامل | الوصف |
| --- | --- |
| N | فهرس العنصر. |
| T | نوع الكائن المفحوص. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | const T\& | كائن للفحص. |

### ReturnValue

قيمة العنصر N‑th من الـ tuple.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


يحصل على العنصر N‑th من tuple القيم.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| معامل | الوصف |
| --- | --- |
| N | فهرس العنصر. |
| المعاملات | عناصر الـ tuple. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple للحصول على عنصر منه. |

### ReturnValue

قيمة العنصر N‑th من الـ tuple.

## انظر أيضًا

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
