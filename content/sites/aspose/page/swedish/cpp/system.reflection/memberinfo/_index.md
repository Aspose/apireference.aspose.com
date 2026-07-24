---
title: "System::Reflection::MemberInfo class"
linktitle: "MemberInfo"
second_title: "Aspose.Page för C++"
description: "System::Reflection::MemberInfo class. Tillhandahåller reflektioninformation om medlemmar. Objekt av denna klass bör endast allokeras med funktionen System::MakeObject(). Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körningstidsfel och/eller assertionsfel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 700
url: /sv/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Tillhandahåller reflektioninformation om medlemmar. Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körningstidsfel och/eller assertionsfel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Lägger till attribut i samlingen. |
| [get_DeclaringType](./get_declaringtype/)() const | Hämtar deklarerande typ. |
| [get_FullName](./get_fullname/)() const | Hämtar medlemmens fullständiga namn. Kan vara annorlunda i manuellt implementerade delar. |
| virtual [get_MemberType](./get_membertype/)() const | Hämtar ett [System::Reflection::MemberTypes](../membertypes/)‑värde som indikerar medlemmens typ – metod, konstruktor, händelse osv. |
| [get_Name](./get_name/)() const | Hämtar medlemsnamn. |
| [get_ReflectedType](./get_reflectedtype/)() const | Hämtar reflekterad typ. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Returnerar en array som innehåller objekt som representerar alla anpassade attribut som tillämpats på den typ som representeras av det aktuella objektet. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Returnerar en array som innehåller objekt som representerar alla anpassade attribut som tillämpats på den typ som representeras av det aktuella objektet. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [ObjectPtr](./objectptr/) | Alias för en delad pekare till [Object](../../system/object/). |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
