---
title: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor 메서드"
linktitle: "CreateDecryptor"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor 메서드. C++에서 알고리즘 객체에 의해 정의된 매개변수로 복호화 객체를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.security.cryptography/rijndaelmanaged/createdecryptor/
---
## RijndaelManaged::CreateDecryptor() method


알고리즘 객체가 정의한 매개변수를 사용하여 복호화 객체를 생성합니다.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


명시적인 매개변수를 사용하여 복호화 객체를 생성합니다.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 바이트 배열 형태의 암호화 키. |
| rgbIV | System::ArrayPtr\<uint8_t\> | 바이트 배열 형태의 초기값. |

### ReturnValue

새로 생성된 복호화 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
