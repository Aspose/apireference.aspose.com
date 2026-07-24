---
title: "System::Xml::Xsl::IXsltContextFunction class"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page pour C++"
description: "System::Xml::Xsl::IXsltContextFunction class. Fournit une interface à une fonction donnée définie dans la feuille de style Extensible Stylesheet Language for Transformations (XSLT) lors de l'exécution en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Fournit une interface vers une fonction donnée définie dans la feuille de style Extensible Stylesheet Language for Transformations (XSLT) pendant l'exécution.

```cpp
class IXsltContextFunction : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Renvoie les types du langage de chemin XML ([XPath](../../system.xml.xpath/)) fournis pour la liste des arguments de la fonction. Cette information peut être utilisée pour découvrir la signature de la fonction, ce qui vous permet de différencier les fonctions surchargées. |
| virtual [get_Maxargs](./get_maxargs/)() | Renvoie le nombre maximal d'arguments de la fonction. Cela permet à l'utilisateur de différencier les fonctions surchargées. |
| virtual [get_Minargs](./get_minargs/)() | Renvoie le nombre minimal d'arguments de la fonction. Cela permet à l'utilisateur de différencier les fonctions surchargées. |
| virtual [get_ReturnType](./get_returntype/)() | Renvoie le XPathResultType représentant le type [XPath](../../system.xml.xpath/) renvoyé par la fonction. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Fournit la méthode permettant d'invoquer la fonction avec les arguments donnés dans le contexte donné. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
