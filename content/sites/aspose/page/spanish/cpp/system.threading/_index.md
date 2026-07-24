---
title: "Espacio de nombres System::Threading"
linktitle: "System::Threading"
second_title: "Aspose.Page para C++"
description: "Cómo usar el espacio de nombres System::Threading en C++."
type: docs
weight: 6500
url: /es/cpp/system.threading/
---



## Clases

| Clase | Descripción |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) para notificar al hilo en espera que se restablece automáticamente. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../system/makeobject/) . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [CancellationToken](./cancellationtoken/) | Propaga la notificación de que las operaciones deben cancelarse. Esta clase proporciona un mecanismo de cancelación cooperativa entre hilos, permitiendo que un hilo notifique a los demás que una operación debe cancelarse. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Representa un registro para una devolución de llamada de token de cancelación. |
| [CancellationTokenSource](./cancellationtokensource/) | Una fuente de token de cancelación que puede usarse para activar notificaciones de cancelación. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) que puede enviarse a un hilo en espera. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../system/makeobject/) . Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [Interlocked](./interlocked/) | Proporciona una API para operaciones seguras en hilos. Este es un tipo estático sin servicios de instancia. Nunca debe crear instancias de él por ningún medio. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) para notificar al hilo en espera que no se restablece automáticamente. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [Monitor](./monitor/) | La clase [Monitor](./monitor/) proporciona un mecanismo que sincroniza el acceso a los objetos. |
| [Mutex](./mutex/) | [Mutex](./mutex/) implementación. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) implementación. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [SynchronizationContext](./synchronizationcontext/) | Proporciona la funcionalidad básica para propagar un contexto de sincronización a través de varias operaciones de sincronización. |
| [Thread](./thread/) | [Thread](./thread/) implementación. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [ThreadPool](./threadpool/) | API del pool de [Thread](./thread/) que permite insertar trabajos en la cola para ser leídos por un conjunto de hilos de trabajo. Este es un tipo estático sin servicios de instancia. Nunca debe crear instancias de él por ningún medio. |
| [ThreadPoolImpl](./threadpoolimpl/) | Datos internos del pool de [Thread](./thread/). Este es un tipo singleton con la gestión de memoria realizada mediante función(es) de acceso. Nunca debe crear instancias de él directamente. |
| [Timer](./timer/) | Clase [Timer](./timer/) que ejecuta una tarea en un hilo separado después de un retraso. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [TimerQueue](./timerqueue/) | Cola que maneja objetos [Timer](./timer/). Esto es solo una implementación. Los objetos [Timer](./timer/) se registran allí por sí mismos, no es necesario hacerlo para utilizarlos; use la API de la clase [Timer](./timer/) en su lugar. Este es un tipo singleton con la gestión de memoria realizada mediante función(es) de acceso. Nunca debe crear instancias de él directamente. |
| [WaitHandle](./waithandle/) | Clase base de primitiva de espera. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que resultará en errores de tiempo de ejecución y/o fallas de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
## Enums

| Enumeración | Descripción |
| --- | --- |
| [ApartmentState](./apartmentstate/) | Establece el estado de apartamento del hilo. |
| [EventResetMode](./eventresetmode/) | Indica cómo se restablece el estado del evento. |
| [ThreadState](./threadstate/) | Estado del hilo. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | Función [Thread](./thread/) con un solo parámetro. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | Función [Thread](./thread/) sin parámetros. |
| [TimerCallback](./timercallback/) | Función de devolución de llamada que será invocada por el temporizador. |
| [wait_handle_t](./wait_handle_t/) | Tipo de manejador. |
| [WaitCallback](./waitcallback/) | Elemento de devolución de llamada que se ejecutará una vez haya un espacio. |
