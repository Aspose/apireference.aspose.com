---
title: "طريقة System::Array::Copy"
linktitle: "Copy"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Array::Copy. تنسخ العدد المحدد من العناصر من المصفوفة المصدر إلى مصفوفة الوجهة في C++."
type: docs
weight: 4900
url: /ar/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


ينسخ العدد المحدد من العناصر من مصفوفة المصدر إلى مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في المصفوفة المصدر |
| DstType | نوع العناصر في المصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| srcIndex | int64_t | الفهرس في المصفوفة المصدر الذي يحدد بداية نطاق العناصر التي سيتم نسخها |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في عرض مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في المصفوفة المصدر |
| DstType | نوع العناصر في عرض مصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| srcIndex | int64_t | الفهرس في المصفوفة المصدر الذي يحدد بداية نطاق العناصر التي سيتم نسخها |
| dstArray | System::Details::ArrayView\<DstType\> | عرض مصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في عرض مصفوفة الوجهة لبدء إدراج العناصر المنسوخة عنده |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة على المكدس.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في المصفوفة المصدر |
| DstType | نوع العناصر في مصفوفة الوجهة على المكدس |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| srcIndex | int64_t | الفهرس في المصفوفة المصدر الذي يحدد بداية نطاق العناصر التي سيتم نسخها |
| dstArray | System::Details::StackArray\<DstType, N\>\& | مصفوفة الوجهة على المكدس |
| dstIndex | int64_t | الفهرس في مصفوفة الوجهة على المكدس لبدء إدراج العناصر المنسوخة عنده |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


ينسخ العدد المحدد من العناصر من مصفوفة المصدر إلى عرض مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| dstArray | System::Details::ArrayView\<DstType\> | عرض مصفوفة الوجهة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


ينسخ العدد المحدد من العناصر من مصفوفة المصدر إلى مصفوفة الوجهة على المكدس.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| dstArray | System::Details::StackArray\<DstType, N\>\& | مصفوفة الوجهة على المكدس |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من عرض مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة على المكدس.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في مصفوفة المصدر على المكدس |
| DstType | نوع العناصر في مصفوفة الوجهة على المكدس |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | عرض مصفوفة المصدر |
| srcIndex | int64_t | الفهرس في عرض مصفوفة المصدر الذي يحدد بداية نطاق العناصر للنسخ |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | مصفوفة الوجهة على المكدس |
| dstIndex | int64_t | الفهرس في مصفوفة الوجهة على المكدس لبدء إدراج العناصر المنسوخة عنده |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


ينسخ العدد المحدد من العناصر من عرض مصفوفة المصدر إلى مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | عرض مصفوفة المصدر |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من عرض مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في عرض مصفوفة المصدر |
| DstType | نوع العناصر في المصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | عرض مصفوفة المصدر |
| srcIndex | int64_t | الفهرس في عرض مصفوفة المصدر الذي يحدد بداية نطاق العناصر للنسخ |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من عرض مصفوفة المصدر بدءًا من الفهرس المحدد إلى الموضع المحدد في عرض مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في عرض مصفوفة المصدر |
| DstType | نوع العناصر في عرض مصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | عرض مصفوفة المصدر |
| srcIndex | int64_t | الفهرس في عرض مصفوفة المصدر الذي يحدد بداية نطاق العناصر للنسخ |
| dstArray | System::Details::ArrayView\<DstType\> | عرض مصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في عرض مصفوفة الوجهة لبدء إدراج العناصر المنسوخة عنده |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


ينسخ العدد المحدد من العناصر من عرض مصفوفة المصدر إلى عرض مصفوفة الوجهة.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | عرض مصفوفة المصدر |
| dstArray | System::Details::ArrayView\<DstType\> | عرض مصفوفة الوجهة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


ينسخ العدد المحدد من العناصر من مصفوفة المصدر على المكدس إلى مصفوفة الوجهة.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | المصفوفة المصدرية على المكدس |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من مصفوفة المصدر على المكدس بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في مصفوفة المصدر على المكدس |
| DstType | نوع العناصر في المصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | المصفوفة المصدرية على المكدس |
| srcIndex | int64_t | الفهرس في المصفوفة المصدرية على المكدس الذي يحدد بداية نطاق العناصر المراد نسخها |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


ينسخ عددًا محددًا من العناصر من مصفوفة المصدر على المكدس بدءًا من الفهرس المحدد إلى الموضع المحدد في مصفوفة الوجهة على المكدس.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في مصفوفة المصدر على المكدس |
| DstType | نوع العناصر في مصفوفة الوجهة على المكدس |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | المصفوفة المصدرية على المكدس |
| srcIndex | int64_t | الفهرس في المصفوفة المصدرية على المكدس الذي يحدد بداية نطاق العناصر المراد نسخها |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | مصفوفة الوجهة على المكدس |
| dstIndex | int64_t | الفهرس في مصفوفة الوجهة على المكدس لبدء إدراج العناصر المنسوخة عنده |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


ينسخ العدد المحدد من العناصر من مصفوفة المصدر على المكدس إلى مصفوفة الوجهة على المكدس.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | المصفوفة المصدرية على المكدس |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | مصفوفة الوجهة على المكدس |
| count | int64_t | عدد العناصر التي سيتم نسخها |

## انظر أيضًا

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
