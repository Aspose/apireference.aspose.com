---
title: "Classe System::Text::Decoder"
linktitle: "Decoder"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::Decoder. Incapsula la decodifica di una sequenza di byte in una sequenza di caratteri. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.text/decoder/
---
## Decoder class


Incapsula la decodifica di una sequenza di byte in una sequenza di caratteri. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Decoder : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Converte i byte in caratteri. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Converte i byte in caratteri. |
| [get_Fallback](./get_fallback/)() const | Restituisce il fallback di gestione degli errori. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Restituisce il buffer di fallback. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Restituisce il numero di caratteri necessari per decodificare un buffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Restituisce il numero di caratteri necessari per decodificare un buffer. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Restituisce il numero di caratteri necessari per decodificare un buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Ottieni i caratteri risultanti dalla decodifica di un buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Ottieni i caratteri risultanti dalla decodifica di un buffer. |
| virtual [Reset](./reset/)() | Pulisce lo stato interno del decoder. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Imposta il fallback di gestione degli errori. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
