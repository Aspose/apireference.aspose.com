---
title: "طريقة System::Array::CopyTo"
linktitle: "CopyTo"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Array::CopyTo. تنسخ جميع عناصر المصفوفة الحالية إلى مصفوفة الوجهة المحددة. يتم إدراج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل arrayIndex في C++."
type: docs
weight: 900
url: /ar/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


ينسخ جميع عناصر المصفوفة الحالية إلى مصفوفة الوجهة المحددة. تُدرج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | المصفوفة الوجهة |
| arrayIndex | int | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


ينسخ جميع عناصر المصفوفة الحالية إلى مصفوفة الوجهة المحددة. تُدرج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| معامل | الوصف |
| --- | --- |
| DstType | نوع العناصر في المصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


ينسخ عددًا محددًا من العناصر من المصفوفة الحالية بدءًا من الموضع المحدد إلى مصفوفة الوجهة المحددة. تُدرج العناصر في مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| معامل | الوصف |
| --- | --- |
| DstType | نوع العناصر في المصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| srcIndex | int64_t | الفهرس في المصفوفة المصدر لبدء نسخ العناصر |
| dstIndex | int64_t | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


ينسخ جميع عناصر المصفوفة الحالية إلى عرض مصفوفة الوجهة المحدد. تُدرج العناصر في عرض مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| معامل | الوصف |
| --- | --- |
| DstType | نوع العناصر في عرض مصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | عرض مصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في عرض مصفوفة الوجهة لبدء إدراج العناصر المنسوخة عنده |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


ينسخ عددًا محددًا من العناصر من المصفوفة الحالية بدءًا من الموضع المحدد إلى عرض مصفوفة الوجهة المحدد. يتم إدراج العناصر في عرض مصفوفة الوجهة بدءًا من الفهرس المحدد بواسطة معامل dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| معامل | الوصف |
| --- | --- |
| DstType | نوع العناصر في عرض مصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | عرض مصفوفة الوجهة |
| srcIndex | int64_t | الفهرس في المصفوفة المصدر لبدء نسخ العناصر |
| dstIndex | int64_t | الفهرس في عرض مصفوفة الوجهة لبدء إدراج العناصر المنسوخة عنده |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
