---
title: "System::ComponentModel::CancelEventArgs Klasse"
linktitle: "CancelEventArgs"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::CancelEventArgs Klasse. Argumente eines abbrechbaren Ereignisses. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Argumente eines abbrechbaren Ereignisses. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI-Informationen. |
| [CancelEventArgs](./canceleventargs/)() | Konstruktor; setzt die Eigenschaft Cancel auf false. |
| [get_Cancel](./get_cancel/)() | Ermittelt den Wert, der angibt, ob das Ereignis abgebrochen werden soll. |
| [set_Cancel](./set_cancel/)(bool) | Setzt den Wert, der angibt, ob das Ereignis abgebrochen werden soll. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
