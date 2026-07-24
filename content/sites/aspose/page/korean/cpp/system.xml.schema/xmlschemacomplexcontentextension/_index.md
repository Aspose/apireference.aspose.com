---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension 클래스"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension 클래스. XML Schema에서 확장 요소를 World Wide Web Consortium (W3C)이 지정한 대로 나타냅니다. 이 클래스는 확장에 의해 파생된 복합 콘텐츠 모델을 가진 복합 유형에 사용됩니다. C++에서 속성이나 요소를 추가하여 복합 유형을 확장합니다."
type: docs
weight: 1900
url: /ko/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


XML [Schema](../)에서 **extension** 요소를 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 대로 나타냅니다. 이 클래스는 확장에 의해 파생된 복합 콘텐츠 모델을 가진 복합 유형에 사용됩니다. 속성이나 요소를 추가하여 복합 유형을 확장합니다.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 복합 콘텐츠 모델의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소를 반환합니다. |
| [get_Attributes](./get_attributes/)() | 복합 콘텐츠에 대한 속성 컬렉션을 반환합니다. 여기에는 [XmlSchemaAttribute](../xmlschemaattribute/) 및 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 요소가 포함됩니다. |
| [get_BaseTypeName](./get_basetypename/)() | 확장에 의해 파생된 복합 유형의 이름을 반환합니다. |
| [get_Particle](./get_particle/)() | [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 반환합니다. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 복합 콘텐츠 모델의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소를 설정합니다. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 확장에 의해 파생된 복합 유형의 이름을 설정합니다. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 설정합니다. |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | [XmlSchemaComplexContentExtension](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
