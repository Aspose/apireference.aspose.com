---
title: "System::Xml::XmlReader::ReadToNextSibling μέθοδος"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadToNextSibling μέθοδος. Προωθεί το XmlReader στο επόμενο αδερφικό στοιχείο με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου σε C++."
type: docs
weight: 7300
url: /el/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


Προωθεί το [XmlReader](../) στο επόμενο αδερφικό στοιχείο με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του αδερφικού στοιχείου στο οποίο θέλετε να μετακινηθείτε. |
| namespaceURI | String | Το URI του ονοματοχώρου του αδερφικού στοιχείου στο οποίο θέλετε να μετακινηθείτε. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


Προωθεί το [XmlReader](../) στο επόμενο αδερφικό στοιχείο με το καθορισμένο πλήρες όνομα.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του αδερφικού στοιχείου στο οποίο θέλετε να μετακινηθείτε. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
