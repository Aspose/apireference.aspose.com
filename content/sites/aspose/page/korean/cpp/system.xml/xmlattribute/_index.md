---
title: "System::Xml::XmlAttribute 클래스"
linktitle: "XmlAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttribute 클래스. 속성을 나타냅니다. 속성의 유효하고 기본값은 문서 유형 정의(DTD) 또는 C++의 스키마에 정의됩니다."
type: docs
weight: 600
url: /ko/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


속성을 나타냅니다. 속성의 유효하고 기본값은 문서 유형 정의(DTD) 또는 스키마에 정의됩니다.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | 지정된 노드를 이 노드의 자식 노드 목록 끝에 추가합니다. |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. |
| [get_BaseURI](./get_baseuri/)() override | 노드의 기본 Uniform Resource Identifier(URI)를 반환합니다. |
| [get_LocalName](./get_localname/)() override | 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 정규화된 이름을 반환합니다. |
| [get_NamespaceURI](./get_namespaceuri/)() override | 이 노드의 네임스페이스 URI를 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_OwnerDocument](./get_ownerdocument/)() override | 이 노드가 속한 [XmlDocument](../xmldocument/)를 반환합니다. |
| virtual [get_OwnerElement](./get_ownerelement/)() | 속성이 속한 [XmlElement](../xmlelement/)을 반환합니다. |
| [get_Prefix](./get_prefix/)() override | 이 노드의 네임스페이스 접두사를 반환합니다. |
| [get_SchemaInfo](./get_schemainfo/)() override | 스키마 검증 결과로 이 노드에 할당된 post-schema-validation-infoset을 반환합니다. |
| virtual [get_Specified](./get_specified/)() | 속성 값이 명시적으로 설정되었는지 여부를 나타내는 값을 반환합니다. |
| [get_Value](./get_value/)() override | 노드의 값을 반환합니다. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 지정된 참조 노드 바로 뒤에 지정된 노드를 삽입합니다. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 지정된 참조 노드 바로 앞에 지정된 노드를 삽입합니다. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | 지정된 노드를 이 노드의 자식 노드 목록 앞에 추가합니다. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | 지정된 자식 노드를 제거합니다. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | 지정된 자식 노드를 지정된 새 자식 노드로 교체합니다. |
| [set_InnerText](./set_innertext/)(String) override | 노드와 모든 자식의 연결된 값을 설정합니다. |
| [set_InnerXml](./set_innerxml/)(String) override | 속성의 값을 설정합니다. |
| [set_Prefix](./set_prefix/)(String) override | 이 노드의 네임스페이스 접두사를 설정합니다. |
| [set_Value](./set_value/)(String) override | 노드의 값을 설정합니다. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 노드의 모든 자식을 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
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
