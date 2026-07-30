---
title: "Метод System::Threading::Tasks::ResultValueTask::operator=="
linktitle: "operator=="
second_title: "Aspose.Font для C++"
description: "Метод System::Threading::Tasks::ResultValueTask::operator==. Оператор равенства для ResultValueTask в C++."
type: docs
weight: 1200
url: /ru/cpp/system.threading.tasks/resultvaluetask/operator==/
---
## ResultValueTask::operator== method


Оператор равенства для [ResultValueTask](../).

```cpp
bool System::Threading::Tasks::ResultValueTask<T>::operator==(const ResultValueTask &other) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const ResultValueTask\& | Другой [ResultValueTask](../) для сравнения с этим экземпляром. |

### ReturnValue

bool True если обе задачи имеют одинаковое значение результата или ссылаются на одну и ту же базовую задачу; иначе false.
## Примечания



Если любой из экземпляров содержит прямое значение результата, сравнивает результаты напрямую. В противном случае сравнивает указатели на базовую задачу.
## См. также

* Class [ResultValueTask](../)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
