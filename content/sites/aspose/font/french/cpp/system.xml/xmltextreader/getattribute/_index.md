---
title: "Méthode System::Xml::XmlTextReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlTextReader::GetAttribute. Retourne la valeur de l'attribut à l'index spécifié en C++."
type: docs
weight: 3300
url: /fr/cpp/system.xml/xmltextreader/getattribute/
---
## XmlTextReader::GetAttribute(int32_t) method


Renvoie la valeur de l'attribut avec l'index spécifié.

```cpp
String System::Xml::XmlTextReader::GetAttribute(int32_t i) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | int32_t | L'index de l'attribut. L'index commence à zéro. (Le premier attribut a l'index 0.) |

### ReturnValue

La valeur de l'attribut spécifié.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::GetAttribute(String, String) method


Renvoie la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String localName, String namespaceURI) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé, **nullptr** est retourné. Cette méthode ne déplace pas le lecteur.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::GetAttribute(String) method


Renvoie la valeur de l'attribut avec le nom spécifié.

```cpp
String System::Xml::XmlTextReader::GetAttribute(String name) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom qualifié de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé, **nullptr** est renvoyé.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
