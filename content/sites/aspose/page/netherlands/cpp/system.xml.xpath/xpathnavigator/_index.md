---
title: "System::Xml::XPath::XPathNavigator class"
linktitle: "XPathNavigator"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator class. Biedt een cursor‑model voor het navigeren en bewerken van XML‑gegevens in C++."
type: docs
weight: 500
url: /nl/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Biedt een cursor‑model voor het navigeren en bewerken van XML‑gegevens.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Retourneert een [XmlWriter](../../system.xml/xmlwriter/) object dat wordt gebruikt om een of meer nieuwe kindknooppunten aan het einde van de lijst met kindknooppunten van het huidige knooppunt te maken. |
| virtual [AppendChild](./appendchild/)(String) | Maakt een nieuw kindknooppunt aan het einde van de lijst met kindknooppunten van het huidige knooppunt met behulp van de opgegeven XML‑gegevensreeks. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Maakt een nieuw kindknooppunt aan het einde van de lijst met kindknooppunten van het huidige knooppunt met behulp van de XML‑inhoud van het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Maakt een nieuw kindknooppunt aan het einde van de lijst met kindknooppunten van het huidige knooppunt met behulp van de opgegeven knooppunten in de [XPathNavigator](./). |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Maakt een nieuw kindelementknooppunt aan het einde van de lijst met kindknooppunten van het huidige knooppunt met behulp van het opgegeven namespace‑voorvoegsel, de lokale naam, de opgegeven namespace‑URI en de opgegeven waarde. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Verifieert dat de XML‑gegevens in de [XPathNavigator](./) voldoen aan het opgegeven XML‑[Schema](../../system.xml.schema/) definitietaal (XSD)‑schema. |
| virtual [Clone](./clone/)() | Wanneer overschreven in een afgeleide klasse, maakt het een nieuwe [XPathNavigator](./) aan die op hetzelfde knooppunt staat als deze [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Vergelijkt de positie van de huidige [XPathNavigator](./) met de positie van de opgegeven [XPathNavigator](./). |
| virtual [Compile](./compile/)(String) | Compileert een tekenreeks die een [XPath](../)‑expressie voorstelt en retourneert een [XPathExpression](../xpathexpression/)-object. |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Maakt een attribuutknooppunt op het huidige elementknooppunt met behulp van het opgegeven namespace‑voorvoegsel, de lokale naam, de opgegeven namespace‑URI en de opgegeven waarde. |
| virtual [CreateAttributes](./createattributes/)() | Retourneert een [XmlWriter](../../system.xml/xmlwriter/)-object dat wordt gebruikt om nieuwe attributen op het huidige element te maken. |
| [CreateNavigator](./createnavigator/)() override | Retourneert een kopie van de [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Verwijdert een reeks broederknooppunten van het huidige knooppunt tot het opgegeven knooppunt. |
| virtual [DeleteSelf](./deleteself/)() | Verwijdert het huidige knooppunt en de onderliggende kindknooppunten. |
| virtual [Evaluate](./evaluate/)(String) | Evalueert de opgegeven [XPath](../)-expressie en retourneert het getypeerde resultaat. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Evalueert de opgegeven [XPath](../)-expressie en retourneert het getypeerde resultaat, met behulp van het opgegeven [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)-object om namespace‑voorvoegsels in de [XPath](../)-expressie op te lossen. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Evalueert de [XPathExpression](../xpathexpression/) en retourneert het getypeerde resultaat. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Gebruikt de geleverde context om de [XPathExpression](../xpathexpression/) te evalueren en retourneert het getypeerde resultaat. |
| virtual [get_BaseURI](./get_baseuri/)() | Wanneer overschreven in een afgeleide klasse, haalt het de basis‑URI op voor het huidige knooppunt. |
| virtual [get_CanEdit](./get_canedit/)() | Retourneert een waarde die aangeeft of de [XPathNavigator](./) de onderliggende XML‑gegevens kan bewerken. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Retourneert een waarde die aangeeft of het huidige knooppunt attributen bevat. |
| virtual [get_HasChildren](./get_haschildren/)() | Retourneert een waarde die aangeeft of het huidige knooppunt kindknooppunten bevat. |
| virtual [get_InnerXml](./get_innerxml/)() | Retourneert de markup die de kindknooppunten van het huidige knooppunt weergeeft. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Wanneer overschreven in een afgeleide klasse, haalt het een waarde op die aangeeft of het huidige knooppunt een leeg element is zonder een eind‑element‑tag. |
| [get_IsNode](./get_isnode/)() override | Retourneert een waarde die aangeeft of het huidige knooppunt een [XPath](../)-knooppunt vertegenwoordigt. |
| virtual [get_LocalName](./get_localname/)() | Wanneer overschreven in een afgeleide klasse, haalt het de [XPathNavigator::get_Name](./get_name/) van het huidige knooppunt op zonder namespace‑voorvoegsel. |
| virtual [get_Name](./get_name/)() | Wanneer overschreven in een afgeleide klasse, krijgt de gekwalificeerde naam van het huidige knooppunt. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Wanneer overschreven in een afgeleide klasse, haalt het de namespace‑URI van het huidige knooppunt op. |
| virtual [get_NameTable](./get_nametable/)() | Wanneer overschreven in een afgeleide klasse, haalt het de [XmlNameTable](../../system.xml/xmlnametable/) van de [XPathNavigator](./) op. |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Retourneert een [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) die wordt gebruikt voor gelijkheidsvergelijking van [XPathNavigator](./) objecten. |
| virtual [get_NodeType](./get_nodetype/)() | Wanneer overschreven in een afgeleide klasse, haalt het de [XPathNodeType](../xpathnodetype/) van het huidige knooppunt op. |
| virtual [get_OuterXml](./get_outerxml/)() | Retourneert de opmaak die de opening- en sluitings‑tags van het huidige knooppunt en zijn onderliggende knooppunten weergeeft. |
| virtual [get_Prefix](./get_prefix/)() | Wanneer overschreven in een afgeleide klasse, haalt het namespace‑voorvoegsel op dat bij het huidige knooppunt hoort. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Retourneert de schemainformatie die aan het huidige knooppunt is toegewezen als resultaat van schemavalidatie. |
| [get_TypedValue](./get_typedvalue/)() override | Retourneert het huidige knooppunt als een verpakt object van het meest geschikte type. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Wordt gebruikt door [XPathNavigator](./) implementaties die een "gevirtualiseerde" XML‑weergave over een opslag bieden, om toegang te geven tot onderliggende objecten. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Retourneert de waarde van het huidige knooppunt als een [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Retourneert de waarde van het huidige knooppunt als een [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Retourneert de waarde van het huidige knooppunt als een [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Retourneert de waarde van het huidige knooppunt als een [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Retourneert de waarde van het huidige knooppunt als een [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Retourneert het type van het huidige knooppunt. |
| virtual [get_XmlLang](./get_xmllang/)() | Retourneert het **xml:lang**‑bereik voor het huidige knooppunt. |
| [get_XmlType](./get_xmltype/)() override | Retourneert de XmlSchemaType‑informatie voor het huidige knooppunt. |
| virtual [GetAttribute](./getattribute/)(String, String) | Geeft de waarde van het attribuut met de opgegeven lokale naam en namespace-URI terug. |
| virtual [GetNamespace](./getnamespace/)(String) | Retourneert de waarde van het namespace‑knooppunt dat overeenkomt met de opgegeven lokale naam. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Retourneert de in‑scope namespaces van het huidige knooppunt. |
| virtual [InsertAfter](./insertafter/)() | Retourneert een [XmlWriter](../../system.xml/xmlwriter/) object dat wordt gebruikt om een nieuw broederknooppunt na het momenteel geselecteerde knooppunt te maken. |
| virtual [InsertAfter](./insertafter/)(String) | Maakt een nieuw broederknooppunt na het momenteel geselecteerde knooppunt met behulp van de opgegeven XML‑tekenreeks. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Maakt een nieuw broederknooppunt na het momenteel geselecteerde knooppunt met behulp van de XML‑inhoud van het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Maakt een nieuw broederknooppunt na het momenteel geselecteerde knooppunt met behulp van de knooppunten in het opgegeven [XPathNavigator](./) object. |
| virtual [InsertBefore](./insertbefore/)() | Retourneert een [XmlWriter](../../system.xml/xmlwriter/) object dat wordt gebruikt om een nieuw broederknooppunt vóór het momenteel geselecteerde knooppunt te maken. |
| virtual [InsertBefore](./insertbefore/)(String) | Maakt een nieuw broederknooppunt vóór het momenteel geselecteerde knooppunt met behulp van de opgegeven XML‑tekenreeks. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Maakt een nieuw broederknooppunt vóór het momenteel geselecteerde knooppunt met behulp van de XML‑inhoud van het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Maakt een nieuw broederknooppunt vóór het momenteel geselecteerde knooppunt met behulp van de knooppunten in het opgegeven [XPathNavigator](./) object. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Maakt een nieuw broeder‑element na het huidige knooppunt met het opgegeven namespace‑voorvoegsel, de lokale naam en de namespace‑URI, met de opgegeven waarde. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Maakt een nieuw broeder‑element vóór het huidige knooppunt met het opgegeven namespace‑voorvoegsel, de lokale naam en de namespace‑URI, met de opgegeven waarde. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Bepaalt of de opgegeven [XPathNavigator](./) een afstammeling is van de huidige [XPathNavigator](./). |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Wanneer overschreven in een afgeleide klasse, bepaalt of de huidige [XPathNavigator](./) zich op dezelfde positie bevindt als de opgegeven [XPathNavigator](./). |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Retourneert de namespace-URI voor de opgegeven prefix. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Retourneert het voorvoegsel dat is gedeclareerd voor de opgegeven namespace-URI. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Bepaalt of het huidige knooppunt overeenkomt met de opgegeven [XPathExpression](../xpathexpression/). |
| virtual [Matches](./matches/)(String) | Bepaalt of het huidige knooppunt overeenkomt met de opgegeven [XPath](../) expressie. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar dezelfde positie als de opgegeven [XPathNavigator](./). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Verplaatst de [XPathNavigator](./) naar het attribuut met de overeenkomende lokale naam en namespace-URI. |
| virtual [MoveToChild](./movetochild/)(String, String) | Verplaatst de [XPathNavigator](./) naar het kindknooppunt met de opgegeven lokale naam en namespace-URI. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Verplaatst de [XPathNavigator](./) naar het kindknooppunt van het opgegeven [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToFirst](./movetofirst/)() | Verplaatst de [XPathNavigator](./) naar het eerste broederknooppunt van het huidige knooppunt. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar het eerste attribuut van het huidige knooppunt. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar het eerste kindknooppunt van het huidige knooppunt. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar het eerste namespace-knooppunt dat overeenkomt met de opgegeven [XPathNamespaceScope](../xpathnamespacescope/). |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Verplaatst de [XPathNavigator](./) naar het eerste namespace-knooppunt van het huidige knooppunt. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Verplaatst de [XPathNavigator](./) naar het element met de opgegeven lokale naam en namespace-URI in documentvolgorde. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Verplaatst de [XPathNavigator](./) naar het element met de opgegeven lokale naam en namespace-URI, tot de opgegeven grens, in documentvolgorde. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Verplaatst de [XPathNavigator](./) naar het volgende element van het opgegeven [XPathNodeType](../xpathnodetype/) in documentvolgorde. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Verplaatst de [XPathNavigator](./) naar het volgende element van het opgegeven [XPathNodeType](../xpathnodetype/), tot de opgegeven grens, in documentvolgorde. |
| virtual [MoveToId](./movetoid/)(String) | Wanneer overschreven in een afgeleide klasse, verplaatst naar het knooppunt dat een attribuut van type **ID** heeft waarvan de waarde overeenkomt met de opgegeven [String](../../system/string/). |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Verplaatst de [XPathNavigator](./) naar het namespace-knooppunt met het opgegeven namespace-voorvoegsel. |
| virtual [MoveToNext](./movetonext/)() | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar het volgende broederknooppunt van het huidige knooppunt. |
| virtual [MoveToNext](./movetonext/)(String, String) | Verplaatst de [XPathNavigator](./) naar het volgende broederknooppunt met de opgegeven lokale naam en namespace-URI. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Verplaatst de [XPathNavigator](./) naar het volgende broederknooppunt van het huidige knooppunt dat overeenkomt met het opgegeven [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar het volgende attribuut. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Wanneer overschreven in een afgeleide klasse, verplaatst de [XPathNavigator](./) naar het volgende namespace-knooppunt dat overeenkomt met de opgegeven [XPathNamespaceScope](../xpathnamespacescope/). |
| [MoveToNextNamespace](./movetonextnamespace/)() | Verplaatst de [XPathNavigator](./) naar het volgende namespace-knooppunt. |
| virtual [MoveToParent](./movetoparent/)() | Wanneer overschreven in een afgeleide klasse, verplaatst het [XPathNavigator](./) naar het bovenliggende knooppunt van het huidige knooppunt. |
| virtual [MoveToPrevious](./movetoprevious/)() | Wanneer overschreven in een afgeleide klasse, verplaatst het [XPathNavigator](./) naar het vorige broederknooppunt van het huidige knooppunt. |
| virtual [MoveToRoot](./movetoroot/)() | Verplaatst het [XPathNavigator](./) naar het wortelknooppunt waartoe het huidige knooppunt behoort. |
| virtual [PrependChild](./prependchild/)() | Retourneert een [XmlWriter](../../system.xml/xmlwriter/) object dat wordt gebruikt om een nieuw kindknooppunt aan het begin van de lijst met kindknooppunten van het huidige knooppunt te maken. |
| virtual [PrependChild](./prependchild/)(String) | Maakt een nieuw kindknooppunt aan het begin van de lijst met kindknooppunten van het huidige knooppunt met behulp van de opgegeven XML‑tekenreeks. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Maakt een nieuw kindknooppunt aan het begin van de lijst met kindknooppunten van het huidige knooppunt met behulp van de XML‑inhoud van het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Maakt een nieuw kindknooppunt aan het begin van de lijst met kindknooppunten van het huidige knooppunt met behulp van de knooppunten in het opgegeven [XPathNavigator](./) object. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Maakt een nieuw kindelement aan het begin van de lijst met kindknooppunten van het huidige knooppunt met behulp van het opgegeven namespace‑voorvoegsel, lokale naam en namespace‑URI met de opgegeven waarde. |
| virtual [ReadSubtree](./readsubtree/)() | Retourneert een [XmlReader](../../system.xml/xmlreader/) object dat het huidige knooppunt en de bijbehorende kindknooppunten bevat. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Vervangt een reeks broederknooppunten vanaf het huidige knooppunt tot het opgegeven knooppunt. |
| virtual [ReplaceSelf](./replaceself/)(String) | Vervangt het huidige knooppunt door de inhoud van de opgegeven tekenreeks. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Vervangt het huidige knooppunt door de inhoud van het opgegeven [XmlReader](../../system.xml/xmlreader/) object. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Vervangt het huidige knooppunt door de inhoud van het opgegeven [XPathNavigator](./) object. |
| virtual [Select](./select/)(String) | Selecteert een knoopset met behulp van de opgegeven [XPath](../) expressie. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Selecteert een knoopset met behulp van de opgegeven [XPath](../) expressie en het opgegeven [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object om namespace‑voorvoegsels op te lossen. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Selecteert een knoopset met behulp van de opgegeven [XPathExpression](../xpathexpression/). |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Selecteert alle voorouderknooppunten van het huidige knooppunt die overeenkomen met het opgegeven [XPathNodeType](../xpathnodetype/). |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Selecteert alle voorouderknooppunten van het huidige knooppunt met de opgegeven lokale naam en namespace‑URI. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Selecteert alle kindknooppunten van het huidige knooppunt die overeenkomen met het opgegeven [XPathNodeType](../xpathnodetype/). |
| virtual [SelectChildren](./selectchildren/)(String, String) | Selecteert alle kindknooppunten van het huidige knooppunt met de opgegeven lokale naam en namespace‑URI. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Selecteert alle afstammingsknooppunten van het huidige knooppunt die overeenkomen met het opgegeven [XPathNodeType](../xpathnodetype/). |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Selecteert alle afstammingsknooppunten van het huidige knooppunt met de opgegeven lokale naam en namespace‑URI. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Selecteert een enkel knooppunt in de [XPathNavigator](./) met behulp van de opgegeven [XPath](../) query. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Selecteert een enkel knooppunt in het [XPathNavigator](./) object met behulp van de opgegeven [XPath](../) query en het opgegeven [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object om namespace‑voorvoegsels op te lossen. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Selecteert een enkel knooppunt in de [XPathNavigator](./) met behulp van het opgegeven [XPathExpression](../xpathexpression/) object. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Stelt de opmaak in die de kindknopen van de huidige knoop vertegenwoordigt. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Stelt de opmaak in die de openings- en sluitings-tags van de huidige knoop en zijn kindknopen vertegenwoordigt. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Stelt de getypeerde waarde van de huidige knoop in. |
| virtual [SetValue](./setvalue/)(String) | Stelt de waarde van de huidige knoop in. |
| [ToString](./tostring/)() const override | Geeft de tekstwaarde van het huidige knooppunt terug. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Retourneert de waarde van de huidige knoop als het opgegeven Type, met gebruik van het opgegeven [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object om namespace‑prefixen op te lossen. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Stuurt de huidige knoop en zijn kindknopen naar het opgegeven [XmlWriter](../../system.xml/xmlwriter/) object. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
