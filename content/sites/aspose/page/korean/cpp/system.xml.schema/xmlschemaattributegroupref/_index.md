---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef 클래스"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef 클래스. XML 스키마에서 ref 속성을 가진 attributeGroup 요소를 나타냅니다. AttributesGroupRef는 attributeGroup에 대한 참조이며, name property는 C++에서 참조되는 attribute group을 포함합니다."
type: docs
weight: 1300
url: /ko/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


XML [Schema](../)에서 **ref** 속성을 가진 **attributeGroup** 요소를 나타냅니다([World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454) 지정). AttributesGroupRef는 attributeGroup에 대한 참조이며, name property는 참조되는 attribute group을 포함합니다.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_RefName](./get_refname/)() | 참조된 **attributeGroup** 요소의 이름을 반환합니다. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 참조된 **attributeGroup** 요소의 이름을 설정합니다. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | [XmlSchemaAttributeGroupRef](./) 클래스의 새 인스턴스를 초기화합니다. |
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
