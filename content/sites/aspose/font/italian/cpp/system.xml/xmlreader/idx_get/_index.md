---
title: "System::Xml::XmlReader::idx_get metodo"
linktitle: "idx_get"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReader::idx_get metodo. Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con l'indice specificato in C++."
type: docs
weight: 2900
url: /it/cpp/system.xml/xmlreader/idx_get/
---
## XmlReader::idx_get(int32_t) method


Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con l'indice specificato.

```cpp
virtual String System::Xml::XmlReader::idx_get(int32_t i)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int32_t | L'indice dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::idx_get(String) method


Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con il valore [XmlReader::get_Name](../get_name/) specificato.

```cpp
virtual String System::Xml::XmlReader::idx_get(String name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato. Se l'attributo non viene trovato, viene restituito **nullptr**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::idx_get(String, String) method


Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con i valori [XmlReader::get_LocalName](../get_localname/) e [XmlReader::get_NamespaceURI](../get_namespaceuri/) specificati.

```cpp
virtual String System::Xml::XmlReader::idx_get(String name, String namespaceURI)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato. Se l'attributo non viene trovato, viene restituito **nullptr**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
