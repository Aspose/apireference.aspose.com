---
title: "Classe System::Threading::Thread"
linktitle: "Thread"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::Thread. Implémentation du thread. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Abort](./abort/)() | Interrompt le thread. Non implémenté. |
| [get_CurrentCulture](./get_currentculture/)() | Obtient la culture du thread. |
| static [get_CurrentThread](./get_currentthread/)() | Obtient l'objet qui décrit le thread actuel. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Obtient la culture de l'interface utilisateur utilisée par le thread. |
| [get_IsAlive](./get_isalive/)() | Vérifie si le thread est actif. |
| [get_IsBackground](./get_isbackground/)() | Vérifie si le thread est en arrière-plan. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Vérifie si le thread appartient à un pool de threads. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Obtient l'identifiant du thread. Il peut être récupéré auprès du système d'exploitation, mais si l'identifiant du thread OS dépasse les limites d'un int, les identifiants des threads peuvent se chevaucher. |
| [get_Name](./get_name/)() | Obtient le nom du thread. |
| [get_ThreadState](./get_threadstate/)() | Obtient l'état du thread. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Obtient l'identifiant du thread actuel. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Interrompt le thread. Non implémenté. |
| [Join](./join/)() | Joint le thread géré. Effectue une attente illimitée si nécessaire. |
| [Join](./join/)(int) | Joint le thread géré. Effectue une attente limitée. |
| [Join](./join/)(TimeSpan) | Joint le thread géré. Effectue une attente limitée. |
| static [MemoryBarrier](./memorybarrier/)() | Synchronise l'accès à la mémoire. |
| [operator=](./operator=/)(const Thread\&) | Copie les données TLS d'un autre thread. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Définit la culture du thread. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Définit la culture de l'interface utilisateur utilisée par le thread. |
| [set_IsBackground](./set_isbackground/)(bool) | Définit le thread comme arrière-plan ou premier plan. |
| [set_Name](./set_name/)(const System::String\&) | Définit le nom du thread. |
| static [Sleep](./sleep/)(int) | Arrête le thread actuel pendant le délai spécifié. |
| static [Sleep](./sleep/)(TimeSpan) | Arrête le thread actuel pendant le délai spécifié. |
| static [SpinWait](./spinwait/)(int) | Attend un nombre spécifique d'itérations de boucle. |
| [Start](./start/)() | Démarre le thread en utilisant un objet d'argument nul. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Démarre le thread. |
| [Thread](./thread/)() | Constructeur. |
| [Thread](./thread/)(ThreadStart) | Constructeur. |
| [Thread](./thread/)(ParameterizedThreadStart) | Constructeur. |
| [Thread](./thread/)(Thread\&) | Constructeur de copie. |
| static [Yield](./yield/)() | Génère un thread. |
| virtual [~Thread](./~thread/)() | Destructeur. |
## Remarques



```cpp
#include "system/threading/thread.h"
#include "system/smart_ptr.h"

int main()
{
  auto thread = System::MakeObject<System::Threading::Thread>([]()
  {
    std::cout << "Child thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;
    System::Threading::Thread::Sleep(200);
  });

  std::cout << "Main thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;

  thread->Start();
  thread->Join();

  return 0;
}
/*
This code example produces the following output:
Main thread ID: 2
Child thread ID: 1
*/
```

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
