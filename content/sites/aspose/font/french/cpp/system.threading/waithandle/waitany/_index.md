---
title: "Méthode System::Threading::WaitHandle::WaitAny"
linktitle: "AttendreN'importeLequel"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::WaitHandle::WaitAny. Attend que l’une des poignées se déclenche en C++."
type: docs
weight: 200
url: /fr/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Attend que l'un des handles se déclenche.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Poignées à attendre. |

### ReturnValue

Vrai lorsque chaque élément de waitHandles a reçu un signal ; sinon la méthode ne retourne jamais.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Attend que l'un des handles se déclenche.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Poignées à attendre. |
| millisecondsTimeout | int | [Timeout](../../timeout/) à attendre, en millisecondes ; -1 signifie attente infinie, 0 signifie vérification‑et‑retour, les valeurs positives sont des délais d’attente. |

### ReturnValue

Vrai si une poignée s’est déclenchée, faux si le délai d’attente est dépassé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Attend que l'un des handles se déclenche.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Poignées à attendre. |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) qui représente le nombre de millisecondes à attendre, ou un [System::TimeSpan](../../../system/timespan/) qui représente -1 millisecondes pour attendre indéfiniment. |

### ReturnValue

Vrai si une poignée s’est déclenchée, faux si le délai d’attente est dépassé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
