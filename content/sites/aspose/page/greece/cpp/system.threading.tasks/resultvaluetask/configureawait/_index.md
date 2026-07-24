---
title: "System::Threading::Tasks::ResultValueTask::ConfigureAwait μέθοδος"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultValueTask::ConfigureAwait μέθοδος. Διαμορφώνει έναν awaiter για αυτήν την εργασία σε C++."
type: docs
weight: 300
url: /el/cpp/system.threading.tasks/resultvaluetask/configureawait/
---
## ResultValueTask::ConfigureAwait method


Διαμορφώνει έναν awaiter για αυτό το task.

```cpp
Runtime::CompilerServices::ConfiguredResultValueTaskAwaitable<T> System::Threading::Tasks::ResultValueTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| continueOnCapturedContext | bool | αληθές για να προσπαθήσει να μεταφέρει τη συνέχιση πίσω στο αρχικό καταγεγραμμένο πλαίσιο· διαφορετικά, false. |

### ReturnValue

ConfiguredResultValueTaskAwaitable<T> Ένα αντικείμενο που διαμορφώνει τον τρόπο με τον οποίο συμπεριφέρονται οι awaiters για αυτήν την εργασία.

## Δείτε επίσης

* Class [ConfiguredResultValueTaskAwaitable](../../../system.runtime.compilerservices/configuredresultvaluetaskawaitable/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
