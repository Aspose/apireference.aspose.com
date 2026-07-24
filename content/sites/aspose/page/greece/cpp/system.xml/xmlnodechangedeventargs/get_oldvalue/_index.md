---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue μέθοδος"
linktitle: "get_OldValue"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue μέθοδος. Επιστρέφει την αρχική τιμή του κόμβου σε C++."
type: docs
weight: 700
url: /el/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Επιστρέφει την αρχική τιμή του κόμβου.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

Η αρχική τιμή του κόμβου. Αυτή η μέθοδος επιστρέφει **nullptr** εάν ο κόμβος δεν είναι ούτε χαρακτηριστικό ούτε κόμβος κειμένου, ή εάν ο κόμβος εισάγεται. Εάν κληθεί σε ένα συμβάν **XmlDocument::NodeChanging**, το **get_OldValue** επιστρέφει την τρέχουσα τιμή του κόμβου που θα αντικατασταθεί εάν η αλλαγή είναι επιτυχής. Εάν κληθεί σε ένα συμβάν **XmlDocument::NodeChanged**, το **get_OldValue** επιστρέφει την τιμή του κόμβου πριν από την αλλαγή.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
