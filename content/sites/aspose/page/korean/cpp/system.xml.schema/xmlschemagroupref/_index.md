---
title: "System::Xml::Schema::XmlSchemaGroupRef 클래스"
linktitle: "XmlSchemaGroupRef"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaGroupRef 클래스. World Wide Web Consortium (W3C)에서 지정한 XML 스키마의 ref 속성을 가진 group 요소를 나타냅니다. 이 클래스는 C++에서 스키마 수준에 정의된 그룹을 참조하는 복합 유형 내에서 사용됩니다."
type: docs
weight: 3300
url: /ko/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


XML [Schema](../)에서 **ref** 속성을 가진 **group** 요소를 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 대로 나타냅니다. 이 클래스는 **schema** 수준에 정의된 **group**을 참조하는 복합 유형 내에서 사용됩니다.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Particle](./get_particle/)() | 컴파일 후 **Particle** 값의 해석을 보유하는 [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), 또는 [XmlSchemaSequence](../xmlschemasequence/) 클래스 중 하나를 반환합니다. |
| [get_RefName](./get_refname/)() | 이 스키마(또는 지정된 네임스페이스에 의해 표시된 다른 스키마)에서 정의된 그룹의 이름을 반환합니다. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 스키마(또는 지정된 네임스페이스에 의해 표시된 다른 스키마)에서 정의된 그룹의 이름을 설정합니다. |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | [XmlSchemaGroupRef](./) 클래스의 새 인스턴스를 초기화합니다. |
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
