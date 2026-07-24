---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes 메서드"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes 메서드. C++에서 요소 컨텍스트 내 XmlSchemaValidator::ValidateAttribute 메서드를 사용해 이전에 검증되지 않은 기본값을 가진 속성에 대해 기본 속성의 식별 제약을 검증하고, 지정된 List에 XmlSchemaAttribute 객체를 채웁니다."
type: docs
weight: 900
url: /ko/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


기본 속성에 대한 식별 제약을 검증하고, 요소 컨텍스트에서 [XmlSchemaValidator::ValidateAttribute](../validateattribute/) 메서드를 사용해 이전에 검증되지 않은 기본값을 가진 속성에 대해 지정된 List에 [XmlSchemaAttribute](../../xmlschemaattribute/) 객체를 채웁니다.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | 요소 컨텍스트에서 검증 중 아직 만나지 않은 속성에 대해 [XmlSchemaAttribute](../../xmlschemaattribute/) 객체를 채울 List. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
