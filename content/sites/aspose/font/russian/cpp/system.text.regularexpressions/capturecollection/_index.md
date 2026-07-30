---
title: "System::Text::RegularExpressions::CaptureCollection class"
linktitle: "CaptureCollection"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::RegularExpressions::CaptureCollection. Список захватов, выполненных одной захватывающей группой. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 200
url: /ru/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Список захватов, выполненных одной захватывающей группой. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Отключает изменение коллекции. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Сервисный метод для добавления захвата в коллекцию. |
| [Clear](./clear/)() override | Отключает очистку коллекции. |
| [get_Count](./get_count/)() const override | Возвращает количество захватов. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Помечает коллекцию как только для чтения. |
| [get_IsSynchronized](./get_issynchronized/)() const | Помечает коллекцию как несинхронизированную. |
| [idx_get](./idx_get/)(int) const override | Аксессор [Capture](../capture/). |
| [operator[]](./operator[]/)(int) | Аксессор [Capture](../capture/). |
| [operator[]](./operator[]/)(int) const | Аксессор [Capture](../capture/). |
| [Remove](./remove/)(const CapturePtr\&) override | Отключает изменение коллекции. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Base](./base/) | Тип [Base](./base/). |
## См. также

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
