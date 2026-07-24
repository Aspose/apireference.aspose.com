---
title: "System::IO::BinaryWriter-klass"
linktitle: "BinaryWriter"
second_title: "Aspose.Page för C++"
description: "System::IO::BinaryWriter-klass. Representerar en skrivare som skriver värden av primitiva typer till en byte-ström. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 900
url: /sv/cpp/system.io/binarywriter/
---
## BinaryWriter class


Representerar en skrivare som skriver värden av primitiva typer till en byte-ström. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class BinaryWriter : public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Skapar en instans av [BinaryWriter](./)-klassen som skriver data till den angivna strömmen med den angivna kodningen. |
| [Close](./close/)() | Stänger det aktuella [BinaryWriter](./)-objektet och den underliggande utdataströmmen. |
| [Dispose](./dispose/)() override | Frigör alla resurser som används av det aktuella objektet och stänger den underliggande strömmen. |
| [Flush](./flush/)() | Spolar utdataströmmen. |
| [get_BaseStream](./get_basestream/)() | Returnerar utdataflödet. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Ställer in positionen för strömmen som representeras av det aktuella objektet. |
| virtual [Write](./write/)(uint8_t) | Skriver det angivna osignerade 8-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Skriver det angivna delintervallet av byte från den angivna byte-arrayen till utdataflödet. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Skriver det angivna delintervallet av UTF-16-tecken från den angivna teckenarrayen till utdataflödet. |
| virtual [Write](./write/)(bool) | Skriver en enda byte med värdet 0 om **value** är 'true' och 1 om **value** är 'false' till utdataflödet. |
| virtual [Write](./write/)(char16_t) | Skriver det angivna 16-bitars breda teckenvärdet till utdataflödet. |
| virtual [Write](./write/)(int16_t) | Skriver det angivna 16-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(int) | Skriver det angivna 32-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(int64_t) | Skriver det angivna 64-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(uint16_t) | Skriver det angivna osignerade 16-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(uint32_t) | Skriver det angivna osignerade 32-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(uint64_t) | Skriver det angivna osignerade 64-bitars heltalsvärdet till utdataflödet. |
| virtual [Write](./write/)(float) | Skriver det angivna värdet av enkelprecision flyttal till utdataflödet. |
| virtual [Write](./write/)(double) | Skriver det angivna värdet av dubbelprecision flyttal till utdataflödet. |
| virtual [Write](./write/)(const Decimal\&) | Skriver byte-representationen av det angivna [Decimal](../../system/decimal/)-värdet till utdataflödet. |
| virtual [Write](./write/)(const String\&) | Skriver en längdprefixad sträng i aktuell kodning till utdataflödet. |
| virtual [Write](./write/)(const char_t *) | Skriver en längdprefixad sträng i aktuell kodning till utdataflödet. |
| [~BinaryWriter](./~binarywriter/)() | Destruktor. |
## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
