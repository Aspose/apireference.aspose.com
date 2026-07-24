---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewValue μέθοδος"
linktitle: "get_NewValue"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewValue μέθοδος. Επιστρέφει τη νέα τιμή του κόμβου σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Επιστρέφει τη νέα τιμή του κόμβου.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

Η νέα τιμή του κόμβου. Αυτή η μέθοδος επιστρέφει **nullptr** εάν ο κόμβος δεν είναι ούτε χαρακτηριστικό ούτε κόμβος κειμένου, ή εάν ο κόμβος αφαιρείται. Εάν κληθεί σε ένα συμβάν **XmlDocument::NodeChanging**, το **get_NewValue** επιστρέφει την τιμή του κόμβου εάν η αλλαγή είναι επιτυχής. Εάν κληθεί σε ένα συμβάν **XmlDocument::NodeChanged**, το **get_NewValue** επιστρέφει την τρέχουσα τιμή του κόμβου.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
