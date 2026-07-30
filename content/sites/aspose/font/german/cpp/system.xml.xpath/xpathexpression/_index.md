---
title: "System::Xml::XPath::XPathExpression Klasse"
linktitle: "XPathExpression"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathExpression Klasse. Stellt eine typisierte Klasse bereit, die einen kompilierten XPath-Ausdruck in C++ darstellt."
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
| virtual [Clone](./clone/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt eine Kopie dieses [XPathExpression](./) zurück. |
| static [Compile](./compile/)(const String\&) | Kompiliert den angegebenen [XPath](../)-Ausdruck und gibt ein [XPathExpression](./)-Objekt zurück, das den [XPath](../)-Ausdruck darstellt. |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Kompiliert den angegebenen [XPath](../)-Ausdruck, wobei das angegebene [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)-Objekt für die Namensauflösung verwendet wird, und gibt ein [XPathExpression](./)-Objekt zurück, das den [XPath](../)-Ausdruck darstellt. |
| virtual [get_Expression](./get_expression/)() | Wenn in einer abgeleiteten Klasse überschrieben, erhält eine **string**-Darstellung des [XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Wenn in einer abgeleiteten Klasse überschrieben, erhält den Ergebnis‑Typ des [XPath](../)-Ausdrucks. |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Wenn in einer abgeleiteten Klasse überschrieben, gibt das [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)-Objekt an, das für die Namensauflösung verwendet werden soll. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Wenn in einer abgeleiteten Klasse überschrieben, gibt das [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)-Objekt an, das für die Namensauflösung verwendet werden soll. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
