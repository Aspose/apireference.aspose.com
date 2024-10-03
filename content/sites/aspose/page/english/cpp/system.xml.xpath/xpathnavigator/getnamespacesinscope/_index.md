---
title: System::Xml::XPath::XPathNavigator::GetNamespacesInScope method
linktitle: GetNamespacesInScope
second_title: Aspose.Page for C++
description: 'System::Xml::XPath::XPathNavigator::GetNamespacesInScope method. Returns the in-scope namespaces of the current node in C++.'
type: docs
weight: 3400
url: /cpp/system.xml.xpath/xpathnavigator/getnamespacesinscope/
---
## XPathNavigator::GetNamespacesInScope method


Returns the in-scope namespaces of the current node.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XPath::XPathNavigator::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| scope | XmlNamespaceScope | An XmlNamespaceScope value specifying the namespaces to return. |

### ReturnValue

An IDictionary collection of namespace names keyed by prefix.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
