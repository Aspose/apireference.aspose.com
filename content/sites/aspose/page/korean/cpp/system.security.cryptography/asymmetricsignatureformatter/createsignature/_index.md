---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method"
linktitle: "CreateSignature"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature 메서드. C++의 RTTI 정보."
type: docs
weight: 100
url: /ko/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI 정보.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | 해시를 계산할 [Data](../../../system.data/). |

### ReturnValue

바이트 배열 형태로 계산된 서명.
## 비고


지정된 데이터에 대한 서명을 생성합니다.
## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


지정된 해시 값에 대한 서명을 생성합니다.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | 서명을 생성할 때 사용할 해시 알고리즘. |

### ReturnValue

바이트 배열 형태로 계산된 서명.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
