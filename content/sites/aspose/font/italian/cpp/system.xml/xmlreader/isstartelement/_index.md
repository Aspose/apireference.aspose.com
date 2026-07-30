---
title: "Metodo System::Xml::XmlReader::IsStartElement"
linktitle: "IsStartElement"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlReader::IsStartElement. Chiama XmlReader::MoveToContent e verifica se il nodo di contenuto corrente è un tag di inizio o un tag di elemento vuoto in C++."
type: docs
weight: 3000
url: /it/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


Chiama [XmlReader::MoveToContent](../movetocontent/) e verifica se il nodo di contenuto corrente è un tag di inizio o un tag di elemento vuoto.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Vedi anche

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String, String) method


Chiama [XmlReader::MoveToContent](../movetocontent/) e verifica se il nodo di contenuto corrente è un tag di inizio o un tag di elemento vuoto e se i valori [XmlReader::get_LocalName](../get_localname/) e [XmlReader::get_NamespaceURI](../get_namespaceuri/) dell'elemento trovato corrispondono alle stringhe fornite.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localname | Stringa | La stringa da confrontare con il valore **LocalName** dell'elemento trovato. |
| ns | Stringa | La stringa da confrontare con il valore **NamespaceURI** dell'elemento trovato. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String) method


Chiama [XmlReader::MoveToContent](../movetocontent/) e verifica se il nodo di contenuto corrente è un tag di inizio o un tag di elemento vuoto e se il valore [XmlReader::get_Name](../get_name/) dell'elemento trovato corrisponde all'argomento fornito.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | La stringa corrisponde al valore **Name** dell'elemento trovato. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
