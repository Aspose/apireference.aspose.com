---
title: "System::ComponentModel::RunWorkerCompletedEventArgs Klasse"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Page für C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs Klasse. Eine Instanz dieser Klasse wird als Argument an den RunWorkerCompletedEventHandler‑Delegate übergeben. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


Eine Instanz dieser Klasse wird als Argument an den RunWorkerCompletedEventHandler‑Delegate übergeben. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Result](./get_result/)() const | Gibt einen Wert zurück, der das Ergebnis einer asynchronen Operation darstellt. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | RTTI-Informationen. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared-Pointer (Null-Pointer) darstellt. |
## Siehe auch

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
