---
title: "Classe System::Text::EncodingEncoder"
linktitle: "EncodingEncoder"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::EncodingEncoder. Encoder che utilizza l'oggetto di codifica per la codifica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1800
url: /it/cpp/system.text/encodingencoder/
---
## EncodingEncoder class


[Encoder](../encoder/) that uses encoding object for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingEncoder : public System::Text::Encoder
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Converte i caratteri in byte. |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Converte i caratteri in byte. |
## Vedi anche

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
