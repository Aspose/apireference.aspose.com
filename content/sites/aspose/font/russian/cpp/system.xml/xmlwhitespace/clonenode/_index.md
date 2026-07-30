---
title: "System::Xml::XmlWhitespace::CloneNode метод"
linktitle: "CloneNode"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlWhitespace::CloneNode метод. Создаёт дубликат этого узла в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmlwhitespace/clonenode/
---
## XmlWhitespace::CloneNode method


Создаёт дубликат этого узла.

```cpp
SharedPtr<XmlNode> System::Xml::XmlWhitespace::CloneNode(bool deep) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| deep | bool | **true** — рекурсивно клонировать поддерево под указанным узлом; **false** — клонировать только сам узел. Для узлов пробельных символов клонированный узел всегда включает значение данных, независимо от настройки параметра. |

### ReturnValue

Клонированный узел.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
