---
title: "System::Drawing::Printing::PrintPageEventArgs Klasse"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Printing::PrintPageEventArgs Klasse. Stellt Daten für das PrintPage‑Ereignis bereit. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Stellt Daten für das PrintPage‑Ereignis bereit. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Graphics](./get_graphics/)() | NICHT IMPLEMENTIERT. |
| [get_HasMorePages](./get_hasmorepages/)() | NICHT IMPLEMENTIERT. |
| [get_PageSettings](./get_pagesettings/)() | NICHT IMPLEMENTIERT. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Konstruiert eine neue Instanz der [PrintPageEventArgs](./)-Klasse. |
| [set_HasMorePages](./set_hasmorepages/)(bool) | NICHT IMPLEMENTIERT. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared-Pointer (Null-Pointer) darstellt. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ptr](./ptr/) | Ein Alias für einen Shared‑Pointer zu einer Instanz dieser Klasse. |
## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
