---
title: "System::Xml::XmlReader::ReadElementContentAsObject μέθοδος"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadElementContentAsObject μέθοδος. Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως Object σε C++."
type: docs
weight: 6200
url: /el/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

Ένα αντικείμενο σε κουτί του πιο κατάλληλου τύπου. Η τιμή [XmlReader::get_ValueType](../get_valuetype/) καθορίζει τον κατάλληλο τύπο. Εάν το περιεχόμενο είναι τύπου λίστας, αυτή η μέθοδος επιστρέφει έναν πίνακα από αντικείμενα σε κουτί του κατάλληλου τύπου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του χώρου ονομάτων ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το τρέχον στοιχείο και επιστρέφει το περιεχόμενο ως [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα του στοιχείου. |
| namespaceURI | String | Το URI του χώρου ονομάτων του στοιχείου. |

### ReturnValue

Ένα αντικείμενο σε κουτί του πιο κατάλληλου τύπου. Η τιμή [XmlReader::get_ValueType](../get_valuetype/) καθορίζει τον κατάλληλο τύπο. Εάν το περιεχόμενο είναι τύπου λίστας, αυτή η μέθοδος επιστρέφει έναν πίνακα από αντικείμενα σε κουτί του κατάλληλου τύπου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
