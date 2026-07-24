---
title: "System::Buffer::SetByte method"
linktitle: "SetByte"
second_title: "C++ 用 Aspose.Page"
description: "System::Buffer::SetByte method. 指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセットに指定されたバイト値を設定します（C++）。"
type: docs
weight: 400
url: /ja/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置に指定されたバイト値を設定します。

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const SharedPtr\<Array\<T\>\>\& | 対象配列 |
| インデックス | int | 設定するバイトのゼロベースオフセット |
| value | uint8_t | 設定するバイト値 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置に指定されたバイト値を設定します。

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const System::Details::ArrayView\<T\>\& | 対象の配列ビュー |
| インデックス | int | 設定するバイトのゼロベースオフセット |
| value | uint8_t | 設定するバイト値 |

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


指定された型付き配列を生バイト配列として解釈し、指定されたバイトオフセット位置に指定されたバイト値を設定します。

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| パラメーター | 説明 |
| --- | --- |
| T | 配列の要素の型 |
| N | スタック配列のサイズ |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 配列 | const System::Details::StackArray\<T, N\>\& | 対象スタック配列 |
| インデックス | int | 設定するバイトのゼロベースオフセット |
| value | uint8_t | 設定するバイト値 |

## 参照

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
