---
title: "System::Xml::XmlNode 클래스"
linktitle: "XmlNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode 클래스. C++에서 XML 문서의 단일 노드를 나타냅니다."
type: docs
weight: 2500
url: /ko/cpp/system.xml/xmlnode/
---
## XmlNode class


XML 문서에서 단일 노드를 나타냅니다.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | 지정된 노드를 이 노드의 자식 노드 목록 끝에 추가합니다. |
| virtual [Clone](./clone/)() | 이 노드의 복제본을 생성합니다. |
| virtual [CloneNode](./clonenode/)(bool) | 파생 클래스에서 재정의될 때, 노드의 복제본을 생성합니다. |
| [CreateNavigator](./createnavigator/)() override | 이 객체를 탐색하기 위한 XPathNavigator를 생성합니다. |
| virtual [get_Attributes](./get_attributes/)() | 이 노드의 속성을 포함하는 [XmlAttributeCollection](../xmlattributecollection/)을 반환합니다. |
| virtual [get_BaseURI](./get_baseuri/)() | 현재 노드의 기본 URI를 반환합니다. |
| virtual [get_ChildNodes](./get_childnodes/)() | 노드의 모든 자식 노드를 반환합니다. |
| virtual [get_FirstChild](./get_firstchild/)() | 노드의 첫 번째 자식을 반환합니다. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | 이 노드에 자식 노드가 있는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_InnerText](./get_innertext/)() | 노드와 모든 자식 노드의 연결된 값을 반환합니다. |
| virtual [get_InnerXml](./get_innerxml/)() | 이 노드의 자식 노드만을 나타내는 마크업을 반환합니다. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | 노드가 읽기 전용인지 여부를 나타내는 값을 반환합니다. |
| virtual [get_LastChild](./get_lastchild/)() | 노드의 마지막 자식을 반환합니다. |
| virtual [get_LocalName](./get_localname/)() | 파생 클래스에서 재정의된 경우, 노드의 로컬 이름을 반환합니다. |
| virtual [get_Name](./get_name/)() | 파생 클래스에서 재정의된 경우, 노드의 정규화된 이름을 반환합니다. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 이 노드의 네임스페이스 URI를 반환합니다. |
| virtual [get_NextSibling](./get_nextsibling/)() | 이 노드 바로 다음에 오는 노드를 반환합니다. |
| virtual [get_NodeType](./get_nodetype/)() | 파생 클래스에서 재정의된 경우, 현재 노드의 유형을 반환합니다. |
| virtual [get_OuterXml](./get_outerxml/)() | 이 노드와 모든 자식 노드를 포함하는 마크업을 반환합니다. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | 이 노드가 속한 [XmlDocument](../xmldocument/)를 반환합니다. |
| virtual [get_ParentNode](./get_parentnode/)() | 이 노드의 부모를 반환합니다(부모가 있을 수 있는 노드의 경우). |
| virtual [get_Prefix](./get_prefix/)() | 이 노드의 네임스페이스 접두사를 반환합니다. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | 이 노드 바로 앞에 있는 노드를 반환합니다. |
| virtual [get_PreviousText](./get_previoustext/)() | 이 노드 바로 앞에 있는 텍스트 노드를 반환합니다. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | 스키마 검증 결과로 이 노드에 할당된 사후 스키마 검증 인포셋을 반환합니다. |
| virtual [get_Value](./get_value/)() | 노드의 값을 반환합니다. |
| [GetEnumerator](./getenumerator/)() override | 현재 노드의 자식 노드를 순회하는 열거자를 반환합니다. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | 현재 노드 범위에 있는 지정된 접두사에 대한 가장 가까운 **xmlns** 선언을 찾아 해당 선언에 있는 네임스페이스 URI를 반환합니다. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | 현재 노드 범위에 있는 지정된 네임스페이스 URI에 대한 가장 가까운 **xmlns** 선언을 찾아 해당 선언에 정의된 접두사를 반환합니다. |
| virtual [idx_get](./idx_get/)(String) | 지정된 [XmlNode::get_Name](./get_name/)을 가진 첫 번째 자식 요소를 반환합니다. |
| virtual [idx_get](./idx_get/)(String, String) | 지정된 [XmlNode::get_LocalName](./get_localname/) 및 [XmlNode::get_NamespaceURI](./get_namespaceuri/) 값을 가진 첫 번째 자식 요소를 반환합니다. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 지정된 참조 노드 바로 뒤에 지정된 노드를 삽입합니다. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 지정된 참조 노드 바로 앞에 지정된 노드를 삽입합니다. |
| virtual [Normalize](./normalize/)() | 이 [XmlNode](./) 아래 서브 트리 전체 깊이에 있는 모든 [XmlText](../xmltext/) 노드를 "정상" 형태로 변환합니다. 이 형태에서는 마크업(태그, 주석, 처리 지시문, CDATA 섹션 및 엔터티 참조)만이 [XmlText](../xmltext/) 노드를 구분하며, 인접한 [XmlText](../xmltext/) 노드가 존재하지 않게 됩니다. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | 지정된 노드를 이 노드의 자식 노드 목록 앞에 추가합니다. |
| virtual [RemoveAll](./removeall/)() | 현재 노드의 모든 자식 노드 및/또는 속성을 제거합니다. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | 지정된 자식 노드를 제거합니다. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | 자식 노드 **oldChild**를 **newChild** 노드로 교체합니다. |
| [SelectNodes](./selectnodes/)(const String\&) | [XPath](../../system.xml.xpath/) 표현식에 일치하는 노드 목록을 선택합니다. |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | [XPath](../../system.xml.xpath/) 표현식에 일치하는 노드 목록을 선택합니다. [XPath](../../system.xml.xpath/) 표현식에서 발견된 모든 접두사는 제공된 [XmlNamespaceManager](../xmlnamespacemanager/)를 사용하여 해결됩니다. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | [XPath](../../system.xml.xpath/) 표현식에 일치하는 첫 번째 [XmlNode](./)을 선택합니다. |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | [XPath](../../system.xml.xpath/) 표현식에 일치하는 첫 번째 [XmlNode](./)을 선택합니다. [XPath](../../system.xml.xpath/) 표현식에서 발견된 모든 접두사는 제공된 [XmlNamespaceManager](../xmlnamespacemanager/)를 사용하여 해결됩니다. |
| virtual [set_InnerText](./set_innertext/)(String) | 노드와 모든 자식 노드의 연결된 값을 설정합니다. |
| virtual [set_InnerXml](./set_innerxml/)(String) | 이 노드의 자식 노드만을 나타내는 마크업을 설정합니다. |
| virtual [set_Prefix](./set_prefix/)(String) | 이 노드의 네임스페이스 접두사를 설정합니다. |
| virtual [set_Value](./set_value/)(String) | 노드의 값을 설정합니다. |
| virtual [Supports](./supports/)(String, String) | DOM 구현이 특정 기능을 구현하는지 테스트합니다. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | 파생 클래스에서 재정의될 때, 노드의 모든 자식 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | 파생 클래스에서 재정의될 때, 현재 노드를 지정된 [XmlWriter](../xmlwriter/)에 저장합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
