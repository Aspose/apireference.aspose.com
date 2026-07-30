---
title: "System::Xml::XmlReader::ReadElementString méthode"
linktitle: "ReadElementString"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader::ReadElementString méthode. Lit un élément contenant uniquement du texte. Cependant, il est recommandé d'utiliser la méthode XmlReader::ReadElementContentAsString à la place, car elle offre une façon plus simple de gérer cette opération en C++."
type: docs
weight: 6400
url: /fr/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Lit un élément texte uniquement. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

Le texte contenu dans l'élément qui a été lu. Une chaîne vide si l'élément est vide.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Vérifie que les valeurs [XmlReader::get_LocalName](../get_localname/) et [XmlReader::get_NamespaceURI](../get_namespaceuri/) de l'élément trouvé correspondent aux chaînes fournies avant de lire un élément texte uniquement. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localname | String | Le nom local à vérifier. |
| ns | String | L'URI d'espace de noms à vérifier. |

### ReturnValue

Le texte contenu dans l'élément qui a été lu. Une chaîne vide si l'élément est vide.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String) method


Vérifie que la valeur [XmlReader::get_Name](../get_name/) de l'élément trouvé correspond à la chaîne fournie avant de lire un élément texte uniquement. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Le nom à vérifier. |

### ReturnValue

Le texte contenu dans l'élément qui a été lu. Une chaîne vide si l'élément est vide.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
