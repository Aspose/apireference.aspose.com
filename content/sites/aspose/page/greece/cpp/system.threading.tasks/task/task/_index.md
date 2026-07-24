---
title: "Κατασκευαστής System::Threading::Tasks::Task::Task"
linktitle: "Task"
second_title: "Aspose.Page για C++"
description: "Κατασκευαστής System::Threading::Tasks::Task::Task. Εσωτερικός κατασκευαστής για δημιουργία μη αρχικοποιημένων εργασιών σε C++."
type: docs
weight: 100
url: /el/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Εσωτερικός κατασκευαστής για δημιουργία μη αρχικοποιημένων εργασιών.

```cpp
System::Threading::Tasks::Task::Task()
```

## Δείτε επίσης

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Δημιουργεί ένα [Task](../) με μια ενέργεια με κατάσταση και αντικείμενο κατάστασης.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | Η ενέργεια προς εκτέλεση (δέχεται αντικείμενο κατάστασης) |
| state | const SharedPtr\<Object\>\& | Αντικείμενο κατάστασης ορισμένο από τον χρήστη που περνιέται στην ενέργεια |

## Δείτε επίσης

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Δημιουργεί ένα [Task](../) με ενέργεια με κατάσταση, κατάσταση και διακριτικό ακύρωσης.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | Η ενέργεια προς εκτέλεση (δέχεται αντικείμενο κατάστασης) |
| state | const SharedPtr\<Object\>\& | Αντικείμενο κατάστασης ορισμένο από τον χρήστη που περνιέται στην ενέργεια |
| cancellationToken | const CancellationToken\& | Διακριτικό για παρακολούθηση αιτημάτων ακύρωσης |

## Δείτε επίσης

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


Δημιουργεί ένα [Task](../) με μια ενέργεια προς εκτέλεση.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| action | const Action<>\& | Η ενέργεια προς εκτέλεση ασύγχρονα |

## Δείτε επίσης

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Δημιουργεί ένα [Task](../) με μια ενέργεια και διακριτικό ακύρωσης.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| action | const Action<>\& | Η ενέργεια προς εκτέλεση ασύγχρονα |
| cancellationToken | const CancellationToken\& | Διακριτικό για παρακολούθηση αιτημάτων ακύρωσης |

## Δείτε επίσης

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
