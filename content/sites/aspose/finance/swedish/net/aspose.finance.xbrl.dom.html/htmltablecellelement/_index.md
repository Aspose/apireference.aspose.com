---
title: HTMLTableCellElement
second_title: Aspose.Finance för .NET API-referens
description: Klassen som används för att representera TH och TDelementen. Se TDelementdefinitionen i HTML 4.01.
type: docs
weight: 7180
url: /sv/net/aspose.finance.xbrl.dom.html/htmltablecellelement/
---
## HTMLTableCellElement class

Klassen som används för att representera TH- och TD-elementen. Se TD-elementdefinitionen i HTML 4.01.

```csharp
public class HTMLTableCellElement : HTMLElement
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes) { get; } | Hämtar elementets attribut. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Får den absoluta bas-URI för denna nod eller noll om implementeringen inte kunde erhålla en absolut URI. |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements) { get; } | Hämtar elementets underordnade element. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Hämtar barnnoderna. |
| [ClassName](../../aspose.finance.xbrl.dom.html/htmlelement/classname) { get; set; } | Hämtar eller ställer in klassattributet för elementet. Det här attributet har bytt namn på grund av konflikter med nyckelordet "klass" som exponeras av många språk. Se klassattributdefinitionen i HTML 4.01. |
| [Dir](../../aspose.finance.xbrl.dom.html/htmlelement/dir) { get; set; } | Hämtar eller ställer in basriktningen för riktningsneutral text och tabellernas riktning. Se dir-attributdefinitionen i HTML 4.01. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Får det första barnet till denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Hämtar om denna nod har några barn. |
| [Id](../../aspose.finance.xbrl.dom.html/htmlelement/id) { get; set; } | Hämtar eller ställer in elementets identifierare. Se definitionen av id-attributet i HTML 4.01. |
| [Lang](../../aspose.finance.xbrl.dom.html/htmlelement/lang) { get; set; } | Hämtar eller ställer in språkkoden som definieras i RFC 1766. Se definitionen av langattributet i HTML 4.01. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Hämtar det sista barnet till denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname) { get; } | Hämtar det lokala namnet på elementet. |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri) { get; } | Hämtar namnutrymmets URI för elementet. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Hämtar noden omedelbart efter denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename) { get; } | Hämtar nodnamnet på elementet. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Hämtar nodtypen. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Hämtar eller ställer in värdet för denna nod, beroende på dess typ. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Hämtar dokumentobjektet som är associerat med denna nod. |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement) { get; } | Hämtar det överordnade elementet för elementet. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Hämtar den överordnade noden. |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix) { get; } | Får prefixet för elementet. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Hämtar noden omedelbart före denna nod. Om det inte finns någon sådan nod, returnerar detta null. |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent) { get; set; } | Hämtar textinnehållet i elementet. |
| [Title](../../aspose.finance.xbrl.dom.html/htmlelement/title) { get; set; } | Hämtar eller ställer in elementets rådgivande titel. Se titelattributdefinitionen i HTML 4.01. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Lägger till noden newChild i slutet av listan över underordnade till denna nod. |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute)(string) | Får ett attributvärde efter namn. |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens)(string, string) | Får ett attributvärde efter lokalt namn och namnutrymmes-URI. |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute)(string) | Returnerar sant när ett attribut med ett givet namn anges på detta element eller har ett standardvärde, annars falskt. |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens)(string, string) | Returnerar sant när ett attribut med ett givet lokalt namn och namnområdes-URI anges på detta element eller har ett standardvärde, annars falskt. |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute)(string) | Tar bort ett attribut efter namn. |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens)(string, string) | Tar bort ett attribut efter lokalt namn och namnområdes-URI. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Tar bort den underordnade noden som indikeras av gammalt barn från listan över barn. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Ersätter det gamla underordnade barnet med nytt underordnat i listan över underordnade och returnerar den gamla underordnade noden. |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute)(string, string) | Lägger till ett nytt attribut. Om ett attribut med det namnet redan finns i elementet ändras dess värde till att vara det för parametern value. |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens)(string, string, string) | Lägger till ett nytt attribut. Om ett attribut med samma lokala namn och namnområdes-URI redan finns på elementet, ändras dess prefix till att vara prefixdelen av qualifiedName och dess värde ändras till värdeparametern. |

### Se även

* class [HTMLElement](../htmlelement)
* namnutrymme [Aspose.Finance.Xbrl.Dom.Html](../../aspose.finance.xbrl.dom.html)
* hopsättning [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
