---
title: "System::Security::Cryptography::DSA::VerifySignature 메서드"
linktitle: "VerifySignature"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::DSA::VerifySignature 메서드. C++에서 지정된 데이터에 대한 DSA 서명을 검증합니다."
type: docs
weight: 800
url: /ko/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


지정된 데이터에 대한 [DSA](../) 서명을 검증합니다.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) 가 **rgb_signature** 로 서명되었습니다. |
| rgb_signature | ByteArrayPtr | [DSA](../) 서명. |

### ReturnValue

true - **rgb_signature**이 **rgb_hash**에 대해 계산된 [DSA](../) 서명과 일치하면, 그렇지 않으면 false.

## 또 보기

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
