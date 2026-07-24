---
title: "System::Security::Cryptography::ToBase64Transform klass"
linktitle: "ToBase64Transform"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::ToBase64Transform klass. Konverterar CryptoStream-klassens instans till base 64. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 5000
url: /sv/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


Konverterar [CryptoStream](../cryptostream/) klassens instans till base 64. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kommer att leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clear](./clear/)() | Frigör alla resurser. |
| [Dispose](./dispose/)() | Frigör operativsystemresurser som erhållits av det aktuella objektet. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Hämtar ett värde som indikerar om den aktuella transformen kan återanvändas. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Hämtar ett värde som indikerar om flera block kan transformeras. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Storlek på inmatningsblock. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Storlek på utmatningsblock. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | Bearbetar ett datablok och kopierar data till utmatningsarrayen. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Bearbetar sista datablocket och beräknar utdatavärdet. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | Destruktor. |
## Se även

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
