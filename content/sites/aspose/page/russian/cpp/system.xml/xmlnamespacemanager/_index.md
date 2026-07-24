---
title: "System::Xml::XmlNamespaceManager класс"
linktitle: "XmlNamespaceManager"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNamespaceManager класс. Разрешает, добавляет и удаляет пространства имён в коллекцию и обеспечивает управление областями видимости этих пространств имён в C++."
type: docs
weight: 2300
url: /ru/cpp/system.xml/xmlnamespacemanager/
---
## XmlNamespaceManager class


Разрешает, добавляет и удаляет пространства имён в коллекции и обеспечивает управление их областью видимости.

```cpp
class XmlNamespaceManager : public System::Xml::IXmlNamespaceResolver,
                            public System::Collections::Generic::IEnumerable<String>
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [AddNamespace](./addnamespace/)(String, String) | Добавляет указанное пространство имён в коллекцию. |
| virtual [get_DefaultNamespace](./get_defaultnamespace/)() | Возвращает URI пространства имён для пространства имён по умолчанию. |
| virtual [get_NameTable](./get_nametable/)() | Возвращает [XmlNameTable](../xmlnametable/), связанный с этим объектом. |
| [GetEnumerator](./getenumerator/)() override | Возвращает перечислитель, который можно использовать для перебора пространств имён в [XmlNamespaceManager](./). |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Возвращает коллекцию имён пространств имён, ключевых по префиксу, которую можно использовать для перечисления текущих пространств имён в области видимости. |
| virtual [HasNamespace](./hasnamespace/)(String) | Возвращает значение, указывающее, определено ли пространство имён для предоставленного префикса в текущей добавленной области. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Возвращает URI пространства имён для указанного префикса. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Находит префикс, объявленный для указанного URI пространства имён. |
| virtual [PopScope](./popscope/)() | Снимает область видимости пространства имён со стека. |
| virtual [PushScope](./pushscope/)() | Помещает область видимости пространства имён в стек. |
| virtual [RemoveNamespace](./removenamespace/)(String, String) | Удаляет указанное пространство имён для указанного префикса. |
| [XmlNamespaceManager](./xmlnamespacemanager/)(const SharedPtr\<XmlNameTable\>\&) | Инициализирует новый экземпляр класса [XmlNamespaceManager](./) с указанным [XmlNameTable](../xmlnametable/). |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
