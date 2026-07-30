---
title: "Метод System::Xml::XmlDeclaration::CloneNode"
linktitle: "CloneNode"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlDeclaration::CloneNode. Создаёт копию этого узла в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Создаёт дубликат этого узла.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| deep | bool | **true** для рекурсивного клонирования поддерева под указанным узлом; **false** для клонирования только самого узла. Поскольку узлы [XmlDeclaration](../) не имеют дочерних элементов, клонированный узел всегда включает значение данных, независимо от настройки параметра. |

### ReturnValue

Клонированный узел.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
