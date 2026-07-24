---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash 메서드"
linktitle: "SignHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash 메서드. C++에서 지정된 해시 값에 대한 서명을 계산합니다."
type: docs
weight: 1700
url: /ko/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


지정된 해시 값에 대한 서명을 계산합니다.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| hash | ByteArrayPtr | 해시 값. |
| hash_algorithm | HashAlgorithmName | 해시 알고리즘. |
| padding | SharedPtr\<RSASignaturePadding\> | 패딩 모드. 지정된 해시에 대한 [RSA](../../rsa/) 서명을 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


지정된 입력 값의 서명을 계산합니다. 구현되지 않음.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 서명할 데이터의 해시 값. |
| str | const String\& | 해시를 생성하는 데 사용된 해시 알고리즘 식별자. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
