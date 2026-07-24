---
title: "System::Xml::Schema::XmlSchemaGroup 클래스"
linktitle: "XmlSchemaGroup"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaGroup 클래스. World Wide Web Consortium (W3C)에서 지정한 XML Schema의 group 요소를 나타냅니다. 이 클래스는 복합 형식에서 참조되는 스키마 수준에서 그룹을 정의합니다. 요소 선언 집합을 그룹화하여 C++의 복합 형식 정의에 그룹으로 포함할 수 있게 합니다."
type: docs
weight: 3100
url: /ko/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 **group** 요소를 나타냅니다. 이 클래스는 복합 형식에서 참조되는 **schema** 수준에서 그룹을 정의합니다. 요소 선언 집합을 그룹화하여 복합 형식 정의에 그룹으로 포함할 수 있게 합니다.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Name](./get_name/)() | 스키마 그룹의 이름을 반환합니다. |
| [get_Particle](./get_particle/)() | [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 반환합니다. |
| [get_QualifiedName](./get_qualifiedname/)() | 스키마 그룹의 정규화된 이름을 반환합니다. |
| [set_Name](./set_name/)(const String\&) | 스키마 그룹의 이름을 설정합니다. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 설정합니다. |
| [XmlSchemaGroup](./xmlschemagroup/)() | [XmlSchemaGroup](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
