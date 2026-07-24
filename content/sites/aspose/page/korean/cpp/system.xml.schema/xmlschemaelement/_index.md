---
title: "System::Xml::Schema::XmlSchemaElement 클래스"
linktitle: "XmlSchemaElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaElement 클래스. XML 스키마에서 World Wide Web Consortium (W3C)이 지정한 element element를 나타냅니다. 이 클래스는 모든 particle 유형의 기본 클래스이며 C++에서 XML 문서의 요소를 설명하는 데 사용됩니다."
type: docs
weight: 2600
url: /ko/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 **element** element를 나타냅니다. 이 클래스는 모든 particle 유형의 기본 클래스이며 XML 문서의 요소를 설명하는 데 사용됩니다.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Block](./get_block/)() | **Block** 파생을 반환합니다. |
| [get_BlockResolved](./get_blockresolved/)() | **Block** 값의 컴파일 후 해석을 반환합니다. |
| [get_Constraints](./get_constraints/)() | 요소에 대한 제약 컬렉션을 반환합니다. |
| [get_DefaultValue](./get_defaultvalue/)() | 요소의 내용이 simple type이거나 요소의 내용이 **textOnly**인 경우 해당 요소의 기본값을 반환합니다. |
| [get_ElementSchemaType](./get_elementschematype/)() | 요소의 [XmlSchemaElement::get_SchemaType](./get_schematype/) 또는 [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) 값에 기반하여 요소의 유형을 나타내는 [XmlSchemaType](../xmlschematype/) 객체를 반환합니다. |
| [get_ElementType](./get_elementtype/)() | 요소의 [XmlSchemaElement](./) 또는 [XmlSchemaElement](./)을 기반으로 하며, **ElementType** 값의 컴파일 후 해석을 보유하는 객체를 반환합니다. |
| [get_Final](./get_final/)() | 추가 파생이 허용되지 않음을 나타내기 위해 **Final** 값을 반환합니다. |
| [get_FinalResolved](./get_finalresolved/)() | **Final** 값의 컴파일 후 해석을 반환합니다. |
| [get_FixedValue](./get_fixedvalue/)() | 고정 값을 반환합니다. |
| [get_Form](./get_form/)() | 요소의 형태를 반환합니다. |
| [get_IsAbstract](./get_isabstract/)() | 요소를 인스턴스 문서에서 사용할 수 있는지 여부를 나타내는 정보를 반환합니다. |
| [get_IsNillable](./get_isnillable/)() | 인스턴스 데이터에서 **xsi:nil**이 발생할 수 있는지 여부를 나타내는 정보를 반환합니다. 요소에 명시적인 nil 값을 할당할 수 있는지 여부를 나타냅니다. |
| [get_Name](./get_name/)() | 요소의 이름을 반환합니다. |
| [get_QualifiedName](./get_qualifiedname/)() | 주어진 요소에 대한 실제 한정된 이름을 반환합니다. |
| [get_RefName](./get_refname/)() | 이 스키마(또는 지정된 네임스페이스에 의해 표시된 다른 스키마)에서 선언된 요소의 참조 이름을 반환합니다. |
| [get_SchemaType](./get_schematype/)() | 요소의 유형을 반환합니다. 이는 복합 유형이거나 단순 유형일 수 있습니다. |
| [get_SchemaTypeName](./get_schematypename/)() | 이 스키마 또는 지정된 네임스페이스에 의해 표시된 다른 스키마에 정의된 내장 데이터 유형의 이름을 반환합니다. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | 이 요소에 의해 대체되는 요소의 이름을 반환합니다. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **Block** 파생을 설정합니다. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | 요소의 내용이 단순 유형이거나 요소의 내용이 **textOnly**인 경우 요소의 기본값을 설정합니다. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | 추가 파생이 허용되지 않음을 나타내기 위해 **Final** 값을 설정합니다. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | 고정 값을 설정합니다. |
| [set_Form](./set_form/)(XmlSchemaForm) | 요소의 형식을 설정합니다. |
| [set_IsAbstract](./set_isabstract/)(bool) | 요소를 인스턴스 문서에서 사용할 수 있는지 여부를 나타내는 정보를 설정합니다. |
| [set_IsNillable](./set_isnillable/)(bool) | **xsi:nil**이 인스턴스 데이터에 발생할 수 있는지를 나타내는 정보를 설정합니다. 요소에 명시적인 nil 값을 할당할 수 있는지 여부를 나타냅니다. |
| [set_Name](./set_name/)(const String\&) | 요소의 이름을 설정합니다. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 스키마에 선언된 요소(또는 지정된 네임스페이스가 가리키는 다른 스키마)의 참조 이름을 설정합니다. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | 요소의 유형을 설정합니다. 이는 복합 유형이거나 단순 유형일 수 있습니다. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 스키마 또는 지정된 네임스페이스가 가리키는 다른 스키마에 정의된 내장 데이터 유형의 이름을 설정합니다. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 요소에 의해 대체되는 요소의 이름을 설정합니다. |
| [XmlSchemaElement](./xmlschemaelement/)() | [XmlSchemaElement](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
