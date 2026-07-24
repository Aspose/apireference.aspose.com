---
title: "Aspose::Page::IMultiPageDevice classe"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::IMultiPageDevice classe. Questa interfaccia contiene metodi per manipolare dispositivi multi-pagina in C++."
type: docs
weight: 800
url: /it/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Questa interfaccia contiene metodi per manipolare un dispositivo a più pagine.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Esegue la preparazione necessaria del dispositivo dopo che la pagina è stata renderizzata. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Numero di pagina corrente. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Inizializza il numero di pagine da emettere. |
| virtual [OpenPage](./openpage/)(System::String) | Esegue la preparazione necessaria del dispositivo prima del rendering della pagina. |
| virtual [OpenPage](./openpage/)(float, float) | Esegue la preparazione necessaria del dispositivo prima del rendering di ogni pagina. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Aggiorna i parametri della pagina da un altro dispositivo multi-pagina. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
