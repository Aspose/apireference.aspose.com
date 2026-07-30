---
title: "System::Xml::Xsl::IXsltContextFunction classe"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::IXsltContextFunction classe. Fournit une interface à une fonction donnée définie dans la feuille de style Extensible Stylesheet Language for Transformations (XSLT) pendant l'exécution en C++."
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
| virtual [get_ArgTypes](./get_argtypes/)() | Renvoie les types du XML Path Language ([XPath](../../system.xml.xpath/)) fournis pour la liste des arguments de la fonction. Cette information peut être utilisée pour découvrir la signature de la fonction, ce qui vous permet de différencier les fonctions surchargées. |
| virtual [get_Maxargs](./get_maxargs/)() | Renvoie le nombre maximal d'arguments pour la fonction. Cela permet à l'utilisateur de différencier les fonctions surchargées. |
| virtual [get_Minargs](./get_minargs/)() | Renvoie le nombre minimal d'arguments pour la fonction. Cela permet à l'utilisateur de différencier les fonctions surchargées. |
| virtual [get_ReturnType](./get_returntype/)() | Renvoie le XPathResultType représentant le type [XPath](../../system.xml.xpath/) retourné par la fonction. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Fournit la méthode permettant d'invoquer la fonction avec les arguments fournis dans le contexte donné. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
