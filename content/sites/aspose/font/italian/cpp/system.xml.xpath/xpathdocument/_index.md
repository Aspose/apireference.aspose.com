---
title: "System::Xml::XPath::XPathDocument classe"
linktitle: "XPathDocument"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathDocument classe. Fornisce una rappresentazione veloce, di sola lettura, in memoria di un documento XML utilizzando il modello dati XPath in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Fornisce una rappresentazione veloce, di sola lettura, in memoria di un documento XML utilizzando il modello dati [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Inizializza un oggetto [XPathNavigator](../xpathnavigator/) di sola lettura per navigare tra i nodi in questo [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML contenuti nell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML contenuti nell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato, con la gestione degli spazi bianchi specificata. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML contenuti nell'oggetto TextReader specificato. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML presenti nell'oggetto Stream specificato. |
| [XPathDocument](./xpathdocument/)(const String\&) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML presenti nel file specificato. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Inizializza una nuova istanza della classe [XPathDocument](./) dai dati XML presenti nel file specificato, con la gestione degli spazi bianchi specificata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
