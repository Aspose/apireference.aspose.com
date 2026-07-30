---
title: "Класс System::Collections::Generic::LinkedList"
linktitle: "LinkedList"
second_title: "Aspose.Font для C++"
description: "Класс System::Collections::Generic::LinkedList. Объявление LinkedList в C++."
type: docs
weight: 3100
url: /ru/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Параметр | Описание |
| --- | --- |
| T | Содержит тип значения. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const T\&) override | Добавляет **element** в конец списка. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Добавляет **element** после **node** в списке. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Добавляет **newNode** после **node** в списке. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Добавляет **element** перед **node** в списке. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Добавляет **newNode** перед **node** в списке. |
| [AddFirst](./addfirst/)(const T\&) | Добавляет **element** в начало списка. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Добавляет **newNode** в начало списка. |
| [AddLast](./addlast/)(const T\&) | Добавляет **element** в конец списка. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Добавляет **newNode** в конец списка. |
| [begin](./begin/)() | Получает итератор к первому элементу коллекции. |
| [begin](./begin/)() const | Получает итератор к первому элементу константно-квалифицированной коллекции. |
| [cbegin](./cbegin/)() const | Получает итератор к первому константно-квалифицированному элементу коллекции. |
| [cend](./cend/)() const | Получает итератор для несуществующего константно-квалифицированного элемента за пределами коллекции. |
| [Clear](./clear/)() override | Удаляет все элементы в списке. |
| [Contains](./contains/)(const T\&) const override | Проверяет, присутствует ли **element** в списке. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Копирует данные контейнера в существующие элементы массива. |
| [crbegin](./crbegin/)() const | Получает обратный итератор к последнему элементу коллекции с const‑квалификатором (первый в обратном порядке). |
| [crend](./crend/)() const | Получает обратный итератор для несуществующего элемента с const‑квалификатором перед началом коллекции. |
| [end](./end/)() | Получает итератор для несуществующего элемента за пределами коллекции. |
| [end](./end/)() const | Получает итератор для несуществующего элемента за пределами константно-квалифицированной коллекции. |
| [Find](./find/)(const T\&) const | Выполняет поиск **element** в прямом направлении в списке. |
| [FindLast](./findlast/)(const T\&) const | Выполняет поиск **element** в обратном направлении в списке. |
| [get_Count](./get_count/)() const override | Получает количество элементов в списке. |
| [get_First](./get_first/)() const | Получает указатель на первый элемент в списке. |
| [get_Last](./get_last/)() const | Получает указатель на последний элемент в списке. |
| [GetEnumerator](./getenumerator/)() override | Получает перечислитель для перебора текущего [LinkedList](./). |
| [LinkedList](./linkedlist/)() | Создаёт пустой [LinkedList](./). |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Конструктор копирования. |
| [rbegin](./rbegin/)() | Получает обратный итератор к последнему элементу коллекции (первый в обратном порядке). |
| [rbegin](./rbegin/)() const | Получает обратный итератор к последнему элементу const‑квалифицированной коллекции (первый в обратном порядке). |
| [Remove](./remove/)(const T\&) override | Удаляет первое вхождение указанного **element** из списка. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Удаляет узел из списка. |
| [RemoveFirst](./removefirst/)() | Удаляет первый узел из списка. |
| [RemoveLast](./removelast/)() | Удаляет последний узел из списка. |
| [rend](./rend/)() | Получает обратный итератор для несуществующего элемента перед началом коллекции. |
| [rend](./rend/)() const | Получает обратный итератор для несуществующего элемента перед началом const‑квалифицированной коллекции. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Получает реализацию константного итератора begin для текущего контейнера. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Получает реализацию итератора begin для текущего контейнера. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Получает реализацию константного итератора end для текущего контейнера. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Получает реализацию итератора end для текущего контейнера. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [const_iterator](./const_iterator/) | Тип константного итератора. |
| [const_reverse_iterator](./const_reverse_iterator/) | Тип константного обратного итератора. |
| [iterator](./iterator/) | Тип итератора. |
| [list_t](./list_t/) | Базовый тип данных. |
| [reverse_iterator](./reverse_iterator/) | Тип обратного итератора. |
## Примечания


Контейнер связного списка. Реализует оболочку над std::list. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Создайте экземпляр класса LinkedList.
  auto list = MakeObject<LinkedList<int>>();

  // Заполните связный список.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Выведите элементы связного списка.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## См. также

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
