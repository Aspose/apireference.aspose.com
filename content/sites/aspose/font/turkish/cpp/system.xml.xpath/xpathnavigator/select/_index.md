---
title: "System::Xml::XPath::XPathNavigator::Select yöntemi"
linktitle: "Seç"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::Select yöntemi. Belirtilen XPathExpression kullanarak bir düğüm kümesini C++'ta seçer."
type: docs
weight: 7100
url: /tr/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Belirtilen [XPathExpression](../../xpathexpression/) kullanarak bir düğüm kümesini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Derlenmiş [XPath](../../) sorgusunu içeren bir [XPathExpression](../../xpathexpression/) nesnesi. |

### ReturnValue

Seçilen düğüm kümesini işaret eden bir [XPathNodeIterator](../../xpathnodeiterator/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


Belirtilen [XPath](../../) ifadesini kullanarak bir düğüm kümesini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | String | Bir [XPath](../../) ifadesini temsil eden bir [String](../../../system/string/) nesnesi. |

### ReturnValue

Seçilen düğüm kümesini işaret eden bir [XPathNodeIterator](../../xpathnodeiterator/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Belirtilen [XPath](../../) ifadesini, ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesiyle birlikte kullanarak bir düğüm kümesini seçer.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| xpath | String | Bir [XPath](../../) ifadesini temsil eden bir [String](../../../system/string/) nesnesi. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Ad alanı öneklerini çözmek için kullanılan [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |

### ReturnValue

Seçilen düğüm kümesini işaret eden bir [XPathNodeIterator](../../xpathnodeiterator/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
