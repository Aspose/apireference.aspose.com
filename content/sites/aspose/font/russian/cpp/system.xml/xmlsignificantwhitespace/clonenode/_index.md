---
title: "System::Xml::XmlSignificantWhitespace::CloneNode метод"
linktitle: "CloneNode"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlSignificantWhitespace::CloneNode метод. Создаёт дубликат этого узла в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


Создаёт дубликат этого узла.

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| deep | bool | **true** — рекурсивно клонировать поддерево под указанным узлом; **false** — клонировать только сам узел. Для узлов значимых пробельных символов клонированный узел всегда включает значение данных, независимо от настройки параметра. |

### ReturnValue

Клонированный узел.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
