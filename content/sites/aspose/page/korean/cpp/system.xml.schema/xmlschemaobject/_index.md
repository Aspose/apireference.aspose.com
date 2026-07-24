---
title: "System::Xml::Schema::XmlSchemaObject 클래스"
linktitle: "XmlSchemaObject"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObject 클래스. Xml 스키마 객체 모델 계층 구조의 루트 클래스를 나타내며, C++에서 XmlSchema 클래스와 같은 클래스들의 기본 클래스로 사용됩니다."
type: docs
weight: 5000
url: /ko/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


[Xml](../../system.xml/) 스키마 객체 모델 계층 구조의 루트 클래스를 나타내며, [XmlSchema](../xmlschema/) 클래스와 같은 클래스들의 기본 클래스로 사용됩니다.

```cpp
class XmlSchemaObject : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | **schema** 요소가 참조하는 파일의 행 번호를 반환합니다. |
| [get_LinePosition](./get_lineposition/)() | **schema** 요소가 참조하는 파일의 열 위치를 반환합니다. |
| [get_Namespaces](./get_namespaces/)() | 이 스키마 객체와 함께 사용할 XmlSerializerNamespaces를 반환합니다. |
| [get_Parent](./get_parent/)() | 이 [XmlSchemaObject](./)의 부모를 반환합니다. |
| [get_SourceUri](./get_sourceuri/)() | 스키마를 로드한 파일의 소스 위치를 반환합니다. |
| [set_LineNumber](./set_linenumber/)(int32_t) | **schema** 요소가 참조하는 파일의 행 번호를 설정합니다. |
| [set_LinePosition](./set_lineposition/)(int32_t) | **schema** 요소가 참조하는 파일의 열 위치를 설정합니다. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | 이 스키마 객체와 함께 사용할 XmlSerializerNamespaces를 설정합니다. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | 이 [XmlSchemaObject](./)의 부모를 설정합니다. |
| [set_SourceUri](./set_sourceuri/)(const String\&) | 스키마를 로드한 파일의 소스 위치를 설정합니다. |
| [XmlSchemaObject](./xmlschemaobject/)() | [XmlSchemaObject](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
