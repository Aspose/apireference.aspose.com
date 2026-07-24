---
title: "System::Threading naamruimte"
linktitle: "System::Threading"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System::Threading naamruimte in C++."
type: docs
weight: 6500
url: /nl/cpp/system.threading/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) om een wachtende thread te informeren die automatisch wordt gereset. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [CancellationToken](./cancellationtoken/) | Propagandeert een melding dat bewerkingen moeten worden geannuleerd. Deze klasse biedt een mechanisme voor coöperatieve annulering tussen threads, waardoor één thread de anderen kan informeren dat een bewerking moet worden geannuleerd. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Stelt een registratie voor een annuleringstoken‑callback voor. |
| [CancellationTokenSource](./cancellationtokensource/) | Een annuleringstoken‑bron die kan worden gebruikt om annuleringsmeldingen te activeren. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) die kan worden verzonden naar een wachtende thread. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [Interlocked](./interlocked/) | Biedt een API voor thread-veilige bewerkingen. Dit is een statisch type zonder instantie-services. Je mag onder geen enkele omstandigheid instanties ervan maken. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) om een wachtende thread te informeren die niet automatisch wordt gereset. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [Monitor](./monitor/) | Klasse [Monitor](./monitor/) biedt een mechanisme dat de toegang tot objecten synchroniseert. |
| [Mutex](./mutex/) | [Mutex](./mutex/) implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [SynchronizationContext](./synchronizationcontext/) | Biedt de basisfunctionaliteit voor het doorgeven van een synchronisatie-context over verschillende synchronisatie-bewerkingen. |
| [Thread](./thread/) | [Thread](./thread/) implementatie. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) pool-API die het mogelijk maakt taken in een wachtrij te plaatsen die door een pool van werkthreads worden gelezen. Dit is een statisch type zonder instantie-services. Je mag onder geen enkele omstandigheid instanties ervan maken. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) pool interne gegevens. Dit is een singleton-type waarbij geheugenbeheer wordt uitgevoerd via toegangs-functie(s). Je mag onder geen enkele omstandigheid direct instanties ervan maken. |
| [Timer](./timer/) | [Timer](./timer/) klasse die een taakitem in een aparte thread na een vertraging uitvoert. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
| [TimerQueue](./timerqueue/) | Wachtrij die [Timer](./timer/) objecten verwerkt. Dit is slechts een implementatie. [Timer](./timer/) objecten registreren zichzelf daar, je hoeft dit niet te doen om ze te gebruiken – gebruik in plaats daarvan de [Timer](./timer/) klasse-API. Dit is een singleton-type waarbij geheugenbeheer wordt uitgevoerd via toegangs-functie(s). Je mag onder geen enkele omstandigheid direct instanties ervan maken. |
| [WaitHandle](./waithandle/) | Wacht-primitive basisklasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven. |
## Enums

| Enum | Beschrijving |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Stelt de apartment-status van de thread in. |
| [EventResetMode](./eventresetmode/) | Geeft aan hoe de gebeurtenisstatus wordt gereset. |
| [ThreadState](./threadstate/) | Status van de thread. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | [Thread](./thread/) functie met één parameter. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | [Thread](./thread/) functie zonder parameters. |
| [TimerCallback](./timercallback/) | Callback-functie die door de timer wordt aangeroepen. |
| [wait_handle_t](./wait_handle_t/) | Handle-type. |
| [WaitCallback](./waitcallback/) | Callback-item dat wordt uitgevoerd zodra er een plek beschikbaar is. |
