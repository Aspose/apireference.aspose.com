---
title: "System::Net::Http::HttpMessageHandler класс"
linktitle: "HttpMessageHandler"
second_title: "Aspose.Font для C++"
description: "Класс System::Net::Http::HttpMessageHandler. Представляет базовый тип для обработчиков HTTP‑сообщений. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 500
url: /ru/cpp/system.net.http/httpmessagehandler/
---
## HttpMessageHandler class


Представляет базовый тип для обработчиков HTTP‑сообщений. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class HttpMessageHandler : public System::IDisposable
```

## Методы

| Метод | Описание |
| --- | --- |
| [Dispose](./dispose/)() override | Ничего не делает. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Информация RTTI. |
## См. также

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
