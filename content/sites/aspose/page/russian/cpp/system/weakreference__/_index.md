---
title: "System::WeakReference<> класс"
linktitle: "WeakReference<>"
second_title: "Aspose.Page для C++"
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
| [get_IsAlive](./get_isalive/)() const | Получает указание, был ли удалён объект, на который ссылается текущий объект [WeakReference](../weakreference/). |
| [get_Target](./get_target/)() const | Получает объект (цель), на который ссылается текущий объект [WeakReference](../weakreference/). |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Устанавливает объект (цель), на который ссылается текущий объект [WeakReference](../weakreference/). |
| [WeakReference](./weakreference/)() | Конструктор по умолчанию. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Конструктор из nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Инициализирует новый экземпляр класса [WeakReference](../weakreference/), ссылаясь на указанный объект. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Инициализирует новый экземпляр класса [WeakReference](../weakreference/), ссылаясь на указанный объект. |
## См. также

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
