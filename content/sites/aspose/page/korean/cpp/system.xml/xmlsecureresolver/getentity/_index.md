---
title: "System::Xml::XmlSecureResolver::GetEntity 메서드"
linktitle: "GetEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlSecureResolver::GetEntity 메서드. C++에서 URI를 실제 리소스를 포함하는 객체에 매핑합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


URI를 실제 리소스를 포함하는 객체에 매핑합니다.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 다음 호출에서 반환되는 URI: [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) |
| 역할 | String | 현재 사용되지 않습니다. |
| ofObjectToReturn | const TypeInfo\& | 반환할 객체 유형입니다. 현재 버전은 Stream 객체만 반환합니다. |

### ReturnValue

기본 [XmlResolver](../../xmlresolver/)에서 **GetEntity**를 호출하여 반환된 스트림입니다. Stream이 아닌 다른 유형이 지정된 경우, 메서드는 **nullptr**를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
