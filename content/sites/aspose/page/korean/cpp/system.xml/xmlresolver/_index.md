---
title: "System::Xml::XmlResolver 클래스"
linktitle: "XmlResolver"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlResolver 클래스. C++에서 Uniform Resource Identifier (URI) 로 명명된 외부 XML 리소스를 해결합니다."
type: docs
weight: 3500
url: /ko/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Uniform Resource Identifier(URI)로 명명된 외부 XML 리소스를 해결합니다.

```cpp
class XmlResolver : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | 파생 클래스에서 재정의될 때, URI를 실제 리소스를 포함하는 객체에 매핑합니다. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | 파생 클래스에서 재정의될 때, 기본 URI와 상대 URI로부터 절대 URI를 해결합니다. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | 파생 클래스에서 재정의될 때, 웹 요청을 인증하는 데 사용되는 자격 증명을 설정합니다. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | 해결기가 Stream이 아닌 다른 유형을 반환하도록 허용합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
