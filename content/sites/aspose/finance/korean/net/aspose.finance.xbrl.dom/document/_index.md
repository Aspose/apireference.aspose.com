---
title: Class Document
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.Dom.Document 수업. 문서는 전체 인라인 xbrl 문서를 나타냅니다. 개념적으로 이것은 문서 트리의 루트이며 문서 데이터에 대한 기본 액세스를 제공합니다.
type: docs
weight: 6690
url: /ko/net/aspose.finance.xbrl.dom/document/
---
## Document class

문서는 전체 인라인 xbrl 문서를 나타냅니다. 개념적으로 이것은 문서 트리의 루트이며 문서 데이터에 대한 기본 액세스를 제공합니다.

```csharp
public class Document : Node
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Document](document/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | 이 노드의 절대 기본 URI를 가져오거나 구현이 절대 URI를 얻을 수 없는 경우 null을 가져옵니다. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | 문서의 인코딩을 가져옵니다. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | 하위 요소를 가져옵니다. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 자식 노드를 가져옵니다. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | 문서 콘텐츠 형식을 가져옵니다. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | 문서의 요소인 자식 노드에 직접 접근할 수 있도록 해주는 편의 속성이다. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | 문서 URI를 가져옵니다. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | 이 노드의 첫 번째 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | 이 노드에 자식이 있는지 여부를 가져옵니다. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | 이 노드의 마지막 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | 이 노드의 정규화된 이름의 로컬 부분을 가져옵니다. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | 이 노드의 네임스페이스 URI를 가져옵니다. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | 이 노드 바로 다음의 노드를 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename/) { get; } | 문서의 노드 이름을 가져옵니다. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | 노드 유형을 가져옵니다. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | 유형에 따라 이 노드의 값을 가져오거나 설정합니다. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | 이 노드와 연결된 문서 개체를 가져옵니다. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | 상위 노드를 가져옵니다. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | 이 노드의 네임스페이스 접두사를 가져오거나 설정합니다. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | 이 노드 바로 앞에 있는 노드를 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | 이 노드와 해당 하위 항목의 텍스트 내용을 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | 이 노드의 자식 목록 끝에 newChild 노드를 추가합니다. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | 자식 목록에서 이전 자식이 나타내는 자식 노드를 제거합니다. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 자식 목록에서 자식 노드 old child를 새 자식으로 바꾸고 이전 자식 노드를 반환합니다. |

### 또한보십시오

* class [Node](../node/)
* 네임스페이스 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 집회 [Aspose.Finance](../../)


