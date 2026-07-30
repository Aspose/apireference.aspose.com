---
title: "System::Xml::XmlTextReader::ReadContentAsBase64 metodo"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlTextReader::ReadContentAsBase64 metodo. Legge il contenuto e restituisce i byte binari decodificati Base64 in C++."
type: docs
weight: 4700
url: /it/cpp/system.xml/xmltextreader/readcontentasbase64/
---
## XmlTextReader::ReadContentAsBase64 method


Legge il contenuto e restituisce i byte binari decodificati **Base64**.

```cpp
int32_t System::Xml::XmlTextReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | ArrayPtr\<uint8_t\> | Il buffer in cui copiare il testo risultante. Questo valore non può essere **nullptr**. |
| indice | int32_t | L'offset nel buffer da cui iniziare a copiare il risultato. |
| count | int32_t | Il numero massimo di byte da copiare nel buffer. Il numero effettivo di byte copiati viene restituito da questo metodo. |

### ReturnValue

Il numero di byte scritti nel buffer.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
