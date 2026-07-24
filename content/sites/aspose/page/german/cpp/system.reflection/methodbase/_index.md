---
title: "System::Reflection::MethodBase Klasse"
linktitle: "MethodBase"
second_title: "Aspose.Page für C++"
description: "System::Reflection::MethodBase Klasse. Basisinformationen zur Methode. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.reflection/methodbase/
---
## MethodBase class


Basisinformationen zur Methode. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Gibt den Typ des Mitglieds an – Methode, Konstruktor, Ereignis usw. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Diese Methode ermöglicht das Abrufen des aktuellen Methodennamens. Der Übersetzer ersetzt ASPOSE_CURRENT_FUNCTION automatisch als Parameter. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Initialisiert eine neue Instanz der [MethodBase](./) Klasse. |
## Siehe auch

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
