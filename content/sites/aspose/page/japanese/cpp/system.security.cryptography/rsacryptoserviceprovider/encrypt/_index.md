---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt メソッド"
linktitle: "暗号化"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt メソッド。指定されたパディングモードを使用して C++ で入力データを暗号化します。"
type: docs
weight: 400
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


指定されたパディングモードを使用して入力データを暗号化します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| data | ByteArrayPtr | 暗号化する [Byte](../../../system/byte/) 配列。 |
| パディング | SharedPtr\<RSAEncryptionPadding\> | パディングモード。 |

### ReturnValue

バイト配列形式の暗号化データ。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


メッセージを暗号化します。未実装です。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) を暗号化します。 |
| use_oaep | bool | OAEP パディングを使用する場合は true、PKCS#1 v1.5 パディングを使用する場合は false を指定します。 |

### ReturnValue

暗号化されたデータ配列。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
