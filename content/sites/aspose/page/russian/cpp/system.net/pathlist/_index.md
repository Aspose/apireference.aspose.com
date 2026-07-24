---
title: "System::Net::PathList class"
linktitle: "PathList"
second_title: "Aspose.Page для C++"
description: "System::Net::PathList class. Представляет список экземпляров класса CookieCollection. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 3000
url: /ru/cpp/system.net/pathlist/
---
## PathList class


Представляет список экземпляров класса [CookieCollection](../cookiecollection/) class. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class PathList : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| static [Create](./create/)() | Создаёт новый экземпляр. |
| [get_Count](./get_count/)() const | Возвращает количество элементов. |
| [get_SyncRoot](./get_syncroot/)() const | Возвращает объект, через который происходит синхронизация коллекции. |
| [GetCookiesCount](./getcookiescount/)() | Возвращает количество файлов cookie всех элементов коллекции. |
| [GetEnumerator](./getenumerator/)() | Возвращает перечислитель для текущей коллекции. |
| [idx_get](./idx_get/)(String) | Получает коллекцию cookie по указанному пути. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Устанавливает коллекцию cookie по указанному пути. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
