---
title: "System::Xml::XPath::XPathExpression::AddSort-Methode"
linktitle: "AddSort"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathExpression::AddSort-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, sortiert sie die durch den XPath‑Ausdruck ausgewählten Knoten gemäß dem angegebenen IComparer‑Objekt in C++."
type: docs
weight: 100
url: /de/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, sortiert sie die durch den [XPath](../../)-Ausdruck ausgewählten Knoten gemäß dem angegebenen IComparer‑Objekt.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Ein Objekt, das den Sortierschlüssel darstellt. Dies kann der **string**‑Wert des Knotens oder ein [XPathExpression](../)-Objekt mit einem kompilierten [XPath](../../)-Ausdruck sein. |
| comparer | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | Ein IComparer‑Objekt, das die spezifischen Datentyp‑Vergleiche zum Vergleich zweier Objekte auf Gleichwertigkeit bereitstellt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, sortiert sie die durch den [XPath](../../)-Ausdruck ausgewählten Knoten gemäß den übergebenen Parametern.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Ein Objekt, das den Sortierschlüssel darstellt. Dies kann der **string**‑Wert des Knotens oder ein [XPathExpression](../)-Objekt mit einem kompilierten [XPath](../../)-Ausdruck sein. |
| order | XmlSortOrder | Ein [XmlSortOrder](../../xmlsortorder/)-Wert, der die Sortierreihenfolge angibt. |
| caseOrder | XmlCaseOrder | Ein [XmlCaseOrder](../../xmlcaseorder/)-Wert, der angibt, wie Groß‑ und Kleinbuchstaben sortiert werden. |
| lang | String | Die für den Vergleich zu verwendende Sprache. Verwendet die Klasse [Globalization::CultureInfo](../../../system.globalization/cultureinfo/), die an die Methode [String::Compare](../../../system/string/compare/) für die Sprachtypen übergeben werden kann, zum Beispiel "us-en" für US‑Englisch. Wenn ein leerer String angegeben wird, wird die Systemumgebung verwendet, um die [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) zu bestimmen. |
| dataType | XmlDataType | Ein [XmlDataType](../../xmldatatype/)-Wert, der die Sortierreihenfolge für den Datentyp angibt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
