---
title: "Metodo System::Xml::XmlReader::GetAttribute"
linktitle: "GetAttribute"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlReader::GetAttribute. Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con l'indice specificato in C++."
type: docs
weight: 2800
url: /it/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con l'indice specificato.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int32_t | L'indice dell'attributo. L'indice parte da zero. (Il primo attributo ha indice 0.) |

### ReturnValue

Il valore dell'attributo specificato. Questo metodo non sposta il lettore.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String) method


Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con il valore [XmlReader::get_Name](../get_name/) specificato.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato. Se l'attributo non viene trovato o il valore è [String::Empty](../../../system/string/empty/), viene restituito **nullptr**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Quando sovrascritto in una classe derivata, ottiene il valore dell'attributo con i valori [XmlReader::get_LocalName](../get_localname/) e [XmlReader::get_NamespaceURI](../get_namespaceuri/) specificati.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato. Se l'attributo non viene trovato o il valore è [String::Empty](../../../system/string/empty/), **nullptr** viene restituito. Questo metodo non sposta il lettore.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
