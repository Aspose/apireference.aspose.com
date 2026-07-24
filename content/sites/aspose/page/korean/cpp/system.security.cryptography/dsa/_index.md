---
title: "System::Security::Cryptography::DSA 클래스"
linktitle: "DSA"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::DSA 클래스. DSA 알고리즘 구현을 위한 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system.security.cryptography/dsa/
---
## DSA class


[DSA](./) 알고리즘 구현을 위한 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)() | 기본 [DSA](./) 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const String\&) | 기본 [DSA](./) 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(int32_t) | 지정된 키 크기로 기본 [DSA](./) 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const DSAParameters\&) | 지정된 매개변수로 기본 [DSA](./) 알고리즘 구현을 생성합니다. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | 지정된 XML 인코딩 매개변수를 사용하여 기본 [DSA](./) 알고리즘 구현을 생성합니다. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | RTTI 정보. |
| virtual [ExportParameters](./exportparameters/)(bool) | 모든 매개변수를 내보냅니다. |
| [FromXmlString](./fromxmlstring/)(String) override | XML 인코딩 매개변수를 사용하여 객체를 초기화합니다. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | 데이터 구조에서 모든 매개변수를 가져옵니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산하고, 결과에 서명합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | 지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산하고, 결과에 서명합니다. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | 지정된 해시 알고리즘을 사용하여 지정된 바이너리 스트림의 해시 값을 계산하고, 결과에 서명합니다. |
| [ToXmlString](./toxmlstring/)(bool) override | XML 형식으로 모든 매개변수를 내보냅니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 바이너리 스트림의 서명이 유효한지 확인합니다. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | 지정된 데이터에 대한 [DSA](./) 서명을 확인합니다. |
## 또 보기

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
