---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity metodo"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity metodo. Quando sovrascritto in una classe derivata, genera e scrive l'entità del carattere surrogato per la coppia di caratteri surrogati in C++."
type: docs
weight: 3400
url: /it/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


Quando sovrascritto in una classe derivata, genera e scrive l'entità di carattere surrogato per la coppia di caratteri surrogati.

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| lowChar | char16_t | Il surrogato basso. Deve essere un valore compreso tra 0xDC00 e 0xDFFF. |
| highChar | char16_t | Il surrogato alto. Deve essere un valore compreso tra 0xD800 e 0xDBFF. |

## Vedi anche

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
