---
title: "Clase System::Threading::Tasks::ResultTask"
linktitle: "ResultTask"
second_title: "Aspose.Page para C++"
description: "Clase System::Threading::Tasks::ResultTask. Una especialización de Task que devuelve un valor de resultado al completarse en C++."
type: docs
weight: 100
url: /es/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Una especialización de [Task](../task/) que devuelve un valor de resultado al completarse.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo del valor de resultado devuelto por la tarea |
## Métodos

| Método | Descripción |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Configura cómo deben comportarse los await en esta tarea de resultado respecto a la captura de contexto. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Crea una continuación que se ejecuta cuando la tarea de resultado se completa. |
| [get_Result](./get_result/)() const | Obtiene el resultado de la operación asíncrona. |
| [GetAwaiter](./getawaiter/)() const | Obtiene un awaiter para esta tarea de resultado para usar con Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Construye un [ResultTask](./) con una función que devuelve un valor. |
| [ResultTask](./resulttask/)() | Implementación interna. No para código de usuario. |
| [ResultTask](./resulttask/)(const T\&) | Constructor interno para crear tareas de resultado con un resultado especificado. |
| [set_Result](./set_result/)(const T\&) | Establece el valor de resultado para la tarea. |
## Observaciones



Representa una operación asíncrona que produce un resultado, similar a [System.Threading.Tasks.Task<TResult>](../task/) en .NET.
## Ver también

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
