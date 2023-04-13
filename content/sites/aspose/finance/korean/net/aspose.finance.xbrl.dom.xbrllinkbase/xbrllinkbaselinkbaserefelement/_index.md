---
title: Class XbrlLinkbaseLinkbaseRefElement
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.Dom.XbrlLinkbase.XbrlLinkbaseLinkbaseRefElement 수업. 클래스는 xbrl linkbase linkbaseRef 요소를 나타냅니다.
type: docs
weight: 7590
url: /ko/net/aspose.finance.xbrl.dom.xbrllinkbase/xbrllinkbaselinkbaserefelement/
---
## XbrlLinkbaseLinkbaseRefElement class

클래스는 xbrl linkbase linkbaseRef 요소를 나타냅니다.

```csharp
public class XbrlLinkbaseLinkbaseRefElement : XbrlLinkbaseElement
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes/) { get; } | 요소의 속성을 가져옵니다. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | 이 노드의 절대 기본 URI를 가져오거나 구현이 절대 URI를 얻을 수 없는 경우 null을 가져옵니다. |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements/) { get; } | 요소의 하위 요소를 가져옵니다. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 자식 노드를 가져옵니다. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | 이 노드의 첫 번째 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | 이 노드에 자식이 있는지 여부를 가져옵니다. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | 이 노드의 마지막 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname/) { get; } | 요소의 로컬 이름을 가져옵니다. |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri/) { get; } | 요소의 네임스페이스 URI를 가져옵니다. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | 이 노드 바로 다음의 노드를 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename/) { get; } | 요소의 노드 이름을 가져옵니다. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | 노드 유형을 가져옵니다. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | 유형에 따라 이 노드의 값을 가져오거나 설정합니다. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | 이 노드와 연결된 문서 개체를 가져옵니다. |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement/) { get; } | 요소의 상위 요소를 가져옵니다. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | 상위 노드를 가져옵니다. |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix/) { get; } | 요소의 접두사를 가져옵니다. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | 이 노드 바로 앞에 있는 노드를 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent/) { get; set; } | 요소의 텍스트 콘텐츠를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | 이 노드의 자식 목록 끝에 newChild 노드를 추가합니다. |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute/)(string) | 이름으로 속성 값을 가져옵니다. |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens/)(string, string) | 로컬 이름 및 네임스페이스 URI로 속성 값을 가져옵니다. |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute/)(string) | 지정된 이름을 가진 속성이 이 요소에 지정되거나 기본값이 있으면 true를 반환하고 그렇지 않으면 false를 반환합니다. |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens/)(string, string) | 지정된 로컬 이름 및 네임스페이스 URI가 있는 속성이 이 요소에 지정되거나 기본값이 있으면 true를 반환하고 그렇지 않으면 false를 반환합니다. |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute/)(string) | 이름으로 속성을 제거합니다. |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens/)(string, string) | 로컬 이름 및 네임스페이스 URI로 특성을 제거합니다. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | 자식 목록에서 이전 자식이 나타내는 자식 노드를 제거합니다. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 자식 목록에서 자식 노드 old child를 새 자식으로 바꾸고 이전 자식 노드를 반환합니다. |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute/)(string, string) | 새 속성을 추가합니다. 해당 이름의 속성이 이미 요소에 있는 경우 해당 값은 value 매개변수의 값으로 변경됩니다. |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens/)(string, string, string) | 새 속성을 추가합니다. 동일한 로컬 이름과 네임스페이스 URI를 가진 속성이 요소에 이미 있는 경우 해당 접두어는 qualifiedName의 접두어 부분으로 변경되고 해당 값은 value 매개 변수로 변경됩니다. |

### 또한보십시오

* class [XbrlLinkbaseElement](../xbrllinkbaseelement/)
* 네임스페이스 [Aspose.Finance.Xbrl.Dom.XbrlLinkbase](../../aspose.finance.xbrl.dom.xbrllinkbase/)
* 집회 [Aspose.Finance](../../)


