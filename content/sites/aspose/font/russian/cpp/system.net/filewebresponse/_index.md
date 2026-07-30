---
title: "System::Net::FileWebResponse класс"
linktitle: "FileWebResponse"
second_title: "Aspose.Font для C++"
description: "System::Net::FileWebResponse класс. Предоставляет реализацию абстрактного класса WebResponse для работы с файловой системой. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1100
url: /ru/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Предоставляет реализацию абстрактного класса [WebResponse](../webresponse/) для работы с файловой системой. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Методы

| Метод | Описание |
| --- | --- |
| [Close](./close/)() override | Закрывает поток ответа. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Создаёт новый экземпляр. |
| [get_ContentLength](./get_contentlength/)() override | Информация RTTI. |
| [get_ContentType](./get_contenttype/)() override | Возвращает MIME‑тип ресурса. |
| [get_Headers](./get_headers/)() override | Возвращает коллекцию заголовков, связанных с текущим ответом. |
| [get_ResponseUri](./get_responseuri/)() override | Возвращает URI ресурса. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Возвращает значение, указывающее, поддерживает ли текущий ответ заголовки. |
| [GetResponseStream](./getresponsestream/)() override | Возвращает поток ответа. |
## См. также

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
