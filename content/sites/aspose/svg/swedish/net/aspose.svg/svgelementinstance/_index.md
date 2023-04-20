---
title: Class SVGElementInstance
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.SVGElementInstance klass. Rotobjektet för varje användningselements skuggaträd implementerar SVGUseElementShadowRootgränssnittet. Det här gränssnittet definierar för närvarande inga tillägg till egenskaperna och metoderna som definierats för ShadowRootgränssnittet och DocumentOrShadowRootmixin. Trädet som är rotat vid denna nod är dock helt skrivskyddat ur perspektivet för författarens skript.
type: docs
weight: 3210
url: /sv/net/aspose.svg/svgelementinstance/
---
## SVGElementInstance class

Rotobjektet för varje användningselements skuggaträd implementerar SVGUseElementShadowRoot-gränssnittet. Det här gränssnittet definierar för närvarande inga tillägg till egenskaperna och metoderna som definierats för ShadowRoot-gränssnittet och DocumentOrShadowRoot-mixin. Trädet som är rotat vid denna nod är dock helt skrivskyddat ur perspektivet för författarens skript.

```csharp
public class SVGElementInstance : ShadowRoot
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | En NamedNodeMap som innehåller attributen för denna nod (om det är ett element) eller null på annat sätt. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Den absoluta bas-URI för denna nod eller noll om implementeringen inte kunde erhålla en absolut URI. |
| [ChildElementCount](../../aspose.svg.dom/documentfragment/childelementcount/) { get; } | Returnerar det aktuella antalet elementnoder som är barn till detta element. 0 om detta element inte har några underordnade noder som är av nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | En nodlista som innehåller alla underordnade till denna nod. Om det inte finns några underordnade, är detta en nodlista som inte innehåller några noder.. |
| [Children](../../aspose.svg.dom/documentfragment/children/) { get; } | Returnerar de underordnade elementen för det aktuella elementet. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Det första barnet i denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [FirstElementChild](../../aspose.svg.dom/documentfragment/firstelementchild/) { get; } | Returnerar den första underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| [Host](../../aspose.svg.dom/shadowroot/host/) { get; } | Host är ett element som innehåller denna ShadowRoot. |
| [InnerHTML](../../aspose.svg.dom/documentfragment/innerhtml/) { get; set; } | Returnerar ett fragment av HTML eller XML som representerar elementets innehåll. Kan ställas in för att ersätta innehållet i elementet med noder tolkade från den givna strängen. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Det sista underordnade av denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [LastElementChild](../../aspose.svg.dom/documentfragment/lastelementchild/) { get; } | Returnerar den sista underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Returnerar den lokala delen av det kvalificerade namnet på denna nod. För noder av någon annan typ än ELEMENT_NODE och ATTRIBUTE_NODE och noder skapade med en DOM Level 1-metod, som Document.createElement(), är detta alltid null. |
| [Mode](../../aspose.svg.dom/shadowroot/mode/) { get; } | Läge där denna ShadowRoot fungerar. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | Namnutrymmets URI för denna nod, eller null om den är ospecificerad. |
| [NextElementSibling](../../aspose.svg.dom/documentfragment/nextelementsibling/) { get; } | Returnerar nästa syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer efter detta i dokumentträdet. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Noden omedelbart efter denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| override [NodeName](../../aspose.svg.dom/documentfragment/nodename/) { get; } | Namnet på denna nod, beroende på dess typ. |
| override [NodeType](../../aspose.svg.dom/documentfragment/nodetype/) { get; } | En kod som representerar typen av det underliggande objektet. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Värdet för denna nod, beroende på dess typ. |
| [OuterHTML](../../aspose.svg.dom/documentfragment/outerhtml/) { get; set; } | Returnerar ett fragment av HTML eller XML som representerar elementet och dess innehåll. Kan ställas in för att ersätta elementet med noder tolkade från den givna strängen. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Dokumentobjektet som är associerat med denna nod. Detta är också dokumentobjektet som används för att skapa nya noder. När denna nod är ett dokument eller en DocumentType som inte används med något dokument ännu, är detta null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Hämtar föräldern[`Element`](../../aspose.svg.dom/element/) av denna nod. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Föräldern till denna nod. Alla noder, utom Attr, Document, DocumentFragment, Entity och Notation kan ha en förälder. Men om en nod just har skapats och ännu inte lagts till i trädet, eller om den har tagits bort från trädet, är detta null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Namnutrymmesprefixet för denna nod, eller null om det är ospecificerat. När den är definierad som null har inställningen ingen effekt |
| [PreviousElementSibling](../../aspose.svg.dom/documentfragment/previouselementsibling/) { get; } | Returnerar föregående syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer före detta i dokumentträdet. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Noden omedelbart före denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| override [TextContent](../../aspose.svg.dom/documentfragment/textcontent/) { get; set; } | Detta attribut returnerar textinnehållet för denna nod och dess avkomlingar. När den är definierad som null har inställningen ingen effekt. Vid inställning tas alla möjliga barn bort som denna nod kan ha och, om den nya strängen inte är tom eller null, ersätts den av en enda textnod som innehåller strängen som detta attribut är inställt på. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Lägger till noden newChild i slutet av listan över underordnade till denna nod. Om det nya barnet redan finns i trädet tas det först bort. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Returnerar en dubblett av denna nod, dvs fungerar som en generisk kopiakonstruktor för noder. Dubblettnoden har ingen förälder (parentNode är null) och inga användardata. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Returnerar en dubblett av denna nod, dvs fungerar som en generisk kopiakonstruktor för noder. Dubblettnoden har ingen förälder (parentNode är null) och inga användardata. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Denna metod tillåter sändning av händelser till implementeringshändelsemodellen. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Utför programdefinierade uppgifter associerade med att frigöra, frigöra eller återställa ohanterade resurser. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Denna metod används för att hämta ECMAScript-objektType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Returnerar om denna nod (om det är ett element) har några attribut |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Returnerar om denna nod har några barn. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Infogar noden före det befintliga underordnade nodbarnet. Om child är null, infoga nod i slutet av listan med barn. Om child är ett DocumentFragment-objekt, infogas alla dess underordnade, i samma ordning, före child. Om barnet redan finns i trädet tas det först bort. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Den här metoden kontrollerar om det angivna namnutrymmet-URI är standardnamnutrymmet eller inte. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Testar om två noder är lika. Denna metod testar likadana noder, inte likhet (dvs om de två noderna är referenser till samma objekt) som kan testas med Node.isSameNode(). Alla noder som är lika kommer också att vara lika, även om det omvända kanske inte är sant. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Returnerar om denna nod är samma nod som den givna. Den här metoden ger ett sätt att avgöra om två nodreferenser som returneras av implementeringen refererar till samma objekt. När två nodreferenser är referenser till samma objekt, även om genom en proxy, kan referenserna användas helt utbytbart, så att alla attribut har samma värden och att anropa samma DOM-metod på någon av referenserna har alltid exakt samma effekt. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Slå upp namnutrymmes-URI som är kopplat till det givna prefixet, med början från denna nod. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Slå upp prefixet som är associerat med den givna namnutrymmes-URI, med början från denna nod. Standardnamnområdesdeklarationerna ignoreras av den här metoden. Se Namnutrymmesprefixsökning för detaljer om algoritmen som används av denna metod. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Lägger alla textnoder i underträdets fulla djup under denna nod, inklusive attributnoder, i en "normal" form där endast struktur (t.ex. element, kommentarer, bearbetningsinstruktioner, CDATA-sektioner och entitetsreferenser) separerar text noder, dvs det finns varken intilliggande textnoder eller tomma textnoder. Detta kan användas för att säkerställa att DOM-vyn för ett dokument är densamma som om det sparades och laddades om, och är användbart när operationer (som XPointer [XPointer]-uppslagningar) som beror på en viss dokumentträdstruktur ska användas. Om parametern "normalize-characters" för DOMConfiguration-objektet som är kopplat till Node.ownerDocument är sant, kommer denna metod också att helt normalisera tecknen i Textnoderna. |
| [QuerySelector](../../aspose.svg.dom/documentfragment/queryselector/)(string) | Returnerar det första elementet i dokumentet, som matchar selector |
| [QuerySelectorAll](../../aspose.svg.dom/documentfragment/queryselectorall/)(string) | Returnerar en nodlista över alla element i dokumentet, som matchar selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Tar bort den underordnade noden som indikeras av oldChild från listan över barn och returnerar den. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Ersätter barnnoden oldChild med newChild i listan över barn och returnerar oldChild-noden. Om newChild är ett DocumentFragment-objekt ersätts oldChild av alla DocumentFragment-underordnade, som infogas i samma ordning. Om det nya barnet redan finns i trädet tas det först bort. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Returnerar enString som representerar denna instans. |

### Se även

* class [ShadowRoot](../../aspose.svg.dom/shadowroot/)
* namnutrymme [Aspose.Svg](../../aspose.svg/)
* hopsättning [Aspose.SVG](../../)


