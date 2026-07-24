---
title: "Méthode System::Xml::XmlNodeReader::MoveToAttribute"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNodeReader::MoveToAttribute. Se déplace vers l'attribut avec l'index spécifié en C++."
type: docs
weight: 2600
url: /fr/cpp/system.xml/xmlnodereader/movetoattribute/
---
## XmlNodeReader::MoveToAttribute(int32_t) method


Se déplace vers l'attribut à l'index spécifié.

```cpp
void System::Xml::XmlNodeReader::MoveToAttribute(int32_t attributeIndex) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| attributeIndex | int32_t | L'index de l'attribut. |

## Voir aussi

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::MoveToAttribute(String) method


Se déplace vers l'attribut portant le nom spécifié.

```cpp
bool System::Xml::XmlNodeReader::MoveToAttribute(String name) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom qualifié de l'attribut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::MoveToAttribute(String, String) method


Se déplace vers l'attribut portant le nom local et l'URI d'espace de noms spécifiés.

```cpp
bool System::Xml::XmlNodeReader::MoveToAttribute(String name, String namespaceURI) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
