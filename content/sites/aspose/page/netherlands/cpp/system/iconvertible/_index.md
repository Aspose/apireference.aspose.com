---
title: "System::IConvertible klasse"
linktitle: "IConvertible"
second_title: "Aspose.Page voor C++"
description: "System::IConvertible klasse. Definieert methoden die de waarde van het implementerende referentie‑ of waardetype converteren naar een gemeenschappelijk runtime‑type met een equivalente waarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 3400
url: /nl/cpp/system/iconvertible/
---
## IConvertible class


Definieert methoden die de waarde van het implementerende referentie‑ of waardetype converteren naar een gemeenschappelijk runtime‑type met een equivalente waarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class IConvertible : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Retourneert de typecode voor deze instantie. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalente [Boolean](../boolean/) waarde met behulp van de opgegeven cultuurspecifieke opmaak‑informatie. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalente 8‑bit uint32_teger met behulp van de opgegeven cultuurspecifieke opmaak‑informatie. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent Unicode‑teken met behulp van de opgegeven cultuurspecifieke opmaak‑informatie. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent [System::DateTime](../datetime/) met behulp van de opgegeven cultuurspecifieke opmaak‑informatie. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent [System::Decimal](../decimal/) getal met behulp van de opgegeven cultuurspecifieke opmaak‑informatie. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent double‑precision floating‑point getal met behulp van de opgegeven cultuurspecifieke opmaak‑informatie.. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 16‑bit ondertekend geheel getal met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 32‑bit ondertekend geheel getal met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 64‑bit ondertekend geheel getal met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 8‑bit ondertekend geheel getal met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent enkel‑precisie zwevend‑kommagetal met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent [System::String](../string/) met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToString](./tostring/)() const | Analoge van de C#-methode [Object.ToString()](../object/tostring/). Maakt het converteren van aangepaste objecten naar een string mogelijk. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een [System::Object](../object/) van het opgegeven System::Type dat een equivalent waarde heeft, met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 16‑bit uint32_teger met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 32‑bit uint32_teger met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Converteert de waarde van deze instantie naar een equivalent 64‑bit uint32_teger met behulp van de opgegeven cultuur‑specifieke opmaakinformatie. |
## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
