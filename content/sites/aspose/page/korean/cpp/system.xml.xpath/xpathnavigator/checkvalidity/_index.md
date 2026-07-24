---
title: "System::Xml::XPath::XPathNavigator::CheckValidity 메서드"
linktitle: "CheckValidity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::CheckValidity 메서드. XPathNavigator에 있는 XML 데이터가 C++에서 제공된 XML 스키마 정의 언어(XSD) 스키마에 부합하는지 확인합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


XML 데이터가 [XPathNavigator](../)에 있어 제공된 XML [Schema](../../../system.xml.schema/) 정의 언어(XSD) 스키마에 부합하는지 확인합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | [XPathNavigator](../)에 포함된 XML 데이터를 검증하는 데 사용되는 스키마를 포함하는 XmlSchemaSet입니다. |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | 스키마 검증 경고 및 오류에 대한 정보를 수신하는 ValidationEventHandler입니다. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
