---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor 메서드"
linktitle: "CreateEncryptor"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor 메서드. C++에서 알고리즘 객체와 연결된 매개변수로 암호화기를 생성합니다."
type: docs
weight: 200
url: /ko/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


알고리즘 객체와 연결된 매개변수로 암호화기를 생성합니다.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

새로 생성된 암호화 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


명시적인 매개변수로 암호화기를 생성합니다.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 사용할 키. |
| rgbIV | System::ArrayPtr\<uint8_t\> | 사용할 초기값. |

### ReturnValue

새로 생성된 암호화 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
