---
title: "System::Security::Cryptography::ECDsaBotan 클래스"
linktitle: "ECDsaBotan"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ECDsaBotan 클래스. Botan 형태의 ECDsa 알고리즘. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1400
url: /ko/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | 생성자. 기본 매개변수를 사용합니다. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | 생성자. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | 생성자. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | 생성자. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | 생성자. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | 생성자. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | 명시적 매개변수를 내보냅니다. |
| [ExportParameters](./exportparameters/)(bool) override | 명명된 매개변수 또는 명시적 매개변수를 내보냅니다. |
| [FromXmlString](./fromxmlstring/)(String) override | XML 인코딩된 매개변수를 사용하여 객체를 초기화합니다. 구현되지 않음. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | XML 인코딩된 매개변수를 사용하여 객체를 초기화합니다. 구현되지 않음. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | 지정된 곡선에 대한 새로운 공개/비공개 키 쌍을 생성합니다. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | 해시 알고리즘을 가져옵니다. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | 지정된 해시 알고리즘을 사용하여 지정된 데이터 배열의 해시 값을 계산합니다. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | 지정된 해시 알고리즘을 사용하여 지정된 바이너리 스트림의 해시 값을 계산합니다. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | 데이터 구조에서 모든 매개변수를 가져옵니다. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | 해시 알고리즘을 설정합니다. |
| [set_KeySize](./set_keysize/)(int32_t) override | 키 크기를 설정합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | 지정된 데이터 배열의 해시 값을 계산하고, 결과에 서명합니다. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | 지정된 데이터 배열의 해시 값을 계산하고, 결과에 서명합니다. |
| [SignData](./signdata/)(const StreamPtr\&) | 지정된 바이너리 스트림의 해시 값을 계산하고, 결과에 서명합니다. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI 정보. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI 정보. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI 정보. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | 지정된 입력 값의 서명을 계산합니다. |
| [ToXmlString](./toxmlstring/)(bool) override | 모든 매개변수를 XML 형식으로 내보냅니다. 구현되지 않음. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | XML 형식으로 모든 매개변수를 내보냅니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | 지정된 바이너리 스트림의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 데이터의 서명이 유효한지 확인합니다. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | 지정된 바이너리 스트림의 서명이 유효한지 확인합니다. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | 데이터 서명을 검사합니다. |
## 또 보기

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
