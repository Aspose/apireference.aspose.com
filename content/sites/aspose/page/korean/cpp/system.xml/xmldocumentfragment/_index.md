---
title: "System::Xml::XmlDocumentFragment 클래스"
linktitle: "XmlDocumentFragment"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocumentFragment 클래스. C++에서 트리 삽입 작업에 유용한 경량 객체를 나타냅니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


트리 삽입 작업에 유용한 경량 객체를 나타냅니다.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. |
| [get_InnerXml](./get_innerxml/)() override | 이 노드의 자식을 나타내는 마크업을 반환합니다. |
| [get_LocalName](./get_localname/)() override | 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 정규화된 이름을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_OwnerDocument](./get_ownerdocument/)() override | 이 노드가 속한 [XmlDocument](../xmldocument/)를 반환합니다. |
| [set_InnerXml](./set_innerxml/)(String) override | 이 노드의 자식을 나타내는 마크업을 설정합니다. |
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
