---
title: "Méthode System::Threading::WaitHandle::WaitAll"
linktitle: "AttendreTous"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::WaitHandle::WaitAll. Attend que toutes les poignées se déclenchent en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Attend que tous les handles se déclenchent.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
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
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Informations RTTI.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Poignées à attendre. |
| millisecondsTimeout | int | [Timeout](../../timeout/) à attendre, en millisecondes ; -1 signifie attente infinie, 0 signifie vérification‑et‑retour, les valeurs positives sont des délais d’attente. |

### ReturnValue

Vrai si toutes les poignées se sont déclenchées, faux si le délai d’attente est dépassé.
## Remarques


Attend que tous les handles se déclenchent.
## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Attend que tous les handles se déclenchent.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Poignées à attendre. |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) qui représente le nombre de millisecondes à attendre, ou un [System::TimeSpan](../../../system/timespan/) qui représente -1 millisecondes pour attendre indéfiniment. |

### ReturnValue

Vrai si toutes les poignées se sont déclenchées, faux si le délai d’attente est dépassé.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
