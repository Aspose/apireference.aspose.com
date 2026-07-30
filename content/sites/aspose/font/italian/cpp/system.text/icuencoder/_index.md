---
title: "Classe System::Text::ICUEncoder"
linktitle: "ICUEncoder"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::ICUEncoder. Encoder che utilizza ICU per la codifica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2100
url: /it/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Converte i caratteri in byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Converte i caratteri in byte. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Restituisce il numero di byte necessari per codificare un buffer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Restituisce il numero di byte necessari per codificare un buffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Ottieni i byte risultanti dalla codifica di un buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Ottieni i byte risultanti dalla codifica di un buffer. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Costruttore. |
| virtual [Reset](./reset/)() | Imposta le variabili interne allo stato iniziale. |
| [~ICUEncoder](./~icuencoder/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Base](./base/) | [Base](./base/) tipo. |
## Vedi anche

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
