---
title: "System::Xml::XPath::XPathExpression::AddSort methode"
linktitle: "AddSort"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathExpression::AddSort methode. Wanneer overschreven in een afgeleide klasse, sorteert het de knooppunten die door de XPath-expressie zijn geselecteerd volgens het opgegeven IComparer-object in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Wanneer overschreven in een afgeleide klasse, sorteert het de knooppunten die door de [XPath](../../) expressie zijn geselecteerd volgens het opgegeven IComparer-object.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Een object dat de sorteersleutel vertegenwoordigt. Dit kan de **string**-waarde van het knooppunt zijn of een [XPathExpression](../) object met een gecompileerde [XPath](../../) expressie. |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Een IComparer-object dat de specifieke datatype-vergelijkingen levert voor het vergelijken van twee objecten op gelijkheid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Wanneer overschreven in een afgeleide klasse, sorteert het de knooppunten die door de [XPath](../../) expressie zijn geselecteerd volgens de opgegeven parameters.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Een object dat de sorteersleutel vertegenwoordigt. Dit kan de **string**-waarde van het knooppunt zijn of een [XPathExpression](../) object met een gecompileerde [XPath](../../) expressie. |
| order | XmlSortOrder | Een [XmlSortOrder](../../xmlsortorder/) waarde die de sorteervolgorde aangeeft. |
| caseOrder | XmlCaseOrder | Een [XmlCaseOrder](../../xmlcaseorder/) waarde die aangeeft hoe hoofdletters en kleine letters gesorteerd moeten worden. |
| lang | String | De taal die moet worden gebruikt voor vergelijking. Gebruikt de [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) klasse die kan worden doorgegeven aan de [String::Compare](../../../system/string/compare/) methode voor de taaltypen, bijvoorbeeld "us-en" voor Amerikaans Engels. Als een lege tekenreeks is opgegeven, wordt de systeemomgeving gebruikt om de [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) te bepalen. |
| dataType | XmlDataType | Een [XmlDataType](../../xmldatatype/) waarde die de sorteervolgorde voor het gegevenstype aangeeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
