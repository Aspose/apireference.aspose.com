---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute 메서드"
linktitle: "ValidateAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute 메서드. 현재 요소 컨텍스트에서 속성 이름, 네임스페이스 URI 및 값을 검증합니다 (C++)."
type: docs
weight: 1600
url: /ko/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


현재 요소 컨텍스트에서 속성 이름, 네임스페이스 URI 및 값을 검증합니다.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 검증할 속성의 로컬 이름. |
| namespaceUri | const String\& | 검증할 속성의 네임스페이스 URI. |
| attributeValue | const String\& | 검증할 속성의 값. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | [XmlSchemaInfo](../../xmlschemainfo/) 객체는 속성 검증이 성공적으로 수행될 때 속성이 설정됩니다. 이 매개변수는 **nullptr**일 수 있습니다. |

### ReturnValue

검증된 속성의 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


현재 요소 컨텍스트에서 속성 이름, 네임스페이스 URI 및 값을 검증합니다.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | const String\& | 검증할 속성의 로컬 이름. |
| namespaceUri | const String\& | 검증할 속성의 네임스페이스 URI. |
| attributeValue | XmlValueGetter | [XmlValueGetter](../../xmlvaluegetter/) 콜백은 속성의 값을 XML [Schema](../../) 정의 언어 (XSD) 타입과 호환되는 유형으로 전달하는 데 사용됩니다. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | [XmlSchemaInfo](../../xmlschemainfo/) 객체는 속성 검증이 성공적으로 수행될 때 속성이 설정됩니다. 이 매개변수는 **nullptr**일 수도 있습니다. |

### ReturnValue

검증된 속성의 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
