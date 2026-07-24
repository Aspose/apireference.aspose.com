---
title: "Класс System::ReadOnlySpan"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page для C++"
description: "Класс System::ReadOnlySpan. Forward для использования внутри класса Span в C++."
type: docs
weight: 5300
url: /ru/cpp/system/readonlyspan/
---
## ReadOnlySpan class


Forward для использования внутри класса [Span](../span/).

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов в span. Этот класс предоставляет типобезопасный способ работы с непрерывными последовательностями объектов в режиме только для чтения. Его можно использовать для обёртывания массивов, стековых массивов или сырых указателей с сохранением проверки границ. [ReadOnlySpan](./) не владеет памятью, на которую указывает — это лишь представление существующей памяти. |
## Методы

| Метод | Описание |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | Создаёт только‑для‑чтения span из обычного span. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | Преобразует массив в [ReadOnlySpan](./). |
## Примечания


Представляет только‑для‑чтения непрерывный регион произвольной памяти.

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
