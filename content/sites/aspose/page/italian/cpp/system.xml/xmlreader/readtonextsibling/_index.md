---
title: "Metodo System::Xml::XmlReader::ReadToNextSibling"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlReader::ReadToNextSibling. Avanza l'XmlReader all'elemento fratello successivo con il nome locale e l'URI dello spazio dei nomi specificati in C++."
type: docs
weight: 7300
url: /it/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


Avanza il [XmlReader](../) all'elemento fratello successivo con il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | String | Il nome locale dell'elemento fratello a cui desideri spostarti. |
| namespaceURI | String | L'URI dello spazio dei nomi dell'elemento fratello a cui desideri spostarti. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


Avanza il [XmlReader](../) all'elemento fratello successivo con il nome qualificato specificato.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome qualificato dell'elemento fratello a cui desideri spostarti. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
