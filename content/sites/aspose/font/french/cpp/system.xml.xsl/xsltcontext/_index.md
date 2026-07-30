---
title: "System::Xml::Xsl::XsltContext classe"
linktitle: "XsltContext"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XsltContext classe. Encapsule le contexte d'exécution actuel du processeur Extensible Stylesheet Language for Transformations (XSLT) permettant au XML Path Language (XPath) de résoudre les fonctions, paramètres et espaces de noms dans les expressions XPath en C++."
type: docs
weight: 500
url: /fr/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Encapsule le contexte d'exécution actuel du processeur Extensible Stylesheet Language for Transformations (XSLT) permettant au XML Path Language ([XPath](../../system.xml.xpath/)) de résoudre les fonctions, paramètres et espaces de noms dans les expressions [XPath](../../system.xml.xpath/).

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Lorsqu'elle est remplacée dans une classe dérivée, compare les Identifiants Uniformes de Ressource (URI) de base de deux documents en fonction de l'ordre dans lequel les documents ont été chargés par le processeur XSLT (c’est‑à‑dire la classe [XslTransform](../xsltransform/)). |
| virtual [get_Whitespace](./get_whitespace/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient une valeur indiquant s'il faut inclure les nœuds d'espaces blancs dans la sortie. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Lorsqu'elle est remplacée dans une classe dérivée, évalue s'il faut préserver les nœuds d'espaces blancs ou les supprimer pour le contexte donné. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Lorsqu'elle est remplacée dans une classe dérivée, résout une référence de fonction et renvoie un [IXsltContextFunction](../ixsltcontextfunction/) représentant la fonction. Le [IXsltContextFunction](../ixsltcontextfunction/) est utilisé au moment de l'exécution pour obtenir la valeur de retour de la fonction. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Lorsqu'elle est remplacée dans une classe dérivée, résout une référence de variable et renvoie un [IXsltContextVariable](../ixsltcontextvariable/) représentant la variable. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
