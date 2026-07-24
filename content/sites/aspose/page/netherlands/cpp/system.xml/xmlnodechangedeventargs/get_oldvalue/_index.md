---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue methode"
linktitle: "get_OldValue"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue methode. Retourneert de oorspronkelijke waarde van het knooppunt in C++."
type: docs
weight: 700
url: /nl/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Retourneert de oorspronkelijke waarde van het knooppunt.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

De oorspronkelijke waarde van het knooppunt. Deze methode retourneert **nullptr** als het knooppunt noch een attribuut noch een tekstknooppunt is, of als het knooppunt wordt ingevoegd. Als deze wordt aangeroepen in een **XmlDocument::NodeChanging**‑evenement, retourneert **get_OldValue** de huidige waarde van het knooppunt die zal worden vervangen als de wijziging succesvol is. Als deze wordt aangeroepen in een **XmlDocument::NodeChanged**‑evenement, retourneert **get_OldValue** de waarde van het knooppunt vóór de wijziging.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
