---
title: "System::Security::Cryptography::RSA::VerifyHash 메서드"
linktitle: "VerifyHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA::VerifyHash 메서드. C++에서 지정된 해시의 서명이 유효한지 확인합니다."
type: docs
weight: 1400
url: /ko/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


지정된 해시의 서명이 유효한지 확인합니다.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
