---
title: "Metodo System::Xml::XmlNamespaceManager::AddNamespace"
linktitle: "AddNamespace"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlNamespaceManager::AddNamespace. Aggiunge il namespace specificato alla collezione in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Aggiunge lo spazio dei nomi fornito alla collezione.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| prefix | String | Il prefisso da associare al namespace da aggiungere. Usa [String::Empty](../../../system/string/empty/) per aggiungere un namespace predefinito. Se il [XmlNamespaceManager](../) verrà utilizzato per risolvere i namespace in un'espressione XML Path Language ([XPath](../../../system.xml.xpath/)), è necessario specificare un prefisso. Se un'espressione [XPath](../../../system.xml.xpath/) non include un prefisso, si assume che l'Uniform Resource Identifier (URI) del namespace sia il namespace vuoto. Per ulteriori informazioni sulle espressioni [XPath](../../../system.xml.xpath/) e sul [XmlNamespaceManager](../), consulta i metodi XmlNode::SelectNodes(String) e XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) metodi. |
| uri | Stringa | Il namespace da aggiungere. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
