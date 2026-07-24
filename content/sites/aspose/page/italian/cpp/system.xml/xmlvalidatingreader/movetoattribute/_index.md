---
title: "System::Xml::XmlValidatingReader::MoveToAttribute metodo"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlValidatingReader::MoveToAttribute metodo. Si sposta all'attributo con l'indice specificato in C++."
type: docs
weight: 3500
url: /it/cpp/system.xml/xmlvalidatingreader/movetoattribute/
---
## XmlValidatingReader::MoveToAttribute(int32_t) method


Si sposta sull'attributo con l'indice specificato.

```cpp
void System::Xml::XmlValidatingReader::MoveToAttribute(int32_t i) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int32_t | L'indice dell'attributo. |

## Vedi anche

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String, String) method


Si sposta all'attributo con il nome locale e lo spazio dei nomi Uniform Resource Identifier (URI) specificati.

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String localName, String namespaceURI) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | String | Il nome locale dell'attributo. |
| namespaceURI | String | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String) method


Si sposta sull'attributo con il nome specificato.

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String name) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | String | Il nome qualificato dell'attributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
