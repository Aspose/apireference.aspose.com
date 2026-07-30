---
title: "Méthode System::Xml::XmlReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::GetAttribute. Lorsqu'elle est remplacée dans une classe dérivée, elle récupère la valeur de l'attribut avec l'index spécifié en C++."
type: docs
weight: 2800
url: /fr/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec l'index spécifié.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | int32_t | L'index de l'attribut. L'index commence à zéro. (Le premier attribut a l'index 0.) |

### ReturnValue

La valeur de l'attribut spécifié. Cette méthode ne déplace pas le lecteur.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String) method


Lorsqu'elle est remplacée dans une classe dérivée, elle récupère la valeur de l'attribut avec la valeur [XmlReader::get_Name](../get_name/) spécifiée.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom qualifié de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé ou que la valeur est [String::Empty](../../../system/string/empty/), **nullptr** est retourné.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Lorsqu'elle est remplacée dans une classe dérivée, elle récupère la valeur de l'attribut avec les valeurs [XmlReader::get_LocalName](../get_localname/) et [XmlReader::get_NamespaceURI](../get_namespaceuri/) spécifiées.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé ou que la valeur est [String::Empty](../../../system/string/empty/), **nullptr** est retourné. Cette méthode ne déplace pas le lecteur.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
