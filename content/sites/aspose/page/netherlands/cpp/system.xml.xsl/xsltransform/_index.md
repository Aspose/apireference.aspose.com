---
title: "System::Xml::Xsl::XslTransform klasse"
linktitle: "XslTransform"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XslTransform klasse. Transformeert XML-gegevens met behulp van een Extensible Stylesheet Language for Transformations (XSLT) stijlblad in C++."
type: docs
weight: 700
url: /nl/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Transformeert XML‑gegevens met behulp van een Extensible Stylesheet Language for Transformations (XSLT) stijlblad.

```cpp
class XslTransform : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Laadt het XSLT‑stijlblad dat zich bevindt in de [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Laadt het XSLT‑stijlblad dat zich bevindt in de [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Laadt het XSLT‑stijlblad dat zich bevindt in de IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Laadt het XSLT‑stijlblad dat zich bevindt in de IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | Laadt het XSLT‑stijlblad dat zich bevindt in de XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Laadt het XSLT‑stijlblad dat zich bevindt in de XPathNavigator. |
| [Load](./load/)(const String\&) | Laadt het XSLT‑stijlblad gespecificeerd door een URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Laadt het XSLT‑stijlblad gespecificeerd door een URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Stelt de [XmlResolver](../../system.xml/xmlresolver/) in die wordt gebruikt om externe bronnen op te lossen wanneer de [XslTransform::Transform](./transform/) methode wordt aangeroepen. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven args en schrijft het resultaat naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven args en schrijft het resultaat naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Transformeert de XML-gegevens in de XPathNavigator met de opgegeven **args** en schrijft het resultaat naar een TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Transformeert de XML-gegevens in de IXPathNavigable met de opgegeven **args** en schrijft het resultaat naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transformeert de XML-gegevens in het invoerbestand en schrijft het resultaat naar een uitvoerbestand. |
| [Transform](./transform/)(const String\&, const String\&) | Transformeert de XML-gegevens in het invoerbestand en schrijft het resultaat naar een uitvoerbestand. |
| [XslTransform](./xsltransform/)() | Initialiseert een nieuw exemplaar van de [XslTransform](./) klasse. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
