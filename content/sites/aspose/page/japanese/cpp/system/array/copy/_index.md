---
title: "System::Array::Copy メソッド"
linktitle: "Copy"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::Copy メソッド。指定された数の要素をソース配列から宛先配列へ C++ でコピーします。"
type: docs
weight: 4900
url: /ja/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


ソース配列からデスティネーション配列へ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


指定されたインデックスから開始するソース配列の指定された数の要素を、デスティネーション配列の指定された位置へコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | ソース配列の要素の型 |
| DstType | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示す、ソース配列内のインデックス |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| dstIndex | int64_t | コピーされた項目の挿入を開始する宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


指定されたインデックスから開始するソース配列の指定された数の要素を、デスティネーション配列ビューの指定された位置へコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | ソース配列の要素の型 |
| DstType | 宛先配列ビューの要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示す、ソース配列内のインデックス |
| dstArray | System::Details::ArrayView\<DstType\> | 宛先配列ビュー |
| dstIndex | int64_t | コピーした項目の挿入を開始する宛先配列ビュー内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


指定されたインデックスから開始するソース配列の指定された数の要素を、スタック上のデスティネーション配列の指定された位置へコピーします。

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | ソース配列の要素の型 |
| DstType | スタック上の宛先配列の要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示す、ソース配列内のインデックス |
| dstArray | System::Details::StackArray\<DstType, N\>\& | スタック上の宛先配列 |
| dstIndex | int64_t | コピーした項目の挿入を開始するスタック上の宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


ソース配列からデスティネーション配列ビューへ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| dstArray | System::Details::ArrayView\<DstType\> | 宛先配列ビュー |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


ソース配列からスタック上のデスティネーション配列へ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| dstArray | System::Details::StackArray\<DstType, N\>\& | スタック上の宛先配列 |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


ソース配列ビューで、指定されたインデックスから開始する指定された数の要素を、スタック上のデスティネーション配列の指定された位置へコピーします。

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | スタック上のソース配列の要素型 |
| DstType | スタック上の宛先配列の要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | ソース配列ビュー |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示すソース配列ビュー内のインデックス |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | スタック上の宛先配列 |
| dstIndex | int64_t | コピーした項目の挿入を開始するスタック上の宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


ソース配列ビューからデスティネーション配列へ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | ソース配列ビュー |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


指定されたインデックスから開始するソース配列ビューの指定された数の要素を、デスティネーション配列の指定された位置へコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | ソース配列ビューの要素の型 |
| DstType | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | ソース配列ビュー |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示すソース配列ビュー内のインデックス |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| dstIndex | int64_t | コピーされた項目の挿入を開始する宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


指定されたインデックスから開始するソース配列ビューの指定された数の要素を、デスティネーション配列ビューの指定された位置へコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | ソース配列ビューの要素の型 |
| DstType | 宛先配列ビューの要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | ソース配列ビュー |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示すソース配列ビュー内のインデックス |
| dstArray | System::Details::ArrayView\<DstType\> | 宛先配列ビュー |
| dstIndex | int64_t | コピーした項目の挿入を開始する宛先配列ビュー内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


ソース配列ビューからデスティネーション配列ビューへ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | ソース配列ビュー |
| dstArray | System::Details::ArrayView\<DstType\> | 宛先配列ビュー |
| count | int64_t | コピーする要素数 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


スタック上のソース配列からデスティネーション配列へ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | スタック上のソース配列 |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


スタック上のソース配列で、指定されたインデックスから開始する指定された数の要素を、デスティネーション配列の指定された位置へコピーします。

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | スタック上のソース配列の要素型 |
| DstType | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | スタック上のソース配列 |
| srcIndex | int64_t | スタック上のソース配列で、コピーする項目範囲の開始位置を示すインデックス |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| dstIndex | int64_t | コピーされた項目の挿入を開始する宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


スタック上のソース配列で、指定されたインデックスから開始する指定された数の要素を、スタック上のデスティネーション配列の指定された位置へコピーします。

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | スタック上のソース配列の要素型 |
| DstType | スタック上の宛先配列の要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | スタック上のソース配列 |
| srcIndex | int64_t | スタック上のソース配列で、コピーする項目範囲の開始位置を示すインデックス |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | スタック上の宛先配列 |
| dstIndex | int64_t | コピーした項目の挿入を開始するスタック上の宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


スタック上のソース配列からスタック上のデスティネーション配列へ、指定された数の要素をコピーします。

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | スタック上のソース配列 |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | スタック上の宛先配列 |
| count | int64_t | コピーする要素数 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
