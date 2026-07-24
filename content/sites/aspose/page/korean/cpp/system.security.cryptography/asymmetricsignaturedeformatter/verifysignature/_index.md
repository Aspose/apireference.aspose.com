---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature 메서드"
linktitle: "VerifySignature"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature 메서드. C++에서 데이터에 대한 서명을 검증합니다."
type: docs
weight: 300
url: /ko/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


데이터에 대한 서명을 검증합니다.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) 가 **rgbSignature** 로 서명되었습니다. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | 데이터에 대해 검증될 서명. |

### ReturnValue

서명 검증이 성공하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


데이터에 대한 서명을 검증합니다. 구현되지 않음.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | 해싱에 사용할 알고리즘. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | 데이터에 대해 검증될 서명. |

### ReturnValue

서명 검증이 성공하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
