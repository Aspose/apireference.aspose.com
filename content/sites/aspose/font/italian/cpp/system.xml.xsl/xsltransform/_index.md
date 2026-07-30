---
title: "Classe System::Xml::Xsl::XslTransform"
linktitle: "XslTransform"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::Xsl::XslTransform. Trasforma i dati XML utilizzando un foglio di stile Extensible Stylesheet Language for Transformations (XSLT) in C++."
type: docs
weight: 700
url: /it/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Trasforma i dati XML utilizzando un foglio di stile Extensible Stylesheet Language for Transformations (XSLT).

```cpp
class XslTransform : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Carica il foglio di stile XSLT contenuto nel [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Carica il foglio di stile XSLT contenuto nel [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Carica il foglio di stile XSLT contenuto nell'IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Carica il foglio di stile XSLT contenuto nell'IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | Carica il foglio di stile XSLT contenuto nel XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Carica il foglio di stile XSLT contenuto nel XPathNavigator. |
| [Load](./load/)(const String\&) | Carica il foglio di stile XSLT specificato da un URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Carica il foglio di stile XSLT specificato da un URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Imposta il [XmlResolver](../../system.xml/xmlresolver/) utilizzato per risolvere le risorse esterne quando viene chiamato il metodo [XslTransform::Transform](./transform/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nel XPathNavigator usando gli argomenti specificati e restituisce il risultato a un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Trasforma i dati XML nel XPathNavigator usando gli argomenti specificati e restituisce il risultato a un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a uno Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a uno Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Trasforma i dati XML nel XPathNavigator usando i **args** specificati e restituisce il risultato a un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a uno Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a uno Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Trasforma i dati XML nell'IXPathNavigable usando i **args** specificati e restituisce il risultato a un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Trasforma i dati XML nel file di input e restituisce il risultato in un file di output. |
| [Transform](./transform/)(const String\&, const String\&) | Trasforma i dati XML nel file di input e restituisce il risultato in un file di output. |
| [XslTransform](./xsltransform/)() | Inizializza una nuova istanza della classe [XslTransform](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
