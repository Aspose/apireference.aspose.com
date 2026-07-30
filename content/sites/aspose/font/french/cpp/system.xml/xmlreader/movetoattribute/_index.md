---
title: "System::Xml::XmlReader::MoveToAttribute méthode"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader::MoveToAttribute méthode. Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut avec l'index spécifié en C++."
type: docs
weight: 3200
url: /fr/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut à l'index spécifié.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | int32_t | L'index de l'attribut. |

## Voir aussi

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut avec la valeur [XmlReader::get_Name](../get_name/) spécifiée.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom qualifié de l'attribut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut avec les valeurs [XmlReader::get_LocalName](../get_localname/) et [XmlReader::get_NamespaceURI](../get_namespaceuri/) spécifiées.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom local de l'attribut. |
| ns | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
