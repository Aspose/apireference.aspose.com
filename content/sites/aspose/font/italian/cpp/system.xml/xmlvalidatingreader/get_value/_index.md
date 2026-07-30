---
title: "System::Xml::XmlValidatingReader::get_Value metodo"
linktitle: "get_Value"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlValidatingReader::get_Value metodo. Restituisce il valore di testo del nodo corrente in C++."
type: docs
weight: 2900
url: /it/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


Restituisce il valore di testo del nodo corrente.

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

Il valore restituito dipende dal XmlValidatingReader::NodeType del nodo.
## Osservazioni



La tabella seguente elenca i tipi di nodo che hanno un valore da restituire. Tutti gli altri tipi di nodo restituiscono [String::Empty](../../../system/string/empty/). |||
|-|-|
| Tipo di nodo | Valore |
| Attribute | Il valore dell'attributo. |
| CDATA | Il contenuto della sezione CDATA. |
| Comment | Il contenuto del commento. |
| DocumentType | Il sottoinsieme interno. |
| ProcessingInstruction | L'intero contenuto, escluso il target. |
| SignificantWhitespace | Lo spazio bianco tra i markup in un modello di contenuto misto. |
| Text | Il contenuto del nodo di testo. |
| Whitespace | Lo spazio bianco tra i markup. |
| XmlDeclaration | Il contenuto della dichiarazione. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
