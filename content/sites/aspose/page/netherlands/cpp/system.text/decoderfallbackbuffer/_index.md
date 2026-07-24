---
title: "System::Text::DecoderFallbackBuffer klasse"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Page voor C++"
description: "System::Text::DecoderFallbackBuffer klasse. Biedt een buffer voor fallback‑implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 600
url: /nl/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


Biedt een buffer voor fallback‑implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class DecoderFallbackBuffer : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | Implementeert de daadwerkelijke fallback‑procedure. |
| virtual [get_Remaining](./get_remaining/)() const | Haalt het resterende aantal tekens op dat verwerkt moet worden. |
| virtual [GetNextChar](./getnextchar/)() | Haalt het volgende teken uit de fallback‑buffer. |
| virtual [MovePrevious](./moveprevious/)() | Verplaatst de bufferpositie één stap terug indien mogelijk. |
| virtual [Reset](./reset/)() | Reset de buffer naar de oorspronkelijke staat. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
