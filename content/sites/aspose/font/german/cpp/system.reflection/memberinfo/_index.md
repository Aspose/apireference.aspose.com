---
title: "System::Reflection::MemberInfo Klasse"
linktitle: "MemberInfo"
second_title: "Aspose.Font für C++"
description: "System::Reflection::MemberInfo Klasse. Stellt Reflexionsinformationen über Mitglieder bereit. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Stellt Reflexionsinformationen über Mitglieder bereit. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Fügt ein Attribut zur Sammlung hinzu. |
| [get_DeclaringType](./get_declaringtype/)() const | Gibt den deklarierenden Typ zurück. |
| [get_FullName](./get_fullname/)() const | Liefert den vollständigen Namen des Mitglieds. Kann in manuell implementierten Teilen unterschiedlich sein. |
| virtual [get_MemberType](./get_membertype/)() const | Liefert einen [System::Reflection::MemberTypes](../membertypes/)-Wert, der den Typ des Mitglieds angibt – Methode, Konstruktor, Ereignis usw. |
| [get_Name](./get_name/)() const | Liefert den Namen des Mitglieds. |
| [get_ReflectedType](./get_reflectedtype/)() const | Liefert den Typ des reflektierten Typs. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Gibt ein Array zurück, das Objekte enthält, die alle benutzerdefinierten Attribute repräsentieren, die auf den vom aktuellen Objekt dargestellten Typ angewendet wurden. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Gibt ein Array zurück, das Objekte enthält, die alle benutzerdefinierten Attribute repräsentieren, die auf den vom aktuellen Objekt dargestellten Typ angewendet wurden. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ObjectPtr](./objectptr/) | Alias für einen Shared-Pointer auf [Object](../../system/object/). |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
