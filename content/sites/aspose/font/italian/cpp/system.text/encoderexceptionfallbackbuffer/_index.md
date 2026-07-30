---
title: "System::Text::EncoderExceptionFallbackBuffer class"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Font per C++"
description: "System::Text::EncoderExceptionFallbackBuffer class. Buffer for exception-throwing encoding fallback strategy. Doesn''t store anything actually, but throws instead. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1100
url: /it/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Costruttore. |
| [Fallback](./fallback/)(char_t, int) override | Gestisce i fallimenti di codifica. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Gestisce i fallimenti di codifica. |
| [get_Remaining](./get_remaining/)() const override | Restituisce il numero di caratteri rimanenti. |
| [GetNextChar](./getnextchar/)() override | Ottiene il prossimo carattere disponibile. |
| [MovePrevious](./moveprevious/)() override | Sposta al carattere precedente. |
## Vedi anche

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
