---
title: "System::Xml::XmlProcessingInstruction 클래스"
linktitle: "XmlProcessingInstruction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlProcessingInstruction 클래스. C++에서 XML이 문서 텍스트에 프로세서별 정보를 유지하도록 정의한 처리 지시문을 나타냅니다."
type: docs
weight: 3100
url: /ko/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


XML이 문서 텍스트에 프로세서별 정보를 유지하도록 정의한 처리 지시문을 나타냅니다.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 이 노드의 복제본을 생성합니다. |
| [get_Data](./get_data/)() | 대상을 제외한 처리 지시문의 내용을 반환합니다. |
| [get_InnerText](./get_innertext/)() override | 노드와 모든 자식의 연결된 값을 반환합니다. |
| [get_LocalName](./get_localname/)() override | 노드의 로컬 이름을 반환합니다. |
| [get_Name](./get_name/)() override | 노드의 정규화된 이름을 반환합니다. |
| [get_NodeType](./get_nodetype/)() override | 현재 노드의 유형을 반환합니다. |
| [get_Target](./get_target/)() | 처리 지시문의 대상을 반환합니다. |
| [get_Value](./get_value/)() override | 노드의 값을 반환합니다. |
| [set_Data](./set_data/)(const String\&) | 대상을 제외한 처리 지시문의 내용을 설정합니다. |
| [set_InnerText](./set_innertext/)(String) override | 노드와 모든 자식의 연결된 값을 설정합니다. |
| [set_Value](./set_value/)(String) override | 노드의 값을 설정합니다. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 지정된 [XmlWriter](../xmlwriter/)에 노드의 모든 자식 노드를 저장합니다. ProcessingInstruction 노드는 자식이 없으므로 이 메서드는 아무 효과가 없습니다. |
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
