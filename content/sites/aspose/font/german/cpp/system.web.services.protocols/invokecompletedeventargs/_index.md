---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs Klasse"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs Klasse. Eine Instanz dieser Klasse wird als Argument an den InvokeCompletedEventHandler-Delegaten übergeben. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


Eine Instanz dieser Klasse wird als Argument an den InvokeCompletedEventHandler-Delegaten übergeben. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Results](./get_results/)() | Gibt eine Sammlung von Ergebnissen asynchroner Operationen zurück. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Erstellt eine neue Instanz. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Siehe auch

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
