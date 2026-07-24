---
title: "System::Xml::XPath::XPathExpression class"
linktitle: "XPathExpression"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathExpression class. Biedt een getypeerde klasse die een gecompileerde XPath-expressie vertegenwoordigt in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Biedt een getypeerde klasse die een gecompileerde [XPath](../) expressie vertegenwoordigt.

```cpp
class XPathExpression : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Wanneer overschreven in een afgeleide klasse, sorteert het de knooppunten die door de [XPath](../) expressie zijn geselecteerd volgens het opgegeven IComparer‑object. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Wanneer overschreven in een afgeleide klasse, sorteert het de knooppunten die door de [XPath](../) expressie zijn geselecteerd volgens de opgegeven parameters. |
| virtual [Clone](./clone/)() | Wanneer overschreven in een afgeleide klasse, retourneert het een kloon van deze [XPathExpression](./). |
| static [Compile](./compile/)(const String\&) | Compileert de opgegeven [XPath](../) expressie en retourneert een [XPathExpression](./) object dat de [XPath](../) expressie vertegenwoordigt. |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Compileert de opgegeven [XPath](../) expressie, met het opgegeven [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object voor namespace‑resolutie, en retourneert een [XPathExpression](./) object dat de [XPath](../) expressie vertegenwoordigt. |
| virtual [get_Expression](./get_expression/)() | Wanneer overschreven in een afgeleide klasse, haalt het een **string**‑representatie op van de [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Wanneer overschreven in een afgeleide klasse, haalt het het resulttype op van de [XPath](../) expressie. |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Wanneer overschreven in een afgeleide klasse, specificeert het het [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) object dat moet worden gebruikt voor namespace‑resolutie. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Wanneer overschreven in een afgeleide klasse, specificeert het het [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) object dat moet worden gebruikt voor namespace‑resolutie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
