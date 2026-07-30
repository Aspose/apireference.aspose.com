---
title: "Méthode System::Xml::XmlReader::ReadElementContentAsObject"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::ReadElementContentAsObject. Lit l'élément actuel et renvoie le contenu sous forme d'un Object en C++."
type: docs
weight: 6200
url: /fr/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Lit l'élément actuel et renvoie le contenu sous forme d'un [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

Un objet emballé du type le plus approprié. La valeur [XmlReader::get_ValueType](../get_valuetype/) détermine le type approprié. Si le contenu est typé comme une liste, cette méthode renvoie un tableau d'objets emballés du type approprié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'un [Object](../../../system/object/).

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l’élément. |
| namespaceURI | String | L'URI d'espace de noms de l'élément. |

### ReturnValue

Un objet emballé du type le plus approprié. La valeur [XmlReader::get_ValueType](../get_valuetype/) détermine le type approprié. Si le contenu est typé comme une liste, cette méthode renvoie un tableau d'objets emballés du type approprié.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
