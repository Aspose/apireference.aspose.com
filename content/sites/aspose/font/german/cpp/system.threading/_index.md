---
title: "System::Threading-Namespace"
linktitle: "System::Threading"
second_title: "Aspose.Font für C++"
description: "Wie man den System::Threading-Namespace in C++ verwendet."
type: docs
weight: 6900
url: /de/cpp/system.threading/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) zum Benachrichtigen des wartenden Threads, das automatisch zurückgesetzt wird. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [CancellationToken](./cancellationtoken/) | Verbreitet die Benachrichtigung, dass Vorgänge abgebrochen werden sollen. Diese Klasse bietet einen Mechanismus für kooperative Abbrüche zwischen Threads, sodass ein Thread andere Threads darüber informieren kann, dass ein Vorgang abgebrochen werden soll. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Stellt eine Registrierung für einen Abbruch-Token-Callback dar. |
| [CancellationTokenSource](./cancellationtokensource/) | Eine Abbruch-Token-Quelle, die verwendet werden kann, um Abbruchbenachrichtigungen auszulösen. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) das an einen wartenden Thread gesendet werden kann. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Interlocked](./interlocked/) | Bietet eine API für thread-sichere Operationen. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon erstellen. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) zum Benachrichtigen eines wartenden Threads, das nicht automatisch zurückgesetzt wird. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Monitor](./monitor/) | Die Klasse [Monitor](./monitor/) bietet einen Mechanismus, der den Zugriff auf Objekte synchronisiert. |
| [Mutex](./mutex/) | [Mutex](./mutex/) Implementierung. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) Implementierung. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [SynchronizationContext](./synchronizationcontext/) | Bietet die Grundfunktionalität zum Weitergeben eines Synchronisationskontexts über verschiedene Synchronisationsvorgänge. |
| [Thread](./thread/) | [Thread](./thread/) Implementierung. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) Pool-API, die es ermöglicht, Aufgaben in eine Warteschlange zu schieben, die von einem Pool von Arbeiter-Threads gelesen wird. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon erstellen. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) Pool-Interndaten. Dies ist ein Singleton-Typ, bei dem die Speicherverwaltung über Zugriffs‑Funktion(en) erfolgt. Sie sollten niemals direkt Instanzen davon erstellen. |
| [Timer](./timer/) | [Timer](./timer/) Klasse, die ein Auftrags‑Element nach einer Verzögerung in einem separaten Thread ausführt. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [TimerQueue](./timerqueue/) | Warteschlange, die [Timer](./timer/)-Objekte verwaltet. Dies ist lediglich eine Implementierung. [Timer](./timer/)-Objekte registrieren sich dort selbst; Sie müssen dies nicht tun, um sie zu verwenden – verwenden Sie stattdessen die API der [Timer](./timer/)-Klasse. Dies ist ein Singleton‑Typ, bei dem die Speicherverwaltung über Zugriffs‑Funktion(en) erfolgt. Sie sollten niemals direkt Instanzen davon erstellen. |
| [WaitHandle](./waithandle/) | Wartende Primitive Basisklasse. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen Zeiger [System::SmartPtr](../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Setzt den Apartment-Status des Threads. |
| [EventResetMode](./eventresetmode/) | Gibt an, wie der Ereignisstatus zurückgesetzt wird. |
| [ThreadState](./threadstate/) | Status des Threads. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | Funktion [Thread](./thread/) mit einem Parameter. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | Funktion [Thread](./thread/) ohne Parameter. |
| [TimerCallback](./timercallback/) | Rückruffunktion, die vom Timer aufgerufen wird. |
| [wait_handle_t](./wait_handle_t/) | Handle-Typ. |
| [WaitCallback](./waitcallback/) | Rückruf-Element, das ausgeführt wird, sobald ein Platz verfügbar ist. |
