---
title: "System::Xml::Schema::XmlSchemaSimpleType 클래스"
linktitle: "XmlSchemaSimpleType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSimpleType 클래스. World Wide Web Consortium (W3C)에서 정의한 XML 스키마의 simpleContent에 대한 simpleType 요소를 나타냅니다. 이 클래스는 단순 유형을 정의합니다. 단순 유형은 C++에서 텍스트 전용 내용의 속성이나 요소 값에 대한 정보와 제약을 지정할 수 있습니다."
type: docs
weight: 6200
url: /ko/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


World Wide [Web](../../system.web/) Consortium (W3C)에서 정의한 XML [Schema](../)의 **simpleType** 요소를 나타냅니다. 이 클래스는 단순 유형을 정의합니다. 단순 유형은 텍스트 전용 내용의 속성이나 요소 값에 대한 정보와 제약을 지정할 수 있습니다.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Content](./get_content/)() | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), 또는 [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) 중 하나를 반환합니다. |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), 또는 [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) 중 하나를 설정합니다. |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | [XmlSchemaSimpleType](./) 클래스의 새 인스턴스를 초기화합니다. |
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
