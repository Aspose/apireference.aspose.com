---
title: "System::Array::Copy 方法"
linktitle: "Copy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Copy 方法。将指定数量的元素从源数组复制到目标数组（C++）。"
type: docs
weight: 4900
url: /zh/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


将指定数量的元素从源数组复制到目标数组。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


将指定数量的元素从源数组的指定索引开始复制到目标数组的指定位置。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 源数组中元素的类型 |
| DstType | 目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| srcIndex | int64_t | 源数组中的索引，指示要复制的项目范围的起始位置 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| dstIndex | int64_t | 目标数组中的索引，指示开始插入复制项目的位置 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


将指定数量的元素从源数组的指定索引开始复制到目标数组视图的指定位置。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 源数组中元素的类型 |
| DstType | 目标数组视图中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| srcIndex | int64_t | 源数组中的索引，指示要复制的项目范围的起始位置 |
| dstArray | System::Details::ArrayView\<DstType\> | 目标数组视图 |
| dstIndex | int64_t | 在目标数组视图中开始插入复制项的索引 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


将指定数量的元素从源数组的指定索引开始复制到栈上的目标数组的指定位置。

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 源数组中元素的类型 |
| DstType | 堆栈上目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| srcIndex | int64_t | 源数组中的索引，指示要复制的项目范围的起始位置 |
| dstArray | System::Details::StackArray\<DstType, N\>\& | 堆栈上的目标数组 |
| dstIndex | int64_t | 在堆栈上的目标数组中开始插入复制项的索引 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


将指定数量的元素从源数组复制到目标数组视图。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| dstArray | System::Details::ArrayView\<DstType\> | 目标数组视图 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


将指定数量的元素从源数组复制到栈上的目标数组。

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| dstArray | System::Details::StackArray\<DstType, N\>\& | 堆栈上的目标数组 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


将指定数量的元素从源数组视图的指定索引开始复制到栈上的目标数组的指定位置。

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 堆栈上源数组中元素的类型 |
| DstType | 堆栈上目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | 源数组视图 |
| srcIndex | int64_t | 在源数组视图中标识要复制的项目范围起始位置的索引 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | 堆栈上的目标数组 |
| dstIndex | int64_t | 在堆栈上的目标数组中开始插入复制项的索引 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


将指定数量的元素从源数组视图复制到目标数组。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 源数组视图 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


将指定数量的元素从源数组视图的指定索引开始复制到目标数组的指定位置。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 源数组视图中元素的类型 |
| DstType | 目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 源数组视图 |
| srcIndex | int64_t | 在源数组视图中标识要复制的项目范围起始位置的索引 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| dstIndex | int64_t | 目标数组中的索引，指示开始插入复制项目的位置 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


将指定数量的元素从源数组视图的指定索引开始复制到目标数组视图的指定位置。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 源数组视图中元素的类型 |
| DstType | 目标数组视图中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 源数组视图 |
| srcIndex | int64_t | 在源数组视图中标识要复制的项目范围起始位置的索引 |
| dstArray | System::Details::ArrayView\<DstType\> | 目标数组视图 |
| dstIndex | int64_t | 在目标数组视图中开始插入复制项的索引 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


将指定数量的元素从源数组视图复制到目标数组视图。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | 源数组视图 |
| dstArray | System::Details::ArrayView\<DstType\> | 目标数组视图 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


将指定数量的元素从栈上的源数组复制到目标数组。

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | 堆栈上的源数组 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


将指定数量的元素从栈上的源数组的指定索引开始复制到目标数组的指定位置。

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 堆栈上源数组中元素的类型 |
| DstType | 目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | 堆栈上的源数组 |
| srcIndex | int64_t | 堆栈上源数组中指示要复制的项目范围起始位置的索引 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| dstIndex | int64_t | 目标数组中的索引，指示开始插入复制项目的位置 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


将指定数量的元素从栈上的源数组的指定索引开始复制到栈上的目标数组的指定位置。

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 堆栈上源数组中元素的类型 |
| DstType | 堆栈上目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | 堆栈上的源数组 |
| srcIndex | int64_t | 堆栈上源数组中指示要复制的项目范围起始位置的索引 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | 堆栈上的目标数组 |
| dstIndex | int64_t | 在堆栈上的目标数组中开始插入复制项的索引 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


将指定数量的元素从栈上的源数组复制到栈上的目标数组。

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | 堆栈上的源数组 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | 堆栈上的目标数组 |
| count | int64_t | 要复制的元素数量 |

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
