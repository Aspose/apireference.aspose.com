---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Font per C++"
description: "System::Xml::WriteState enum. Specifica lo stato dello XmlWriter in C++."
type: docs
weight: 5700
url: /it/cpp/system.xml/writestate/
---
## WriteState enum


Specifica lo stato dello [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Start | 0 | Indica che il metodo XmlWriter::Write non è ancora stato chiamato. |
| Prolog | 1 | Indica che il prologo è in fase di scrittura. |
| Element | 2 | Indica che un tag di apertura dell'elemento è in fase di scrittura. |
| Attribute | 3 | Indica che il valore di un attributo è in fase di scrittura. |
| Content | 4 | Indica che il contenuto dell'elemento è in fase di scrittura. |
| Closed | 5 | Indica che il metodo [XmlWriter::Close](../xmlwriter/close/) è stato chiamato. |
| Error | 6 | È stata generata un'eccezione, che ha lasciato il [XmlWriter](../xmlwriter/) in uno stato non valido. È possibile chiamare il metodo [XmlWriter::Close](../xmlwriter/close/) per mettere il [XmlWriter](../xmlwriter/) nello stato [WriteState::Closed](./). Qualsiasi altra chiamata al metodo [XmlWriter](../xmlwriter/) genera un'InvalidOperationException. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
