---
title: "System::Xml::XmlValidatingReader::GetAttribute metodo"
linktitle: "GetAttribute"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlValidatingReader::GetAttribute metodo. Restituisce il valore dell'attributo con l'indice specificato in C++."
type: docs
weight: 3200
url: /it/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


Restituisce il valore dell'attributo con l'indice specificato.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int32_t | L'indice dell'attributo. L'indice parte da zero. (Il primo attributo ha indice 0.) |

### ReturnValue

Il valore dell'attributo specificato.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


Restituisce il valore dell'attributo con il nome locale e l'Uniform Resource Identifier (URI) dello spazio dei nomi specificati.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| localName | Stringa | Il nome locale dell'attributo. |
| namespaceURI | Stringa | L'URI dello spazio dei nomi dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato. Se l'attributo non viene trovato, viene restituito **nullptr**. Questo metodo non sposta il lettore.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


Restituisce il valore dell'attributo con il nome specificato.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome qualificato dell'attributo. |

### ReturnValue

Il valore dell'attributo specificato. Se l'attributo non viene trovato, viene restituito **nullptr**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
