---
title: "System::Xml::XPath::XPathNavigator::Evaluate metode"
linktitle: "Evaluate"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate metode. Mengevaluasi XPathExpression dan mengembalikan hasil yang bertipe dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


Mengevaluasi [XPathExpression](../../xpathexpression/) dan mengembalikan hasil yang bertipe.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Sebuah [XPathExpression](../../xpathexpression/) yang dapat dievaluasi. |

### ReturnValue

Hasil dari ekspresi ([Boolean](../../../system/boolean/), angka, string, atau node set). Ini memetakan ke objek [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), atau [XPathNodeIterator](../../xpathnodeiterator/) secara berurutan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Menggunakan konteks yang diberikan untuk mengevaluasi [XPathExpression](../../xpathexpression/), dan mengembalikan hasil yang bertipe.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Sebuah [XPathExpression](../../xpathexpression/) yang dapat dievaluasi. |
| context | SharedPtr\<XPathNodeIterator\> | Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang menunjuk ke kumpulan node terpilih tempat evaluasi akan dilakukan. |

### ReturnValue

Hasil dari ekspresi ([Boolean](../../../system/boolean/), angka, string, atau node set). Ini memetakan ke objek [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), atau [XPathNodeIterator](../../xpathnodeiterator/) secara berurutan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


Mengevaluasi ekspresi [XPath](../../) yang ditentukan dan mengembalikan hasil yang bertipe.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | String | Sebuah string yang mewakili ekspresi [XPath](../../) yang dapat dievaluasi. |

### ReturnValue

Hasil dari ekspresi ([Boolean](../../../system/boolean/), angka, string, atau node set). Ini memetakan ke objek [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), atau [XPathNodeIterator](../../xpathnodeiterator/) secara berurutan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Mengevaluasi ekspresi [XPath](../../) yang ditentukan dan mengembalikan hasil yang bertipe, menggunakan objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan prefiks namespace dalam ekspresi [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | String | Sebuah string yang mewakili ekspresi [XPath](../../) yang dapat dievaluasi. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan prefiks namespace dalam ekspresi [XPath](../../). |

### ReturnValue

Hasil dari ekspresi ([Boolean](../../../system/boolean/), angka, string, atau node set). Ini memetakan ke objek [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), atau [XPathNodeIterator](../../xpathnodeiterator/) secara berurutan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
