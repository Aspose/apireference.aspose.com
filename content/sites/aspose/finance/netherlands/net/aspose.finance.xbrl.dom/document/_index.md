---
title: Class Document
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Xbrl.Dom.Document klas. Het document vertegenwoordigt het volledige inline xbrldocument. Conceptueel is het de root van de documentboom en biedt het de primaire toegang tot de documentgegevens.
type: docs
weight: 6690
url: /nl/net/aspose.finance.xbrl.dom/document/
---
## Document class

Het document vertegenwoordigt het volledige inline xbrl-document. Conceptueel is het de root van de documentboom en biedt het de primaire toegang tot de documentgegevens.

```csharp
public class Document : Node
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [Document](document/)() | De standaard constructeur. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Haalt de absolute basis-URI van dit knooppunt op of null als de implementatie geen absolute URI kon verkrijgen. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | Haalt de codering van het document op. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | Haalt de onderliggende elementen op. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Haalt de onderliggende knooppunten op. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | Haalt het inhoudstype van het document op. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | Dit is een handig attribuut dat directe toegang geeft tot het onderliggende knooppunt dat het documentelement van het document is. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | Haalt de document-URI op. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Haalt het eerste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Krijgt of dit knooppunt kinderen heeft. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Haalt het laatste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Haalt het lokale deel van de gekwalificeerde naam van dit knooppunt op. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Haalt de naamruimte-URI van dit knooppunt op. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Haalt het knooppunt op dat onmiddellijk volgt op dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename/) { get; } | Haalt de knooppuntnaam van het document op. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | Haalt het knooppunttype op. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | Haalt of stelt de waarde van dit knooppunt in, afhankelijk van het type. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | Haalt het documentobject op dat aan dit knooppunt is gekoppeld. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | Haalt het bovenliggende knooppunt op. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | Haalt of stelt het naamruimtevoorvoegsel van dit knooppunt in. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | Haalt het knooppunt op dat onmiddellijk aan dit knooppunt voorafgaat. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | Haalt of stelt de tekstinhoud van dit knooppunt en zijn afstammelingen in. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | Voegt het knooppunt newChild toe aan het einde van de lijst met kinderen van dit knooppunt. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Verwijdert het kindknooppunt aangegeven door oud kind uit de lijst met kinderen. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Vervangt het oude kind van het kindknooppunt door het nieuwe kind in de lijst met kinderen, en retourneert het oude kindknooppunt. |

### Zie ook

* class [Node](../node/)
* naamruimte [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* montage [Aspose.Finance](../../)


