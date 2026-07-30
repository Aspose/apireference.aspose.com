---
title: "System::Text::RegularExpressions::Group Klasse"
linktitle: "Group"
second_title: "Aspose.Font für C++"
description: "System::Text::RegularExpressions::Group Klasse. Ergebnis einer Übereinstimmung, die durch eine einzelne Erfassungsgruppe erfolgt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.text.regularexpressions/group/
---
## Group class


Ergebnis einer Übereinstimmung, die durch eine einzelne Erfassungsgruppe erfolgt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Fügt eine Erfassung zur Gruppe hinzu. |
| [get_Captures](./get_captures/)() | Liefert verfügbare Erfassungen. |
| [get_Success](./get_success/)() | Prüft, ob die Erfassung für diese Gruppe erfolgreich war. |
| [Group](./group/)(const UStringPtr\&, int, int) | Konstruktor. |
| [Group](./group/)() | Konstruktor einer leeren Gruppe. |
## Siehe auch

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
