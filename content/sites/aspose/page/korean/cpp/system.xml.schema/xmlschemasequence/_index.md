---
title: "System::Xml::Schema::XmlSchemaSequence 클래스"
linktitle: "XmlSchemaSequence"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSequence 클래스. XML 스키마에서 World Wide Web Consortium (W3C)이 지정한 sequence 요소(구성 요소)를 나타냅니다. sequence는 그룹 내의 요소들이 포함 요소 안에서 지정된 순서대로 나타나야 합니다 (C++)."
type: docs
weight: 5700
url: /ko/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)이 지정한 **sequence** 요소(구성 요소)를 나타냅니다. **sequence**는 그룹 내의 요소들이 포함 요소 안에서 지정된 순서대로 나타나야 합니다.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Items](./get_items/)() override | 구성 요소에 포함된 요소들. [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./), 또는 [XmlSchemaAny](../xmlschemaany/)의 컬렉션. |
| [XmlSchemaSequence](./xmlschemasequence/)() | [XmlSchemaSequence](./) 클래스의 새 인스턴스를 초기화합니다. |
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
