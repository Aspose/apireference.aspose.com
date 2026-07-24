---
title: "System::Get طريقة"
linktitle: "احصل"
second_title: "Aspose.Page لـ C++"
description: "System::Get طريقة. دالة للحصول على العنصر N من الـ tuple المعطى. تحميل زائد للكائن الأساسي في C++."
type: docs
weight: 20700
url: /ar/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


دالة للحصول على العنصر N من الـ tuple المعطى. تحميل زائد للكائن الأساسي.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | الوصف |
| --- | --- |
| N | فهرس العنصر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| كائن | const SharedPtr\<Object\>\& | كائن للفحص. |

### ReturnValue

قيمة العنصر N من الـ tuple محولة إلى كائن.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


دالة للحصول على العنصر N من الـ tuple المعطى. تحميل زائد للمؤشرات المشتركة.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | الوصف |
| --- | --- |
| N | فهرس العنصر. |
| T | نوع الكائن المفحوص. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| كائن | const SharedPtr\<T\>\& | كائن للفحص. |

### ReturnValue

قيمة العنصر N من الـ tuple.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


دالة للحصول على العنصر N من الـ tuple المعطى. تحميل زائد للكائنات التي لديها طريقة Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | الوصف |
| --- | --- |
| N | فهرس العنصر. |
| T | نوع الكائن المفحوص. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| كائن | const T\& | كائن للفحص. |

### ReturnValue

قيمة العنصر N من الـ tuple.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


يحصل على العنصر N من tuple القيم.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | الوصف |
| --- | --- |
| N | فهرس العنصر. |
| المعلمات | عناصر الـ tuple. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple للحصول على عنصر من. |

### ReturnValue

قيمة العنصر N من الـ tuple.

## انظر أيضًا

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
