---
title: "Classe Aspose::Font::CffDataProviders::NameIndexDataProvider"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::CffDataProviders::NameIndexDataProvider. Dichiarazione della funzionalità per accedere alla struttura CFF Name INDEX in C++."
type: docs
weight: 500
url: /it/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


Dichiara la funzionalità per accedere alla struttura CFF Name INDEX.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | Aggiunge un nome di carattere alla struttura Name INDEX. Utilizzare questo metodo con cautela perché ogni nome di carattere nella struttura CFF Name INDEX deve avere una struttura DICT corrispondente nell'indice Top DICT secondo la specifica CFF. |
| virtual [get_Count](./get_count/)() | Il numero di oggetti nella struttura CFF INDEX. |
| virtual [GetName](./getname/)(int32_t) | Ottiene il nome del carattere all'indice specificato. |
| virtual [GetRawBytes](./getrawbytes/)() | Ottiene tutti i byte della struttura CFF INDEX. |
| virtual [idx_get](./idx_get/)(int32_t) | Ottiene/imposta il nome del carattere all'indice specificato. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Ottiene/imposta il nome del carattere all'indice specificato. |
| virtual [RemoveName](./removename/)(int32_t) | Rimuove il nome all'indice specificato. Utilizzare questo metodo con cautela perché ogni nome di carattere nella struttura CFF Name INDEX deve avere una struttura DICT corrispondente nell'indice Top DICT secondo la specifica CFF. |
| virtual [SetName](./setname/)(System::String, int32_t) | Imposta il nome del carattere all'indice specificato. |
## Vedi anche

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
