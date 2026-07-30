---
title: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 metodo"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNodeReader::ReadElementContentAsBase64 metodo. Legge l'elemento e decodifica il contenuto Base64 in C++."
type: docs
weight: 3400
url: /it/cpp/system.xml/xmlnodereader/readelementcontentasbase64/
---
## XmlNodeReader::ReadElementContentAsBase64 method


Legge l'elemento e decodifica il contenuto Base64.

```cpp
int32_t System::Xml::XmlNodeReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
