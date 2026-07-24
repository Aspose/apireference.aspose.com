---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity 메서드"
linktitle: "GetEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity 메서드. C++에서 실제 리소스를 포함하는 객체에 URI를 매핑합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


URI를 실제 리소스를 포함하는 객체에 매핑합니다.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/) 호출에서 반환된 URI. |
| 역할 | String | 현재 사용되지 않습니다. |
| ofObjectToReturn | const TypeInfo\& | 반환할 객체의 유형입니다. [XmlPreloadedResolver](../)은 [String](../../../system/string/)으로 추가된 URI에 대해 Stream 객체와 TextReader 객체를 지원합니다. 요청된 유형이 해결자에서 지원되지 않으면 예외가 발생합니다. 이 해결자가 특정 **Type**을 지원하는지 확인하려면 XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) 메서드를 사용하십시오. |

### ReturnValue

실제 소스에 해당하는 Stream 또는 TextReader 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
