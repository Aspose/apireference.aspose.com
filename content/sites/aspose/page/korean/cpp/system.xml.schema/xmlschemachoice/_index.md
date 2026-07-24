---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaChoice 클래스. World Wide Web Consortium (W3C)에서 지정한 XML 스키마의 choice 요소(구성자)를 나타냅니다. choice는 C++ 인스턴스에서 자식 중 하나만 나타날 수 있도록 허용합니다."
type: docs
weight: 1400
url: /ko/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 **choice** 요소(구성자)를 나타냅니다. **choice**는 자식 중 하나만 인스턴스에 나타날 수 있도록 허용합니다.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Items](./get_items/)() override | 구성자 (**choice**)와 함께 포함된 요소들의 컬렉션을 반환합니다: [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), 또는 [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | [XmlSchemaChoice](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
