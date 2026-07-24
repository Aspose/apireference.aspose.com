---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement 메서드"
linktitle: "ValidateElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement 메서드. 현재 컨텍스트에서 요소를 검증합니다 (C++)."
type: docs
weight: 1700
url: /ko/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


현재 컨텍스트에서 요소를 검증합니다.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 검증할 요소의 로컬 이름. |
| namespaceUri | const String\& | 검증할 요소의 네임스페이스 URI. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 요소 이름 검증이 성공하면 속성이 설정되는 [XmlSchemaInfo](../../xmlschemainfo/) 객체입니다. 이 매개변수는 **nullptr**일 수 있습니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


지정된 **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**, **xsi:NoNamespaceSchemaLocation** 속성 값을 사용하여 현재 컨텍스트에서 요소를 검증합니다.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 검증할 요소의 로컬 이름. |
| namespaceUri | const String\& | 검증할 요소의 네임스페이스 URI. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 요소 이름 검증이 성공하면 속성이 설정되는 [XmlSchemaInfo](../../xmlschemainfo/) 객체입니다. 이 매개변수는 **nullptr**일 수 있습니다. |
| xsiType | const String\& | 요소의 **xsi:Type** 속성 값입니다. 이 매개변수는 **nullptr**일 수 있습니다. |
| xsiNil | const String\& | 요소의 **xsi:Nil** 속성 값입니다. 이 매개변수는 **nullptr**일 수 있습니다. |
| xsiSchemaLocation | const String\& | 요소의 **xsi:SchemaLocation** 속성 값입니다. 이 매개변수는 **nullptr**일 수 있습니다. |
| xsiNoNamespaceSchemaLocation | const String\& | 요소의 **xsi:NoNamespaceSchemaLocation** 속성 값입니다. 이 매개변수는 **nullptr**일 수 있습니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
