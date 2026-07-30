---
title: "Méthode System::Threading::Mutex::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::Mutex::WaitOne. Verrouille le mutex. Effectue une attente illimitée si nécessaire en C++."
type: docs
weight: 500
url: /fr/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Verrouille le mutex. Effectue une attente illimitée si nécessaire.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Renvoie toujours true car il ne retourne pas tant que le mutex n'est pas verrouillé.

## Voir aussi

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


Verrouille le mutex. Effectue une attente si nécessaire.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsTimeout | int | Délai d'attente en millisecondes. |

### ReturnValue

Renvoie true si le mutex a été verrouillé ou false si le délai d'attente est dépassé.

## Voir aussi

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Verrouille le mutex. Effectue une attente si nécessaire.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) qui représente le nombre de millisecondes à attendre, ou un [System::TimeSpan](../../../system/timespan/) qui représente -1 millisecondes pour attendre indéfiniment. |

### ReturnValue

Renvoie true si le mutex a été verrouillé ou false si le délai d'attente est dépassé.

## Voir aussi

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
