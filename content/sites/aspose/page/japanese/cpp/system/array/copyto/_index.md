---
title: "System::Array::CopyTo メソッド"
linktitle: "CopyTo"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::CopyTo メソッド。現在の配列のすべての要素を指定された宛先配列にコピーします。要素は C++ で arrayIndex 引数で指定されたインデックスから宛先配列に挿入されます。"
type: docs
weight: 900
url: /ja/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


現在の配列のすべての要素を指定されたデスティネーション配列へコピーします。要素は arrayIndex 引数で指定されたインデックスからデスティネーション配列に挿入されます。

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | 宛先配列 |
| arrayIndex | int | コピーされた項目の挿入を開始する宛先配列内のインデックス |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


現在の配列のすべての要素を指定された宛先配列にコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列に挿入されます。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| パラメーター | 説明 |
| --- | --- |
| DstType | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| dstIndex | int64_t | コピーされた項目の挿入を開始する宛先配列内のインデックス |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


現在の配列から指定された位置で開始する指定数の要素を、指定された宛先配列にコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列に挿入されます。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| パラメーター | 説明 |
| --- | --- |
| DstType | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| srcIndex | int64_t | コピーを開始するソース配列内のインデックス |
| dstIndex | int64_t | コピーされた項目の挿入を開始する宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


現在の配列のすべての要素を指定された宛先配列ビューにコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列ビューに挿入されます。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| パラメーター | 説明 |
| --- | --- |
| DstType | 宛先配列ビューの要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | 宛先配列ビュー |
| dstIndex | int64_t | コピーした項目の挿入を開始する宛先配列ビュー内のインデックス |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


現在の配列から指定された位置で開始する指定数の要素を、指定された宛先配列ビューにコピーします。要素は、dstIndex 引数で指定されたインデックスから宛先配列ビューに挿入されます。

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| パラメーター | 説明 |
| --- | --- |
| DstType | 宛先配列ビューの要素型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | 宛先配列ビュー |
| srcIndex | int64_t | コピーを開始するソース配列内のインデックス |
| dstIndex | int64_t | コピーした項目の挿入を開始する宛先配列ビュー内のインデックス |
| count | int64_t | コピーする要素数 |

## 参照

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
