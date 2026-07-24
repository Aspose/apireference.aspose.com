---
title: "System::Xml::XmlNodeChangedEventArgs 클래스"
linktitle: "XmlNodeChangedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs 클래스. C++에서 XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved 및 XmlDocument::NodeRemoving 이벤트에 대한 데이터를 제공합니다."
type: docs
weight: 2600
url: /ko/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


다음 이벤트에 대한 데이터를 제공합니다: **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** 및 **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Action](./get_action/)() | 노드 변경 이벤트 유형을 나타내는 값을 반환합니다. |
| [get_NewParent](./get_newparent/)() | 작업이 완료된 후 [XmlNode::get_ParentNode](../xmlnode/get_parentnode/)의 값을 반환합니다. |
| [get_NewValue](./get_newvalue/)() | 노드의 새 값을 반환합니다. |
| [get_Node](./get_node/)() | 추가, 제거 또는 변경되는 [XmlNode](../xmlnode/)를 반환합니다. |
| [get_OldParent](./get_oldparent/)() | 작업이 시작되기 전에 [XmlNode::get_ParentNode](../xmlnode/get_parentnode/)의 값을 반환합니다. |
| [get_OldValue](./get_oldvalue/)() | 노드의 원래 값을 반환합니다. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | [XmlNodeChangedEventArgs](./) 클래스의 새 인스턴스를 초기화합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
