---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Font для C++"
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
| Нет | 0 | Проверка не выполняется, и ошибки проверки не генерируются. Эта настройка создает парсер, совместимый с XML 1.0, без проверки. |
| Auto | 1 | Проверяет наличие DTD или информации о схеме. |
| DTD | 2 | Проверяет в соответствии с DTD. |
| XDR | 3 | Проверяет в соответствии со схемами XML-Data Reduced (XDR), включая встроенные XDR-схемы. XDR-схемы распознаются с использованием префикса пространства имён **x-schema** или значения [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | Проверяет в соответствии со схемами языка определения XML [Schema](../../system.xml.schema/) (XSD), включая встроенные XML-схемы. XML-схемы связываются с URI пространств имён либо с использованием атрибута **schemaLocation**, либо предоставленных **Schemas**. |

## См. также

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
