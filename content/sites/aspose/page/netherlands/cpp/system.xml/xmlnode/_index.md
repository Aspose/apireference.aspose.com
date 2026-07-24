---
title: "System::Xml::XmlNode klasse"
linktitle: "XmlNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode klasse. Vertegenwoordigt een enkel knooppunt in het XML-document in C++."
type: docs
weight: 2500
url: /nl/cpp/system.xml/xmlnode/
---
## XmlNode class


Stelt een enkel knooppunt in het XML-document voor.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Voegt het opgegeven knooppunt toe aan het einde van de lijst met kindknooppunten van dit knooppunt. |
| virtual [Clone](./clone/)() | Maakt een duplicaat van dit knooppunt. |
| virtual [CloneNode](./clonenode/)(bool) | Maakt een duplicaat van het knooppunt, wanneer overschreven in een afgeleide klasse. |
| [CreateNavigator](./createnavigator/)() override | Maakt een XPathNavigator aan voor het navigeren van dit object. |
| virtual [get_Attributes](./get_attributes/)() | Retourneert een [XmlAttributeCollection](../xmlattributecollection/) die de attributen van dit knooppunt bevat. |
| virtual [get_BaseURI](./get_baseuri/)() | Retourneert de basis-URI van het huidige knooppunt. |
| virtual [get_ChildNodes](./get_childnodes/)() | Retourneert alle onderliggende knooppunten van het knooppunt. |
| virtual [get_FirstChild](./get_firstchild/)() | Retourneert het eerste onderliggende knooppunt van het knooppunt. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Retourneert een waarde die aangeeft of dit knooppunt onderliggende knooppunten heeft. |
| virtual [get_InnerText](./get_innertext/)() | Retourneert de aaneengeschakelde waarden van het knooppunt en al zijn onderliggende knooppunten. |
| virtual [get_InnerXml](./get_innerxml/)() | Retourneert de markup die alleen de onderliggende knooppunten van dit knooppunt weergeeft. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Geeft een waarde terug die aangeeft of het knooppunt alleen-lezen is. |
| virtual [get_LastChild](./get_lastchild/)() | Retourneert het laatste onderliggende knooppunt van het knooppunt. |
| virtual [get_LocalName](./get_localname/)() | Retourneert de lokale naam van het knooppunt, wanneer overschreven in een afgeleide klasse. |
| virtual [get_Name](./get_name/)() | Retourneert de gekwalificeerde naam van het knooppunt, wanneer overschreven in een afgeleide klasse. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Retourneert de namespace-URI van dit knooppunt. |
| virtual [get_NextSibling](./get_nextsibling/)() | Retourneert het knooppunt dat direct volgt op dit knooppunt. |
| virtual [get_NodeType](./get_nodetype/)() | Retourneert het type van het huidige knooppunt, wanneer overschreven in een afgeleide klasse. |
| virtual [get_OuterXml](./get_outerxml/)() | Retourneert de markup die dit knooppunt en al zijn onderliggende knooppunten bevat. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Retourneert het [XmlDocument](../xmldocument/) waartoe dit knooppunt behoort. |
| virtual [get_ParentNode](./get_parentnode/)() | Retourneert de ouder van dit knooppunt (voor knooppunten die een ouder kunnen hebben). |
| virtual [get_Prefix](./get_prefix/)() | Retourneert het namespace-voorvoegsel van dit knooppunt. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Retourneert het knooppunt dat direct voorafgaat aan dit knooppunt. |
| virtual [get_PreviousText](./get_previoustext/)() | Geeft het tekstknooppunt dat dit knooppunt onmiddellijk voorafgaat terug. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Retourneert de post‑schema‑validatie‑infoset die aan dit knooppunt is toegewezen als gevolg van schema‑validatie. |
| virtual [get_Value](./get_value/)() | Geeft de waarde van het knooppunt terug. |
| [GetEnumerator](./getenumerator/)() override | Retourneert een enumerator die door de onderliggende knooppunten in het huidige knooppunt iterereert. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Zoekt de dichtstbijzijnde **xmlns**-declaratie voor het opgegeven voorvoegsel dat binnen het bereik van het huidige knooppunt valt en retourneert de namespace-URI in de declaratie. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Zoekt de dichtstbijzijnde **xmlns**-declaratie voor de opgegeven namespace-URI die binnen het bereik van het huidige knooppunt valt en retourneert het voorvoegsel dat in die declaratie is gedefinieerd. |
| virtual [idx_get](./idx_get/)(String) | Retourneert het eerste onderliggende element met de opgegeven [XmlNode::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | Retourneert het eerste onderliggende element met de opgegeven [XmlNode::get_LocalName](./get_localname/) en [XmlNode::get_NamespaceURI](./get_namespaceuri/) waarden. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Voegt het opgegeven knooppunt direct na het opgegeven referentieknooppunt in. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Voegt het opgegeven knooppunt direct vóór het opgegeven referentieknooppunt in. |
| virtual [Normalize](./normalize/)() | Zet alle [XmlText](../xmltext/) knooppunten in de volledige diepte van de subboom onder deze [XmlNode](./) in een \"normale\" vorm waarbij alleen markup (dat wil zeggen tags, commentaren, verwerkingsinstructies, CDATA-secties en entiteitsreferenties) de [XmlText](../xmltext/) knooppunten scheidt, zodat er geen aangrenzende [XmlText](../xmltext/) knooppunten zijn. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Voegt het opgegeven knooppunt toe aan het begin van de lijst met onderliggende knooppunten van dit knooppunt. |
| virtual [RemoveAll](./removeall/)() | Verwijdert alle onderliggende knooppunten en/of attributen van het huidige knooppunt. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Verwijdert opgegeven kindknooppunt. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Vervangt het kindknooppunt **oldChild** door het **newChild**-knooppunt. |
| [SelectNodes](./selectnodes/)(const String\&) | Selecteert een lijst met knooppunten die overeenkomen met de [XPath](../../system.xml.xpath/) expressie. |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Selecteert een lijst met knooppunten die overeenkomen met de [XPath](../../system.xml.xpath/) expressie. Eventuele prefixes die in de [XPath](../../system.xml.xpath/) expressie worden gevonden, worden opgelost met behulp van de meegeleverde [XmlNamespaceManager](../xmlnamespacemanager/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | Selecteert de eerste [XmlNode](./) die overeenkomt met de [XPath](../../system.xml.xpath/) expressie. |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Selecteert de eerste [XmlNode](./) die overeenkomt met de [XPath](../../system.xml.xpath/) expressie. Eventuele prefixes die in de [XPath](../../system.xml.xpath/) expressie worden gevonden, worden opgelost met behulp van de meegeleverde [XmlNamespaceManager](../xmlnamespacemanager/). |
| virtual [set_InnerText](./set_innertext/)(String) | Stelt de samengevoegde waarden van het knooppunt en al zijn kindknooppunten in. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Stelt de markup in die alleen de kindknooppunten van dit knooppunt weergeeft. |
| virtual [set_Prefix](./set_prefix/)(String) | Stelt het namespace-voorvoegsel van dit knooppunt in. |
| virtual [set_Value](./set_value/)(String) | Stelt de waarde van het knooppunt in. |
| virtual [Supports](./supports/)(String, String) | Test of de DOM-implementatie een specifieke functie implementeert. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Slaat alle kindknooppunten van het knooppunt op in de opgegeven [XmlWriter](../xmlwriter/), wanneer overschreven in een afgeleide klasse. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Slaat het huidige knooppunt op in de opgegeven [XmlWriter](../xmlwriter/), wanneer overschreven in een afgeleide klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
