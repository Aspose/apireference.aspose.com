---
title: "System::EnumValues-klass"
linktitle: "EnumValues"
second_title: "Aspose.Page för C++"
description: "System::EnumValues-klass. Tillhandahåller metainformation om uppräkningskonstanter för enum-typen E i C++."
type: docs
weight: 2300
url: /sv/cpp/system/enumvalues/
---
## EnumValues class


Tillhandahåller metainformation om uppräkningens konstanter av enum-typen **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parameter | Beskrivning |
| --- | --- |
| E | Typen av uppräkning |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [EnumValues](./enumvalues/)() | Skapar en instans. |
| [GetNames](./getnames/)() const override | Returnerar en array som innehåller alla namn på uppräkning **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Hämtar en array med namnen på konstanterna i en specificerad uppräkning. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Returnerar den underliggande typen för den specificerade uppräkningen. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Returnerar den underliggande typen för den specificerade uppräkningen. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Returnerar det inlåsta värdet av enum-konstanten med det angivna namnet. |
| [GetValueOf](./getvalueof/)(long) const override | Returnerar det inlåsta värdet av enum‑konstanten med det angivna värdet. |
| [GetValues](./getvalues/)() const override | Returnerar en array som innehåller alla värden för uppräkningen **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Returnerar en array som innehåller alla värden för den angivna uppräkningstypen. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Returnerar ett objekt som representerar ett värde av en enum‑konstant för den angivna uppräkningstypen med det angivna namnet. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Konverterar det angivna 64‑bit osignerade heltalsvärdet till en uppräkningselement. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Konverterar det angivna objektet med ett heltalsvärde till ett uppräkningselement. |
| virtual [~EnumValues](./~enumvalues/)() | Destruktor. |

## Se även

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
