---
title: "System::Xml::Schema::XmlSchemaInference::InferSchema method"
linktitle: "InferSchema"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaInference::InferSchema method. C++에서 지정된 XmlReader 객체에 포함된 XML 문서로부터 XML 스키마 정의 언어 (XSD) 스키마를 추론합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.schema/xmlschemainference/inferschema/
---
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&) method


지정된 [XmlReader](../../../system.xml/xmlreader/) 객체에 포함된 XML 문서로부터 XML [Schema](../../) 정의 언어 (XSD) 스키마를 추론합니다.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | 스키마를 추론하기 위한 XML 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/) 객체입니다. |

### ReturnValue

추론된 스키마를 포함하는 [XmlSchemaSet](../../xmlschemaset/) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaInference::InferSchema(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) method


지정된 [XmlReader](../../../system.xml/xmlreader/) 객체에 포함된 XML 문서로부터 XML [Schema](../../) 정의 언어 (XSD) 스키마를 추론하고, 동일한 대상 네임스페이스를 가진 [XmlSchemaSet](../../xmlschemaset/) 객체에 있는 기존 스키마를 사용하여 추론된 스키마를 정제합니다.

```cpp
SharedPtr<XmlSchemaSet> System::Xml::Schema::XmlSchemaInference::InferSchema(const SharedPtr<XmlReader> &instanceDocument, SharedPtr<XmlSchemaSet> schemas)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| instanceDocument | const SharedPtr\<XmlReader\>\& | 스키마를 추론하기 위한 XML 문서를 포함하는 [XmlReader](../../../system.xml/xmlreader/) 객체입니다. |
| schemas | SharedPtr\<XmlSchemaSet\> | 추론된 스키마를 정제하는 데 사용되는 기존 스키마를 포함하는 [XmlSchemaSet](../../xmlschemaset/) 객체입니다. |

### ReturnValue

추론된 스키마를 포함하는 [XmlSchemaSet](../../xmlschemaset/) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaInference](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
