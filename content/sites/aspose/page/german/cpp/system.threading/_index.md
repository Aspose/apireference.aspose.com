---
title: "System::Threading Namensraum"
linktitle: "System::Threading"
second_title: "Aspose.Page für C++"
description: "Wie man den System::Threading Namensraum in C++ verwendet."
type: docs
weight: 6500
url: /de/cpp/system.threading/
---



## Klassen

| Klasse | Beschreibung |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) um einen wartenden Thread zu benachrichtigen, der automatisch zurückgesetzt wird. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [CancellationToken](./cancellationtoken/) | Propagiert die Benachrichtigung, dass Vorgänge abgebrochen werden sollen. Diese Klasse bietet einen Mechanismus für kooperative Abbrüche zwischen Threads, der es einem Thread ermöglicht, andere darüber zu informieren, dass ein Vorgang abgebrochen werden soll. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Stellt eine Registrierung für einen Abbruch-Token-Callback dar. |
| [CancellationTokenSource](./cancellationtokensource/) | Eine Abbruch-Token-Quelle, die verwendet werden kann, um Abbruchbenachrichtigungen auszulösen. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) das an einen wartenden Thread gesendet werden kann. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Interlocked](./interlocked/) | Stellt eine API für thread‑sichere Vorgänge bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) zur Benachrichtigung des wartenden Threads, der nicht automatisch zurückgesetzt wird. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Monitor](./monitor/) | Die Klasse [Monitor](./monitor/) bietet einen Mechanismus, der den Zugriff auf Objekte synchronisiert. |
| [Mutex](./mutex/) | [Mutex](./mutex/) Implementierung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) Implementierung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [SynchronizationContext](./synchronizationcontext/) | Stellt die Grundfunktionalität zum Weitergeben eines Synchronisationskontexts über verschiedene Synchronisationsvorgänge bereit. |
| [Thread](./thread/) | [Thread](./thread/) Implementierung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) Pool‑API, die das Einreihen von Aufträgen in eine Warteschlange ermöglicht, die von einem Pool von Arbeiter‑Threads gelesen wird. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) Pool‑interne Daten. Dies ist ein Singleton‑Typ, dessen Speicherverwaltung über Zugriffs‑Funktion(en) erfolgt. Sie sollten niemals Instanzen davon direkt erstellen. |
| [Timer](./timer/) | [Timer](./timer/) Klasse, die ein Job‑Element nach einer Verzögerung in einem separaten Thread ausführt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
| [TimerQueue](./timerqueue/) | Warteschlange, die [Timer](./timer/)-Objekte verwaltet. Dies ist lediglich eine Implementierung. [Timer](./timer/)-Objekte registrieren sich dort selbst; Sie müssen dies nicht tun, um sie zu verwenden – verwenden Sie stattdessen die [Timer](./timer/) Klassen‑API. Dies ist ein Singleton‑Typ, dessen Speicherverwaltung über Zugriffs‑Funktion(en) erfolgt. Sie sollten niemals Instanzen davon direkt erstellen. |
| [WaitHandle](./waithandle/) | Warte‑Primitive Basisklasse. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben. |
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Legt den Apartment‑Zustand des Threads fest. |
| [EventResetMode](./eventresetmode/) | Gibt an, wie der Ereigniszustand zurückgesetzt wird. |
| [ThreadState](./threadstate/) | Zustand des Threads. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | [Thread](./thread/) Funktion mit einem Parameter. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | [Thread](./thread/) Funktion ohne Parameter. |
| [TimerCallback](./timercallback/) | Callback‑Funktion, die vom Timer aufgerufen wird. |
| [wait_handle_t](./wait_handle_t/) | Handle‑Typ. |
| [WaitCallback](./waitcallback/) | Callback‑Element, das ausgeführt wird, sobald ein Platz verfügbar ist. |
