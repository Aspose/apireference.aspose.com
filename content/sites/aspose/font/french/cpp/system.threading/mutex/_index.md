---
title: "System::Threading::Mutex classe"
linktitle: "Mutex"
second_title: "Aspose.Font pour C++"
description: "System::Threading::Mutex class. Implémentation du mutex. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Mutex](./mutex/)() | Informations RTTI. |
| [Mutex](./mutex/)(bool) | Constructeur. |
| [Mutex](./mutex/)(bool, const String\&) | Constructeur. |
| [ReleaseMutex](./releasemutex/)() | Libère le mutex. |
| static [Remove](./remove/)(const String\&) | Efface un mutex nommé du système. |
| virtual [Reset](./reset/)() | Réinitialise l'état du mutex. Non implémenté. |
| virtual [Set](./set/)() | Met le mutex en état signalé. Non implémenté. |
| [WaitOne](./waitone/)() override | Verrouille le mutex. Effectue une attente illimitée si nécessaire. |
| [WaitOne](./waitone/)(int) override | Verrouille le mutex. Effectue une attente si nécessaire. |
| [WaitOne](./waitone/)(TimeSpan) override | Verrouille le mutex. Effectue une attente si nécessaire. |
## Champs

| Champ | Description |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valeur spéciale à renvoyer par la fonction, sinon renvoie l’indice de l’objet signalé dans le tableau, si le délai d’attente dépasse et qu’aucun signal n’est reçu. |
## Remarques



```cpp
#include "system/threading/mutex.h"
#include "system/threading/thread.h"
#include "system/console.h"
#include "system/convert.h"
#include "system/smart_ptr.h"
#include "system/string.h"

int main()
{
  auto mutex = System::MakeObject<System::Threading::Mutex>();

  System::String str;

  const int THREADS_COUNT = 3;
  std::vector<System::SharedPtr<System::Threading::Thread>> threads;
  threads.reserve(THREADS_COUNT);

  for (auto i = 0; i < THREADS_COUNT; ++i)
  {
    threads.push_back(System::MakeObject<System::Threading::Thread>([&mutex, &str]()
    {
      mutex->WaitOne();

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" started." + System::Environment::get_NewLine();

      System::Threading::Thread::Sleep(200);

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" ended." + System::Environment::get_NewLine();

      mutex->ReleaseMutex();
    }));

    threads[i]->Start();
  }

  System::Threading::Thread::Sleep(700);

  System::Console::WriteLine(str);

  return 0;
}
/*
This code example produces the following output:
Thread 1 started.
Thread 1 ended.
Thread 2 started.
Thread 2 ended.
Thread 3 started.
Thread 3 ended.
*/
```

## Voir aussi

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
