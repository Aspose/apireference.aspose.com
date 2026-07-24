---
title: "System::Security::Cryptography::ECDsa class"
linktitle: "ECDsa"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ECDsa 클래스. ECDsa 알고리즘 구현을 위한 기본 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하세요 (C++)."
type: docs
weight: 1300
url: /ko/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


ECDsa 알고리즘 구현을 위한 기본 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하세요.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)() | 기본 ECDSA 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const ECCurve\&) | 지정된 곡선 위에 새로 생성된 키를 사용하여 기본 ECDSA 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const ECParameters\&) | 지정된 매개변수를 사용하여 기본 ECDSA 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const String\&) | 지정된 ECDSA 알고리즘 구현을 생성합니다. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | 명시적 매개변수를 내보냅니다. |
| virtual [ExportParameters](./exportparameters/)(bool) | 명명된 매개변수 또는 명시적 매개변수를 내보냅니다. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | 지정된 곡선에 대한 새로운 공개/비공개 키 쌍을 생성합니다. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI 정보. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 사용할 서명 알고리즘을 가져옵니다. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | 데이터 구조에서 모든 매개변수를 가져옵니다. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산하고, 결과에 서명합니다. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | 지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산하고, 결과에 서명합니다. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | 지정된 해시 알고리즘을 사용하여 지정된 바이너리 스트림의 해시 값을 계산하고, 결과에 서명합니다. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | 지정된 입력 값의 서명을 계산합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 바이너리 스트림의 서명이 유효한지 확인합니다. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | 데이터 서명을 검사합니다. |
## 또 보기

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
