---
title: "System::Security::Cryptography::FromBase64Transform klass"
linktitle: "FromBase64Transform"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::FromBase64Transform klass. Konverterar CryptoStream-klassens instans från base 64. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 1500
url: /sv/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Konverterar [CryptoStream](../cryptostream/) klassens instans från base 64. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clear](./clear/)() | Frigör alla resurser. |
| [Dispose](./dispose/)() | Frigör operativsystemresurser som erhållits av det aktuella objektet. |
| [FromBase64Transform](./frombase64transform/)() | Konstruktor. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Konstruktor. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Hämtar ett värde som indikerar om den aktuella transformen kan återanvändas. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Hämtar ett värde som indikerar om flera block kan transformeras. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Storlek på inmatningsblock. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Storlek på utmatningsblock. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Destruktor. |
## Se även

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
