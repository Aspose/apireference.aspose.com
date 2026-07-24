---
title: "System::Xml::Schema::XmlSchemaParticle 클래스"
linktitle: "XmlSchemaParticle"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaParticle 클래스. 모든 파티클 유형(e.g. XmlSchemaAny)의 기본 클래스인 기본 클래스입니다(C++)."
type: docs
weight: 5400
url: /ko/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


그것의 기본 클래스는 모든 파티클 유형(e.g. [XmlSchemaAny](../xmlschemaany/))의 기본 클래스입니다.

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | 파티클이 발생할 수 있는 최대 횟수를 반환합니다. |
| [get_MaxOccursString](./get_maxoccursstring/)() | 숫자를 문자열 값으로 반환합니다. 파티클이 발생할 수 있는 최대 횟수. |
| [get_MinOccurs](./get_minoccurs/)() | 파티클이 발생할 수 있는 최소 횟수를 반환합니다. |
| [get_MinOccursString](./get_minoccursstring/)() | 숫자를 문자열 값으로 반환합니다. 파티클이 발생할 수 있는 최소 횟수. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | 파티클이 발생할 수 있는 최대 횟수를 설정합니다. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | 숫자를 문자열 값으로 설정합니다. 파티클이 발생할 수 있는 최대 횟수. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | 파티클이 발생할 수 있는 최소 횟수를 설정합니다. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | 숫자를 문자열 값으로 설정합니다. 파티클이 발생할 수 있는 최소 횟수. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | [XmlSchemaParticle](./) 클래스의 새 인스턴스를 초기화합니다. |
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
