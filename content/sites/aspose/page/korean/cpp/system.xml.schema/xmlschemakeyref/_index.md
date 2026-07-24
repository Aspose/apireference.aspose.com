---
title: "System::Xml::Schema::XmlSchemaKeyref 클래스"
linktitle: "XmlSchemaKeyref"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaKeyref 클래스. 이 클래스는 C++에서 World Wide Web Consortium (W3C)에서 지정한 XMLSchema의 keyref 요소를 나타냅니다."
type: docs
weight: 4000
url: /ko/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


이 클래스는 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 XMLSchema의 **keyref** 요소를 나타냅니다.

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Refer](./get_refer/)() | 이 제약이 다른 단순형 또는 복합형에서 참조하는 키의 이름을 반환합니다. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | 이 제약이 다른 단순형 또는 복합형에서 참조하는 키의 이름을 설정합니다. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | [XmlSchemaKeyref](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
