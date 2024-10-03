---
title: System::Xml::XmlNode::idx_get method
linktitle: idx_get
second_title: Aspose.Page for C++
description: 'System::Xml::XmlNode::idx_get method. Returns the first child element with the specified XmlNode::get_Name in C++.'
type: docs
weight: 4600
url: /cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String) method


Returns the first child element with the specified [XmlNode::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The qualified name of the element to retrieve. |

### ReturnValue

The first [XmlElement](../../xmlelement/) that matches the specified name. It returns **nullptr** if there is no match.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String, String) method


Returns the first child element with the specified [XmlNode::get_LocalName](../get_localname/) and [XmlNode::get_NamespaceURI](../get_namespaceuri/) values.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Type | Description |
| --- | --- | --- |
| localname | String | The local name of the element. |
| ns | String | The namespace URI of the element. |

### ReturnValue

The first [XmlElement](../../xmlelement/) with the matching **localname** and **ns**. It returns **nullptr** if there is no match.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
