---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue metodo"
linktitle: "get_OldValue"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue metodo. Restituisce il valore originale del nodo in C++."
type: docs
weight: 700
url: /it/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Restituisce il valore originale del nodo.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

Il valore originale del nodo. Questo metodo restituisce **nullptr** se il nodo non è né un attributo né un nodo di testo, o se il nodo è in fase di inserimento. Se chiamato in un evento **XmlDocument::NodeChanging**, **get_OldValue** restituisce il valore corrente del nodo che verrà sostituito se la modifica ha successo. Se chiamato in un evento **XmlDocument::NodeChanged**, **get_OldValue** restituisce il valore del nodo prima della modifica.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
