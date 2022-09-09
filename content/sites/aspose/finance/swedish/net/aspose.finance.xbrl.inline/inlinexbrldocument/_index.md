---
title: InlineXbrlDocument
second_title: Aspose.Finance för .NET API-referens
description: Ett inbyggt XBRLdokument.
type: docs
weight: 7750
url: /sv/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Ett inbyggt XBRL-dokument.

```csharp
public class InlineXbrlDocument : Document
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | Initierar en ny instans av[`InlineXbrlDocument`](../inlinexbrldocument) klass och öppna en fil. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | Får samlingen av[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) i XBRL-dokumentet. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Får den absoluta bas-URI för denna nod eller noll om implementeringen inte kunde erhålla en absolut URI. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | Hämtar dokumentets kodning. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | Hämtar de underordnade elementen. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Hämtar barnnoderna. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | Hämtar dokumentinnehållstypen. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | Får samlingen av[`Context`](../../aspose.finance.xbrl/context) i XBRL-dokumentet. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | Får samlingen av[`InlineContinuation`](../inlinecontinuation) i XBRL-dokumentet. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | Detta är ett bekvämlighetsattribut som tillåter direkt åtkomst till den underordnade noden som är dokumentelementet i dokumentet. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | Hämtar dokumentets URI. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | Får samlingen av[`InlineFact`](../inlinefact) i XBRL-dokumentet. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Får det första barnet till denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | Får samlingen av[`InlineFootnote`](../inlinefootnote) i XBRL-dokumentet. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Hämtar om denna nod har några barn. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Hämtar det sista barnet till denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | Hämtar den lokala delen av det kvalificerade namnet på denna nod. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | Hämtar namnområdets URI för denna nod. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Hämtar noden omedelbart efter denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | Hämtar nodnamnet på dokumentet. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Hämtar nodtypen. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Hämtar eller ställer in värdet för denna nod, beroende på dess typ. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Hämtar dokumentobjektet som är associerat med denna nod. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Hämtar den överordnade noden. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | Hämtar eller ställer in namnområdesprefixet för denna nod. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Hämtar noden omedelbart före denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | Får[`InlineReferences`](../inlinereferences) i XBRL-dokumentet. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | Får samlingen av[`InlineRelationship`](../inlinerelationship) i XBRL-dokumentet. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | Får samlingen av[`RoleReference`](../../aspose.finance.xbrl/rolereference) i XBRL-dokumentet. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | Hämtar eller ställer in textinnehållet för denna nod och dess avkomlingar. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | Får samlingen av[`Unit`](../../aspose.finance.xbrl/unit) i XBRL-dokumentet. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | Får samlingen av[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) i XBRL-dokumentet. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Lägger till noden newChild i slutet av listan över underordnade till denna nod. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | Skapar ett HTML-element. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | Skapar ett inline xbrl-element. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | Skapar ett xbrl-instanselement. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | Skapar ett xbrl länkbaselement. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | Exportera till XbrlDocument-objekt. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | Exportera till xbrl stream. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | Exportera till xbrl-fil. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | Hämtar ArcroleType som har den angivna uri. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | Hämtar kontexten som har det angivna id. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | Får konceptet av lokaliseraren. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | Hämtar konceptet som har det angivna namnet. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | Hämtar kontexten som har det angivna id. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | Hämtar fortsättningskedjan enligt fortsättningsreferensen. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | Hämtar RoleType som har den angivna uri. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | Hämtar enheten som har det angivna id. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | Kontrollerar om detta inlinse XBRL-dokument är giltigt. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | Om du lägger till, uppdaterar, tar bort Inline Xbrl-element i DOM-trädet, bör den här metoden anropas för att uppdatera inline-xbrl-objekt. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Tar bort den underordnade noden som indikeras av gammalt barn från listan över barn. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Ersätter det gamla underordnade barnet med nytt underordnat i listan över underordnade och returnerar den gamla underordnade noden. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | Skapar och sparar den infogade xbrl-filen i strömmen. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(string) | Skapar och sparar den inline xbrl-filen på disken. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | Validerar detta inline XBRL-dokument. |

### Se även

* class [Document](../../aspose.finance.xbrl.dom/document)
* namnutrymme [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* hopsättning [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
