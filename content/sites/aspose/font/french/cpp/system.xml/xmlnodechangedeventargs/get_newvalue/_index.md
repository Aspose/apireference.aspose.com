---
title: "Méthode System::Xml::XmlNodeChangedEventArgs::get_NewValue"
linktitle: "get_NewValue"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNodeChangedEventArgs::get_NewValue. Retourne la nouvelle valeur du nœud en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


Renvoie la nouvelle valeur du nœud.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

La nouvelle valeur du nœud. Cette méthode renvoie **nullptr** si le nœud n'est ni un attribut ni un nœud texte, ou si le nœud est en cours de suppression. Si elle est appelée lors d'un événement **XmlDocument::NodeChanging**, **get_NewValue** renvoie la valeur du nœud si la modification réussit. Si elle est appelée lors d'un événement **XmlDocument::NodeChanged**, **get_NewValue** renvoie la valeur actuelle du nœud.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
