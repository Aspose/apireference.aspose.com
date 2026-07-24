---
title: "System::ComponentModel::DoWorkEventArgs Klasse"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Page für C++"
description: "System::ComponentModel::DoWorkEventArgs Klasse. DoWork‑Ereignisargumente. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork‑Ereignisargumente. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI-Informationen. |
| [get_Argument](./get_argument/)() | Ermittelt die Argument‑Eigenschaft; nicht implementiert. |
| [get_Result](./get_result/)() | Ermittelt die Result‑Eigenschaft; nicht implementiert. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Setzt die Result‑Eigenschaft; nicht implementiert. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared-Pointer (Null-Pointer) darstellt. |
## Siehe auch

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
