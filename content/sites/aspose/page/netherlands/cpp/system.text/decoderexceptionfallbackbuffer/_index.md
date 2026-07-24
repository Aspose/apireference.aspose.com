---
title: "System::Text::DecoderExceptionFallbackBuffer klasse"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Page voor C++"
description: "System::Text::DecoderExceptionFallbackBuffer klasse. Buffer voor een uitzondering‑worpende decodeerfallbackstrategie. Slaat eigenlijk niets op, maar gooit in plaats daarvan een uitzondering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Constructor. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Verwerkt decodeerfout. |
| [get_Remaining](./get_remaining/)() const override | Haalt het aantal resterende tekens op. |
| [GetNextChar](./getnextchar/)() override | Haalt het volgende beschikbare teken op. |
| [MovePrevious](./moveprevious/)() override | Verplaatst naar het vorige teken. |
## Zie ook

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
