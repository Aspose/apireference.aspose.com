---
title: Class InlineXbrlDocument
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Xbrl.Inline.InlineXbrlDocument 수업. 인라인 XBRL 문서.
type: docs
weight: 7790
url: /ko/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

인라인 XBRL 문서.

```csharp
public class InlineXbrlDocument : Document
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument/#constructor)(Stream) | 의 새 인스턴스를 초기화합니다.`InlineXbrlDocument` 클래스를 만들고 스트림으로 엽니다.. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_2)(string) | 의 새 인스턴스를 초기화합니다.`InlineXbrlDocument` 클래스를 열고 파일을 엽니다. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_1)(Stream, LoadOptions) | 의 새 인스턴스를 초기화합니다.`InlineXbrlDocument` 스트림으로 엽니다. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_3)(string, LoadOptions) | 의 새 인스턴스를 초기화합니다.`InlineXbrlDocument` 클래스를 열고 파일을 엽니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences/) { get; } | 컬렉션을 가져옵니다.[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference/) 인라인 XBRL 문서에서. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | 이 노드의 절대 기본 URI를 가져오거나 구현이 절대 URI를 얻을 수 없는 경우 null을 가져옵니다. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | 문서의 인코딩을 가져옵니다. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | 하위 요소를 가져옵니다. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | 자식 노드를 가져옵니다. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | 문서 콘텐츠 형식을 가져옵니다. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts/) { get; } | 컬렉션을 가져옵니다.[`Context`](../../aspose.finance.xbrl/context/) 인라인 XBRL 문서에서. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations/) { get; } | 컬렉션을 가져옵니다.[`InlineContinuation`](../inlinecontinuation/) 인라인 XBRL 문서에서. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | 문서의 요소인 자식 노드에 직접 접근할 수 있도록 해주는 편의 속성이다. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | 문서 URI를 가져옵니다. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts/) { get; } | 컬렉션을 가져옵니다.[`InlineFact`](../inlinefact/) 인라인 XBRL 문서에서. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | 이 노드의 첫 번째 자식을 가져옵니다. 해당 노드가 없으면 null을 반환합니다. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes/) { get; } | 컬렉션을 가져옵니다.[`InlineFootnote`](../inlinefootnote/) 인라인 XBRL 문서에서. |
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
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references/) { get; } | 가져오기[`InlineReferences`](../inlinereferences/) 인라인 XBRL 문서에서. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships/) { get; } | 컬렉션을 가져옵니다.[`InlineRelationship`](../inlinerelationship/) 인라인 XBRL 문서에서. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences/) { get; } | 컬렉션을 가져옵니다.[`RoleReference`](../../aspose.finance.xbrl/rolereference/) 인라인 XBRL 문서에서. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | 이 노드와 해당 하위 항목의 텍스트 내용을 가져오거나 설정합니다. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units/) { get; } | 컬렉션을 가져옵니다.[`Unit`](../../aspose.finance.xbrl/unit/) 인라인 XBRL 문서에서. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors/) { get; set; } | 컬렉션을 가져옵니다.[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror/) 인라인 XBRL 문서에서. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | 이 노드의 자식 목록 끝에 newChild 노드를 추가합니다. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement/)(string, string) | HTML 요소를 생성합니다. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement/)(string, string) | 인라인 xbrl 요소를 생성합니다. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement/)(string, string) | xbrl 인스턴스 요소를 생성합니다. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement/)(string, string) | xbrl 링크 기반 요소를 생성합니다. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl)() | XbrlDocument 개체로 내보내기. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_1)(Stream) | xbrl 스트림으로 내보내기. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_2)(string) | xbrl 파일로 내보내기. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri/)(string) | 지정된 uri가 있는 ArcroleType을 가져옵니다. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid/)(string) | 지정된 ID를 가진 컨텍스트를 가져옵니다. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc/)(Loc) | 로케이터로 개념을 가져옵니다. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname/)(string) | 지정된 이름을 가진 개념을 가져옵니다. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid/)(string) | 지정된 ID를 가진 컨텍스트를 가져옵니다. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference/)(string) | 연속 참조에 따라 연속 체인을 가져옵니다. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri/)(string) | 지정된 uri가 있는 RoleType을 가져옵니다. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid/)(string) | 지정된 id를 가진 유닛을 가져옵니다. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid/)() | 이 인라인 XBRL 문서가 유효한지 확인합니다. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects/)() | DOM 트리에서 인라인 Xbrl 요소를 추가, 업데이트, 제거하는 경우 이 메서드를 호출하여 인라인 xbrl 개체를 새로 고쳐야 합니다. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | 자식 목록에서 이전 자식이 나타내는 자식 노드를 제거합니다. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | 자식 목록에서 자식 노드 old child를 새 자식으로 바꾸고 이전 자식 노드를 반환합니다. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save)(Stream) | 인라인 xbrl 파일을 생성하고 스트림에 저장합니다. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_2)(string) | 인라인 xbrl 파일을 생성하고 디스크에 저장합니다. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_1)(Stream, SaveOptions) | 인라인 xbrl 파일을 생성하고 스트림에 저장합니다. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_3)(string, SaveOptions) | 인라인 xbrl 파일을 생성하고 디스크에 저장합니다. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate/)() | 이 인라인 XBRL 문서를 검증합니다. |

### 또한보십시오

* class [Document](../../aspose.finance.xbrl.dom/document/)
* 네임스페이스 [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline/)
* 집회 [Aspose.Finance](../../)


