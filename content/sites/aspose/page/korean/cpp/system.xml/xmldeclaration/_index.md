---
title: "System::Xml::XmlDeclaration 클래스"
linktitle: "XmlDeclaration"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDeclaration 클래스. C++에서 XML 선언 노드 <?xml version=''1.0''...?>를 나타냅니다."
type: docs
weight: 1300
url: /ko/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


XML 선언 노드 **<?xml version='1.0'...?>**를 나타냅니다.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. |
| [get_Encoding](./get_encoding/)() | XML 문서의 인코딩 수준을 반환합니다. |
| [get_InnerText](./get_innertext/)() override | [XmlDeclaration](./)의 연결된 값을 반환합니다. |
| [get_LocalName](./get_localname/)() override | 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 정규화된 이름을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_Standalone](./get_standalone/)() | standalone 속성의 값을 반환합니다. |
| [get_Value](./get_value/)() override | [XmlDeclaration](./)의 값을 반환합니다. |
| [get_Version](./get_version/)() | 문서의 XML 버전을 반환합니다. |
| [set_Encoding](./set_encoding/)(const String\&) | XML 문서의 인코딩 수준을 설정합니다. |
| [set_InnerText](./set_innertext/)(String) override | [XmlDeclaration](./)의 연결된 값을 설정합니다. |
| [set_Standalone](./set_standalone/)(const String\&) | standalone 속성의 값을 설정합니다. |
| [set_Value](./set_value/)(String) override | [XmlDeclaration](./)의 값을 설정합니다. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 지정된 [XmlWriter](../xmlwriter/)에 노드의 자식을 저장합니다. [XmlDeclaration](./) 노드에는 자식이 없으므로 이 메서드는 아무 효과가 없습니다. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
