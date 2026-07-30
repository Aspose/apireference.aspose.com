---
title: "System::Xml::XmlDeclaration::get_Encoding metodo"
linktitle: "get_Encoding"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlDeclaration::get_Encoding metodo. Restituisce il livello di codifica del documento XML in C++."
type: docs
weight: 200
url: /it/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


Restituisce il livello di codifica del documento XML.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

Il nome di codifica dei caratteri valido.
## Osservazioni



I nomi di codifica dei caratteri più comunemente supportati per XML sono i seguenti: |||
|-|-|
| Categoria | Nomi di codifica |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (dove "n" è una cifra da 1 a 9) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

Questo valore è opzionale. Se un valore non è impostato, questo metodo restituisce [String::Empty](../../../system/string/empty/). Se non è incluso un attributo di codifica, si assume la codifica UTF-8 quando il documento viene scritto o salvato.
## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
