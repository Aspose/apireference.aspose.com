---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt 메서드"
linktitle: "Decrypt"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt 메서드. C++에서 지정된 패딩 모드를 사용하여 입력 데이터를 복호화합니다."
type: docs
weight: 200
url: /ko/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


지정된 패딩 모드를 사용하여 입력 데이터를 복호화합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| data | ByteArrayPtr | 복호화할 [Byte](../../../system/byte/) 배열. |
| 패딩 | SharedPtr\<RSAEncryptionPadding\> | 패딩 모드. |

### ReturnValue

바이트 배열 형식의 복호화된 데이터.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


메시지를 복호화합니다. 구현되지 않음.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) 복호화용. |
| use_oaep | bool | OAEP 패딩을 사용하려면 true, PKCS#1 v1.5 패딩을 사용하려면 false. |

### ReturnValue

복호화된 데이터 배열.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
