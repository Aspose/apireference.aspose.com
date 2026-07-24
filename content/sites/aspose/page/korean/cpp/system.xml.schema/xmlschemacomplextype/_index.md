---
title: "System::Xml::Schema::XmlSchemaComplexType 클래스"
linktitle: "XmlSchemaComplexType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaComplexType 클래스. XML 스키마에서 World Wide Web Consortium (W3C)에서 지정한 complexType 요소를 나타냅니다. 이 클래스는 C++에서 요소의 속성 및 내용 집합을 결정하는 복합 유형을 정의합니다."
type: docs
weight: 2100
url: /ko/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 **complexType** 요소를 나타냅니다. 이 클래스는 요소의 속성 및 내용 집합을 결정하는 복합 유형을 정의합니다.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 복합 유형의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소에 대한 값을 반환합니다. |
| [get_Attributes](./get_attributes/)() | 복합 유형에 대한 속성 컬렉션을 반환합니다. |
| [get_AttributeUses](./get_attributeuses/)() | 이 복합 유형 및 해당 기본 유형의 모든 컴파일된 속성 컬렉션을 반환합니다. |
| [get_AttributeWildcard](./get_attributewildcard/)() | 이 복합 유형 및 해당 기본 유형에 대한 **anyAttribute**의 컴파일 후 값을 반환합니다. |
| [get_Block](./get_block/)() | **block** 속성을 반환합니다. |
| [get_BlockResolved](./get_blockresolved/)() | 형식이 스키마 검증 후 정보 집합(infoset)으로 컴파일된 후의 값을 반환합니다. 이 값은 인스턴스 문서에서 **xsi:type**이 사용될 때 형식이 어떻게 적용되는지를 나타냅니다. |
| [get_ContentModel](./get_contentmodel/)() | 이 복합 유형의 컴파일 후 [XmlSchemaContentModel](../xmlschemacontentmodel/)을 반환합니다. |
| [get_ContentType](./get_contenttype/)() | 컴파일 후 값을 보유하는 복합 유형의 콘텐츠 모델을 반환합니다. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | [XmlSchemaComplexType::get_ContentType](./get_contenttype/) 입자에 대한 컴파일 후 값을 보유하는 파티클을 반환합니다. |
| [get_IsAbstract](./get_isabstract/)() | **complexType** 요소를 인스턴스 문서에서 사용할 수 있는지 결정하는 정보를 반환합니다. |
| [get_IsMixed](./get_ismixed/)() override | 복합 유형이 혼합 콘텐츠 모델(콘텐츠 내 마크업)을 가지고 있는지 결정하는 정보를 반환합니다. |
| [get_Particle](./get_particle/)() | [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나로 컴포지터 유형을 반환합니다. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 복합 유형의 [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) 구성 요소에 대한 값을 설정합니다. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **block** 속성을 설정합니다. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | 이 복합 유형의 컴파일 후 [XmlSchemaContentModel](../xmlschemacontentmodel/)을 설정합니다. |
| [set_IsAbstract](./set_isabstract/)(bool) | **complexType** 요소를 인스턴스 문서에서 사용할 수 있는지 결정하는 정보를 설정합니다. |
| [set_IsMixed](./set_ismixed/)(bool) override | 복합 유형이 혼합 콘텐츠 모델(콘텐츠 내 마크업)을 가지고 있는지 결정하는 정보를 설정합니다. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나로 컴포지터 유형을 설정합니다. |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | [XmlSchemaComplexType](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
