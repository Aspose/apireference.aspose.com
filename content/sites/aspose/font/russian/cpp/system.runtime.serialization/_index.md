---
title: "Пространство имён System::Runtime::Serialization"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Font для C++"
description: "Как использовать пространство имён System::Runtime::Serialization в C++."
type: docs
weight: 5700
url: /ru/cpp/system.runtime.serialization/
---



## Классы

| Класс | Описание |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Представляет базовую реализацию интерфейса [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | Обеспечивает связь между экземпляром [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) и классом, предоставляемым форматтером, наиболее подходящим для разбора данных внутри [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | Интерфейс объекта, который может быть сериализован. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента. |
| [SerializationInfo](./serializationinfo/) | Содержит набор именованных полей, представляющих сериализованный объект. Не реализовано. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента. |
| [StreamingContext](./streamingcontext/) | Фиктивный класс для обеспечения компиляции переводимых классов, использующих StreamingContext. Не управляйте экземплярами этого класса с помощью [SmartPtr](../system/smartptr/), они должны выделяться только в стеке. |
