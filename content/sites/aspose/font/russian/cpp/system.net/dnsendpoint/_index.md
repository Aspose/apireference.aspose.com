---
title: "Класс System::Net::DnsEndPoint"
linktitle: "DnsEndPoint"
second_title: "Aspose.Font для C++"
description: "Класс System::Net::DnsEndPoint. Содержит информацию, используемую приложением для подключения к сервису. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 800
url: /ru/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Содержит информацию, используемую приложением для подключения к сервису. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Методы

| Метод | Описание |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Создаёт новый экземпляр. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Создаёт новый экземпляр. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Сравнивает объекты, используя семантику C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() override | Информация RTTI. |
| [get_Host](./get_host/)() | Информация RTTI. |
| [get_Port](./get_port/)() | Возвращает номер порта. |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../../system/object/gethashcode/). Позволяет хешировать пользовательские объекты. |
| [ToString](./tostring/)() const override | Аналог метода C# [Object.ToString()](../../system/object/tostring/). Позволяет преобразовывать пользовательские объекты в строку. |
## См. также

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
