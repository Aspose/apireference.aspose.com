---
title: "System::Xml::XmlDocument::CreateElement yöntemi"
linktitle: "CreateElement"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument::CreateElement yöntemi. Belirtilen adla bir öğe oluşturur C++ içinde."
type: docs
weight: 800
url: /tr/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Belirtilen adla bir öğe oluşturur.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| name | const String\& | Öğenin nitelikli adı. Ad bir iki nokta üst üste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) değeri iki nokta üst üstenin önündeki kısmı, [XmlDocument::get_LocalName](../get_localname/) değeri ise iki nokta üst üstenin sonraki kısmını yansıtır. Nitelikli ad **xmlns** önekini içeremez. |

### ReturnValue

Yeni [XmlElement](../../xmlelement/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Belirtilen [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile bir öğe oluşturur.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| prefix | const String\& | Yeni öğenin öneki (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. |
| localName | const String\& | Yeni öğenin yerel adı. |
| namespaceURI | const String\& | Yeni öğenin ad alanı URI'si (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. |

### ReturnValue

Yeni [XmlElement](../../xmlelement/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


[XmlElement](../../xmlelement/) öğesini nitelikli ad ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile oluşturur.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| qualifiedName | const String\& | Öğenin nitelikli adı. Ad bir iki nokta üstüste içeriyorsa, [XmlNode::get_Prefix](../../xmlnode/get_prefix/) değeri iki nokta üstüste öncesindeki bölümü, [XmlDocument::get_LocalName](../get_localname/) değeri ise iki nokta üstüste sonrasındaki bölümü yansıtır. Nitelikli ad **xmlns** önekini içeremez. |
| namespaceURI | const String\& | Öğenin ad alanı URI'si. |

### ReturnValue

Yeni [XmlElement](../../xmlelement/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
