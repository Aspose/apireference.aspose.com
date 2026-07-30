---
title: "Metodo System::Xml::XPath::XPathExpression::AddSort"
linktitle: "AddSort"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XPath::XPathExpression::AddSort. Quando sovrascritto in una classe derivata, ordina i nodi selezionati dall'espressione XPath secondo l'oggetto IComparer specificato in C++."
type: docs
weight: 100
url: /it/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Quando sovrascritto in una classe derivata, ordina i nodi selezionati dall'espressione [XPath](../../) secondo l'oggetto IComparer specificato.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Un oggetto che rappresenta la chiave di ordinamento. Può essere il valore **string** del nodo o un oggetto [XPathExpression](../) con un'espressione [XPath](../../) compilata. |
| comparatore | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Un oggetto IComparer che fornisce i confronti specifici del tipo di dati per confrontare due oggetti per equivalenza. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Quando sovrascritto in una classe derivata, ordina i nodi selezionati dall'espressione [XPath](../../) secondo i parametri forniti.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Un oggetto che rappresenta la chiave di ordinamento. Può essere il valore **string** del nodo o un oggetto [XPathExpression](../) con un'espressione [XPath](../../) compilata. |
| order | XmlSortOrder | Un valore [XmlSortOrder](../../xmlsortorder/) che indica l'ordine di ordinamento. |
| caseOrder | XmlCaseOrder | Un valore [XmlCaseOrder](../../xmlcaseorder/) che indica come ordinare le lettere maiuscole e minuscole. |
| lang | String | La lingua da utilizzare per il confronto. Utilizza la classe [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) che può essere passata al metodo [String::Compare](../../../system/string/compare/) per i tipi di lingua, ad esempio, "us-en" per l'inglese statunitense. Se viene specificata una stringa vuota, l'ambiente di sistema viene utilizzato per determinare il [Globalization::CultureInfo](../../../system.globalization/cultureinfo/). |
| dataType | XmlDataType | Un valore [XmlDataType](../../xmldatatype/) che indica l'ordine di ordinamento per il tipo di dati. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
