---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint 클래스"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint 클래스. C++에서 키, keyref 및 unique 요소와 같은 식별 제약 조건을 위한 클래스입니다."
type: docs
weight: 3400
url: /ko/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


**key**, **keyref**, 및 **unique** 요소에 대한 식별 제약 클래스입니다.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Fields](./get_fields/)() | XML 경로 언어 ([XPath](../../system.xml.xpath/)) 표현식 선택기에 대한 자식으로 적용되는 필드 컬렉션을 반환합니다. |
| [get_Name](./get_name/)() | 식별 제약 조건의 이름을 반환합니다. |
| [get_QualifiedName](./get_qualifiedname/)() | 식별 제약 조건의 정규화된 이름을 반환합니다. 이 이름은 **QualifiedName** 값의 컴파일 후 해석을 포함합니다. |
| [get_Selector](./get_selector/)() | [XPath](../../system.xml.xpath/) 표현식 **selector** 요소를 반환합니다. |
| [set_Name](./set_name/)(const String\&) | 식별 제약 조건의 이름을 설정합니다. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | [XPath](../../system.xml.xpath/) 표현식 **selector** 요소를 설정합니다. |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | [XmlSchemaIdentityConstraint](./) 클래스의 새 인스턴스를 초기화합니다. |
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
