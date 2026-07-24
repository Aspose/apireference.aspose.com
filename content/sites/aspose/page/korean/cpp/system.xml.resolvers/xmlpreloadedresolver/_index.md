---
title: "System::Xml::Resolvers::XmlPreloadedResolver 클래스"
linktitle: "XmlPreloadedResolver"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver 클래스. C++에서 DTD 또는 XML 스트림으로 캐시를 미리 채우는 데 사용되는 클래스를 나타냅니다."
type: docs
weight: 100
url: /ko/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


DTD 또는 XML 스트림으로 캐시를 미리 채우는 데 사용되는 클래스를 나타냅니다.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | 바이트 배열을 [XmlPreloadedResolver](./) 저장소에 추가하고 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 바이트 배열을 [XmlPreloadedResolver](./) 저장소에 추가하고 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | 스트림을 [XmlPreloadedResolver](./) 저장소에 추가하고 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | 미리 로드된 데이터를 포함하는 문자열을 [XmlPreloadedResolver](./) 저장소에 추가하고 URI에 매핑합니다. 동일한 URI에 대한 매핑이 이미 저장소에 존재하면 기존 매핑이 덮어쓰기됩니다. |
| [get_PreloadedUris](./get_preloadeduris/)() | 미리 로드된 URI 컬렉션을 반환합니다. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | URI를 실제 리소스를 포함하는 객체에 매핑합니다. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | URI에 해당하는 데이터를 [XmlPreloadedResolver](./)에서 제거합니다. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | 기본 URI와 상대 URI에서 절대 URI를 해결합니다. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | 기본 [Net::WebRequest](../../system.net/webrequest/)를 인증하는 데 사용되는 자격 증명을 설정합니다. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | 해당 리졸버가 스트림 외에 다른 유형을 지원하는지 여부를 결정합니다. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | [XmlPreloadedResolver](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | [XmlPreloadedResolver](./) 클래스의 새 인스턴스를 지정된 사전 로드된 알려진 DTD와 함께 초기화합니다. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | [XmlPreloadedResolver](./) 클래스의 새 인스턴스를 지정된 대체 해결자와 함께 초기화합니다. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | [XmlPreloadedResolver](./) 클래스의 새 인스턴스를 지정된 대체 해결자와 사전 로드된 알려진 DTD와 함께 초기화합니다. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | [XmlPreloadedResolver](./) 클래스의 새 인스턴스를 지정된 대체 해결자, 사전 로드된 알려진 DTD 및 URI 동등성 비교기와 함께 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
