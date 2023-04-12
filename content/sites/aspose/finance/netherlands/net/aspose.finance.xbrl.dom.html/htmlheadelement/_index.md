---
title: Class HTMLHeadElement
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Xbrl.Dom.Html.HTMLHeadElement klas. De klasse vertegenwoordigt documentkopinformatie. Zie de HEADelementdefinitie in HTML 4.01.
type: docs
weight: 6930
url: /nl/net/aspose.finance.xbrl.dom.html/htmlheadelement/
---
## HTMLHeadElement class

De klasse vertegenwoordigt documentkopinformatie. Zie de HEAD-elementdefinitie in HTML 4.01.

```csharp
public class HTMLHeadElement : HTMLElement
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes/) { get; } | Haalt de kenmerken van het element op. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Haalt de absolute basis-URI van dit knooppunt op of null als de implementatie geen absolute URI kon verkrijgen. |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements/) { get; } | Haalt de onderliggende elementen van het element op. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Haalt de onderliggende knooppunten op. |
| [ClassName](../../aspose.finance.xbrl.dom.html/htmlelement/classname/) { get; set; } | Haalt of stelt het class attribuut van het element in. Dit attribuut is hernoemd vanwege conflicten met het sleutelwoord "class" dat in veel talen voorkomt. Zie de class-attribuutdefinitie in HTML 4.01. |
| [Dir](../../aspose.finance.xbrl.dom.html/htmlelement/dir/) { get; set; } | Hiermee wordt de basisrichting van directioneel neutrale tekst en de directionaliteit van tabellen opgehaald of ingesteld. Zie de dir-attribuutdefinitie in HTML 4.01. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Haalt het eerste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Krijgt of dit knooppunt kinderen heeft. |
| [Id](../../aspose.finance.xbrl.dom.html/htmlelement/id/) { get; set; } | Haalt of stelt de identifier van het element in. Zie de definitie van het id-kenmerk in HTML 4.01. |
| [Lang](../../aspose.finance.xbrl.dom.html/htmlelement/lang/) { get; set; } | Haalt de taalcode op of stelt deze in zoals gedefinieerd in RFC 1766. Zie de lang-attribuutdefinitie in HTML 4.01. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Haalt het laatste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname/) { get; } | Haalt de lokale naam van het element op. |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri/) { get; } | Haalt de naamruimte-URI van het element op. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Haalt het knooppunt op dat onmiddellijk volgt op dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename/) { get; } | Haalt de knooppuntnaam van het element op. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | Haalt het knooppunttype op. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | Haalt of stelt de waarde van dit knooppunt in, afhankelijk van het type. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | Haalt het documentobject op dat aan dit knooppunt is gekoppeld. |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement/) { get; } | Haalt het bovenliggende element van het element op. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | Haalt het bovenliggende knooppunt op. |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix/) { get; } | Haalt het voorvoegsel van het element op. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | Haalt het knooppunt op dat onmiddellijk aan dit knooppunt voorafgaat. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent/) { get; set; } | Haalt de tekstinhoud van het element op. |
| [Title](../../aspose.finance.xbrl.dom.html/htmlelement/title/) { get; set; } | Haalt of stelt de adviserende titel van het element in. Zie de definitie van het titelkenmerk in HTML 4.01. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Voegt het knooppunt newChild toe aan het einde van de lijst met kinderen van dit knooppunt. |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute/)(string) | Krijgt een attribuutwaarde op naam. |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens/)(string, string) | Krijgt een kenmerkwaarde op basis van lokale naam en naamruimte-URI. |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute/)(string) | Retourneert true wanneer een attribuut met een bepaalde naam is opgegeven voor dit element of een standaardwaarde heeft, anders false. |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens/)(string, string) | Retourneert waar wanneer een attribuut met een gegeven lokale naam en naamruimte-URI is opgegeven voor dit element of een standaardwaarde heeft, anders onwaar. |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute/)(string) | Verwijdert een attribuut op naam. |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens/)(string, string) | Verwijdert een attribuut op lokale naam en naamruimte-URI. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Verwijdert het kindknooppunt aangegeven door oud kind uit de lijst met kinderen. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Vervangt het oude kind van het kindknooppunt door het nieuwe kind in de lijst met kinderen, en retourneert het oude kindknooppunt. |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute/)(string, string) | Voegt een nieuw attribuut toe. Als er al een attribuut met die naam in het element aanwezig is, wordt de waarde ervan gewijzigd in die van de waardeparameter. |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens/)(string, string, string) | Voegt een nieuw attribuut toe. Als er al een kenmerk met dezelfde lokale naam en naamruimte-URI aanwezig is op het element, wordt het voorvoegsel gewijzigd in het voorvoegselgedeelte van de QualifiedName en wordt de waarde gewijzigd in de waardeparameter. |

### Zie ook

* class [HTMLElement](../htmlelement/)
* naamruimte [Aspose.Finance.Xbrl.Dom.Html](../../aspose.finance.xbrl.dom.html/)
* montage [Aspose.Finance](../../)


