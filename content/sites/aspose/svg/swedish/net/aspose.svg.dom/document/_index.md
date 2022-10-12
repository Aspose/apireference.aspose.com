---
title: Document
second_title: Aspose.SVG för .NET API Referens
description: Dokumentet representerar hela HTML XML eller SVGdokumentet. Begreppsmässigt är det roten till dokumentträdet och ger den primära åtkomsten till dokumentets data.
type: docs
weight: 810
url: /sv/net/aspose.svg.dom/document/
---
## Document class

Dokumentet representerar hela HTML-, XML- eller SVG-dokumentet. Begreppsmässigt är det roten till dokumentträdet och ger den primära åtkomsten till dokumentets data.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | En NamedNodeMap som innehåller attributen för denna nod (om det är ett element) eller null på annat sätt. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri) { get; } | Den absoluta bas-URI för denna nod eller noll om implementeringen inte kunde erhålla en absolut URI. |
| [CharacterSet](../../aspose.svg.dom/document/characterset) { get; } | Hämtar dokumentets kodning. |
| [Charset](../../aspose.svg.dom/document/charset) { get; } | Hämtar dokumentets kodning. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount) { get; } | Returnerar det aktuella antalet elementnoder som är barn till detta element. 0 om detta element inte har några underordnade noder som är av nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | En nodlista som innehåller alla underordnade till denna nod. Om det inte finns några underordnade, är detta en nodlista som inte innehåller några noder.. |
| [Children](../../aspose.svg.dom/document/children) { get; } | Returnerar de underordnade elementen. |
| [ContentType](../../aspose.svg.dom/document/contenttype) { get; } | Hämtar dokumentinnehållstypen. |
| [Context](../../aspose.svg.dom/document/context) { get; } | Hämtar aktuellt webbläsarkontext. |
| [DefaultView](../../aspose.svg.dom/document/defaultview) { get; } | StandardView IDL-attributet för Document-gränssnittet, när hämtas, måste returnera detta dokuments webbläsarkontexts WindowProxy-objekt, om detta dokument har en associerad webbläsarkontext, eller null annars. |
| [Doctype](../../aspose.svg.dom/document/doctype) { get; } | Dokumenttypsdeklarationen som är kopplad till detta dokument. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement) { get; } | Detta är ett bekvämlighetsattribut som tillåter direkt åtkomst till den underordnade noden som är dokumentelementet i dokumentet. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi) { get; } | Platsen för dokumentet eller null om odefinierat eller om dokumentet skapades med DOMImplementation.createDocument. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Det första barnet i denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild) { get; } | Returnerar den första underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| [Implementation](../../aspose.svg.dom/document/implementation) { get; } | DOMImplementation-objektet som hanterar detta dokument. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding) { get; } | Hämtar dokumentets kodning. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Det sista underordnade av denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild) { get; } | Returnerar den sista underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Returnerar den lokala delen av det kvalificerade namnet på denna nod. För noder av någon annan typ än ELEMENT_NODE och ATTRIBUTE_NODE och noder skapade med en DOM Level 1-metod, som Document.createElement(), är detta alltid null. |
| [Location](../../aspose.svg.dom/document/location) { get; } | Dokumentets plats. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | Namnutrymmets URI för denna nod, eller null om den är ospecificerad. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling) { get; } | Returnerar nästa syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer efter detta i dokumentträdet. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Noden omedelbart efter denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| override [NodeName](../../aspose.svg.dom/document/nodename) { get; } | Namnet på denna nod, beroende på dess typ. |
| override [NodeType](../../aspose.svg.dom/document/nodetype) { get; } | En kod som representerar typen av det underliggande objektet. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Värdet för denna nod, beroende på dess typ. |
| [Origin](../../aspose.svg.dom/document/origin) { get; } | Hämtar dokumentets ursprung. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument) { get; } | Hämtar ägardokumentet. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Hämtar föräldern[`Element`](../element) av denna nod. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Föräldern till denna nod. Alla noder, utom Attr, Document, DocumentFragment, Entity och Notation kan ha en förälder. Men om en nod just har skapats och ännu inte lagts till i trädet, eller om den har tagits bort från trädet, är detta null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Namnutrymmesprefixet för denna nod, eller null om det är ospecificerat. När den är definierad som null har inställningen ingen effekt |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling) { get; } | Returnerar föregående syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer före detta i dokumentträdet. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Noden omedelbart före denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [ReadyState](../../aspose.svg.dom/document/readystate) { get; } | Returnerar dokumentets beredskap. "Ladda in" medan dokumentet laddas, "interaktivt" när det är färdigt att tolka men fortfarande laddar underresurser, och "komplett" när det har laddats. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking) { get; set; } | Ett attribut som anger om felkontroll tillämpas eller inte. När den är inställd på false är implementeringen fri att inte testa alla möjliga felfall som normalt definieras på DOM-operationer, och inte generera några DOMException på DOM-operationer eller rapportera fel när du använder Document.normalizeDocument(). Vid fel är beteendet odefinierat. Det här attributet är sant som standard. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets) { get; } | En lista som innehåller alla stilmallar som är explicit länkade till eller inbäddade i ett dokument. För HTML-dokument inkluderar detta externa stilmallar, inkluderade via HTML LINK-elementet, och inline STYLE-element. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | Detta attribut returnerar textinnehållet för denna nod och dess avkomlingar. När den är definierad som null har inställningen ingen effekt. Vid inställning tas alla möjliga barn bort som denna nod kan ha och, om den nya strängen inte är tom eller null, ersätts den av en enda textnod som innehåller strängen som detta attribut är inställt på. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone) { get; set; } | Ett attribut som anger, som en del av XML-deklarationen, om detta dokument är fristående. Detta är falskt när det är ospecificerat. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion) { get; set; } | Ett attribut som anger, som en del av XML-deklarationen, versionsnumret för detta dokument. Om det inte finns någon deklaration och om detta dokument stöder "XML"-funktionen är värdet "1.0". Om det här dokumentet inte stöder "XML"-funktionen är värdet alltid null. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Lägger till noden newChild i slutet av listan över underordnade till denna nod. Om det nya barnet redan finns i trädet tas det först bort. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Returnerar en dubblett av denna nod, dvs fungerar som en generisk kopiakonstruktor för noder. Dubblettnoden har ingen förälder (parentNode är null) och inga användardata. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Returnerar en dubblett av denna nod, dvs fungerar som en generisk kopiakonstruktor för noder. Dubblettnoden har ingen förälder (parentNode är null) och inga användardata. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute)(string) | Skapar en Attr för förnamnet. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens)(string, string) | Skapar ett attribut för det angivna kvalificerade namnet och namnutrymmets URI. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection)(string) | Skapar en CDATASection-nod vars värde är den angivna strängen. |
| [CreateComment](../../aspose.svg.dom/document/createcomment)(string) | Skapar en kommentarsnod med den angivna strängen. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment)() | Skapar ett tomt DocumentFragment-objekt. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype)(string, string, string, string) | Skapar en DocumentType-nod. |
| [CreateElement](../../aspose.svg.dom/document/createelement)(string) | Skapar ett element av angiven typ. Observera att den returnerade instansen implementerar Element-gränssnittet, så attribut kan specificeras direkt på det returnerade objektet. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns)(string, string) | Skapar ett element av det angivna kvalificerade namnet och namnutrymmets URI. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference)(string) | Skapar ett EntityReference-objekt. Dessutom, om den refererade enheten är känd, görs den underordnade listan för EntityReference-noden densamma som den för motsvarande Entity-nod. |
| [CreateEvent](../../aspose.svg.dom/document/createevent)(string) | Skapar en[`Event`](../../aspose.svg.dom.events/event) av en typ som stöds av implementeringen. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression)(string, IXPathNSResolver) | Skapar ett tolkat XPath-uttryck med lösta namnutrymmen. Detta är användbart när ett uttryck ska återanvändas i en applikation eftersom det gör det möjligt att kompilera uttryckssträngen till en mer effektiv intern form och förlösa alla namnområdesprefix som förekommer i uttrycket. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator)(Node) | Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_1)(Node, long) | Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_2)(Node, long, INodeFilter) | Skapa en ny NodeIterator över underträdet som är rotat på den specificerade noden. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver)(Node) | Anpassar valfri DOM-nod för att lösa namnområden så att ett XPath-uttryck enkelt kan utvärderas i förhållande till nodens kontext där det förekom i dokumentet. Denna adapter fungerar som DOM Level 3-metoden`lookupNamespaceURI` på noder för att lösa namnutrymmetURI från ett givet prefix med den aktuella informationen som är tillgänglig i nodens hierarki vid den tidpunkt lookupNamespaceURI anropas, vilket också korrekt löser det implicita xml-prefixet. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction)(string, string) | Skapar en ProcessingInstruction-nod med det angivna namnet och datasträngarna. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode)(string) | Skapar en textnod med den angivna strängen. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker)(Node) | Skapa en ny TreeWalker över underträdet som är rotat vid den specificerade noden. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_1)(Node, long) | Skapa en ny TreeWalker över underträdet som är rotat vid den specificerade noden. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_2)(Node, long, INodeFilter) | Skapa en ny TreeWalker över underträdet som är rotat vid den specificerade noden. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Denna metod tillåter sändning av händelser till implementeringshändelsemodellen. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Utför programdefinierade uppgifter associerade med att frigöra, frigöra eller återställa ohanterade resurser. |
| [Evaluate](../../aspose.svg.dom/document/evaluate)(string, Node, IXPathNSResolver, XPathResultType, object) | Utvärderar en XPath-uttryckssträng och returnerar ett resultat av den angivna typen om möjligt. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid)(string) | Returnerar elementet som har ett ID-attribut med det angivna värdet. Om inget sådant element finns returnerar detta null. Om mer än ett element har ett ID-attribut med det värdet, är det som returneras odefinierat. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname)(string) | Returnerar ett levande NodeList-objekt som innehåller alla element i dokumentet som har alla klasser som anges i argument. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname)(string) | Returnerar en nodlista över alla element i dokumentordning med ett givet taggnamn och som finns i dokumentet. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens)(string, string) | Returnerar en nodlista över alla element med ett givet lokalt namn och namnområdes-URI i dokumentordning. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Denna metod används för att hämta ECMAScript-objektType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Returnerar om denna nod (om det är ett element) har några attribut |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Returnerar om denna nod har några barn. |
| [ImportNode](../../aspose.svg.dom/document/importnode)(Node, bool) | Importerar en nod från ett annat dokument till detta dokument, utan att ändra eller ta bort källnoden från originaldokumentet; denna metod skapar en ny kopia av källnoden. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Infogar noden före det befintliga underordnade nodbarnet. Om child är null, infoga nod i slutet av listan med barn. Om child är ett DocumentFragment-objekt, infogas alla dess underordnade, i samma ordning, före child. Om barnet redan finns i trädet tas det först bort. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Den här metoden kontrollerar om det angivna namnutrymmet-URI är standardnamnutrymmet eller inte. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Testar om två noder är lika. Denna metod testar likadana noder, inte likhet (dvs om de två noderna är referenser till samma objekt) som kan testas med Node.isSameNode(). Alla noder som är lika kommer också att vara lika, även om det omvända kanske inte är sant. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Returnerar om denna nod är samma nod som den givna. Den här metoden ger ett sätt att avgöra om två nodreferenser som returneras av implementeringen refererar till samma objekt. När två nodreferenser är referenser till samma objekt, även om genom en proxy, kan referenserna användas helt utbytbart, så att alla attribut har samma värden och att anropa samma DOM-metod på någon av referenserna har alltid exakt samma effekt. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Slå upp namnutrymmes-URI som är kopplat till det givna prefixet, med början från denna nod. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Slå upp prefixet som är associerat med den givna namnutrymmes-URI, med början från denna nod. Standardnamnområdesdeklarationerna ignoreras av den här metoden. Se Namnutrymmesprefixsökning för detaljer om algoritmen som används av denna metod. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate)(RequestMessage) | Laddar dokumentet baserat på angivet förfrågningsobjekt och ersätter det tidigare innehållet. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_4)(string) | Laddar dokumentet på den angivna URL-adressen (Uniform Resource Locator) till den aktuella instansen och ersätter det tidigare innehållet. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_1)(Url) | Laddar dokumentet på den angivna URL-adressen (Uniform Resource Locator) till den aktuella instansen och ersätter det tidigare innehållet. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_3)(Stream, string) | Laddar dokumentet från angivet innehåll och använder baseUri för att lösa relativa resurser, ersätter det tidigare innehållet. Dokumentladdning startar från den aktuella positionen i strömmen. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_2)(Stream, Url) | Laddar dokumentet från angivet innehåll och använder baseUri för att lösa relativa resurser, ersätter det tidigare innehållet. Dokumentladdning startar från den aktuella positionen i strömmen. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_6)(string, string) | Laddar dokumentet från angivet innehåll och använder baseUri för att lösa relativa resurser, ersätter det tidigare innehållet. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_5)(string, Url) | Laddar dokumentet från angivet innehåll och använder baseUri för att lösa relativa resurser, ersätter det tidigare innehållet. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Lägger alla textnoder i underträdets fulla djup under denna nod, inklusive attributnoder, i en "normal" form där endast struktur (t.ex. element, kommentarer, bearbetningsinstruktioner, CDATA-sektioner och entitetsreferenser) separerar text noder, dvs det finns varken intilliggande textnoder eller tomma textnoder. Detta kan användas för att säkerställa att DOM-vyn för ett dokument är densamma som om det sparades och laddades om, och är användbart när operationer (som XPointer [XPointer]-uppslagningar) som beror på en viss dokumentträdstruktur ska användas. Om parametern "normalize-characters" för DOMConfiguration-objektet som är kopplat till Node.ownerDocument är sant, kommer denna metod också att helt normalisera tecknen i Textnoderna. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector)(string) | Returnerar det första elementet i dokumentet, som matchar selector |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall)(string) | Returnerar en nodlista över alla element i dokumentet, som matchar selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Tar bort den underordnade noden som indikeras av oldChild från listan över barn och returnerar den. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) tas bort från en[`EventTarget`](../eventtarget) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) tas bort från en[`EventTarget`](../eventtarget) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) tas bort från en[`EventTarget`](../eventtarget) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto)(IDevice) | Denna metod används för att återge innehållet i det aktuella dokumentet till en specificerad grafisk enhet. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Ersätter barnnoden oldChild med newChild i listan över barn och returnerar oldChild-noden. Om newChild är ett DocumentFragment-objekt ersätts oldChild av alla DocumentFragment-underordnade, som infogas i samma ordning. Om det nya barnet redan finns i trädet tas det först bort. |
| override [ToString](../../aspose.svg.dom/node/tostring)() | Returnerar enString som representerar denna instans. |
| [Write](../../aspose.svg.dom/document/write)(params string[]) | Skriv en textsträng till en dokumentström som öppnas av open(). Observera att funktionen kommer att producera ett document som inte nödvändigtvis drivs av en DTD och därför kan producera ett ogiltigt resultat i dokumentets sammanhang. |
| [WriteLn](../../aspose.svg.dom/document/writeln)(params string[]) | Skriv en textsträng följt av ett nyradstecken till en document -ström som öppnas av open(). Observera att funktionen kommer att producera ett dokument som inte nödvändigtvis drivs av en DTD och därför kan ge ett ogiltigt resultat i sammanhanget av document |

### Se även

* class [Node](../node)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal)
* interface [IGlobalEventHandlers](../iglobaleventhandlers)
* interface [INonElementParentNode](../inonelementparentnode)
* interface [IParentNode](../iparentnode)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator)
* namnutrymme [Aspose.Svg.Dom](../../aspose.svg.dom)
* hopsättning [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
