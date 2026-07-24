---
title: "Класс System::Threading::Tasks::ResultTask"
linktitle: "ResultTask"
second_title: "Aspose.Page для C++"
description: "Класс System::Threading::Tasks::ResultTask. Специализация Task, которая возвращает значение результата после завершения в C++."
type: docs
weight: 100
url: /ru/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Специализация [Task](../task/), которая возвращает значение результата после завершения.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Параметр | Описание |
| --- | --- |
| T | Тип значения результата, возвращаемого задачей |
## Методы

| Метод | Описание |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Настраивает, как ожидания на этой задаче результата должны вести себя относительно захвата контекста. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Создаёт продолжение, которое выполняется, когда задача результата завершается. |
| [get_Result](./get_result/)() const | Получает результат асинхронной операции. |
| [GetAwaiter](./getawaiter/)() const | Получает awaiter для этой задачи результата для использования с Await. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Создаёт [ResultTask](./) с функцией, возвращающей значение. |
| [ResultTask](./resulttask/)() | Внутренняя реализация. Не предназначено для пользовательского кода. |
| [ResultTask](./resulttask/)(const T\&) | Внутренний конструктор для создания задач результата с указанным результатом. |
| [set_Result](./set_result/)(const T\&) | Устанавливает значение результата для задачи. |
## Примечания



Представляет асинхронную операцию, которая производит результат, аналогично [System.Threading.Tasks.Task<TResult>](../task/) в .NET.
## См. также

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
