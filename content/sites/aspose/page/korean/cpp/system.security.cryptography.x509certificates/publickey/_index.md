---
title: "System::Security::Cryptography::X509Certificates::PublicKey 클래스"
linktitle: "PublicKey"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::PublicKey 클래스. X509 인증서의 공개 키 정보를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


X509 인증서의 공개 키 정보를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class PublicKey : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | ASN.1 인코딩된 공개 키 값을 가져옵니다. |
| [get_EncodedParameters](./get_encodedparameters/)() const | ASN.1 인코딩된 공개 키 매개변수를 가져옵니다. |
| [get_Key](./get_key/)() const | [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) 또는 [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/)를 가져옵니다. |
| [get_Oid](./get_oid/)() const | 공개 키의 식별자(OID)를 가져옵니다. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | 생성자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
