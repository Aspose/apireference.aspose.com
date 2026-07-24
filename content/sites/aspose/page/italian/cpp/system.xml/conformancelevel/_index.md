---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page per C++"
description: "System::Xml::ConformanceLevel enum. Specifica la quantità di verifica di input o output eseguita dagli oggetti XmlReader e XmlWriter in C++."
type: docs
weight: 4600
url: /it/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Specifica la quantità di verifica di input o output eseguita dagli oggetti [XmlReader](../xmlreader/) e [XmlWriter](../xmlwriter/).

```cpp
enum class ConformanceLevel
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Auto | 0 | L'oggetto [XmlReader](../xmlreader/) o [XmlWriter](../xmlwriter/) rileva automaticamente se deve essere eseguita una verifica a livello di documento o a livello di frammento e effettua la verifica appropriata. Se si avvolge un altro oggetto [XmlReader](../xmlreader/) o [XmlWriter](../xmlwriter/), l'oggetto esterno non esegue alcuna verifica di conformità aggiuntiva. La verifica di conformità è lasciata all'oggetto sottostante. |
| Fragment | 1 | I dati XML sono un [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), come definito dal W3C. Questo livello di conformità rappresenta un documento XML che potrebbe non avere un elemento radice ma è comunque ben formato. Questo livello di verifica garantisce che il flusso letto o scritto possa essere consumato da qualsiasi processore come una [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | I dati XML rispettano le regole per un [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) ben formato, come definito dal W3C. Questo livello di verifica garantisce che il flusso letto o scritto possa essere consumato da qualsiasi processore come un [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
