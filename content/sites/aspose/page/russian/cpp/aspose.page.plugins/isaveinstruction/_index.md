---
title: "Aspose::Page::Plugins::ISaveInstruction class"
linktitle: "ISaveInstruction"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Plugins::ISaveInstruction class. Общий интерфейс инструкции сохранения, определяющий общие члены, которые конкретный вариант плагина должен реализовать в C++."
type: docs
weight: 1000
url: /ru/cpp/aspose.page.plugins/isaveinstruction/
---
## ISaveInstruction class


Общий интерфейс инструкции сохранения, определяющий общие члены, которые конкретная опция плагина должна реализовать.

```cpp
class ISaveInstruction : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) | Добавляет новую цель сохранения результата. |
| virtual [get_SaveTargetsCollection](./get_savetargetscollection/)() | Получает коллекцию добавленных целей (файловых или потоковых источников данных) для сохранения результатов операции. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
