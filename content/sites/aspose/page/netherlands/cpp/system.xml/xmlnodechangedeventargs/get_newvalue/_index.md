---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewValue methode"
linktitle: "get_NewValue"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewValue methode. Retourneert de nieuwe waarde van het knooppunt in C++."
type: docs
weight: 400
url: /nl/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Retourneert de nieuwe waarde van het knooppunt.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

De nieuwe waarde van het knooppunt. Deze methode retourneert **nullptr** als het knooppunt noch een attribuut noch een tekstknooppunt is, of als het knooppunt wordt verwijderd. Als deze wordt aangeroepen in een **XmlDocument::NodeChanging**‑evenement, retourneert **get_NewValue** de waarde van het knooppunt als de wijziging succesvol is. Als deze wordt aangeroepen in een **XmlDocument::NodeChanged**‑evenement, retourneert **get_NewValue** de huidige waarde van het knooppunt.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
