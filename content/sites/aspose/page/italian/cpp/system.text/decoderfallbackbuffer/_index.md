---
title: "classe System::Text::DecoderFallbackBuffer"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Page per C++"
description: "Classe System::Text::DecoderFallbackBuffer. Fornisce un buffer per l'implementazione di fallback. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


Fornisce un buffer per l'implementazione di fallback. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class DecoderFallbackBuffer : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | Implementa la procedura di fallback reale. |
| virtual [get_Remaining](./get_remaining/)() const | Ottiene il conteggio rimanente di caratteri da elaborare. |
| virtual [GetNextChar](./getnextchar/)() | Estrae il carattere successivo nel buffer di fallback. |
| virtual [MovePrevious](./moveprevious/)() | Sposta la posizione del buffer di un passo indietro, se possibile. |
| virtual [Reset](./reset/)() | Reimposta il buffer allo stato iniziale. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
