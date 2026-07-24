---
title: "طريقة System::Buffer::BlockCopy"
linktitle: "BlockCopy"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Buffer::BlockCopy. تفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وتنسخ البيانات من إحداهما إلى الأخرى في C++."
type: docs
weight: 100
url: /ar/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع عناصر المصفوفة المصدر |
| TDst | نوع عناصر المصفوفة الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | المصفوفة المصدر |
| srcOffset | int | إزاحة بايت في المصفوفة المصدر التي يبدأ النسخ عندها |
| dst | const SharedPtr\<Array\<TDst\>\>\& | المصفوفة الوجهة |
| dstOffset | int | إزاحة بايت في المصفوفة الوجهة التي يبدأ عندها إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع عناصر المصفوفة المصدر |
| TDst | نوع العناصر في عرض المصفوفة الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | المصفوفة المصدر |
| srcOffset | int | إزاحة بايت في المصفوفة المصدر التي يبدأ النسخ عندها |
| dst | const System::Details::ArrayView\<TDst\>\& | عرض المصفوفة الوجهة |
| dstOffset | int | إزاحة بايت في عرض المصفوفة الوجهة حيث يبدأ إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع عناصر المصفوفة المصدر |
| TDst | نوع العناصر في مصفوفة المكدس الوجهة |
| ND | حجم مصفوفة المكدس الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | المصفوفة المصدر |
| srcOffset | int | إزاحة بايت في المصفوفة المصدر التي يبدأ النسخ عندها |
| dst | const System::Details::StackArray\<TDst, ND\>\& | مصفوفة المكدس الوجهة |
| dstOffset | int | إزاحة بايت في مصفوفة المكدس الوجهة حيث يبدأ إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع العناصر في عرض المصفوفة المصدر |
| TDst | نوع عناصر المصفوفة الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | عرض المصفوفة المصدر |
| srcOffset | int | إزاحة بايت في عرض المصفوفة المصدر حيث يبدأ النسخ |
| dst | const SharedPtr\<Array\<TDst\>\>\& | المصفوفة الوجهة |
| dstOffset | int | إزاحة بايت في المصفوفة الوجهة التي يبدأ عندها إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع العناصر في عرض المصفوفة المصدر |
| TDst | نوع العناصر في عرض المصفوفة الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | عرض المصفوفة المصدر |
| srcOffset | int | إزاحة بايت في عرض المصفوفة المصدر حيث يبدأ النسخ |
| dst | const System::Details::ArrayView\<TDst\>\& | عرض المصفوفة الوجهة |
| dstOffset | int | إزاحة بايت في عرض المصفوفة الوجهة حيث يبدأ إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع العناصر في مصفوفة المكدس المصدر |
| NS | حجم مصفوفة المكدس المصدر |
| TDst | نوع عناصر المصفوفة الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | مصفوفة المكدس المصدر |
| srcOffset | int | إزاحة بايت في مصفوفة المكدس المصدر حيث يبدأ النسخ |
| dst | const SharedPtr\<Array\<TDst\>\>\& | المصفوفة الوجهة |
| dstOffset | int | إزاحة بايت في المصفوفة الوجهة التي يبدأ عندها إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


يفسر مصفوفتين محددتين من النوع كمصفوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | الوصف |
| --- | --- |
| TSrc | نوع العناصر في مصفوفة المكدس المصدر |
| NS | حجم مصفوفة المكدس المصدر |
| TDst | نوع العناصر في مصفوفة المكدس الوجهة |
| ND | حجم مصفوفة المكدس الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | مصفوفة المكدس المصدر |
| srcOffset | int | إزاحة بايت في مصفوفة المكدس المصدر حيث يبدأ النسخ |
| dst | const System::Details::StackArray\<TDst, ND\>\& | مصفوفة المكدس الوجهة |
| dstOffset | int | إزاحة بايت في مصفوفة المكدس الوجهة حيث يبدأ إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


ينسخ عددًا محددًا من البايتات من المخزن المؤقت المصدر إلى المخزن المؤقت الوجهة.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| src | const uint8_t * | مؤشر إلى المخزن المؤقت المصدر |
| srcOffset | int | إزاحة بايت في المخزن المؤقت المصدر حيث يبدأ النسخ |
| dst | uint8_t * | مؤشر إلى المخزن المؤقت الوجهة |
| dstOffset | int | إزاحة بايت في المخزن المؤقت الوجهة حيث يبدأ إدراج البيانات |
| count | int | عدد البايتات التي سيتم نسخها |

## انظر أيضًا

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
