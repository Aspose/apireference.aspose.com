---
title: "System::Security::Cryptography::DSACryptoServiceProvider 클래스"
linktitle: "DSACryptoServiceProvider"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::DSACryptoServiceProvider 클래스. CSP 형태의 DSA 알고리즘. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | 지정된 데이터에 대한 [DSA](../dsa/) 서명을 생성합니다. |
| [Dispose](./dispose/)() override | 객체와 연결된 데이터를 해제합니다. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | 생성자. 기본 매개변수를 사용합니다. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | 생성자. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | 생성자. 구현되지 않음. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | 생성자. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | 생성자. 구현되지 않음. |
| [ExportCspBlob](./exportcspblob/)(bool) override | 키에 대한 정보를 포함하는 블롭을 내보냅니다. 구현되지 않음. |
| [ExportParameters](./exportparameters/)(bool) override | CSP 매개변수를 내보냅니다. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | [CspKeyContainerInfo](../cspkeycontainerinfo/) 객체를 가져옵니다. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | 객체와 연결된 키 교환 알고리즘을 확인합니다. |
| [get_KeySize](./get_keysize/)() override | 키 크기를 가져옵니다. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | 키가 CSP 객체에 영구 저장되어 있는지 확인합니다. |
| [get_PublicOnly](./get_publiconly/)() const | CSP 객체에 공개 키만 존재하는지 확인합니다. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | 사용할 서명 알고리즘을 가져옵니다. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | 키가 사용자 저장소가 아닌 시스템 저장소에 영구 저장되는지 확인합니다. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | 키에 대한 정보를 포함하는 블롭을 가져옵니다. 구현되지 않음. |
| [ImportParameters](./importparameters/)(DSAParameters) override | 데이터 구조에서 모든 매개변수를 가져옵니다. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | 키가 CSP 객체에 영구 저장되는지 정의합니다. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | 키가 사용자 저장소가 아닌 시스템 저장소에 영구 저장되는지 정의합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | 지정된 입력 값의 서명을 계산합니다. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | 지정된 입력 값의 서명을 계산합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | 지정된 입력 값의 서명을 계산합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI 정보. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI 정보. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI 정보. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | 지정된 입력 값의 서명을 계산합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | 데이터 서명을 검사합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 바이너리 스트림의 서명이 유효한지 확인합니다. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | 데이터 서명을 검사합니다. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | 지정된 데이터에 대한 [DSA](../dsa/) 서명을 확인합니다. |
## 또 보기

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
