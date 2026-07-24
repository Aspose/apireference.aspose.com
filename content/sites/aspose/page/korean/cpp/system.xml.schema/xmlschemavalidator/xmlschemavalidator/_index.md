---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator 생성자"
linktitle: "XmlSchemaValidator"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator 생성자. C++에서 XmlSchemaValidator 클래스를 새 인스턴스로 초기화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


새 인스턴스로 [XmlSchemaValidator](../) 클래스를 초기화합니다.

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../../system.xml/xmlnametable/) 객체는 요소 및 속성 이름을 원자화된 문자열로 포함합니다. |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | [XmlSchemaSet](../../xmlschemaset/) 객체는 검증에 사용되는 XML [Schema](../../) 정의 언어 (XSD) 스키마를 포함합니다. |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체는 검증 중에 발생하는 네임스페이스를 해결하는 데 사용됩니다. |
| validationFlags | XmlSchemaValidationFlags | [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) 값은 스키마 검증 옵션을 지정합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
