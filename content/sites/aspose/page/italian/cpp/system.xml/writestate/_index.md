---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page per C++"
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
| Avvia | 0 | Indica che il metodo XmlWriter::Write non è ancora stato chiamato. |
| Prologo | 1 | Indica che il prologo è in fase di scrittura. |
| Elemento | 2 | Indica che un tag di inizio elemento è in fase di scrittura. |
| Attributo | 3 | Indica che un valore di attributo è in fase di scrittura. |
| Contenuto | 4 | Indica che il contenuto dell'elemento è in fase di scrittura. |
| Closed | 5 | Indica che il metodo [XmlWriter::Close](../xmlwriter/close/) è stato chiamato. |
| Error | 6 | È stata generata un'eccezione, che ha lasciato lo [XmlWriter](../xmlwriter/) in uno stato non valido. È possibile chiamare il metodo [XmlWriter::Close](../xmlwriter/close/) per mettere lo [XmlWriter](../xmlwriter/) nello stato [WriteState::Closed](./). Qualsiasi altra chiamata a un metodo dello [XmlWriter](../xmlwriter/) genera un'InvalidOperationException. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
