---
title: "System::Xml::XmlReader::IsStartElement विधि"
linktitle: "IsStartElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::IsStartElement विधि। XmlReader::MoveToContent को कॉल करता है और जाँचता है कि वर्तमान कंटेंट नोड C++ में एक प्रारंभ टैग या खाली तत्व टैग है या नहीं।"
type: docs
weight: 3000
url: /hi/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


[XmlReader::MoveToContent](../movetocontent/) को कॉल करता है और जाँचता है कि वर्तमान कंटेंट नोड एक प्रारंभ टैग या खाली तत्व टैग है या नहीं।

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## संबंधित देखें

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


[XmlReader::MoveToContent](../movetocontent/) को कॉल करता है और जाँचता है कि वर्तमान कंटेंट नोड एक प्रारंभ टैग या खाली तत्व टैग है और क्या पाए गए तत्व के [XmlReader::get_LocalName](../get_localname/) और [XmlReader::get_NamespaceURI](../get_namespaceuri/) मान दिए गए स्ट्रिंग्स से मेल खाते हैं।

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्थानीयनाम | String | पाए गए तत्व के **LocalName** मान के विरुद्ध मिलाने के लिए स्ट्रिंग। |
| ns | String | पाए गए तत्व के **NamespaceURI** मान के विरुद्ध मिलाने के लिए स्ट्रिंग। |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


[XmlReader::MoveToContent](../movetocontent/) को कॉल करता है और जाँचता है कि वर्तमान कंटेंट नोड एक प्रारंभ टैग या खाली तत्व टैग है और क्या पाए गए तत्व के [XmlReader::get_Name](../get_name/) मान दिए गए तर्क से मेल खाता है।

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | पाए गए तत्व के **Name** मान के विरुद्ध मिलाने के लिए स्ट्रिंग। |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
