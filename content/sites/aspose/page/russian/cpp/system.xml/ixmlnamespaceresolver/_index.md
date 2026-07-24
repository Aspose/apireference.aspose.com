---
title: "System::Xml::IXmlNamespaceResolver класс"
linktitle: "IXmlNamespaceResolver"
second_title: "Aspose.Page для C++"
description: "System::Xml::IXmlNamespaceResolver класс. Предоставляет только для чтения доступ к набору сопоставлений префиксов и пространств имён в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


Обеспечивает доступ только для чтения к набору сопоставлений префиксов и пространств имён.

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | Возвращает коллекцию определённых сопоставлений префикс‑пространств, которые в данный момент находятся в области видимости. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Возвращает URI пространства имён, сопоставленный с указанным префиксом. |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | Возвращает префикс, сопоставленный с указанным URI пространства имён. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
