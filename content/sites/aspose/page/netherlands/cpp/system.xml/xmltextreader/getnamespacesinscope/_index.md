---
title: "System::Xml::XmlTextReader::GetNamespacesInScope-methode"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope-methode. Retourneert een collectie die alle momenteel in scope zijnde namespaces bevat in C++."
type: docs
weight: 3400
url: /nl/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Retourneert een collectie die alle momenteel in scope zijnde namespaces bevat.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| scope | XmlNamespaceScope | Een [XmlNamespaceScope](../../xmlnamespacescope/) waarde die het type namespace-knooppunten specificeert dat moet worden geretourneerd. |

### ReturnValue

Een IDictionary-object dat alle huidige in-scope namespaces bevat. Als de lezer niet op een element is gepositioneerd, wordt een lege dictionary (geen namespaces) geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
