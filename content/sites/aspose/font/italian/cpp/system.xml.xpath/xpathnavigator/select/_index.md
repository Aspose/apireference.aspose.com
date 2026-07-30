---
title: "Metodo System::Xml::XPath::XPathNavigator::Select"
linktitle: "Seleziona"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XPath::XPathNavigator::Select. Seleziona un insieme di nodi usando la XPathExpression specificata in C++."
type: docs
weight: 7100
url: /it/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Seleziona un insieme di nodi usando la [XPathExpression](../../xpathexpression/) specificata.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Un oggetto [XPathExpression](../../xpathexpression/) contenente la query [XPath](../../) compilata. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che punta all'insieme di nodi selezionato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


Seleziona un insieme di nodi, usando l'espressione [XPath](../../) specificata.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | String | Una [String](../../../system/string/) che rappresenta un'espressione [XPath](../../). |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che punta all'insieme di nodi selezionato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Seleziona un insieme di nodi usando l'espressione [XPath](../../) specificata con l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indicato per risolvere i prefissi degli spazi dei nomi.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | String | Una [String](../../../system/string/) che rappresenta un'espressione [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi di namespace. |

### ReturnValue

Un [XPathNodeIterator](../../xpathnodeiterator/) che punta all'insieme di nodi selezionato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
