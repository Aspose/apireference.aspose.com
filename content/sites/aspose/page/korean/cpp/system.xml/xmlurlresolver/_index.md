---
title: "System::Xml::XmlUrlResolver 클래스"
linktitle: "XmlUrlResolver"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlUrlResolver 클래스. C++에서 Uniform Resource Identifier(URI)로 명명된 외부 XML 리소스를 해결합니다."
type: docs
weight: 4100
url: /ko/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Uniform Resource Identifier(URI)로 명명된 외부 XML 리소스를 해결합니다.

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | URI를 실제 리소스를 포함하는 객체에 매핑합니다. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | 기본 URI와 상대 URI에서 절대 URI를 해결합니다. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | 기본 WebRequest 객체의 캐시 정책을 설정합니다. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | 웹 요청을 인증하는 데 사용되는 자격 증명을 설정합니다. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | 기본 WebRequest 객체의 네트워크 프록시를 설정합니다. |
| [XmlUrlResolver](./xmlurlresolver/)() | [XmlUrlResolver](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
