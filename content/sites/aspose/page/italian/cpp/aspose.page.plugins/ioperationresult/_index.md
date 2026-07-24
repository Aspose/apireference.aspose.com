---
title: "Classe Aspose::Page::Plugins::IOperationResult"
linktitle: "IOperationResult"
second_title: "Aspose.Page per C++"
description: "Classe Aspose::Page::Plugins::IOperationResult. Interfaccia generale del risultato dell'operazione che definisce i metodi comuni che il risultato dell'operazione di un plugin concreto deve implementare in C++."
type: docs
weight: 700
url: /it/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Interfaccia generica del risultato dell'operazione che definisce i metodi comuni che il risultato dell'operazione del plugin concreto dovrebbe implementare.

```cpp
class IOperationResult : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_Data](./get_data/)() | Ottiene i dati grezzi. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Indica se il risultato è un array di byte. |
| virtual [get_IsFile](./get_isfile/)() | Indica se il risultato è un percorso a un file di output. |
| virtual [get_IsStream](./get_isstream/)() | Indica se il risultato è uno stream di output. |
| virtual [get_IsString](./get_isstring/)() | Indica se il risultato è una stringa di testo. |
| virtual [ToFile](./tofile/)() | Prova a convertire il risultato nel file. |
| virtual [ToStream](./tostream/)() | Tenta di convertire il risultato nell'oggetto stream. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
