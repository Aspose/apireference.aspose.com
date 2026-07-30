---
title: "System::Text::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Font per C++"
description: "System::Text::Encoder class. Encapsulates encoding character sequence into byte sequence. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 900
url: /it/cpp/system.text/encoder/
---
## Encoder class


Incapsula la sequenza di caratteri da codificare in una sequenza di byte. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Font for C++](../../)
