---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page для C++"
description: "System::Xml::ValidationType enum. Указывает тип проверки, которую следует выполнить в C++."
type: docs
weight: 5500
url: /ru/cpp/system.xml/validationtype/
---
## ValidationType enum


Указывает тип выполняемой проверки.

```cpp
enum class ValidationType
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| None | 0 | Валидация не выполняется, и ошибки валидации не генерируются. Эта настройка создаёт парсер, совместимый с XML 1.0, без валидации. |
| Авто | 1 | Выполняет проверку, если найдено DTD или информация о схеме. |
| DTD | 2 | Проверяет в соответствии с DTD. |
| XDR | 3 | Проверка в соответствии со схемами XML-Data Reduced (XDR), включая встроенные схемы XDR. Схемы XDR распознаются с использованием префикса пространства имён **x-schema** или значения [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | Проверка в соответствии с определяющим языком XML [Schema](../../system.xml.schema/) (XSD) схем, включая встроенные XML‑схемы. XML‑схемы связываются с URI пространств имён либо с помощью атрибута **schemaLocation**, либо с предоставленными **Schemas**. |

## См. также

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
