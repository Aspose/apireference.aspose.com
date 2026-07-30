---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Font для C++"
description: "System::IO::MemoryStream class. Представляет поток, который читает из памяти и записывает в неё. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1800
url: /ru/cpp/system.io/memorystream/
---
## MemoryStream class


Представляет поток, который читает из памяти и записывает в неё. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class MemoryStream : public System::IO::Stream
```

## Методы

| Метод | Описание |
| --- | --- |
| [Close](./close/)() override | Закрывает поток. |
| [Flush](./flush/)() override | Ничего не делает. |
| [get_CanRead](./get_canread/)() const override | Определяет, читаем ли поток. |
| [get_CanSeek](./get_canseek/)() const override | Определяет, поддерживает ли поток перемещение. |
| [get_CanWrite](./get_canwrite/)() const override | Определяет, доступен ли поток для записи. |
| [get_Capacity](./get_capacity/)() | Возвращает текущую ёмкость базового буфера памяти. |
| [get_Length](./get_length/)() const override | Возвращает длину потока в байтах. |
| [get_Position](./get_position/)() const override | Возвращает текущую позицию потока. |
| virtual [GetBuffer](./getbuffer/)() | Возвращает указатель на внутренний буфер. |
| [MemoryStream](./memorystream/)() | Создаёт новый экземпляр класса [MemoryStream](./) с начальной ёмкостью, равной 0. |
| [MemoryStream](./memorystream/)(int) | Создаёт новый экземпляр класса [MemoryStream](./), представляющий поток, основанный на буфере памяти указанного размера. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Создаёт новый экземпляр класса [MemoryStream](./), представляющий поток памяти, подключённый к указанному буферу памяти. Параметр указывает, является ли поток доступным для записи. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Создает новый экземпляр класса [MemoryStream](./), представляющий поток памяти, соединенный с сегментом указанного буфера памяти, начиная с указанного индекса и включающий указанное количество элементов. Параметры указывают, может ли поток быть записываемым и может ли вызываться метод GetBytes(). |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Считывает указанное количество байтов из потока и записывает их в указанный массив байтов. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Считывает указанное количество байтов из потока и записывает их в указанный массив байтов. |
| [ReadByte](./readbyte/)() override | Читает один байт из потока и возвращает 32-битное целое значение, эквивалентное значению прочитанного байта. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Устанавливает позицию потока, представленного текущим объектом. |
| [set_Capacity](./set_capacity/)(int) | Устанавливает емкость базового буфера памяти. |
| [set_Position](./set_position/)(int64_t) override | Устанавливает позицию потока. |
| [SetLength](./setlength/)(int64_t) override | Устанавливает длину потока, представленного текущим объектом. |
| virtual [ToArray](./toarray/)() | Возвращает копию базового буфера памяти в виде массива байтов. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Возвращает массив беззнаковых байтов, из которого был создан этот поток. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Записывает указанный поддиапазон байтов из указанного массива байтов в поток. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Записывает указанный поддиапазон байтов из указанного массива байтов в поток. |
| [WriteByte](./writebyte/)(uint8_t) override | Записывает указанное беззнаковое 8-битное целое значение в поток. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Записывает содержимое базового буфера в указанный поток. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Null](../stream/null/) | Поток без базового хранилища. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer на текущий объект. |
## См. также

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
