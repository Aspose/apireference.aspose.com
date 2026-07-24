---
title: "Metodo System::Xml::XmlReader::ReadContentAsBinHex"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlReader::ReadContentAsBinHex. Legge il contenuto e restituisce i byte binari decodificati da BinHex in C++."
type: docs
weight: 4100
url: /it/cpp/system.xml/xmlreader/readcontentasbinhex/
---
## XmlReader::ReadContentAsBinHex method


Legge il contenuto e restituisce i byte binari decodificati **BinHex**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | Il buffer in cui copiare il testo risultante. Questo valore non può essere **nullptr**. |
| indice | int32_t | L'offset nel buffer da cui iniziare a copiare il risultato. |
| count | int32_t | Il numero massimo di byte da copiare nel buffer. Il numero effettivo di byte copiati è restituito da questo metodo. |

### ReturnValue

Il numero di byte scritti nel buffer.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
