---
title: "Méthode System::Xml::XPath::XPathExpression::AddSort"
linktitle: "AddSort"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XPath::XPathExpression::AddSort. Lorsqu'elle est remplacée dans une classe dérivée, trie les nœuds sélectionnés par l'expression XPath selon l'objet IComparer spécifié en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Lorsqu'il est remplacé dans une classe dérivée, trie les nœuds sélectionnés par l'expression [XPath](../../) selon l'objet IComparer spécifié.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Un objet représentant la clé de tri. Il peut s'agir de la valeur **string** du nœud ou d'un objet [XPathExpression](../) avec une expression [XPath](../../) compilée. |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Un objet IComparer qui fournit les comparaisons de types de données spécifiques pour comparer deux objets en vue de leur équivalence. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Lorsqu'il est remplacé dans une classe dérivée, trie les nœuds sélectionnés par l'expression [XPath](../../) selon les paramètres fournis.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Un objet représentant la clé de tri. Il peut s'agir de la valeur **string** du nœud ou d'un objet [XPathExpression](../) avec une expression [XPath](../../) compilée. |
| order | XmlSortOrder | Une valeur [XmlSortOrder](../../xmlsortorder/) indiquant l'ordre de tri. |
| caseOrder | XmlCaseOrder | Une valeur [XmlCaseOrder](../../xmlcaseorder/) indiquant comment trier les lettres majuscules et minuscules. |
| lang | String | La langue à utiliser pour la comparaison. Utilise la classe [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) qui peut être transmise à la méthode [String::Compare](../../../system/string/compare/) pour les types de langue, par exemple, "us-en" pour l'anglais des États‑Unis. Si une chaîne vide est spécifiée, l'environnement du système est utilisé pour déterminer le [Globalization::CultureInfo](../../../system.globalization/cultureinfo/). |
| dataType | XmlDataType | Une valeur [XmlDataType](../../xmldatatype/) indiquant l'ordre de tri pour le type de données. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
