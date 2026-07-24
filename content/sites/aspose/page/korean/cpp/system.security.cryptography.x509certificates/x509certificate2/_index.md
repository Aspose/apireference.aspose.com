---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 클래스"
linktitle: "X509Certificate2"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 클래스. X509 인증서를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


X509 인증서를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Archived](./get_archived/)() const | 인증서가 보관되었는지를 나타내는 값을 가져옵니다. |
| [get_Extensions](./get_extensions/)() const | 인증서와 연결된 확장 객체 컬렉션을 가져옵니다. |
| [get_FriendlyName](./get_friendlyname/)() const | 인증서의 친숙한 이름을 가져옵니다. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | 인증서에 개인 키가 있는지 확인합니다. |
| [get_IssuerName](./get_issuername/)() const | 인증서를 발급한 당사자의 이름을 가져옵니다. |
| [get_NotAfter](./get_notafter/)() const | 인증서가 더 이상 유효하지 않은 현지 날짜와 시간을 가져옵니다. |
| [get_NotBefore](./get_notbefore/)() const | 인증서가 유효해지는 현지 날짜와 시간을 가져옵니다. |
| [get_PrivateKey](./get_privatekey/)() const | 인증서와 연결된 개인 키를 가져옵니다. |
| [get_PublicKey](./get_publickey/)() const | 인증서 [PublicKey](../publickey/) 객체를 가져옵니다. |
| [get_RawData](./get_rawdata/)() const | 인증서 원시 데이터를 가져옵니다. |
| [get_SerialNumber](./get_serialnumber/)() const | 인증서의 일련 번호를 가져옵니다. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | 인증서 서명을 생성하는 데 사용되는 알고리즘을 가져옵니다. |
| [get_SubjectName](./get_subjectname/)() const | 인증서에서 주체 이름을 가져옵니다. |
| [get_Thumbprint](./get_thumbprint/)() const | 인증서 지문을 가져옵니다. |
| [get_Version](./get_version/)() const | 인증서 형식 버전을 가져옵니다. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | 지정된 바이트 배열에 포함된 인증서 유형을 가져옵니다. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | 지정된 파일에 포함된 인증서 유형을 가져옵니다. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | 가져옵니다 [RSA](../../system.security.cryptography/rsa/) 개인 키;. |
| [GetDSAPublicKey](./getdsapublickey/)() const | 가져옵니다 [RSA](../../system.security.cryptography/rsa/) 공개 키. |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | 가져옵니다 [RSA](../../system.security.cryptography/rsa/) 개인 키;. |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | 가져옵니다 [RSA](../../system.security.cryptography/rsa/) 공개 키. |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | 인증서에서 주체 또는 발행자 이름을 가져옵니다. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | 가져옵니다 [RSA](../../system.security.cryptography/rsa/) 개인 키;. |
| [GetRSAPublicKey](./getrsapublickey/)() const | 가져옵니다 [RSA](../../system.security.cryptography/rsa/) 공개 키. |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | 지정된 인증서 파일에서 정보를 가져옵니다. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | 지정된 인증서 파일에서 정보를 가져옵니다. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | 지정된 인증서 데이터에서 정보를 가져옵니다. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | 지정된 인증서 데이터에서 정보를 가져옵니다. |
| [Import](./import/)(const String\&) override | 지정된 인증서 파일에서 정보를 가져옵니다. |
| [Import](./import/)(const ByteArrayPtr\&) override | 지정된 인증서 데이터에서 정보를 가져옵니다. |
| [Reset](./reset/)() override | 인증서 상태를 재설정합니다. |
| [set_Archived](./set_archived/)(bool) const | 인증서가 보관됨을 나타내는 값을 설정합니다. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | 인증서의 친숙한 이름을 설정합니다. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | 인증서와 연결된 개인 키를 설정하거나 지웁니다. |
| [ToString](./tostring/)(bool) const override | 인증서 정보를 텍스트 형식으로 반환합니다. |
| [ToString](./tostring/)() const override | 인증서 정보를 텍스트 형식으로 반환합니다. |
| [Verify](./verify/)() const | 인증서 체인을 검증합니다. |
| [X509Certificate2](./x509certificate2/)() | 빈 [X509Certificate2](./)을 생성합니다. |
| [X509Certificate2](./x509certificate2/)(const String\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 생성자. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | 생성자. |
## 또 보기

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
