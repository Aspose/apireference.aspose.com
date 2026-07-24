---
title: "Classe System::Xml::XPath::XPathExpression"
linktitle: "XPathExpression"
second_title: "Aspose.Page pour C++"
description: "Classe System::Xml::XPath::XPathExpression. Fournit une classe typée qui représente une expression XPath compilée en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Fournit une classe typée qui représente une expression [XPath](../) compilée.

```cpp
class XPathExpression : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Lorsqu'elle est remplacée dans une classe dérivée, trie les nœuds sélectionnés par l'expression [XPath](../) selon l'objet IComparer spécifié. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Lorsqu'elle est remplacée dans une classe dérivée, trie les nœuds sélectionnés par l'expression [XPath](../) selon les paramètres fournis. |
| virtual [Clone](./clone/)() | Lorsqu'elle est remplacée dans une classe dérivée, renvoie un clone de cet [XPathExpression](./). |
| static [Compile](./compile/)(const String\&) | Compile l'expression [XPath](../) spécifiée et renvoie un objet [XPathExpression](./) représentant l'expression [XPath](../). |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Compile l'expression [XPath](../) spécifiée, avec l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) indiqué pour la résolution des espaces de noms, et renvoie un objet [XPathExpression](./) qui représente l'expression [XPath](../). |
| virtual [get_Expression](./get_expression/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient une représentation **string** de l'[XPathExpression](./). |
| virtual [get_ReturnType](./get_returntype/)() | Lorsqu'elle est remplacée dans une classe dérivée, obtient le type de résultat de l'expression [XPath](../). |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Lorsqu'elle est remplacée dans une classe dérivée, spécifie l'objet [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) à utiliser pour la résolution des espaces de noms. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Lorsqu'elle est remplacée dans une classe dérivée, spécifie l'objet [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) à utiliser pour la résolution des espaces de noms. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
