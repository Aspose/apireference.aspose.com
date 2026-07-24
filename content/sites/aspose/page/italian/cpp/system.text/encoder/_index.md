---
title: "classe System::Text::Encoder"
linktitle: "Encoder"
second_title: "Aspose.Page per C++"
description: "classe System::Text::Encoder. Incapsula la sequenza di caratteri da codificare in una sequenza di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.text/encoder/
---
## Encoder class


Incapsula la sequenza di caratteri da codificare in una sequenza di byte. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class Encoder : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Converte i caratteri in byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Converte i caratteri in byte. |
| [get_Fallback](./get_fallback/)() const | Restituisce il fallback di gestione degli errori. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Restituisce il buffer di fallback. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Restituisce il numero di byte necessari per codificare un buffer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Restituisce il numero di byte necessari per codificare un buffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Ottieni i byte risultanti dalla codifica di un buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Ottieni i byte risultanti dalla codifica di un buffer. |
| virtual [Reset](./reset/)() | Pulisce lo stato interno del codificatore. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Imposta il fallback di gestione degli errori. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
