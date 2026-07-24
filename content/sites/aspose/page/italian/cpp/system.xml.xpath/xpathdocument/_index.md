---
title: "System::Xml::XPath::XPathDocument classe"
linktitle: "XPathDocument"
second_title: "Aspose.Page per C++"
description: "System::Xml::XPath::XPathDocument classe. Fornisce una rappresentazione veloce, di sola lettura, in memoria di un documento XML utilizzando il modello di dati XPath in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Fornisce una rappresentazione veloce, di sola lettura, in memoria di un documento XML utilizzando il modello di dati [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Inizializza un oggetto [XPathNavigator](../xpathnavigator/) di sola lettura per navigare tra i nodi in questo [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML contenuti nell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML contenuti nell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato con la gestione degli spazi bianchi specificata. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML contenuti nell'oggetto TextReader specificato. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML nell'oggetto Stream specificato. |
| [XPathDocument](./xpathdocument/)(const String\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML nel file specificato. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML nel file specificato con la gestione degli spazi bianchi specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
