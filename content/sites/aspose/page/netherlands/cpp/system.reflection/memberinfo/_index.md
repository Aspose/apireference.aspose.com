---
title: "System::Reflection::MemberInfo class"
linktitle: "MemberInfo"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::MemberInfo class. Biedt reflectie‑informatie over leden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 700
url: /nl/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Biedt reflectie‑informatie over leden. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Voegt attribuut toe aan collectie. |
| [get_DeclaringType](./get_declaringtype/)() const | Haalt declaratietype op. |
| [get_FullName](./get_fullname/)() const | Haalt volledige naam van lid op. Kan verschillen in handmatig geïmplementeerde delen. |
| virtual [get_MemberType](./get_membertype/)() const | Haalt een [System::Reflection::MemberTypes](../membertypes/) waarde op die het type van het lid aangeeft - methode, constructor, gebeurtenis, enzovoort. |
| [get_Name](./get_name/)() const | Haalt de naam van het lid op. |
| [get_ReflectedType](./get_reflectedtype/)() const | Haalt het gereflecteerde type op. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Retourneert een array met objecten die alle aangepaste attributen vertegenwoordigen die op het type zijn toegepast dat wordt weergegeven door het huidige object. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Retourneert een array met objecten die alle aangepaste attributen vertegenwoordigen die op het type zijn toegepast dat wordt weergegeven door het huidige object. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ObjectPtr](./objectptr/) | Alias voor een gedeelde pointer naar [Object](../../system/object/). |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
