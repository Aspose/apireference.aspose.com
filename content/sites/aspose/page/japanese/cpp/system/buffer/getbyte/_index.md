---
title: "System::Buffer::GetByte メソッド"
linktitle: "GetByte"
second_title: "C++ 用 Aspose.Page"
description: "System::Buffer::GetByte メソッド。指定された型付き配列を生のバイト配列として解釈し、C++ で指定されたバイトオフセットのバイト値を取得します。"
type: docs
weight: 300
url: /ja/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置のバイト値を取得します。

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const SharedPtr\<Array\<T\>\>\& | 対象配列 |
| インデックス | int | 取得するバイトのゼロベースオフセット |

### ReturnValue

指定されたインデックスのバイト値

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置のバイト値を取得します。

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列ビューの要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const System::Details::ArrayView\<T\>\& | 対象の配列ビュー |
| インデックス | int | 取得するバイトのゼロベースオフセット |

### ReturnValue

指定されたインデックスのバイト値

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置のバイト値を取得します。

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| パラメーター | 説明 |
| --- | --- |
| T | スタック配列の要素の型 |
| N | スタック配列のサイズ |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const System::Details::StackArray\<T, N\>\& | 対象スタック配列 |
| インデックス | int | 取得するバイトのゼロベースオフセット |

### ReturnValue

指定されたインデックスのバイト値

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
