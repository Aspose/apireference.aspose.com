---
title: "System::Drawing::Printing::PrintPageEventArgs Klasse"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Printing::PrintPageEventArgs Klasse. Stellt Daten für das PrintPage‑Ereignis bereit. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Stellt Daten für das PrintPage‑Ereignis bereit. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Graphics](./get_graphics/)() | NICHT IMPLEMENTIERT. |
| [get_HasMorePages](./get_hasmorepages/)() | NICHT IMPLEMENTIERT. |
| [get_PageSettings](./get_pagesettings/)() | NICHT IMPLEMENTIERT. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Konstruiert eine neue Instanz der Klasse [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | NICHT IMPLEMENTIERT. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ptr](./ptr/) | Ein Alias für einen Shared‑Pointer zu einer Instanz dieser Klasse. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
