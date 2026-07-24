---
title: "System::Net::WebRequest::HttpRequestCreator класс"
linktitle: "HttpRequestCreator"
second_title: "Aspose.Page для C++"
description: "System::Net::WebRequest::HttpRequestCreator класс. Создает экземпляры класса WebRequest. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведет к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 3900
url: /ru/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


Создает экземпляры класса WebRequest. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведет к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | Создает новый экземпляр класса WebRequest, используя указанный URI. |
## См. также

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
