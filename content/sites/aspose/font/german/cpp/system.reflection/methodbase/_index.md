---
title: "System::Reflection::MethodBase Klasse"
linktitle: "MethodBase"
second_title: "Aspose.Font für C++"
description: "System::Reflection::MethodBase Klasse. Basisinformationen zu einer Methode. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.reflection/methodbase/
---
## MethodBase class


Grundlegende Informationen zur Methode. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Angabe des Typs des Mitglieds – Methode, Konstruktor, Ereignis usw. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Diese Methode ermöglicht das Abrufen des aktuellen Methodennamens. Der Übersetzer ersetzt ASPOSE_CURRENT_FUNCTION automatisch als Parameter. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Initialisiert eine neue Instanz der Klasse [MethodBase](./). |
## Siehe auch

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
