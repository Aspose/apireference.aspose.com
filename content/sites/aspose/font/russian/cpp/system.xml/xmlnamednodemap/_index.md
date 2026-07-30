---
title: "System::Xml::XmlNamedNodeMap класс"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlNamedNodeMap класс. Представляет коллекцию узлов, к которым можно получить доступ по имени или индексу в C++."
type: docs
weight: 2200
url: /ru/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Представляет коллекцию узлов, к которой можно обращаться по имени или индексу.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Методы

| Метод | Описание |
| --- | --- |
| [begin](./begin/)() const | Получает итератор к первому элементу коллекции. |
| [cbegin](./cbegin/)() const | Получает итератор к первому элементу коллекции. |
| [cend](./cend/)() const | Получает итератор для несуществующего элемента за последним элементом коллекции. |
| [end](./end/)() const | Получает итератор для несуществующего элемента за последним элементом коллекции. |
| virtual [get_Count](./get_count/)() | Возвращает количество узлов в [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Обеспечивает поддержку итерации по коллекции узлов в [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Получает [XmlNode](../xmlnode/), указанный по имени. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Получает узел с совпадающими значениями [XmlNode::get_LocalName](../xmlnode/get_localname/) и [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [Item](./item/)(int32_t) | Получает узел по указанному индексу в [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Удаляет узел из [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Удаляет узел с совпадающими значениями [XmlNode::get_LocalName](../xmlnode/get_localname/) и [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Добавляет [XmlNode](../xmlnode/), используя его значение [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [iterator](./iterator/) | Тип итератора. |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
