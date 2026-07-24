---
title: "System::Xml::XmlValidatingReader::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlValidatingReader::GetAttribute method. Επιστρέφει την τιμή του χαρακτηριστικού με τον καθορισμένο δείκτη σε C++."
type: docs
weight: 3200
url: /el/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο δείκτη.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| i | int32_t | Ο δείκτης του χαρακτηριστικού. Ο δείκτης είναι μηδενική βάση. (Το πρώτο χαρακτηριστικό έχει δείκτη 0.) |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το Uniform Resource Identifier (URI) του χώρου ονομάτων.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | String | Το URI του χώρου ονομάτων του χαρακτηριστικού. |

### ReturnValue

Η τιμή της καθορισμένης ιδιότητας. Εάν η ιδιότητα δεν βρεθεί, επιστρέφεται **nullptr**. Αυτή η μέθοδος δεν μετακινεί τον αναγνώστη.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο όνομα.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα του χαρακτηριστικού. |

### ReturnValue

Η τιμή του καθορισμένου χαρακτηριστικού. Εάν το χαρακτηριστικό δεν βρεθεί, επιστρέφεται **nullptr**.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
