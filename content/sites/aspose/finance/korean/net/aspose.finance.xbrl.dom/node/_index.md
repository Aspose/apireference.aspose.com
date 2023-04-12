---
title: Class Node
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.Dom.Node 수업. Node 클래스는 전체 문서 개체 모델의 기본 데이터 유형입니다. 문서 트리의 단일 노드를 나타냅니다.
type: docs
weight: 7460
url: /ko/net/aspose.finance.xbrl.dom/node/
---
## Node class

Node 클래스는 전체 문서 개체 모델의 기본 데이터 유형입니다. 문서 트리의 단일 노드를 나타냅니다.

```csharp
public abstract class Node
```

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | 이 노드의 절대 기본 URI를 가져오거나 구현이 절대 URI를 얻을 수 없는 경우 null을 가져옵니다. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 자식 노드를 가져옵니다. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | 이 노드의 첫 번째 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | 이 노드에 자식이 있는지 여부를 가져옵니다. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | 이 노드의 마지막 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | 이 노드의 정규화된 이름의 로컬 부분을 가져옵니다. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | 이 노드의 네임스페이스 URI를 가져옵니다. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | 이 노드 바로 다음의 노드를 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename/) { get; } | 유형에 따라 노드 이름을 가져옵니다. |
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

## 필드

| 이름 | 설명 |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node/) | 댓글 노드 유형. |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node/) | 문서 노드 유형. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node/) | 문서 유형 노드 유형. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node/) | 요소 노드 유형. |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node/) | 처리 명령 노드 유형. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node/) | 텍스트 노드 유형. |

### 또한보십시오

* 네임스페이스 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 집회 [Aspose.Finance](../../)


