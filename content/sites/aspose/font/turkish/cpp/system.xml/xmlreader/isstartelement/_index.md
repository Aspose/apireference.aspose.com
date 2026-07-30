---
title: "System::Xml::XmlReader::IsStartElement yöntemi"
linktitle: "IsStartElement"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::IsStartElement yöntemi. XmlReader::MoveToContent'i çağırır ve geçerli içerik düğümünün C++'ta bir başlangıç etiketi ya da boş öğe etiketi olup olmadığını test eder."
type: docs
weight: 3000
url: /tr/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


[XmlReader::MoveToContent](../movetocontent/) metodunu çağırır ve geçerli içerik düğümünün bir başlangıç etiketi ya da boş öğe etiketi olup olmadığını test eder.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Ayrıca Bakınız

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String, String) method


[XmlReader::MoveToContent](../movetocontent/) metodunu çağırır ve geçerli içerik düğümünün bir başlangıç etiketi ya da boş öğe etiketi olup olmadığını ve bulunan öğenin [XmlReader::get_LocalName](../get_localname/) ve [XmlReader::get_NamespaceURI](../get_namespaceuri/) değerlerinin verilen dizelerle eşleşip eşleşmediğini test eder.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yerelAd | Dize | Bulunan öğenin **LocalName** değerine karşı eşleşecek dize. |
| ns | Dize | Bulunan öğenin **NamespaceURI** değerine karşı eşleşecek dize. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String) method


[XmlReader::MoveToContent](../movetocontent/) metodunu çağırır ve geçerli içerik düğümünün bir başlangıç etiketi ya da boş öğe etiketi olup olmadığını ve bulunan öğenin [XmlReader::get_Name](../get_name/) değerinin verilen argümanla eşleşip eşleşmediğini test eder.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Bulunan öğenin **Name** değerine karşı eşleşen dize. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
