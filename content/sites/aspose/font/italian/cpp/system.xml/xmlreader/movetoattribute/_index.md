---
title: "System::Xml::XmlReader::MoveToAttribute metodo"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::MoveToAttribute metodo. Quando sovrascritto in una classe derivata, si sposta all'attributo con l'indice specificato in C++."
type: docs
weight: 3200
url: /it/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Quando sovrascritto in una classe derivata, si sposta sull'attributo con l'indice specificato.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int32_t | L'indice dell'attributo. |

## Vedi anche

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Quando sovrascritto in una classe derivata, si sposta all'attributo con il valore [XmlReader::get_Name](../get_name/) specificato.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'attributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Quando sovrascritto in una classe derivata, si sposta all'attributo con i valori [XmlReader::get_LocalName](../get_localname/) e [XmlReader::get_NamespaceURI](../get_namespaceuri/) specificati.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome locale dell'attributo. |
| ns | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
