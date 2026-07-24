---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait μέθοδος"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait μέθοδος. Διαμορφώνει έναν awaiter για αυτήν την εργασία σε C++."
type: docs
weight: 300
url: /el/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


Διαμορφώνει έναν awaiter για αυτό το task.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| continueOnCapturedContext | bool | αληθές για να προσπαθήσει να μεταφέρει τη συνέχιση πίσω στο αρχικό καταγεγραμμένο πλαίσιο· διαφορετικά, false. |

### ReturnValue

ConfiguredValueTaskAwaitable Ένα αντικείμενο που διαμορφώνει πώς συμπεριφέρονται οι awaiters για αυτήν την εργασία.

## Δείτε επίσης

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
