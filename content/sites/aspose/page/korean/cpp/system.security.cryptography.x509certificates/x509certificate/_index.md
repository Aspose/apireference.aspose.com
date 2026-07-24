---
title: "System::Security::Cryptography::X509Certificates::X509Certificate 클래스"
linktitle: "X509Certificate"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Certificate 클래스. X.509 v.3 인증서. 암호화된 인증서는 지원되지 않습니다. 오직 X509KeyStorageFlags::DefaultKeySet 플래그만 지원됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3 인증서. 암호화된 인증서는 지원되지 않습니다. 오직 [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) 플래그만 지원됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | 지정된 PKCS7 파일에서 인증서를 생성합니다. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | 지정된 서명된 파일에서 인증서를 생성합니다. |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 두 인증서를 비교합니다. |
| virtual [Export](./export/)(X509ContentType) const | 현재 객체를 지정된 형식으로 바이트 배열에 내보냅니다. 구현되지 않음. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | 현재 객체를 지정된 형식으로 바이트 배열에 내보냅니다. 구현되지 않음. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | 현재 객체를 지정된 형식으로 바이트 배열에 내보냅니다. 구현되지 않음. |
| [get_Handle](./get_handle/)() const | Microsoft Cryptographic API 인증서 컨텍스트에 대한 핸들을 가져옵니다. |
| [get_Issuer](./get_issuer/)() const | X.509v3 인증서를 발급한 인증 기관의 이름을 가져옵니다. |
| [get_Subject](./get_subject/)() const | 인증서에서 주체 구별 이름을 가져옵니다. |
| virtual [GetCertHash](./getcerthash/)() const | 현재 객체의 해시를 바이트 배열로 가져옵니다. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | 현재 객체의 해시를 바이트 배열로 가져옵니다. |
| virtual [GetCertHashString](./getcerthashstring/)() const | 현재 객체의 [SHA1](../../system.security.cryptography/sha1/) 해시를 16진수 문자열로 가져옵니다. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | 현재 객체의 [SHA1](../../system.security.cryptography/sha1/) 해시를 16진수 문자열로 가져옵니다. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | 현재 인증서의 유효 시작 날짜를 가져옵니다. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | 현재 인증서의 만료 날짜를 가져옵니다. |
| virtual [GetFormat](./getformat/)() const | 인증서 형식의 이름을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 인증서 해시 코드를 가져옵니다. |
| virtual [GetIssuerName](./getissuername/)() const | 현재 인증서를 발급한 인증 기관의 이름을 가져옵니다. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | 현재 인증서의 키 정보를 문자열로 가져옵니다. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | 현재 인증서의 키 정보를 바이트 배열로 가져옵니다. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | 현재 인증서의 키 정보를 16진수 문자열로 가져옵니다. |
| virtual [GetName](./getname/)() const | 현재 인증서가 발급된 주체의 이름을 가져옵니다. |
| virtual [GetPublicKey](./getpublickey/)() const | 인증서에서 공개 키를 바이트 배열로 가져옵니다. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | 인증서에서 공개 키를 16진수 문자열로 가져옵니다. |
| virtual [GetRawCertData](./getrawcertdata/)() const | 인증서에서 원시 데이터를 바이트 배열로 가져옵니다. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | 인증서에서 원시 데이터를 16진수 문자열로 가져옵니다. |
| virtual [GetSerialNumber](./getserialnumber/)() const | 인증서에서 일련 번호를 바이트 배열로 가져옵니다. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | 인증서에서 일련 번호를 16진수 문자열로 가져옵니다. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 지정된 인증서 파일에서 정보를 가져옵니다. 구현되지 않음. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | 지정된 인증서 파일에서 정보를 가져옵니다. 구현되지 않음. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 지정된 인증서 데이터에서 정보를 가져옵니다. 구현되지 않음. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 지정된 인증서 데이터에서 정보를 가져옵니다. 구현되지 않음. |
| virtual [Import](./import/)(const String\&) | 지정된 인증서 파일에서 정보를 가져옵니다. 구현되지 않음. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | 지정된 인증서 데이터에서 정보를 가져옵니다. 구현되지 않음. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | 인증서 상태를 재설정합니다. |
| virtual [ToString](./tostring/)(bool) const | 인증서 정보를 텍스트 형식으로 반환합니다. |
| [ToString](./tostring/)() const override | 인증서 정보를 텍스트 형식으로 반환합니다. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | 생성자. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const String\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | 생성자. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | 생성자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 포인터 유형. |
## 또 보기

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
