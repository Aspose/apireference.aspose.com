---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue-Methode"
linktitle: "get_OldValue"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue-Methode. Gibt den ursprünglichen Wert des Knotens in C++ zurück."
type: docs
weight: 700
url: /de/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Gibt den ursprünglichen Wert des Knotens zurück.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

Der ursprüngliche Wert des Knotens. Diese Methode gibt **nullptr** zurück, wenn der Knoten weder ein Attribut noch ein Textknoten ist oder wenn der Knoten eingefügt wird. Wird sie in einem **XmlDocument::NodeChanging**-Ereignis aufgerufen, gibt **get_OldValue** den aktuellen Wert des Knotens zurück, der ersetzt wird, wenn die Änderung erfolgreich ist. Wird sie in einem **XmlDocument::NodeChanged**-Ereignis aufgerufen, gibt **get_OldValue** den Wert des Knotens vor der Änderung zurück.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
