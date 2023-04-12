---
title: Class ProcessingInstruction
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.Dom.ProcessingInstruction 수업. 클래스는 문서의 텍스트에 프로세서별 정보를 유지하는 방법으로 XML에서 사용되는 처리 명령을 나타냅니다.
type: docs
weight: 7480
url: /ko/net/aspose.finance.xbrl.dom/processinginstruction/
---
## ProcessingInstruction class

클래스는 문서의 텍스트에 프로세서별 정보를 유지하는 방법으로 XML에서 사용되는 "처리 명령"을 나타냅니다.

```csharp
public class ProcessingInstruction : CharacterData
```

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | 이 노드의 절대 기본 URI를 가져오거나 구현이 절대 URI를 얻을 수 없는 경우 null을 가져옵니다. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 자식 노드를 가져옵니다. |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data/) { get; set; } | 이 인터페이스를 구현하는 노드의 문자 데이터를 가져오거나 설정합니다. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | 이 노드의 첫 번째 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | 이 노드에 자식이 있는지 여부를 가져옵니다. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | 이 노드의 마지막 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length/) { get; } | 데이터를 통해 사용 가능한 16비트 단위의 수를 가져옵니다. 이것은 값이 0일 수 있습니다. 즉, CharacterData 노드가 비어 있을 수 있습니다. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | 이 노드의 정규화된 이름의 로컬 부분을 가져옵니다. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | 이 노드의 네임스페이스 URI를 가져옵니다. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | 이 노드 바로 다음의 노드를 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| override [NodeName](../../aspose.finance.xbrl.dom/processinginstruction/nodename/) { get; } | 이 처리 명령의 이름을 가져옵니다. |
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
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata/)(string) | 노드의 문자 데이터 끝에 문자열을 추가합니다. |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata/)(int, int) | 노드에서 콘텐츠 범위를 제거합니다. |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata/)(int, string) | 지정된 오프셋에 문자열을 삽입합니다. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | 자식 목록에서 이전 자식이 나타내는 자식 노드를 제거합니다. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 자식 목록에서 자식 노드 old child를 새 자식으로 바꾸고 이전 자식 노드를 반환합니다. |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata/)(int, int, string) | 지정된 오프셋에서 시작하는 문자를 지정된 문자열로 바꿉니다. |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring/)(int, int) | 노드에서 데이터 범위를 추출합니다. |

### 또한보십시오

* class [CharacterData](../characterdata/)
* 네임스페이스 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 집회 [Aspose.Finance](../../)


