---
title: "System::Xml::Schema::XmlSchemaSet::Add 메서드"
linktitle: "Add"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Add 메서드. C++에서 지정된 XmlSchema를 XmlSchemaSet에 추가합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


주어진 [XmlSchema](../../xmlschema/)을 [XmlSchemaSet](../)에 추가합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchemaSet](../)에 추가할 [XmlSchema](../../xmlschema/) 객체입니다. |

### ReturnValue

스키마가 유효한 경우 [XmlSchema](../../xmlschema/) 객체가 반환됩니다. 스키마가 유효하지 않고 [ValidationEventHandler](../../validationeventhandler/)가 지정된 경우 **nullptr**가 반환되고 적절한 검증 이벤트가 발생합니다. 그렇지 않으면 [XmlSchemaException](../../xmlschemaexception/)이 발생합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


주어진 [XmlSchemaSet](../)에 포함된 모든 XML [Schema](../../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](../)에 추가합니다.

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | [XmlSchemaSet](../) 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/)에 포함된 XML [Schema](../../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](../)에 추가합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| targetNamespace | String | 스키마의 **targetNamespace** 값이며, 스키마에 지정된 **targetNamespace**를 사용하려면 **nullptr**를 사용합니다. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) 객체입니다. |

### ReturnValue

스키마가 유효한 경우 [XmlSchema](../../xmlschema/) 객체가 반환됩니다. 스키마가 유효하지 않고 [ValidationEventHandler](../../validationeventhandler/)가 지정된 경우 **nullptr**가 반환되고 적절한 검증 이벤트가 발생합니다. 그렇지 않으면 [XmlSchemaException](../../xmlschemaexception/)이 발생합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


지정된 URL에 있는 XML [Schema](../../) 정의 언어 (XSD) 스키마를 [XmlSchemaSet](../)에 추가합니다.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| targetNamespace | String | 스키마의 **targetNamespace** 값이며, 스키마에 지정된 **targetNamespace**를 사용하려면 **nullptr**를 사용합니다. |
| schemaUri | const String\& | 로드할 스키마를 지정하는 URL입니다. |

### ReturnValue

스키마가 유효한 경우 [XmlSchema](../../xmlschema/) 객체가 반환됩니다. 스키마가 유효하지 않고 [ValidationEventHandler](../../validationeventhandler/)가 지정된 경우 **nullptr**가 반환되고 적절한 검증 이벤트가 발생합니다. 그렇지 않으면 [XmlSchemaException](../../xmlschemaexception/)이 발생합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
