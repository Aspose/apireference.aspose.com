---
title: "System::Reflection::Assembly class"
linktitle: "Assembly"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::Assembly class. Reflectieklasse die een assembly beschrijft. Ondersteuning is beperkt omdat de regels sterk verschillen tussen C# en C++. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Assembly](./assembly/)() | Constructor. |
| virtual [get_CodeBase](./get_codebase/)() const | Haalt de map van de huidige assembly op. Ondersteuning is beperkt. |
| virtual [get_FullName](./get_fullname/)() const | Haalt de volledige naam van de assembly op. |
| virtual [get_Location](./get_location/)() const | Haalt de locatie van de assembly op. Niet geïmplementeerd. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Haalt de assembly op die een specifiek type definieert. |
| static [GetCallingAssembly](./getcallingassembly/)() | Haalt de aanroepende assembly op. |
| static [GetEntryAssembly](./getentryassembly/)() | Haalt de entry assembly op. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Haalt de uitvoerende assembly op. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Haalt de namen van manifestresources op. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Haalt de stream op die verbonden is met een manifestresource. |
| virtual [GetName](./getname/)() const | Haalt de naam van de assembly op. |
| virtual [GetTypes](./gettypes/)() const | Haalt de types op die door de assembly zijn gedeclareerd. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
