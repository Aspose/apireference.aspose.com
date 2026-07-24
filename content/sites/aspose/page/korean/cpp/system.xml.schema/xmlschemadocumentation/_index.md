---
title: "System::Xml::Schema::XmlSchemaDocumentation 클래스"
linktitle: "XmlSchemaDocumentation"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDocumentation 클래스. World Wide Web Consortium (W3C)에서 지정한 XML Schema의 documentation 요소를 나타냅니다. 이 클래스는 C++에서 주석 내에서 인간이 읽거나 사용할 정보를 지정합니다."
type: docs
weight: 2500
url: /ko/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


XML [Schema](../)에서 World Wide [Web](../../system.web/) Consortium (W3C)에서 지정한 **documentation** 요소를 나타냅니다. 이 클래스는 **annotation** 내에서 인간이 읽거나 사용할 정보를 지정합니다.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Language](./get_language/)() | **xml:lang** 속성을 반환합니다. 이는 내용에 사용된 언어를 나타내는 표시기로 작동합니다. |
| [get_Markup](./get_markup/)() | documentation 자식 노드를 나타내는 [XmlNode](../../system.xml/xmlnode/) 객체 배열을 반환합니다. |
| [get_Source](./get_source/)() | 정보의 Uniform Resource Identifier (URI) 소스를 반환합니다. |
| [set_Language](./set_language/)(const String\&) | **xml:lang** 속성을 설정합니다. 이는 내용에 사용된 언어를 나타내는 표시기로 작동합니다. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | documentation 자식 노드를 나타내는 [XmlNode](../../system.xml/xmlnode/) 객체 배열을 설정합니다. |
| [set_Source](./set_source/)(const String\&) | 정보의 Uniform Resource Identifier (URI) 소스를 설정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
