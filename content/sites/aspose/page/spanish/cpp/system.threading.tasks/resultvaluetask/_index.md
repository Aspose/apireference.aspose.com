---
title: "System::Threading::Tasks::ResultValueTask clase"
linktitle: "ResultValueTask"
second_title: "Aspose.Page para C++"
description: "System::Threading::Tasks::ResultValueTask clase. Representa un tipo híbrido similar a una tarea que puede envolver ya sea un valor de resultado directo o un ResultTask<T> en C++."
type: docs
weight: 200
url: /es/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


Representa un tipo híbrido similar a una tarea que puede envolver ya sea un valor de resultado directo o un [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo del resultado producido por la tarea. |
## Métodos

| Método | Descripción |
| --- | --- |
| [AsTask](./astask/)() const | Convierte este [ResultValueTask](./) a un puntero compartido a [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configura un awaiter para esta tarea. |
| [Equals](./equals/)(ResultValueTask) override | Determina si esta instancia es igual a otra instancia de [ResultValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina si esta instancia es igual a otro objeto. |
| [get_IsCanceled](./get_iscanceled/)() const | Obtiene un valor que indica si la tarea se completó debido a una cancelación. |
| [get_IsCompleted](./get_iscompleted/)() const | Obtiene un valor que indica si la tarea ha finalizado. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Obtiene un valor que indica si la tarea se completó con éxito. |
| [get_IsFaulted](./get_isfaulted/)() const | Obtiene un valor que indica si la tarea se completó debido a una excepción no controlada. |
| [get_Result](./get_result/)() const | Obtiene el resultado de la tarea completada. |
| [GetAwaiter](./getawaiter/)() const | Obtiene un awaiter para esta tarea para soportar expresiones await. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | Operador de desigualdad para [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | Operador de igualdad para [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | Construye un [ResultValueTask](./) vacío y sin inicializar. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | Construye un [ResultValueTask](./) completado con el resultado especificado. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | Construye un [ResultValueTask](./) a partir de un puntero compartido a un [ResultTask<T>](../resulttask/). |
## Observaciones


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## Ver también

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
