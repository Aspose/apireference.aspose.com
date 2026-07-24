---
title: "System::Xml::XmlTextReader::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextReader::GetAttribute method. Επιστρέφει την τιμή της ιδιότητας με το καθορισμένο δείκτη σε C++."
type: docs
weight: 3300
url: /el/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο δείκτη.

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| i | int32_t | Ο δείκτης του χαρακτηριστικού. Ο δείκτης είναι μηδενική βάση. (Το πρώτο χαρακτηριστικό έχει δείκτη 0.) |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Η τιμή της καθορισμένης ιδιότητας. Εάν η ιδιότητα δεν βρεθεί, επιστρέφεται **nullptr**. Αυτή η μέθοδος δεν μετακινεί τον αναγνώστη.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::GetAttribute(String) method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο όνομα.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του χαρακτηριστικού. |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού. Εάν το χαρακτηριστικό δεν βρεθεί, επιστρέφεται **nullptr**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
