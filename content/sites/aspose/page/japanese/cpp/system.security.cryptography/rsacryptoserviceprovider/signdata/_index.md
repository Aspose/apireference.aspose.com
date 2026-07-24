---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData メソッド"
linktitle: "SignData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData メソッド。指定された入力値の署名を計算します（C++）。"
type: docs
weight: 1600
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


指定された入力値の署名を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) から入力データを読み取ります。 |
| halg | const SharedPtr\<Object\>\& | 使用するハッシュアルゴリズム。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


指定された入力値の署名を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) から入力データを読み取ります。 |
| offset | int32_t | 入力バッファスライスの開始インデックス。 |
| count | int32_t | 入力バッファスライスのサイズ。 |
| halg | const SharedPtr\<Object\>\& | 使用するハッシュアルゴリズム。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


指定された入力値の署名を計算します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | 署名対象データを読み取るストリーム。 |
| halg | const SharedPtr\<Object\>\& | 使用するハッシュアルゴリズム。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
