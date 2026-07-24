---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt メソッド"
linktitle: "Decrypt"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt メソッド。指定されたパディングモードを使用して C++ で入力データを復号化します。"
type: docs
weight: 200
url: /ja/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


指定されたパディングモードを使用して入力データを復号化します。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| data | ByteArrayPtr | 復号するための [Byte](../../../system/byte/) 配列。 |
| パディング | SharedPtr\<RSAEncryptionPadding\> | パディングモード。 |

### ReturnValue

バイト配列形式の復号済みデータ。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


メッセージを復号します。未実装です。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) を復号化します。 |
| use_oaep | bool | OAEP パディングを使用する場合は true、PKCS#1 v1.5 パディングを使用する場合は false を指定します。 |

### ReturnValue

復号化されたデータ配列。

## 参照

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
