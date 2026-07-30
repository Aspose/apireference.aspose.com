---
title: "System::Xml::XmlTextReader::MoveToAttribute metodo"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlTextReader::MoveToAttribute metodo. Si sposta all'attributo con l'indice specificato in C++."
type: docs
weight: 3800
url: /it/cpp/system.xml/xmltextreader/movetoattribute/
---
## XmlTextReader::MoveToAttribute(int32_t) method


Si sposta sull'attributo con l'indice specificato.

```cpp
void System::Xml::XmlTextReader::MoveToAttribute(int32_t i) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int32_t | L'indice dell'attributo. |

## Vedi anche

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::MoveToAttribute(String, String) method


Si sposta sull'attributo con il nome locale e l'URI dello spazio dei nomi specificati.

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String localName, String namespaceURI) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::MoveToAttribute(String) method


Si sposta sull'attributo con il nome specificato.

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String name) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'attributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
