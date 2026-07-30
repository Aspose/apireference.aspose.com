---
title: "System::Xml::XmlReader::ReadToDescendant metodo"
linktitle: "ReadToDescendant"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::ReadToDescendant metodo. Avanza l'XmlReader al prossimo elemento discendente con il nome locale e l'URI dello spazio dei nomi specificati in C++."
type: docs
weight: 7100
url: /it/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Avanza il [XmlReader](../) al prossimo elemento discendente con il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'elemento a cui desideri spostarti. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'elemento a cui desideri spostarti. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Avanza il [XmlReader](../) al prossimo elemento discendente con il nome qualificato specificato.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'elemento a cui desideri spostarti. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
