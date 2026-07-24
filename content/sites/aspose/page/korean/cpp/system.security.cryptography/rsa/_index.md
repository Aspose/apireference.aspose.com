---
title: "System::Security::Cryptography::RSA 클래스"
linktitle: "RSA"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSA 클래스. RSA 알고리즘 구현을 위한 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 3400
url: /ko/cpp/system.security.cryptography/rsa/
---
## RSA class


[RSA](./) 알고리즘 구현을 위한 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)() | 기본 [RSA](./) 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const String\&) | 기본 [RSA](./) 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(int32_t) | 지정된 키 크기로 기본 [RSA](./) 알고리즘 구현을 생성합니다. |
| static [Create](./create/)(const RSAParameters\&) | 지정된 매개변수로 기본 [RSA](./) 알고리즘 구현을 생성합니다. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | 지정된 XML 인코딩 매개변수를 사용하여 기본 [RSA](./) 알고리즘 구현을 생성합니다. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | 지정된 패딩 모드를 사용하여 입력 데이터를 복호화합니다. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | 개인 키를 사용하여 값을 복호화합니다. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | 지정된 패딩 모드를 사용하여 입력 데이터를 암호화합니다. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | 개인 키를 사용하여 값을 암호화합니다. |
| virtual [ExportParameters](./exportparameters/)(bool) | 모든 매개변수를 내보냅니다. |
| [FromXmlString](./fromxmlstring/)(String) override | XML 인코딩 매개변수를 사용하여 객체를 초기화합니다. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI 정보. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP 객체와 연결된 서명 알고리즘을 가져옵니다. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | 데이터 구조에서 모든 매개변수를 가져옵니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 지정된 해시 알고리즘과 패딩을 사용하여 지정된 데이터 배열의 해시 값을 계산하고 결과에 서명합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 지정된 해시 알고리즘과 패딩을 사용하여 지정된 데이터 배열의 해시 값을 계산하고 결과에 서명합니다. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 지정된 해시 알고리즘과 패딩을 사용하여 지정된 바이너리 스트림의 해시 값을 계산하고 결과에 서명합니다. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | 지정된 해시 값에 대한 서명을 계산합니다. |
| [ToXmlString](./toxmlstring/)(bool) override | XML 형식으로 모든 매개변수를 내보냅니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | 지정된 바이너리 스트림의 서명이 유효한지 확인합니다. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | 지정된 해시의 서명이 유효한지 확인합니다. |
## 또 보기

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
