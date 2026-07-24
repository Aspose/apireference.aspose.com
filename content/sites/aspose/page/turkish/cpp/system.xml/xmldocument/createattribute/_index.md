---
title: "System::Xml::XmlDocument::CreateAttribute yöntemi"
linktitle: "CreateAttribute"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument::CreateAttribute yöntemi. C++'da belirtilen adla bir XmlAttribute oluşturur."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Belirtilen adla bir [XmlAttribute](../../xmlattribute/) oluşturur.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| name | const String\& | The qualified name of the attribute. If the name contains a colon, the [XmlNode::get_Prefix](../../xmlnode/get_prefix/) value reflects the part of the name preceding the first colon and the [XmlDocument::get_LocalName](../get_localname/) value reflects the part of the name following the first colon. The [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) remains empty unless the prefix is a recognized built-in prefix such as **xmlns**. In this case get_NamespaceURI has a value of [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Yeni [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Belirtilen [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlAttribute](../../xmlattribute/) oluşturur.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| prefix | const String\& | Özniteliğin öneki (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. |
| localName | const String\& | Özniteliğin yerel adı. |
| namespaceURI | const String\& | Özniteliğin ad alanı URI'si (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. **prefix** **xmlns** ise, bu parametre [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) olmalıdır; aksi takdirde bir istisna fırlatılır. |

### ReturnValue

Yeni [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Belirtilen nitelikli ad ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlAttribute](../../xmlattribute/) oluşturur.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| qualifiedName | const String\& | Özniteliğin nitelikli adı. Ad bir iki nokta üst üste (:) içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) değeri iki nokta üst üstenin öncesindeki kısmı, [XmlDocument::get_LocalName](../get_localname/) değeri ise iki nokta üst üstenin sonrasındaki kısmı yansıtır. |
| namespaceURI | const String\& | Özniteliğin namespaceURI'si. Nitelikli ad **xmlns** öneki içeriyorsa, bu parametre [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) olmalıdır. |

### ReturnValue

Yeni [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
