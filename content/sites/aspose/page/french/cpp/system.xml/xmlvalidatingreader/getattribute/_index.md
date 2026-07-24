---
title: "System::Xml::XmlValidatingReader::GetAttribute méthode"
linktitle: "GetAttribute"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlValidatingReader::GetAttribute méthode. Retourne la valeur de l'attribut avec l'index spécifié en C++."
type: docs
weight: 3200
url: /fr/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


Renvoie la valeur de l'attribut à l'index spécifié.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| i | int32_t | L'index de l'attribut. L'index commence à zéro. (Le premier attribut a l'index 0.) |

### ReturnValue

La valeur de l'attribut spécifié.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


Renvoie la valeur de l'attribut avec le nom local et l'Uniform Resource Identifier (URI) d'espace de noms spécifiés.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localName | String | Le nom local de l'attribut. |
| namespaceURI | String | L'URI d'espace de noms de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé, **nullptr** est renvoyé. Cette méthode ne déplace pas le lecteur.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


Renvoie la valeur de l'attribut portant le nom spécifié.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | String | Le nom qualifié de l'attribut. |

### ReturnValue

La valeur de l'attribut spécifié. Si l'attribut n'est pas trouvé, **nullptr** est retourné.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
