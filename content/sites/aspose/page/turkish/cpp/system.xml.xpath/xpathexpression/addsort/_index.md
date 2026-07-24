---
title: "System::Xml::XPath::XPathExpression::AddSort metodu"
linktitle: "AddSort"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathExpression::AddSort metodu. Türetilmiş bir sınıfta geçersiz kılındığında, C++'ta belirtilen IComparer nesnesine göre XPath ifadesiyle seçilen düğümleri sıralar."
type: docs
weight: 100
url: /tr/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen IComparer nesnesine göre [XPath](../../) ifadesiyle seçilen düğümleri sıralar.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Sıralama anahtarını temsil eden bir nesne. Bu, düğümün **string** değeri veya derlenmiş bir [XPath](../../) ifadesine sahip bir [XPathExpression](../) nesnesi olabilir. |
| karşılaştırıcı | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | İki nesneyi eşdeğerlik açısından karşılaştırmak için belirli veri tipi karşılaştırmalarını sağlayan bir IComparer nesnesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


Türetilmiş bir sınıfta geçersiz kılındığında, sağlanan parametrelere göre [XPath](../../) ifadesiyle seçilen düğümleri sıralar.

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | Sıralama anahtarını temsil eden bir nesne. Bu, düğümün **string** değeri veya derlenmiş bir [XPath](../../) ifadesine sahip bir [XPathExpression](../) nesnesi olabilir. |
| order | XmlSortOrder | Sıralama düzenini belirten bir [XmlSortOrder](../../xmlsortorder/) değeri. |
| caseOrder | XmlCaseOrder | Büyük ve küçük harflerin nasıl sıralanacağını belirten bir [XmlCaseOrder](../../xmlcaseorder/) değeri. |
| lang | String | Karşılaştırma için kullanılacak dil. Dil türleri için [String::Compare](../../../system/string/compare/) yöntemine geçirilebilen [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) sınıfını kullanır, örneğin ABD İngilizcesi için "us-en". Boş bir dize belirtilirse, sistem ortamı [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) belirlemek için kullanılır. |
| dataType | XmlDataType | Veri tipi için sıralama düzenini belirten bir [XmlDataType](../../xmldatatype/) değeri. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
