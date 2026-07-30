---
title: "Méthode System::Xml::XmlNodeChangedEventArgs::get_OldValue"
linktitle: "get_OldValue"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNodeChangedEventArgs::get_OldValue. Retourne la valeur originale du nœud en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


Renvoie la valeur originale du nœud.

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

La valeur originale du nœud. Cette méthode renvoie **nullptr** si le nœud n'est ni un attribut ni un nœud texte, ou si le nœud est en cours d'insertion. Si elle est appelée lors d'un événement **XmlDocument::NodeChanging**, **get_OldValue** renvoie la valeur actuelle du nœud qui sera remplacée si la modification réussit. Si elle est appelée lors d'un événement **XmlDocument::NodeChanged**, **get_OldValue** renvoie la valeur du nœud avant la modification.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
