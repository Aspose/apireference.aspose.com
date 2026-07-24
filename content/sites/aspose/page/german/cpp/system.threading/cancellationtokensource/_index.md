---
title: "System::Threading::CancellationTokenSource Klasse"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Page für C++"
description: "System::Threading::CancellationTokenSource Klasse. Eine CancellationTokenSource, die verwendet werden kann, um Abbruchbenachrichtigungen in C++ auszulösen."
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
| [Cancel](./cancel/)() | Übermittelt eine Anforderung zum Abbruch. |
| [CancellationTokenSource](./cancellationtokensource/)() | Konstruiert ein neues [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Erstellt eine verknüpfte Token-Quelle, die abbricht, wenn einer der bereitgestellten Tokens abbricht. |
| [Dispose](./dispose/)() override | Gibt alle von der [CancellationTokenSource](./) verwendeten Ressourcen frei. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Ermittelt, ob ein Abbruch angefordert wurde. |
| [get_Token](./get_token/)() const | Ermittelt das mit dieser Quelle verbundene CancellationToken. |
## Hinweise


Stellt Mechanismen zum Erzeugen und Steuern von Cancellation-Tokens für kooperative Abbrüche von Vorgängen bereit.
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
