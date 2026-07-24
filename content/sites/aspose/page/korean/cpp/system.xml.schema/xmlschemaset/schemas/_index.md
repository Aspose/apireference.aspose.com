---
title: "System::Xml::Schema::XmlSchemaSet::Schemas 메서드"
linktitle: "Schemas"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Schemas 메서드. C++에서 XmlSchemaSet에 포함된 모든 XML 스키마 정의 언어 (XSD) 스키마의 컬렉션을 반환합니다."
type: docs
weight: 1600
url: /ko/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


XML [Schema](../../) 정의 언어 (XSD) 스키마를 모두 포함하는 컬렉션을 [XmlSchemaSet](../)에서 반환합니다.

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

[XmlSchemaSet](../)에 추가된 모든 스키마를 포함하는 IList 객체입니다. [XmlSchemaSet](../)에 스키마가 추가되지 않은 경우, 빈 컬렉션이 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


주어진 네임스페이스에 속하는 [XmlSchemaSet](../) 내의 모든 XML [Schema](../../) 정의 언어 (XSD) 스키마 컬렉션을 반환합니다.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| targetNamespace | String | 스키마 **targetNamespace** 속성입니다. |

### ReturnValue

주어진 네임스페이스에 속하는 [XmlSchemaSet](../)에 추가된 모든 스키마를 포함하는 IList 객체입니다. [XmlSchemaSet](../)에 스키마가 추가되지 않은 경우, 빈 컬렉션이 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
