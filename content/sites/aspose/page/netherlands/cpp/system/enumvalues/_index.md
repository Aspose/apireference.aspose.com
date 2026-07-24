---
title: "System::EnumValues klasse"
linktitle: "EnumValues"
second_title: "Aspose.Page voor C++"
description: "System::EnumValues klasse. Biedt meta‑informatie over enumeratie‑constanten van enum‑type E in C++."
type: docs
weight: 2300
url: /nl/cpp/system/enumvalues/
---
## EnumValues class


Biedt meta‑informatie over enumeratie‑constanten van enum‑type **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parameter | Beschrijving |
| --- | --- |
| E | Het type enumeratie |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EnumValues](./enumvalues/)() | Construeert een instantie. |
| [GetNames](./getnames/)() const override | Retourneert een array met alle namen van enumeratie **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Haalt een array op met de namen van de constanten in een opgegeven enumeratie. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Retourneert het onderliggende type van de opgegeven enumeratie. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Retourneert het onderliggende type van de opgegeven enumeratie. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Retourneert de ingepakte waarde van de enum‑constante met de opgegeven naam. |
| [GetValueOf](./getvalueof/)(long) const override | Retourneert de ingepakte waarde van de enum‑constante met de opgegeven waarde. |
| [GetValues](./getvalues/)() const override | Retourneert een array met alle waarden van enumeratie **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Retourneert een array met alle waarden van het opgegeven enumeratietype. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Retourneert een object dat een waarde van een enumeratie‑constante van het opgegeven enumeratietype met de opgegeven naam vertegenwoordigt. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Converteert de opgegeven 64‑bit unsigned integer‑waarde naar een enumeratie‑lid. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Converteert het opgegeven object met een integer‑waarde naar een enumeratie‑lid. |
| virtual [~EnumValues](./~enumvalues/)() | Destructor. |

## Zie ook

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
