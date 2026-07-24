---
title: "System::Runtime::Serialization::SerializationInfo klasse"
linktitle: "SerializationInfo"
second_title: "Aspose.Page voor C++"
description: "System::Runtime::Serialization::SerializationInfo klasse. Bevat een verzameling benoemde velden die een geserialiseerd object vertegenwoordigen. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 400
url: /nl/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Bevat een set van benoemde velden die een geserialiseerd object vertegenwoordigen. Niet geïmplementeerd. Objecten van deze klasse mogen alleen worden toegewezen met behulp van de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SerializationInfo : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Plaatst een float‑waarde. Niet geïmplementeerd. |
| [AddValue](./addvalue/)(const System::String\&, short) | Plaatst een short‑waarde. Niet geïmplementeerd. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Plaatst een boolean‑waarde. Niet geïmplementeerd. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Plaatst een object‑waarde. Niet geïmplementeerd. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Plaatst een object‑waarde met een gespecificeerd type. Niet geïmplementeerd. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Haalt een waarde op uit de [SerializationInfo](./) opslag. Niet geïmplementeerd. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI-informatie. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
