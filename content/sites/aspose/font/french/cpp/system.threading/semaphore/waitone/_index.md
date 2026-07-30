---
title: "Méthode System::Threading::Semaphore::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::Semaphore::WaitOne. Verrouille le sémaphore. Effectue une attente illimitée si nécessaire en C++."
type: docs
weight: 500
url: /fr/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


Verrouille le sémaphore. Effectue une attente illimitée si nécessaire.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

Renvoie toujours true car il ne retourne pas tant que le sémaphore n'est pas verrouillé.

## Voir aussi

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Semaphore::WaitOne(int) method


Verrouille le sémaphore. Effectue une attente si nécessaire.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsTimeout | int | Délai d'attente en millisecondes. |

### ReturnValue

Renvoie true si le sémaphore a été verrouillé ou false si le délai d'attente est dépassé.

## Voir aussi

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
