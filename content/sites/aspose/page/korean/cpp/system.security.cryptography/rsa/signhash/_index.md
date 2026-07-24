---
title: "System::Security::Cryptography::RSA::SignHash 메서드"
linktitle: "SignHash"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA::SignHash 메서드. C++에서 지정된 해시 값에 대한 서명을 계산합니다."
type: docs
weight: 1100
url: /ko/cpp/system.security.cryptography/rsa/signhash/
---
## RSA::SignHash method


지정된 해시 값에 대한 서명을 계산합니다.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| hash | ByteArrayPtr | 해시 값. |
| hash_algorithm | HashAlgorithmName | 해시 알고리즘. |
| padding | SharedPtr\<RSASignaturePadding\> | 패딩 모드. 지정된 해시에 대한 [RSA](../) 서명을 반환합니다. |

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
