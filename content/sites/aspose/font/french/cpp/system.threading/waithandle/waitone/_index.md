---
title: "Méthode System::Threading::WaitHandle::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::WaitHandle::WaitOne. Attend que la poignée se déclenche pendant une période illimitée en C++."
type: docs
weight: 600
url: /fr/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Attend que le handle se déclenche pendant une période illimitée.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Retourne toujours vrai car aucun délai d’attente ne se produit.

## Voir aussi

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int) method


Attend que le handle se déclenche.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) à attendre, en millisecondes ; -1 signifie attente infinie, 0 signifie vérification‑et‑retour, les valeurs positives sont des délais d’attente. |

### ReturnValue

Vrai si la poignée s’est déclenchée, faux si le délai d’attente est dépassé.

## Voir aussi

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Attend que le handle se déclenche.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) à attendre, en millisecondes ; -1 signifie attente infinie, 0 signifie vérification‑et‑retour, les valeurs positives sont des délais d’attente. |
| exitContext | bool | Si vrai, l’attente doit libérer le verrou sur la poignée avant d’attendre celle‑ci. |

### ReturnValue

Vrai si la poignée s’est déclenchée, faux si le délai d’attente est dépassé.

## Voir aussi

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Attend que le handle se déclenche.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) qui représente le nombre de millisecondes à attendre, ou un [System::TimeSpan](../../../system/timespan/) qui représente -1 millisecondes pour attendre indéfiniment. |

### ReturnValue

Vrai si la poignée s’est déclenchée, faux si le délai d’attente est dépassé.

## Voir aussi

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
