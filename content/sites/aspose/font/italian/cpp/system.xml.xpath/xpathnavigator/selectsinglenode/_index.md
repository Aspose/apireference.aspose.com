---
title: "Metodo System::Xml::XPath::XPathNavigator::SelectSingleNode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XPath::XPathNavigator::SelectSingleNode. Seleziona un singolo nodo nel XPathNavigator utilizzando l'oggetto XPathExpression specificato in C++."
type: docs
weight: 7500
url: /it/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Seleziona un singolo nodo nel [XPathNavigator](../) utilizzando l'oggetto [XPathExpression](../../xpathexpression/) specificato.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Un oggetto [XPathExpression](../../xpathexpression/) contenente la query [XPath](../../) compilata. |

### ReturnValue

Un oggetto [XPathNavigator](../) che contiene il primo nodo corrispondente per la query [XPath](../../) specificata; altrimenti **nullptr** se non ci sono risultati della query.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Seleziona un singolo nodo nel [XPathNavigator](../) utilizzando la query [XPath](../../) specificata.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | String | Una [String](../../../system/string/) che rappresenta un'espressione [XPath](../../). |

### ReturnValue

Un oggetto [XPathNavigator](../) che contiene il primo nodo corrispondente per la query [XPath](../../) specificata; altrimenti, **nullptr** se non ci sono risultati della query.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Seleziona un singolo nodo nell'oggetto [XPathNavigator](../) utilizzando la query [XPath](../../) specificata con l'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) indicato per risolvere i prefissi dei namespace.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xpath | String | Una [String](../../../system/string/) che rappresenta un'espressione [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | L'oggetto [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) utilizzato per risolvere i prefissi dei namespace nella query [XPath](../../). |

### ReturnValue

Un oggetto [XPathNavigator](../) che contiene il primo nodo corrispondente per la query [XPath](../../) specificata; altrimenti **nullptr** se non ci sono risultati della query.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
