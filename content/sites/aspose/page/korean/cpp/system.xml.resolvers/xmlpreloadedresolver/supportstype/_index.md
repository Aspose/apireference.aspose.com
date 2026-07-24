---
title: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType 메서드"
linktitle: "SupportsType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::SupportsType 메서드. C++에서 해결자가 Stream 외의 다른 Types를 지원하는지 여부를 결정합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml.resolvers/xmlpreloadedresolver/supportstype/
---
## XmlPreloadedResolver::SupportsType method


해당 리졸버가 스트림 외에 다른 유형을 지원하는지 여부를 결정합니다.

```cpp
bool System::Xml::Resolvers::XmlPreloadedResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | 확인할 절대 URI. |
| 유형 | const TypeInfo\& | 반환할 Type. |

### ReturnValue

**true** if the Type is supported; otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
