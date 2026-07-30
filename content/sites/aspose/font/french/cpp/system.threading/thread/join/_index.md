---
title: "System::Threading::Thread::Join méthode"
linktitle: "Join"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Thread::Join méthode. Joint le thread géré. Effectue une attente illimitée si nécessaire en C++."
type: docs
weight: 1400
url: /fr/cpp/system.threading/thread/join/
---
## Thread::Join() method


Joint le thread géré. Effectue une attente illimitée si nécessaire.

```cpp
void System::Threading::Thread::Join()
```

## Voir aussi

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


Joint le thread géré. Effectue une attente limitée.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsTimeout | int | Délai d'attente en millisecondes. |

### ReturnValue

Vrai si le thread a été joint avec succès, faux si le délai d'attente est dépassé.

## Voir aussi

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


Joint le thread géré. Effectue une attente limitée.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| timeout | TimeSpan | Un [TimeSpan](../../../system/timespan/) défini sur la durée d'attente pour que le thread se termine. |

### ReturnValue

Vrai si le thread a été joint avec succès, faux si le délai d'attente est dépassé.

## Voir aussi

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
