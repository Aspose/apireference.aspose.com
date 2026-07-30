---
title: "Méthode System::Xml::XmlReader::IsStartElement"
linktitle: "IsStartElement"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::IsStartElement. Appelle XmlReader::MoveToContent et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide en C++."
type: docs
weight: 3000
url: /fr/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


Appelle [XmlReader::MoveToContent](../movetocontent/) et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Voir aussi

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String, String) method


Appelle [XmlReader::MoveToContent](../movetocontent/) et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide et si les valeurs [XmlReader::get_LocalName](../get_localname/) et [XmlReader::get_NamespaceURI](../get_namespaceuri/) de l'élément trouvé correspondent aux chaînes fournies.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| localname | String | La chaîne à comparer avec la valeur **LocalName** de l'élément trouvé. |
| ns | String | La chaîne à comparer avec la valeur **NamespaceURI** de l'élément trouvé. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String) method


Appelle [XmlReader::MoveToContent](../movetocontent/) et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide et si la valeur [XmlReader::get_Name](../get_name/) de l'élément trouvé correspond à l'argument fourni.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | La chaîne correspond à la valeur **Name** de l'élément trouvé. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
