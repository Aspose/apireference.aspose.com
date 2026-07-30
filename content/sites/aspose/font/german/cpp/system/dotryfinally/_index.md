---
title: "System::DoTryFinally Methode"
linktitle: "DoTryFinally"
second_title: "Aspose.Font für C++"
description: "System::DoTryFinally Methode. Die einzige Funktion, die das Verhalten von C#''s try[-catch]-finally‑Anweisung nachahmt. Während der Übersetzung von C#''s try[-catch]-finally‑Anweisung mit der Option des Translators finally_statement_as_lambda, die auf true gesetzt ist, wird die Anweisung in den Aufruf dieser Methode in C++ übersetzt."
type: docs
weight: 16600
url: /de/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


Die einzige Funktion, die das Verhalten von C#'s try[-catch]-finally‑Anweisung nachahmt. Während der Übersetzung von C#'s try[-catch]-finally‑Anweisung mit der Option des Translators finally_statement_as_lambda, die auf true gesetzt ist, wird die Anweisung in den Aufruf dieser Methode übersetzt.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Funktionsobjekts, das den try[-catch]-Teil der emulierten try[-catch]-finally‑Anweisung implementiert |
| F | Der Typ des Funktionsobjekts, das den finally‑Teil der emulierten try[-catch]-finally‑Anweisung implementiert |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tryBlock | T\&& | Das Funktionsobjekt, dessen Körper die Implementierung des try[-catch]-Teils der emulierten try[-catch]-finally‑Anweisung enthält |
| finallyBlock | F\&& | Das Funktionsobjekt, dessen Körper die Implementierung des finally‑Teils der emulierten try[-catch]-finally‑Anweisung enthält. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Die einzige Funktion, die das Verhalten der C#-try[-catch]-finally-Anweisung emuliert. Während der Übersetzung der C#-try[-catch]-finally-Anweisung mit der Übersetzeroption finally_statement_as_lambda auf true gesetzt, wird die Anweisung in den Aufruf dieser Methode übersetzt. Diese Überladung behandelt den Fall, dass der Rückgabewert des Funktionsobjekts, das den try[-catch]-Teil der try[-catch]-finally-Anweisung implementiert, bool ist.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Funktionsobjekts, das den try[-catch]-Teil der emulierten try[-catch]-finally‑Anweisung implementiert |
| F | Der Typ des Funktionsobjekts, das den finally‑Teil der emulierten try[-catch]-finally‑Anweisung implementiert |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tryBlock | T\&& | Das Funktionsobjekt, dessen Körper die Implementierung des try[-catch]-Teils der emulierten try[-catch]-finally‑Anweisung enthält |
| finallyBlock | F\&& | Das Funktionsobjekt, dessen Körper die Implementierung des finally‑Teils der emulierten try[-catch]-finally‑Anweisung enthält. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Die einzige Funktion, die das Verhalten der C#-try[-catch]-finally-Anweisung emuliert. Während der Übersetzung der C#-try[-catch]-finally-Anweisung mit der Übersetzeroption finally_statement_as_lambda auf true gesetzt, wird die Anweisung in den Aufruf dieser Methode übersetzt. Diese Überladung behandelt den Fall, dass der Rückgabewert des Funktionsobjekts, das den try[-catch]-Teil der try[-catch]-finally-Anweisung implementiert, bool& ist.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ des Funktionsobjekts, das den try[-catch]-Teil der emulierten try[-catch]-finally‑Anweisung implementiert |
| F | Der Typ des Funktionsobjekts, das den finally‑Teil der emulierten try[-catch]-finally‑Anweisung implementiert |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tryBlock | T\&& | Das Funktionsobjekt, dessen Körper die Implementierung des try[-catch]-Teils der emulierten try[-catch]-finally‑Anweisung enthält |
| finallyBlock | F\&& | Das Funktionsobjekt, dessen Körper die Implementierung des finally‑Teils der emulierten try[-catch]-finally‑Anweisung enthält. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
