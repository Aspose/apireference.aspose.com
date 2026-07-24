---
title: "System::Xml::XmlResolver::GetEntity 메서드"
linktitle: "GetEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlResolver::GetEntity 메서드. 파생 클래스에서 재정의될 경우, URI를 실제 리소스를 포함하는 객체에 매핑합니다(C++)."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


파생 클래스에서 재정의될 때, URI를 실제 리소스를 포함하는 객체에 매핑합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/) 호출에서 반환된 URI입니다. |
| 역할 | String | 현재 사용되지 않습니다. |
| ofObjectToReturn | const TypeInfo\& | 반환할 객체 유형입니다. 현재 버전은 Stream 객체만 반환합니다. |

### ReturnValue

스트림 객체 또는 스트림이 아닌 유형이 지정된 경우 **nullptr**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
