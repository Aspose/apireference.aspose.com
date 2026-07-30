---
title: "Пространство имён System::Collections"
linktitle: "System::Collections"
second_title: "Aspose.Font для C++"
description: "Как использовать пространство имён System::Collections в C++."
type: docs
weight: 2600
url: /ru/cpp/system.collections/
---



## Классы

| Класс | Описание |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/) бит, к которым можно обращаться по индексу. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента. |
| [BitArrayPtr](./bitarrayptr/) | Указатель на [BitArray](./bitarray/). Этот тип представляет собой указатель для управления удалением другого объекта. Его следует размещать в стеке и передавать в функции либо по значению, либо по константной ссылке. |
| [CollectionBase](./collectionbase/) | Предоставляет абстрактный базовый класс для строго типизированной коллекции. |
| [ICollection](./icollection/) | Определяет интерфейс необобщённой коллекции. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/) — базовый интерфейс для всех неуниверсальных (необобщённых) коллекций, которые можно перечислять. |
| [IEnumerator](./ienumerator/) | Интерфейс перечислителя, который можно использовать для обхода элементов. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | Обёртка, создающая неуниверсальную реализацию [IEnumerator](./ienumerator/) поверх обобщённого итератора [IEnumeratorImplRefType](./ienumeratorimplreftype/) — обёртка для ссылочных типов. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | Обёртка, создающая неуниверсальную реализацию [IEnumerator](./ienumerator/) поверх обобщённого итератора [IEnumeratorImplRefType](./ienumeratorimplreftype/) — обёртка для значимых типов. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/) представляет неуниверсальную коллекцию объектов, к которым можно индивидуально обращаться по индексу. |
| [IListImplRefType](./ilistimplreftype/) | Заглушка, реализующая интерфейс [System::Collections::IList](./ilist/) на объекте [System::Collections::Generic::List](../system.collections.generic/list/). Реализация для ссылочных типов. |
| [IListImplValueType](./ilistimplvaluetype/) | Заглушка, реализующая интерфейс [System::Collections::IList](./ilist/) на объекте [System::Collections::Generic::List](../system.collections.generic/list/). Реализация для значимых типов. |
| [IListWrapper](./ilistwrapper/) | Интерфейс для поддержки приведения из обобщённой в неуниверсальную коллекцию. |
| [Invalidatable](./invalidatable/) | Класс, позволяющий отслеживать состояние своих потомков через объекты [InvalidatableTracker](./invalidatabletracker/). |
| [InvalidatableTracker](./invalidatabletracker/) | Класс, реализующий трекеры объектов [Invalidatable](./invalidatable/). |
