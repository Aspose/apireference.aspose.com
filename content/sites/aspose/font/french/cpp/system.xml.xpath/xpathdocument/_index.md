---
title: "Classe System::Xml::XPath::XPathDocument"
linktitle: "XPathDocument"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XPath::XPathDocument. Fournit une représentation rapide, en lecture seule et en mémoire d'un document XML en utilisant le modèle de données XPath en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


Fournit une représentation rapide, en lecture seule et en mémoire d'un document XML en utilisant le modèle de données [XPath](../).

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | Initialise un objet en lecture seule [XPathNavigator](../xpathnavigator/) pour parcourir les nœuds de ce [XPathDocument](./). |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | Initialise une nouvelle instance de la classe [XPathDocument](./) à partir des données XML contenues dans l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | Initialise une nouvelle instance de la classe [XPathDocument](./) à partir des données XML contenues dans l'objet [XmlReader](../../system.xml/xmlreader/) spécifié avec la gestion des espaces blancs spécifiée. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | Initialise une nouvelle instance de la classe [XPathDocument](./) à partir des données XML contenues dans l'objet TextReader spécifié. |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | Initialise une nouvelle instance de la classe [XPathDocument](./) à partir des données XML dans l'objet Stream spécifié. |
| [XPathDocument](./xpathdocument/)(const String\&) | Initialise une nouvelle instance de la classe [XPathDocument](./) à partir des données XML du fichier spécifié. |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | Initialise une nouvelle instance de la classe [XPathDocument](./) à partir des données XML du fichier spécifié avec la gestion des espaces blancs spécifiée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
