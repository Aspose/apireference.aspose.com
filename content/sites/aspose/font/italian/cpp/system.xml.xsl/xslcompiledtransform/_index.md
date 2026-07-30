---
title: "System::Xml::Xsl::XslCompiledTransform classe"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XslCompiledTransform classe. Trasforma i dati XML utilizzando un foglio di stile XSLT in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


Trasforma i dati XML utilizzando un foglio di stile XSLT.

```cpp
class XslCompiledTransform : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | Restituisce un oggetto [XmlWriterSettings](../../system.xml/xmlwritersettings/) che contiene le informazioni di output derivanti dall'elemento **xsl:output** del foglio di stile. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Compila il foglio di stile contenuto nel [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Compila il foglio di stile XSLT contenuto nel [XmlReader](../../system.xml/xmlreader/). Il [XmlResolver](../../system.xml/xmlresolver/) risolve tutti gli elementi XSLT **import** o **include** e le impostazioni XSLT determinano le autorizzazioni per il foglio di stile. |
| [Load](./load/)(const String\&) | Carica e compila il foglio di stile situato all'URI specificato. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Carica e compila il foglio di stile XSLT specificato dall'URI. Il [XmlResolver](../../system.xml/xmlresolver/) risolve tutti gli elementi XSLT **import** o **include** e le impostazioni XSLT determinano le autorizzazioni per il foglio di stile. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Compila il foglio di stile contenuto nell'oggetto IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | Compila il foglio di stile XSLT contenuto nell'IXPathNavigable. Il [XmlResolver](../../system.xml/xmlresolver/) risolve tutti gli elementi XSLT **import** o **include** e le impostazioni XSLT determinano le autorizzazioni per il foglio di stile. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e scrive i risultati in un TextWriter. Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e scrive i risultati in uno stream. Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../system.xml/xmlreader/) e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../system.xml/xmlreader/) e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../system.xml/xmlreader/) e scrive i risultati in un TextWriter. Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../system.xml/xmlreader/) e scrive i risultati in uno stream. Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in un TextWriter. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in uno stream. Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi. |
| [Transform](./transform/)(const String\&, const String\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'URI e scrive i risultati in un file. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto [XmlReader](../../system.xml/xmlreader/) e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi e il [XmlResolver](../../system.xml/xmlresolver/) risolve la funzione XSLT **document()**. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Esegue la trasformazione utilizzando il documento di input specificato dall'oggetto IXPathNavigable e scrive i risultati in un [XmlWriter](../../system.xml/xmlwriter/). Il [XsltArgumentList](../xsltargumentlist/) fornisce argomenti di runtime aggiuntivi e il [XmlResolver](../../system.xml/xmlresolver/) risolve la funzione XSLT **document()**. |
| [XslCompiledTransform](./xslcompiledtransform/)() | Inizializza una nuova istanza della classe [XslCompiledTransform](./). |
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
