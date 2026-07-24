---
title: "System::Xml::Schema::XmlSchemaType 클래스"
linktitle: "XmlSchemaType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaType 클래스. C++에서 모든 단순 유형 및 복합 유형의 기본 클래스입니다."
type: docs
weight: 6800
url: /ko/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


모든 단순 유형 및 복합 유형에 대한 기본 클래스입니다.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | 컴파일 후 객체 유형 또는 내장 XML [Schema](../) 정의 언어(XSD) 데이터 유형, simpleType 요소 또는 complexType 요소를 반환합니다. 이는 스키마 컴파일 후 인포셋 값입니다. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | 이 스키마 유형의 기본 유형에 대한 컴파일 후 값을 반환합니다. |
| [get_Datatype](./get_datatype/)() | 복합 유형의 데이터 유형에 대한 컴파일 후 값을 반환합니다. |
| [get_DerivedBy](./get_derivedby/)() | 이 요소가 기본 유형으로부터 어떻게 파생되었는지에 대한 컴파일 후 정보를 반환합니다. |
| [get_Final](./get_final/)() | 추가 파생이 허용되는지 여부를 나타내는 유형 파생의 final 속성을 반환합니다. |
| [get_FinalResolved](./get_finalresolved/)() | [XmlSchemaType::get_Final](./get_final/) 값에 대한 컴파일 후 해석을 반환합니다. |
| virtual [get_IsMixed](./get_ismixed/)() | 이 유형이 혼합 콘텐츠 모델을 갖는지 여부를 나타내는 값을 반환합니다. 이 호출은 복합 유형에서만 유효합니다. |
| [get_Name](./get_name/)() | 유형의 이름을 반환합니다. |
| [get_QualifiedName](./get_qualifiedname/)() | 이 형식의 **Name** 속성에서 만든 형식에 대한 정규화된 이름을 반환합니다. 이는 스키마 컴파일 후 값입니다. |
| [get_TypeCode](./get_typecode/)() | 형식의 [XmlTypeCode](../xmltypecode/)을 반환합니다. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | 지정된 복합 형식의 내장 복합 형식을 나타내는 [XmlSchemaComplexType](../xmlschemacomplextype/)을 반환합니다. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | 정규화된 이름으로 지정된 복합 형식의 내장 복합 형식을 나타내는 [XmlSchemaComplexType](../xmlschemacomplextype/)을 반환합니다. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | 정규화된 이름으로 지정된 단순 형식의 내장 단순 형식을 나타내는 [XmlSchemaSimpleType](../xmlschemasimpletype/)을 반환합니다. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | 지정된 단순 형식의 내장 단순 형식을 나타내는 [XmlSchemaSimpleType](../xmlschemasimpletype/)을 반환합니다. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | 지정된 파생 스키마 형식이 지정된 기본 스키마 형식으로부터 파생되었는지를 나타내는 값을 반환합니다. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | 추가 파생을 허용하는지를 나타내는 형식 파생의 final 속성을 설정합니다. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | 이 형식이 혼합 콘텐츠 모델을 갖는지를 나타내는 값을 설정합니다. 이 호출은 복합 형식에서만 유효합니다. |
| [set_Name](./set_name/)(const String\&) | 형식의 이름을 설정합니다. |
| [XmlSchemaType](./xmlschematype/)() | [XmlSchemaType](./) 클래스의 새 인스턴스를 초기화합니다. |
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
