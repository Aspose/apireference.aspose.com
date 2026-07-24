---
title: "System::Security::Cryptography::RSACryptoServiceProvider 클래스"
linktitle: "RSACryptoServiceProvider"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSACryptoServiceProvider 클래스. CSP 형태의 RSA 알고리즘입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3500
url: /ko/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | 메시지를 복호화합니다. 구현되지 않음. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | 지정된 패딩 모드를 사용하여 입력 데이터를 복호화합니다. |
| [Dispose](./dispose/)() override | 객체와 연결된 데이터를 해제합니다. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | 메시지를 암호화합니다. 구현되지 않음. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | 지정된 패딩 모드를 사용하여 입력 데이터를 암호화합니다. |
| [ExportCspBlob](./exportcspblob/)(bool) override | 키에 대한 정보를 포함하는 블롭을 내보냅니다. 구현되지 않음. |
| [ExportParameters](./exportparameters/)(bool) override | CSP 매개변수를 내보냅니다. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | [CspKeyContainerInfo](../cspkeycontainerinfo/) 객체를 가져옵니다. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | 객체와 연결된 키 교환 알고리즘을 확인합니다. |
| [get_KeySize](./get_keysize/)() override | 알고리즘에서 사용되는 키 크기를 가져옵니다. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | 키가 CSP 객체에 영구 저장되어 있는지 확인합니다. |
| [get_PublicOnly](./get_publiconly/)() const | CSP 객체에 공개 키만 존재하는지 확인합니다. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP 객체와 연결된 서명 알고리즘을 가져옵니다. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | 키가 사용자 저장소가 아닌 시스템 저장소에 영구 저장되는지 확인합니다. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | 키에 대한 정보를 포함하는 블롭을 가져옵니다. 구현되지 않음. |
| [ImportParameters](./importparameters/)(RSAParameters) override | CSP 매개변수를 가져옵니다. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI 정보. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | 생성자. 구현되지 않음. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | 생성자. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | 생성자. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | 생성자. 구현되지 않음. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | 키가 CSP 객체에 영구 저장되는지 정의합니다. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | 키가 사용자 저장소가 아닌 시스템 저장소에 영구 저장되는지 정의합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | 지정된 입력 값의 서명을 계산합니다. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | 지정된 입력 값의 서명을 계산합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | 지정된 입력 값의 서명을 계산합니다. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | 지정된 해시 값에 대한 서명을 계산합니다. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | 지정된 입력 값의 서명을 계산합니다. 구현되지 않음. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | 데이터 서명을 검사합니다. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | 데이터 서명을 검사합니다. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | 지정된 해시의 서명이 유효한지 확인합니다. |
## 또 보기

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
