---
title: "System::Xml::XmlReader::ReadToDescendant méthode"
linktitle: "ReadToDescendant"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader::ReadToDescendant méthode. Avance le XmlReader vers l'élément descendant suivant avec le nom local et l'URI d'espace de noms spécifiés en C++."
type: docs
weight: 7100
url: /fr/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Avance le [XmlReader](../) vers l'élément descendant suivant avec le nom local et l'URI d'espace de noms spécifiés.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'élément vers lequel vous souhaitez vous déplacer. |
| namespaceURI | String | L'URI d'espace de noms de l'élément vers lequel vous souhaitez vous déplacer. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Avance le [XmlReader](../) vers l'élément descendant suivant avec le nom qualifié spécifié.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom qualifié de l'élément vers lequel vous souhaitez vous déplacer. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
