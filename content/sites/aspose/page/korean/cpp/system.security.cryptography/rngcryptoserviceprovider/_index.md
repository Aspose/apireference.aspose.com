---
title: "System::Security::Cryptography::RNGCryptoServiceProvider 클래스"
linktitle: "RNGCryptoServiceProvider"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RNGCryptoServiceProvider 클래스. CSP 개념을 따르는 난수 생성기. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3300
url: /ko/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


CSP 개념을 따르는 난수 생성기. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | 기존 배열 요소를 랜덤 바이트로 채웁니다. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | 기존 배열 뷰 요소를 랜덤 바이트로 채웁니다. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | 기존 배열 요소를 랜덤 0이 아닌 바이트로 채웁니다. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | 기존 배열 뷰 요소를 랜덤 0이 아닌 바이트로 채웁니다. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | 생성자. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | 소멸자. |
## 또 보기

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
