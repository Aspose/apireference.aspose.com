---
title: "System::Xml::Xsl::IXsltContextVariable classe"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::IXsltContextVariable classe. Fournit une interface à une variable donnée qui est définie dans la feuille de style pendant l'exécution en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


Fournit une interface vers une variable donnée qui est définie dans la feuille de style pendant l'exécution.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | Évalue la variable à l'exécution et renvoie un objet qui représente la valeur de la variable. |
| virtual [get_IsLocal](./get_islocal/)() | Renvoie une valeur indiquant si la variable est locale. |
| virtual [get_IsParam](./get_isparam/)() | Renvoie une valeur indiquant si la variable est un paramètre Extensible Stylesheet Language Transformations (XSLT). Cela peut être un paramètre d'une feuille de style ou d'un modèle. |
| virtual [get_VariableType](./get_variabletype/)() | Renvoie le XPathResultType représentant le type du langage de chemin XML ([XPath](../../system.xml.xpath/)) de la variable. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
