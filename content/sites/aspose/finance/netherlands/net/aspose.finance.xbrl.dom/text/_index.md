---
title: Class Text
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Xbrl.Dom.Text klas. De klasse vertegenwoordigt de tekstuele inhoud.
type: docs
weight: 7490
url: /nl/net/aspose.finance.xbrl.dom/text/
---
## Text class

De klasse vertegenwoordigt de tekstuele inhoud.

```csharp
public class Text : CharacterData
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | Haalt de absolute basis-URI van dit knooppunt op of null als de implementatie geen absolute URI kon verkrijgen. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | Haalt de onderliggende knooppunten op. |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data/) { get; set; } | Haalt of stelt de karaktergegevens in van het knooppunt dat deze interface implementeert. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | Haalt het eerste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | Krijgt of dit knooppunt kinderen heeft. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | Haalt het laatste kind van dit knooppunt op. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length/) { get; } | Haalt het aantal 16-bits eenheden op dat beschikbaar is via gegevens. Dit kan de waarde nul hebben, dwz dat CharacterData-knooppunten leeg kunnen zijn. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | Haalt het lokale deel van de gekwalificeerde naam van dit knooppunt op. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | Haalt de naamruimte-URI van dit knooppunt op. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | Haalt het knooppunt op dat onmiddellijk volgt op dit knooppunt. Als zo'n knooppunt niet bestaat, retourneert dit null. |
| override [NodeName](../../aspose.finance.xbrl.dom/text/nodename/) { get; } | Krijgt de naam van deze tekst. |
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
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata/)(string) | Voegt de tekenreeks toe aan het einde van de tekengegevens van het knooppunt. |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata/)(int, int) | Verwijdert een reeks inhoud van het knooppunt. |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata/)(int, string) | Voegt een tekenreeks in op de gespecificeerde offset. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | Verwijdert het kindknooppunt aangegeven door oud kind uit de lijst met kinderen. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | Vervangt het oude kind van het kindknooppunt door het nieuwe kind in de lijst met kinderen, en retourneert het oude kindknooppunt. |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata/)(int, int, string) | Vervangt de tekens die beginnen bij de opgegeven offset door de opgegeven tekenreeks. |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring/)(int, int) | Haalt een reeks gegevens uit het knooppunt. |

### Zie ook

* class [CharacterData](../characterdata/)
* naamruimte [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* montage [Aspose.Finance](../../)


