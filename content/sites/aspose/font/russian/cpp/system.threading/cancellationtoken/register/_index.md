---
title: "System::Threading::CancellationToken::Register метод"
linktitle: "Регистрация"
second_title: "Aspose.Font для C++"
description: "System::Threading::CancellationToken::Register метод. Регистрирует обратный вызов, который будет выполнен, когда будет запрошена отмена в C++."
type: docs
weight: 400
url: /ru/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Регистрирует обратный вызов, который будет выполнен при запросе отмены.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| callback | const Action<>\& | Объект [Action<>](../../../system/action/) будет выполнен при запросе отмены. |

### ReturnValue

Объект [CancellationTokenRegistration](../../cancellationtokenregistration/) который можно использовать для отмены регистрации обратного вызова.
## Примечания



Если отмена уже была запрошена, обратный вызов будет выполнен немедленно.

## См. также

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
