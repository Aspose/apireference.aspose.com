---
title: "classe System::Threading::Thread"
linktitle: "Thread"
second_title: "Aspose.Font per C++"
description: "Classe System::Threading::Thread. Implementazione del thread. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Abort](./abort/)() | Interrompe il thread. Non implementato. |
| [get_CurrentCulture](./get_currentculture/)() | Ottiene la cultura del thread. |
| static [get_CurrentThread](./get_currentthread/)() | Ottiene l'oggetto che descrive il thread corrente. |
| [get_CurrentUICulture](./get_currentuiculture/)() | Ottiene la cultura dell'interfaccia utente usata dal thread. |
| [get_IsAlive](./get_isalive/)() | Verifica se il thread è attivo. |
| [get_IsBackground](./get_isbackground/)() | Verifica se il thread è in background. |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | Verifica se il thread è posseduto da un pool di thread. |
| [get_ManagedThreadId](./get_managedthreadid/)() const | Ottiene l'identificatore del thread. Può essere ottenuto dal sistema operativo, ma se l'identificatore del thread del SO supera i limiti di int, gli ID dei thread possono sovrapporsi. |
| [get_Name](./get_name/)() | Ottiene il nome del thread. |
| [get_ThreadState](./get_threadstate/)() | Ottiene lo stato del thread. |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | Ottiene l'identificatore del thread corrente. |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | Interrompe il thread. Non implementato. |
| [Join](./join/)() | Unisce il thread gestito. Esegue un'attesa illimitata se necessario. |
| [Join](./join/)(int) | Unisce il thread gestito. Esegue un'attesa limitata. |
| [Join](./join/)(TimeSpan) | Unisce il thread gestito. Esegue un'attesa limitata. |
| static [MemoryBarrier](./memorybarrier/)() | Sincronizza l'accesso alla memoria. |
| [operator=](./operator=/)(const Thread\&) | Copia i dati TLS da un thread diverso. |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Imposta la cultura del thread. |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | Imposta la cultura dell'interfaccia utente usata dal thread. |
| [set_IsBackground](./set_isbackground/)(bool) | Imposta il thread in background o in primo piano. |
| [set_Name](./set_name/)(const System::String\&) | Imposta il nome del thread. |
| static [Sleep](./sleep/)(int) | Ferma il thread corrente per il timeout specificato. |
| static [Sleep](./sleep/)(TimeSpan) | Ferma il thread corrente per il timeout specificato. |
| static [SpinWait](./spinwait/)(int) | Attende un numero specifico di iterazioni del ciclo. |
| [Start](./start/)() | Avvia il thread usando un oggetto argomento nullo. |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | Avvia il thread. |
| [Thread](./thread/)() | Costruttore. |
| [Thread](./thread/)(ThreadStart) | Costruttore. |
| [Thread](./thread/)(ParameterizedThreadStart) | Costruttore. |
| [Thread](./thread/)(Thread\&) | Costruttore di copia. |
| static [Yield](./yield/)() | Restituisce thread. |
| virtual [~Thread](./~thread/)() | Distruttore. |
## Osservazioni



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

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
