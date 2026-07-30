---
title: "System::Xml::XmlElement::GetAttributeNode yöntemi"
linktitle: "GetAttributeNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlElement::GetAttributeNode yöntemi. C++'da belirtilen yerel ad ve ad alanı URI'sine sahip XmlAttribute'ı döndürür."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Belirtilen yerel ad ve ad alanı URI'sine sahip [XmlAttribute](../../xmlattribute/) döndürür.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Özelliğin yerel adı. |
| namespaceURI | Dize | Özelliğin ad alanı URI'si. |

### ReturnValue

Belirtilen [XmlAttribute](../../xmlattribute/) veya eşleşen bir öznitelik bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Belirtilen ada sahip [XmlAttribute](../../xmlattribute/) döndürür.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Alınacak özniteliğin adı. Bu nitelikli bir addır. Eşleşen düğümün **get_Name** değeriyle karşılaştırılır. |

### ReturnValue

Belirtilen [XmlAttribute](../../xmlattribute/) veya eşleşen bir öznitelik bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
