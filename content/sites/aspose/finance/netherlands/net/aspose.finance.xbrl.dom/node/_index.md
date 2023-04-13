---
title: Class Node
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Xbrl.Dom.Node klas. De klasse Node is het primaire gegevenstype voor het gehele documentobjectmodel. Het vertegenwoordigt een enkel knooppunt in de documentboom.
type: docs
weight: 7460
url: /nl/net/aspose.finance.xbrl.dom/node/
---
## Node class

De klasse Node is het primaire gegevenstype voor het gehele documentobjectmodel. Het vertegenwoordigt een enkel knooppunt in de documentboom.

```csharp
public abstract class Node
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Haalt de absolute basis-URI van dit knooppunt op of null als de implementatie geen absolute URI kon verkrijgen. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Haalt de onderliggende knooppunten op. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Haalt het eerste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Krijgt of dit knooppunt kinderen heeft. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Haalt het laatste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Haalt het lokale deel van de gekwalificeerde naam van dit knooppunt op. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Haalt de naamruimte-URI van dit knooppunt op. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Haalt het knooppunt op dat onmiddellijk volgt op dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename/) { get; } | Krijgt de naam van het knooppunt, afhankelijk van het type. |
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

## Velden

| Naam | Beschrijving |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node/) | Commentaar knooppunttype. |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node/) | Type documentknooppunt. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node/) | Documenttype knooppunttype. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node/) | Type elementknooppunt. |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node/) | Verwerkingsinstructie knooppunttype. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node/) | Type tekstknooppunt. |

### Zie ook

* naamruimte [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* montage [Aspose.Finance](../../)


