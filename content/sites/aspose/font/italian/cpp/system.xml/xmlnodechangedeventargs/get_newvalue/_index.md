---
title: "metodo System::Xml::XmlNodeChangedEventArgs::get_NewValue"
linktitle: "get_NewValue"
second_title: "Aspose.Font per C++"
description: "metodo System::Xml::XmlNodeChangedEventArgs::get_NewValue. Restituisce il nuovo valore del nodo in C++."
type: docs
weight: 400
url: /it/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Restituisce il nuovo valore del nodo.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

Il nuovo valore del nodo. Questo metodo restituisce **nullptr** se il nodo non è né un attributo né un nodo di testo, o se il nodo sta per essere rimosso. Se chiamato in un evento **XmlDocument::NodeChanging**, **get_NewValue** restituisce il valore del nodo se la modifica ha successo. Se chiamato in un evento **XmlDocument::NodeChanged**, **get_NewValue** restituisce il valore corrente del nodo.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
