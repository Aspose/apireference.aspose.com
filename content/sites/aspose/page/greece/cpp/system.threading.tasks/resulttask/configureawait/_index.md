---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait μέθοδος"
linktitle: "ConfigureAwait"
second_title: "Aspose.Page για C++"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait μέθοδος. Διαμορφώνει πώς οι αναμονές σε αυτήν την εργασία αποτελέσματος πρέπει να συμπεριφέρονται σχετικά με τη σύλληψη του πλαισίου σε C++."
type: docs
weight: 200
url: /el/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


Ρυθμίζει πώς οι αναμονές σε αυτό το task αποτελέσματος πρέπει να συμπεριφέρονται σχετικά με τη σύλληψη του πλαισίου.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| continueOnCapturedContext | bool | Εάν θα συνεχιστεί στο καταληφθέν πλαίσιο |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## Παρατηρήσεις



Αυτό επιτρέπει λεπτομερή έλεγχο της ροής του πλαισίου για τα πρότυπα async/await

## Δείτε επίσης

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
