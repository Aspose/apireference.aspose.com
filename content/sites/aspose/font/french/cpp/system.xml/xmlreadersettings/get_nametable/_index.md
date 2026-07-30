---
title: "System::Xml::XmlReaderSettings::obtenir_NameTable méthode"
linktitle: "get_NameTable"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReaderSettings::get_NameTable method. Retourne le XmlNameTable utilisé pour les comparaisons de chaînes atomisées en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


Retourne le [XmlNameTable](../../xmlnametable/) utilisé pour les comparaisons de chaînes atomisées.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

Le [XmlNameTable](../../xmlnametable/) qui stocke toutes les chaînes atomisées utilisées par toutes les instances de [XmlReader](../../xmlreader/) créées avec cet objet [XmlReaderSettings](../). La valeur par défaut est **nullptr**. L'instance de [XmlReader](../../xmlreader/) créée utilisera un nouveau [NameTable](../../nametable/) vide si cette valeur est **nullptr**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
