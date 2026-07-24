---
title: "System::Buffer::BlockCopy メソッド"
linktitle: "BlockCopy"
second_title: "C++ 用 Aspose.Page"
description: "System::Buffer::BlockCopy メソッド。指定された 2 つの型付き配列をバイトの生配列として解釈し、C++ でそれらの一方からもう一方へデータをコピーします。"
type: docs
weight: 100
url: /ja/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソース配列の要素の型 |
| TDst | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | ソース配列 |
| srcOffset | int | コピーが開始されるソース配列内のバイトオフセット |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 宛先配列 |
| dstOffset | int | データの挿入を開始する宛先配列内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソース配列の要素の型 |
| TDst | 宛先配列ビューの要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | ソース配列 |
| srcOffset | int | コピーが開始されるソース配列内のバイトオフセット |
| dst | const System::Details::ArrayView\<TDst\>\& | 宛先配列ビュー |
| dstOffset | int | データの挿入を開始する宛先配列ビュー内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソース配列の要素の型 |
| TDst | 宛先スタック配列の要素の型 |
| ND | 宛先スタック配列のサイズ |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | ソース配列 |
| srcOffset | int | コピーが開始されるソース配列内のバイトオフセット |
| dst | const System::Details::StackArray\<TDst, ND\>\& | 宛先スタック配列 |
| dstOffset | int | データの挿入を開始する宛先スタック配列内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソース配列ビューの要素の型 |
| TDst | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | ソース配列ビュー |
| srcOffset | int | コピーが開始されるソース配列ビュー内のバイトオフセット |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 宛先配列 |
| dstOffset | int | データの挿入を開始する宛先配列内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソース配列ビューの要素の型 |
| TDst | 宛先配列ビューの要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | ソース配列ビュー |
| srcOffset | int | コピーが開始されるソース配列ビュー内のバイトオフセット |
| dst | const System::Details::ArrayView\<TDst\>\& | 宛先配列ビュー |
| dstOffset | int | データの挿入を開始する宛先配列ビュー内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソーススタック配列の要素の型 |
| NS | ソーススタック配列のサイズ |
| TDst | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | ソーススタック配列 |
| srcOffset | int | コピーが開始されるソーススタック配列内のバイトオフセット |
| dst | const SharedPtr\<Array\<TDst\>\>\& | 宛先配列 |
| dstOffset | int | データの挿入を開始する宛先配列内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


指定された 2 つの型付き配列を生バイト配列として解釈し、片方からもう片方へデータをコピーします。

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| パラメーター | 説明 |
| --- | --- |
| TSrc | ソーススタック配列の要素の型 |
| NS | ソーススタック配列のサイズ |
| TDst | 宛先スタック配列の要素の型 |
| ND | 宛先スタック配列のサイズ |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | ソーススタック配列 |
| srcOffset | int | コピーが開始されるソーススタック配列内のバイトオフセット |
| dst | const System::Details::StackArray\<TDst, ND\>\& | 宛先スタック配列 |
| dstOffset | int | データの挿入を開始する宛先スタック配列内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


指定されたバイト数をソースバッファから宛先バッファへコピーします。

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src | const uint8_t * | ソースバッファへのポインタ |
| srcOffset | int | コピーが開始されるソースバッファ内のバイトオフセット |
| dst | uint8_t * | 宛先バッファへのポインタ |
| dstOffset | int | データの挿入を開始する宛先バッファ内のバイトオフセット |
| count | int | コピーするバイト数 |

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
