---
title: Class SVGSVGElement
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.SVGSVGElement klas. Een belangrijke interfacedefinitie is de SVGSVGElementinterface de interface die overeenkomt met het svgelement. Deze interface bevat verschillende veelgebruikte hulpprogrammas zoals matrixbewerkingen en de mogelijkheid om de tijd van opnieuw tekenen op visuele weergaveapparaten te regelen.
type: docs
weight: 3440
url: /nl/net/aspose.svg/svgsvgelement/
---
## SVGSVGElement class

Een belangrijke interfacedefinitie is de SVGSVGElement-interface, de interface die overeenkomt met het 'svg'-element. Deze interface bevat verschillende veelgebruikte hulpprogramma's, zoals matrixbewerkingen en de mogelijkheid om de tijd van opnieuw tekenen op visuele weergaveapparaten te regelen.

```csharp
public class SVGSVGElement : SVGGraphicsElement, IDocumentEvent, ISVGFitToViewBox, ISVGZoomAndPan
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | Een NamedNodeMap met de attributen van dit knooppunt (als het een Element is) of anders nul. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | De absolute basis-URI van dit knooppunt of null als de implementatie geen absolute URI kon verkrijgen. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | Retourneert het huidige aantal elementknooppunten dat kinderen zijn van dit element. 0 als dit element geen onderliggende knooppunten heeft die van nodeType 1. zijn |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Een NodeList die alle kinderen van deze node bevat. Als er geen kinderen zijn, is dit een NodeList die geen nodes bevat.. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | Retourneert de onderliggende elementen van het huidige element. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | Retourneert een live DOMTokenList die tokens bevat die zijn ontvangen door het "class"-attribuut te ontleden. |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | Komt overeen met attribuut 'class' op het gegeven element. |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | Het klassekenmerk van het element. Dit attribuut is hernoemd due vanwege conflicten met het sleutelwoord "class" dat in veel talen wordt gebruikt. See de class attribuutdefinitie in HTML 4.01. |
| [CurrentScale](../../aspose.svg/svgsvgelement/currentscale/) { get; set; } | Op een buitenste svg-element geeft dit attribuut de huidige schaalfactor aan ten opzichte van de initiële weergave om rekening te houden met vergrotings- en panbewerkingen van de gebruiker, zoals beschreven onder Vergroting en panning. DOM-attributen currentScale en currentTranslate zijn gelijk aan de 2x3 matrix [abcdef] = [currentScale 0 0 currentScale currentTranslate.x currentTranslate.y]. Als "vergroting" is ingeschakeld (dwz zoomAndPan="magnify"), dan is het effect alsof er een extra transformatie is geplaatst op het buitenste niveau van het SVG-documentfragment (dwz buiten het buitenste svg-element). Bij toegang op een 'svg'-element dat geen buitenste svg-element is, is het ongedefinieerd welk gedrag dit attribuut heeft. |
| [CurrentTranslate](../../aspose.svg/svgsvgelement/currenttranslate/) { get; } | Op een buitenste svg-element, de overeenkomstige vertaalfactor die rekening houdt met de "vergroting" van de gebruiker. Bij toegang tot een 'svg'-element dat geen buitenste svg-element is, is het ongedefinieerd welk gedrag dit attribuut heeft. |
| [FarthestViewportElement](../../aspose.svg/svggraphicselement/farthestviewportelement/) { get; } | Het verst verwijderde 'svg'-element van de voorouder. Null als het huidige element het buitenste svg-element is. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Het eerste kind van dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | Retourneert het eerste onderliggende elementknooppunt van dit element. null als dit element geen onderliggende elementen heeft. |
| [Height](../../aspose.svg/svgsvgelement/height/) { get; } | Komt overeen met attribuut 'height' op het opgegeven 'svg'-element. |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | De waarde van het 'id' attribuut op het gegeven element, of de lege string als 'id' niet aanwezig is. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | Retourneert een HTML- of XML-fragment dat de inhoud van het element vertegenwoordigt. Kan worden ingesteld om de inhoud van het element te vervangen door knooppunten die zijn geparseerd uit de opgegeven tekenreeks. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Het laatste kind van dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | Geeft het laatste onderliggende elementknooppunt van dit element terug. null als dit element geen onderliggende elementen heeft. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | Retourneert het lokale deel van de gekwalificeerde naam van dit knooppunt. Voor knooppunten van een ander type dan ELEMENT_NODE en ATTRIBUTE_NODE en knooppunten gemaakt met een DOM Level 1-methode, zoals Document.createElement(), is dit altijd null. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | De naamruimte-URI van dit knooppunt, of null als deze niet is gespecificeerd. |
| [NearestViewportElement](../../aspose.svg/svggraphicselement/nearestviewportelement/) { get; } | Het element dat de huidige viewport tot stand heeft gebracht. Vaak het dichtstbijzijnde voorouder 'svg' element. Null als het huidige element het buitenste svg-element is. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | Retourneert het volgende elementknooppunt van dit element. null als dit element geen element-zusterknooppunten heeft die na dit element in de documentstructuur komen. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Het knooppunt dat onmiddellijk volgt op dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | De naam van dit knooppunt, afhankelijk van het type. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | Een code die het type van het onderliggende object vertegenwoordigt. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | De waarde van dit knooppunt, afhankelijk van het type. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | Retourneert een HTML- of XML-fragment dat het element en zijn inhoud vertegenwoordigt. Kan worden ingesteld om het element te vervangen door knooppunten die zijn geparseerd uit de opgegeven tekenreeks. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Het documentobject dat aan dit knooppunt is gekoppeld. Dit is ook het documentobject dat wordt gebruikt om nieuwe knooppunten te maken. Als dit knooppunt een document is of een documenttype dat nog niet met een document wordt gebruikt, is dit null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | Het dichtstbijzijnde voorouderlijke 'svg'-element. Null als het gegeven element het buitenste svg-element is. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Haalt de ouder op[`Element`](../../aspose.svg.dom/element/) van dit knooppunt. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | De ouder van dit knooppunt. Alle knooppunten, behalve Attr, Document, DocumentFragment, Entity en Notation kunnen een ouder hebben. Als een knooppunt echter net is gemaakt en nog niet aan de boom is toegevoegd, of als het uit de boom is verwijderd, is dit null. |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | Het naamruimtevoorvoegsel van dit knooppunt, of null als het niet is gespecificeerd. Als het is gedefinieerd als null, heeft het instellen ervan geen effect |
| [PreserveAspectRatio](../../aspose.svg/svgsvgelement/preserveaspectratio/) { get; } | Komt overeen met attribuut 'preserveAspectRatio' op het gegeven element. |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | Retourneert het vorige elementknooppunt van dit element. null als dit element geen element-zusterknooppunten heeft die vóór dit element in de documentstructuur komen. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Het knooppunt dat onmiddellijk aan dit knooppunt voorafgaat. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [RequiredExtensions](../../aspose.svg/svggraphicselement/requiredextensions/) { get; } | Komt overeen met attribuut 'requiredExtensions' op het gegeven element. |
| [RequiredFeatures](../../aspose.svg/svggraphicselement/requiredfeatures/) { get; } | Komt overeen met attribuut 'requiredFeatures' op het gegeven element. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | De type-informatie die aan dit element is gekoppeld. |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | Retourneert shadowRoot opgeslagen op dit element of null als het gesloten is. |
| [Style](../../aspose.svg/svgelement/style/) { get; } | Komt overeen met attribuut 'style' op het gegeven element. Als de user agent styling met CSS niet ondersteunt, dan moet dit attribuut altijd de waarde null hebben. |
| [SystemLanguage](../../aspose.svg/svggraphicselement/systemlanguage/) { get; } | Komt overeen met attribuut 'systemLanguage' op het gegeven element. |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | De naam van het element. |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | Dit attribuut retourneert de tekstinhoud van dit knooppunt en zijn afstammelingen. Als het is gedefinieerd als null, heeft het instellen ervan geen effect. Bij het instellen worden alle mogelijke kinderen die dit knooppunt heeft verwijderd en, als de nieuwe tekenreeks niet leeg of null is, vervangen door een enkel tekstknooppunt dat de tekenreeks bevat waarop dit kenmerk is ingesteld. |
| [Transform](../../aspose.svg/svggraphicselement/transform/) { get; } | Komt overeen met attribuut 'transform' op het gegeven element. |
| [ViewBox](../../aspose.svg/svgsvgelement/viewbox/) { get; } | Komt overeen met attribuut 'viewBox' op het gegeven element. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | Het element dat de huidige viewport tot stand heeft gebracht. Vaak het dichtstbijzijnde voorouder 'svg' element. Null als het gegeven element het buitenste svg-element is. |
| [Width](../../aspose.svg/svgsvgelement/width/) { get; } | Komt overeen met attribuut 'width' op het opgegeven 'svg'-element. |
| [X](../../aspose.svg/svgsvgelement/x/) { get; } | Komt overeen met attribuut 'x' op het opgegeven 'svg'-element. |
| [Y](../../aspose.svg/svgsvgelement/y/) { get; } | Komt overeen met attribuut 'y' op het opgegeven 'svg'-element. |
| [ZoomAndPan](../../aspose.svg/svgsvgelement/zoomandpan/) { get; set; } | Komt overeen met attribuut 'zoomAndPan' op het gegeven element. De waarde moet een van de SVG_ZOOMANDPAN_*-constanten zijn die op deze interface zijn gedefinieerd. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Met deze methode kunnen gebeurtenislisteners worden geregistreerd op het gebeurtenisdoel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Met deze methode kunnen gebeurtenislisteners worden geregistreerd op het gebeurtenisdoel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Met deze methode kunnen gebeurtenislisteners worden geregistreerd op het gebeurtenisdoel. |
| [AnimationsPaused](../../aspose.svg/svgsvgelement/animationspaused/)() | Retourneert waar als dit SVG-documentfragment zich in een onderbroken status bevindt. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Voegt het knooppunt newChild toe aan het einde van de lijst met kinderen van dit knooppunt. Als de newChild al in de stamboom staat, wordt deze eerst verwijderd. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | Creëert een schaduwwortel en koppelt deze aan het huidige element. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Retourneert een duplicaat van dit knooppunt, dwz dient als generieke kopieerconstructor voor knooppunten. Het gedupliceerde knooppunt heeft geen ouder (parentNode is null) en geen gebruikersgegevens. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Retourneert een duplicaat van dit knooppunt, dwz dient als generieke kopieerconstructor voor knooppunten. Het gedupliceerde knooppunt heeft geen ouder (parentNode is null) en geen gebruikersgegevens. |
| [CreateEvent](../../aspose.svg/svgsvgelement/createevent/)(string) | Creëert een[`Event`](../../aspose.svg.dom.events/event/) van een type dat wordt ondersteund door de implementatie. |
| [CreateSVGAngle](../../aspose.svg/svgsvgelement/createsvgangle/)() | Maakt een SVGAngle-object buiten de documentstructuren. Het object wordt geïnitialiseerd op de waarde 0 graden (eenheidloos). |
| [CreateSVGLength](../../aspose.svg/svgsvgelement/createsvglength/)() | Maakt een SVGLength-object buiten de documentstructuren. Het object wordt geïnitialiseerd op de waarde van 0 gebruikerseenheden. |
| [CreateSVGMatrix](../../aspose.svg/svgsvgelement/createsvgmatrix/)() | Maakt een SVGMatrix-object buiten de documentstructuren. Het object wordt geïnitialiseerd naar de identiteitsmatrix. |
| [CreateSVGNumber](../../aspose.svg/svgsvgelement/createsvgnumber/)() | Maakt een SVGNumber-object buiten de documentstructuren. Het object wordt geïnitialiseerd op een waarde van nul. |
| [CreateSVGPoint](../../aspose.svg/svgsvgelement/createsvgpoint/)() | Maakt een SVGPoint-object buiten de documentstructuren. Het object wordt geïnitialiseerd naar het punt (0,0) in het gebruikerscoördinatensysteem. |
| [CreateSVGRect](../../aspose.svg/svgsvgelement/createsvgrect/)() | Maakt een SVGRect-object buiten de documentstructuren. Het object wordt zo geïnitialiseerd dat alle waarden worden ingesteld op 0 gebruikerseenheden. |
| [CreateSVGTransform](../../aspose.svg/svgsvgelement/createsvgtransform/)() | Maakt een SVGTransform-object buiten de documentstructuren. Het object wordt geïnitialiseerd naar een identiteitsmatrixtransformatie (SVG_TRANSFORM_MATRIX). |
| [CreateSVGTransformFromMatrix](../../aspose.svg/svgsvgelement/createsvgtransformfrommatrix/)(SVGMatrix) | Maakt een SVGTransform-object buiten de documentstructuren. Het object wordt geïnitialiseerd naar de gegeven matrixtransformatie (dwz SVG_TRANSFORM_MATRIX). De waarden uit de parametermatrix worden gekopieerd, de matrixparameter wordt niet overgenomen als SVGTransform::matrix. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Met deze methode kunnen gebeurtenissen worden verzonden naar het gebeurtenismodel van de implementatie. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Voert door de toepassing gedefinieerde taken uit die verband houden met het vrijmaken, vrijgeven of resetten van onbeheerde bronnen. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | Haalt een attribuutwaarde op naam op. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | Haalt een attribuutknooppunt op naam op. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | Haalt een Attr-knooppunt op met lokale naam en naamruimte-URI. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | Haalt een attribuutwaarde op door lokale naam en naamruimte-URI. |
| [GetBBox](../../aspose.svg/svggraphicselement/getbbox/)() | Retourneert het strakke begrenzingskader in de huidige gebruikersruimte (dwz na toepassing van het 'transform'-attribuut, indien aanwezig) op de geometrie van alle grafische elementen, exclusief strelen, knippen, maskeren en filtereffecten). Merk op dat getBBox het daadwerkelijke begrenzingskader moet retourneren op het moment dat de methode werd aangeroepen, zelfs als het element nog niet is weergegeven. |
| [GetCTM](../../aspose.svg/svggraphicselement/getctm/)() | Retourneert de transformatiematrix van huidige gebruikerseenheden (dwz na toepassing van het 'transform'-attribuut, indien aanwezig) naar het viewport-coördinatensysteem voor het dichtstbijzijndeViewportElement. |
| [GetCurrentTime](../../aspose.svg/svgsvgelement/getcurrenttime/)() | Retourneert de huidige tijd in seconden ten opzichte van de starttijd voor het huidige SVG-documentfragment. Als getCurrentTime wordt aangeroepen voordat de documenttijdlijn is begonnen (bijvoorbeeld doordat een script wordt uitgevoerd in een 'script'-element voordat de SVGLoad-gebeurtenis van het document wordt verzonden), wordt 0 geretourneerd. |
| [GetElementById](../../aspose.svg/svgsvgelement/getelementbyid/)(string) | Zoekt in dit SVG-documentfragment (dwz de zoekopdracht is beperkt tot een subset van de documentstructuur) naar een element waarvan de id wordt gegeven door elementId. Als een Element wordt gevonden, wordt dat Element geretourneerd. Als een dergelijk element niet bestaat, wordt null geretourneerd. Gedrag wordt niet gedefinieerd als meer dan één element deze id heeft. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | Retourneert een live NodeList-object met alle elementen in het document waarvan alle klassen zijn opgegeven in argument. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | Retourneert een NodeList van alle onderliggende elementen met een gegeven tagnaam, in documentvolgorde. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | Retourneert een NodeList van alle onderliggende elementen met een gegeven lokale naam en naamruimte-URI in documentvolgorde. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| [GetScreenCTM](../../aspose.svg/svggraphicselement/getscreenctm/)() | Retourneert de transformatiematrix van huidige gebruikerseenheden (dwz na toepassing van het 'transform'-attribuut, indien aanwezig) naar de melding van een "pixel" van de bovenliggende user-agent. Voor weergaveapparaten vertegenwoordigt dit idealiter een fysieke schermpixel. Voor andere apparaten of omgevingen waarvan de fysieke pixelgrootte niet bekend is, kan in plaats daarvan een algoritme worden gebruikt dat lijkt op de CSS2-definitie van een "pixel". Merk op dat null wordt geretourneerd als dit element niet is gekoppeld aan de documentstructuur. Deze methode had beter getClientCTM kunnen heten, maar de naam getScreenCTM wordt om historische redenen behouden. |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | Retourneert true wanneer een attribuut met een bepaalde naam is opgegeven voor dit element of een standaardwaarde heeft, anders false. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | Retourneert waar wanneer een attribuut met een gegeven lokale naam en naamruimte-URI is opgegeven voor dit element of een standaardwaarde heeft, anders onwaar. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | Geeft terug of dit knooppunt (als het een element is) attributen heeft |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Geeft terug of dit knooppunt kinderen heeft. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Voegt het knooppunt in vóór het bestaande onderliggende knooppunt. Als kind null is, voegt u een knooppunt in aan het einde van de lijst met kinderen. Als kind een DocumentFragment-object is, worden alle kinderen in dezelfde volgorde ingevoegd vóór kind. Als het kind al in de boom zit, wordt het eerst verwijderd. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Deze methode controleert of de opgegeven naamruimte-URI de standaard naamruimte is of niet. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Test of twee knooppunten gelijk zijn. Deze methode test op gelijkheid van knooppunten, niet gelijkheid (dwz of de twee knooppunten verwijzingen naar hetzelfde object zijn), wat kan worden getest met Node.isSameNode(). Alle knooppunten die hetzelfde zijn, zullen ook gelijk zijn, hoewel het omgekeerde misschien niet waar is. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Geeft terug of dit knooppunt hetzelfde knooppunt is als het opgegeven knooppunt. Deze methode biedt een manier om te bepalen of twee Node-referenties die door de implementatie worden geretourneerd, naar hetzelfde object verwijzen. Wanneer twee Node-referenties verwijzingen zijn naar hetzelfde object, zelfs via een proxy, kunnen de referenties volledig onderling uitwisselbaar worden gebruikt, zodat alle attributen dezelfde waarden hebben en het aanroepen van dezelfde DOM-methode voor beide referenties altijd exact hetzelfde effect heeft. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Zoek de naamruimte-URI op die is gekoppeld aan het opgegeven voorvoegsel, beginnend vanaf dit knooppunt. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Zoek het voorvoegsel op dat is gekoppeld aan de opgegeven naamruimte-URI, beginnend bij dit knooppunt. De standaard naamruimtedeclaraties worden door deze methode genegeerd. Zie Namespace Prefix Lookup voor meer informatie over het algoritme dat door deze methode wordt gebruikt. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Zet alle tekstknooppunten in de volledige diepte van de subboom onder dit knooppunt, inclusief attribuutknooppunten, in een "normale" vorm waar alleen structuur (bijv. elementen, opmerkingen, verwerkingsinstructies, CDATA-secties en entiteitsreferenties) tekst scheidt knooppunten, dwz er zijn geen aangrenzende tekstknooppunten of lege tekstknooppunten. Dit kan worden gebruikt om ervoor te zorgen dat de DOM-weergave van een document hetzelfde is alsof het is opgeslagen en opnieuw geladen, en is handig wanneer bewerkingen (zoals XPointer [XPointer]-lookups) die afhankelijk zijn van een bepaalde documentboomstructuur, moeten worden uitgevoerd. worden gebruikt. Als de parameter "normalize-characters" van het DOMConfiguration-object dat aan het Node.ownerDocument is gekoppeld, waar is, zal deze methode ook de tekens van de tekstknooppunten volledig normaliseren. |
| [PauseAnimations](../../aspose.svg/svgsvgelement/pauseanimations/)() | Onderbreekt (dwz pauzeert) alle actieve animaties die zijn gedefinieerd in het SVG-documentfragment dat overeenkomt met dit 'svg'-element, waardoor de animatieklok die overeenkomt met dit documentfragment stilstaat totdat de pauze wordt hervat. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | Retourneert het eerste element in het document dat overeenkomt met selector |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | Retourneert een NodeList van alle elementen in het document, die overeenkomen met selector |
| [Remove](../../aspose.svg.dom/element/remove/)() | Verwijdert deze instantie. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | Verwijdert een attribuut op naam. |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | Verwijdert het gespecificeerde attribuut knooppunt. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | Verwijdert een kenmerk op lokale naam en naamruimte-URI. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Verwijdert het onderliggende knooppunt aangegeven door oldChild uit de lijst met onderliggende items en retourneert het. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Met deze methode kunnen gebeurtenislisteners uit het gebeurtenisdoel worden verwijderd. Als een[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) wordt verwijderd uit een[`EventTarget`](../../aspose.svg.dom/eventtarget/) terwijl het een gebeurtenis verwerkt, wordt het niet geactiveerd door de huidige acties. Gebeurtenislisteners kunnen nooit worden aangeroepen nadat ze zijn verwijderd. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Met deze methode kunnen gebeurtenislisteners uit het gebeurtenisdoel worden verwijderd. Als een[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) wordt verwijderd uit een[`EventTarget`](../../aspose.svg.dom/eventtarget/) terwijl het een gebeurtenis verwerkt, wordt het niet geactiveerd door de huidige acties. Gebeurtenislisteners kunnen nooit worden aangeroepen nadat ze zijn verwijderd. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Met deze methode kunnen gebeurtenislisteners uit het gebeurtenisdoel worden verwijderd. Als een[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) wordt verwijderd uit een[`EventTarget`](../../aspose.svg.dom/eventtarget/) terwijl het een gebeurtenis verwerkt, wordt het niet geactiveerd door de huidige acties. Gebeurtenislisteners kunnen nooit worden aangeroepen nadat ze zijn verwijderd. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Vervangt het onderliggende knooppunt oldChild door newChild in de lijst met onderliggende items en retourneert het oldChild-knooppunt. Als newChild een DocumentFragment-object is, wordt oldChild vervangen door alle DocumentFragment-kinderen, die in dezelfde volgorde worden ingevoegd. Als de newChild al in de stamboom staat, wordt deze eerst verwijderd. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | Voegt een nieuw attribuut toe. Als er al een attribuut met die naam in het element aanwezig is, wordt de waarde ervan gewijzigd in die van de waarde parameter |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | Voegt een nieuw attribuutknooppunt toe. Als er al een attribuut met die naam (nodeName) aanwezig is in het element, wordt het vervangen door het nieuwe. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | Voegt een nieuw attribuut toe. Als er al een attribuut met die lokale naam en die naamruimte-URI aanwezig is in het element, wordt het vervangen door de nieuwe. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | Voegt een nieuw attribuut toe. Als er al een kenmerk met dezelfde lokale naam en naamruimte-URI aanwezig is op het element, wordt het voorvoegsel gewijzigd in het voorvoegselgedeelte van de QualifiedName en wordt de waarde gewijzigd in de waardeparameter. |
| [SetCurrentTime](../../aspose.svg/svgsvgelement/setcurrenttime/)(float) | Past de klok aan voor dit SVG-documentfragment en stelt een nieuwe huidige tijd in. Als setCurrentTime wordt aangeroepen voordat de documenttijdlijn is begonnen (bijvoorbeeld door script dat wordt uitgevoerd in een 'script'-element voordat de SVGLoad-gebeurtenis van het document wordt verzonden), dan geeft de waarde van seconden in de laatste aanroep van de methode de tijd dat het document zal proberen om zodra de documenttijdlijn is begonnen. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | Als de parameter isId waar is, declareert deze methode het opgegeven kenmerk als een door de gebruiker bepaald ID-kenmerk. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | Als de parameter isId waar is, declareert deze methode het opgegeven kenmerk als een door de gebruiker bepaald ID-kenmerk. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | Als de parameter isId waar is, declareert deze methode het opgegeven kenmerk als een door de gebruiker bepaald ID-kenmerk. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Geeft als resultaat eenString die deze instantie vertegenwoordigt. |
| [UnpauseAnimations](../../aspose.svg/svgsvgelement/unpauseanimations/)() | Onderbreekt (dwz hervat) actieve animaties die zijn gedefinieerd in het SVG-documentfragment, waardoor de animatieklok doorgaat vanaf het moment waarop deze werd onderbroken. |

### Zie ook

* class [SVGGraphicsElement](../svggraphicselement/)
* interface [ISVGFitToViewBox](../isvgfittoviewbox/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IViewCSS](../../aspose.svg.dom.css/iviewcss/)
* interface [IDocumentCSS](../../aspose.svg.dom.css/idocumentcss/)
* interface [ISVGZoomAndPan](../isvgzoomandpan/)
* naamruimte [Aspose.Svg](../../aspose.svg/)
* montage [Aspose.SVG](../../)


