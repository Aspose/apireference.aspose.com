---
title: "System::Text::EncoderReplacementFallbackBuffer class"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncoderReplacementFallbackBuffer‑klasse. Buffer voor het vervangen van de encoder‑fallback‑strategie. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | Constructor. |
| [Fallback](./fallback/)(char_t, int) override | Behandelt coderingsfout. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Behandelt coderingsfout. |
| [get_Remaining](./get_remaining/)() const override | Haalt het aantal resterende tekens in de buffer op. |
| [GetNextChar](./getnextchar/)() override | Haalt het volgende beschikbare teken op. |
| [MovePrevious](./moveprevious/)() override | Verplaatst naar het vorige teken. |
| [Reset](./reset/)() override | Reset de buffer naar de initiële staat (voor de [Fallback()](./fallback/) aanroep). |
## Zie ook

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
