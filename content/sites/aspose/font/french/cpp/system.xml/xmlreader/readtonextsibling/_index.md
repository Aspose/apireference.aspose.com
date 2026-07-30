---
title: "Méthode System::Xml::XmlReader::ReadToNextSibling"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::ReadToNextSibling. Avance le XmlReader vers l'élément frère suivant avec le nom local et l'URI d'espace de noms spécifiés en C++."
type: docs
weight: 7300
url: /fr/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


Avance le [XmlReader](../) vers l'élément frère suivant avec le nom local et l'URI d'espace de noms spécifiés.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'élément frère vers lequel vous souhaitez vous déplacer. |
| namespaceURI | String | L'URI d'espace de noms de l'élément frère vers lequel vous souhaitez vous déplacer. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


Avance le [XmlReader](../) vers l'élément frère suivant avec le nom qualifié spécifié.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom qualifié de l'élément frère vers lequel vous souhaitez vous déplacer. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
