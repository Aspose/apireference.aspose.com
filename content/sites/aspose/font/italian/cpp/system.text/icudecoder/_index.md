---
title: "System::Text::ICUDecoder class"
linktitle: "ICUDecoder"
second_title: "Aspose.Font per C++"
description: "System::Text::ICUDecoder class. Decoder that uses ICU for decoding. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2000
url: /it/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Converte i byte in caratteri. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Converte i byte in caratteri. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Restituisce il numero di caratteri necessari per decodificare un buffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Restituisce il numero di caratteri necessari per decodificare un buffer. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Restituisce il numero di caratteri necessari per decodificare un buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Ottieni i caratteri risultanti dalla decodifica di un buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Ottieni i caratteri risultanti dalla decodifica di un buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Ottieni i caratteri risultanti dalla decodifica di un buffer. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Costruttore. |
| virtual [Reset](./reset/)() | Imposta le variabili interne allo stato iniziale. |
| virtual [~ICUDecoder](./~icudecoder/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Base](./base/) | [Base](./base/) tipo. |
## Vedi anche

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
