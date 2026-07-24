---
title: "System::Xml::XPath::XPathNavigator 클래스"
linktitle: "XPathNavigator"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator 클래스. C++에서 XML 데이터를 탐색하고 편집하기 위한 커서 모델을 제공합니다."
type: docs
weight: 500
url: /ko/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


XML 데이터를 탐색하고 편집하기 위한 커서 모델을 제공합니다.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | 현재 노드의 자식 노드 목록 끝에 하나 이상의 새 자식 노드를 생성하는 데 사용되는 [XmlWriter](../../system.xml/xmlwriter/) 객체를 반환합니다. |
| virtual [AppendChild](./appendchild/)(String) | 지정된 XML 데이터 문자열을 사용하여 현재 노드의 자식 노드 목록 끝에 새 자식 노드를 생성합니다. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체의 XML 내용을 사용하여 현재 노드의 자식 노드 목록 끝에 새 자식 노드를 생성합니다. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | 지정된 [XPathNavigator](./)의 노드를 사용하여 현재 노드의 자식 노드 목록 끝에 새 자식 노드를 생성합니다. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | 지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 값을 사용하여 현재 노드의 자식 노드 목록 끝에 새 자식 요소 노드를 생성합니다. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | 제공된 XML [Schema](../../system.xml.schema/) 정의 언어(XSD) 스키마에 맞게 [XPathNavigator](./)의 XML 데이터가 준수하는지 확인합니다. |
| virtual [Clone](./clone/)() | 파생 클래스에서 재정의될 경우, 이 [XPathNavigator](./)와 동일한 노드에 위치한 새 [XPathNavigator](./)를 생성합니다. |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | 현재 [XPathNavigator](./)의 위치를 지정된 [XPathNavigator](./)의 위치와 비교합니다. |
| virtual [Compile](./compile/)(String) | [XPath](../) 식을 나타내는 문자열을 컴파일하고 [XPathExpression](../xpathexpression/) 객체를 반환합니다. |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | 지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 값을 사용하여 현재 요소 노드에 속성 노드를 생성합니다. |
| virtual [CreateAttributes](./createattributes/)() | 현재 요소에 새 속성을 생성하는 데 사용되는 [XmlWriter](../../system.xml/xmlwriter/) 객체를 반환합니다. |
| [CreateNavigator](./createnavigator/)() override | [XPathNavigator](./)의 복사본을 반환합니다. |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | 현재 노드부터 지정된 노드까지 형제 노드 범위를 삭제합니다. |
| virtual [DeleteSelf](./deleteself/)() | 현재 노드와 그 자식 노드를 삭제합니다. |
| virtual [Evaluate](./evaluate/)(String) | 지정된 [XPath](../) 식을 평가하고 형식이 지정된 결과를 반환합니다. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 지정된 [XPath](../) 식을 평가하고, [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 [XPath](../) 식의 네임스페이스 접두사를 해석한 후 형식이 지정된 결과를 반환합니다. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | [XPathExpression](../xpathexpression/)을 평가하고 형식이 지정된 결과를 반환합니다. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | 제공된 컨텍스트를 사용하여 [XPathExpression](../xpathexpression/)을 평가하고 형식이 지정된 결과를 반환합니다. |
| virtual [get_BaseURI](./get_baseuri/)() | 파생 클래스에서 재정의될 경우, 현재 노드의 기본 URI를 가져옵니다. |
| virtual [get_CanEdit](./get_canedit/)() | [XPathNavigator](./)가 기본 XML 데이터를 편집할 수 있는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_HasAttributes](./get_hasattributes/)() | 현재 노드에 속성이 있는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_HasChildren](./get_haschildren/)() | 현재 노드에 자식 노드가 있는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_InnerXml](./get_innerxml/)() | 현재 노드의 자식 노드를 나타내는 마크업을 반환합니다. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | 파생 클래스에서 재정의될 경우, 현재 노드가 종료 태그가 없는 빈 요소인지 여부를 나타내는 값을 가져옵니다. |
| [get_IsNode](./get_isnode/)() override | 현재 노드가 [XPath](../) 노드를 나타내는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_LocalName](./get_localname/)() | 파생 클래스에서 재정의될 경우, 네임스페이스 접두사 없이 현재 노드의 [XPathNavigator::get_Name](./get_name/)을 가져옵니다. |
| virtual [get_Name](./get_name/)() | 파생 클래스에서 재정의될 경우, 현재 노드의 정규화된 이름을 가져옵니다. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 파생 클래스에서 재정의될 때, 현재 노드의 네임스페이스 URI를 가져옵니다. |
| virtual [get_NameTable](./get_nametable/)() | 파생 클래스에서 재정의될 때, [XPathNavigator](./)의 [XmlNameTable](../../system.xml/xmlnametable/)을 가져옵니다. |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | [XPathNavigator](./) 객체의 동등성 비교에 사용되는 [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/)을 반환합니다. |
| virtual [get_NodeType](./get_nodetype/)() | 파생 클래스에서 재정의될 때, 현재 노드의 [XPathNodeType](../xpathnodetype/)을 가져옵니다. |
| virtual [get_OuterXml](./get_outerxml/)() | 현재 노드와 그 자식 노드의 시작 및 종료 태그를 나타내는 마크업을 반환합니다. |
| virtual [get_Prefix](./get_prefix/)() | 파생 클래스에서 재정의될 때, 현재 노드와 연결된 네임스페이스 접두사를 가져옵니다. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | 스키마 검증 결과 현재 노드에 할당된 스키마 정보를 반환합니다. |
| [get_TypedValue](./get_typedvalue/)() override | 현재 노드를 가장 적합한 유형의 박스된 객체로 반환합니다. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | [XPathNavigator](./) 구현에서 스토어에 대한 "가상화된" XML 뷰를 제공하고, 기본 객체에 대한 액세스를 제공하기 위해 사용됩니다. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | 현재 노드의 값을 [Boolean](../../system/boolean/)으로 반환합니다. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | 현재 노드의 값을 [DateTime](../../system/datetime/)으로 반환합니다. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | 현재 노드의 값을 [Double](../../system/double/)으로 반환합니다. |
| [get_ValueAsInt](./get_valueasint/)() override | 현재 노드의 값을 [Int32](../../system/int32/)으로 반환합니다. |
| [get_ValueAsLong](./get_valueaslong/)() override | 현재 노드의 값을 [Int64](../../system/int64/)으로 반환합니다. |
| [get_ValueType](./get_valuetype/)() override | 현재 노드의 유형을 반환합니다. |
| virtual [get_XmlLang](./get_xmllang/)() | 현재 노드에 대한 **xml:lang** 범위를 반환합니다. |
| [get_XmlType](./get_xmltype/)() override | 현재 노드에 대한 XmlSchemaType 정보를 반환합니다. |
| virtual [GetAttribute](./getattribute/)(String, String) | 지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다. |
| virtual [GetNamespace](./getnamespace/)(String) | 지정된 로컬 이름에 해당하는 네임스페이스 노드의 값을 반환합니다. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 현재 노드의 범위 내 네임스페이스를 반환합니다. |
| virtual [InsertAfter](./insertafter/)() | 현재 선택된 노드 뒤에 새로운 형제 노드를 만들 때 사용되는 [XmlWriter](../../system.xml/xmlwriter/) 객체를 반환합니다. |
| virtual [InsertAfter](./insertafter/)(String) | 지정된 XML 문자열을 사용하여 현재 선택된 노드 뒤에 새로운 형제 노드를 생성합니다. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체의 XML 내용을 사용하여 현재 선택된 노드 뒤에 새로운 형제 노드를 생성합니다. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | 지정된 [XPathNavigator](./) 객체의 노드를 사용하여 현재 선택된 노드 뒤에 새로운 형제 노드를 생성합니다. |
| virtual [InsertBefore](./insertbefore/)() | 현재 선택된 노드 앞에 새로운 형제 노드를 만들 때 사용되는 [XmlWriter](../../system.xml/xmlwriter/) 객체를 반환합니다. |
| virtual [InsertBefore](./insertbefore/)(String) | 지정된 XML 문자열을 사용하여 현재 선택된 노드 앞에 새로운 형제 노드를 생성합니다. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체의 XML 내용을 사용하여 현재 선택된 노드 앞에 새로운 형제 노드를 생성합니다. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | 지정된 [XPathNavigator](./) 객체의 노드를 사용하여 현재 선택된 노드 앞에 새로운 형제 노드를 생성합니다. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | 지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 지정된 값을 사용하여 현재 노드 뒤에 새로운 형제 요소를 생성합니다. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | 지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI를 사용하여 현재 노드 앞에 새 형제 요소를 만들고, 지정된 값을 사용합니다. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | 지정된 [XPathNavigator](./)가 현재 [XPathNavigator](./)의 하위 노드인지 여부를 결정합니다. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | 파생 클래스에서 재정의될 경우, 현재 [XPathNavigator](./)가 지정된 [XPathNavigator](./)와 동일한 위치에 있는지 여부를 결정합니다. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 지정된 접두사에 대한 네임스페이스 URI를 반환합니다. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | 지정된 네임스페이스 URI에 대해 선언된 접두사를 반환합니다. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | 현재 노드가 지정된 [XPathExpression](../xpathexpression/)과 일치하는지 여부를 결정합니다. |
| virtual [Matches](./matches/)(String) | 현재 노드가 지정된 [XPath](../) 식과 일치하는지 여부를 결정합니다. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | 파생 클래스에서 재정의될 경우, [XPathNavigator](./)를 지정된 [XPathNavigator](./)와 동일한 위치로 이동합니다. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | [XPathNavigator](./)를 일치하는 로컬 이름 및 네임스페이스 URI를 가진 속성으로 이동합니다. |
| virtual [MoveToChild](./movetochild/)(String, String) | [XPathNavigator](./)를 지정된 로컬 이름 및 네임스페이스 URI를 가진 자식 노드로 이동합니다. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | [XPathNavigator](./)를 지정된 [XPathNodeType](../xpathnodetype/)의 자식 노드로 이동합니다. |
| virtual [MoveToFirst](./movetofirst/)() | [XPathNavigator](./)를 현재 노드의 첫 번째 형제 노드로 이동합니다. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | 파생 클래스에서 재정의될 경우, [XPathNavigator](./)를 현재 노드의 첫 번째 속성으로 이동합니다. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | 파생 클래스에서 재정의될 경우, [XPathNavigator](./)를 현재 노드의 첫 번째 자식 노드로 이동합니다. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | 파생 클래스에서 재정의될 경우, [XPathNavigator](./)를 지정된 [XPathNamespaceScope](../xpathnamespacescope/)와 일치하는 첫 번째 네임스페이스 노드로 이동합니다. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | [XPathNavigator](./)를 현재 노드의 첫 번째 네임스페이스 노드로 이동합니다. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | [XPathNavigator](./)를 문서 순서대로 지정된 로컬 이름 및 네임스페이스 URI를 가진 요소로 이동합니다. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./)를 문서 순서대로 지정된 로컬 이름 및 네임스페이스 URI와 지정된 경계까지의 요소로 이동합니다. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | [XPathNavigator](./)를 문서 순서대로 지정된 [XPathNodeType](../xpathnodetype/)의 다음 요소로 이동합니다. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./)를 문서 순서대로 지정된 [XPathNodeType](../xpathnodetype/)의 다음 요소를 지정된 경계까지 이동합니다. |
| virtual [MoveToId](./movetoid/)(String) | 파생 클래스에서 재정의될 경우, **ID** 유형의 속성을 가지고 그 값이 지정된 [String](../../system/string/)과 일치하는 노드로 이동합니다. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | [XPathNavigator](./)를 지정된 네임스페이스 접두사를 가진 네임스페이스 노드로 이동합니다. |
| virtual [MoveToNext](./movetonext/)() | 파생 클래스에서 재정의될 경우, [XPathNavigator](./)를 현재 노드의 다음 형제 노드로 이동합니다. |
| virtual [MoveToNext](./movetonext/)(String, String) | [XPathNavigator](./)를 지정된 로컬 이름 및 네임스페이스 URI를 가진 다음 형제 노드로 이동합니다. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | [XPathNavigator](./)를 지정된 [XPathNodeType](../xpathnodetype/)와 일치하는 현재 노드의 다음 형제 노드로 이동합니다. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | 파생 클래스에서 재정의될 경우, [XPathNavigator](./)를 다음 속성으로 이동합니다. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | 파생 클래스에서 재정의될 때, 지정된 [XPathNamespaceScope](../xpathnamespacescope/)와 일치하는 다음 네임스페이스 노드로 [XPathNavigator](./)를 이동합니다. |
| [MoveToNextNamespace](./movetonextnamespace/)() | [XPathNavigator](./)를 다음 네임스페이스 노드로 이동합니다. |
| virtual [MoveToParent](./movetoparent/)() | 파생 클래스에서 재정의될 때, 현재 노드의 부모 노드로 [XPathNavigator](./)를 이동합니다. |
| virtual [MoveToPrevious](./movetoprevious/)() | 파생 클래스에서 재정의될 때, 현재 노드의 이전 형제 노드로 [XPathNavigator](./)를 이동합니다. |
| virtual [MoveToRoot](./movetoroot/)() | [XPathNavigator](./)를 현재 노드가 속한 루트 노드로 이동합니다. |
| virtual [PrependChild](./prependchild/)() | 현재 노드의 자식 노드 목록 시작 부분에 새 자식 노드를 만들 때 사용하는 [XmlWriter](../../system.xml/xmlwriter/) 객체를 반환합니다. |
| virtual [PrependChild](./prependchild/)(String) | 지정된 XML 문자열을 사용하여 현재 노드의 자식 노드 목록 시작 부분에 새 자식 노드를 생성합니다. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체의 XML 내용을 사용하여 현재 노드의 자식 노드 목록 시작 부분에 새 자식 노드를 생성합니다. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | 지정된 [XPathNavigator](./) 객체의 노드를 사용하여 현재 노드의 자식 노드 목록 시작 부분에 새 자식 노드를 생성합니다. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | 지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 지정된 값을 사용하여 현재 노드의 자식 노드 목록 시작 부분에 새 자식 요소를 생성합니다. |
| virtual [ReadSubtree](./readsubtree/)() | 현재 노드와 그 자식 노드를 포함하는 [XmlReader](../../system.xml/xmlreader/) 객체를 반환합니다. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | 현재 노드부터 지정된 노드까지의 형제 노드 범위를 교체합니다. |
| virtual [ReplaceSelf](./replaceself/)(String) | 지정된 문자열의 내용으로 현재 노드를 교체합니다. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | 지정된 [XmlReader](../../system.xml/xmlreader/) 객체의 내용으로 현재 노드를 교체합니다. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | 지정된 [XPathNavigator](./) 객체의 내용으로 현재 노드를 교체합니다. |
| virtual [Select](./select/)(String) | 지정된 [XPath](../) 식을 사용하여 노드 집합을 선택합니다. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 네임스페이스 접두사를 해결하기 위해 지정된 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체와 함께 지정된 [XPath](../) 식을 사용하여 노드 집합을 선택합니다. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | 지정된 [XPathExpression](../xpathexpression/)을 사용하여 노드 집합을 선택합니다. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | 일치하는 [XPathNodeType](../xpathnodetype/)을 가진 현재 노드의 모든 조상 노드를 선택합니다. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | 지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 조상 노드를 선택합니다. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | 일치하는 [XPathNodeType](../xpathnodetype/)을 가진 현재 노드의 모든 자식 노드를 선택합니다. |
| virtual [SelectChildren](./selectchildren/)(String, String) | 지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 자식 노드를 선택합니다. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | 일치하는 [XPathNodeType](../xpathnodetype/)을 가진 현재 노드의 모든 하위 노드를 선택합니다. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | 지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 하위 노드를 선택합니다. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | 지정된 [XPath](../) 쿼리를 사용하여 [XPathNavigator](./)에서 단일 노드를 선택합니다. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | 지정된 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 네임스페이스 접두사를 해결하도록 지정된 [XPath](../) 쿼리를 사용해 [XPathNavigator](./) 객체에서 단일 노드를 선택합니다. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | [XPathNavigator](./)에서 지정된 [XPathExpression](../xpathexpression/) 객체를 사용해 단일 노드를 선택합니다. |
| virtual [set_InnerXml](./set_innerxml/)(String) | 현재 노드의 자식 노드를 나타내는 마크업을 설정합니다. |
| virtual [set_OuterXml](./set_outerxml/)(String) | 현재 노드와 그 자식 노드의 시작 및 종료 태그를 나타내는 마크업을 설정합니다. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | 현재 노드의 형식화된 값을 설정합니다. |
| virtual [SetValue](./setvalue/)(String) | 현재 노드의 값을 설정합니다. |
| [ToString](./tostring/)() const override | 현재 노드의 텍스트 값을 반환합니다. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | 지정된 네임스페이스 접두사를 해결하도록 지정된 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 지정된 Type으로 현재 노드의 값을 반환합니다. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | 지정된 [XmlWriter](../../system.xml/xmlwriter/) 객체에 현재 노드와 그 자식 노드를 스트리밍합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
