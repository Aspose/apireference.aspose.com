---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope‑metod"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page för C++"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope‑metod. Returnerar en samling av definierade prefix‑namespace‑mappningar som för närvarande är i scope i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


Returnerar en samling av definierade prefix‑namnrymdsmappningar som för närvarande är i räckhåll.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| scope | XmlNamespaceScope | Ett [XmlNamespaceScope](../../xmlnamespacescope/)‑värde som specificerar vilken typ av namnrymdsnoder som ska returneras. |

### ReturnValue

En IDictionary‑samling som innehåller de aktuella namespaces som är i scope.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
