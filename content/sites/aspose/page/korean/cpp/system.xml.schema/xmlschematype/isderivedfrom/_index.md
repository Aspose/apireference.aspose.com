---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom 메서드"
linktitle: "IsDerivedFrom"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom 메서드. 지정된 파생 스키마 타입이 C++에서 지정된 기본 스키마 타입으로부터 파생되었는지를 나타내는 값을 반환합니다."
type: docs
weight: 1700
url: /ko/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


지정된 파생 스키마 형식이 지정된 기본 스키마 형식으로부터 파생되었는지를 나타내는 값을 반환합니다.

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | 테스트할 파생 [XmlSchemaType](../)입니다. |
| baseType | const SharedPtr\<XmlSchemaType\>\& | 파생 [XmlSchemaType](../)을 테스트할 기준이 되는 기본 [XmlSchemaType](../)입니다. |
| except | XmlSchemaDerivationMethod | 테스트에서 제외할 타입 파생 방법을 나타내는 [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) 값 중 하나입니다. |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
