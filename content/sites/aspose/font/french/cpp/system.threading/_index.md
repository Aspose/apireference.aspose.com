---
title: "Espace de noms System::Threading"
linktitle: "System::Threading"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser l'espace de noms System::Threading en C++."
type: docs
weight: 6900
url: /fr/cpp/system.threading/
---



## Classes

| Classe | Description |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) pour notifier le thread en attente qui se réinitialise automatiquement. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [CancellationToken](./cancellationtoken/) | Diffuse la notification que les opérations doivent être annulées. Cette classe fournit un mécanisme d'annulation coopérative entre threads, permettant à un thread de notifier les autres qu'une opération doit être annulée. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Représente un enregistrement pour le rappel d'un jeton d'annulation. |
| [CancellationTokenSource](./cancellationtokensource/) | Une source de jeton d'annulation qui peut être utilisée pour déclencher des notifications d'annulation. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) qui peut être envoyé au thread en attente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [Interlocked](./interlocked/) | Fournit une API pour les opérations thread-safe. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quels que soient les moyens. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) pour notifier le thread en attente qui ne se réinitialise pas automatiquement. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [Monitor](./monitor/) | La classe [Monitor](./monitor/) fournit un mécanisme qui synchronise l'accès aux objets. |
| [Mutex](./mutex/) | [Mutex](./mutex/) implémentation. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) implémentation. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [SynchronizationContext](./synchronizationcontext/) | Fournit la fonctionnalité de base pour propager un contexte de synchronisation à travers diverses opérations de synchronisation. |
| [Thread](./thread/) | [Thread](./thread/) implémentation. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) pool API permettant d'ajouter des travaux dans la file d'attente à être traités par un pool de threads travailleurs. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quels que soient les moyens. |
| [ThreadPoolImpl](./threadpoolimpl/) | Données internes du pool [Thread](./thread/). Il s'agit d'un type singleton dont la gestion de la mémoire est effectuée par les fonctions d'accès. Vous ne devez jamais créer d'instances de celui-ci directement. |
| [Timer](./timer/) | [Timer](./timer/) classe qui exécute une tâche dans un thread séparé après un délai. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [TimerQueue](./timerqueue/) | File d'attente qui gère les objets [Timer](./timer/). Il s'agit simplement d'une implémentation. Les objets [Timer](./timer/) s'y enregistrent eux-mêmes, vous n'avez pas besoin de le faire pour les utiliser - utilisez plutôt l'API de la classe [Timer](./timer/). Il s'agit d'un type singleton dont la gestion de la mémoire est effectuée par les fonctions d'accès. Vous ne devez jamais créer d'instances de celui-ci directement. |
| [WaitHandle](./waithandle/) | Classe de base primitive d'attente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
## Enums

| Énumération | Description |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Définit l'état d'appartement du thread. |
| [EventResetMode](./eventresetmode/) | Indique comment l'état de l'événement se réinitialise. |
| [ThreadState](./threadstate/) | État du thread. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | Fonction [Thread](./thread/) avec un seul paramètre. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | Fonction [Thread](./thread/) sans paramètres. |
| [TimerCallback](./timercallback/) | Fonction de rappel à appeler par le minuteur. |
| [wait_handle_t](./wait_handle_t/) | Type de handle. |
| [WaitCallback](./waitcallback/) | Élément de rappel à exécuter lorsqu'il y a une place. |
