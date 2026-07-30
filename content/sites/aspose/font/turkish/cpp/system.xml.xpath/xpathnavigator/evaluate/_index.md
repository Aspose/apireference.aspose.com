---
title: "System::Xml::XPath::XPathNavigator::Evaluate yöntemi"
linktitle: "Evaluate"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate yöntemi. XPathExpression'ı değerlendirir ve tiplenmiş sonucu C++'ta döndürür."
type: docs
weight: 1200
url: /tr/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


[XPathExpression](../../xpathexpression/) ifadesini değerlendirir ve tiplenmiş sonucu döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Değerlendirilebilecek bir [XPathExpression](../../xpathexpression/) |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Sağlanan bağlamı kullanarak [XPathExpression](../../xpathexpression/) ifadesini değerlendirir ve tiplenmiş sonucu döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Değerlendirilebilecek bir [XPathExpression](../../xpathexpression/) |
| context | SharedPtr\<XPathNodeIterator\> | Değerlendirmenin yapılacağı seçilen düğüm kümesine işaret eden bir [XPathNodeIterator](../../xpathnodeiterator/). |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String) method


Belirtilen [XPath](../../) ifadesini değerlendirir ve tiplenmiş sonucu döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | String | Değerlendirilebilecek bir [XPath](../../) ifadesini temsil eden bir dize. |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Belirtilen [XPath](../../) ifadesini değerlendirir ve tiplenmiş sonucu döndürür, [XPath](../../) ifadesindeki ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesini kullanarak.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | String | Değerlendirilebilecek bir [XPath](../../) ifadesini temsil eden bir dize. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) ifadesindeki ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

İfadenin sonucu ([Boolean](../../../system/boolean/), sayı, dize veya düğüm kümesi). Bu, sırasıyla [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) veya [XPathNodeIterator](../../xpathnodeiterator/) nesnelerine karşılık gelir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
