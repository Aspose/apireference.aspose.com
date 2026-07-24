---
title: "System::Xml::XmlReader::get_SchemaInfo 메서드"
linktitle: "get_SchemaInfo"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::get_SchemaInfo 메서드. C++에서 스키마 검증 결과 현재 노드에 할당된 스키마 정보를 반환합니다."
type: docs
weight: 2200
url: /ko/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


스키마 검증 결과 현재 노드에 할당된 스키마 정보를 반환합니다.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

현재 노드에 대한 스키마 정보를 포함하는 IXmlSchemaInfo 객체입니다. [Schema](../../../system.xml.schema/) 정보는 요소, 속성 또는 null이 아닌 [XmlReader::get_ValueType](../get_valuetype/) 값을 가진 텍스트 노드에 설정할 수 있습니다. 현재 노드가 위의 노드 유형 중 하나가 아니거나 [XmlReader](../) 인스턴스가 스키마 정보를 보고하지 않으면 이 메서드는 **nullptr**을 반환합니다. 이 메서드가 [XmlTextReader](../../xmltextreader/) 또는 [XmlValidatingReader](../../xmlvalidatingreader/) 객체에서 호출되면 항상 **nullptr**을 반환합니다. 이러한 [XmlReader](../) 구현은 get_SchemaInfo 메서드를 통해 스키마 정보를 노출하지 않습니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
