---
title: "System::Xml::XmlDocument::CreateAttribute metodu"
linktitle: "CreateAttribute"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDocument::CreateAttribute metodu. Belirtilen adla bir XmlAttribute oluşturur C++'da."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Belirtilen adla bir [XmlAttribute](../../xmlattribute/) oluşturur.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| name | const String\& | Özniteliğin nitelikli adı. Ad bir iki nokta üstüste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) değeri ilk iki nokta üstüstesinden önceki kısmı yansıtır ve [XmlDocument::get_LocalName](../get_localname/) değeri ilk iki nokta üstüstesinden sonraki kısmı yansıtır. [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) değeri, önek **xmlns** gibi tanınan yerleşik bir önek olmadıkça boş kalır. Bu durumda get_NamespaceURI değeri [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) olur. |

### ReturnValue

Yeni [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Belirtilen [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlAttribute](../../xmlattribute/) oluşturur.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| prefix | const String\& | Özniteliğin öneki (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. |
| localName | const String\& | Özelliğin yerel adı. |
| namespaceURI | const String\& | Özniteliğin ad alanı URI'si (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. **prefix** **xmlns** ise, bu parametre [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) olmalıdır; aksi takdirde bir istisna fırlatılır. |

### ReturnValue

Yeni [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Belirtilen nitelikli ad ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir [XmlAttribute](../../xmlattribute/) oluşturur.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| qualifiedName | const String\& | Özniteliğin nitelikli adı. Ad bir iki nokta üstüste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) değeri iki nokta üstüstesinden önceki kısmı, [XmlDocument::get_LocalName](../get_localname/) değeri ise iki nokta üstüstesinden sonraki kısmı yansıtır. |
| namespaceURI | const String\& | Özniteliğin namespaceURI'si. Nitelikli ad **xmlns** öneki içeriyorsa, bu parametre [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) olmalıdır. |

### ReturnValue

Yeni [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
