---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction 클래스"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction 클래스. World Wide Web Consortium (W3C)에서 지정한 XML Schema의 restriction 요소를 나타냅니다. 이 클래스는 제한에 의해 파생된 복합 콘텐츠 모델을 가진 복합 형식에 사용됩니다. 복합 형식의 내용을 상속된 복합 형식의 하위 집합으로 제한합니다 (C++)."
type: docs
weight: 2000
url: /ko/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 **restriction** 요소를 나타냅니다. 이 클래스는 제한에 의해 파생된 복합 콘텐츠 모델을 가진 복합 형식에 사용됩니다. 복합 형식의 내용을 상속된 복합 형식의 하위 집합으로 제한합니다.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 복합 콘텐츠 모델의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소를 반환합니다. |
| [get_Attributes](./get_attributes/)() | 복합 형식에 대한 속성 컬렉션을 반환합니다. 여기에는 [XmlSchemaAttribute](../xmlschemaattribute/) 및 [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 요소가 포함됩니다. |
| [get_BaseTypeName](./get_basetypename/)() | 제한에 의해 이 형식이 파생된 복합 형식의 이름을 반환합니다. |
| [get_Particle](./get_particle/)() | [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 반환합니다. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 복합 콘텐츠 모델의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소를 설정합니다. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 제한에 의해 이 형식이 파생된 복합 형식의 이름을 설정합니다. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 설정합니다. |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | 새 인스턴스를 초기화합니다 [XmlSchemaComplexContentRestriction](./) 클래스. |
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
