---
title: "System::Reflection::MethodBase class"
linktitle: "MethodBase"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::MethodBase class. Basisinformatie over een methode. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 800
url: /nl/cpp/system.reflection/methodbase/
---
## MethodBase class


Basisinformatie over een methode. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Het aangeven van het type van het lid - methode, constructor, gebeurtenis, enzovoort. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Deze methode maakt het mogelijk de huidige methodenaam op te halen. De vertaler vervangt ASPOSE_CURRENT_FUNCTION automatisch als parameter. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Initialiseert een nieuw exemplaar van de [MethodBase](./) klasse. |
## Zie ook

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
