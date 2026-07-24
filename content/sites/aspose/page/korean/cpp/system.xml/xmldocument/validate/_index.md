---
title: "System::Xml::XmlDocument::Validate 메서드"
linktitle: "검증"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::Validate 메서드. C++에서 XmlDocument::get_Schemas 목록에 포함된 XML 스키마 정의 언어 (XSD) 스키마에 대해 XmlDocument를 검증합니다."
type: docs
weight: 4300
url: /ko/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


[XmlDocument](../)을(를) XML [Schema](../../../system.xml.schema/) 정의 언어 (XSD) 스키마에 대해, [XmlDocument::get_Schemas](../get_schemas/) 목록에 포함된 스키마와 비교하여 검증합니다.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | 스키마 검증 경고 및 오류에 대한 정보를 받는 [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) 객체. |

## 또 보기

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


지정된 [XmlNode](../../xmlnode/) 객체를 XML [Schema](../../../system.xml.schema/) 정의 언어 (XSD) 스키마에 대해, [XmlDocument::get_Schemas](../get_schemas/) 목록에 있는 스키마와 비교하여 검증합니다.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | 스키마 검증 경고 및 오류에 대한 정보를 받는 [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) 객체. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | 검증을 위해 [XmlDocument](../)에서 생성된 [XmlNode](../../xmlnode/) 객체. |

## 또 보기

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
