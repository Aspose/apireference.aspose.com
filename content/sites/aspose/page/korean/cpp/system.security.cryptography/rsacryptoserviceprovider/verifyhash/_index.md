---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash 메서드"
linktitle: "VerifyHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash 메서드. 지정된 해시의 서명이 C++에서 유효한지 확인합니다."
type: docs
weight: 1900
url: /ko/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


지정된 해시의 서명이 유효한지 확인합니다.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| hash | ByteArrayPtr | 서명된 데이터의 해시 값. |
| signature | ByteArrayPtr | 서명 데이터. |
| hash_algorithm | const HashAlgorithmName\& | 해시 알고리즘. |
| 패딩 | SharedPtr\<RSASignaturePadding\> | 패딩 모드. 서명이 유효하면 true를 반환하고, 그렇지 않으면 false를 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


데이터 서명을 검사합니다.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 수신된 데이터에 대해 계산된 해시. |
| str | const String\& | 사용된 해시 알고리즘의 이름. |
| rgb_signature | const ByteArrayPtr\& | 수신된 서명. |

### ReturnValue

서명이 유효하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
