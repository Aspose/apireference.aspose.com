---
title: "System::IO::MemoryStream::MemoryStream コンストラクタ"
linktitle: "MemoryStream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::MemoryStream::MemoryStream コンストラクタ。初期容量が 0 の MemoryStream クラスの新しいインスタンスを構築します（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


初期容量が 0 の [MemoryStream](../) クラスの新しいインスタンスを構築します。

```cpp
System::IO::MemoryStream::MemoryStream()
```

## 参照

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


指定されたメモリバッファに接続されたメモリストリームを表す [MemoryStream](../) クラスの新しいインスタンスを構築します。パラメータでストリームが書き込み可能かどうかを指定します。

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | 作成されるオブジェクトが表すストリームの基になるメモリバッファとして使用されるバイト配列 |
| 書き込み可能 | bool | ストリームを書き込み可能にするかどうかを指定します |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


指定されたインデックスから開始し、指定された要素数を含む、指定されたメモリバッファのセグメントに接続されたメモリストリームを表す [MemoryStream](../) クラスの新しいインスタンスを構築します。パラメータでストリームが書き込み可能かどうか、またメソッド GetBytes() を呼び出せるかどうかを指定します。

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | 作成されるオブジェクトが表すストリームの基になるメモリバッファとして使用されるバイト配列のセグメント |
| インデックス | int | セグメントが開始する **content** の要素の 0 ベースインデックス |
| count | int | セグメントに含まれる **content** の要素数 |
| 書き込み可能 | bool | ストリームを書き込み可能にするかどうかを指定します |
| publiclyVisible | bool | 基になるメモリバッファをメソッド GetByte() の呼び出し元に公開するかどうかを指定します |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


指定されたサイズのメモリバッファに基づくストリームを表す [MemoryStream](../) クラスの新しいインスタンスを構築します。

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| capacity_ | int | 作成中のオブジェクトが表すストリームに関連付けられたメモリバッファのサイズ（バイト） |

## 参照

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
