---
title: AppendChildElement()
second_title: Aspose.Slides for C++ API Reference
description: Creates a new child element node at the end of the list of child nodes of the current node using the namespace prefix, local name and namespace URI specified with the value specified.
type: docs
weight: 1002
url: /cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement(String, String, String, String) method


Creates a new child element node at the end of the list of child nodes of the current node using the namespace prefix, local name and namespace URI specified with the value specified.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| prefix | [String](../../../system/string/) | The namespace prefix of the new child element node (if any). |
| localName | [String](../../../system/string/) | The local name of the new child element node (if any). |
| namespaceURI | [String](../../../system/string/) | The namespace URI of the new child element node (if any). [String::Empty](../../../system/string/empty/) and **nullptr** are equivalent. |
| value | [String](../../../system/string/) | The value of the new child element node. If [String::Empty](../../../system/string/empty/) or **nullptr** are passed, an empty element is created. |

## See Also

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Slides](../../../)