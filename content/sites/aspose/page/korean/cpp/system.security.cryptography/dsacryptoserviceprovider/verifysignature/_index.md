---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature 메서드"
linktitle: "VerifySignature"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature 메서드. C++에서 지정된 데이터에 대한 DSA 서명을 검증합니다."
type: docs
weight: 1900
url: /ko/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


지정된 데이터에 대한 [DSA](../../dsa/) 서명을 검증합니다.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) 가 **rgb_signature** 로 서명되었습니다. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) 서명. |

### ReturnValue

true - **rgb_signature** 가 **rgb_hash** 에 대해 계산된 [DSA](../../dsa/) 서명과 일치하면, 그렇지 않으면 false.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
