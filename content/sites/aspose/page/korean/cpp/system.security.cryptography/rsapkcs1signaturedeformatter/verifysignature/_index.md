---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature 메서드"
linktitle: "VerifySignature"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature 메서드. C++에서 데이터 해시의 서명을 검증합니다."
type: docs
weight: 400
url: /ko/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


데이터 해시의 서명을 검증합니다.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | 데이터에 대한 해시가 계산되었습니다. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | 데이터에 대한 서명이 수신되었습니다. |

### ReturnValue

서명이 유효하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
