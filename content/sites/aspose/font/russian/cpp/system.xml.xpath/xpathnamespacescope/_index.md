---
title: "System::Xml::XPath::XPathNamespaceScope enum"
linktitle: "XPathNamespaceScope"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNamespaceScope enum. Определяет область видимости пространств имён в C++."
type: docs
weight: 1000
url: /ru/cpp/system.xml.xpath/xpathnamespacescope/
---
## XPathNamespaceScope enum


Определяет область действия пространства имён.

```cpp
enum class XPathNamespaceScope
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Все | 0 | Возвращает все пространства имён, определённые в области текущего узла. Это включает пространство имён **xmlns:xml**, которое всегда объявляется неявно. Порядок возвращаемых пространств имён не определён. |
| ExcludeXml | 1 | Возвращает все пространства имён, определённые в области текущего узла, за исключением пространства имён **xmlns:xml**. Пространство имён **xmlns:xml** всегда объявляется неявно. Порядок возвращаемых пространств имён не определён. |
| Local | 2 | Возвращает все пространства имён, определённые локально в текущем узле. |

## См. также

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
