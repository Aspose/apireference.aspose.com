---
title: "Classe System::Text::EncodingDecoder"
linktitle: "EncodingDecoder"
second_title: "Aspose.Font per C++"
description: "Classe System::Text::EncodingDecoder. Decoder che utilizza l'oggetto di codifica per la decodifica. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1700
url: /it/cpp/system.text/encodingdecoder/
---
## EncodingDecoder class


[Decoder](../decoder/) that uses encoding object for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncodingDecoder : public System::Text::Decoder
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) override | Converte i byte in caratteri. |
| [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) override | Converte i byte in caratteri. |
## Vedi anche

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
