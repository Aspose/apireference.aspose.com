---
title: "System::Xml::XmlReader::idx_get méthode"
linktitle: "idx_get"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader::idx_get méthode. Lorsqu'elle est substituée dans une classe dérivée, obtient la valeur de l'attribut à l'index spécifié en C++."
type: docs
weight: 2900
url: /fr/cpp/system.xml/xmlreader/idx_get/
---
## XmlReader::idx_get(int32_t) method


Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec l'index spécifié.

```cpp
virtual String System::Xml::XmlReader::idx_get(int32_t i)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | int32_t | L'index de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::idx_get(String) method


Lorsqu'elle est remplacée dans une classe dérivée, elle récupère la valeur de l'attribut avec la valeur [XmlReader::get_Name](../get_name/) spécifiée.

```cpp
virtual String System::Xml::XmlReader::idx_get(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom qualifié de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé, **nullptr** est renvoyé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::idx_get(String, String) method


Lorsqu'elle est remplacée dans une classe dérivée, elle récupère la valeur de l'attribut avec les valeurs [XmlReader::get_LocalName](../get_localname/) et [XmlReader::get_NamespaceURI](../get_namespaceuri/) spécifiées.

```cpp
virtual String System::Xml::XmlReader::idx_get(String name, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé, **nullptr** est renvoyé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
