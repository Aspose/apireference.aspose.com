---
title: "Класс System::WeakReference<>"
linktitle: "WeakReference<>"
second_title: "Aspose.Font для C++"
description: "System::WeakReference<> класс. Представляет слабую ссылку, которая ссылается на объект, позволяя при этом объекту быть удалённым в C++."
type: docs
weight: 7800
url: /ru/cpp/system/weakreference__/
---
## WeakReference<> class


Представляет слабую ссылку, которая ссылается на объект, позволяя при этом объекту быть удалённым.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Получает информацию о том, был ли объект, на который ссылается текущий объект [WeakReference](../weakreference/), удалён. |
| [get_Target](./get_target/)() const | Получает объект (цель), на который ссылается текущий объект [WeakReference](../weakreference/). |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Устанавливает объект (цель), на который ссылается текущий объект [WeakReference](../weakreference/). |
| [WeakReference](./weakreference/)() | Конструктор по умолчанию. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Конструктор из nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Инициализирует новый экземпляр класса [WeakReference](../weakreference/), ссылающийся на указанный объект. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Инициализирует новый экземпляр класса [WeakReference](../weakreference/), ссылающийся на указанный объект. |
## См. также

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
