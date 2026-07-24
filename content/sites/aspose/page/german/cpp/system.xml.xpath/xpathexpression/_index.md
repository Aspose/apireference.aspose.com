---
title: "System::Xml::XPath::XPathExpression class"
linktitle: "XPathExpression"
second_title: "Aspose.Page für C++"
description: "System::Xml::XPath::XPathExpression class. Stellt eine typisierte Klasse bereit, die einen kompilierten XPath-Ausdruck in C++ darstellt."
type: docs
weight: 300
url: /de/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Stellt eine typisierte Klasse bereit, die einen kompilierten [XPath](../)-Ausdruck darstellt.

```cpp
class XPathExpression : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Wenn in einer abgeleiteten Klasse überschrieben, sortiert die Methode die vom [XPath](../)-Ausdruck ausgewählten Knoten gemäß dem angegebenen IComparer-Objekt. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Wenn in einer abgeleiteten Klasse überschrieben, sortiert die Methode die vom [XPath](../)-Ausdruck ausgewählten Knoten gemäß den übergebenen Parametern. |
| virtual [Clone](./clone/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt die Methode eine Kopie dieses [XPathExpression](./) zurück. |
| static [Compile](./compile/)(const String\&) | Kompiliert den angegebenen [XPath](../)-Ausdruck und gibt ein [XPathExpression](./)-Objekt zurück, das den [XPath](../)-Ausdruck darstellt. |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Kompiliert den angegebenen [XPath](../)-Ausdruck, wobei das für die Namensauflösung angegebene [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)-Objekt verwendet wird, und gibt ein [XPathExpression](./)-Objekt zurück, das den [XPath](../)-Ausdruck darstellt. |
| virtual [get_Expression](./get_expression/)() | Wenn in einer abgeleiteten Klasse überschrieben, erhält die Methode eine **string**-Darstellung des [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Wenn in einer abgeleiteten Klasse überschrieben, erhält die Methode den Ergebnistyp des [XPath](../)-Ausdrucks. |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Wenn in einer abgeleiteten Klasse überschrieben, gibt die Methode das zu verwendende [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)-Objekt für die Namensauflösung an. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Wenn in einer abgeleiteten Klasse überschrieben, gibt die Methode das zu verwendende [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)-Objekt für die Namensauflösung an. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
