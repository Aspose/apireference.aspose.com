---
title: "namespace System::Threading"
linktitle: "System::Threading"
second_title: "Aspose.Page per C++"
description: "Come utilizzare il namespace System::Threading in C++."
type: docs
weight: 6500
url: /it/cpp/system.threading/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) per notificare il thread in attesa che si resetta automaticamente. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [CancellationToken](./cancellationtoken/) | Propaga la notifica che le operazioni devono essere annullate. Questa classe fornisce un meccanismo per la cancellazione cooperativa tra thread, consentendo a un thread di notificare gli altri che un'operazione deve essere annullata. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Rappresenta una registrazione per una callback di token di cancellazione. |
| [CancellationTokenSource](./cancellationtokensource/) | Una sorgente di token di cancellazione che può essere utilizzata per attivare notifiche di cancellazione. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) che può essere inviato al thread in attesa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [Interlocked](./interlocked/) | Fornisce API per operazioni thread-safe. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) per notificare il thread in attesa che non si resetta automaticamente. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Monitor](./monitor/) | La classe [Monitor](./monitor/) fornisce un meccanismo che sincronizza l'accesso agli oggetti. |
| [Mutex](./mutex/) | [Mutex](./mutex/) implementazione. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) implementazione. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [SynchronizationContext](./synchronizationcontext/) | Fornisce la funzionalità di base per propagare un contesto di sincronizzazione attraverso varie operazioni di sincronizzazione. |
| [Thread](./thread/) | [Thread](./thread/) implementazione. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) pool API che consente di inserire lavori nella coda da leggere da un pool di thread worker. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) pool dati interni. Questo è un tipo singleton con gestione della memoria effettuata tramite funzione(i) di accesso. Non dovresti mai creare istanze di esso direttamente. |
| [Timer](./timer/) | [Timer](./timer/) classe che esegue un elemento di lavoro in un thread separato dopo un ritardo. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [TimerQueue](./timerqueue/) | Coda che gestisce gli oggetti [Timer](./timer/). Questa è solo un'implementazione. Gli oggetti [Timer](./timer/) si registrano lì autonomamente, non è necessario farlo per usarli – utilizza l'API della classe [Timer](./timer/) invece. Questo è un tipo singleton con gestione della memoria effettuata tramite funzione(i) di accesso. Non dovresti mai creare istanze di esso direttamente. |
| [WaitHandle](./waithandle/) | Classe base della primitiva di attesa. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Imposta lo stato di apartment del thread. |
| [EventResetMode](./eventresetmode/) | Indica come lo stato dell'evento viene resettato. |
| [ThreadState](./threadstate/) | Stato del thread. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | Funzione [Thread](./thread/) con un singolo parametro. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | Funzione [Thread](./thread/) senza parametri. |
| [TimerCallback](./timercallback/) | Funzione di callback da chiamare dal timer. |
| [wait_handle_t](./wait_handle_t/) | Tipo handle. |
| [WaitCallback](./waitcallback/) | Elemento di callback da eseguire non appena c'è uno slot disponibile. |
