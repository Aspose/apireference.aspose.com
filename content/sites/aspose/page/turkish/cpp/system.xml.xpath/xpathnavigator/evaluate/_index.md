---
title: "System::Xml::XPath::XPathNavigator::Evaluate method"
linktitle: "Evaluate"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate method. XPathExpression'ı değerlendirir ve C++'ta tiplenmiş sonucu döndürür."
type: docs
weight: 1200
url: /tr/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


[XPathExpression](../../xpathexpression/) ifadesini değerlendirir ve tiplenmiş sonucu döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Değerlendirilebilen bir [XPathExpression](../../xpathexpression/) ifadesi. |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Sağlanan bağlamı kullanarak [XPathExpression](../../xpathexpression/) ifadesini değerlendirir ve tiplenmiş sonucu döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Değerlendirilebilen bir [XPathExpression](../../xpathexpression/) ifadesi. |
| context | SharedPtr\<XPathNodeIterator\> | Değerlendirmenin yapılacağı seçilen düğüm kümesine işaret eden bir [XPathNodeIterator](../../xpathnodeiterator/). |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


Belirtilen [XPath](../../) ifadesini değerlendirir ve tiplenmiş sonucu döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| xpath | String | Değerlendirilebilen bir [XPath](../../) ifadesini temsil eden bir dize. |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Belirtilen [XPath](../../) ifadesini değerlendirir ve tiplenmiş sonucu döndürür; [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak [XPath](../../) ifadesindeki ad alanı öneklerini çözer.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| xpath | String | Değerlendirilebilen bir [XPath](../../) ifadesini temsil eden bir dize. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) ifadesindeki ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
