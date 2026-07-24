---
title: "System::Xml::Xsl::XslCompiledTransform klasse"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XslCompiledTransform klasse. Transformeert XML-gegevens met behulp van een XSLT-stylesheet in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


Transformeert XML‑gegevens met behulp van een XSLT‑stijlblad.

```cpp
class XslCompiledTransform : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | Retourneert een [XmlWriterSettings](../../system.xml/xmlwritersettings/) object dat de uitvoerinformatie bevat die is afgeleid van het **xsl:output** element van de stylesheet. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Compileert de stylesheet die zich bevindt in de [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Compileert de XSLT-stylesheet die zich bevindt in de [XmlReader](../../system.xml/xmlreader/). De [XmlResolver](../../system.xml/xmlresolver/) lost alle XSLT **import**- of **include**-elementen op en de XSLT-instellingen bepalen de machtigingen voor de stylesheet. |
| [Load](./load/)(const String\&) | Laadt en compileert de stylesheet die zich bevindt op de opgegeven URI. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Laadt en compileert de XSLT-stylesheet die door de URI wordt opgegeven. De [XmlResolver](../../system.xml/xmlresolver/) lost alle XSLT **import**- of **include**-elementen op en de XSLT-instellingen bepalen de machtigingen voor de stylesheet. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Compileert de stylesheet die zich bevindt in het IXPathNavigable-object. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | Compileert de XSLT-stylesheet die zich bevindt in de IXPathNavigable. De [XmlResolver](../../system.xml/xmlresolver/) lost alle XSLT **import**- of **include**-elementen op en de XSLT-instellingen bepalen de machtigingen voor de stylesheet. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het IXPathNavigable-object en schrijft de resultaten naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het IXPathNavigable-object en schrijft de resultaten naar een [XmlWriter](../../system.xml/xmlwriter/). De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het IXPathNavigable-object en schrijft de resultaten naar een TextWriter. De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het IXPathNavigable-object en schrijft de resultaten naar een stream. De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het [XmlReader](../../system.xml/xmlreader/)-object en schrijft de resultaten naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het [XmlReader](../../system.xml/xmlreader/)-object en schrijft de resultaten naar een [XmlWriter](../../system.xml/xmlwriter/). De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het [XmlReader](../../system.xml/xmlreader/)-object en schrijft de resultaten naar een TextWriter. De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het [XmlReader](../../system.xml/xmlreader/) object en geeft de resultaten weer naar een stream. De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een [XmlWriter](../../system.xml/xmlwriter/). De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een TextWriter. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een stream. De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten. |
| [Transform](./transform/)(const String\&, const String\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door de URI en geeft de resultaten weer naar een bestand. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Voert de transformatie uit met het invoerdocument dat is opgegeven door het [XmlReader](../../system.xml/xmlreader/) object en geeft de resultaten weer naar een [XmlWriter](../../system.xml/xmlwriter/). De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten en de [XmlResolver](../../system.xml/xmlresolver/) lost de XSLT **document()**‑functie op. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Voert de transformatie uit door het invoerdocument te gebruiken dat is opgegeven door het IXPathNavigable object en geeft de resultaten weer naar een [XmlWriter](../../system.xml/xmlwriter/). De [XsltArgumentList](../xsltargumentlist/) biedt extra runtime‑argumenten en de [XmlResolver](../../system.xml/xmlresolver/) lost de XSLT **document()**‑functie op. |
| [XslCompiledTransform](./xslcompiledtransform/)() | Initialiseert een nieuw exemplaar van de klasse [XslCompiledTransform](./). |
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
