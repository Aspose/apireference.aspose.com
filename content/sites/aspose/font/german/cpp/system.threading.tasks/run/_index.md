---
title: "System::Threading::Tasks::Run Methode"
linktitle: "Run"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::Run Methode. Stellt die angegebene Arbeit in die Thread-Pool-Warteschlange ein und gibt in C++ einen Task-Handle für diese Arbeit zurück."
type: docs
weight: 1600
url: /de/cpp/system.threading.tasks/run/
---
## System::Threading::Tasks::Run(const Action<>\&) method


Stellt die angegebene Arbeit in die Thread-Pool-Warteschlange ein und gibt einen [Task](../task/)-Handle für diese Arbeit zurück.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aktion | const Action<>\& | Die Arbeit, die asynchron ausgeführt werden soll. |

### ReturnValue

Ein [Task](../task/), der die in die Thread-Pool-Warteschlange eingestellte Arbeit repräsentiert.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Action<>\&, const CancellationToken\&) method


Stellt die angegebene Arbeit in die Thread-Pool-Warteschlange ein und gibt einen [Task](../task/)-Handle für diese Arbeit zurück.

```cpp
TaskPtr System::Threading::Tasks::Run(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aktion | const Action<>\& | Die Arbeit, die asynchron ausgeführt werden soll. |
| cancellationToken | const CancellationToken\& | Ein Abbruch-Token, das verwendet werden kann, um die Arbeit abzubrechen, falls sie noch nicht gestartet wurde. |

### ReturnValue

Ein [Task](../task/), der die in die Thread-Pool-Warteschlange eingestellte Arbeit repräsentiert.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Typedef [Action](../../system/action/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TaskPtr\>\&) method


Stellt die angegebene Arbeit in die Thread-Pool-Warteschlange ein und gibt ein Proxy-Objekt für den von der Funktion zurückgegebenen [Task](../task/) zurück.

```cpp
TaskPtr System::Threading::Tasks::Run(const Func<TaskPtr> &function)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| function | const Func\<TaskPtr\>\& | Die Arbeit, die asynchron ausgeführt wird und einen [Task](../task/) zurückgibt. |

### ReturnValue

Ein [Task](../task/), der ein Proxy für den von der Funktion zurückgegebenen [Task](../task/) darstellt.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Run(const Func\<TResult\>\&) method


Stellt die angegebene Arbeit in die Thread‑Pool-Warteschlange und gibt einen [Task<TResult>](../task/)‑Handle für diese Arbeit zurück.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Run(const Func<TResult> &function)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Der Typ des vom Task zurückgegebenen Ergebnisses. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Funktion | const Func\<TResult\>\& | Die Arbeit, die asynchron ausgeführt werden soll. |

### ReturnValue

Ein [Task<TResult>](../task/), der die in die Thread‑Pool-Warteschlange eingestellte Arbeit repräsentiert.

## Siehe auch

* Typedef [RTaskPtr](../../system/rtaskptr/)
* Class [Func](../../system/func/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
