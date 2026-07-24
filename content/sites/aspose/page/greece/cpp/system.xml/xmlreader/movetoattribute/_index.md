---
title: "System::Xml::XmlReader::MoveToAttribute method"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::MoveToAttribute method. Όταν αντικαθίσταται σε κληρονομημένη κλάση, μετακινείται στο χαρακτηριστικό με το καθορισμένο δείκτη σε C++."
type: docs
weight: 3200
url: /el/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, μετακινείται στο χαρακτηριστικό με το καθορισμένο ευρετήριο.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| i | int32_t | Ο δείκτης του χαρακτηριστικού. |

## Δείτε επίσης

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Όταν αντικαθίσταται σε κληρονομημένη κλάση, μετακινείται στο χαρακτηριστικό με την καθορισμένη τιμή [XmlReader::get_Name](../get_name/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του χαρακτηριστικού. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Όταν αντικαθίσταται σε κληρονομημένη κλάση, μετακινείται στο χαρακτηριστικό με τις καθορισμένες τιμές [XmlReader::get_LocalName](../get_localname/) και [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το τοπικό όνομα του χαρακτηριστικού. |
| ns | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
