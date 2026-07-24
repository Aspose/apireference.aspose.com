---
title: "System::Xml::XmlEntity class"
linktitle: "XmlEntity"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlEntity 클래스. C++에서 <!ENTITY... >와 같은 엔터티 선언을 나타냅니다."
type: docs
weight: 1800
url: /ko/cpp/system.xml/xmlentity/
---
## XmlEntity class


**<!ENTITY... >**와 같은 엔터티 선언을 나타냅니다.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. 엔터티 노드는 복제할 수 없습니다. [XmlEntity](./) 객체에서 이 메서드를 호출하면 예외가 발생합니다. |
| [get_BaseURI](./get_baseuri/)() override | 현재 노드의 기본 통합 자원 식별자(URI)를 반환합니다. |
| [get_InnerText](./get_innertext/)() override | 엔터티 노드와 모든 자식 노드의 값을 연결하여 반환합니다. |
| [get_InnerXml](./get_innerxml/)() override | 이 노드의 자식을 나타내는 마크업을 반환합니다. |
| [get_IsReadOnly](./get_isreadonly/)() override | 노드가 읽기 전용인지 여부를 나타내는 값을 반환합니다. |
| [get_LocalName](./get_localname/)() override | 네임스페이스 접두사 없이 노드의 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 이름을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 노드의 유형을 반환합니다. |
| [get_NotationName](./get_notationname/)() | 엔터티 선언에서 선택적 NDATA 속성의 이름을 반환합니다. |
| [get_OuterXml](./get_outerxml/)() override | 이 노드와 모든 자식을 나타내는 마크업을 반환합니다. |
| [get_PublicId](./get_publicid/)() | 엔터티 선언에서 공용 식별자의 값을 반환합니다. |
| [get_SystemId](./get_systemid/)() | 엔터티 선언에서 시스템 식별자의 값을 반환합니다. |
| [set_InnerText](./set_innertext/)(String) override | 엔터티 노드와 모든 자식 노드의 연결된 값을 설정합니다. |
| [set_InnerXml](./set_innerxml/)(String) override | 이 노드의 자식을 나타내는 마크업을 설정합니다. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 노드의 모든 자식을 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. [XmlEntity](./) 노드의 경우, 이 메서드는 영향을 주지 않습니다. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. [XmlEntity](./) 노드의 경우, 이 메서드는 영향을 주지 않습니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
