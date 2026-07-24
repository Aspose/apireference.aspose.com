---
title: "System::Xml::XmlDocument::CreateDocumentType 메서드"
linktitle: "CreateDocumentType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::CreateDocumentType 메서드. C++에서 새로운 XmlDocumentType 객체를 반환합니다."
type: docs
weight: 700
url: /ko/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


새로운 [XmlDocumentType](../../xmldocumenttype/) 객체를 반환합니다.

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | 문서 유형의 이름. |
| publicId | const String\& | 문서 유형의 공개 식별자 또는 **nullptr** 입니다. 공개 URI와 시스템 식별자를 지정하여 외부 DTD 하위 집합의 위치를 식별할 수 있습니다. |
| systemId | const String\& | 문서 유형의 시스템 식별자 또는 **nullptr** 입니다. 외부 DTD 하위 집합의 파일 위치 URL을 지정합니다. |
| internalSubset | const String\& | 문서 유형의 DTD 내부 하위 집합 또는 **nullptr** 입니다. |

### ReturnValue

새로운 [XmlDocumentType](../../xmldocumenttype/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
