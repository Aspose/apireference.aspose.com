---
title: Class SVGSVGElement
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.SVGSVGElement klass. En nyckelgränssnittsdefinition är SVGSVGElementgränssnittet vilket är det gränssnitt som motsvarar svgelementet. Det här gränssnittet innehåller olika vanligt använda verktygsmetoder såsom matrisoperationer och möjligheten att kontrollera tiden för omritning på visuella renderingsenheter.
type: docs
weight: 3440
url: /sv/net/aspose.svg/svgsvgelement/
---
## SVGSVGElement class

En nyckelgränssnittsdefinition är SVGSVGElement-gränssnittet, vilket är det gränssnitt som motsvarar "svg"-elementet. Det här gränssnittet innehåller olika vanligt använda verktygsmetoder, såsom matrisoperationer och möjligheten att kontrollera tiden för omritning på visuella renderingsenheter.

```csharp
public class SVGSVGElement : SVGGraphicsElement, IDocumentEvent, ISVGFitToViewBox, ISVGZoomAndPan
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | En NamedNodeMap som innehåller attributen för denna nod (om det är ett element) eller null på annat sätt. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Den absoluta bas-URI för denna nod eller noll om implementeringen inte kunde erhålla en absolut URI. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | Returnerar det aktuella antalet elementnoder som är barn till detta element. 0 om detta element inte har några underordnade noder som är av nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | En nodlista som innehåller alla underordnade till denna nod. Om det inte finns några underordnade, är detta en nodlista som inte innehåller några noder.. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | Returnerar de underordnade elementen för det aktuella elementet. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | Returnerar en levande DOMTokenList som innehåller tokens som tagits emot från att analysera "class"-attributet. |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | Motsvarar attributet 'class' på det givna elementet. |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | Klassattributet för elementet. Det här attributet har bytt namn till due till konflikter med nyckelordet "class" som exponeras av många språk. Se klassattributdefinitionen i HTML 4.01. |
| [CurrentScale](../../aspose.svg/svgsvgelement/currentscale/) { get; set; } | På ett yttersta svg-element indikerar detta attribut den aktuella skalfaktorn i förhållande till den initiala vyn för att ta hänsyn till användarförstoring och panorering, som beskrivs under Förstoring och panorering. DOM-attributen currentScale och currentTranslate är ekvivalenta med 2x3-matrisen [abcdef] = [currentScale 0 0 currentScale currentTranslate.x currentTranslate.y]. Om "förstoring" är aktiverat (dvs zoomAndPan="förstora"), är effekten som om en extra transformation placerades på den yttersta nivån på SVG-dokumentfragmentet (dvs utanför det yttersta svg-elementet). När den öppnas på ett 'svg'-element som inte är ett yttersta svg-element, det är odefinierat vilket beteende detta attribut har. |
| [CurrentTranslate](../../aspose.svg/svgsvgelement/currenttranslate/) { get; } | På ett yttersta svg-element, motsvarande översättningsfaktor som tar hänsyn till användarens "förstoring". När det öppnas på ett "svg"-element som inte är ett yttersta svg-element är det odefinierat vilket beteende detta attribut har. |
| [FarthestViewportElement](../../aspose.svg/svggraphicselement/farthestviewportelement/) { get; } | Det mest avlägsna förfaderns "svg"-element. Null om det aktuella elementet är det yttersta svg-elementet. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Det första barnet i denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | Returnerar den första underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| [Height](../../aspose.svg/svgsvgelement/height/) { get; } | Motsvarar attributet 'höjd' på det givna 'svg'-elementet. |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | Värdet för 'id'-attributet på det givna elementet, eller den tomma strängen om 'id' inte finns. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | Returnerar ett fragment av HTML eller XML som representerar elementets innehåll. Kan ställas in för att ersätta innehållet i elementet med noder tolkade från den givna strängen. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Det sista underordnade av denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | Returnerar den sista underordnade elementnoden för detta element. null om detta element inte har några underordnade element. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | Returnerar den lokala delen av det kvalificerade namnet på denna nod. För noder av någon annan typ än ELEMENT_NODE och ATTRIBUTE_NODE och noder skapade med en DOM Level 1-metod, som Document.createElement(), är detta alltid null. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | Namnutrymmets URI för denna nod, eller null om den är ospecificerad. |
| [NearestViewportElement](../../aspose.svg/svggraphicselement/nearestviewportelement/) { get; } | Elementet som etablerade den aktuella visningsporten. Ofta är det närmaste förfaderns "svg"-element. Null om det aktuella elementet är det yttersta svg-elementet. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | Returnerar nästa syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer efter detta i dokumentträdet. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Noden omedelbart efter denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | Namnet på denna nod, beroende på dess typ. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | En kod som representerar typen av det underliggande objektet. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Värdet för denna nod, beroende på dess typ. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | Returnerar ett fragment av HTML eller XML som representerar elementet och dess innehåll. Kan ställas in för att ersätta elementet med noder tolkade från den givna strängen. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Dokumentobjektet som är associerat med denna nod. Detta är också dokumentobjektet som används för att skapa nya noder. När denna nod är ett dokument eller en DocumentType som inte används med något dokument ännu, är detta null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | Det närmaste förfaderns "svg"-element. Null om det givna elementet är det yttersta svg-elementet. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Hämtar föräldern[`Element`](../../aspose.svg.dom/element/) av denna nod. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Föräldern till denna nod. Alla noder, utom Attr, Document, DocumentFragment, Entity och Notation kan ha en förälder. Men om en nod just har skapats och ännu inte lagts till i trädet, eller om den har tagits bort från trädet, är detta null. |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | Namnutrymmesprefixet för denna nod, eller null om det är ospecificerat. När den är definierad som null har inställningen ingen effekt |
| [PreserveAspectRatio](../../aspose.svg/svgsvgelement/preserveaspectratio/) { get; } | Motsvarar attributet 'preserveAspectRatio' på det givna elementet. |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | Returnerar föregående syskonelementnod för detta element. null om detta element inte har några element syskonnoder som kommer före detta i dokumentträdet. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Noden omedelbart före denna nod. Om det inte finns någon sådan nod returnerar detta null. |
| [RequiredExtensions](../../aspose.svg/svggraphicselement/requiredextensions/) { get; } | Motsvarar attributet 'requiredExtensions' på det givna elementet. |
| [RequiredFeatures](../../aspose.svg/svggraphicselement/requiredfeatures/) { get; } | Motsvarar attributet 'requiredFeatures' på det givna elementet. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | Typinformationen som är associerad med detta element. |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | Returnerar shadowRoot lagrad på detta element eller null om det är stängt. |
| [Style](../../aspose.svg/svgelement/style/) { get; } | Motsvarar attributet 'stil' på det givna elementet. Om användaragenten inte stöder styling med CSS måste detta attribut alltid ha värdet null. |
| [SystemLanguage](../../aspose.svg/svggraphicselement/systemlanguage/) { get; } | Motsvarar attributet 'systemLanguage' på det givna elementet. |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | Namnet på elementet. |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | Detta attribut returnerar textinnehållet för denna nod och dess avkomlingar. När den är definierad som null har inställningen ingen effekt. Vid inställning tas alla möjliga barn bort som denna nod kan ha och, om den nya strängen inte är tom eller null, ersätts den av en enda textnod som innehåller strängen som detta attribut är inställt på. |
| [Transform](../../aspose.svg/svggraphicselement/transform/) { get; } | Motsvarar attributet 'transform' på det givna elementet. |
| [ViewBox](../../aspose.svg/svgsvgelement/viewbox/) { get; } | Motsvarar attributet 'viewBox' på det givna elementet. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | Elementet som etablerade den aktuella visningsporten. Ofta är det närmaste förfaderns "svg"-element. Null om det givna elementet är det yttersta svg-elementet. |
| [Width](../../aspose.svg/svgsvgelement/width/) { get; } | Motsvarar attributet 'width' på det givna 'svg'-elementet. |
| [X](../../aspose.svg/svgsvgelement/x/) { get; } | Motsvarar attributet 'x' på det givna 'svg'-elementet. |
| [Y](../../aspose.svg/svgsvgelement/y/) { get; } | Motsvarar attributet 'y' på det givna 'svg'-elementet. |
| [ZoomAndPan](../../aspose.svg/svgsvgelement/zoomandpan/) { get; set; } | Motsvarar attributet 'zoomAndPan' på det givna elementet. Värdet måste vara en av SVG_ZOOMANDPAN_*-konstanterna som definierats i detta gränssnitt. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AnimationsPaused](../../aspose.svg/svgsvgelement/animationspaused/)() | Returnerar sant om detta SVG-dokumentfragment är i pausat tillstånd. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Lägger till noden newChild i slutet av listan över underordnade till denna nod. Om det nya barnet redan finns i trädet tas det först bort. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | Skapar skuggrot och fäster den till aktuellt element. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Returnerar en dubblett av denna nod, dvs fungerar som en generisk kopiakonstruktor för noder. Dubblettnoden har ingen förälder (parentNode är null) och inga användardata. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Returnerar en dubblett av denna nod, dvs fungerar som en generisk kopiakonstruktor för noder. Dubblettnoden har ingen förälder (parentNode är null) och inga användardata. |
| [CreateEvent](../../aspose.svg/svgsvgelement/createevent/)(string) | Skapar en[`Event`](../../aspose.svg.dom.events/event/) av en typ som stöds av implementeringen. |
| [CreateSVGAngle](../../aspose.svg/svgsvgelement/createsvgangle/)() | Skapar ett SVGAngle-objekt utanför alla dokumentträd. Objektet initieras till värdet 0 grader (enhetslös). |
| [CreateSVGLength](../../aspose.svg/svgsvgelement/createsvglength/)() | Skapar ett SVGLength-objekt utanför alla dokumentträd. Objektet initieras till värdet 0 användarenheter. |
| [CreateSVGMatrix](../../aspose.svg/svgsvgelement/createsvgmatrix/)() | Skapar ett SVGMatrix-objekt utanför alla dokumentträd. Objektet initieras till identitetsmatrisen. |
| [CreateSVGNumber](../../aspose.svg/svgsvgelement/createsvgnumber/)() | Skapar ett SVGNumber-objekt utanför alla dokumentträd. Objektet initieras till värdet noll. |
| [CreateSVGPoint](../../aspose.svg/svgsvgelement/createsvgpoint/)() | Skapar ett SVGPoint-objekt utanför alla dokumentträd. Objektet initieras till punkten (0,0) i användarens koordinatsystem. |
| [CreateSVGRect](../../aspose.svg/svgsvgelement/createsvgrect/)() | Skapar ett SVGRect-objekt utanför alla dokumentträd. Objektet initieras så att alla värden sätts till 0 användarenheter. |
| [CreateSVGTransform](../../aspose.svg/svgsvgelement/createsvgtransform/)() | Skapar ett SVGTransform-objekt utanför alla dokumentträd. Objektet initieras till en identitetsmatristransform (SVG_TRANSFORM_MATRIX). |
| [CreateSVGTransformFromMatrix](../../aspose.svg/svgsvgelement/createsvgtransformfrommatrix/)(SVGMatrix) | Skapar ett SVGTransform-objekt utanför alla dokumentträd. Objektet initieras till den givna matristransformen (dvs SVG_TRANSFORM_MATRIX). Värdena från parametermatrisen kopieras, matrisparametern används inte som SVGTransform::matrix. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Denna metod tillåter sändning av händelser till implementeringshändelsemodellen. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Utför programdefinierade uppgifter associerade med att frigöra, frigöra eller återställa ohanterade resurser. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | Hämtar ett attributvärde efter namn. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | Hämtar en attributnod efter namn. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | Hämtar en Attr-nod efter lokalt namn och namnutrymmes-URI. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | Hämtar ett attributvärde efter lokalt namn och namnutrymmes-URI. |
| [GetBBox](../../aspose.svg/svggraphicselement/getbbox/)() | Returnerar den snäva begränsningsrutan i det aktuella användarutrymmet (dvs. efter applicering av 'transform'-attributet, om det finns) på geometrin för alla ingående grafiska element, exklusive sträckning, klippning, maskering och filtereffekter). Observera att getBBox måste returnera den faktiska begränsningsrutan vid den tidpunkt då metoden anropades, även om elementet ännu inte har renderats. |
| [GetCTM](../../aspose.svg/svggraphicselement/getctm/)() | Returnerar transformationsmatrisen från nuvarande användarenheter (dvs. efter applicering av "transform"-attributet, om det finns) till viewport-koordinatsystemet för närmasteViewportElement. |
| [GetCurrentTime](../../aspose.svg/svgsvgelement/getcurrenttime/)() | Returnerar den aktuella tiden i sekunder i förhållande till starttiden för det aktuella SVG-dokumentfragmentet. Om getCurrentTime anropas innan dokumentets tidslinje har börjat (till exempel genom att skript körs i ett 'script'-element innan dokumentets SVGLoad-händelse skickas), så returneras 0. |
| [GetElementById](../../aspose.svg/svgsvgelement/getelementbyid/)(string) | Söker i detta SVG-dokumentfragment (dvs sökningen är begränsad till en delmängd av dokumentträdet) efter ett element vars id ges av elementId. Om ett element hittas, returneras det elementet. Om inget sådant element finns, returneras null. Beteende är inte definierat om mer än ett element har detta id. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | Returnerar ett levande NodeList-objekt som innehåller alla element i dokumentet som har alla klasser som anges i argument. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | Returnerar en nodlista över alla underordnade element med ett givet taggnamn, i dokumentordning. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | Returnerar en nodlista med alla underordnade element med ett givet lokalt namn och namnområdes-URI i dokumentordning. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Denna metod används för att hämta ECMAScript-objektType . |
| [GetScreenCTM](../../aspose.svg/svggraphicselement/getscreenctm/)() | Returnerar transformationsmatrisen från nuvarande användarenheter (dvs. efter applicering av "transform"-attributet, om det finns) till den överordnade användaragentens meddelande om en "pixel". För visningsenheter representerar detta idealiskt en fysisk skärmpixel. För andra enheter eller miljöer där fysiska pixelstorlekar inte är kända, kan en algoritm som liknar CSS2-definitionen av en "pixel" istället användas. Observera att null returneras om detta element inte är kopplat till dokumentträdet. Denna metod skulle ha fått ett mer passande namn som getClientCTM, men namnet getScreenCTM behålls av historiska skäl. |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | Returnerar sant när ett attribut med ett givet namn anges på detta element eller har ett standardvärde, annars falskt. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | Returnerar sant när ett attribut med ett givet lokalt namn och namnområdes-URI anges på detta element eller har ett standardvärde, annars falskt. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | Returnerar om denna nod (om det är ett element) har några attribut |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Returnerar om denna nod har några barn. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Infogar noden före det befintliga underordnade nodbarnet. Om child är null, infoga nod i slutet av listan med barn. Om child är ett DocumentFragment-objekt, infogas alla dess underordnade, i samma ordning, före child. Om barnet redan finns i trädet tas det först bort. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Den här metoden kontrollerar om det angivna namnutrymmet-URI är standardnamnutrymmet eller inte. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Testar om två noder är lika. Denna metod testar likadana noder, inte likhet (dvs om de två noderna är referenser till samma objekt) som kan testas med Node.isSameNode(). Alla noder som är lika kommer också att vara lika, även om det omvända kanske inte är sant. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Returnerar om denna nod är samma nod som den givna. Den här metoden ger ett sätt att avgöra om två nodreferenser som returneras av implementeringen refererar till samma objekt. När två nodreferenser är referenser till samma objekt, även om genom en proxy, kan referenserna användas helt utbytbart, så att alla attribut har samma värden och att anropa samma DOM-metod på någon av referenserna har alltid exakt samma effekt. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Slå upp namnutrymmes-URI som är kopplat till det givna prefixet, med början från denna nod. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Slå upp prefixet som är associerat med den givna namnutrymmes-URI, med början från denna nod. Standardnamnområdesdeklarationerna ignoreras av den här metoden. Se Namnutrymmesprefixsökning för detaljer om algoritmen som används av denna metod. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Lägger alla textnoder i underträdets fulla djup under denna nod, inklusive attributnoder, i en "normal" form där endast struktur (t.ex. element, kommentarer, bearbetningsinstruktioner, CDATA-sektioner och entitetsreferenser) separerar text noder, dvs det finns varken intilliggande textnoder eller tomma textnoder. Detta kan användas för att säkerställa att DOM-vyn för ett dokument är densamma som om det sparades och laddades om, och är användbart när operationer (som XPointer [XPointer]-uppslagningar) som beror på en viss dokumentträdstruktur ska användas. Om parametern "normalize-characters" för DOMConfiguration-objektet som är kopplat till Node.ownerDocument är sant, kommer denna metod också att helt normalisera tecknen i Textnoderna. |
| [PauseAnimations](../../aspose.svg/svgsvgelement/pauseanimations/)() | Stänger av (dvs. pausar) alla körande animeringar som är definierade i SVG-dokumentfragmentet som motsvarar detta 'svg'-element, vilket gör att animeringsklockan som motsvarar detta dokumentfragment står stilla tills den återupptas. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | Returnerar det första elementet i dokumentet, som matchar selector |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | Returnerar en nodlista över alla element i dokumentet, som matchar selector |
| [Remove](../../aspose.svg.dom/element/remove/)() | Tar bort den här instansen. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | Tar bort ett attribut efter namn. |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | Tar bort den angivna attributnoden. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | Tar bort ett attribut efter lokalt namn och namnutrymmes-URI. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Tar bort den underordnade noden som indikeras av oldChild från listan över barn och returnerar den. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Ersätter barnnoden oldChild med newChild i listan över barn och returnerar oldChild-noden. Om newChild är ett DocumentFragment-objekt ersätts oldChild av alla DocumentFragment-underordnade, som infogas i samma ordning. Om det nya barnet redan finns i trädet tas det först bort. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | Lägger till ett nytt attribut. Om ett attribut med det namnet redan finns i elementet ändras dess värde till att vara värdet parameter |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | Lägger till en ny attributnod. Om ett attribut med det namnet (nodeName) redan finns i elementet ersätts det med det nya. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | Lägger till ett nytt attribut. Om ett attribut med det lokala namnet och den namnutrymmets URI redan finns i elementet ersätts det av det nya. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | Lägger till ett nytt attribut. Om ett attribut med samma lokala namn och namnområdes-URI redan finns på elementet, ändras dess prefix till att vara prefixdelen av qualifiedName och dess värde ändras till värdeparametern. |
| [SetCurrentTime](../../aspose.svg/svgsvgelement/setcurrenttime/)(float) | Justerar klockan för detta SVG-dokumentfragment och etablerar en ny aktuell tid. Om setCurrentTime anropas innan dokumentets tidslinje har börjat (till exempel genom att skript körs i ett 'script'-element innan dokumentets SVGLoad-händelse skickas), så anger värdet av sekunder i den senaste anropet av metoden den tid som dokumentet kommer att söka när dokumentets tidslinje har börjat. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | Om parametern isId är sant, deklarerar den här metoden att det angivna attributet är ett användarbestämt ID-attribut. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | Om parametern isId är sant, deklarerar den här metoden att det angivna attributet är ett användarbestämt ID-attribut. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | Om parametern isId är sant, deklarerar den här metoden att det angivna attributet är ett användarbestämt ID-attribut. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Returnerar enString som representerar denna instans. |
| [UnpauseAnimations](../../aspose.svg/svgsvgelement/unpauseanimations/)() | Avbryter (dvs återställer) körande animeringar som är definierade i SVG-dokumentfragmentet, vilket gör att animeringsklockan fortsätter från den tidpunkt då den avbröts. |

### Se även

* class [SVGGraphicsElement](../svggraphicselement/)
* interface [ISVGFitToViewBox](../isvgfittoviewbox/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IViewCSS](../../aspose.svg.dom.css/iviewcss/)
* interface [IDocumentCSS](../../aspose.svg.dom.css/idocumentcss/)
* interface [ISVGZoomAndPan](../isvgzoomandpan/)
* namnutrymme [Aspose.Svg](../../aspose.svg/)
* hopsättning [Aspose.SVG](../../)


