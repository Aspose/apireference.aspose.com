---
title: "طريقة System::Buffer::GetByte"
linktitle: "GetByte"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Buffer::GetByte. تفسّر المصفوفة المكتوبة المحددة كمصفوفة بايت خام وتسترجع قيمة البايت عند الإزاحة المحددة للبايت في C++."
type: docs
weight: 300
url: /ar/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


يفسر المصفوفة المحددة من النوع كمصفوفة بايت خام ويسترجع قيمة البايت عند الإزاحة المحددة.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر المصفوفة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const SharedPtr\<Array\<T\>\>\& | المصفوفة الهدف |
| الفهرس | int | الإزاحة صفرية الأساس للبايت المراد استرجاعه |

### ReturnValue

قيمة البايت عند الفهرس المحدد

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


يفسر المصفوفة المحددة من النوع كمصفوفة بايت خام ويسترجع قيمة البايت عند الإزاحة المحددة.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر عرض المصفوفة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const System::Details::ArrayView\<T\>\& | عرض المصفوة الهدف |
| الفهرس | int | الإزاحة صفرية الأساس للبايت المراد استرجاعه |

### ReturnValue

قيمة البايت عند الفهرس المحدد

## انظر أيضًا

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


يفسر المصفوفة المحددة من النوع كمصفوفة بايت خام ويسترجع قيمة البايت عند الإزاحة المحددة.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع عناصر مصفوفة المكدس |
| N | حجم مصفوفة المكدس |

| Parameter | Type | الوصف |
| --- | --- | --- |
| مصفوفة | const System::Details::StackArray\<T, N\>\& | مصفوفة المكدس الهدف |
| الفهرس | int | الإزاحة صفرية الأساس للبايت المراد استرجاعه |

### ReturnValue

قيمة البايت عند الفهرس المحدد

## انظر أيضًا

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
