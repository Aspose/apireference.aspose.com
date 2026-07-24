---
title: "System::EnumValuesBase-klass"
linktitle: "EnumValuesBase"
second_title: "Aspose.Page för C++"
description: "System::EnumValuesBase-klass. En basklass för en klass som representerar metainformation för uppräkningstyp i C++."
type: docs
weight: 2400
url: /sv/cpp/system/enumvaluesbase/
---
## EnumValuesBase class


En basklass för en klass som representerar metainformation för en uppräkningstyp.

```cpp
class EnumValuesBase
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [GetNames](./getnames/)(const TypeInfo\&) | Hämtar en array med namnen på konstanterna i en specificerad uppräkning. |
| static [GetUnderlyingType](./getunderlyingtype/)(const TypeInfo\&) | Returnerar den underliggande typen för den specificerade uppräkningen. |
| static [GetValues](./getvalues/)(const TypeInfo\&) | Returnerar en array som innehåller alla värden för den angivna uppräkningstypen. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Returnerar ett objekt som representerar ett värde av en enum‑konstant för den angivna uppräkningstypen med det angivna namnet. |
| static [ToObject](./toobject/)(const TypeInfo\&, uint64_t) | Konverterar det angivna 64‑bit osignerade heltalsvärdet till en uppräkningselement. |
| static [ToObject](./toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Konverterar det angivna objektet med ett heltalsvärde till ett uppräkningselement. |
## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
