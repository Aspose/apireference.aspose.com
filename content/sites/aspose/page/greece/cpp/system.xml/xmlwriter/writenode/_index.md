---
title: "System::Xml::XmlWriter::WriteNode μέθοδος"
linktitle: "WriteNode"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlWriter::WriteNode μέθοδος. Όταν παρακαμφθεί σε μια παράγωγη κλάση, αντιγράφει όλα από τον αναγνώστη στον writer και μετακινεί τον αναγνώστη στην αρχή του επόμενου αδερφού σε C++."
type: docs
weight: 2600
url: /el/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, αντιγράφει όλα από τον αναγνώστη στον συγγραφέα και μετακινεί τον αναγνώστη στην αρχή του επόμενου αδερφού.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Ο [XmlReader](../../xmlreader/) για ανάγνωση. |
| defattr | bool | **true** για να αντιγράψετε τα προεπιλεγμένα χαρακτηριστικά από το [XmlReader](../../xmlreader/); διαφορετικά, **false**. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Αντιγράφει όλα από το αντικείμενο XPathNavigator στον συγγραφέα. Η θέση του XPathNavigator παραμένει αμετάβλητη.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| navigator | SharedPtr\<XPath::XPathNavigator\> | Ο XPathNavigator για αντιγραφή. |
| defattr | bool | **true** για αντιγραφή των προεπιλεγμένων χαρακτηριστικών· διαφορετικά, **false**. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
