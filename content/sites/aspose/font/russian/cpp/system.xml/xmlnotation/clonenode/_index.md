---
title: "System::Xml::XmlNotation::CloneNode метод"
linktitle: "CloneNode"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlNotation::CloneNode метод. Создаёт дубликат этого узла. Узлы Notation нельзя клонировать. Вызов этого метода для объекта XmlNotation вызывает исключение в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Создаёт дубликат этого узла. Узлы Notation нельзя клонировать. Вызов этого метода для объекта [XmlNotation](../) вызывает исключение.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| deep | bool | **true** для рекурсивного клонирования поддерева под указанным узлом; **false** для клонирования только самого узла. |

### ReturnValue

Копия [XmlNode](../../xmlnode/) узла, из которого вызывается метод.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
