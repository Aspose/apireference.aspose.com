---
title: "System::Threading::CancellationToken Klasse"
linktitle: "CancellationToken"
second_title: "Aspose.Font für C++"
description: "System::Threading::CancellationToken Klasse. Gibt eine Benachrichtigung weiter, dass Vorgänge abgebrochen werden sollen. Diese Klasse bietet einen Mechanismus für kooperative Abbrüche zwischen Threads, wobei ein Thread andere darüber informieren kann, dass ein Vorgang in C++ abgebrochen werden soll."
type: docs
weight: 200
url: /de/cpp/system.threading/cancellationtoken/
---
## CancellationToken class


Verbreitet die Benachrichtigung, dass Vorgänge abgebrochen werden sollen. Diese Klasse bietet einen Mechanismus für kooperative Abbrüche zwischen Threads, sodass ein Thread andere Threads darüber informieren kann, dass ein Vorgang abgebrochen werden soll.

```cpp
class CancellationToken : public System::Details::BoxableObjectBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CancellationToken](./cancellationtoken/)() | Standardkonstruktor. |
| [get_CanBeCanceled](./get_canbecanceled/)() const | Ermittelt, ob dieses Token in den abgebrochenen Zustand versetzt werden kann. |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Ermittelt, ob für dieses Token ein Abbruch angefordert wurde. |
| static [get_None](./get_none/)() | Gibt einen leeren [System::Threading::CancellationToken](./)-Wert zurück. |
| [Register](./register/)(const Action<>\&) const | Registriert einen Rückruf, der aufgerufen wird, wenn ein Abbruch angefordert wird. |
| [ThrowIfCancellationRequested](./throwifcancellationrequested/)() const | Wirft eine OperationCanceledException, wenn ein Abbruch angefordert wurde. |
## Hinweise



Ein [CancellationToken](./) kann nur über seine zugehörige [CancellationTokenSource](../cancellationtokensource/) abgebrochen werden.

## Siehe auch

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
