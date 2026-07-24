---
title: "System::Xml::XmlNamespaceManager::AddNamespace metodo"
linktitle: "AddNamespace"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace metodo. Aggiunge lo spazio dei nomi fornito alla collezione in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Aggiunge il namespace specificato alla collezione.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | String | Il prefisso da associare allo spazio dei nomi da aggiungere. Usa [String::Empty](../../../system/string/empty/) per aggiungere uno spazio dei nomi predefinito. Se il [XmlNamespaceManager](../) verrà utilizzato per risolvere gli spazi dei nomi in un'espressione XML Path Language ([XPath](../../../system.xml.xpath/)), è necessario specificare un prefisso. Se un'espressione [XPath](../../../system.xml.xpath/) non include un prefisso, si presume che l'Uniform Resource Identifier (URI) dello spazio dei nomi sia lo spazio dei nomi vuoto. Per ulteriori informazioni sulle espressioni [XPath](../../../system.xml.xpath/) e sul [XmlNamespaceManager](../), fare riferimento ai metodi XmlNode::SelectNodes(String) e XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) metodi. |
| uri | String | Lo spazio dei nomi da aggiungere. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
