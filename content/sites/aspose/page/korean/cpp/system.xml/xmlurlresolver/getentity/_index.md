---
title: "System::Xml::XmlUrlResolver::GetEntity 메서드"
linktitle: "GetEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlUrlResolver::GetEntity 메서드. C++에서 실제 리소스를 포함하는 객체에 URI를 매핑합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


URI를 실제 리소스를 포함하는 객체에 매핑합니다.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/) 호출에서 반환된 URI. |
| 역할 | String | 현재 사용되지 않습니다. |
| ofObjectToReturn | const TypeInfo\& | 반환할 객체의 유형입니다. 현재 구현은 Stream 객체만 반환합니다. |

### ReturnValue

스트림 객체 또는 스트림이 아닌 유형이 지정된 경우 **nullptr**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
