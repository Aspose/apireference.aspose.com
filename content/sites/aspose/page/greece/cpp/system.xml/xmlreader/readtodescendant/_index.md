---
title: "System::Xml::XmlReader::ReadToDescendant μέθοδος"
linktitle: "ReadToDescendant"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadToDescendant μέθοδος. Προχωρά το XmlReader στο επόμενο απογόμενο στοιχείο με το καθορισμένο τοπικό όνομα και URI του χώρου ονομάτων σε C++."
type: docs
weight: 7100
url: /el/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Προχωρά το [XmlReader](../) στο επόμενο στοιχείο απογόνου με το καθορισμένο τοπικό όνομα και το URI ονοματοχώρου.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του στοιχείου στο οποίο θέλετε να μεταβείτε. |
| namespaceURI | String | Το URI ονοματοχώρου του στοιχείου στο οποίο θέλετε να μεταβείτε. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Προχωρά το [XmlReader](../) στο επόμενο στοιχείο απογόνου με το καθορισμένο πλήρες όνομα.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του στοιχείου στο οποίο θέλετε να μεταβείτε. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
