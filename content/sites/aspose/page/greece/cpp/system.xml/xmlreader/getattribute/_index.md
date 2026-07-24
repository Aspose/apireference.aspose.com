---
title: "System::Xml::XmlReader::GetAttribute μέθοδος"
linktitle: "GetAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::GetAttribute μέθοδος. Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει την τιμή του χαρακτηριστικού με τον καθορισμένο δείκτη σε C++."
type: docs
weight: 2800
url: /el/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο ευρετήριο.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| i | int32_t | Ο δείκτης του χαρακτηριστικού. Ο δείκτης είναι μηδενική βάση. (Το πρώτο χαρακτηριστικό έχει δείκτη 0.) |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού. Αυτή η μέθοδος δεν μετακινεί τον αναγνώστη.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει την τιμή του χαρακτηριστικού με την καθορισμένη τιμή [XmlReader::get_Name](../get_name/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του χαρακτηριστικού. |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού. Εάν το χαρακτηριστικό δεν βρεθεί ή η τιμή είναι [String::Empty](../../../system/string/empty/), επιστρέφεται **nullptr**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, λαμβάνει την τιμή του χαρακτηριστικού με τις καθορισμένες τιμές [XmlReader::get_LocalName](../get_localname/) και [XmlReader::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού. Εάν το χαρακτηριστικό δεν βρεθεί ή η τιμή είναι [String::Empty](../../../system/string/empty/), επιστρέφεται **nullptr**. Αυτή η μέθοδος δεν μετακινεί τον αναγνώστη.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
