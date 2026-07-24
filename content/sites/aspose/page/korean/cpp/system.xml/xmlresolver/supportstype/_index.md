---
title: "System::Xml::XmlResolver::SupportsType 메서드"
linktitle: "SupportsType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlResolver::SupportsType 메서드. C++에서 리졸버가 Stream이 아닌 다른 유형을 반환하도록 합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml/xmlresolver/supportstype/
---
## XmlResolver::SupportsType method


해결기가 Stream이 아닌 다른 유형을 반환하도록 허용합니다.

```cpp
virtual bool System::Xml::XmlResolver::SupportsType(SharedPtr<Uri> absoluteUri, const TypeInfo &type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | URI입니다. |
| 유형 | const TypeInfo\& | 반환할 유형입니다. |

### ReturnValue

**true** if the **type** is supported; otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
