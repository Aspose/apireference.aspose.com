---
title: "Класс Aspose::Page::Plugins::IOperationResult"
linktitle: "IOperationResult"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::Plugins::IOperationResult. Общий интерфейс результата операции, определяющий общие методы, которые конкретный результат операции плагина должен реализовать в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Общий интерфейс результата операции, определяющий общие методы, которые конкретный результат операции плагина должен реализовать.

```cpp
class IOperationResult : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_Data](./get_data/)() | Получает необработанные данные. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Указывает, является ли результат массивом байтов. |
| virtual [get_IsFile](./get_isfile/)() | Указывает, является ли результат путем к выходному файлу. |
| virtual [get_IsStream](./get_isstream/)() | Указывает, является ли результат выходным потоком. |
| virtual [get_IsString](./get_isstring/)() | Указывает, является ли результат текстовой строкой. |
| virtual [ToFile](./tofile/)() | Пытается преобразовать результат в файл. |
| virtual [ToStream](./tostream/)() | Пытается преобразовать результат в объект потока. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
