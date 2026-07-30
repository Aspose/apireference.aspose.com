---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewValue-Methode"
linktitle: "get_NewValue"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewValue-Methode. Gibt den neuen Wert des Knotens in C++ zurück."
type: docs
weight: 400
url: /de/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Gibt den neuen Wert des Knotens zurück.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

Der neue Wert des Knotens. Diese Methode gibt **nullptr** zurück, wenn der Knoten weder ein Attribut noch ein Textknoten ist oder wenn der Knoten entfernt wird. Wird sie in einem **XmlDocument::NodeChanging**-Ereignis aufgerufen, gibt **get_NewValue** den Wert des Knotens zurück, wenn die Änderung erfolgreich ist. Wird sie in einem **XmlDocument::NodeChanged**-Ereignis aufgerufen, gibt **get_NewValue** den aktuellen Wert des Knotens zurück.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
