---
title: "System::Xml::Xsl::XslTransform Klasse"
linktitle: "XslTransform"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XslTransform Klasse. Transformiert XML-Daten mithilfe eines Extensible Stylesheet Language for Transformations (XSLT) Stylesheets in C++."
type: docs
weight: 700
url: /de/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Transformiert XML-Daten mithilfe eines Extensible Stylesheet Language for Transformations (XSLT)-Stylesheets.

```cpp
class XslTransform : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Lädt das XSLT-Stylesheet, das im [XmlReader](../../system.xml/xmlreader/) enthalten ist. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Lädt das XSLT-Stylesheet, das im [XmlReader](../../system.xml/xmlreader/) enthalten ist. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Lädt das XSLT-Stylesheet, das im IXPathNavigable enthalten ist. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Lädt das XSLT-Stylesheet, das im IXPathNavigable enthalten ist. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | Lädt das XSLT-Stylesheet, das im XPathNavigator enthalten ist. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Lädt das XSLT-Stylesheet, das im XPathNavigator enthalten ist. |
| [Load](./load/)(const String\&) | Lädt das XSLT-Stylesheet, das durch eine URL angegeben wird. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Lädt das XSLT-Stylesheet, das durch eine URL angegeben wird. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Legt den [XmlResolver](../../system.xml/xmlresolver/) fest, der zum Auflösen externer Ressourcen verwendet wird, wenn die Methode [XslTransform::Transform](./transform/) aufgerufen wird. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../system.xml/xmlreader/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../system.xml/xmlreader/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen args und gibt das Ergebnis an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen args und gibt das Ergebnis an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Transformiert die XML-Daten im XPathNavigator mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../system.xml/xmlreader/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen [XmlReader](../../system.xml/xmlreader/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen TextWriter aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen Stream aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Transformiert die XML-Daten im IXPathNavigable mit den angegebenen **args** und gibt das Ergebnis an einen [XmlWriter](../../system.xml/xmlwriter/) aus. |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformiert die XML-Daten in der Eingabedatei und gibt das Ergebnis in einer Ausgabedatei aus. |
| [Transform](./transform/)(const String\&, const String\&) | Transformiert die XML-Daten in der Eingabedatei und gibt das Ergebnis in einer Ausgabedatei aus. |
| [XslTransform](./xsltransform/)() | Initialisiert eine neue Instanz der [XslTransform](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
