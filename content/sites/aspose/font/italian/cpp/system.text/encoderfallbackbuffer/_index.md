---
title: "System::Text::EncoderFallbackBuffer classe"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Font per C++"
description: "System::Text::EncoderFallbackBuffer classe. Fornisce un buffer per l'implementazione di fallback. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Fornisce un buffer per l'implementazione di fallback. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Implementa la procedura di fallback reale. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Implementa la procedura di fallback reale. |
| virtual [get_Remaining](./get_remaining/)() const | Ottiene il conteggio rimanente dei caratteri da elaborare. |
| virtual [GetNextChar](./getnextchar/)() | Estrae il carattere successivo nel buffer di fallback. |
| virtual [MovePrevious](./moveprevious/)() | Sposta la posizione del buffer indietro di un passo, se possibile. |
| virtual [Reset](./reset/)() | Reimposta il buffer allo stato iniziale. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
