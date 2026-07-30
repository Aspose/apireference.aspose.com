---
title: "classe System::Xml::Xsl::XslCompiledTransform"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Font pour C++"
description: "classe System::Xml::Xsl::XslCompiledTransform. Transforme les données XML à l'aide d'une feuille de style XSLT en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


Transforme des données XML à l'aide d'une feuille de style XSLT.

```cpp
class XslCompiledTransform : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | Renvoie un objet [XmlWriterSettings](../../system.xml/xmlwritersettings/) qui contient les informations de sortie dérivées de l'élément **xsl:output** de la feuille de style. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Compile la feuille de style contenue dans le [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Compile la feuille de style XSLT contenue dans le [XmlReader](../../system.xml/xmlreader/). Le [XmlResolver](../../system.xml/xmlresolver/) résout tous les éléments XSLT **import** ou **include** et les paramètres XSLT déterminent les autorisations pour la feuille de style. |
| [Load](./load/)(const String\&) | Charge et compile la feuille de style située à l'URI spécifié. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Charge et compile la feuille de style XSLT spécifiée par l'URI. Le [XmlResolver](../../system.xml/xmlresolver/) résout tous les éléments XSLT **import** ou **include** et les paramètres XSLT déterminent les autorisations pour la feuille de style. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Compile la feuille de style contenue dans l'objet IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | Compile la feuille de style XSLT contenue dans l'IXPathNavigable. Le [XmlResolver](../../system.xml/xmlresolver/) résout tous les éléments XSLT **import** ou **include** et les paramètres XSLT déterminent les autorisations pour la feuille de style. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un TextWriter. Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un flux. Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../system.xml/xmlreader/) et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../system.xml/xmlreader/) et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../system.xml/xmlreader/) et écrit les résultats dans un TextWriter. Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../system.xml/xmlreader/) et écrit les résultats dans un flux. Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un TextWriter. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un flux. Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires. |
| [Transform](./transform/)(const String\&, const String\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un fichier. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../system.xml/xmlreader/) et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires et le [XmlResolver](../../system.xml/xmlresolver/) résout la fonction XSLT **document()**. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un [XmlWriter](../../system.xml/xmlwriter/). Le [XsltArgumentList](../xsltargumentlist/) fournit des arguments d'exécution supplémentaires et le [XmlResolver](../../system.xml/xmlresolver/) résout la fonction XSLT **document()**. |
| [XslCompiledTransform](./xslcompiledtransform/)() | Initialise une nouvelle instance de la classe [XslCompiledTransform](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
