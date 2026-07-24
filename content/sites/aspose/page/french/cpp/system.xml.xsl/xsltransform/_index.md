---
title: "System::Xml::Xsl::XslTransform class"
linktitle: "XslTransform"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Xsl::XslTransform classe. Transforme des données XML en utilisant une feuille de style Extensible Stylesheet Language for Transformations (XSLT) en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Transforme les données XML en utilisant une feuille de style Extensible Stylesheet Language for Transformations (XSLT).

```cpp
class XslTransform : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Charge la feuille de style XSLT contenue dans le [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Charge la feuille de style XSLT contenue dans le [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Charge la feuille de style XSLT contenue dans le IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Charge la feuille de style XSLT contenue dans le IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | Charge la feuille de style XSLT contenue dans le XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Charge la feuille de style XSLT contenue dans le XPathNavigator. |
| [Load](./load/)(const String\&) | Charge la feuille de style XSLT spécifiée par une URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Charge la feuille de style XSLT spécifiée par une URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Définit le [XmlResolver](../../system.xml/xmlresolver/) utilisé pour résoudre les ressources externes lorsque la méthode [XslTransform::Transform](./transform/) est appelée. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les args spécifiés et renvoie le résultat vers un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les args spécifiés et renvoie le résultat vers un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Transforme les données XML du fichier d'entrée et renvoie le résultat dans un fichier de sortie. |
| [Transform](./transform/)(const String\&, const String\&) | Transforme les données XML du fichier d'entrée et renvoie le résultat dans un fichier de sortie. |
| [XslTransform](./xsltransform/)() | Initialise une nouvelle instance de la classe [XslTransform](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
