---
title: "System::Threading::CancellationTokenSource-Klasse"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Font für C++"
description: "System::Threading::CancellationTokenSource-Klasse. Eine Cancellation‑Token‑Quelle, die verwendet werden kann, um Abbruch‑Benachrichtigungen in C++ auszulösen."
type: docs
weight: 400
url: /de/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Eine Abbruch-Token-Quelle, die verwendet werden kann, um Abbruchbenachrichtigungen auszulösen.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Cancel](./cancel/)() | Übermittelt eine Abbruchanforderung. |
| [CancellationTokenSource](./cancellationtokensource/)() | Konstruiert eine neue [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Erstellt eine verknüpfte Token-Quelle, die abbricht, wenn einer der bereitgestellten Tokens abbricht. |
| [Dispose](./dispose/)() override | Gibt alle von der [CancellationTokenSource](./) verwendeten Ressourcen frei. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Ermittelt, ob eine Abbruchanforderung gestellt wurde. |
| [get_Token](./get_token/)() const | Ermittelt das mit dieser Quelle verknüpfte Abbruch-Token. |
## Hinweise


Stellt Mechanismen zum Erstellen und Steuern von Abbruch‑Tokens für die kooperative Abbruch von Vorgängen bereit.
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
