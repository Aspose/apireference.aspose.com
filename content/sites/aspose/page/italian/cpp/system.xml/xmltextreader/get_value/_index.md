---
title: "System::Xml::XmlTextReader::get_Value method"
linktitle: "get_Value"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlTextReader::get_Value method. Restituisce il valore di testo del nodo corrente in C++."
type: docs
weight: 2900
url: /it/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


Restituisce il valore di testo del nodo corrente.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

Il valore restituito dipende dal valore [XmlTextReader::get_NodeType](../get_nodetype/) del nodo.
## Osservazioni



La tabella seguente elenca i tipi di nodo che hanno un valore da restituire. Tutti gli altri tipi di nodo restituiscono [String::Empty](../../../system/string/empty/). |||
|-|-|
| Tipo di nodo | Valore |
| Attributo | Il valore dell'attributo. |
| CDATA | Il contenuto della sezione CDATA. |
| Comment | Il contenuto del commento. |
| DocumentType | Il sottoinsieme interno. |
| ProcessingInstruction | L'intero contenuto, escluso il target. |
| SignificantWhitespace | Lo spazio bianco all'interno di un ambito xml:space='preserve'. |
| Text | Il contenuto del nodo di testo. |
| Whitespace | Lo spazio bianco tra i markup. |
| XmlDeclaration | Il contenuto della dichiarazione. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
