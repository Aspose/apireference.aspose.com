---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement 메서드"
linktitle: "ValidateEndElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement 메서드. 요소의 텍스트 내용이 단순 내용 요소의 경우 데이터 유형에 따라 유효한지 확인하고, 복합 내용 요소의 경우 현재 요소의 내용이 완전한지 확인합니다 (C++)."
type: docs
weight: 1800
url: /ko/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


단순 내용 요소의 경우 요소 텍스트 내용이 데이터 유형에 따라 유효한지 확인하고, 복합 내용 요소의 경우 현재 요소의 내용이 완전한지 확인합니다.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 요소가 성공적으로 검증될 때 속성이 설정되는 [XmlSchemaInfo](../../xmlschemainfo/) 객체입니다. 이 매개변수는 **nullptr** 일 수 있습니다. |

### ReturnValue

요소에 단순 내용이 있는 경우 구문 분석된 형식화된 텍스트 값입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


지정된 요소의 텍스트 내용이 데이터 유형에 따라 유효한지 확인합니다.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 텍스트 내용이 성공적으로 검증될 때 속성이 설정되는 [XmlSchemaInfo](../../xmlschemainfo/) 객체입니다. 이 매개변수는 **nullptr** 일 수 있습니다. |
| typedValue | const SharedPtr\<Object\>\& | 요소의 형식화된 텍스트 내용입니다. |

### ReturnValue

요소의 구문 분석된 형식화된 단순 내용입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
