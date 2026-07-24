---
title: "System::Xml::XmlElement 클래스"
linktitle: "XmlElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement 클래스. C++에서 요소를 나타냅니다."
type: docs
weight: 1700
url: /ko/cpp/system.xml/xmlelement/
---
## XmlElement class


요소를 나타냅니다.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. |
| virtual [get_HasAttributes](./get_hasattributes/)() | 현재 노드에 속성이 있는지 여부를 나타내는 **bool** 값을 반환합니다. |
| [get_InnerText](./get_innertext/)() override | 노드와 모든 자식의 연결된 값을 반환합니다. |
| [get_InnerXml](./get_innerxml/)() override | 이 노드의 자식만을 나타내는 마크업을 반환합니다. |
| [get_IsEmpty](./get_isempty/)() | 요소의 태그 형식을 반환합니다. |
| [get_LocalName](./get_localname/)() override | 현재 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 정규화된 이름을 반환합니다. |
| [get_NamespaceURI](./get_namespaceuri/)() override | 이 노드의 네임스페이스 URI를 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_OwnerDocument](./get_ownerdocument/)() override | 이 노드가 속한 [XmlDocument](../xmldocument/)를 반환합니다. |
| [get_Prefix](./get_prefix/)() override | 이 노드의 네임스페이스 접두사를 반환합니다. |
| [get_SchemaInfo](./get_schemainfo/)() override | 스키마 검증 결과로 이 노드에 할당된 사후 스키마 검증 인포셋을 반환합니다. |
| virtual [GetAttribute](./getattribute/)(String) | 지정된 이름을 가진 속성의 값을 반환합니다. |
| virtual [GetAttribute](./getattribute/)(String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다. |
| virtual [GetAttributeNode](./getattributenode/)(String) | 지정된 이름을 가진 [XmlAttribute](../xmlattribute/)를 반환합니다. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 [XmlAttribute](../xmlattribute/)를 반환합니다. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | 지정된 [XmlElement::get_Name](./get_name/)와 일치하는 모든 하위 요소 목록을 포함하는 [XmlNodeList](../xmlnodelist/)를 반환합니다. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | 지정된 [XmlElement::get_LocalName](./get_localname/) 및 [XmlElement::get_NamespaceURI](./get_namespaceuri/) 값과 일치하는 모든 하위 요소 목록을 포함하는 [XmlNodeList](../xmlnodelist/)를 반환합니다. |
| virtual [HasAttribute](./hasattribute/)(String) | 현재 노드에 지정된 이름을 가진 속성이 있는지 확인합니다. |
| virtual [HasAttribute](./hasattribute/)(String, String) | 현재 노드에 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성이 있는지 확인합니다. |
| [RemoveAll](./removeall/)() override | 현재 노드의 지정된 모든 속성과 자식을 제거합니다. 기본 속성은 제거되지 않습니다. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | 요소에서 지정된 모든 속성을 제거합니다. 기본 속성은 제거되지 않습니다. |
| virtual [RemoveAttribute](./removeattribute/)(String) | 이름으로 속성을 제거합니다. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성을 제거합니다. (제거된 속성이 기본값을 가지고 있는 경우 즉시 대체됩니다.) |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | 요소에서 지정된 인덱스를 가진 속성 노드를 제거합니다. (제거된 속성이 기본값을 가지고 있는 경우 즉시 대체됩니다.) |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | 지정된 [XmlAttribute](../xmlattribute/)을(를) 제거합니다. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | 로컬 이름 및 네임스페이스 URI로 지정된 [XmlAttribute](../xmlattribute/)을(를) 제거합니다. (제거된 속성이 기본값을 가지고 있는 경우 즉시 대체됩니다.) |
| [set_InnerText](./set_innertext/)(String) override | 노드와 모든 자식의 연결된 값을 설정합니다. |
| [set_InnerXml](./set_innerxml/)(String) override | 이 노드의 자식만을 나타내는 마크업을 설정합니다. |
| [set_IsEmpty](./set_isempty/)(bool) | 요소의 태그 형식을 설정합니다. |
| [set_Prefix](./set_prefix/)(String) override | 이 노드의 네임스페이스 접두사를 설정합니다. |
| virtual [SetAttribute](./setattribute/)(String, String) | 지정된 이름을 가진 속성의 값을 설정합니다. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 설정합니다. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | 지정된 [XmlAttribute](../xmlattribute/)을(를) 추가합니다. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | 지정된 [XmlAttribute](../xmlattribute/)을(를) 추가합니다. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 노드의 모든 자식을 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 현재 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
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
