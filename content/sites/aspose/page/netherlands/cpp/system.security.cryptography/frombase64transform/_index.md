---
title: "System::Security::Cryptography::FromBase64Transform klasse"
linktitle: "FromBase64Transform"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::FromBase64Transform klasse. Converteert de CryptoStream klasse‑instantie van base 64. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1500
url: /nl/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Converteert de [CryptoStream](../cryptostream/) klasse‑instantie van base 64. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clear](./clear/)() | Geeft alle bronnen vrij. |
| [Dispose](./dispose/)() | Vrijgeeft de door het huidige object verkregen resources van het besturingssysteem. |
| [FromBase64Transform](./frombase64transform/)() | Constructor. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Constructor. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Haalt een waarde op die aangeeft of de huidige transformatie opnieuw kan worden gebruikt. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Haalt een waarde op die aangeeft of meerdere blokken kunnen worden getransformeerd. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Invoergrootte van blok. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Uitvoergrootte van blok. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Destructor. |
## Zie ook

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
