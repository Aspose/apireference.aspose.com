---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Font per C++"
description: "System::Xml::ConformanceLevel enum. Specifica la quantità di verifica di input o output che gli oggetti XmlReader e XmlWriter eseguono in C++."
type: docs
weight: 4600
url: /it/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Specifica la quantità di verifica di input o output che gli oggetti [XmlReader](../xmlreader/) e [XmlWriter](../xmlwriter/) eseguono.

```cpp
enum class ConformanceLevel
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Auto | 0 | L'oggetto [XmlReader](../xmlreader/) o [XmlWriter](../xmlwriter/) rileva automaticamente se deve essere eseguita la verifica a livello di documento o a livello di frammento, e effettua la verifica appropriata. Se stai avvolgendo un altro oggetto [XmlReader](../xmlreader/) o [XmlWriter](../xmlwriter/), l'oggetto esterno non esegue alcuna verifica di conformità aggiuntiva. La verifica di conformità è lasciata all'oggetto sottostante. |
| Fragment | 1 | I dati XML sono un [frammento XML ben formato](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), come definito dal W3C. Questo livello di conformità rappresenta un documento XML che potrebbe non avere un elemento radice ma è comunque ben formato. Questo livello di verifica garantisce che il flusso letto o scritto possa essere consumato da qualsiasi processore come una [entità esterna analizzata XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | I dati XML rispettano le regole per un [documento XML 1.0 ben formato](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), come definito dal W3C. Questo livello di verifica garantisce che il flusso letto o scritto possa essere consumato da qualsiasi processore come un [documento XML 1.0](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
